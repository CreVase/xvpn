package defpackage;

/* loaded from: classes.dex */
public final class hv2 extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yv2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(yv2 yv2Var, c90 c90Var) {
        super(2, c90Var);
        this.g = yv2Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        hv2 hv2Var = new hv2(this.g, c90Var);
        hv2Var.f = obj;
        return hv2Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((hv2) create((dv2) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:            if (r7 == r0) goto L30;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0054, code lost:            if (r7 == r0) goto L30;     */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            ba0 r0 = defpackage.ba0.f430a
            int r1 = r6.e
            ch3 r2 = defpackage.ch3.f636a
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1b
            if (r1 == r4) goto L17
            if (r1 != r3) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            defpackage.fl.a0(r7)
            goto L7a
        L1b:
            defpackage.fl.a0(r7)
            java.lang.Object r7 = r6.f
            dv2 r7 = (defpackage.dv2) r7
            boolean r1 = r7 instanceof defpackage.bv2
            yv2 r5 = r6.g
            if (r1 == 0) goto L6b
            bv2 r7 = (defpackage.bv2) r7
            r6.e = r4
            b13 r1 = r5.g
            java.lang.Object r1 = r1.getValue()
            y03 r1 = (defpackage.y03) r1
            boolean r3 = r1 instanceof defpackage.kd0
            if (r3 == 0) goto L39
            goto L5b
        L39:
            boolean r3 = r1 instanceof defpackage.rg2
            if (r3 == 0) goto L48
            y03 r7 = r7.f535a
            if (r1 != r7) goto L5b
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L5b
            goto L5c
        L48:
            xg3 r7 = defpackage.xg3.f5156a
            boolean r7 = defpackage.m20.L(r1, r7)
            if (r7 == 0) goto L57
            java.lang.Object r7 = r5.f(r6)
            if (r7 != r0) goto L5b
            goto L5c
        L57:
            boolean r7 = r1 instanceof defpackage.kx0
            if (r7 != 0) goto L5f
        L5b:
            r7 = r2
        L5c:
            if (r7 != r0) goto L7a
            return r0
        L5f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Can't read in final state."
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L6b:
            boolean r1 = r7 instanceof defpackage.cv2
            if (r1 == 0) goto L7a
            cv2 r7 = (defpackage.cv2) r7
            r6.e = r3
            java.lang.Object r7 = defpackage.yv2.b(r5, r7, r6)
            if (r7 != r0) goto L7a
            return r0
        L7a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hv2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
