package com.google.android.gms.internal.base;

import android.os.Build;

/* loaded from: classes.dex */
final class zan {
    public static boolean zaa() {
        if (Build.VERSION.SDK_INT < 33 && Build.VERSION.CODENAME.charAt(0) != 'T') {
            return false;
        }
        return true;
    }
}
