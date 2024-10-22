package defpackage;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes2.dex */
public abstract class mm3 extends h90 {

    /* renamed from: a, reason: collision with root package name */
    public nm3 f3317a;

    /* renamed from: b, reason: collision with root package name */
    public int f3318b;

    public mm3() {
        this.f3318b = 0;
    }

    @Override // defpackage.h90
    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        u(coordinatorLayout, view, i);
        if (this.f3317a == null) {
            this.f3317a = new nm3(view);
        }
        nm3 nm3Var = this.f3317a;
        View view2 = nm3Var.f3491a;
        nm3Var.f3492b = view2.getTop();
        nm3Var.c = view2.getLeft();
        this.f3317a.a();
        int i2 = this.f3318b;
        if (i2 != 0) {
            nm3 nm3Var2 = this.f3317a;
            if (nm3Var2.d != i2) {
                nm3Var2.d = i2;
                nm3Var2.a();
            }
            this.f3318b = 0;
            return true;
        }
        return true;
    }

    public final int t() {
        nm3 nm3Var = this.f3317a;
        if (nm3Var != null) {
            return nm3Var.d;
        }
        return 0;
    }

    public void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }

    public mm3(int i) {
        super(0);
        this.f3318b = 0;
    }
}
