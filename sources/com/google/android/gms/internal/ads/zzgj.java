package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzgj extends IOException {
    public final int zza;

    public zzgj(int i) {
        this.zza = i;
    }

    public zzgj(String str, int i) {
        super(str);
        this.zza = i;
    }

    public zzgj(String str, Throwable th, int i) {
        super(str, th);
        this.zza = i;
    }

    public zzgj(Throwable th, int i) {
        super(th);
        this.zza = i;
    }
}
