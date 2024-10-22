package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class mg2 extends FrameLayout.LayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final float f3292a;

    /* renamed from: b, reason: collision with root package name */
    public final float f3293b;
    public float c;
    public float d;
    public float e;
    public final float f;

    public mg2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sf2.RatioLayout_Layout);
        this.c = obtainStyledAttributes.getFloat(2, 0.0f);
        this.d = obtainStyledAttributes.getFloat(4, 0.0f);
        this.e = obtainStyledAttributes.getFloat(3, 0.0f);
        this.f = obtainStyledAttributes.getFloat(0, 0.0f);
        this.f3292a = obtainStyledAttributes.getFloat(5, 0.0f);
        this.f3293b = obtainStyledAttributes.getFloat(1, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "LayoutParams{w=" + this.f3292a + ", h=" + this.f3293b + ", left=" + this.c + ", top=" + this.d + ", right=" + this.e + ", bottom=" + this.f + ", gravity=" + ((FrameLayout.LayoutParams) this).gravity + '}';
    }

    public mg2() {
        super(-2, -2);
    }
}
