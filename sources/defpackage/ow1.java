package defpackage;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class ow1 {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f3740a;

    /* renamed from: b, reason: collision with root package name */
    public rf3 f3741b;

    public ow1(int i) {
        this.f3740a = new SparseArray(i);
    }

    public final void a(rf3 rf3Var, int i, int i2) {
        ow1 ow1Var;
        int a2 = rf3Var.a(i);
        SparseArray sparseArray = this.f3740a;
        if (sparseArray == null) {
            ow1Var = null;
        } else {
            ow1Var = (ow1) sparseArray.get(a2);
        }
        if (ow1Var == null) {
            ow1Var = new ow1(1);
            sparseArray.put(rf3Var.a(i), ow1Var);
        }
        if (i2 > i) {
            ow1Var.a(rf3Var, i + 1, i2);
        } else {
            ow1Var.f3741b = rf3Var;
        }
    }
}
