package defpackage;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.TopicsManager;

/* loaded from: classes.dex */
public abstract class ia3 extends t9 {
    public final TopicsManager w;

    public ia3(TopicsManager topicsManager) {
        this.w = topicsManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007a A[LOOP:0: B:11:0x0074->B:13:0x007a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object O0(defpackage.ia3 r7, defpackage.s51 r8, defpackage.c90 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ha3
            if (r0 == 0) goto L13
            r0 = r9
            ha3 r0 = (defpackage.ha3) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ha3 r0 = new ha3
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.h
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ia3 r7 = r0.e
            defpackage.fl.a0(r9)
            goto L60
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.fl.a0(r9)
            android.adservices.topics.GetTopicsRequest r8 = r7.N0(r8)
            r0.e = r7
            r0.h = r3
            vu r9 = new vu
            c90 r0 = defpackage.t9.P(r0)
            r9.<init>(r3, r0)
            r9.s()
            zf r0 = new zf
            r2 = 8
            r0.<init>(r2)
            f90 r2 = new f90
            r2.<init>(r9)
            android.adservices.topics.TopicsManager r3 = r7.w
            defpackage.x2.t(r3, r8, r0, r2)
            java.lang.Object r9 = r9.r()
            if (r9 != r1) goto L60
            return r1
        L60:
            android.adservices.topics.GetTopicsResponse r8 = defpackage.x2.h(r9)
            r7.getClass()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.List r8 = defpackage.x2.o(r8)
            java.util.Iterator r8 = r8.iterator()
        L74:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L98
            java.lang.Object r9 = r8.next()
            android.adservices.topics.Topic r9 = defpackage.x2.i(r9)
            ba3 r6 = new ba3
            long r2 = defpackage.x2.b(r9)
            long r4 = defpackage.x2.u(r9)
            int r1 = defpackage.x2.a(r9)
            r0 = r6
            r0.<init>(r1, r2, r4)
            r7.add(r6)
            goto L74
        L98:
            t51 r8 = new t51
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia3.O0(ia3, s51, c90):java.lang.Object");
    }

    @Override // defpackage.t9
    public Object M(s51 s51Var, c90 c90Var) {
        return O0(this, s51Var, c90Var);
    }

    public GetTopicsRequest N0(s51 s51Var) {
        GetTopicsRequest.Builder adsSdkName;
        GetTopicsRequest build;
        adsSdkName = x2.d().setAdsSdkName(s51Var.f4274a);
        build = adsSdkName.build();
        return build;
    }
}
