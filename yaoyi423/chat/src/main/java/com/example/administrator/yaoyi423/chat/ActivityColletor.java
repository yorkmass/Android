package com.example.administrator.yaoyi423.chat;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityColletor {
    public static List<Activity> activities=new ArrayList<>();
    public static void addActivity(Activity activity){
        activities.remove(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity:activities){
            if(!activity.isFinishing())
                activity.finish();
        }
    }
}
