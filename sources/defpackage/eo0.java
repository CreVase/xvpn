package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class eo0 extends jn0 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1967b;

    public eo0(Drawable drawable) {
        super(drawable);
        this.f1967b = true;
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f1967b) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.f1967b) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f1967b) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f1967b) {
            return super.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.jn0, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.f1967b) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
