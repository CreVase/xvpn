package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzuj implements zzxk {
    private final zzxk zza;
    private final zzcx zzb;

    public zzuj(zzxk zzxkVar, zzcx zzcxVar) {
        this.zza = zzxkVar;
        this.zzb = zzcxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzuj)) {
            return false;
        }
        zzuj zzujVar = (zzuj) obj;
        if (this.zza.equals(zzujVar.zza) && this.zzb.equals(zzujVar.zzb)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode() + 527;
        return this.zza.hashCode() + (hashCode * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zza(int i) {
        return this.zza.zza(0);
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final int zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzam zzd(int i) {
        return this.zza.zzd(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxo
    public final zzcx zze() {
        return this.zzb;
    }
}
