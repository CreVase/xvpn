package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhbb implements zzhbp, zzhaw {
    private static final Object zza = new Object();
    private volatile zzhbp zzb;
    private volatile Object zzc = zza;

    private zzhbb(zzhbp zzhbpVar) {
        this.zzb = zzhbpVar;
    }

    public static zzhaw zza(zzhbp zzhbpVar) {
        if (zzhbpVar instanceof zzhaw) {
            return (zzhaw) zzhbpVar;
        }
        zzhbpVar.getClass();
        return new zzhbb(zzhbpVar);
    }

    public static zzhbp zzc(zzhbp zzhbpVar) {
        return zzhbpVar instanceof zzhbb ? zzhbpVar : new zzhbb(zzhbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
