package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgtu implements zzgvh {
    private static final zzgtu zza = new zzgtu();

    private zzgtu() {
    }

    public static zzgtu zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public final zzgvg zzb(Class cls) {
        if (zzgtz.class.isAssignableFrom(cls)) {
            try {
                return (zzgvg) zzgtz.zzaC(cls.asSubclass(zzgtz.class)).zzb(3, null, null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgvh
    public final boolean zzc(Class cls) {
        return zzgtz.class.isAssignableFrom(cls);
    }
}
