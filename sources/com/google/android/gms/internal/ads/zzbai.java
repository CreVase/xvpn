package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum zzbai implements zzgub {
    UNSPECIFIED(0),
    CONNECTING(1),
    CONNECTED(2),
    DISCONNECTING(3),
    DISCONNECTED(4),
    SUSPENDED(5);

    private static final zzguc zzg = new zzguc() { // from class: com.google.android.gms.internal.ads.zzbag
    };
    private final int zzi;

    zzbai(int i) {
        this.zzi = i;
    }

    public static zzbai zzb(int i) {
        if (i == 0) {
            return UNSPECIFIED;
        }
        if (i == 1) {
            return CONNECTING;
        }
        if (i == 2) {
            return CONNECTED;
        }
        if (i == 3) {
            return DISCONNECTING;
        }
        if (i == 4) {
            return DISCONNECTED;
        }
        if (i != 5) {
            return null;
        }
        return SUSPENDED;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.zzi);
    }

    public final int zza() {
        return this.zzi;
    }
}
