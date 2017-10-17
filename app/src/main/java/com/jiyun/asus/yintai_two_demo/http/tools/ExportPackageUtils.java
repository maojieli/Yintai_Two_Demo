package com.jiyun.asus.yintai_two_demo.http.tools;

/**
 * @DATE 2013年11月7日 17:14:03
 * @author  用于打包时标记位使用
 */
public class ExportPackageUtils {
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
