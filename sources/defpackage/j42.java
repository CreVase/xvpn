package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class j42 extends nk1 {
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j42(Object obj, Context context, int i) {
        super(context);
        this.p = i;
        this.q = obj;
    }

    @Override // defpackage.nk1
    public final int b(View view, int i) {
        switch (this.p) {
            case 1:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.b(view, i);
        }
    }

    @Override // defpackage.nk1
    public final int c(View view, int i) {
        switch (this.p) {
            case 1:
                ((CarouselLayoutManager) this.q).getClass();
                return 0;
            default:
                return super.c(view, i);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // defpackage.nk1
    public final float d(DisplayMetrics displayMetrics) {
        int i;
        switch (this.p) {
            case 0:
                i = displayMetrics.densityDpi;
                return 100.0f / i;
            case 1:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 2:
                i = displayMetrics.densityDpi;
                return 100.0f / i;
        }
    }

    @Override // defpackage.nk1
    public final int e(int i) {
        switch (this.p) {
            case 0:
                return Math.min(100, super.e(i));
            default:
                return super.e(i);
        }
    }

    @Override // defpackage.nk1
    public final PointF f(int i) {
        switch (this.p) {
            case 1:
                ((CarouselLayoutManager) this.q).getClass();
                return null;
            default:
                return super.f(i);
        }
    }

    @Override // defpackage.nk1
    public final void h(View view, wh2 wh2Var, xp xpVar) {
        switch (this.p) {
            case 0:
                k42 k42Var = (k42) this.q;
                int[] a2 = k42Var.a(k42Var.f2882a.getLayoutManager(), view);
                int i = a2[0];
                int i2 = a2[1];
                int ceil = (int) Math.ceil(e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.i;
                    xpVar.f5198a = i;
                    xpVar.f5199b = i2;
                    xpVar.c = ceil;
                    xpVar.g = decelerateInterpolator;
                    xpVar.e = true;
                    return;
                }
                return;
            default:
                super.h(view, wh2Var, xpVar);
                return;
        }
    }
}
