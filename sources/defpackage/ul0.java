package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public abstract class ul0 extends f63 {
    public int c;

    public ul0(int i) {
        super(0L, m63.g);
        this.c = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract c90 c();

    public Throwable d(Object obj) {
        d30 d30Var;
        if (obj instanceof d30) {
            d30Var = (d30) obj;
        } else {
            d30Var = null;
        }
        if (d30Var == null) {
            return null;
        }
        return d30Var.f1723a;
    }

    public Object g(Object obj) {
        return obj;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            bx3.h(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        zf3.H(c().getContext(), new ko3("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:            r7 = (defpackage.df1) r7.get(defpackage.d5.g);     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r13 = this;
            ch3 r0 = defpackage.ch3.f636a
            os r1 = r13.f2051b
            c90 r2 = r13.c()     // Catch: java.lang.Throwable -> L9d
            sl0 r2 = (defpackage.sl0) r2     // Catch: java.lang.Throwable -> L9d
            c90 r3 = r2.e     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = r2.g     // Catch: java.lang.Throwable -> L9d
            t90 r4 = r3.getContext()     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r2 = defpackage.zf3.o0(r4, r2)     // Catch: java.lang.Throwable -> L9d
            pq0 r5 = defpackage.zf3.g     // Catch: java.lang.Throwable -> L9d
            r6 = 0
            if (r2 == r5) goto L20
            zg3 r5 = defpackage.t9.K0(r3, r4, r2)     // Catch: java.lang.Throwable -> L9d
            goto L21
        L20:
            r5 = r6
        L21:
            t90 r7 = r3.getContext()     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r8 = r13.j()     // Catch: java.lang.Throwable -> L5f
            java.lang.Throwable r9 = r13.d(r8)     // Catch: java.lang.Throwable -> L5f
            if (r9 != 0) goto L44
            int r10 = r13.c     // Catch: java.lang.Throwable -> L5f
            r11 = 1
            if (r10 == r11) goto L39
            r12 = 2
            if (r10 != r12) goto L38
            goto L39
        L38:
            r11 = 0
        L39:
            if (r11 == 0) goto L44
            d5 r10 = defpackage.d5.g     // Catch: java.lang.Throwable -> L5f
            r90 r7 = r7.get(r10)     // Catch: java.lang.Throwable -> L5f
            df1 r7 = (defpackage.df1) r7     // Catch: java.lang.Throwable -> L5f
            goto L45
        L44:
            r7 = r6
        L45:
            if (r7 == 0) goto L61
            boolean r10 = r7.a()     // Catch: java.lang.Throwable -> L5f
            if (r10 != 0) goto L61
            nf1 r7 = (defpackage.nf1) r7     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.CancellationException r7 = r7.A()     // Catch: java.lang.Throwable -> L5f
            r13.b(r8, r7)     // Catch: java.lang.Throwable -> L5f
            pk2 r8 = new pk2     // Catch: java.lang.Throwable -> L5f
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5f
            r3.resumeWith(r8)     // Catch: java.lang.Throwable -> L5f
            goto L73
        L5f:
            r3 = move-exception
            goto L91
        L61:
            if (r9 == 0) goto L6c
            pk2 r7 = new pk2     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r9)     // Catch: java.lang.Throwable -> L5f
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L5f
            goto L73
        L6c:
            java.lang.Object r7 = r13.g(r8)     // Catch: java.lang.Throwable -> L5f
            r3.resumeWith(r7)     // Catch: java.lang.Throwable -> L5f
        L73:
            if (r5 == 0) goto L7b
            boolean r3 = r5.Z()     // Catch: java.lang.Throwable -> L9d
            if (r3 == 0) goto L7e
        L7b:
            defpackage.zf3.e0(r4, r2)     // Catch: java.lang.Throwable -> L9d
        L7e:
            r1.getClass()     // Catch: java.lang.Throwable -> L82
            goto L89
        L82:
            r0 = move-exception
            pk2 r1 = new pk2
            r1.<init>(r0)
            r0 = r1
        L89:
            java.lang.Throwable r0 = defpackage.qk2.a(r0)
            r13.h(r6, r0)
            goto Lb0
        L91:
            if (r5 == 0) goto L99
            boolean r5 = r5.Z()     // Catch: java.lang.Throwable -> L9d
            if (r5 == 0) goto L9c
        L99:
            defpackage.zf3.e0(r4, r2)     // Catch: java.lang.Throwable -> L9d
        L9c:
            throw r3     // Catch: java.lang.Throwable -> L9d
        L9d:
            r2 = move-exception
            r1.getClass()     // Catch: java.lang.Throwable -> La2
            goto La9
        La2:
            r0 = move-exception
            pk2 r1 = new pk2
            r1.<init>(r0)
            r0 = r1
        La9:
            java.lang.Throwable r0 = defpackage.qk2.a(r0)
            r13.h(r2, r0)
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ul0.run():void");
    }
}
