package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgvf {
    private static final zzgve zza;
    private static final zzgve zzb;

    static {
        zzgve zzgveVar;
        try {
            zzgveVar = (zzgve) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgveVar = null;
        }
        zza = zzgveVar;
        zzb = new zzgve();
    }

    public static zzgve zza() {
        return zza;
    }

    public static zzgve zzb() {
        return zzb;
    }
}
