package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class gj0 extends bb3 {
    public static final String B0;
    public static final String C0;
    public static final String D0;
    public static final String E0;
    public static final String F0;
    public static final String G0;
    public static final String H0;
    public static final String I0;
    public static final String J0;
    public static final String K0;
    public static final String L0;
    public static final String M0;
    public static final String N0;
    public static final String O0;
    public static final String P0;
    public static final String Q0;
    public static final String R0;
    public final SparseBooleanArray A0;
    public final boolean m0;
    public final boolean n0;
    public final boolean o0;
    public final boolean p0;
    public final boolean q0;
    public final boolean r0;
    public final boolean s0;
    public final boolean t0;
    public final boolean u0;
    public final boolean v0;
    public final boolean w0;
    public final boolean x0;
    public final boolean y0;
    public final SparseArray z0;

    static {
        new gj0(new fj0());
        B0 = wi3.z(1000);
        C0 = wi3.z(1001);
        D0 = wi3.z(1002);
        E0 = wi3.z(1003);
        F0 = wi3.z(1004);
        G0 = wi3.z(WebSocketProtocol.CLOSE_NO_STATUS_CODE);
        H0 = wi3.z(1006);
        I0 = wi3.z(1007);
        J0 = wi3.z(1008);
        K0 = wi3.z(1009);
        L0 = wi3.z(1010);
        M0 = wi3.z(1011);
        N0 = wi3.z(1012);
        O0 = wi3.z(1013);
        P0 = wi3.z(1014);
        Q0 = wi3.z(1015);
        R0 = wi3.z(1016);
    }

    public gj0(fj0 fj0Var) {
        super(fj0Var);
        this.m0 = fj0Var.w;
        this.n0 = fj0Var.x;
        this.o0 = fj0Var.y;
        this.p0 = fj0Var.z;
        this.q0 = fj0Var.A;
        this.r0 = fj0Var.B;
        this.s0 = fj0Var.C;
        this.t0 = fj0Var.D;
        this.u0 = fj0Var.E;
        this.v0 = fj0Var.F;
        this.w0 = fj0Var.G;
        this.x0 = fj0Var.H;
        this.y0 = fj0Var.I;
        this.z0 = fj0Var.J;
        this.A0 = fj0Var.K;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f3 A[LOOP:0: B:47:0x009c->B:65:0x00f3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0099 A[SYNTHETIC] */
    @Override // defpackage.bb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj0.equals(java.lang.Object):boolean");
    }

    @Override // defpackage.bb3
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.m0 ? 1 : 0)) * 31) + (this.n0 ? 1 : 0)) * 31) + (this.o0 ? 1 : 0)) * 31) + (this.p0 ? 1 : 0)) * 31) + (this.q0 ? 1 : 0)) * 31) + (this.r0 ? 1 : 0)) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.u0 ? 1 : 0)) * 31) + (this.v0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0)) * 31) + (this.x0 ? 1 : 0)) * 31) + (this.y0 ? 1 : 0);
    }

    @Override // defpackage.bb3, defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putBoolean(B0, this.m0);
        bundle.putBoolean(C0, this.n0);
        bundle.putBoolean(D0, this.o0);
        bundle.putBoolean(P0, this.p0);
        bundle.putBoolean(E0, this.q0);
        bundle.putBoolean(F0, this.r0);
        bundle.putBoolean(G0, this.s0);
        bundle.putBoolean(H0, this.t0);
        bundle.putBoolean(Q0, this.u0);
        bundle.putBoolean(R0, this.v0);
        bundle.putBoolean(I0, this.w0);
        bundle.putBoolean(J0, this.x0);
        bundle.putBoolean(K0, this.y0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        int i = 0;
        while (true) {
            SparseArray sparseArray2 = this.z0;
            if (i >= sparseArray2.size()) {
                break;
            }
            int keyAt = sparseArray2.keyAt(i);
            for (Map.Entry entry : ((Map) sparseArray2.valueAt(i)).entrySet()) {
                hj0 hj0Var = (hj0) entry.getValue();
                if (hj0Var != null) {
                    sparseArray.put(arrayList2.size(), hj0Var);
                }
                arrayList2.add((va3) entry.getKey());
                arrayList.add(Integer.valueOf(keyAt));
            }
            bundle.putIntArray(L0, cp3.Q(arrayList));
            bundle.putParcelableArrayList(M0, cp3.R(arrayList2));
            SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray.size());
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray3.put(sparseArray.keyAt(i2), ((bs) sparseArray.valueAt(i2)).toBundle());
            }
            bundle.putSparseParcelableArray(N0, sparseArray3);
            i++;
        }
        SparseBooleanArray sparseBooleanArray = this.A0;
        int[] iArr = new int[sparseBooleanArray.size()];
        for (int i3 = 0; i3 < sparseBooleanArray.size(); i3++) {
            iArr[i3] = sparseBooleanArray.keyAt(i3);
        }
        bundle.putIntArray(O0, iArr);
        return bundle;
    }
}
