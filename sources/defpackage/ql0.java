package defpackage;

import a.bx;
import a.du;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final /* synthetic */ class ql0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rl0 f4016b;

    public /* synthetic */ ql0(rl0 rl0Var, int i) {
        this.f4015a = i;
        this.f4016b = rl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        String str;
        boolean z3;
        int i = this.f4015a;
        rl0 rl0Var = this.f4016b;
        boolean z4 = false;
        switch (i) {
            case 0:
                int i2 = rl0.n;
                rl0Var.dismissAllowingStateLoss();
                return;
            case 1:
                int i3 = rl0.n;
                rl0Var.dismissAllowingStateLoss();
                return;
            case 2:
                int i4 = rl0.n;
                pe0.c();
                rl0Var.dismissAllowingStateLoss();
                return;
            case 3:
                View view2 = rl0Var.i;
                if (view2 != null) {
                    view2.setSelected(false);
                }
                View view3 = rl0Var.j;
                if (view3 != null) {
                    view3.setSelected(true);
                }
                tf3.v0(rl0Var.g);
                tf3.V(rl0Var.f);
                tf3.V(rl0Var.h);
                tf3.v0(rl0Var.k);
                return;
            case 4:
                View view4 = rl0Var.i;
                if (view4 != null) {
                    view4.setSelected(true);
                }
                View view5 = rl0Var.j;
                if (view5 != null) {
                    view5.setSelected(false);
                }
                ViewGroup viewGroup = rl0Var.f;
                if (viewGroup != null) {
                    tf3.v0(viewGroup);
                }
                tf3.V(rl0Var.g);
                tf3.v0(rl0Var.h);
                tf3.v0(rl0Var.k);
                return;
            default:
                View view6 = rl0Var.i;
                if (view6 != null && !view6.isSelected()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    View view7 = rl0Var.j;
                    if (view7 != null && !view7.isSelected()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        return;
                    }
                }
                View view8 = rl0Var.d;
                if (view8 != null) {
                    tf3.v0(view8);
                }
                View view9 = rl0Var.e;
                if (view9 != null) {
                    tf3.V(view9);
                }
                View view10 = rl0Var.i;
                if (view10 != null && view10.isSelected()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str2 = "";
                if (z2) {
                    ViewGroup viewGroup2 = rl0Var.f;
                    str = "bad";
                    if (viewGroup2 != null) {
                        int childCount = viewGroup2.getChildCount();
                        for (int i5 = 0; i5 < childCount; i5++) {
                            View childAt = viewGroup2.getChildAt(i5);
                            if (childAt.isSelected() && (childAt instanceof TextView)) {
                                str2 = ((Object) str2) + rl0Var.l[i5] + ",";
                            }
                        }
                    }
                } else {
                    ViewGroup viewGroup3 = rl0Var.g;
                    str = "good";
                    if (viewGroup3 != null) {
                        int childCount2 = viewGroup3.getChildCount();
                        for (int i6 = 0; i6 < childCount2; i6++) {
                            View childAt2 = viewGroup3.getChildAt(i6);
                            if (childAt2.isSelected() && (childAt2 instanceof TextView)) {
                                str2 = ((Object) str2) + rl0Var.m[i6] + ",";
                            }
                        }
                    }
                }
                if (str2.length() == 0) {
                    z4 = true;
                }
                if (z4) {
                    str2 = "Unknown";
                }
                String j1 = i23.j1(",", str2);
                bx bxVar = new bx();
                bxVar.z(str);
                bxVar.z(j1);
                du.d(257, bxVar);
                bxVar.h();
                return;
        }
    }
}
