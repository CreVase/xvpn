package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum zzgoy implements zzgub {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);

    private static final zzguc zzg = new zzguc() { // from class: com.google.android.gms.internal.ads.zzgox
    };
    private final int zzi;

    zzgoy(int i) {
        this.zzi = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
