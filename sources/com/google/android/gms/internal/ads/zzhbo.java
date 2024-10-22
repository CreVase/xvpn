package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhbo implements zzhbp {
    private static final Object zza = new Object();
    private volatile zzhbp zzb;
    private volatile Object zzc = zza;

    private zzhbo(zzhbp zzhbpVar) {
        this.zzb = zzhbpVar;
    }

    public static zzhbp zza(zzhbp zzhbpVar) {
        return ((zzhbpVar instanceof zzhbo) || (zzhbpVar instanceof zzhbb)) ? zzhbpVar : new zzhbo(zzhbpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzhbp zzhbpVar = this.zzb;
            if (zzhbpVar == null) {
                return this.zzc;
            }
            Object zzb = zzhbpVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
