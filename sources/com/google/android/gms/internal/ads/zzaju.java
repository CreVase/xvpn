package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaju implements zzakd {
    private zzam zza;
    private zzfi zzb;
    private zzacs zzc;

    public zzaju(String str) {
        zzak zzakVar = new zzak();
        zzakVar.zzU(str);
        this.zza = zzakVar.zzac();
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zza(zzfb zzfbVar) {
        zzdx.zzb(this.zzb);
        int i = zzfk.zza;
        long zzd = this.zzb.zzd();
        long zze = this.zzb.zze();
        if (zzd != -9223372036854775807L && zze != -9223372036854775807L) {
            zzam zzamVar = this.zza;
            if (zze != zzamVar.zzq) {
                zzak zzb = zzamVar.zzb();
                zzb.zzY(zze);
                zzam zzac = zzb.zzac();
                this.zza = zzac;
                this.zzc.zzl(zzac);
            }
            int zza = zzfbVar.zza();
            this.zzc.zzr(zzfbVar, zza);
            this.zzc.zzt(zzd, 1, zza, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzakd
    public final void zzb(zzfi zzfiVar, zzabp zzabpVar, zzakq zzakqVar) {
        this.zzb = zzfiVar;
        zzakqVar.zzc();
        zzacs zzw = zzabpVar.zzw(zzakqVar.zza(), 5);
        this.zzc = zzw;
        zzw.zzl(this.zza);
    }
}
