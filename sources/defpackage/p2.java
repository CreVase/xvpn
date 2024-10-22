package defpackage;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class p2 implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final o2 f3767a;

    public p2(o2 o2Var) {
        this.f3767a = o2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        return this.f3767a.equals(((p2) obj).f3767a);
    }

    public final int hashCode() {
        return this.f3767a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        boolean z2;
        lo0 lo0Var = (lo0) ((z5) this.f3767a).f5428b;
        AutoCompleteTextView autoCompleteTextView = lo0Var.h;
        if (autoCompleteTextView != null) {
            int i = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z) {
                    i = 2;
                }
                WeakHashMap weakHashMap = ll3.f3151a;
                uk3.s(lo0Var.d, i);
            }
        }
    }
}
