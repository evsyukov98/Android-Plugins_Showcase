package com.showcase.vibrationplugin;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;

public class VibrationHelper {

    public static void vibrate(long milliseconds, Context context, int amplitude) {
        Vibrator vibrateDefault = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        if (vibrateDefault != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
                VibrationEffect vibrationEffect = VibrationEffect.createOneShot(milliseconds, amplitude);
                vibrateDefault.vibrate(vibrationEffect);
            } else {
                vibrateDefault.vibrate(milliseconds);
            }
        }
    }
}
