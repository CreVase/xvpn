package defpackage;

import a.du;
import android.util.SparseIntArray;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.view.b;

/* loaded from: classes2.dex */
public final class il0 extends hl0 implements r22 {
    public static final SparseIntArray G;
    public final s22 E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.ll_bottom_panel, 11);
        sparseIntArray.put(R.id.sv, 12);
        sparseIntArray.put(R.id.tv_flag_2, 13);
        sparseIntArray.put(R.id.btn_sign_in, 14);
        sparseIntArray.put(R.id.dot, 15);
        sparseIntArray.put(R.id.btn_restore, 16);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public il0(android.view.View r21) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.<init>(android.view.View):void");
    }

    @Override // defpackage.r22
    public final void d(int i) {
        boolean z;
        b bVar = this.C;
        if (bVar != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            s61 s61Var = bVar.f;
            String str = t60.f4456a;
            s61Var.c();
            if (bVar.e == 22) {
                du.d(636, null);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il0.f():void");
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.F != 0) {
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
        if (i2 == 0) {
            synchronized (this) {
                this.F |= 1;
            }
        } else {
            if (i2 != 20) {
                return false;
            }
            synchronized (this) {
                this.F |= 2;
            }
        }
        return true;
    }
}
