package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.browser.TabIndexView;

/* loaded from: classes2.dex */
public final class n53 implements v53 {

    /* renamed from: a, reason: collision with root package name */
    public TabIndexView f3397a;

    /* renamed from: b, reason: collision with root package name */
    public k53 f3398b;
    public final /* synthetic */ s53 c;

    public n53(s53 s53Var) {
        this.c = s53Var;
    }

    public final void a(int i, boolean z) {
        int i2;
        RecyclerView recyclerView;
        final TabIndexView tabIndexView = this.f3397a;
        if (tabIndexView == null) {
            return;
        }
        float translationX = tabIndexView.getTranslationX();
        final int width = tabIndexView.getWidth() / 2;
        final int i3 = 1;
        final int i4 = 0;
        if (z) {
            s53 s53Var = this.c;
            if (i > 0) {
                o11 o11Var = s53Var.l;
                if (o11Var != null && (recyclerView = o11Var.d) != null) {
                    i2 = recyclerView.getWidth();
                } else {
                    i2 = 0;
                }
            } else {
                i2 = -tabIndexView.getWidth();
            }
            ObjectAnimator duration = ObjectAnimator.ofFloat(tabIndexView, "translationX", translationX, i2 - tabIndexView.getLeft()).setDuration(((float) 150) * Math.max(Math.abs(r13 - translationX) / tabIndexView.getWidth(), 1.0f));
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m53
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int i5 = i4;
                    int i6 = width;
                    float f = 1.0f;
                    TabIndexView tabIndexView2 = tabIndexView;
                    switch (i5) {
                        case 0:
                            float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            if (abs > tabIndexView2.getWidth() / 2) {
                                float f2 = i6;
                                f = Math.max(1.0f - (((abs - f2) / f2) / 2), 0.5f);
                            }
                            tabIndexView2.setAlpha(f);
                            return;
                        default:
                            float abs2 = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            if (abs2 > tabIndexView2.getWidth() / 2) {
                                float f3 = i6;
                                f = Math.max(1.0f - (((abs2 - f3) / f3) / 2), 0.5f);
                            }
                            tabIndexView2.setAlpha(f);
                            return;
                    }
                }
            });
            duration.addListener(new pm3(this, s53Var, tabIndexView));
            duration.setInterpolator(new DecelerateInterpolator());
            duration.start();
            return;
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(tabIndexView, "translationX", translationX, 0.0f).setDuration(((float) 150) * Math.max(Math.abs(0.0f - translationX) / tabIndexView.getWidth(), 1.0f));
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: m53
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i5 = i3;
                int i6 = width;
                float f = 1.0f;
                TabIndexView tabIndexView2 = tabIndexView;
                switch (i5) {
                    case 0:
                        float abs = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        if (abs > tabIndexView2.getWidth() / 2) {
                            float f2 = i6;
                            f = Math.max(1.0f - (((abs - f2) / f2) / 2), 0.5f);
                        }
                        tabIndexView2.setAlpha(f);
                        return;
                    default:
                        float abs2 = Math.abs(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        if (abs2 > tabIndexView2.getWidth() / 2) {
                            float f3 = i6;
                            f = Math.max(1.0f - (((abs2 - f3) / f3) / 2), 0.5f);
                        }
                        tabIndexView2.setAlpha(f);
                        return;
                }
            }
        });
        duration2.addListener(new mb3(this, tabIndexView));
        duration2.start();
    }
}
