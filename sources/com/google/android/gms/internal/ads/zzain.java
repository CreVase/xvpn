package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class zzain {
    private zzacs zzb;
    private zzabp zzc;
    private zzaii zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private final zzaig zza = new zzaig();
    private zzaik zzj = new zzaik();

    public abstract long zza(zzfb zzfbVar);

    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzaik();
            this.zzf = 0L;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1L;
        this.zzg = 0L;
    }

    public abstract boolean zzc(zzfb zzfbVar, long j, zzaik zzaikVar) throws IOException;

    public final int zze(zzabn zzabnVar, zzacj zzacjVar) throws IOException {
        boolean z;
        zzdx.zzb(this.zzb);
        int i = zzfk.zza;
        int i2 = this.zzh;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -1;
                }
                long zzd = this.zzd.zzd(zzabnVar);
                if (zzd >= 0) {
                    zzacjVar.zza = zzd;
                    return 1;
                }
                if (zzd < -1) {
                    zzi(-(zzd + 2));
                }
                if (!this.zzl) {
                    zzacm zze = this.zzd.zze();
                    zzdx.zzb(zze);
                    this.zzc.zzO(zze);
                    this.zzl = true;
                }
                if (this.zzk <= 0 && !this.zza.zze(zzabnVar)) {
                    this.zzh = 3;
                    return -1;
                }
                this.zzk = 0L;
                zzfb zza = this.zza.zza();
                long zza2 = zza(zza);
                if (zza2 >= 0) {
                    long j = this.zzg;
                    if (j + zza2 >= this.zze) {
                        long zzf = zzf(j);
                        zzacq.zzb(this.zzb, zza, zza.zzd());
                        this.zzb.zzt(zzf, 1, zza.zzd(), 0, null);
                        this.zze = -1L;
                    }
                }
                this.zzg += zza2;
                return 0;
            }
            ((zzabc) zzabnVar).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        }
        while (this.zza.zze(zzabnVar)) {
            long zzf2 = zzabnVar.zzf();
            long j2 = this.zzf;
            this.zzk = zzf2 - j2;
            if (zzc(this.zza.zza(), j2, this.zzj)) {
                this.zzf = zzabnVar.zzf();
            } else {
                zzam zzamVar = this.zzj.zza;
                this.zzi = zzamVar.zzA;
                if (!this.zzm) {
                    this.zzb.zzl(zzamVar);
                    this.zzm = true;
                }
                zzaii zzaiiVar = this.zzj.zzb;
                if (zzaiiVar != null) {
                    this.zzd = zzaiiVar;
                } else if (zzabnVar.zzd() == -1) {
                    this.zzd = new zzaim(null);
                } else {
                    zzaih zzb = this.zza.zzb();
                    if ((zzb.zza & 4) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.zzd = new zzaib(this, this.zzf, zzabnVar.zzd(), zzb.zzd + zzb.zze, zzb.zzb, z);
                }
                this.zzh = 2;
                this.zza.zzd();
                return 0;
            }
        }
        this.zzh = 3;
        return -1;
    }

    public final long zzf(long j) {
        return (j * 1000000) / this.zzi;
    }

    public final long zzg(long j) {
        return (this.zzi * j) / 1000000;
    }

    public final void zzh(zzabp zzabpVar, zzacs zzacsVar) {
        this.zzc = zzabpVar;
        this.zzb = zzacsVar;
        zzb(true);
    }

    public void zzi(long j) {
        this.zzg = j;
    }

    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
            return;
        }
        if (this.zzh != 0) {
            long zzg = zzg(j2);
            this.zze = zzg;
            zzaii zzaiiVar = this.zzd;
            int i = zzfk.zza;
            zzaiiVar.zzg(zzg);
            this.zzh = 2;
        }
    }
}
