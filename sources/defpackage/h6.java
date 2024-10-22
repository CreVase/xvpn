package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class h6 extends g6 {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.status_bar_mask, 5);
        sparseIntArray.put(R.id.btnBack, 6);
        sparseIntArray.put(R.id.contentPanel, 7);
        sparseIntArray.put(R.id.ll_username_container, 8);
        sparseIntArray.put(R.id.ll_et_verification_code, 9);
        sparseIntArray.put(R.id.tv_send_verification_code, 10);
        sparseIntArray.put(R.id.submit_btn, 11);
        sparseIntArray.put(R.id.vToSignIn, 12);
        sparseIntArray.put(R.id.click_to_sign_in, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h6(android.view.View r15) {
        /*
            r14 = this;
            android.util.SparseIntArray r0 = defpackage.h6.C
            r1 = 14
            java.lang.Object[] r0 = defpackage.tl3.k(r15, r1, r0)
            r1 = 6
            r1 = r0[r1]
            r4 = r1
            androidx.appcompat.widget.AppCompatImageView r4 = (androidx.appcompat.widget.AppCompatImageView) r4
            r1 = 13
            r1 = r0[r1]
            android.widget.TextView r1 = (android.widget.TextView) r1
            r1 = 7
            r1 = r0[r1]
            r5 = r1
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r1 = 1
            r1 = r0[r1]
            r6 = r1
            android.widget.EditText r6 = (android.widget.EditText) r6
            r1 = 3
            r1 = r0[r1]
            r7 = r1
            android.widget.EditText r7 = (android.widget.EditText) r7
            r1 = 9
            r1 = r0[r1]
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 8
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 5
            r1 = r0[r1]
            android.widget.Space r1 = (android.widget.Space) r1
            r1 = 11
            r1 = r0[r1]
            r9 = r1
            android.widget.Button r9 = (android.widget.Button) r9
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            com.security.xvpn.z35kb.XTextViewNew r10 = (com.security.xvpn.z35kb.XTextViewNew) r10
            r1 = 4
            r1 = r0[r1]
            r11 = r1
            com.security.xvpn.z35kb.XTextViewNew r11 = (com.security.xvpn.z35kb.XTextViewNew) r11
            r1 = 10
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r1 = 12
            r1 = r0[r1]
            r13 = r1
            android.widget.LinearLayout r13 = (android.widget.LinearLayout) r13
            r2 = r14
            r3 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.B = r1
            android.widget.EditText r1 = r14.q
            r2 = 0
            r1.setTag(r2)
            android.widget.EditText r1 = r14.r
            r1.setTag(r2)
            r1 = 0
            r0 = r0[r1]
            com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout r0 = (com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout) r0
            r0.setTag(r2)
            com.security.xvpn.z35kb.XTextViewNew r0 = r14.u
            r0.setTag(r2)
            com.security.xvpn.z35kb.XTextViewNew r0 = r14.v
            r0.setTag(r2)
            int r0 = defpackage.cf2.dataBinding
            r15.setTag(r0, r14)
            monitor-enter(r14)
            r0 = 8
            r14.B = r0     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8e
            r14.m()
            return
        L8e:
            r15 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L8e
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h6.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        long j;
        int i;
        boolean z;
        long j2;
        long j3;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        String str = this.y;
        String str2 = this.z;
        long j4 = j & 9;
        int i2 = 4;
        boolean z2 = false;
        if (j4 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (j4 != 0) {
                if (isEmpty) {
                    j3 = 32;
                } else {
                    j3 = 16;
                }
                j |= j3;
            }
            z = !isEmpty;
            if (isEmpty) {
                i = 4;
            } else {
                i = 0;
            }
        } else {
            i = 0;
            z = false;
        }
        long j5 = j & 10;
        if (j5 != 0) {
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            if (j5 != 0) {
                if (isEmpty2) {
                    j2 = 128;
                } else {
                    j2 = 64;
                }
                j |= j2;
            }
            boolean z3 = !isEmpty2;
            if (!isEmpty2) {
                i2 = 0;
            }
            z2 = z3;
        } else {
            i2 = 0;
        }
        if ((9 & j) != 0) {
            this.q.setSelected(z);
            pe0.R(this.u, str);
            this.u.setVisibility(i);
        }
        if ((j & 10) != 0) {
            this.r.setSelected(z2);
            pe0.R(this.v, str2);
            this.v.setVisibility(i2);
        }
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.B != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }

    @Override // defpackage.g6
    public final void o(String str) {
        this.z = str;
        synchronized (this) {
            this.B |= 2;
        }
        e(2);
        m();
    }

    @Override // defpackage.g6
    public final void p(String str) {
        this.y = str;
        synchronized (this) {
            this.B |= 1;
        }
        e(6);
        m();
    }
}
