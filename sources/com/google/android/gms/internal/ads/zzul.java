package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzul implements zzvo {
    private final zzvo zza;
    private final long zzb;

    public zzul(zzvo zzvoVar, long j) {
        this.zza = zzvoVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zza(zzkn zzknVar, zzht zzhtVar, int i) {
        int zza = this.zza.zza(zzknVar, zzhtVar, i);
        if (zza == -4) {
            zzhtVar.zze += this.zzb;
            return -4;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final int zzb(long j) {
        return this.zza.zzb(j - this.zzb);
    }

    public final zzvo zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzvo
    public final boolean zze() {
        return this.zza.zze();
    }
}
