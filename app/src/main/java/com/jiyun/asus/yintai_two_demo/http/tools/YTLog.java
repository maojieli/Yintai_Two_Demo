package com.jiyun.asus.yintai_two_demo.http.tools;

import android.util.Log;

/**
 * 你的指尖--有改变世界的力量！
 * Created by 牛艺衡 on 2017/10/6.
 */

class YTLog {
    public static boolean isDebug = ExportPackageUtils.isDevMode;

    private static final String DEBUG_TAG = "Debug Message - > > ";

    public static void debugInfo(String tag, String msg) {
        i(tag, msg);
    }

    public static void debugInfo(String msg) {
        i(DEBUG_TAG, msg);
    }


    public static void debugError(String msg) {
        e(DEBUG_TAG, msg);
    }
    public static void debugError(String tag, String msg) {
        e(tag, msg);
    }

    /**
     * verbose
     * @param msg
     */
    public static void v( String msg) {
        v(DEBUG_TAG, msg);
    }
    public static void v(String tag, String msg) {
        v(tag, msg,null);
    }
    public static void v(String tag, String msg, Throwable tr) {
        if (isDebug) {
            Log.v(tag, msg,tr);
        }
    }

    /**
     * info
     * @param msg
     */
    public static void i( String msg) {
        i(DEBUG_TAG, msg);
    }
    public static void i(String tag, String msg) {
        i(tag, msg,null);
    }
    public static void i(String tag, String msg, Throwable tr) {
        if (isDebug) {
            Log.i(tag, msg,tr);
        }
    }


    /**
     * debug
     * @param msg
     */
    public static void d( String msg) {
        d(DEBUG_TAG, msg);
    }
    public static void d(String tag, String msg) {
        d(tag, msg,null);
    }
    public static void d(String tag, String msg, Throwable tr) {
        if (isDebug) {
            Log.d(tag, msg,tr);
        }
    }


    /**
     * warn
     * @param msg
     */
    public static void w( String msg) {
        w(DEBUG_TAG, msg);
    }
    public static void w(String tag, String msg) {
        w(tag, msg,null);
    }
    public static void w(String tag, String msg, Throwable tr) {
        if (isDebug) {
            Log.w(tag, msg,tr);
        }
    }


    public static void e(Exception e){
        if( e != null ){
            e(e.getMessage());
        }
    }

    /**
     * error
     * @param msg
     */
    public static void e( String msg) {
        e(DEBUG_TAG, msg);
    }

    public static void e(String tag, String msg) {
        e(tag, msg,null);
    }
    public static void e(String tag, String msg, Throwable tr) {
        if (isDebug) {
            Log.e(tag, msg,tr);
        }
    }

}
