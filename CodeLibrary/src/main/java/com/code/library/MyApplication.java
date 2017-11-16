package com.code.library;

import android.app.Application;
import android.content.Context;

import com.code.library.share.APPShare;
import com.code.library.share.utils.DirectoryUtils;
import com.code.library.thread.ClearTempThread;
import com.code.library.update.AppUpdate;
import com.code.library.utils.DeviceInfoUtils;
import com.code.library.utils.LogUtils;

import java.io.File;

/**
 * Created by yue on 15/10/30.
 */

// TODO: 2016/6/12 开发时要将 MyApplication放到项目中
public class MyApplication extends Application {

    //Application单例
    private static MyApplication instance;
    //Context
    private Context context;
    //屏幕尺寸
    private int screenWidth;
    private int screenHeight;
    //应用的最高申请内存
    private long maxMemory;
    //默认存储目录
    private String BASE_PATH;
    //APP默认路径
    private String APP_PATH;
    //缓存路径
    private String CACHE_PATH;
    //临时文件目录
    private String TEMP_PATH;
    //图片保存目录
    private String PICTURE_PATH;
    //UID
    private int uid = 0;
    //token
    private String token;
    //TitleBar高度
    private static int titleBarHeight = 0;
    private String GIF_PATH;
    private String APK_PATH;
    private String FILTER_PATH;
    private String SCENE_PATH;
    private int textHeight;
    private int textWidth;

    public static MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        context = this.getApplicationContext();
        LogUtils.init(this, AppConfig.TAG, AppConfig.DEBUG);//初始化LOG
        screenWidth = DeviceInfoUtils.getScreenWidth(this);//获取屏幕宽度
        screenHeight = DeviceInfoUtils.getScreenHeight(this);//获取屏幕高度
        initDir();//初始化默认路径
        initMemorySize();//打印APP最大可以申请的内存
        APPShare.getInstance().init(this);//初始化shareSDK
        AppUpdate.getInstance().init(this,AppConfig.UPDATE_URL,false);//初始化更新
        new ClearTempThread(this).start();//清理临时文件夹
    }

    public String getFILTER_PATH() {
        return FILTER_PATH;
    }

    private void initDir() {
        //初始化应用存储路径
        BASE_PATH = DirectoryUtils.getDefaultStoragePath(this);
        APP_PATH = BASE_PATH + File.separator + AppConfig.APP_PATH_NAME;
        LogUtils.i("应用存储根目录:" + APP_PATH);
        CACHE_PATH = MyApplication.getInstance().getExternalFilesDir(null) + File.separator + AppConfig.CACHE_PATH_NAME;
        LogUtils.i("缓存目录:" + CACHE_PATH);
        TEMP_PATH = APP_PATH + File.separator + AppConfig.TEMP_PATH_NAME;
        PICTURE_PATH = APP_PATH + File.separator + AppConfig.PICTURE_PATH_NAME;
        GIF_PATH = APP_PATH + File.separator + AppConfig.GIF_PATH_NAME;
        APK_PATH = APP_PATH + File.separator + AppConfig.APK_PATH_NAME;
        FILTER_PATH = MyApplication.getInstance().getFilesDir() + File.separator + AppConfig.FILTER_PATH_NAME;
        SCENE_PATH = MyApplication.getInstance().getFilesDir() + File.separator + AppConfig.SCENE_PATH_NAME;
        //判断是否存在,如不存在则创建目录
        File dir = new File(CACHE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(TEMP_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(PICTURE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(GIF_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(APK_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(FILTER_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        dir = new File(SCENE_PATH);
        if (!dir.exists()) {
            dir.mkdirs();
        }
    }

    //用于打印APP最多可申请的内存
    private void initMemorySize() {
        maxMemory = Runtime.getRuntime().maxMemory();
        LogUtils.i("最大申请内存:" + Long.toString(maxMemory / (1024 * 1024)) + "MB");
    }

    //根据后缀自动生成临时文件
    public String getTempFileNameForExtension(String extension) {
        return getTempPath() + File.separator + System.currentTimeMillis() + extension;
    }

    public String getTempFileName() {
        return getTempPath() + File.separator + System.currentTimeMillis();
    }

    //退出登录时需清除UID和TOKEN
    public void exit() {
        uid = 0;
        token = "";
    }

    public Context getContext() {
        return context;
    }

    public int getScreenWidth() {
        return screenWidth;
    }

    public int getScreenHeight() {
        return screenHeight;
    }

    public long getMaxMemory() {
        return maxMemory;
    }

    public String getBasePath() {
        return BASE_PATH;
    }

    public String getAppPath() {
        return APP_PATH;
    }

    public String getCachePath() {
        return CACHE_PATH;
    }

    public String getTempPath() {
        return TEMP_PATH;
    }

    public String getPicturePath() {
        return PICTURE_PATH;
    }

    public String getGifPath() {
        return GIF_PATH;
    }

    public String getApkPath() {
        return APK_PATH;
    }

    public int getTitleBarHeight() {
        return titleBarHeight;
    }

    public void setTitleBarHeight(int titleBarHeight) {
        this.titleBarHeight = titleBarHeight;
    }

    public String getSCENE_PATH() {
        return SCENE_PATH;
    }

    public void setTextHeight(int textHeight) {
        this.textHeight = textHeight;
    }

    public void setTextWidth(int textWidth) {
        this.textWidth = textWidth;
    }

    public int getTextWidth() {
        return textWidth;
    }
}
