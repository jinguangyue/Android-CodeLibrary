package com.code.library.DB;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.code.library.AppConfig;

/**
 * Created by yue on 2015/9/10.
 */
public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(Context context) {
        super(context, AppConfig.DB_NAME, null, AppConfig.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try{
            //版本更替
            if(oldVersion == 2 && newVersion == 3){
            }
        }catch(Exception e){
            //// 删除这俩个表

            //重建这俩个表

        }
    }
}