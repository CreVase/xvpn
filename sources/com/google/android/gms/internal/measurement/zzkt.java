package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzkt {
    private static final zzkr zza = zzc();
    private static final zzkr zzb = new zzku();

    public static zzkr zza() {
        return zza;
    }

    public static zzkr zzb() {
        return zzb;
    }

    private static zzkr zzc() {
        try {
            return (zzkr) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
