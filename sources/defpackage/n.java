package defpackage;

/* loaded from: classes2.dex */
public final class n extends z33 implements l41 {
    public int e;
    public final /* synthetic */ o f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, c90 c90Var) {
        super(2, c90Var);
        this.f = oVar;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new n(this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0049  */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            ba0 r0 = defpackage.ba0.f430a
            int r1 = r5.e
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            defpackage.fl.a0(r6)
            goto L40
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            defpackage.fl.a0(r6)
            goto L30
        L1d:
            defpackage.fl.a0(r6)
            sh0 r6 = defpackage.vl0.c
            l r1 = new l
            r1.<init>(r4)
            r5.e = r3
            java.lang.Object r6 = defpackage.zf3.p0(r5, r6, r1)
            if (r6 != r0) goto L30
            return r0
        L30:
            sh0 r6 = defpackage.vl0.c
            m r1 = new m
            r1.<init>(r4)
            r5.e = r2
            java.lang.Object r6 = defpackage.zf3.p0(r5, r6, r1)
            if (r6 != r0) goto L40
            return r0
        L40:
            java.lang.String r6 = (java.lang.String) r6
            o r0 = r5.f
            androidx.appcompat.widget.AppCompatTextView r1 = r0.d
            if (r1 != 0) goto L49
            goto L4a
        L49:
            r4 = r1
        L4a:
            boolean r6 = defpackage.i23.b1(r6)
            if (r6 == 0) goto L52
            r6 = 0
            goto L54
        L52:
            r6 = 8
        L54:
            r4.setVisibility(r6)
            androidx.fragment.app.l r6 = r0.requireActivity()
            com.security.xvpn.z35kb.television.HomeActivity r6 = (com.security.xvpn.z35kb.television.HomeActivity) r6
            pe3 r6 = r6.R()
            yd3 r1 = defpackage.yd3.f5321a
            ws2 r6 = r6.d
            r6.o(r1)
            androidx.fragment.app.l r6 = r0.requireActivity()
            com.security.xvpn.z35kb.television.HomeActivity r6 = (com.security.xvpn.z35kb.television.HomeActivity) r6
            r6.N()
            ch3 r6 = defpackage.ch3.f636a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
