package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import defpackage.df2;
import defpackage.hx2;
import defpackage.ll3;
import defpackage.v11;
import defpackage.wq3;
import defpackage.yk3;
import defpackage.zf2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f213a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f214b;
    public View.OnApplyWindowInsetsListener c;
    public boolean d;

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f213a = new ArrayList();
        this.f214b = new ArrayList();
        this.d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf2.FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(zf2.FragmentContainerView_android_name);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f214b.contains(view)) {
            this.f213a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        Fragment fragment;
        Object tag = view.getTag(df2.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            fragment = (Fragment) tag;
        } else {
            fragment = null;
        }
        if (fragment != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        wq3 wq3Var;
        wq3 h = wq3.h(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.c;
        if (onApplyWindowInsetsListener != null) {
            wq3Var = wq3.h(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = ll3.f3151a;
            WindowInsets g = h.g();
            if (g != null) {
                WindowInsets b2 = yk3.b(this, g);
                if (!b2.equals(g)) {
                    h = wq3.h(this, b2);
                }
            }
            wq3Var = h;
        }
        if (!wq3Var.f5059a.m()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = ll3.f3151a;
                WindowInsets g2 = wq3Var.g();
                if (g2 != null) {
                    WindowInsets a2 = yk3.a(childAt, g2);
                    if (!a2.equals(g2)) {
                        wq3.h(childAt, a2);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.d) {
            Iterator it = this.f213a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.d) {
            ArrayList arrayList = this.f213a;
            if ((!arrayList.isEmpty()) && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f214b.remove(view);
        if (this.f213a.remove(view)) {
            this.d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        l lVar;
        Fragment fragment;
        p supportFragmentManager;
        View view = this;
        while (true) {
            lVar = null;
            if (view != null) {
                Object tag = view.getTag(df2.fragment_container_view_tag);
                if (tag instanceof Fragment) {
                    fragment = (Fragment) tag;
                } else {
                    fragment = null;
                }
                if (fragment != null) {
                    break;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            } else {
                fragment = null;
                break;
            }
        }
        if (fragment != null) {
            if (fragment.isAdded()) {
                supportFragmentManager = fragment.getChildFragmentManager();
            } else {
                throw new IllegalStateException("The Fragment " + fragment + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof l) {
                    lVar = (l) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (lVar != null) {
                supportFragmentManager = lVar.getSupportFragmentManager();
            } else {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
        }
        return (F) supportFragmentManager.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                a(getChildAt(childCount));
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.d = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f214b.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, p pVar) {
        super(context, attributeSet);
        View view;
        this.f213a = new ArrayList();
        this.f214b = new ArrayList();
        this.d = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, zf2.FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(zf2.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(zf2.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment B = pVar.B(id);
        if (classAttribute != null && B == null) {
            if (id == -1) {
                throw new IllegalStateException(hx2.q("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            v11 G = pVar.G();
            context.getClassLoader();
            Fragment instantiate = Fragment.instantiate(G.f4772a.t.f4088b, classAttribute, null);
            instantiate.mFragmentId = id;
            instantiate.mContainerId = id;
            instantiate.mTag = string;
            instantiate.mFragmentManager = pVar;
            instantiate.mHost = pVar.t;
            instantiate.onInflate(context, attributeSet, (Bundle) null);
            a aVar = new a(pVar);
            aVar.p = true;
            instantiate.mContainer = this;
            aVar.d(getId(), instantiate, string, 1);
            if (!aVar.g) {
                aVar.h = false;
                aVar.q.y(aVar, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = pVar.c.d().iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            Fragment fragment = rVar.c;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                rVar.a();
            }
        }
    }
}
