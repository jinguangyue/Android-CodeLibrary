package com.code.library.thread;

import android.content.Context;

/**
 * Created by yue on 15/11/5.
 * 用于清理临时文件
 */
public class ClearTempThread extends Thread {

    private Context context;

    public ClearTempThread(Context context) {
        this.context = context;
    }

    @Override
    public void run() {
        super.run();
        /*File temp_dir = new File(MyApplication.getInstance().getTempPath());
        File[] files = temp_dir.listFiles();
        if (files==null)
            return;
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.exists()) {
                file.delete();
            }
        }
        BitmapUtils.updateResources(context, MyApplication.getInstance().getAppPath());
        LogUtils.i("临时文件夹清理完成!");*/
    }
}
