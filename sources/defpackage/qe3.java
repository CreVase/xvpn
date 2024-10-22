package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class qe3 extends eu3 implements vz0 {

    /* renamed from: b, reason: collision with root package name */
    public l41 f3987b;
    public x31 c;
    public View d;
    public l41 e;

    public qe3(Context context) {
        super(context, null, 4, 0);
    }

    @Override // defpackage.vz0
    public final void b() {
    }

    public final void c(boolean z) {
        x31 x31Var = this.c;
        if (x31Var != null) {
            x31Var.invoke(Boolean.valueOf(z));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = getChildAt(i);
            if (childAt instanceof v22) {
                bf3 bf3Var = (bf3) ((v22) childAt);
                if (hasFocus()) {
                    if (!bf3Var.isSelected()) {
                        bf3Var.setFocusable(true);
                    }
                } else if (!bf3Var.isSelected()) {
                    bf3Var.setFocusable(false);
                }
            }
        }
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        return super.focusSearch(i);
    }

    public final l41 getFocusSearchListener() {
        return this.e;
    }

    public final View getLastFocusChild() {
        return this.d;
    }

    @Override // defpackage.vz0
    public View getNextFocusedView() {
        View view = this.d;
        if (view == null) {
            return bx3.u(this);
        }
        return view;
    }

    public final l41 getOnChildFocusChange() {
        return this.f3987b;
    }

    public final x31 getOnSelfFocusChange() {
        return this.c;
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return super.isFocused();
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        qe3 qe3Var;
        super.requestChildFocus(view, view2);
        if (m20.L(this.d, view)) {
            return;
        }
        l41 l41Var = this.f3987b;
        if (l41Var != null) {
            l41Var.invoke(Integer.valueOf(indexOfChild(view)), view);
        }
        if (view instanceof qe3) {
            ((qe3) view).c(true);
        }
        View view3 = this.d;
        if (view3 instanceof qe3) {
            qe3Var = (qe3) view3;
        } else {
            qe3Var = null;
        }
        if (qe3Var != null) {
            qe3Var.c(m20.L(view3, view));
        }
        this.d = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        Object obj;
        Object obj2;
        boolean z;
        Iterator it = ew3.O0(this).iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                if (((View) obj2) instanceof vz0) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        View view = (View) obj2;
        if (view != null) {
            view.requestFocus();
            return true;
        }
        View view2 = this.d;
        if (view2 != null) {
            view2.requestFocus();
            return true;
        }
        Iterator it2 = ew3.O0(this).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            View view3 = (View) next;
            if (view3.isEnabled() && view3.isFocusable()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        View view4 = (View) obj;
        if (view4 != null) {
            view4.requestFocus();
            return true;
        }
        return super.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean restoreDefaultFocus() {
        return true;
    }

    public final void setFocusSearchListener(l41 l41Var) {
        this.e = l41Var;
    }

    public final void setLastFocusChild(View view) {
        this.d = view;
    }

    public final void setOnChildFocusChange(l41 l41Var) {
        this.f3987b = l41Var;
    }

    public final void setOnSelfFocusChange(x31 x31Var) {
        this.c = x31Var;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View view2;
        l41 l41Var = this.e;
        if (l41Var != null && (view2 = (View) l41Var.invoke(view, Integer.valueOf(i))) != null) {
            return view2;
        }
        View focusSearch = super.focusSearch(view, i);
        if (indexOfChild(view) == -1) {
            return focusSearch;
        }
        int indexOfChild = indexOfChild(focusSearch);
        if (getOrientation() == 1) {
            if ((i == 33 || i == 130) && indexOfChild == -1) {
                return null;
            }
        } else if (getOrientation() == 0 && ((i == 17 || i == 66) && indexOfChild == -1)) {
            return null;
        }
        return focusSearch;
    }
}
