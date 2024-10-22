package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaed extends zzaca {
    private final long zza;

    public zzaed(zzabn zzabnVar, long j) {
        super(zzabnVar);
        boolean z;
        if (zzabnVar.zzf() >= j) {
            z = true;
        } else {
            z = false;
        }
        zzdx.zzd(z);
        this.zza = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaca, com.google.android.gms.internal.ads.zzabn
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaca, com.google.android.gms.internal.ads.zzabn
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaca, com.google.android.gms.internal.ads.zzabn
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}
