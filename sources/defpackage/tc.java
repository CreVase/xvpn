package defpackage;

/* loaded from: classes.dex */
public final class tc implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jd f4484b;

    public /* synthetic */ tc(jd jdVar, int i) {
        this.f4483a = i;
        this.f4484b = jdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:            if (defpackage.xk3.c(r1) != false) goto L24;     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            r0 = 1
            int r1 = r6.f4483a
            r2 = 0
            jd r3 = r6.f4484b
            switch(r1) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L22
        La:
            int r1 = r3.l0
            r0 = r0 & r1
            if (r0 == 0) goto L12
            r3.D(r2)
        L12:
            int r0 = r3.l0
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L1d
            r0 = 108(0x6c, float:1.51E-43)
            r3.D(r0)
        L1d:
            r3.k0 = r2
            r3.l0 = r2
            return
        L22:
            android.widget.PopupWindow r1 = r3.w
            androidx.appcompat.widget.ActionBarContextView r4 = r3.v
            r5 = 55
            r1.showAtLocation(r4, r5, r2, r2)
            rm3 r1 = r3.y
            if (r1 == 0) goto L32
            r1.b()
        L32:
            boolean r1 = r3.z
            if (r1 == 0) goto L43
            android.view.ViewGroup r1 = r3.A
            if (r1 == 0) goto L43
            java.util.WeakHashMap r4 = defpackage.ll3.f3151a
            boolean r1 = defpackage.xk3.c(r1)
            if (r1 == 0) goto L43
            goto L44
        L43:
            r0 = 0
        L44:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L62
            androidx.appcompat.widget.ActionBarContextView r0 = r3.v
            r4 = 0
            r0.setAlpha(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.v
            rm3 r0 = defpackage.ll3.a(r0)
            r0.a(r1)
            r3.y = r0
            wc r1 = new wc
            r1.<init>(r6, r2)
            r0.d(r1)
            goto L6c
        L62:
            androidx.appcompat.widget.ActionBarContextView r0 = r3.v
            r0.setAlpha(r1)
            androidx.appcompat.widget.ActionBarContextView r0 = r3.v
            r0.setVisibility(r2)
        L6c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc.run():void");
    }
}
