package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import com.google.android.material.checkbox.b;

/* loaded from: classes.dex */
public final class gb extends Animatable2.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ar1 f2222a;

    public gb(ar1 ar1Var) {
        this.f2222a = ar1Var;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f2222a.f323b.o;
        if (colorStateList != null) {
            bn0.h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        b bVar = this.f2222a.f323b;
        ColorStateList colorStateList = bVar.o;
        if (colorStateList != null) {
            bn0.g(drawable, colorStateList.getColorForState(bVar.s, colorStateList.getDefaultColor()));
        }
    }
}
