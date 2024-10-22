package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzkj {
    public zzlk zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    public boolean zze;
    public int zzf;
    private boolean zzg;

    public zzkj(zzlk zzlkVar) {
        this.zza = zzlkVar;
    }

    public final void zza(int i) {
        this.zzg = 1 == ((this.zzg ? 1 : 0) | i);
        this.zzb += i;
    }

    public final void zzb(int i) {
        this.zzg = true;
        this.zze = true;
        this.zzf = i;
    }

    public final void zzc(zzlk zzlkVar) {
        this.zzg |= this.zza != zzlkVar;
        this.zza = zzlkVar;
    }

    public final void zzd(int i) {
        boolean z = true;
        if (this.zzc && this.zzd != 5) {
            if (i != 5) {
                z = false;
            }
            zzdx.zzd(z);
        } else {
            this.zzg = true;
            this.zzc = true;
            this.zzd = i;
        }
    }
}
