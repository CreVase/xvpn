package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzet {
    private long[] zza;

    public zzet() {
        this(16);
    }

    public zzet(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int highestOneBit = Integer.highestOneBit(15);
            i2 = highestOneBit + highestOneBit;
        }
        this.zza = new long[i2];
    }
}
