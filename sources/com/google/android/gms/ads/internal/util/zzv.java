package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzcam;

@TargetApi(24)
/* loaded from: classes.dex */
public class zzv extends zzu {
    public static final boolean zzf(int i, int i2, int i3) {
        if (Math.abs(i - i2) <= i3) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zze(Activity activity, Configuration configuration) {
        int i;
        boolean isInMultiWindowMode;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeH)).booleanValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeJ)).booleanValue()) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            return isInMultiWindowMode;
        }
        com.google.android.gms.ads.internal.client.zzay.zzb();
        int zzx = zzcam.zzx(activity, configuration.screenHeightDp);
        int zzx2 = zzcam.zzx(activity, configuration.screenWidthDp);
        WindowManager windowManager = (WindowManager) activity.getApplicationContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzs = zzt.zzs(windowManager);
        int i2 = zzs.heightPixels;
        int i3 = zzs.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = activity.getResources().getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        int intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeF)).intValue() * ((int) Math.round(activity.getResources().getDisplayMetrics().density + 0.5d));
        if (zzf(i2, zzx + i, intValue) && zzf(i3, zzx2, intValue)) {
            return false;
        }
        return true;
    }
}
