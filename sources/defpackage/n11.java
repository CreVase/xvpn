package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class n11 extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f3386a;

    /* renamed from: b, reason: collision with root package name */
    public final View f3387b;
    public boolean c;
    public boolean d;
    public boolean e;

    public n11(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = true;
        this.f3386a = viewGroup;
        this.f3387b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation)) {
            this.c = true;
            d32.a(this.f3386a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.c;
        ViewGroup viewGroup = this.f3386a;
        if (!z && this.e) {
            this.e = false;
            viewGroup.post(this);
        } else {
            viewGroup.endViewTransition(this.f3387b);
            this.d = true;
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j, Transformation transformation, float f) {
        this.e = true;
        if (this.c) {
            return !this.d;
        }
        if (!super.getTransformation(j, transformation, f)) {
            this.c = true;
            d32.a(this.f3386a, this);
        }
        return true;
    }
}
