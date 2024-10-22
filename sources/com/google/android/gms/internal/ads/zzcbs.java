package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

@Deprecated
/* loaded from: classes.dex */
public class zzcbs {
    private final zzcbl zza;
    private final AtomicInteger zzb;

    public zzcbs() {
        zzcbl zzcblVar = new zzcbl();
        this.zza = zzcblVar;
        this.zzb = new AtomicInteger(0);
        zzfzt.zzr(zzcblVar, new zzcbq(this), zzcbg.zzf);
    }

    @Deprecated
    public final int zze() {
        return this.zzb.get();
    }

    @Deprecated
    public final void zzg() {
        this.zza.zzd(new Exception());
    }

    @Deprecated
    public final void zzh(Object obj) {
        this.zza.zzc(obj);
    }

    @Deprecated
    public final void zzi(zzcbp zzcbpVar, zzcbn zzcbnVar) {
        zzfzt.zzr(this.zza, new zzcbr(this, zzcbpVar, zzcbnVar), zzcbg.zzf);
    }
}
