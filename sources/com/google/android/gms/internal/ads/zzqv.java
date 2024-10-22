package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzqv extends IOException {
    public final int zza;

    public zzqv(Throwable th, int i) {
        super(th);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
