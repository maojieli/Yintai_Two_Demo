package com.jiyun.asus.yintai_two_demo.Fragments.homepage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.BannerActivity;
import com.jiyun.asus.yintai_two_demo.BuildConfig;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.BigOnClickActivity;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.bigonclick.bean.BigOnClickBean;
import com.jiyun.asus.yintai_two_demo.Fragments.homepage.webview.WebActivity;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by asus on 2017/10/21.
 */

public class JumpActivityUtils {

    private static final String YINTAIMOBILE = "yintaimobile";
    private static final String innerH5 = "InnerH5";
    private static final String CustomProductList = "CustomProductList";
    private static final String GeneralProductDetial = "GeneralProductDetial";
    private static final String AutoProductList = "AutoProductList";
    private static final String OutLinkH5 = "OutLinkH5";
    private static Context context;
    private static String url;

    public static void init(Context context) {
        JumpActivityUtils.context = context;
    }

    public static void analyzeJump(String jumpUrl) {
        Uri parse = Uri.parse(jumpUrl);
        String scheme = parse.getScheme();
        Intent intent = new Intent();
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
        if (scheme.equals(YINTAIMOBILE)) {
            if (BuildConfig.DEBUG)
//                Log.d("JumpAnalyze", parse.getHost() + "====" + parse.getQuery().toString());
            switch (parse.getHost()) {
                case innerH5:
                    url = parse.getQuery();
                    if (url.startsWith("url=")) {
                        url = url.replaceAll("url=", "");
                    }
                    intent.setClass(context, WebActivity.class)
                            .putExtra("title", parse.getQueryParameter("title"))
                            .putExtra("url", url);
                    break;
                case CustomProductList:
//                    intent.setClass(context, CustomProductListActivity.class).putExtra("jumpUrl", jumpUrl);
                    break;
                case GeneralProductDetial:
//                    intent.setClass(context, GeneralProductDetialActivity.class).putExtra("jumpUrl", jumpUrl);
                    break;
                case AutoProductList:
                    //页面跳转的参数传递
                    String title = parse.getQueryParameter("title");
                    String searchCondition = parse.getQueryParameter("searchCondition");
                    String showtype = parse.getQueryParameter("showtype");
                    intent.setClass(context, BigOnClickActivity.class).putExtra("jumpUrl", jumpUrl)
                            .putExtra("title", title)
                            .putExtra("searchCondition", searchCondition)
                            .putExtra("showtype", showtype);
                    break;
                case OutLinkH5:
                    url = parse.getQuery();
                    intent.setClass(context, WebActivity.class)
                            .putExtra("title", parse.getQueryParameter("title"))
                            .putExtra("url", url);
                    break;
                default:
                    //老牛覆盖点击事件回滚重新提交
//                    intent.setClass(context, TestActivity.class).putExtra("jumpUrl", jumpUrl);
//                    if (BuildConfig.DEBUG) Log.d("JumpAnalyze", parse.getHost());
                    break;
            }
        }
        context.startActivity(intent);
    }
}
