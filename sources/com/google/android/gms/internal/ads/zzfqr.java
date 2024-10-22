package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes.dex */
public final class zzfqr {
    @SuppressLint({"RestrictedApi"})
    public static zzfqq zza(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return new zzfqs(new zzfqy(context));
    }
}
