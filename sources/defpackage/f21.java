package defpackage;

import android.text.TextUtils;
import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class f21 extends e21 {
    public static final SparseIntArray B;
    public long A;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        B = sparseIntArray;
        sparseIntArray.put(R.id.input_panel, 5);
        sparseIntArray.put(R.id.fl_et_email, 6);
        sparseIntArray.put(R.id.fl_et_password, 7);
        sparseIntArray.put(R.id.tv_forget_password, 8);
        sparseIntArray.put(R.id.btn_sign_in, 9);
        sparseIntArray.put(R.id.tv_create_account, 10);
        sparseIntArray.put(R.id.container, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public f21(android.view.View r14) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = defpackage.f21.B
            r1 = 12
            java.lang.Object[] r0 = defpackage.tl3.k(r14, r1, r0)
            r1 = 9
            r1 = r0[r1]
            r4 = r1
            android.widget.Button r4 = (android.widget.Button) r4
            r1 = 11
            r1 = r0[r1]
            androidx.fragment.app.FragmentContainerView r1 = (androidx.fragment.app.FragmentContainerView) r1
            r1 = 1
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.AppCompatEditText r5 = (androidx.appcompat.widget.AppCompatEditText) r5
            r1 = 3
            r1 = r0[r1]
            r6 = r1
            android.widget.EditText r6 = (android.widget.EditText) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            r1 = 7
            r1 = r0[r1]
            r8 = r1
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r1 = 5
            r1 = r0[r1]
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1 = 10
            r1 = r0[r1]
            r9 = r1
            androidx.appcompat.widget.AppCompatTextView r9 = (androidx.appcompat.widget.AppCompatTextView) r9
            r1 = 2
            r1 = r0[r1]
            r10 = r1
            androidx.appcompat.widget.AppCompatTextView r10 = (androidx.appcompat.widget.AppCompatTextView) r10
            r1 = 8
            r1 = r0[r1]
            r11 = r1
            androidx.appcompat.widget.AppCompatTextView r11 = (androidx.appcompat.widget.AppCompatTextView) r11
            r1 = 4
            r1 = r0[r1]
            r12 = r1
            android.widget.TextView r12 = (android.widget.TextView) r12
            r2 = r13
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.A = r1
            androidx.appcompat.widget.AppCompatEditText r1 = r13.p
            r2 = 0
            r1.setTag(r2)
            android.widget.EditText r1 = r13.q
            r1.setTag(r2)
            r1 = 0
            r0 = r0[r1]
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setTag(r2)
            androidx.appcompat.widget.AppCompatTextView r0 = r13.u
            r0.setTag(r2)
            android.widget.TextView r0 = r13.w
            r0.setTag(r2)
            int r0 = defpackage.cf2.dataBinding
            r14.setTag(r0, r13)
            monitor-enter(r13)
            r0 = 4
            r13.A = r0     // Catch: java.lang.Throwable -> L81
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L81
            r13.m()
            return
        L81:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L81
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f21.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        long j;
        boolean z;
        int i;
        long j2;
        long j3;
        synchronized (this) {
            j = this.A;
            this.A = 0L;
        }
        String str = this.y;
        String str2 = this.x;
        long j4 = j & 5;
        int i2 = 4;
        boolean z2 = false;
        if (j4 != 0) {
            boolean isEmpty = TextUtils.isEmpty(str);
            if (j4 != 0) {
                if (isEmpty) {
                    j3 = 16;
                } else {
                    j3 = 8;
                }
                j |= j3;
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
        long j5 = j & 6;
        if (j5 != 0) {
            boolean isEmpty2 = TextUtils.isEmpty(str2);
            if (j5 != 0) {
                if (isEmpty2) {
                    j2 = 64;
                } else {
                    j2 = 32;
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
        if ((6 & j) != 0) {
            this.p.setSelected(z2);
            pe0.R(this.u, str2);
            this.u.setVisibility(i2);
        }
        if ((j & 5) != 0) {
            this.q.setSelected(z);
            pe0.R(this.w, str);
            this.w.setVisibility(i);
        }
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.A != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }

    @Override // defpackage.e21
    public final void o(String str) {
        this.x = str;
        synchronized (this) {
            this.A |= 2;
        }
        e(6);
        m();
    }

    @Override // defpackage.e21
    public final void p(String str) {
        this.y = str;
        synchronized (this) {
            this.A |= 1;
        }
        e(16);
        m();
    }
}
