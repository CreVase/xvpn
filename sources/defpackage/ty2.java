package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;

/* loaded from: classes.dex */
public final class ty2 implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uy2 f4597a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f4598b;

    public ty2(uy2 uy2Var, Activity activity) {
        this.f4597a = uy2Var;
        this.f4598b = activity;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        WindowInsets build;
        View rootView;
        if (it1.w(view2)) {
            SplashScreenView m = it1.m(view2);
            uy2 uy2Var = this.f4597a;
            uy2Var.getClass();
            build = no1.f().build();
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            rootView = m.getRootView();
            if (build == rootView.computeSystemWindowInsets(build, rect)) {
                rect.isEmpty();
            }
            uy2Var.getClass();
            ((ViewGroup) this.f4598b.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
    }
}
