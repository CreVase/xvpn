package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.gms.internal.ads.zzcgb;

/* loaded from: classes.dex */
public final class zzh {
    public final int zza;
    public final ViewGroup.LayoutParams zzb;
    public final ViewGroup zzc;
    public final Context zzd;

    public zzh(zzcgb zzcgbVar) throws zzf {
        this.zzb = zzcgbVar.getLayoutParams();
        ViewParent parent = zzcgbVar.getParent();
        this.zzd = zzcgbVar.zzE();
        if (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            this.zzc = viewGroup;
            this.zza = viewGroup.indexOfChild(zzcgbVar.zzF());
            viewGroup.removeView(zzcgbVar.zzF());
            zzcgbVar.zzan(true);
            return;
        }
        throw new zzf("Could not get the parent of the WebView for an overlay.");
    }
}
