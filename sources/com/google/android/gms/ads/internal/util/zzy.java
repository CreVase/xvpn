package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbci;
import java.util.List;
import java.util.Locale;

@TargetApi(28)
/* loaded from: classes.dex */
public class zzy extends zzw {
    public static final /* synthetic */ WindowInsets zzm(Activity activity, View view, WindowInsets windowInsets) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        if (com.google.android.gms.ads.internal.zzt.zzo().zzh().zzm() == null) {
            displayCutout = windowInsets.getDisplayCutout();
            String str = "";
            if (displayCutout != null) {
                zzg zzh = com.google.android.gms.ads.internal.zzt.zzo().zzh();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    String format = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(str)) {
                        str = str.concat("|");
                    }
                    str = str.concat(String.valueOf(format));
                }
                zzh.zzC(str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzo().zzh().zzC("");
            }
        }
        zzp(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void zzp(boolean z, Activity activity) {
        int i;
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        i = attributes.layoutInDisplayCutoutMode;
        int i2 = 1;
        if (true != z) {
            i2 = 2;
        }
        if (i2 != i) {
            attributes.layoutInDisplayCutoutMode = i2;
            window.setAttributes(attributes);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzk(AudioManager audioManager) {
        int streamMinVolume;
        streamMinVolume = audioManager.getStreamMinVolume(3);
        return streamMinVolume;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzl(final Activity activity) {
        boolean isInMultiWindowMode;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbe)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzo().zzh().zzm() == null) {
            isInMultiWindowMode = activity.isInMultiWindowMode();
            if (!isInMultiWindowMode) {
                zzp(true, activity);
                activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.gms.ads.internal.util.zzx
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        return zzy.zzm(activity, view, windowInsets);
                    }
                });
            }
        }
    }
}
