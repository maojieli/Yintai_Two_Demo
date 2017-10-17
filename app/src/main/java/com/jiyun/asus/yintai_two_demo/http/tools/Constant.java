package com.jiyun.asus.yintai_two_demo.http.tools;

public class Constant {

    /**
     * 用来匹配从WebBrowser打开NativeApp
     */
    public static String BROWSER_URI_SCHEME = "yintaimobile";
    /**
     * 产品线 银泰百货app 1｜银泰网app ？｜银泰折扣app ？｜银泰百货hd ？
     */
    public static String PRODUCT_LINE = "1";


    public static final String SOURCE_ID = "sourceid";
    public static final String APPKEY = "2341C87D8798A9808B9808FDE31066A1";
    public static final String OS = "android";
    //    public static final String APPVER = getAppVersionName();
    public static final String AUTHTYPE = "md5";
    public static final String VER = "2.0";
    public static final String APPNAME = "yintai";
    public static final String APPCPA_APPKEY = "352ae4f69e7f46f1b25744c7df1aa7f8";

    //线上地址
    public static String NETURL = "https://api.yintai.com/mobile/service";

    //BI key
    public static final String APP_KEY = "yintai-android";
    //BI secret
    public static final String SERCRET_KEY = "53d45bbf50330aaaba9827b917130445";
    //    BI 测试secret
    //    public static final String SERCRET_KEY = "378841126927e3b2b219ec4a9dc7bebf";
    //    密度
    public static float density;
    /**
     * 全局记录key
     */
    // 当前页key
    public static final String CURRENTPAGE = "CURRENTPAGE";
    public static final String ERROR_INFO = "errorInfo";

    public static final String STATUS_Code = "statusCode";
    public static final String DESCRIPTION = "description";
    public static final String USERID = "userId";
    public static final String IS_SUCCESSFUL = "isSuccessful";
    //omnitureAccount正式账户
    public static final String omnitureAccount = "intime-mobile";
    //缓存文件的最大值
    public static final long CACHEMAXSIZE = 10 * 1024 * 1024;
    //UID
    public static String UID = "uid";
    /**
     * ~MoreActivity常量key
     */
    // 本地文件标签
    public static final String PUBLIC_FILE = "publicfile";
    // 用户编号ID
    public static String USER_USERID = "userId";
    // 用户的积分
    public static String USER_POINT = "userpoint";
    //购物车
    public static String SHOPCAR = "shopcar";
    // 等级
    public static String USER_CLASS = "userclass";
    // 用户名
    public static String USER_NAME = "username";
    //注册
    public static String REGISTER_COMMAND = "customer.reg";
    //引导页
    public static String GUIDE_PAGE = "guide";

    //支付宝登录,地址参数
    public static String ALIPAY_ADDRESS = "alipayAddress";
    //帮助URL
    public static String HELP_URL = "http://m.yintai.com/Help/Index?helpid=201";//file:///android_asset/help/help.html
    public static String LOGINTIMEOUT = "您已经很长时候没有使用啦,为保证你的账户安全,请重新登录.";

    /**
     * 是否使用Demo数据
     */
    public static final boolean JUST_FOR_DEMO = false;
    /**
     * 是否使用DataServer获取网络数据
     */
    public static final long DEMO_WAIT_FOR_QUERY = 1500;

    //SharedPreference用key值
    /**
     * 服务器时间key值
     */
    public static final String SP_KEY_SERVERTIME = "servertime";
    public static final String SP_KEY_HOMEBGColor = "homebgcolor";

}
