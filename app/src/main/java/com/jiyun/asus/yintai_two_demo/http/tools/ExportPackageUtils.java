package com.jiyun.asus.yintai_two_demo.http.tools;

/**
 * 你的指尖--有改变世界的力量！
 * Created by 牛艺衡 on 2017/10/6.
 */

class ExportPackageUtils {
    /**
     * 线上模式
     */
    public static final int RELEASEMODE = 1;
    /**
     * 开发模式
     */
    public static final int DEVMODE = -1;
    /**
     * 当前模式，目前可控制日志是否显示
     */
    public static int curMode = RELEASEMODE;

    /**
     * 是否是开发模式
     */
    public static boolean isDevMode = curMode == DEVMODE;

}
