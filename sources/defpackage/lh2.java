package defpackage;

import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class lh2 {

    /* renamed from: a, reason: collision with root package name */
    public b f3127a = null;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3128b = new ArrayList();
    public long c = 120;
    public long d = 120;
    public long e = 250;
    public long f = 250;

    public static void b(h hVar) {
        int i = hVar.j & 14;
        if (!hVar.m() && (i & 4) == 0) {
            hVar.d();
        }
    }

    public abstract boolean a(h hVar, h hVar2, kh2 kh2Var, kh2 kh2Var2);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(androidx.recyclerview.widget.h r10) {
        /*
            r9 = this;
            androidx.recyclerview.widget.b r0 = r9.f3127a
            if (r0 == 0) goto L9b
            r1 = 1
            r10.y(r1)
            androidx.recyclerview.widget.h r2 = r10.h
            r3 = 0
            if (r2 == 0) goto L13
            androidx.recyclerview.widget.h r2 = r10.i
            if (r2 != 0) goto L13
            r10.h = r3
        L13:
            r10.i = r3
            int r2 = r10.j
            r2 = r2 & 16
            r3 = 0
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r2 != 0) goto L9b
            androidx.recyclerview.widget.RecyclerView r0 = r0.f273a
            r0.i0()
            pz r2 = r0.f
            gw3 r4 = r2.f3943b
            androidx.recyclerview.widget.b r5 = r2.f3942a
            int r6 = r2.d
            android.view.View r7 = r10.f281a
            if (r6 != r1) goto L3f
            android.view.View r1 = r2.e
            if (r1 != r7) goto L37
            goto L65
        L37:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L3f:
            r8 = 2
            if (r6 == r8) goto L93
            r2.d = r8     // Catch: java.lang.Throwable -> L8f
            androidx.recyclerview.widget.RecyclerView r6 = r5.f273a     // Catch: java.lang.Throwable -> L8f
            int r6 = r6.indexOfChild(r7)     // Catch: java.lang.Throwable -> L8f
            r8 = -1
            if (r6 != r8) goto L51
            r2.k(r7)     // Catch: java.lang.Throwable -> L8f
            goto L60
        L51:
            boolean r8 = r4.d(r6)     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto L63
            r4.f(r6)     // Catch: java.lang.Throwable -> L8f
            r2.k(r7)     // Catch: java.lang.Throwable -> L8f
            r5.i(r6)     // Catch: java.lang.Throwable -> L8f
        L60:
            r2.d = r3
            goto L66
        L63:
            r2.d = r3
        L65:
            r1 = 0
        L66:
            if (r1 == 0) goto L7e
            androidx.recyclerview.widget.h r2 = androidx.recyclerview.widget.RecyclerView.M(r7)
            androidx.recyclerview.widget.e r4 = r0.c
            r4.m(r2)
            r4.j(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.M0
            if (r2 == 0) goto L7e
            java.util.Objects.toString(r7)
            r0.toString()
        L7e:
            r2 = r1 ^ 1
            r0.j0(r2)
            if (r1 != 0) goto L9b
            boolean r10 = r10.t()
            if (r10 == 0) goto L9b
            r0.removeDetachedView(r7, r3)
            goto L9b
        L8f:
            r10 = move-exception
            r2.d = r3
            throw r10
        L93:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh2.c(androidx.recyclerview.widget.h):void");
    }

    public abstract void d(h hVar);

    public abstract void e();

    public abstract boolean f();
}
