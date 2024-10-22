package defpackage;

import android.util.SparseIntArray;
import android.widget.LinearLayout;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class p5 extends o5 {
    public static final SparseIntArray L;
    public final LinearLayout I;
    public final LinearLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.btnBack, 14);
        sparseIntArray.put(R.id.contentPanel, 15);
        sparseIntArray.put(R.id.tvSuccessInfo, 16);
        sparseIntArray.put(R.id.btn_to_sign_in, 17);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p5(android.view.View r20) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5.<init>(android.view.View):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.tl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p5.f():void");
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.K != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        return false;
    }

    @Override // defpackage.o5
    public final void o(String str) {
        this.F = str;
        synchronized (this) {
            this.K |= 4;
        }
        e(13);
        m();
    }

    @Override // defpackage.o5
    public final void p(String str) {
        this.E = str;
        synchronized (this) {
            this.K |= 2;
        }
        e(14);
        m();
    }

    @Override // defpackage.o5
    public final void q(String str) {
        this.D = str;
        synchronized (this) {
            this.K |= 1;
        }
        e(15);
        m();
    }
}
