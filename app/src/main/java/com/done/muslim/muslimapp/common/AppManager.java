package com.done.muslim.muslimapp.common;

import android.app.Activity;

import java.util.Stack;

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
 * 此类用来管理应用中所有的Activity
 *
 * @author Done
 * @date 2018/3/21
 * Created by Done on 2018/3/21.
 */

public class AppManager {

    private static volatile AppManager instance;

    /**
     * Activity的管理栈
     */
    private Stack<Activity> activityStack;

    public static AppManager getInstance() {
        if (null == instance) {
            synchronized (AppManager.class) {
                if (null == instance) {
                    instance = new AppManager();
                }
            }
        }
        return instance;
    }

    private AppManager() {
        activityStack = new Stack<>();
    }

    public synchronized void addActivity(Activity activity) {
        activityStack.push(activity);
    }

    public synchronized void removeCurActivity() {
        activityStack.pop();
    }

    public synchronized boolean removeActivity(Activity activity) {
        if (activity != null) {
            activity.finish();
        }
        return activityStack.remove(activity);
    }

    public synchronized void removeAllActivity() {
        for (int i = 0; i < activityStack.size(); i++) {
            Activity activity = activityStack.pop();
            activity.finish();
        }
    }
}
