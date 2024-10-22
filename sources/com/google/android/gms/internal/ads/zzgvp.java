package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgvp {
    private static final zzgvo zza;
    private static final zzgvo zzb;

    static {
        zzgvo zzgvoVar;
        try {
            zzgvoVar = (zzgvo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgvoVar = null;
        }
        zza = zzgvoVar;
        zzb = new zzgvo();
    }

    public static zzgvo zza() {
        return zza;
    }

    public static zzgvo zzb() {
        return zzb;
    }
}
