package com.showcase.activitycheckplugin;

import android.content.Context;
import android.content.Intent;

public class StartActivityHelper {

    public static void openActivity(Context context) {
        Class needActivity = ActivityStringResources.class;
        Intent intent = new Intent(context, needActivity);
        context.startActivity(intent);
    }
}
