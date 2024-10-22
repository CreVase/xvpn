package com.google.android.material.appbar;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.t3;

/* loaded from: classes2.dex */
public final class c implements t3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1521b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int d;
    public final /* synthetic */ AppBarLayout.BaseBehavior e;

    public c(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.e = baseBehavior;
        this.f1520a = coordinatorLayout;
        this.f1521b = appBarLayout;
        this.c = view;
        this.d = i;
    }

    @Override // defpackage.t3
    public final boolean b(View view) {
        this.e.A(this.f1520a, this.f1521b, this.c, this.d, new int[]{0, 0});
        return true;
    }
}
