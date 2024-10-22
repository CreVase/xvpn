package defpackage;

/* loaded from: classes2.dex */
public final class kp2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2994a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f2995b;
    public final /* synthetic */ lp2 c;

    public kp2(lp2 lp2Var, Runnable runnable) {
        this.c = lp2Var;
        this.f2995b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0048, code lost:            r1 = r1 | java.lang.Thread.interrupted();     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:            r10.f2995b.run();     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0070, code lost:            r10.f2995b = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:            throw r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:            r3 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:            defpackage.lp2.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f2995b, (java.lang.Throwable) r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
        L2:
            lp2 r2 = r10.c     // Catch: java.lang.Throwable -> L76
            java.util.ArrayDeque r2 = r2.f3170b     // Catch: java.lang.Throwable -> L76
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L76
            r3 = 1
            if (r0 != 0) goto L26
            lp2 r0 = r10.c     // Catch: java.lang.Throwable -> L73
            int r4 = r0.c     // Catch: java.lang.Throwable -> L73
            r5 = 4
            if (r4 != r5) goto L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            long r6 = r0.d     // Catch: java.lang.Throwable -> L73
            r8 = 1
            long r6 = r6 + r8
            r0.d = r6     // Catch: java.lang.Throwable -> L73
            r0.c = r5     // Catch: java.lang.Throwable -> L73
            r0 = 1
        L26:
            lp2 r4 = r10.c     // Catch: java.lang.Throwable -> L73
            java.util.ArrayDeque r4 = r4.f3170b     // Catch: java.lang.Throwable -> L73
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L73
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L73
            r10.f2995b = r4     // Catch: java.lang.Throwable -> L73
            if (r4 != 0) goto L43
            lp2 r0 = r10.c     // Catch: java.lang.Throwable -> L73
            r0.c = r3     // Catch: java.lang.Throwable -> L73
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            if (r1 == 0) goto L42
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L42:
            return
        L43:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L76
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.f2995b     // Catch: java.lang.Throwable -> L50 java.lang.RuntimeException -> L52
            r3.run()     // Catch: java.lang.Throwable -> L50 java.lang.RuntimeException -> L52
            goto L6d
        L50:
            r0 = move-exception
            goto L70
        L52:
            r3 = move-exception
            java.util.logging.Logger r4 = defpackage.lp2.f     // Catch: java.lang.Throwable -> L50
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r6.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.Runnable r7 = r10.f2995b     // Catch: java.lang.Throwable -> L50
            r6.append(r7)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L50
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L50
        L6d:
            r10.f2995b = r2     // Catch: java.lang.Throwable -> L76
            goto L2
        L70:
            r10.f2995b = r2     // Catch: java.lang.Throwable -> L76
            throw r0     // Catch: java.lang.Throwable -> L76
        L73:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            if (r1 == 0) goto L80
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L80:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp2.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2994a) {
            case 0:
                this.f2995b.run();
                return;
            default:
                try {
                    a();
                    return;
                } catch (Error e) {
                    synchronized (this.c.f3170b) {
                        this.c.c = 1;
                        throw e;
                    }
                }
        }
    }

    public final String toString() {
        switch (this.f2994a) {
            case 0:
                return this.f2995b.toString();
            default:
                Runnable runnable = this.f2995b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                return "SequentialExecutorWorker{state=" + p71.E(this.c.c) + "}";
        }
    }

    public kp2(lp2 lp2Var) {
        this.c = lp2Var;
    }

    public /* synthetic */ kp2(lp2 lp2Var, int i) {
        this(lp2Var);
    }
}
