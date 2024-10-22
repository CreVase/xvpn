package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum zzgol implements zzgub {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private static final zzguc zzh = new zzguc() { // from class: com.google.android.gms.internal.ads.zzgok
    };
    private final int zzj;

    zzgol(int i) {
        this.zzj = i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(zza());
    }

    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzj;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
