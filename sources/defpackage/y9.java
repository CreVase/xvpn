package defpackage;

/* loaded from: classes2.dex */
public final class y9 extends ji1 implements l41 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9(Object obj, int i) {
        super(2);
        this.f = i;
        this.g = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    @Override // defpackage.l41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.f
            r1 = 0
            java.lang.Object r2 = r4.g
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L9;
                default: goto L8;
            }
        L8:
            goto L6f
        L9:
            android.view.View r5 = (android.view.View) r5
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            xa2 r2 = (defpackage.xa2) r2
            androidx.appcompat.widget.AppCompatEditText r0 = r2.j
            boolean r0 = defpackage.m20.L(r5, r0)
            if (r0 != 0) goto L23
            du3 r0 = r2.m
            boolean r5 = defpackage.m20.L(r5, r0)
            if (r5 == 0) goto L29
        L23:
            r5 = 130(0x82, float:1.82E-43)
            if (r6 != r5) goto L29
            du3 r1 = r2.l
        L29:
            return r1
        L2a:
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            a.bx r6 = new a.bx
            r6.<init>()
            r6.v(r5)
            r5 = 527(0x20f, float:7.38E-43)
            a.du.d(r5, r6)
            r6.h()
            com.security.xvpn.z35kb.accelerateApp.AllAppActivity r2 = (com.security.xvpn.z35kb.accelerateApp.AllAppActivity) r2
            r5 = 526(0x20e, float:7.37E-43)
            a.bx r5 = defpackage.hx2.i(r5)
            boolean r6 = r5.q()
            r5.h()
            r2.r = r6
            java.util.ArrayList r5 = r2.q
            r5.clear()
            java.util.List r0 = r2.o
            java.util.List r1 = r2.p
            java.lang.String r3 = r2.s
            java.util.ArrayList r6 = r2.c0(r0, r1, r6, r3)
            r5.addAll(r6)
            li1 r5 = r2.n
            if (r5 == 0) goto L6c
            r5.f()
        L6c:
            ch3 r5 = defpackage.ch3.f636a
            return r5
        L6f:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            r90 r6 = (defpackage.r90) r6
            s90 r0 = r6.getKey()
            bm2 r2 = (defpackage.bm2) r2
            t90 r2 = r2.f
            r90 r2 = r2.get(r0)
            d5 r3 = defpackage.d5.g
            if (r0 == r3) goto L93
            if (r6 == r2) goto L8c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L8e
        L8c:
            int r5 = r5 + 1
        L8e:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto Lad
        L93:
            df1 r2 = (defpackage.df1) r2
            df1 r6 = (defpackage.df1) r6
        L97:
            if (r6 != 0) goto L9a
            goto La2
        L9a:
            if (r6 != r2) goto L9d
            goto La1
        L9d:
            boolean r0 = r6 instanceof defpackage.tn2
            if (r0 != 0) goto Ld3
        La1:
            r1 = r6
        La2:
            if (r1 != r2) goto Lae
            if (r2 != 0) goto La7
            goto La9
        La7:
            int r5 = r5 + 1
        La9:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        Lad:
            return r5
        Lae:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of "
            r6.<init>(r0)
            r6.append(r1)
            java.lang.String r0 = ", expected child of "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'"
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Ld3:
            nf1 r6 = (defpackage.nf1) r6
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.nf1.f3452b
            java.lang.Object r6 = r0.get(r6)
            nz r6 = (defpackage.nz) r6
            if (r6 == 0) goto Le4
            df1 r6 = r6.getParent()
            goto L97
        Le4:
            r6 = r1
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y9.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
