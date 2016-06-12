package com.code.library.share.utils;

/**
 * Created by yue on 15/11/14.
 * 分享封装
 */
public class ShareUtils {

    public interface Share {
        int GONE = 0;
        int WECHAT = 1;
        int WECHATP = 2;
        int QQ = 3;
        int QZONE = 4;
        int WEIBO = 5;
    }

    // TODO: 2016/6/12 封装分享dialog
/*
    //设置页中的分享Funny
    public static void shareApp(final Activity activity, final ShareListener shareListener) {
        new BottomShareDialog.Builder(activity)
                .setOnItemClickListener(new BottomShareDialog.OnItemClickListener() {
                    @Override
                    public void onClick(Dialog dialog, int which) {
                        shareAppSwitch(which, activity, shareListener);
                    }
                }).show();
    }

    public static void shareSticker(final Activity activity, final ShareListener shareListener) {
        new StickerShareDialog.Builder(activity)
                .setOnItemClickListener(new StickerShareDialog.OnItemClickListener() {
                    @Override
                    public void onClick(Dialog dialog, int which) {
                        shareAppSwitch(which, activity, shareListener);
                    }
                }).show();
    }

    private static void shareAppSwitch(int which, Activity activity, ShareListener shareListener) {
        switch (which) {
            case BottomShareDialog.Share.WECHAT:
                FunnyShare.getInstance().shareApp(activity, FunnyShare.Platform.WECHAT, shareListener);
                break;
            case BottomShareDialog.Share.WECHATP:
                FunnyShare.getInstance().shareApp(activity, FunnyShare.Platform.WECHAT_FRIENDS, shareListener);
                break;
            case BottomShareDialog.Share.QQ:
                FunnyShare.getInstance().shareApp(activity, FunnyShare.Platform.QQ, shareListener);
                break;
            case BottomShareDialog.Share.QZONE:
                FunnyShare.getInstance().shareApp(activity, FunnyShare.Platform.QZONE, shareListener);
                break;
            case BottomShareDialog.Share.WEIBO:
                FunnyShare.getInstance().shareApp(activity, FunnyShare.Platform.WEIBO, shareListener);
                break;

            case BottomShareDialog.Share.FACEBOOK:
                FunnyShare.getInstance().shareApp(activity, FunnyShare.Platform.FACEBOOK, shareListener);
                break;
        }
    }


    public static void showShareDialog(final Activity activity, final ShareParam shareParam, final ShareListener shareListener) {
        new BottomShareDialog.Builder(activity)
                .setOnItemClickListener(new BottomShareDialog.OnItemClickListener() {
                    @Override
                    public void onClick(Dialog dialog, int which) {
                        shareImageSwitch(which, activity, shareParam, shareListener);
                    }
                }).show();
    }

    public static void shareImageSwitch(int which, Activity activity, final ShareParam shareParam, ShareListener shareListener) {
        switch (which) {
            case BottomShareDialog.Share.WECHAT:
                FunnyShare.getInstance().share(activity, FunnyShare.Platform.WECHAT, shareParam, shareListener);
                break;
            case BottomShareDialog.Share.WECHATP:
                FunnyShare.getInstance().share(activity, FunnyShare.Platform.WECHAT_FRIENDS, shareParam, shareListener);
                break;
            case BottomShareDialog.Share.QQ:
                FunnyShare.getInstance().share(activity, FunnyShare.Platform.QQ, shareParam, shareListener);
                break;
            case BottomShareDialog.Share.QZONE:
                FunnyShare.getInstance().share(activity, FunnyShare.Platform.QZONE, shareParam, shareListener);
                break;
            case BottomShareDialog.Share.WEIBO:
                FunnyShare.getInstance().share(activity, FunnyShare.Platform.WEIBO, shareParam, shareListener);
                break;
        }
    }

    public static void showShareSuccessMessage(Context context, MessageView messageView) {
        messageView.showMessage(context.getString(R.string.share_success));
    }

    public static void showShareErrorMessage(Context context, MessageView messageView) {
        messageView.showMessage(context.getString(R.string.share_failure), true);
    }*/
}
