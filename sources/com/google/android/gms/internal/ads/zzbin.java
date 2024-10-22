package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbin implements zzbjj {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        WindowManager windowManager = (WindowManager) zzcgbVar.getContext().getSystemService("window");
        com.google.android.gms.ads.internal.zzt.zzp();
        DisplayMetrics zzs = com.google.android.gms.ads.internal.util.zzt.zzs(windowManager);
        int i = zzs.widthPixels;
        int i2 = zzs.heightPixels;
        int[] iArr = new int[2];
        HashMap hashMap = new HashMap();
        ((View) zzcgbVar).getLocationInWindow(iArr);
        hashMap.put("xInPixels", Integer.valueOf(iArr[0]));
        hashMap.put("yInPixels", Integer.valueOf(iArr[1]));
        hashMap.put("windowWidthInPixels", Integer.valueOf(i));
        hashMap.put("windowHeightInPixels", Integer.valueOf(i2));
        zzcgbVar.zzd("locationReady", hashMap);
        zzcat.zzj("GET LOCATION COMPILED");
    }
}
