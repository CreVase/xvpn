package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.security.xvpn.z35kb.browser.TabIndexView;

/* loaded from: classes.dex */
public final class mb3 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3270a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3271b;
    public final /* synthetic */ Object c;

    public mb3(n53 n53Var, TabIndexView tabIndexView) {
        this.f3271b = n53Var;
        this.c = tabIndexView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f3270a;
        Object obj = this.c;
        Object obj2 = this.f3271b;
        switch (i) {
            case 0:
                ((kg) obj2).remove(animator);
                ((pb3) obj).m.remove(animator);
                return;
            default:
                k53 k53Var = ((n53) obj2).f3398b;
                TabIndexView tabIndexView = (TabIndexView) obj;
                tabIndexView.setTranslationZ(0.0f);
                tabIndexView.setAlpha(1.0f);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3270a) {
            case 0:
                ((pb3) this.c).m.add(animator);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public /* synthetic */ mb3(Object obj, kg kgVar) {
        this.c = obj;
        this.f3271b = kgVar;
    }
}
