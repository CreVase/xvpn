package com.google.android.gms.measurement.internal;

/* loaded from: classes2.dex */
public final class zzfi<V> {
    private static final Object zza = new Object();
    private final String zzb;
    private final zzfg<V> zzc;
    private final V zzd;
    private final V zze;
    private final Object zzf;
    private volatile V zzg;
    private volatile V zzh;

    public final V zza(V v) {
        synchronized (this.zzf) {
        }
        if (v != null) {
            return v;
        }
        if (zzff.zza == null) {
            return this.zzd;
        }
        synchronized (zza) {
            if (zzae.zza()) {
                return this.zzh == null ? this.zzd : this.zzh;
            }
            try {
                for (zzfi zzfiVar : zzbi.zzcu()) {
                    if (!zzae.zza()) {
                        V v2 = null;
                        try {
                            zzfg<V> zzfgVar = zzfiVar.zzc;
                            if (zzfgVar != null) {
                                v2 = zzfgVar.zza();
                            }
                        } catch (IllegalStateException unused) {
                        }
                        synchronized (zza) {
                            zzfiVar.zzh = v2;
                        }
                    } else {
                        throw new IllegalStateException("Refreshing flag cache must be done on a worker thread.");
                    }
                }
            } catch (SecurityException unused2) {
            }
            zzfg<V> zzfgVar2 = this.zzc;
            if (zzfgVar2 == null) {
                return this.zzd;
            }
            try {
                return zzfgVar2.zza();
            } catch (IllegalStateException unused3) {
                return this.zzd;
            } catch (SecurityException unused4) {
                return this.zzd;
            }
        }
    }

    private zzfi(String str, V v, V v2, zzfg<V> zzfgVar) {
        this.zzf = new Object();
        this.zzg = null;
        this.zzh = null;
        this.zzb = str;
        this.zzd = v;
        this.zze = v2;
        this.zzc = zzfgVar;
    }

    public final String zza() {
        return this.zzb;
    }
}
