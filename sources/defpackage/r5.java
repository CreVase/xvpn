package defpackage;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class r5 extends q5 implements r22 {
    public static final SparseIntArray J;
    public final AppCompatImageView A;
    public final LinearLayout B;
    public final TextView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final s22 F;
    public final s22 G;
    public final s22 H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.divider, 8);
        sparseIntArray.put(R.id.divider_1, 9);
        sparseIntArray.put(R.id.toolbar, 11);
        sparseIntArray.put(R.id.tv_flag_1, 12);
        sparseIntArray.put(R.id.tvTypeLeaveBrowser, 13);
        sparseIntArray.put(R.id.tvTypeDontClean, 14);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r5(android.view.View r15) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5.<init>(android.view.View):void");
    }

    @Override // defpackage.r22
    public final void d(int i) {
        boolean z = false;
        boolean z2 = true;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ut0 ut0Var = this.y;
                    if (ut0Var != null) {
                        z = true;
                    }
                    if (z) {
                        ut0Var.e(2);
                        return;
                    }
                    return;
                }
                return;
            }
            ut0 ut0Var2 = this.y;
            if (ut0Var2 != null) {
                z = true;
            }
            if (z) {
                ut0Var2.e(1);
                return;
            }
            return;
        }
        ut0 ut0Var3 = this.y;
        if (ut0Var3 == null) {
            z2 = false;
        }
        if (z2) {
            ut0Var3.e(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x008e  */
    @Override // defpackage.tl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5.f():void");
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.I != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }

    @Override // defpackage.q5
    public final void o(Boolean bool) {
        this.w = bool;
        synchronized (this) {
            this.I |= 1;
        }
        e(11);
        m();
    }

    @Override // defpackage.q5
    public final void p(Integer num) {
        this.x = num;
        synchronized (this) {
            this.I |= 2;
        }
        e(22);
        m();
    }
}
