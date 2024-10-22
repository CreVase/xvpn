package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes.dex */
public final class zzbsi {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    private NativeCustomFormatAd zzc;

    public zzbsi(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzbgi zzbgiVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbsj zzbsjVar = new zzbsj(zzbgiVar);
        this.zzc = zzbsjVar;
        return zzbsjVar;
    }

    public final zzbgs zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbsf(this, null);
    }

    public final zzbgv zzb() {
        return new zzbsh(this, null);
    }
}
