package com.google.android.gms.internal.ads;

import defpackage.wx3;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final /* synthetic */ class zzfyk {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
        while (!wx3.a(unsafe, obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }
}
