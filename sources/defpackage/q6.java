package defpackage;

import android.util.SparseIntArray;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class q6 extends p6 {
    public static final SparseIntArray p0;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final TextView R;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final TextView h0;
    public final TextView i0;
    public final TextView j0;
    public final TextView k0;
    public final TextView l0;
    public final TextView m0;
    public final TextView n0;
    public long o0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p0 = sparseIntArray;
        sparseIntArray.put(R.id.scrollView, 27);
        sparseIntArray.put(R.id.tvTitle, 28);
        sparseIntArray.put(R.id.space0, 29);
        sparseIntArray.put(R.id.vFeatures, 30);
        sparseIntArray.put(R.id.guideColumn1, 31);
        sparseIntArray.put(R.id.guideColumn2, 32);
        sparseIntArray.put(R.id.guideColumn3, 33);
        sparseIntArray.put(R.id.space1, 34);
        sparseIntArray.put(R.id.list_container, 35);
        sparseIntArray.put(R.id.mList, 36);
        sparseIntArray.put(R.id.space2, 37);
        sparseIntArray.put(R.id.btn_sign_in, 38);
        sparseIntArray.put(R.id.dot, 39);
        sparseIntArray.put(R.id.btn_restore, 40);
        sparseIntArray.put(R.id.space3, 41);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public q6(android.view.View r27) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6.<init>(android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00fe, code lost:            if (android.text.TextUtils.equals(((defpackage.z82) r0.f.get(r10)).f5443b, defpackage.t60.f4456a) == false) goto L54;     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0062  */
    @Override // defpackage.tl3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 579
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q6.f():void");
    }

    @Override // defpackage.tl3
    public final boolean h() {
        synchronized (this) {
            if (this.o0 != 0) {
                return true;
            }
            return false;
        }
    }

    @Override // defpackage.tl3
    public final boolean l(int i, int i2, Object obj) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return o(i2);
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.o0 |= 1;
        }
        return true;
    }

    public final boolean o(int i) {
        if (i == 0) {
            synchronized (this) {
                this.o0 |= 2;
            }
            return true;
        }
        if (i == 17) {
            synchronized (this) {
                this.o0 |= 1;
            }
            return true;
        }
        return false;
    }
}
