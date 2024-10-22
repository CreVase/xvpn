package com.google.android.gms.internal.auth;

import android.os.Build;
import android.os.UserManager;

/* loaded from: classes.dex */
public final class zzcc {
    private static UserManager zza;
    private static volatile boolean zzb = !zzb();

    private zzcc() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:            if (r4.isUserRunning(android.os.Process.myUserHandle()) == false) goto L26;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003d, code lost:            r7 = true;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean zza(android.content.Context r7) {
        /*
            boolean r0 = zzb()
            r1 = 0
            if (r0 == 0) goto L54
            boolean r0 = com.google.android.gms.internal.auth.zzcc.zzb
            if (r0 == 0) goto Lc
            goto L54
        Lc:
            java.lang.Class<com.google.android.gms.internal.auth.zzcc> r0 = com.google.android.gms.internal.auth.zzcc.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.auth.zzcc.zzb     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto L15
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            goto L54
        L15:
            r2 = 1
            r3 = 1
        L17:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L44
            android.os.UserManager r4 = com.google.android.gms.internal.auth.zzcc.zza     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L27
            java.lang.Object r4 = defpackage.g13.n(r7)     // Catch: java.lang.Throwable -> L51
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L51
            com.google.android.gms.internal.auth.zzcc.zza = r4     // Catch: java.lang.Throwable -> L51
        L27:
            android.os.UserManager r4 = com.google.android.gms.internal.auth.zzcc.zza     // Catch: java.lang.Throwable -> L51
            if (r4 != 0) goto L2d
            r7 = 1
            goto L49
        L2d:
            boolean r6 = defpackage.mw3.f(r4)     // Catch: java.lang.NullPointerException -> L3f java.lang.Throwable -> L51
            if (r6 != 0) goto L3d
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.NullPointerException -> L3f java.lang.Throwable -> L51
            boolean r7 = r4.isUserRunning(r6)     // Catch: java.lang.NullPointerException -> L3f java.lang.Throwable -> L51
            if (r7 != 0) goto L44
        L3d:
            r7 = 1
            goto L45
        L3f:
            com.google.android.gms.internal.auth.zzcc.zza = r5     // Catch: java.lang.Throwable -> L51
            int r3 = r3 + 1
            goto L17
        L44:
            r7 = 0
        L45:
            if (r7 == 0) goto L49
            com.google.android.gms.internal.auth.zzcc.zza = r5     // Catch: java.lang.Throwable -> L51
        L49:
            if (r7 == 0) goto L4d
            com.google.android.gms.internal.auth.zzcc.zzb = r2     // Catch: java.lang.Throwable -> L51
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            if (r7 != 0) goto L54
            return r2
        L51:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L51
            throw r7
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzcc.zza(android.content.Context):boolean");
    }

    public static boolean zzb() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
