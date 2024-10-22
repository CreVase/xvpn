package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* loaded from: classes.dex */
public final class zzbht {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    private NativeCustomTemplateAd zzc;

    public zzbht(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public static /* bridge */ /* synthetic */ NativeCustomTemplateAd zzc(zzbht zzbhtVar, zzbgi zzbgiVar) {
        return zzbhtVar.zzf(zzbgiVar);
    }

    private final synchronized NativeCustomTemplateAd zzf(zzbgi zzbgiVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbgj zzbgjVar = new zzbgj(zzbgiVar);
        this.zzc = zzbgjVar;
        return zzbgjVar;
    }

    public final zzbgs zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbhq(this, null);
    }

    public final zzbgv zze() {
        return new zzbhs(this, null);
    }
}
