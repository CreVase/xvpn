package com.google.android.gms.internal.ads;

import android.system.ErrnoException;
import android.system.OsConstants;

/* loaded from: classes.dex */
final class zzgw {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzb(Throwable th) {
        if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
            return true;
        }
        return false;
    }
}
