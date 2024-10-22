package defpackage;

import android.animation.Animator;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.widget.ConnectView;

/* loaded from: classes2.dex */
public final class py2 implements Animator.AnimatorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3940b;

    public /* synthetic */ py2(Object obj, int i) {
        this.f3939a = i;
        this.f3940b = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f3939a;
        Object obj = this.f3940b;
        switch (i) {
            case 0:
                SplashActivity splashActivity = (SplashActivity) obj;
                if (splashActivity.l.getAndSet(true)) {
                    splashActivity.Z();
                    return;
                }
                return;
            case 1:
                ((bx1) obj).dismissAllowingStateLoss();
                return;
            default:
                ConnectView connectView = (ConnectView) obj;
                if (connectView.M == 5) {
                    connectView.M = 3;
                    connectView.C.sendEmptyMessage(0);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
