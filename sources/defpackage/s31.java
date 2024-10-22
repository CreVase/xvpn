package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;

/* loaded from: classes2.dex */
public final class s31 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final int f4263a;

    /* renamed from: b, reason: collision with root package name */
    public float f4264b;
    public int c;

    public s31(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4263a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FullDragDrawerLayout.D);
        this.f4263a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public s31() {
        super(-1, -1);
        this.f4263a = 0;
    }

    public s31(s31 s31Var) {
        super((ViewGroup.MarginLayoutParams) s31Var);
        this.f4263a = 0;
        this.f4263a = s31Var.f4263a;
    }

    public s31(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f4263a = 0;
    }

    public s31(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f4263a = 0;
    }
}
