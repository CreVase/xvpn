package com.google.android.gms.internal.play_billing;

import defpackage.hx2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzp {
    public static void zza(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            } else {
                throw new NullPointerException(hx2.q("null value in entry: ", obj.toString(), "=null"));
            }
        }
        throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}
