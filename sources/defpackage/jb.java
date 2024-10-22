package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class jb extends bx3 {
    public final ObjectAnimator l;
    public final boolean m;

    public jb(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        super(0);
        int i;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z) {
            i = numberOfFrames - 1;
        } else {
            i = 0;
        }
        int i2 = z ? 0 : numberOfFrames - 1;
        kb kbVar = new kb(animationDrawable, z);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
        x20.a(ofInt, true);
        ofInt.setDuration(kbVar.c);
        ofInt.setInterpolator(kbVar);
        this.m = z2;
        this.l = ofInt;
    }

    @Override // defpackage.bx3
    public final void Y() {
        this.l.reverse();
    }

    @Override // defpackage.bx3
    public final void a0() {
        this.l.start();
    }

    @Override // defpackage.bx3
    public final void b0() {
        this.l.cancel();
    }

    @Override // defpackage.bx3
    public final boolean m() {
        return this.m;
    }
}
