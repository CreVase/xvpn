package defpackage;

import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class wd3 extends eu3 {

    /* renamed from: b, reason: collision with root package name */
    public View f4989b;
    public vz0 c;

    public wd3(Context context) {
        super(context, null, 0);
        setOrientation(0);
        setLayoutTransition(new LayoutTransition());
    }

    @Override // android.view.View
    public final View focusSearch(int i) {
        Object obj;
        boolean hasFocus = ew3.M0(this, 0).hasFocus();
        View focusSearch = super.focusSearch(i);
        if (hasFocus && ((ViewGroup) ew3.M0(this, 0)).indexOfChild(focusSearch) != -1) {
            return focusSearch;
        }
        if (!hasFocus && ((ViewGroup) ew3.M0(this, 0)).indexOfChild(focusSearch) == -1) {
            vz0 v = bx3.v(focusSearch);
            this.c = v;
            return v != null ? v.getNextFocusedView() : focusSearch;
        }
        ViewGroup viewGroup = (ViewGroup) ew3.M0(this, 0);
        if (!viewGroup.hasFocus() && bx3.C(viewGroup, focusSearch)) {
            Iterator it = ew3.O0(viewGroup).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((View) obj).isSelected()) {
                    break;
                }
            }
            View view = (View) obj;
            if (view != null) {
                return view;
            }
        }
        return null;
    }

    public final vz0 getLastFocusGroup() {
        return this.c;
    }

    public final View getLastFocusedPanel() {
        return this.f4989b;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        ViewGroup viewGroup = (ViewGroup) ew3.M0(this, 0);
        if (m20.L(this.f4989b, view)) {
            return;
        }
        this.f4989b = view;
        if (m20.L(viewGroup, view)) {
            viewGroup.startAnimation(new ud3(viewGroup, tf3.K(230)));
        } else {
            viewGroup.startAnimation(new ud3(viewGroup, tf3.K(100)));
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            KeyEvent.Callback childAt = viewGroup.getChildAt(i);
            if (childAt instanceof vd3) {
                ((vd3) childAt).a(m20.L(viewGroup, view));
            }
        }
    }

    public final void setLastFocusGroup(vz0 vz0Var) {
        this.c = vz0Var;
    }

    public final void setLastFocusedPanel(View view) {
        this.f4989b = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View focusSearch = super.focusSearch(view, i);
        Object obj = null;
        int i2 = 0;
        if (i == 33 || i == 130) {
            ViewGroup viewGroup = (ViewGroup) ew3.M0(this, 0);
            boolean hasFocus = viewGroup.hasFocus();
            if (!hasFocus && view != null && bx3.C(viewGroup, focusSearch)) {
                return null;
            }
            if (hasFocus && viewGroup.indexOfChild(focusSearch) == -1) {
                int indexOfChild = viewGroup.indexOfChild(viewGroup.getFocusedChild());
                if (i == 130) {
                    i2 = indexOfChild + 1;
                    if (i2 >= viewGroup.getChildCount()) {
                        i2 = viewGroup.getChildCount() - 1;
                    }
                } else {
                    int i3 = indexOfChild - 1;
                    if (i3 >= 0) {
                        i2 = i3;
                    }
                }
                return ew3.M0(viewGroup, i2);
            }
        }
        ViewGroup viewGroup2 = (ViewGroup) ew3.M0(this, 0);
        if (!viewGroup2.hasFocus() && bx3.C(viewGroup2, focusSearch)) {
            Iterator it = ew3.O0(viewGroup2).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((View) next).isSelected()) {
                    obj = next;
                    break;
                }
            }
            View view2 = (View) obj;
            if (view2 != null) {
                return view2;
            }
        }
        vz0 v = bx3.v(focusSearch);
        this.c = v;
        if (v == 0 || bx3.C((ViewGroup) v, view)) {
            return focusSearch;
        }
        this.c.b();
        return this.c.getNextFocusedView();
    }
}
