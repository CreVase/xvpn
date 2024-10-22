package defpackage;

/* loaded from: classes2.dex */
public final class qc0 extends z33 implements l41 {
    public int e;
    public int f;
    public /* synthetic */ Object g;

    public qc0(c90 c90Var) {
        super(2, c90Var);
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        qc0 qc0Var = new qc0(c90Var);
        qc0Var.g = obj;
        return qc0Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((qc0) create((iz0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0055 -> B:6:0x0058). Please report as a decompilation issue!!! */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            ba0 r0 = defpackage.ba0.f430a
            int r1 = r7.f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            int r1 = r7.e
            java.lang.Object r4 = r7.g
            iz0 r4 = (defpackage.iz0) r4
            defpackage.fl.a0(r8)
            r8 = r4
            r4 = r7
            goto L58
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            int r1 = r7.e
            java.lang.Object r4 = r7.g
            iz0 r4 = (defpackage.iz0) r4
            defpackage.fl.a0(r8)
            r8 = r4
            r4 = r7
            goto L49
        L2c:
            defpackage.fl.a0(r8)
            java.lang.Object r8 = r7.g
            iz0 r8 = (defpackage.iz0) r8
            r1 = 5
            r4 = r7
        L35:
            if (r1 <= 0) goto L5b
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            r4.g = r8
            r4.e = r1
            r4.f = r3
            java.lang.Object r5 = r8.b(r5, r4)
            if (r5 != r0) goto L49
            return r0
        L49:
            r4.g = r8
            r4.e = r1
            r4.f = r2
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = defpackage.t9.C(r5, r4)
            if (r5 != r0) goto L58
            return r0
        L58:
            int r1 = r1 + (-1)
            goto L35
        L5b:
            ch3 r8 = defpackage.ch3.f636a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qc0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
