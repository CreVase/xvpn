package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgq implements zzgh {
    private zzhk zzb;
    private String zzc;
    private boolean zzf;
    private final zzhe zza = new zzhe();
    private int zzd = 8000;
    private int zze = 8000;

    public final zzgq zzb(boolean z) {
        this.zzf = true;
        return this;
    }

    public final zzgq zzc(int i) {
        this.zzd = i;
        return this;
    }

    public final zzgq zzd(int i) {
        this.zze = i;
        return this;
    }

    public final zzgq zze(zzhk zzhkVar) {
        this.zzb = zzhkVar;
        return this;
    }

    public final zzgq zzf(String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgh
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final zzgv zza() {
        zzgv zzgvVar = new zzgv(this.zzc, this.zzd, this.zze, this.zzf, this.zza);
        zzhk zzhkVar = this.zzb;
        if (zzhkVar != null) {
            zzgvVar.zzf(zzhkVar);
        }
        return zzgvVar;
    }
}
