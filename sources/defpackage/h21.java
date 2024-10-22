package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class h21 extends g21 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.fl_et_email, 7);
        sparseIntArray.put(R.id.fl_et_password, 8);
        sparseIntArray.put(R.id.btn_sign_up, 9);
        sparseIntArray.put(R.id.tvPrivacyPolicy, 10);
        sparseIntArray.put(R.id.ll_hint_container, 11);
        sparseIntArray.put(R.id.text1, 12);
        sparseIntArray.put(R.id.tv_2_sign_in, 13);
        sparseIntArray.put(R.id.container, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h21(android.view.View r17) {
        /*
            r16 = this;
            r14 = r16
            r0 = r17
            android.util.SparseIntArray r1 = defpackage.h21.D
            r2 = 15
            java.lang.Object[] r15 = defpackage.tl3.k(r0, r2, r1)
            r1 = 9
            r1 = r15[r1]
            r3 = r1
            android.widget.Button r3 = (android.widget.Button) r3
            r1 = 14
            r1 = r15[r1]
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            r1 = 2
            r1 = r15[r1]
            r4 = r1
            androidx.appcompat.widget.AppCompatEditText r4 = (androidx.appcompat.widget.AppCompatEditText) r4
            r1 = 4
            r1 = r15[r1]
            r5 = r1
            com.security.xvpn.z35kb.widget.XEditText r5 = (com.security.xvpn.z35kb.widget.XEditText) r5
            r1 = 7
            r1 = r15[r1]
            r6 = r1
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r1 = 8
            r1 = r15[r1]
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r1 = 1
            r1 = r15[r1]
            r8 = r1
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r1 = 11
            r1 = r15[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 12
            r1 = r15[r1]
            r9 = r1
            android.widget.TextView r9 = (android.widget.TextView) r9
            r1 = 13
            r1 = r15[r1]
            r10 = r1
            android.widget.TextView r10 = (android.widget.TextView) r10
            r1 = 3
            r1 = r15[r1]
            r11 = r1
            com.security.xvpn.z35kb.XTextViewNew r11 = (com.security.xvpn.z35kb.XTextViewNew) r11
            r1 = 5
            r1 = r15[r1]
            r12 = r1
            com.security.xvpn.z35kb.XTextViewNew r12 = (com.security.xvpn.z35kb.XTextViewNew) r12
            r1 = 10
            r1 = r15[r1]
            r13 = r1
            android.widget.TextView r13 = (android.widget.TextView) r13
            r1 = r16
            r2 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = -1
            r14.C = r1
            androidx.appcompat.widget.AppCompatEditText r1 = r14.p
            r2 = 0
            r1.setTag(r2)
            com.security.xvpn.z35kb.widget.XEditText r1 = r14.q
            r1.setTag(r2)
            android.widget.LinearLayout r1 = r14.t
            r1.setTag(r2)
            r1 = 0
            r1 = r15[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setTag(r2)
            r1 = 6
            r1 = r15[r1]
            if (r1 == 0) goto L8c
            android.view.View r1 = (android.view.View) r1
            defpackage.x30.a(r1)
        L8c:
            com.security.xvpn.z35kb.XTextViewNew r1 = r14.w
            r1.setTag(r2)
            com.security.xvpn.z35kb.XTextViewNew r1 = r14.x
            r1.setTag(r2)
            int r1 = defpackage.cf2.dataBinding
            r0.setTag(r1, r14)
            monitor-enter(r16)
            r0 = 4
            r14.C = r0     // Catch: java.lang.Throwable -> La5
            monitor-exit(r16)     // Catch: java.lang.Throwable -> La5
            r16.m()
            return
        La5:
            r0 = move-exception
            monitor-exit(r16)     // Catch: java.lang.Throwable -> La5
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h21.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        long j;
        int i;
        boolean z;
        long j2;
        long j3;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        String str = this.z;
        String str2 = this.A;
        long j4 = j & 5;
        int i2 = 4;
        boolean z2 = false;
        if (j4 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (j4 != 0) {
                if (isEmpty) {
                    j3 = 64;
                } else {
                    j3 = 32;
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
        long j5 = j & 6;
        if (j5 != 0) {
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            if (j5 != 0) {
                if (isEmpty2) {
                    j2 = 16;
                } else {
                    j2 = 8;
                }
                j |= j2;
            }
            if (!isEmpty2) {
                i2 = 0;
            }
            z2 = !isEmpty2;
        } else {
            i2 = 0;
        }
        if ((5 & j) != 0) {
            this.p.setSelected(z);
            pe0.R(this.w, str);
            this.w.setVisibility(i);
        }
        if ((j & 6) != 0) {
            this.q.setSelected(z2);
            pe0.R(this.x, str2);
            this.x.setVisibility(i2);
        }
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.C != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }

    @Override // defpackage.g21
    public final void o(String str) {
        this.z = str;
        synchronized (this) {
            this.C |= 1;
        }
        e(6);
        m();
    }

    @Override // defpackage.g21
    public final void p(String str) {
        this.A = str;
        synchronized (this) {
            this.C |= 2;
        }
        e(16);
        m();
    }
}
