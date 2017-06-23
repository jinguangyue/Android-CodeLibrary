package com.code.library.utils;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import java.util.ArrayList;

/**
 * Created by yue on 2017/4/20.
 */

public class ShareUtils {

    public static void shareText(Activity activity, String content) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, content);
        intent.setType("text/plain");
        activity.startActivity(intent);
    }

    public static void shareText(Activity activity,String title, String content) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TITLE, title);
        intent.putExtra(Intent.EXTRA_TEXT, content);
        intent.setType("text/plain");
        activity.startActivity(intent);
    }

    public static void shareImage(Activity activity) {
        Uri uri = Uri.parse("content://notes/data/media/20");
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_STREAM, uri);
        intent.setType("image/*");
        activity.startActivity(intent);
    }

    public static void shareMultiImage(Activity activity) {
        ArrayList<Uri> uris = new ArrayList<>();
        uris.add(Uri.parse("content://notes/data/media/20"));
        uris.add(Uri.parse("content://notes/data/media/21"));
        uris.add(Uri.parse("content://notes/data/media/22"));
        uris.add(Uri.parse("content://notes/data/media/23"));
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND_MULTIPLE);
        intent.putExtra(Intent.EXTRA_STREAM, uris);
        intent.setType("image/*");
        activity.startActivity(intent);
    }
}
