package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhbd implements zzhbc, zzhaw {
    private static final zzhbd zza = new zzhbd(null);
    private final Object zzb;

    private zzhbd(Object obj) {
        this.zzb = obj;
    }

    public static zzhbc zza(Object obj) {
        zzhbk.zza(obj, "instance cannot be null");
        return new zzhbd(obj);
    }

    public static zzhbc zzc(Object obj) {
        if (obj == null) {
            return zza;
        }
        return new zzhbd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final Object zzb() {
        return this.zzb;
    }
}
