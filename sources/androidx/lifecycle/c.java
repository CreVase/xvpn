package androidx.lifecycle;

import defpackage.aa0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.ei2;
import defpackage.l41;
import defpackage.uj1;
import defpackage.vj1;
import defpackage.z33;

/* loaded from: classes.dex */
public final class c extends z33 implements l41 {
    public ei2 e;
    public ei2 f;
    public int g;
    public final /* synthetic */ vj1 h;
    public final /* synthetic */ uj1 i;
    public final /* synthetic */ aa0 j;
    public final /* synthetic */ l41 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vj1 vj1Var, uj1 uj1Var, aa0 aa0Var, l41 l41Var, c90 c90Var) {
        super(2, c90Var);
        this.h = vj1Var;
        this.i = uj1Var;
        this.j = aa0Var;
        this.k = l41Var;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new c(this.h, this.i, this.j, this.k, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            ba0 r0 = defpackage.ba0.f430a
            int r2 = r1.g
            ch3 r3 = defpackage.ch3.f636a
            vj1 r4 = r1.h
            r5 = 1
            if (r2 == 0) goto L22
            if (r2 != r5) goto L1a
            ei2 r2 = r1.f
            ei2 r5 = r1.e
            defpackage.fl.a0(r17)     // Catch: java.lang.Throwable -> L17
            goto L7a
        L17:
            r0 = move-exception
            goto L91
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L22:
            defpackage.fl.a0(r17)
            r2 = r4
            ck1 r2 = (defpackage.ck1) r2
            uj1 r2 = r2.d
            uj1 r6 = defpackage.uj1.DESTROYED
            if (r2 != r6) goto L2f
            return r3
        L2f:
            ei2 r2 = new ei2
            r2.<init>()
            ei2 r6 = new ei2
            r6.<init>()
            uj1 r7 = r1.i     // Catch: java.lang.Throwable -> L8e
            aa0 r10 = r1.j     // Catch: java.lang.Throwable -> L8e
            l41 r14 = r1.k     // Catch: java.lang.Throwable -> L8e
            r1.e = r2     // Catch: java.lang.Throwable -> L8e
            r1.f = r6     // Catch: java.lang.Throwable -> L8e
            r1.g = r5     // Catch: java.lang.Throwable -> L8e
            vu r15 = new vu     // Catch: java.lang.Throwable -> L8e
            c90 r8 = defpackage.t9.P(r16)     // Catch: java.lang.Throwable -> L8e
            r15.<init>(r5, r8)     // Catch: java.lang.Throwable -> L8e
            r15.s()     // Catch: java.lang.Throwable -> L8e
            rj1 r5 = defpackage.tj1.Companion     // Catch: java.lang.Throwable -> L8e
            r5.getClass()     // Catch: java.lang.Throwable -> L8e
            tj1 r8 = defpackage.rj1.b(r7)     // Catch: java.lang.Throwable -> L8e
            tj1 r11 = defpackage.rj1.a(r7)     // Catch: java.lang.Throwable -> L8e
            ky1 r13 = new ky1     // Catch: java.lang.Throwable -> L8e
            r5 = 0
            r13.<init>(r5)     // Catch: java.lang.Throwable -> L8e
            androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 r5 = new androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1     // Catch: java.lang.Throwable -> L8e
            r7 = r5
            r9 = r2
            r12 = r15
            r7.<init>()     // Catch: java.lang.Throwable -> L8e
            r6.f1938a = r5     // Catch: java.lang.Throwable -> L8e
            r4.a(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r5 = r15.r()     // Catch: java.lang.Throwable -> L8e
            if (r5 != r0) goto L78
            return r0
        L78:
            r5 = r2
            r2 = r6
        L7a:
            java.lang.Object r0 = r5.f1938a
            df1 r0 = (defpackage.df1) r0
            if (r0 == 0) goto L84
            r5 = 0
            r0.c(r5)
        L84:
            java.lang.Object r0 = r2.f1938a
            zj1 r0 = (defpackage.zj1) r0
            if (r0 == 0) goto L8d
            r4.b(r0)
        L8d:
            return r3
        L8e:
            r0 = move-exception
            r5 = r2
            r2 = r6
        L91:
            java.lang.Object r3 = r5.f1938a
            df1 r3 = (defpackage.df1) r3
            if (r3 == 0) goto L9b
            r5 = 0
            r3.c(r5)
        L9b:
            java.lang.Object r2 = r2.f1938a
            zj1 r2 = (defpackage.zj1) r2
            if (r2 == 0) goto La4
            r4.b(r2)
        La4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
