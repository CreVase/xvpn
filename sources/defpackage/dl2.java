package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class dl2 extends Drawable implements rs2, h93 {

    /* renamed from: a, reason: collision with root package name */
    public cl2 f1803a;

    public dl2(cl2 cl2Var) {
        this.f1803a = cl2Var;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        cl2 cl2Var = this.f1803a;
        if (cl2Var.f664b) {
            cl2Var.f663a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1803a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f1803a.f663a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f1803a = new cl2(this.f1803a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1803a.f663a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f1803a.f663a.setState(iArr)) {
            onStateChange = true;
        }
        boolean f0 = ya0.f0(iArr);
        cl2 cl2Var = this.f1803a;
        if (cl2Var.f664b != f0) {
            cl2Var.f664b = f0;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f1803a.f663a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f1803a.f663a.setColorFilter(colorFilter);
    }

    @Override // defpackage.rs2
    public final void setShapeAppearanceModel(fs2 fs2Var) {
        this.f1803a.f663a.setShapeAppearanceModel(fs2Var);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.h93
    public final void setTint(int i) {
        this.f1803a.f663a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f1803a.f663a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f1803a.f663a.setTintMode(mode);
    }
}
