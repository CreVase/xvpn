package com.google.android.gms.internal.ads;

import defpackage.hx2;

/* loaded from: classes.dex */
public final class zzfxa {
    public static Object zza(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(hx2.m("at index ", i));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}
