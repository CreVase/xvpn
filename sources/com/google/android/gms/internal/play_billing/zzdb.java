package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class zzdb {
    private static final zzda zza;
    private static final zzda zzb;

    static {
        zzda zzdaVar;
        try {
            zzdaVar = (zzda) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzdaVar = null;
        }
        zza = zzdaVar;
        zzb = new zzda();
    }

    public static zzda zza() {
        return zza;
    }

    public static zzda zzb() {
        return zzb;
    }
}
