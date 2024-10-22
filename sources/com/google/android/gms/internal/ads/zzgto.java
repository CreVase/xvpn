package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgto {
    private static final zzgtm zza = new zzgtn();
    private static final zzgtm zzb;

    static {
        zzgtm zzgtmVar;
        try {
            zzgtmVar = (zzgtm) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgtmVar = null;
        }
        zzb = zzgtmVar;
    }

    public static zzgtm zza() {
        zzgtm zzgtmVar = zzb;
        if (zzgtmVar != null) {
            return zzgtmVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzgtm zzb() {
        return zza;
    }
}
