package defpackage;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class wv0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5075a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5076b;

    public /* synthetic */ wv0(Object obj, int i) {
        this.f5075a = i;
        this.f5076b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5075a;
        Object obj = this.f5076b;
        switch (i) {
            case 0:
                aw0 aw0Var = (aw0) obj;
                int i2 = aw0Var.A;
                ValueAnimator valueAnimator = aw0Var.z;
                if (i2 != 1) {
                    if (i2 != 2) {
                        return;
                    }
                } else {
                    valueAnimator.cancel();
                }
                aw0Var.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            default:
                ((StaggeredGridLayoutManager) obj).B0();
                return;
        }
    }
}
