package defpackage;

import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class g7 extends f7 {
    public static final SparseIntArray v;
    public long u;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        v = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 1);
        sparseIntArray.put(R.id.tv_search_engine_duckduckgo, 2);
        sparseIntArray.put(R.id.tv_search_engine_bing, 3);
        sparseIntArray.put(R.id.tv_search_engine_google, 4);
        sparseIntArray.put(R.id.tv_search_engine_amazon, 5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public g7(android.view.View r10) {
        /*
            r9 = this;
            android.util.SparseIntArray r0 = defpackage.g7.v
            r1 = 6
            java.lang.Object[] r0 = defpackage.tl3.k(r10, r1, r0)
            r1 = 1
            r1 = r0[r1]
            r4 = r1
            com.security.xvpn.z35kb.widget.Toolbar r4 = (com.security.xvpn.z35kb.widget.Toolbar) r4
            r1 = 5
            r1 = r0[r1]
            r5 = r1
            com.security.xvpn.z35kb.XTextViewNew r5 = (com.security.xvpn.z35kb.XTextViewNew) r5
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            com.security.xvpn.z35kb.XTextViewNew r6 = (com.security.xvpn.z35kb.XTextViewNew) r6
            r1 = 2
            r1 = r0[r1]
            r7 = r1
            com.security.xvpn.z35kb.XTextViewNew r7 = (com.security.xvpn.z35kb.XTextViewNew) r7
            r1 = 4
            r1 = r0[r1]
            r8 = r1
            com.security.xvpn.z35kb.XTextViewNew r8 = (com.security.xvpn.z35kb.XTextViewNew) r8
            r2 = r9
            r3 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1 = -1
            r9.u = r1
            r1 = 0
            r0 = r0[r1]
            com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout r0 = (com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout) r0
            r1 = 0
            r0.setTag(r1)
            int r0 = defpackage.cf2.dataBinding
            r10.setTag(r0, r9)
            monitor-enter(r9)
            r0 = 1
            r9.u = r0     // Catch: java.lang.Throwable -> L46
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            r9.m()
            return
        L46:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L46
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g7.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        synchronized (this) {
            this.u = 0L;
        }
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.u != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }
}
