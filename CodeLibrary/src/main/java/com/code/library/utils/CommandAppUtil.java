package com.code.library.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.code.library.AppConstant;
import com.code.library.R;
import com.code.library.toast.ToastFactory;

/**
 * Created by yue on 2016/5/22.
 * 应用打开方式 1 应用市场 2 打开url 3 打开内部webview 4 直接下载
 */
public class CommandAppUtil {

    /**
     * 跳转应用商店
     *
     * @param context
     * @param packageName
     */
    public static void command(Context context, String packageName) {
        try {
            Uri uri = Uri.parse("market://details?id=" + packageName);
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        } catch (Exception e) {
//            ToastFactory.showToast(context, context.getString(R.string.no_application_market));
        }
    }

    /**
     * 打开url
     *
     * @param context
     * @param url
     */
    public static void openUrl(Context context, String url) {
        Uri uri = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
/*
        PackageManager pm = context.getPackageManager();
        List<PackageInfo> list = pm
                .getInstalledPackages(PackageManager.PERMISSION_GRANTED);
        for (PackageInfo p : list) {
            LogUtils.i(p.packageName.toString());
        }*/

        if(AppUtil.isInstalled(context, "com.android.browser")){
            intent.setClassName("com.android.browser", "com.android.browser.BrowserActivity");
        }

        context.startActivity(intent);
    }

    public static void openWebView(Activity activity, String link) {
        /*Intent intent = new Intent(activity, CopyrightWebActivity.class);
        intent.putExtra("copyrightLink", link);
        activity.startActivity(intent);*/
    }

    /**
     * 系统方式分享图片
     */
    public static void sharePhotoMore(Activity activity, String img_path) {
        Intent sendIntent = new Intent();
        sendIntent.setAction(Intent.ACTION_SEND);
        sendIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse(img_path));
        sendIntent.setType("image*//*");
        activity.startActivity(sendIntent);
    }

    /**
     * 直接下载url
     *
     * @param activity
     * @param url
     */
    public static void downUrl(Activity activity, String url, String name) {
        ToastFactory.showToast(activity, activity.getResources().getString(R.string.download_loading_wait));
        Intent intent = new Intent(activity, ServiceDownLoadApk.class);
        intent.putExtra(AppConstant.KEY.DOWNLOADAPKURL, url);
        intent.putExtra(AppConstant.KEY.DOWNLOADAPKNAME, name);
        activity.startService(intent);
    }
}













