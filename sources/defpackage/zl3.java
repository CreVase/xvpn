package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class zl3 extends ok2 implements l41 {
    public ViewGroup f;
    public View g;
    public int h;
    public int i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ViewGroup l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl3(ViewGroup viewGroup, c90 c90Var) {
        super(2, c90Var);
        this.l = viewGroup;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        zl3 zl3Var = new zl3(this.l, c90Var);
        zl3Var.k = obj;
        return zl3Var;
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((zl3) create((gp2) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008d -> B:6:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0096 -> B:7:0x009a). Please report as a decompilation issue!!! */
    @Override // defpackage.mn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            ba0 r0 = defpackage.ba0.f430a
            int r1 = r12.j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r12.i
            int r4 = r12.h
            android.view.ViewGroup r5 = r12.f
            java.lang.Object r6 = r12.k
            gp2 r6 = (defpackage.gp2) r6
            defpackage.fl.a0(r13)
            r13 = r12
            goto L8f
        L1c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L24:
            int r1 = r12.i
            int r4 = r12.h
            android.view.View r5 = r12.g
            android.view.ViewGroup r6 = r12.f
            java.lang.Object r7 = r12.k
            gp2 r7 = (defpackage.gp2) r7
            defpackage.fl.a0(r13)
            r13 = r12
            goto L69
        L35:
            defpackage.fl.a0(r13)
            java.lang.Object r13 = r12.k
            gp2 r13 = (defpackage.gp2) r13
            android.view.ViewGroup r1 = r12.l
            int r4 = r1.getChildCount()
            r5 = 0
            r6 = r12
        L44:
            if (r5 >= r4) goto L9f
            android.view.View r7 = r1.getChildAt(r5)
            r6.k = r13
            r6.f = r1
            r6.g = r7
            r6.h = r5
            r6.i = r4
            r6.j = r3
            r13.f2299b = r7
            r8 = 3
            r13.f2298a = r8
            r13.d = r6
            ba0 r8 = defpackage.ba0.f430a
            if (r8 != r0) goto L62
            return r0
        L62:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r4
            r4 = r5
            r5 = r10
        L69:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L96
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            zl3 r8 = new zl3
            r9 = 0
            r8.<init>(r5, r9)
            yl3 r5 = new yl3
            r5.<init>(r8, r2)
            r13.k = r7
            r13.f = r6
            r13.g = r9
            r13.h = r4
            r13.i = r1
            r13.j = r2
            java.lang.Object r5 = r7.c(r5, r13)
            if (r5 != r0) goto L8d
            return r0
        L8d:
            r5 = r6
            r6 = r7
        L8f:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto L9a
        L96:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        L9a:
            int r4 = r4 + r3
            r10 = r5
            r5 = r4
            r4 = r10
            goto L44
        L9f:
            ch3 r13 = defpackage.ch3.f636a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
