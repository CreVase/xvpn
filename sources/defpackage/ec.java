package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public final class ec extends LinearLayout.LayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final int f1909a;

    /* renamed from: b, reason: collision with root package name */
    public uy0 f1910b;
    public final Interpolator c;

    public ec(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1909a = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.AppBarLayout_Layout);
        this.f1909a = obtainStyledAttributes.getInt(bg2.AppBarLayout_Layout_layout_scrollFlags, 0);
        this.f1910b = obtainStyledAttributes.getInt(bg2.AppBarLayout_Layout_layout_scrollEffect, 0) != 1 ? null : new uy0(10);
        int i = bg2.AppBarLayout_Layout_layout_scrollInterpolator;
        if (obtainStyledAttributes.hasValue(i)) {
            this.c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(i, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public ec() {
        super(-1, -2);
        this.f1909a = 1;
    }

    public ec(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1909a = 1;
    }

    public ec(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1909a = 1;
    }

    public ec(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1909a = 1;
    }
}
