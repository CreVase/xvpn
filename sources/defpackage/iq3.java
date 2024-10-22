package defpackage;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class iq3 {

    /* renamed from: a, reason: collision with root package name */
    public final hq3 f2634a;

    public iq3(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2634a = new gq3(eq3.h(i, interpolator, j));
        } else {
            this.f2634a = new dq3(i, interpolator, j);
        }
    }

    public iq3(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2634a = new gq3(windowInsetsAnimation);
        }
    }
}
