package com.code.library.http;

import android.content.Context;
import android.os.Message;

import com.code.library.AppConstant;
import com.code.library.MyApplication;
import com.code.library.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by yue on 16/1/12.
 */
public class DownloadHelper {

    private static DownloadHelper instance;
    private OkHttpClient okHttpClient;
    private Context context;


    private DownloadHelper() {
        context = MyApplication.getInstance().getContext();
        okHttpClient = OkHttpUtils.getInstance().getOkHttpClient();
    }

    public static DownloadHelper getInstance() {
        if (instance == null) {
            synchronized (DownloadHelper.class) {
                if (instance == null) {
                    instance = new DownloadHelper();
                }
            }
        }
        return instance;
    }

    public interface OnDownloadListener {
        void onSuccess(String path);

        void onError(String message);

        void onProgress(float progress);
    }

    /**
     * 下载文件
     *
     * @param url
     * @param savePath
     * @param onDownloadListener
     */
    public void download(final String url, final String savePath, final OnDownloadListener onDownloadListener) {
        Request request = new Request.Builder()
                .url(url)
                .build();
        final Call call = okHttpClient.newCall(request);

        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                onDownloadListener.onError(context.getString(R.string.download_failed));
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                InputStream inputStream = null;
                FileOutputStream fileOutputStream = null;
                byte[] buffer = new byte[1024];
                int length;
                long nowLength = 0;//现在已经下载的长度
                long totalLength;//文件的总长度
                try {
                    totalLength = response.body().contentLength();
                    inputStream = response.body().byteStream();
                    File file = new File(savePath);
                    fileOutputStream = new FileOutputStream(file);
                    while ((length = inputStream.read(buffer)) != -1) {
                        fileOutputStream.write(buffer, 0, length);
                        nowLength += length;
                        final long finalTotalLength = totalLength;
                        final long finalNowLength = nowLength;
                        onDownloadListener.onProgress(finalNowLength * 1.0f / finalTotalLength);
                    }
                    fileOutputStream.flush();
                    onDownloadListener.onSuccess(savePath);
                } catch (Exception e) {
                    onDownloadListener.onError(context.getString(R.string.download_failed));
                } finally {
                    try {
                        if (inputStream != null) inputStream.close();
                    } catch (IOException e) {
                    }
                    try {
                        if (fileOutputStream != null) fileOutputStream.close();
                    } catch (IOException e) {
                    }
                }
            }
        });
    }
}
