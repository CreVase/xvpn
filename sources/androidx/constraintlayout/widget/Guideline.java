package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import defpackage.f70;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: a, reason: collision with root package name */
    public boolean f187a;

    public Guideline(Context context) {
        super(context);
        this.f187a = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.f187a = z;
    }

    public void setGuidelineBegin(int i) {
        f70 f70Var = (f70) getLayoutParams();
        if (this.f187a && f70Var.f2052a == i) {
            return;
        }
        f70Var.f2052a = i;
        setLayoutParams(f70Var);
    }

    public void setGuidelineEnd(int i) {
        f70 f70Var = (f70) getLayoutParams();
        if (this.f187a && f70Var.f2053b == i) {
            return;
        }
        f70Var.f2053b = i;
        setLayoutParams(f70Var);
    }

    public void setGuidelinePercent(float f) {
        f70 f70Var = (f70) getLayoutParams();
        if (this.f187a && f70Var.c == f) {
            return;
        }
        f70Var.c = f;
        setLayoutParams(f70Var);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f187a = true;
        super.setVisibility(8);
    }
}
