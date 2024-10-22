package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzdx {
    public static int zza(int i, int i2, int i3) {
        if (i >= 0 && i < i3) {
            return i;
        }
        throw new IndexOutOfBoundsException();
    }

    public static Object zzb(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException();
    }

    public static String zzc(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static void zzd(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzf(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }
}
