package com.google.android.gms.internal.ads;

import defpackage.hx2;
import defpackage.p71;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzcc extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzcc(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzcc zza(String str, Throwable th) {
        return new zzcc(str, th, true, 1);
    }

    public static zzcc zzb(String str, Throwable th) {
        return new zzcc(str, th, true, 0);
    }

    public static zzcc zzc(String str) {
        return new zzcc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder p = p71.p(super.getMessage(), "{contentIsMalformed=");
        p.append(this.zza);
        p.append(", dataType=");
        return hx2.r(p, this.zzb, "}");
    }
}
