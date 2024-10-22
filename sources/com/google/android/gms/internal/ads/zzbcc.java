package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class zzbcc {
    public static final SharedPreferences zza(Context context) {
        return context.getSharedPreferences("google_ads_flags", 0);
    }
}
