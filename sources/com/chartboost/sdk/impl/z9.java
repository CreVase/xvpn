package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.SurfaceView;
import android.widget.FrameLayout;
import defpackage.ng0;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class z9 extends y2 {
    public SurfaceView j;
    public FrameLayout k;

    public /* synthetic */ z9(Context context, String str, l3 l3Var, s9 s9Var, String str2, f9 f9Var, SurfaceView surfaceView, FrameLayout frameLayout, int i, ng0 ng0Var) {
        this(context, str, l3Var, s9Var, str2, f9Var, surfaceView, (i & 128) != 0 ? new FrameLayout(context) : frameLayout);
    }

    public final void b() {
        SurfaceView surfaceView = this.j;
        if (surfaceView != null) {
            surfaceView.setVisibility(8);
            this.k.removeView(this.j);
            removeView(this.k);
        }
    }

    public z9(Context context, String str, l3 l3Var, s9 s9Var, String str2, f9 f9Var, SurfaceView surfaceView, FrameLayout frameLayout) {
        super(context, str, l3Var, f9Var, s9Var, str2);
        this.j = surfaceView;
        this.k = frameLayout;
        if (surfaceView != null) {
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackgroundColor(-16777216);
            addView(this.k);
            this.k.addView(this.j);
            addView(this.d);
            l3Var.a();
            l3Var.d();
            return;
        }
        throw new IllegalStateException("SurfaceView is not ready. Cannot display video.".toString());
    }
}
