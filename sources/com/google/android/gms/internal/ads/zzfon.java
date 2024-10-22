package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfon extends Exception {
    private final int zza;

    public zzfon(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfon(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
