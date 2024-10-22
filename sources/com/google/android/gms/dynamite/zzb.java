package com.google.android.gms.dynamite;

/* loaded from: classes.dex */
public final class zzb {
    private static ClassLoader zza;
    private static Thread zzb;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008a, code lost:            if (r1 == null) goto L57;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader zza() {
        /*
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto La3
            java.lang.Thread r1 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> La7
            r2 = 0
            if (r1 != 0) goto L8f
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> La7
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> La7
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L1d
            r1 = r2
            goto L88
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> La7
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            r6 = 0
            r7 = 0
        L2b:
            if (r7 >= r4) goto L3f
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            if (r9 == 0) goto L3c
            goto L40
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r8 = r2
        L40:
            if (r8 != 0) goto L49
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
        L49:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
        L52:
            if (r6 >= r1) goto L66
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L7e java.lang.SecurityException -> L80
            if (r7 == 0) goto L63
            goto L67
        L63:
            int r6 = r6 + 1
            goto L52
        L66:
            r5 = r2
        L67:
            if (r5 != 0) goto L86
            com.google.android.gms.dynamite.zza r1 = new com.google.android.gms.dynamite.zza     // Catch: java.lang.SecurityException -> L7b java.lang.Throwable -> L7e
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.SecurityException -> L7b java.lang.Throwable -> L7e
            r1.setContextClassLoader(r2)     // Catch: java.lang.SecurityException -> L78 java.lang.Throwable -> L7e
            r1.start()     // Catch: java.lang.SecurityException -> L78 java.lang.Throwable -> L7e
            r5 = r1
            goto L86
        L78:
            r4 = move-exception
            r5 = r1
            goto L83
        L7b:
            r1 = move-exception
            r4 = r1
            goto L83
        L7e:
            r1 = move-exception
            goto L8d
        L80:
            r1 = move-exception
            r4 = r1
            r5 = r2
        L83:
            r4.getMessage()     // Catch: java.lang.Throwable -> L7e
        L86:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7e
            r1 = r5
        L88:
            com.google.android.gms.dynamite.zzb.zzb = r1     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L8f
            goto L9e
        L8d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7e
            throw r1     // Catch: java.lang.Throwable -> La7
        L8f:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> La7
            java.lang.Thread r3 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> L97 java.lang.SecurityException -> L99
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L97 java.lang.SecurityException -> L99
            goto L9d
        L97:
            r2 = move-exception
            goto La1
        L99:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L97
        L9d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
        L9e:
            com.google.android.gms.dynamite.zzb.zza = r2     // Catch: java.lang.Throwable -> La7
            goto La3
        La1:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L97
            throw r2     // Catch: java.lang.Throwable -> La7
        La3:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> La7
            monitor-exit(r0)
            return r1
        La7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.zzb.zza():java.lang.ClassLoader");
    }
}
