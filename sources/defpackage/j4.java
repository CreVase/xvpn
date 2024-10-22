package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class j4 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f2700a;

    public j4(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2700a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg2.ActionBarLayout);
        this.f2700a = obtainStyledAttributes.getInt(cg2.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
    }

    public j4() {
        super(-2, -2);
        this.f2700a = 8388627;
    }

    public j4(j4 j4Var) {
        super((ViewGroup.MarginLayoutParams) j4Var);
        this.f2700a = 0;
        this.f2700a = j4Var.f2700a;
    }

    public j4(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2700a = 0;
    }
}
