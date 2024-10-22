package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzdqb implements zzcyg {
    private final zzcgb zza;

    public zzdqb(zzcgb zzcgbVar) {
        this.zza = zzcgbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbn(Context context) {
        zzcgb zzcgbVar = this.zza;
        if (zzcgbVar != null) {
            zzcgbVar.destroy();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbp(Context context) {
        zzcgb zzcgbVar = this.zza;
        if (zzcgbVar != null) {
            zzcgbVar.onPause();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbq(Context context) {
        zzcgb zzcgbVar = this.zza;
        if (zzcgbVar != null) {
            zzcgbVar.onResume();
        }
    }
}
