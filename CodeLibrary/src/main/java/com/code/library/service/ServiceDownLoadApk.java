package com.code.library.service;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;

import com.code.library.AppConfig;
import com.code.library.AppConstant;
import com.code.library.MyApplication;
import com.code.library.R;
import com.code.library.http.DownloadHelper;
import com.code.library.toast.ToastFactory;
import com.code.library.utils.AppUtil;

import java.io.File;

/**
 * Created by yue on 2015/12/10.
 * Stickers DownLoad Service
 */
public class ServiceDownLoadApk extends Service {

    private NotificationCompat.Builder builder;
    private NotificationManager notificationManager;

    @Override
    public void onCreate() {
        super.onCreate();
        notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    /**
     * 设置下载进度
     */
    public void setNotify(int progress, String tag) {
        builder.setProgress(100, progress, false);
        builder.setContentText(progress + "/100");
        notificationManager.notify(tag, tag.hashCode(), builder.getNotification());
    }

    private void initNotify(String tag) {
        builder = new NotificationCompat.Builder(this);
        builder.setAutoCancel(false);
        builder.setTicker(this.getString(R.string.Download_loading));
        builder.setContentTitle(getResources().getString(R.string.Download_loading));

        builder.setContentText("0/100");
        builder.setWhen(System.currentTimeMillis());
        builder.setSmallIcon(R);
        builder.setProgress(100, 0, false);
        // builder.setOngoing(true);
        notificationManager.notify(tag, tag.hashCode(), builder.getNotification());
    }


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // TODO: 2016/6/20 保证service不被杀死  断点续传 下载
        try {
            final String url = intent.getStringExtra(AppConstant.KEY.DOWNLOADAPKURL);
            final String name = intent.getStringExtra(AppConstant.KEY.DOWNLOADAPKNAME);
            final long[] time = {0};
            initNotify(url);
            String path = MyApplication.getInstance().getApkPath() + File.separator + name + AppConfig.fileApkSuffix;

            DownloadHelper.getInstance().download(url, path, new DownloadHelper.OnDownloadListener() {
                @Override
                public void onSuccess(String path) {
                    notificationManager.cancel(url, url.hashCode());
                    startActivity(AppUtil.getApkFileIntent(path));
                    stopSelf();
                }

                @Override
                public void onError(String message) {
                    ToastFactory.showToast(ServiceDownLoadApk.this, message);
                    notificationManager.cancel(url, url.hashCode());
                    stopSelf();
                }

                @Override
                public void onProgress(float progress) {
                    if (System.currentTimeMillis() - time[0] > 1000) {
                        setNotify((int) (progress * 100), url);
                        time[0] = System.currentTimeMillis();
                    }
                }
            });
        } catch (Exception e) {
            notificationManager.cancelAll();
            stopSelf();
        }

        return super.onStartCommand(intent, flags, startId);
    }

}
