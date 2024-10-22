package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.ju1;
import defpackage.jv1;
import defpackage.q23;
import defpackage.r93;
import defpackage.su1;
import defpackage.w10;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h implements jv1 {

    /* renamed from: a, reason: collision with root package name */
    public ju1 f179a;

    /* renamed from: b, reason: collision with root package name */
    public su1 f180b;
    public final /* synthetic */ Toolbar c;

    public h(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.jv1
    public final void a(ju1 ju1Var, boolean z) {
    }

    @Override // defpackage.jv1
    public final boolean c(q23 q23Var) {
        return false;
    }

    @Override // defpackage.jv1
    public final boolean d() {
        return false;
    }

    @Override // defpackage.jv1
    public final boolean e(su1 su1Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof w10) {
            ((w10) callback).e();
        }
        toolbar.removeView(toolbar.i);
        toolbar.removeView(toolbar.h);
        toolbar.i = null;
        ArrayList arrayList = toolbar.E;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.f180b = null;
                toolbar.requestLayout();
                su1Var.C = false;
                su1Var.n.p(false);
                toolbar.s();
                return true;
            }
        }
    }

    @Override // defpackage.jv1
    public final boolean g(su1 su1Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = su1Var.getActionView();
        toolbar.i = actionView;
        this.f180b = su1Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.i);
            }
            r93 r93Var = new r93();
            r93Var.f2700a = (toolbar.n & 112) | 8388611;
            r93Var.f4118b = 2;
            toolbar.i.setLayoutParams(r93Var);
            toolbar.addView(toolbar.i);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (((r93) childAt.getLayoutParams()).f4118b != 2 && childAt != toolbar.f170a) {
                toolbar.removeViewAt(childCount);
                toolbar.E.add(childAt);
            }
        }
        toolbar.requestLayout();
        su1Var.C = true;
        su1Var.n.p(false);
        KeyEvent.Callback callback = toolbar.i;
        if (callback instanceof w10) {
            ((w10) callback).d();
        }
        toolbar.s();
        return true;
    }

    @Override // defpackage.jv1
    public final void h() {
        if (this.f180b != null) {
            ju1 ju1Var = this.f179a;
            boolean z = false;
            if (ju1Var != null) {
                int size = ju1Var.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    if (this.f179a.getItem(i) == this.f180b) {
                        z = true;
                        break;
                    }
                    i++;
                }
            }
            if (!z) {
                e(this.f180b);
            }
        }
    }

    @Override // defpackage.jv1
    public final void j(Context context, ju1 ju1Var) {
        su1 su1Var;
        ju1 ju1Var2 = this.f179a;
        if (ju1Var2 != null && (su1Var = this.f180b) != null) {
            ju1Var2.d(su1Var);
        }
        this.f179a = ju1Var;
    }
}
