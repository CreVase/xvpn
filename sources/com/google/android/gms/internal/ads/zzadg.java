package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzadg implements zzadb {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzadg(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzadg zzb(zzfb zzfbVar) {
        int zzh = zzfbVar.zzh();
        zzfbVar.zzH(8);
        int zzh2 = zzfbVar.zzh();
        int zzh3 = zzfbVar.zzh();
        zzfbVar.zzH(4);
        int zzh4 = zzfbVar.zzh();
        zzfbVar.zzH(12);
        return new zzadg(zzh, zzh2, zzh3, zzh4);
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zza() {
        return 1751742049;
    }
}
