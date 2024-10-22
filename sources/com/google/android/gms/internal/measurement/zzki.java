package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzki {
    private static final zzkg zza = zzc();
    private static final zzkg zzb = new zzkf();

    public static zzkg zza() {
        return zza;
    }

    public static zzkg zzb() {
        return zzb;
    }

    private static zzkg zzc() {
        try {
            return (zzkg) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
