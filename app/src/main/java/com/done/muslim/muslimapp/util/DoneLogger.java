package com.done.muslim.muslimapp.util;

import android.util.Log;

/**
 * code is far away from bug with the animal protecting
 * 　　　　　　　 ┏┓       ┏┓+ +
 * 　　　　　　　┏┛┻━━━━━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　 ┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 █████━█████  ┃+
 * 　　　　　　　┃　　　　　　 ┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　 ┃ + +
 * 　　　　　　　┗━━┓　　　 ┏━┛
 * ┃　　  ┃
 * 　　　　　　　　　┃　　  ┃ + + + +
 * 　　　　　　　　　┃　　　┃　Code is far away from     bug with the animal protecting
 * 　　　　　　　　　┃　　　┃ + 　　　　         神兽保佑,代码无bug
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　 ┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━━━┳┓┏┛ + + + +
 * 　　　　　　　　　 ┃┫┫　 ┃┫┫
 * 　　　　　　　　　 ┗┻┛　 ┗┻┛+ + + +
 * <p>
 * 江城子 . 程序员之歌
 * <p>
 * 十年生死两茫茫，写程序，到天亮。
 * 千行代码，Bug何处藏。
 * 纵使上线又怎样，朝令改，夕断肠。
 * <p>
 * 领导每天新想法，天天改，日日忙。
 * 相顾无言，惟有泪千行。
 * 每晚灯火阑珊处，夜难寐，加班狂。
 *
 * @author Done
 * @date 2018/3/21
 * Created by Done on 2018/3/21.
 */

public class DoneLogger {

    public static boolean DEBUG = true;

    public static void v(String tag, String message) {
        if (DEBUG) {
            Log.v(tag, processMessage(message));
        }
    }

    public static void d(String tag, String message) {
        if (DEBUG) {
            Log.d(tag, processMessage(message));
        }
    }

    public static void i(String tag, String message) {
        if (DEBUG) {
            Log.i(tag, processMessage(message));
        }
    }

    public static void w(String tag, String message) {
        if (DEBUG) {
            Log.w(tag, processMessage(message));
        }
    }

    public static void e(String tag, String message) {
        if (DEBUG) {
            Log.e(tag, processMessage(message));
        }
    }

    private static String processMessage(String message) {
        return "[ThreadName:" + Thread.currentThread().getName() +
                ",ThreadId:" + Thread.currentThread().getId() + "]☞" +
                message;
    }
}
