package com.code.library;

import android.graphics.Bitmap.Config;

/**
 * 项目全局配置文件
 */
public class AppConfig {
    /**
     * 调试部分
     */
    //DEBUG模式开关
    public static final boolean DEBUG = true;
    //DEBUG TAG
    public static final String TAG = "DEBUG TAG";
    //数据库名
    public static final String DB_NAME = "DB_NAME";
    //数据库版本
    public static final int DB_VERSION = 3;
    //更新数据地址
    public static final String UPDATE_URL = "http://funnycamera.b0.upaiyun.com/Cutie/CutieAndroidUpdate.json";
    //加密KEY
    public static final String PASS_KEY = "NNffH)GTdbFR9boPPWwDh}M3wzqFcG>W";
    //接口版本
    public static final String INTERFACE_VERSION = "v1.0";
    /**
     * OkHttp
     */
    //连接超时的时间
    public static final int ConnectTimeout = 5;
    //写入超时的时间
    public static final int WriteTimeout = 10;
    //读取超时的时间
    public static final int ReadTimeout = 10;
    //验证码重发时间
    public static final int ResendTime = 60;
    //okHttp Tag
    public static final String OkHttpTag = "default";
    /**
     * 缓存路径
     */
    //应用默认文件夹名
    public static final String APP_PATH_NAME = "APP_PATH_NAME";
    //应用默认缓存文件夹名
    public static final String CACHE_PATH_NAME = "cache";
    //应用默认临时文件文件夹名
    public static final String TEMP_PATH_NAME = "temp";
    //推荐 APK 文件夹
    public static final String APK_PATH_NAME = "apk";
    //应用默认图片保存文件夹名
    public static final String PICTURE_PATH_NAME = "PICTURE_PATH_NAME";
    //GIF缓存文件夹名
    public static final String GIF_PATH_NAME = "GIF_PATH_NAME";
    //初始化滤镜文件夹
    public static final String FILTER_PATH_NAME = "filter";
    //情景目录
    public static final String SCENE_PATH_NAME = "scene";
    //ImageLoader缓存文件夹
    public static final String ImageLoaderCache = "imageloader";
    //保存的图片格式
    public static final String pic_format_png = ".png";
    public static final String pic_format_jpeg = ".jpeg";
    public static final String fileApkSuffix = ".apk";
    //ImageLoader本地缓存大小
    public static final int ImageLoaderCacheSzie = 50 * 1024 * 1024;
    //Fresoc本地缓存大小
    public static final int FresocCacheSzie = 50 * 1024 * 1024;
    /**
     * 图片压缩设置
     */
    //压缩图片的默认质量
    public static final int ImageQuality = 90;
    //图片色彩设置
    public static final Config BitmapConfig = Config.ARGB_8888;
}
