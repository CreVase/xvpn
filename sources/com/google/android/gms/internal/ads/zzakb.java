package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzakb {
    private final zzaje zza;
    private final zzfi zzb;
    private final zzfa zzc = new zzfa(new byte[64], 64);
    private boolean zzd;
    private boolean zze;
    private boolean zzf;

    public zzakb(zzaje zzajeVar, zzfi zzfiVar) {
        this.zza = zzajeVar;
        this.zzb = zzfiVar;
    }

    public final void zza(zzfb zzfbVar) throws zzcc {
        long j;
        long j2;
        zzfbVar.zzC(this.zzc.zza, 0, 3);
        this.zzc.zzj(0);
        this.zzc.zzl(8);
        this.zzd = this.zzc.zzn();
        this.zze = this.zzc.zzn();
        this.zzc.zzl(6);
        zzfa zzfaVar = this.zzc;
        zzfbVar.zzC(zzfaVar.zza, 0, zzfaVar.zzd(8));
        this.zzc.zzj(0);
        if (this.zzd) {
            this.zzc.zzl(4);
            long zzd = this.zzc.zzd(3);
            this.zzc.zzl(1);
            int zzd2 = this.zzc.zzd(15) << 15;
            this.zzc.zzl(1);
            long zzd3 = this.zzc.zzd(15);
            this.zzc.zzl(1);
            if (!this.zzf && this.zze) {
                this.zzc.zzl(4);
                this.zzc.zzl(1);
                int zzd4 = this.zzc.zzd(15) << 15;
                this.zzc.zzl(1);
                j2 = zzd;
                long zzd5 = this.zzc.zzd(15);
                this.zzc.zzl(1);
                this.zzb.zzb(zzd4 | (this.zzc.zzd(3) << 30) | zzd5);
                this.zzf = true;
            } else {
                j2 = zzd;
            }
            j = this.zzb.zzb((j2 << 30) | zzd2 | zzd3);
        } else {
            j = 0;
        }
        this.zza.zzd(j, 4);
        this.zza.zza(zzfbVar);
        this.zza.zzc(false);
    }

    public final void zzb() {
        this.zzf = false;
        this.zza.zze();
    }
}
