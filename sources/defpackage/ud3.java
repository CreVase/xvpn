package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* loaded from: classes2.dex */
public final class ud3 extends Animation {

    /* renamed from: a, reason: collision with root package name */
    public final View f4654a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4655b;
    public final int c;

    public ud3(ViewGroup viewGroup, int i) {
        this.f4654a = viewGroup;
        this.f4655b = i;
        this.c = viewGroup.getWidth();
        setDuration((Math.abs(r3 - i) / (130 * tf3.F)) * ((float) 300));
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        View view = this.f4654a;
        if (view.getHeight() != this.f4655b) {
            view.getLayoutParams().width = (int) (((r1 - r0) * f) + this.c);
            view.requestLayout();
        }
    }

    @Override // android.view.animation.Animation
    public final boolean willChangeBounds() {
        return true;
    }
}
