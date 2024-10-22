package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzadh implements zzadb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzadh(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzadh zzb(zzfb zzfbVar) {
        int zzh = zzfbVar.zzh();
        zzfbVar.zzH(12);
        int zzh2 = zzfbVar.zzh();
        int zzh3 = zzfbVar.zzh();
        int zzh4 = zzfbVar.zzh();
        zzfbVar.zzH(4);
        int zzh5 = zzfbVar.zzh();
        int zzh6 = zzfbVar.zzh();
        zzfbVar.zzH(8);
        return new zzadh(zzh, zzh2, zzh3, zzh4, zzh5, zzh6);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zza() {
        return 1752331379;
    }
}
