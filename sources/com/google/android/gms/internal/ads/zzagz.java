package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzagz {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzfb zzf;
    private final zzfb zzg;
    private int zzh;
    private int zzi;

    public zzagz(zzfb zzfbVar, zzfb zzfbVar2, boolean z) throws zzcc {
        this.zzg = zzfbVar;
        this.zzf = zzfbVar2;
        this.zze = z;
        zzfbVar2.zzG(12);
        this.zza = zzfbVar2.zzo();
        zzfbVar.zzG(12);
        this.zzi = zzfbVar.zzo();
        zzabq.zzb(zzfbVar.zzf() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long zzt;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            zzt = this.zzf.zzu();
        } else {
            zzt = this.zzf.zzt();
        }
        this.zzd = zzt;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzo();
            this.zzg.zzH(4);
            int i2 = -1;
            int i3 = this.zzi - 1;
            this.zzi = i3;
            if (i3 > 0) {
                i2 = (-1) + this.zzg.zzo();
            }
            this.zzh = i2;
        }
        return true;
    }
}
