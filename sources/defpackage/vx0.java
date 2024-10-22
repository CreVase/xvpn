package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class vx0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wx0 f4909b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ vx0(wx0 wx0Var, boolean z, int i) {
        this.f4908a = i;
        this.f4909b = wx0Var;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0060  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r8 = this;
            int r0 = r8.f4908a
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            goto La4
        L7:
            wx0 r0 = r8.f4909b
            boolean r1 = r8.c
            r0.getClass()
            java.lang.Object r2 = defpackage.wx0.m
            monitor-enter(r2)
            px0 r3 = r0.f5081a     // Catch: java.lang.Throwable -> La1
            r3.a()     // Catch: java.lang.Throwable -> La1
            android.content.Context r3 = r3.f3931a     // Catch: java.lang.Throwable -> La1
            uy0 r3 = defpackage.uy0.e(r3)     // Catch: java.lang.Throwable -> La1
            uy0 r4 = r0.c     // Catch: java.lang.Throwable -> L9a
            bm r4 = r4.o()     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L27
            r3.p()     // Catch: java.lang.Throwable -> La1
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
            c52 r2 = defpackage.c52.REGISTER_ERROR     // Catch: defpackage.yx0 -> L95
            c52 r3 = r4.f487b     // Catch: defpackage.yx0 -> L95
            r5 = 1
            r6 = 0
            if (r3 != r2) goto L32
            r7 = 1
            goto L33
        L32:
            r7 = 0
        L33:
            if (r7 != 0) goto L4e
            c52 r7 = defpackage.c52.UNREGISTERED     // Catch: defpackage.yx0 -> L95
            if (r3 != r7) goto L3b
            r3 = 1
            goto L3c
        L3b:
            r3 = 0
        L3c:
            if (r3 == 0) goto L3f
            goto L4e
        L3f:
            if (r1 != 0) goto L49
            zi3 r1 = r0.d     // Catch: defpackage.yx0 -> L95
            boolean r1 = r1.b(r4)     // Catch: defpackage.yx0 -> L95
            if (r1 == 0) goto L99
        L49:
            bm r1 = r0.c(r4)     // Catch: defpackage.yx0 -> L95
            goto L52
        L4e:
            bm r1 = r0.i(r4)     // Catch: defpackage.yx0 -> L95
        L52:
            r0.f(r1)
            r0.m(r4, r1)
            c52 r3 = defpackage.c52.REGISTERED
            c52 r4 = r1.f487b
            if (r4 != r3) goto L60
            r3 = 1
            goto L61
        L60:
            r3 = 0
        L61:
            if (r3 == 0) goto L68
            java.lang.String r3 = r1.f486a
            r0.l(r3)
        L68:
            c52 r3 = r1.f487b
            if (r3 != r2) goto L6e
            r2 = 1
            goto L6f
        L6e:
            r2 = 0
        L6f:
            if (r2 == 0) goto L7a
            yx0 r1 = new yx0
            r1.<init>()
            r0.j(r1)
            goto L99
        L7a:
            c52 r2 = defpackage.c52.NOT_GENERATED
            if (r3 == r2) goto L84
            c52 r2 = defpackage.c52.ATTEMPT_MIGRATION
            if (r3 != r2) goto L83
            goto L84
        L83:
            r5 = 0
        L84:
            if (r5 == 0) goto L91
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r1.<init>(r2)
            r0.j(r1)
            goto L99
        L91:
            r0.k(r1)
            goto L99
        L95:
            r1 = move-exception
            r0.j(r1)
        L99:
            return
        L9a:
            r0 = move-exception
            if (r3 == 0) goto La0
            r3.p()     // Catch: java.lang.Throwable -> La1
        La0:
            throw r0     // Catch: java.lang.Throwable -> La1
        La1:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La1
            throw r0
        La4:
            wx0 r0 = r8.f4909b
            boolean r1 = r8.c
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx0.run():void");
    }
}
