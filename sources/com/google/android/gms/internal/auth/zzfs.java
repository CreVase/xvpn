package com.google.android.gms.internal.auth;

/* loaded from: classes.dex */
final class zzfs {
    private static final zzfr zza;
    private static final zzfr zzb;

    static {
        zzfr zzfrVar;
        try {
            zzfrVar = (zzfr) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzfrVar = null;
        }
        zza = zzfrVar;
        zzb = new zzfr();
    }

    public static zzfr zza() {
        return zza;
    }

    public static zzfr zzb() {
        return zzb;
    }
}
