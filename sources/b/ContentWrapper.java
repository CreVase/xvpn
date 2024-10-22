package b;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import defpackage.al3;
import defpackage.ll3;
import defpackage.x31;
import defpackage.z5;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ContentWrapper extends ViewGroup {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f372a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f373b;

    public ContentWrapper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void a(x31 x31Var) {
        this.f372a.add(x31Var);
        x31Var.invoke(this.f373b);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean getAutoCloseKeyboard() {
        return false;
    }

    public final Rect getWindowInsets() {
        return this.f373b;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f372a.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() == 1) {
            getChildAt(0).layout(i, i2, i3, i4);
            return;
        }
        throw new IllegalArgumentException("child count must == 1");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        getChildAt(0).measure(i, i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!super.onTouchEvent(motionEvent) && motionEvent.getAction() != 0) {
            return false;
        }
        return true;
    }

    public ContentWrapper(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        new Rect();
        this.f372a = new ArrayList();
        this.f373b = new Rect();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        z5 z5Var = new z5(this, 3);
        WeakHashMap weakHashMap = ll3.f3151a;
        al3.u(this, z5Var);
    }
}
