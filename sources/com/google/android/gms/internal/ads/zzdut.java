package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzdut implements zzdei {
    private final Bundle zza = new Bundle();

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zza(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzb(String str, String str2) {
        this.zza.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzc(String str) {
        this.zza.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzd(String str) {
        this.zza.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzf() {
    }

    public final synchronized Bundle zzg() {
        return new Bundle(this.zza);
    }
}
