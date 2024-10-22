package defpackage;

/* loaded from: classes2.dex */
public final class in extends z33 implements l41 {
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kn g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in(kn knVar, c90 c90Var) {
        super(2, c90Var);
        this.g = knVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        in inVar = new in(this.g, c90Var);
        inVar.f = obj;
        return inVar;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((in) create((y82) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008e A[RETURN] */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            ba0 r0 = defpackage.ba0.f430a
            int r1 = r8.e
            r2 = 1
            r3 = 0
            r4 = 2
            kn r5 = r8.g
            if (r1 == 0) goto L24
            if (r1 == r2) goto L1c
            if (r1 != r4) goto L14
            defpackage.fl.a0(r9)
            goto L8f
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            java.lang.Object r1 = r8.f
            y82 r1 = (defpackage.y82) r1
            defpackage.fl.a0(r9)
            goto L4f
        L24:
            defpackage.fl.a0(r9)
            java.lang.Object r9 = r8.f
            r1 = r9
            y82 r1 = (defpackage.y82) r1
            qi0 r9 = defpackage.vl0.f4854a
            yo1 r9 = defpackage.zo1.f5522a
            hn r6 = new hn
            r6.<init>(r5, r1, r3)
            defpackage.zf3.T(r1, r9, r6, r4)
            java.lang.String r9 = r5.f2979b
            java.lang.String r6 = "AdInterstitial"
            boolean r9 = defpackage.m20.L(r9, r6)
            if (r9 == 0) goto L7d
            r8.f = r1
            r8.e = r2
            r6 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r9 = defpackage.t9.C(r6, r8)
            if (r9 != r0) goto L4f
            return r0
        L4f:
            boolean r9 = defpackage.pd0.F(r1)
            if (r9 == 0) goto L7d
            java.util.Stack r9 = defpackage.m7.f3248a
            boolean r2 = r9.isEmpty()
            r6 = 0
            if (r2 == 0) goto L5f
            goto L71
        L5f:
            java.lang.Object r9 = r9.lastElement()
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r2 = defpackage.m7.f3249b
            boolean r6 = defpackage.i23.q1(r9, r2, r6)
        L71:
            if (r6 == 0) goto L7d
            java.lang.String r9 = "ad show overtime"
            r5.c(r1, r9)
            java.lang.String r9 = r5.f2978a
            defpackage.ew3.l(r9)
        L7d:
            yy2 r9 = new yy2
            r2 = 8
            r9.<init>(r5, r2)
            r8.f = r3
            r8.e = r4
            java.lang.Object r9 = defpackage.t9.n(r1, r9, r8)
            if (r9 != r0) goto L8f
            return r0
        L8f:
            ch3 r9 = defpackage.ch3.f636a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
