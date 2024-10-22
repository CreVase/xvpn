package defpackage;

import android.widget.RelativeLayout;
import androidx.databinding.ObservableInt;

/* loaded from: classes2.dex */
public final class re1 extends qe1 {
    public final RelativeLayout v;
    public long w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public re1(android.view.View r6) {
        /*
            r5 = this;
            r0 = 4
            r1 = 0
            java.lang.Object[] r0 = defpackage.tl3.k(r6, r0, r1)
            r2 = 1
            r2 = r0[r2]
            androidx.appcompat.widget.AppCompatImageView r2 = (androidx.appcompat.widget.AppCompatImageView) r2
            r3 = 3
            r3 = r0[r3]
            com.security.xvpn.z35kb.XTextViewNew r3 = (com.security.xvpn.z35kb.XTextViewNew) r3
            r4 = 2
            r4 = r0[r4]
            com.security.xvpn.z35kb.XTextViewNew r4 = (com.security.xvpn.z35kb.XTextViewNew) r4
            r5.<init>(r6, r2, r3, r4)
            r2 = -1
            r5.w = r2
            androidx.appcompat.widget.AppCompatImageView r2 = r5.o
            r2.setTag(r1)
            r2 = 0
            r0 = r0[r2]
            android.widget.RelativeLayout r0 = (android.widget.RelativeLayout) r0
            r5.v = r0
            r0.setTag(r1)
            com.security.xvpn.z35kb.XTextViewNew r0 = r5.p
            r0.setTag(r1)
            com.security.xvpn.z35kb.XTextViewNew r0 = r5.q
            r0.setTag(r1)
            int r0 = defpackage.cf2.dataBinding
            r6.setTag(r0, r5)
            monitor-enter(r5)
            r0 = 8
            r5.w = r0     // Catch: java.lang.Throwable -> L44
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L44
            r5.m()
            return
        L44:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L44
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re1.<init>(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:            if (r0 != r7) goto L28;     */
    @Override // defpackage.tl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re1.f():void");
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.w != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.w |= 1;
        }
        return true;
    }

    @Override // defpackage.qe1
    public final void o(int i) {
        this.t = i;
        synchronized (this) {
            this.w |= 4;
        }
        e(10);
        m();
    }

    @Override // defpackage.qe1
    public final void p(ObservableInt observableInt) {
        n(0, observableInt);
        this.s = observableInt;
        synchronized (this) {
            this.w |= 1;
        }
        e(17);
        m();
    }
}
