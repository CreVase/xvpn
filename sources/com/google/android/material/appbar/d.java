package com.google.android.material.appbar;

import android.view.View;
import defpackage.t3;

/* loaded from: classes2.dex */
public final class d implements t3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f1522a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1523b;

    public d(AppBarLayout appBarLayout, boolean z) {
        this.f1522a = appBarLayout;
        this.f1523b = z;
    }

    @Override // defpackage.t3
    public final boolean b(View view) {
        this.f1522a.setExpanded(this.f1523b);
        return true;
    }
}
