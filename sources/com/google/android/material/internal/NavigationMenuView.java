package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ju1;
import defpackage.mv1;

/* loaded from: classes2.dex */
public class NavigationMenuView extends RecyclerView implements mv1 {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setLayoutManager(new LinearLayoutManager(1, false));
    }

    @Override // defpackage.mv1
    public final void b(ju1 ju1Var) {
    }

    public int getWindowAnimations() {
        return 0;
    }
}
