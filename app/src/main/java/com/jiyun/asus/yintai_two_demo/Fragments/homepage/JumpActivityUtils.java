package com.jiyun.asus.yintai_two_demo.Fragments.homepage;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.jiyun.asus.yintai_two_demo.Fragments.homepage.webview.WebActivity;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by asus on 2017/10/21.
 */

public class JumpActivityUtils {
    public static void jump(Context context, String jumpUrl) {
        try {
            URI uri = new URI(jumpUrl);
            String query = uri.getQuery();
            if (query.startsWith("url=")) {
                String[] split = query.split("url=");
                Intent intent = new Intent(context, WebActivity.class);
                intent.putExtra("url", split[1]);
                Log.e("URL++++",split[1]);
                context.startActivity(intent);
            }else {
                Toast.makeText(context, "url不符合", Toast.LENGTH_SHORT).show();
            }
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }

}
