package defpackage;

/* loaded from: classes.dex */
public final class lv2 implements gz0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3196a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3197b;

    public lv2(oz0 oz0Var) {
        this.f3197b = oz0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    @Override // defpackage.gz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.iz0 r8, defpackage.c90 r9) {
        /*
            r7 = this;
            ch3 r0 = defpackage.ch3.f636a
            int r1 = r7.f3196a
            java.lang.Object r2 = r7.f3197b
            switch(r1) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L1c
        La:
            gz0 r2 = (defpackage.gz0) r2
            kv2 r1 = new kv2
            r3 = 0
            r1.<init>(r8, r3)
            java.lang.Object r8 = r2.a(r1, r9)
            ba0 r9 = defpackage.ba0.f430a
            if (r8 != r9) goto L1b
            r0 = r8
        L1b:
            return r0
        L1c:
            boolean r1 = r9 instanceof defpackage.y
            if (r1 == 0) goto L2f
            r1 = r9
            y r1 = (defpackage.y) r1
            int r3 = r1.h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L2f
            int r3 = r3 - r4
            r1.h = r3
            goto L34
        L2f:
            y r1 = new y
            r1.<init>(r7, r9)
        L34:
            java.lang.Object r9 = r1.f
            ba0 r3 = defpackage.ba0.f430a
            int r4 = r1.h
            r5 = 1
            if (r4 == 0) goto L4f
            if (r4 != r5) goto L47
            bm2 r8 = r1.e
            defpackage.fl.a0(r9)     // Catch: java.lang.Throwable -> L45
            goto L6e
        L45:
            r9 = move-exception
            goto L76
        L47:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4f:
            defpackage.fl.a0(r9)
            bm2 r9 = new bm2
            t90 r4 = r1.getContext()
            r9.<init>(r8, r4)
            r1.e = r9     // Catch: java.lang.Throwable -> L72
            r1.h = r5     // Catch: java.lang.Throwable -> L72
            l41 r2 = (defpackage.l41) r2     // Catch: java.lang.Throwable -> L72
            java.lang.Object r8 = r2.invoke(r9, r1)     // Catch: java.lang.Throwable -> L72
            if (r8 != r3) goto L68
            goto L69
        L68:
            r8 = r0
        L69:
            if (r8 != r3) goto L6d
            r0 = r3
            goto L71
        L6d:
            r8 = r9
        L6e:
            r8.releaseIntercepted()
        L71:
            return r0
        L72:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L76:
            r8.releaseIntercepted()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lv2.a(iz0, c90):java.lang.Object");
    }

    public lv2(l41 l41Var) {
        this.f3197b = l41Var;
    }
}
