package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzfls {
    public static void zza(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
        } else {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void zzb(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalArgumentException(str);
        }
    }
}
