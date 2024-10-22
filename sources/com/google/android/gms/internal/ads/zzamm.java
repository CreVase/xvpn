package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzamm {
    public final Object zza;
    public final zzalp zzb;
    public final zzamp zzc;
    public boolean zzd;

    private zzamm(zzamp zzampVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzampVar;
    }

    public static zzamm zza(zzamp zzampVar) {
        return new zzamm(zzampVar);
    }

    public static zzamm zzb(Object obj, zzalp zzalpVar) {
        return new zzamm(obj, zzalpVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzamm(Object obj, zzalp zzalpVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzalpVar;
        this.zzc = null;
    }
}
