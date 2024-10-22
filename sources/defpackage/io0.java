package defpackage;

import android.animation.ValueAnimator;
import android.graphics.PathMeasure;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import com.security.xvpn.z35kb.browser.BrowserToolbar;
import com.security.xvpn.z35kb.browser.PrivateBrowser;
import com.security.xvpn.z35kb.ui.components.ConnectingStatusView;
import com.security.xvpn.z35kb.widget.AccountHeaderBackgroundView;
import com.security.xvpn.z35kb.widget.ConnectView;
import com.security.xvpn.z35kb.widget.LoadingView;
import com.security.xvpn.z35kb.widget.PasswordStrengthBar;

/* loaded from: classes2.dex */
public final /* synthetic */ class io0 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2628a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2629b;

    public /* synthetic */ io0(Object obj, int i) {
        this.f2628a = i;
        this.f2629b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float interpolation;
        int i = this.f2628a;
        float f = 0.0f;
        Object obj = this.f2629b;
        switch (i) {
            case 0:
                lo0 lo0Var = (lo0) obj;
                lo0Var.getClass();
                lo0Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                x8 x8Var = x8.f5127a;
                ((FrameLayout) obj).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                BrowserToolbar browserToolbar = (BrowserToolbar) obj;
                int i2 = BrowserToolbar.Q;
                browserToolbar.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f2 = floatValue / browserToolbar.M;
                if (!browserToolbar.H) {
                    browserToolbar.A.setTranslationX(floatValue);
                    browserToolbar.A.setAlpha(1.0f - f2);
                }
                browserToolbar.D.setTranslationX(r0.getWidth() * f2);
                browserToolbar.C.setAlpha(f2);
                browserToolbar.invalidate();
                return;
            case 3:
                PrivateBrowser privateBrowser = (PrivateBrowser) obj;
                int i3 = PrivateBrowser.L;
                privateBrowser.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                privateBrowser.m.setAlpha((1.0f - floatValue2) - (0.3f * floatValue2));
                privateBrowser.m.setTranslationY(r2.getHeight() * floatValue2);
                return;
            case 4:
                ((ConnectingStatusView) obj).e.setProgress(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 5:
                int i4 = AccountHeaderBackgroundView.g;
                ((AccountHeaderBackgroundView) obj).postInvalidateOnAnimation();
                return;
            case 6:
                ConnectView connectView = (ConnectView) obj;
                int i5 = ConnectView.N;
                connectView.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                connectView.B = floatValue3;
                connectView.K = 0;
                int i6 = connectView.M;
                if (i6 == 3) {
                    connectView.G = 0.0f;
                    connectView.F = 0.0f;
                    connectView.D = 0.0f;
                    connectView.E = 0.0f;
                    connectView.H = 0.0d;
                    connectView.I = -0.15707963267948966d;
                    if (floatValue3 <= 250.0f && floatValue3 >= 1.0f) {
                        connectView.K = 0;
                    } else if (floatValue3 <= 650.0f && floatValue3 > 250.0f) {
                        connectView.K = 1;
                    } else if (floatValue3 <= 1000.0f && floatValue3 > 650.0f) {
                        connectView.K = 2;
                    }
                } else if (i6 == 2) {
                    try {
                        connectView.B = ((Float) valueAnimator.getAnimatedValue("progress")).floatValue();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else if (i6 == 5) {
                    connectView.B = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                }
                connectView.invalidate();
                return;
            case 7:
                int i7 = LoadingView.p;
                ((LoadingView) obj).invalidate();
                return;
            case 8:
                PasswordStrengthBar passwordStrengthBar = (PasswordStrengthBar) obj;
                int i8 = PasswordStrengthBar.r;
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passwordStrengthBar.f = cg.a(valueAnimator.getAnimatedFraction(), Integer.valueOf(passwordStrengthBar.g), Integer.valueOf(passwordStrengthBar.h)).intValue();
                passwordStrengthBar.l = floatValue4 * passwordStrengthBar.o;
                passwordStrengthBar.postInvalidate();
                return;
            default:
                l92 l92Var = (l92) obj;
                int i9 = l92.u;
                l92Var.getClass();
                long currentTimeMillis = System.currentTimeMillis() - l92Var.o;
                long j = l92Var.n;
                long j2 = currentTimeMillis % j;
                long j3 = l92Var.m;
                long j4 = l92Var.l;
                long j5 = j3 + j4;
                long j6 = j5 + j4;
                DecelerateInterpolator decelerateInterpolator = l92Var.j;
                if (j2 < j4) {
                    interpolation = 0.0f;
                } else if (j2 > j5) {
                    interpolation = 1.0f;
                } else {
                    interpolation = decelerateInterpolator.getInterpolation((((float) (j2 - j4)) * 1.0f) / ((float) j3));
                }
                if (j2 >= j6) {
                    if (j2 > j3 + j6) {
                        f = 1.0f;
                    } else {
                        f = decelerateInterpolator.getInterpolation((((float) (j2 - j6)) * 1.0f) / ((float) j3));
                    }
                }
                PathMeasure pathMeasure = l92Var.f;
                float length = (((((float) j2) * 1.0f) / ((float) j)) * pathMeasure.getLength() * 1.25f) + (pathMeasure.getLength() * 0.75f * f);
                float length2 = pathMeasure.getLength();
                long j7 = l92Var.k;
                float length3 = ((((((float) (currentTimeMillis % j7)) * 1.0f) / ((float) j7)) * length2) + length) % pathMeasure.getLength();
                l92Var.p = length3;
                l92Var.q = hx2.f(1.0f, f, pathMeasure.getLength() * 0.75f * interpolation, length3 + l92Var.r);
                l92Var.invalidateSelf();
                return;
        }
    }
}
