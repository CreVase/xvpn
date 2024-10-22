package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class u6 extends t6 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.btnBack, 6);
        sparseIntArray.put(R.id.contentPanel, 7);
        sparseIntArray.put(R.id.submit_btn, 8);
        sparseIntArray.put(R.id.vToSingin, 9);
        sparseIntArray.put(R.id.tvRememberPasswordTips, 10);
        sparseIntArray.put(R.id.click_to_sign_in, 11);
        sparseIntArray.put(R.id.tvSuccessInfo, 12);
        sparseIntArray.put(R.id.btn_to_home_page, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public u6(android.view.View r18) {
        /*
            r17 = this;
            r15 = r17
            r0 = r18
            android.util.SparseIntArray r1 = defpackage.u6.E
            r2 = 14
            java.lang.Object[] r16 = defpackage.tl3.k(r0, r2, r1)
            r1 = 6
            r1 = r16[r1]
            r3 = r1
            androidx.appcompat.widget.AppCompatImageView r3 = (androidx.appcompat.widget.AppCompatImageView) r3
            r1 = 13
            r1 = r16[r1]
            r4 = r1
            com.security.xvpn.z35kb.widget.XButton r4 = (com.security.xvpn.z35kb.widget.XButton) r4
            r1 = 11
            r1 = r16[r1]
            r5 = r1
            com.security.xvpn.z35kb.XTextViewNew r5 = (com.security.xvpn.z35kb.XTextViewNew) r5
            r1 = 7
            r1 = r16[r1]
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r1 = 2
            r1 = r16[r1]
            r7 = r1
            com.security.xvpn.z35kb.widget.XEditText r7 = (com.security.xvpn.z35kb.widget.XEditText) r7
            r1 = 1
            r1 = r16[r1]
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 8
            r1 = r16[r1]
            r9 = r1
            com.security.xvpn.z35kb.widget.XButton r9 = (com.security.xvpn.z35kb.widget.XButton) r9
            r1 = 4
            r1 = r16[r1]
            r10 = r1
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r1 = 3
            r1 = r16[r1]
            r11 = r1
            com.security.xvpn.z35kb.XTextViewNew r11 = (com.security.xvpn.z35kb.XTextViewNew) r11
            r1 = 10
            r1 = r16[r1]
            r12 = r1
            com.security.xvpn.z35kb.XTextViewNew r12 = (com.security.xvpn.z35kb.XTextViewNew) r12
            r1 = 12
            r1 = r16[r1]
            r13 = r1
            com.security.xvpn.z35kb.XTextViewNew r13 = (com.security.xvpn.z35kb.XTextViewNew) r13
            r1 = 9
            r1 = r16[r1]
            r14 = r1
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r1 = r17
            r2 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = -1
            r15.D = r1
            com.security.xvpn.z35kb.widget.XEditText r1 = r15.s
            r2 = 0
            r1.setTag(r2)
            android.widget.LinearLayout r1 = r15.t
            r1.setTag(r2)
            r1 = 0
            r1 = r16[r1]
            com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout r1 = (com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout) r1
            r1.setTag(r2)
            r1 = 5
            r1 = r16[r1]
            if (r1 == 0) goto L82
            android.view.View r1 = (android.view.View) r1
            defpackage.x30.a(r1)
        L82:
            android.widget.LinearLayout r1 = r15.v
            r1.setTag(r2)
            com.security.xvpn.z35kb.XTextViewNew r1 = r15.w
            r1.setTag(r2)
            int r1 = defpackage.cf2.dataBinding
            r0.setTag(r1, r15)
            monitor-enter(r17)
            r0 = 4
            r15.D = r0     // Catch: java.lang.Throwable -> L9b
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L9b
            r17.m()
            return
        L9b:
            r0 = move-exception
            monitor-exit(r17)     // Catch: java.lang.Throwable -> L9b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u6.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        long j;
        boolean z;
        int i;
        long j2;
        long j3;
        long j4;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        String str = this.A;
        boolean z2 = this.B;
        long j5 = j & 5;
        int i2 = 4;
        int i3 = 0;
        if (j5 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (j5 != 0) {
                if (isEmpty) {
                    j4 = 64;
                } else {
                    j4 = 32;
                }
                j |= j4;
            }
            if (isEmpty) {
                i = 4;
            } else {
                i = 0;
            }
            z = !isEmpty;
        } else {
            z = false;
            i = 0;
        }
        long j6 = j & 6;
        if (j6 != 0) {
            if (j6 != 0) {
                if (z2) {
                    j2 = j | 16;
                    j3 = 256;
                } else {
                    j2 = j | 8;
                    j3 = 128;
                }
                j = j2 | j3;
            }
            if (z2) {
                i2 = 0;
            }
            if (z2) {
                i3 = 8;
            }
        } else {
            i2 = 0;
        }
        if ((j & 5) != 0) {
            this.s.setSelected(z);
            pe0.R(this.w, str);
            this.w.setVisibility(i);
        }
        if ((j & 6) != 0) {
            this.t.setVisibility(i3);
            this.v.setVisibility(i2);
        }
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.D != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }

    @Override // defpackage.t6
    public final void o(String str) {
        this.A = str;
        synchronized (this) {
            this.D |= 1;
        }
        e(16);
        m();
    }
}
