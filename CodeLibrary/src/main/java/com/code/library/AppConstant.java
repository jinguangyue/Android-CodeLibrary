package com.code.library;

/**
 * Created by yue on 2016/6/12.
 */
public class AppConstant {

   /* private static final String BASE_URL = AppConfig.HOST + AppConfig.INTERFACE_VERSION;

    //    private static final String BASE_URL_CUTIE = "http://192.168.3.20:8000/" + AppConfig.INTERFACE_VERSION;
    private static final String BASE_URL_CUTIE = "http://api.test.cutie.afunnyapp.com/" + AppConfig.INTERFACE_VERSION;

    public interface MEDIATYPE {
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    }
*/
    public interface URL {

    }

    public interface KEY {
        String WIDTH = "WIDTH";
        String HEIGHT = "HEIGHT";
        String IMAGE_PATH = "IMAGE_PATH";
        String TITLE_TEXT = "TITLE_TEXT";
        String UID = "UID";
        String TOKEN = "TOKEN";
        String ISLOGIN = "ISLOGIN";
        String SHOWMESSAGE = "SHOWMESSAGE";
        String CHANNEL_ID = "CHANNEL_ID";
        String CHANNEL_NAME = "CHANNEL_NAME";
        String MESSAGE = "MESSAGE";//用于传递消息
        String URL = "URL";
        String DATA = "DATA";
        String STICKEREMOJI = "STICKEREMOJI";
        String MAKEWALLPAPER = "MAKEWALLPAPER";
        String PORTRAITORTRANSVERSE = "PORTRAITORTRANSVERSE";
        String PUSH_TYPE = "PUSH_TYPE";
        String PUSH_DATA = "PUSH_DATA";
        String STICKERS_ID = "STICKERS_ID";
        String STICKERS_JSON_NAME = "stickers.json";
        String IS_STICKERS_UPDATE = "IS_STICKERS_UPDATE";
        String RATING_UNLOCK = "RATING_UNLOCK";
        String STICKER_PREFIX = "STICKER_PREFIX";
        String STICKERDETAILBEAN = "STICKERDETAILBEAN";
        String GIF_PATHS = "GIF_PATHS";
        String IS_CAM_PIC_LINEAR_GONE = "IS_CAM_PIC_LINEAR_GONE";
        String SCENCE_UPDATETIME = "SCENCE_UPDATETIME";
        String SCENCE_DOWNLOADED_POSITION = "SCENCE_DOWNLOADED_POSITION";
        String SCENCE_DOWNLOADED_PATH = "SCENCE_DOWNLOADED_PATH";
        String ANIM = "ANIM";
        String SCENCE_IMAGE_PATH = "SCENCE_IMAGE_PATH";
        String SCENCE_ID = "SCENCE_ID";
        String SCENCE_SMALL_PATHS = "SCENCE_SMALL_PATHS";
        String SCENCE_IDS = "SCENCE_IDS";
        String SCENCE_PATHS = "SCENCE_PATHS";
        String IS_HOME_TO_CAMERA = "IS_HOME_TO_CAMERA";
        String IS_HOME = "IS_HOME";
        String SQUARE = "SQUARE";
        String SCENCE_SIZE = "SCENCE_SIZE";
        String ISPUZZLEMAIN = "ISPUZZLEMAIN";
        String IS_ALUM = "IS_ALUM";
        String IS_PIC_ADD_STICKER = "IS_PIC_ADD_STICKER";
        String IS_NOBG = "IS_NOBG";
        String PIC_BG_ID = "PIC_BG_ID";
        String MOODCHIPDATA = "MOODCHIPDATA";
        String IS_HOME_FILTER = "IS_HOME_FILTER";
        String DOWNLOADAPKURL = "DOWNLOADAPKURL";
        String DOWNLOADAPKNAME = "DOWNLOADAPKNAME";
        String STICKER_LOCATION = "STICKER_LOCATION";
        String DATASTICKERGIF = "DATASTICKERGIF";
        String ISRECOMMAND = "ISRECOMMAND";
        String DATARECOMMAND = "DATARECOMMAND";
        String TYPE_GIF = "TYPE_GIF";
        String SMAILLGIFPATH = "SMAILLGIFPATH";
        String CLASSNAME = "CLASSNAME";
        String WATERMARK = "WATERMARK";
        String IS_PHOTO_WALLPAPER = "IS_PHOTO_WALLPAPER";
        String VIDEO_PATH = "VIDEO_PATH";
        String AVATAR_PATH = "AVATAR_PATH";
        String NICKNAME = "NICKNAME";
        String EMAIL = "EMAIL";
        String ISALUM = "ISALUM";
    }


    //WHAT 0-10 预留值
    public interface WHAT {
        int SUCCESS = 0;
        int FAILURE = 1;
        int ERROR = 2;
        int ERROR_EXIT = 3;
        int EXIST = 4;
        int CODE_ERROR = 5;
        int NEXT_STEP = 6;
        int SERVER_ERROR = 7;
        int SERVER_ERROR_EXIT = 8;
        int UPLOAD = 9;
        int AUTHORIZE = 10;
        int PLAY = 11;
        int CLICK = 12;
        int STOP = 13;
        int UPPER_LIMIT = 14;
        int REPEAT = 15;
    }


    public interface REQUEST_CODE {
        int CAMERA = 1;
        int ALBUM = 2;
        int CROPPER = 3;
        int UPDATE = 4;
        int POST = 5;
        int CHANNEL = 6;
        int REPORT = 7;
        int AT = 8;
        int BINDING = 9;
        int PICEDIT = 10;
        int STICKER = 11;
        int STICKER_DETAIL = 12;
        int ONLINE_BACKGROUND = 13;
        int SCEMCE_ALBUM = 14;
        int SCEMCE_ALBUM_EDIT = 15;
        int AT2 = 16;
        int SPRAYGUN = 17;
        int BACKGROUND = 18;
        int LOGIN = 19;
        int PUZZLE = 20;
        int BGCHANGE = 21;
        int MOSAIC = 22;
        int GIFSTICKER = 22;
        int VIDEO = 23;
    }

    public interface RESULT_CODE {
        int RESULT_OK = -1;
        int RESULT_CANCELED = 0;
        int RESULT_ERROR = 1;
    }

    public interface ACTION {

    }

}
