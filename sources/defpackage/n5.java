package defpackage;

import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public final class n5 extends m5 {
    public static final SparseIntArray D;
    public final XTextViewNew A;
    public final XTextViewNew B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.flag_search_engine, 6);
        sparseIntArray.put(R.id.ll_search_engine, 7);
        sparseIntArray.put(R.id.flag_private, 8);
        sparseIntArray.put(R.id.tv_clean_history, 9);
        sparseIntArray.put(R.id.flag_block_ads_container, 10);
        sparseIntArray.put(R.id.tv_block_ads, 11);
        sparseIntArray.put(R.id.tv_block_ads_desc, 12);
        sparseIntArray.put(R.id.btn_switch_block_ads, 13);
        sparseIntArray.put(R.id.flag_block_tracker_container, 14);
        sparseIntArray.put(R.id.tv_block_ads_tracker, 15);
        sparseIntArray.put(R.id.btn_switch_block_tracker, 16);
        sparseIntArray.put(R.id.tv_block_ads_tracker_desc, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public n5(android.view.View r14) {
        /*
            r13 = this;
            android.util.SparseIntArray r0 = defpackage.n5.D
            r1 = 18
            java.lang.Object[] r0 = defpackage.tl3.k(r14, r1, r0)
            r1 = 13
            r1 = r0[r1]
            r4 = r1
            androidx.appcompat.widget.SwitchCompat r4 = (androidx.appcompat.widget.SwitchCompat) r4
            r1 = 16
            r1 = r0[r1]
            r5 = r1
            androidx.appcompat.widget.SwitchCompat r5 = (androidx.appcompat.widget.SwitchCompat) r5
            r1 = 10
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 14
            r1 = r0[r1]
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            r1 = 8
            r1 = r0[r1]
            r6 = r1
            com.security.xvpn.z35kb.XTextViewNew r6 = (com.security.xvpn.z35kb.XTextViewNew) r6
            r1 = 6
            r1 = r0[r1]
            r7 = r1
            com.security.xvpn.z35kb.XTextViewNew r7 = (com.security.xvpn.z35kb.XTextViewNew) r7
            r1 = 1
            r1 = r0[r1]
            r8 = r1
            androidx.appcompat.widget.AppCompatImageView r8 = (androidx.appcompat.widget.AppCompatImageView) r8
            r1 = 7
            r1 = r0[r1]
            r9 = r1
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r1 = 5
            r1 = r0[r1]
            r10 = r1
            com.security.xvpn.z35kb.widget.Toolbar r10 = (com.security.xvpn.z35kb.widget.Toolbar) r10
            r1 = 11
            r1 = r0[r1]
            com.security.xvpn.z35kb.XTextViewNew r1 = (com.security.xvpn.z35kb.XTextViewNew) r1
            r1 = 12
            r1 = r0[r1]
            com.security.xvpn.z35kb.XTextViewNew r1 = (com.security.xvpn.z35kb.XTextViewNew) r1
            r1 = 15
            r1 = r0[r1]
            com.security.xvpn.z35kb.XTextViewNew r1 = (com.security.xvpn.z35kb.XTextViewNew) r1
            r1 = 17
            r1 = r0[r1]
            com.security.xvpn.z35kb.XTextViewNew r1 = (com.security.xvpn.z35kb.XTextViewNew) r1
            r1 = 9
            r1 = r0[r1]
            r11 = r1
            com.security.xvpn.z35kb.XTextViewNew r11 = (com.security.xvpn.z35kb.XTextViewNew) r11
            r1 = 2
            r1 = r0[r1]
            r12 = r1
            com.security.xvpn.z35kb.XTextViewNew r12 = (com.security.xvpn.z35kb.XTextViewNew) r12
            r2 = r13
            r3 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = -1
            r13.C = r1
            androidx.appcompat.widget.AppCompatImageView r1 = r13.s
            r2 = 0
            r1.setTag(r2)
            r1 = 0
            r1 = r0[r1]
            com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout r1 = (com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout) r1
            r1.setTag(r2)
            r1 = 3
            r1 = r0[r1]
            com.security.xvpn.z35kb.XTextViewNew r1 = (com.security.xvpn.z35kb.XTextViewNew) r1
            r13.A = r1
            r1.setTag(r2)
            r1 = 4
            r0 = r0[r1]
            com.security.xvpn.z35kb.XTextViewNew r0 = (com.security.xvpn.z35kb.XTextViewNew) r0
            r13.B = r0
            r0.setTag(r2)
            com.security.xvpn.z35kb.XTextViewNew r0 = r13.w
            r0.setTag(r2)
            int r0 = defpackage.cf2.dataBinding
            r14.setTag(r0, r13)
            monitor-enter(r13)
            r0 = 4
            r13.C = r0     // Catch: java.lang.Throwable -> La5
            monitor-exit(r13)     // Catch: java.lang.Throwable -> La5
            r13.m()
            return
        La5:
            r14 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> La5
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n5.<init>(android.view.View):void");
    }

    @Override // defpackage.tl3
    public final void f() {
        long j;
        String str;
        int i;
        boolean booleanValue;
        long j2;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        vp vpVar = this.y;
        Boolean bool = this.x;
        int i2 = 0;
        if ((j & 5) != 0 && vpVar != null) {
            i = vpVar.f4875b;
            str = vpVar.f4874a;
            if (str == null) {
                str = "";
            }
        } else {
            str = null;
            i = 0;
        }
        long j3 = j & 6;
        if (j3 != 0) {
            if (bool == null) {
                booleanValue = false;
            } else {
                booleanValue = bool.booleanValue();
            }
            if (j3 != 0) {
                if (booleanValue) {
                    j2 = 16;
                } else {
                    j2 = 8;
                }
                j |= j2;
            }
            if (!booleanValue) {
                i2 = 8;
            }
        }
        if ((j & 5) != 0) {
            this.s.setImageResource(i);
            pe0.R(this.w, str);
        }
        if ((j & 6) != 0) {
            this.A.setVisibility(i2);
            this.B.setVisibility(i2);
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
}
