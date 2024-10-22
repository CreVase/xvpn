package defpackage;

import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class si1 extends ri1 {
    public static final SparseIntArray r;
    public long q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        r = sparseIntArray;
        sparseIntArray.put(R.id.item_ad_min_root_admob_wrapper, 1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public si1(android.view.View r4) {
        /*
            r3 = this;
            android.util.SparseIntArray r0 = defpackage.si1.r
            r1 = 2
            java.lang.Object[] r0 = defpackage.tl3.k(r4, r1, r0)
            r1 = 0
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r2 = 1
            r0 = r0[r2]
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.<init>(r4, r1, r0)
            r0 = -1
            r3.q = r0
            android.widget.LinearLayout r0 = r3.o
            r1 = 0
            r0.setTag(r1)
            int r0 = defpackage.cf2.dataBinding
            r4.setTag(r0, r3)
            monitor-enter(r3)
            r0 = 4
            r3.q = r0     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            r3.m()
            return
        L2d:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.si1.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        synchronized (this) {
            this.q = 0L;
        }
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.q != 0) {
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
