package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.e;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ai2 extends l2 {
    public final bi2 d;
    public final WeakHashMap e = new WeakHashMap();

    public ai2(bi2 bi2Var) {
        this.d = bi2Var;
    }

    @Override // defpackage.l2
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        l2 l2Var = (l2) this.e.get(view);
        if (l2Var != null) {
            return l2Var.a(view, accessibilityEvent);
        }
        return super.a(view, accessibilityEvent);
    }

    @Override // defpackage.l2
    public final v51 b(View view) {
        l2 l2Var = (l2) this.e.get(view);
        if (l2Var != null) {
            return l2Var.b(view);
        }
        return super.b(view);
    }

    @Override // defpackage.l2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        l2 l2Var = (l2) this.e.get(view);
        if (l2Var != null) {
            l2Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        boolean z;
        bi2 bi2Var = this.d;
        RecyclerView recyclerView = bi2Var.d;
        if (recyclerView.u && !recyclerView.C && !recyclerView.e.g()) {
            z = false;
        } else {
            z = true;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        if (!z) {
            RecyclerView recyclerView2 = bi2Var.d;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().T(view, g3Var);
                l2 l2Var = (l2) this.e.get(view);
                if (l2Var != null) {
                    l2Var.d(view, g3Var);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // defpackage.l2
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        l2 l2Var = (l2) this.e.get(view);
        if (l2Var != null) {
            l2Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.l2
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        l2 l2Var = (l2) this.e.get(viewGroup);
        if (l2Var != null) {
            return l2Var.f(viewGroup, view, accessibilityEvent);
        }
        return super.f(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.l2
    public final boolean g(View view, int i, Bundle bundle) {
        boolean z;
        bi2 bi2Var = this.d;
        RecyclerView recyclerView = bi2Var.d;
        if (recyclerView.u && !recyclerView.C && !recyclerView.e.g()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RecyclerView recyclerView2 = bi2Var.d;
            if (recyclerView2.getLayoutManager() != null) {
                l2 l2Var = (l2) this.e.get(view);
                if (l2Var != null) {
                    if (l2Var.g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i, bundle)) {
                    return true;
                }
                e eVar = recyclerView2.getLayoutManager().f275b.c;
                return false;
            }
        }
        return super.g(view, i, bundle);
    }

    @Override // defpackage.l2
    public final void h(View view, int i) {
        l2 l2Var = (l2) this.e.get(view);
        if (l2Var != null) {
            l2Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.l2
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        l2 l2Var = (l2) this.e.get(view);
        if (l2Var != null) {
            l2Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
