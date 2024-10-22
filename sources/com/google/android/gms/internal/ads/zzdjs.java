package com.google.android.gms.internal.ads;

import defpackage.uu2;

/* loaded from: classes.dex */
public final class zzdjs {
    zzbgp zza;
    zzbgm zzb;
    zzbhc zzc;
    zzbgz zzd;
    zzbmb zze;
    final uu2 zzf = new uu2();
    final uu2 zzg = new uu2();

    public final zzdjs zza(zzbgm zzbgmVar) {
        this.zzb = zzbgmVar;
        return this;
    }

    public final zzdjs zzb(zzbgp zzbgpVar) {
        this.zza = zzbgpVar;
        return this;
    }

    public final zzdjs zzc(String str, zzbgv zzbgvVar, zzbgs zzbgsVar) {
        this.zzf.put(str, zzbgvVar);
        if (zzbgsVar != null) {
            this.zzg.put(str, zzbgsVar);
        }
        return this;
    }

    public final zzdjs zzd(zzbmb zzbmbVar) {
        this.zze = zzbmbVar;
        return this;
    }

    public final zzdjs zze(zzbgz zzbgzVar) {
        this.zzd = zzbgzVar;
        return this;
    }

    public final zzdjs zzf(zzbhc zzbhcVar) {
        this.zzc = zzbhcVar;
        return this;
    }

    public final zzdju zzg() {
        return new zzdju(this);
    }
}
