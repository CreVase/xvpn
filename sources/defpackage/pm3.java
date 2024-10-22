package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.security.xvpn.z35kb.browser.TabIndexView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class pm3 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3874a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3875b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ pm3(int i, Object obj, Object obj2, Object obj3) {
        this.f3874a = i;
        this.d = obj;
        this.c = obj2;
        this.f3875b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f3874a) {
            case 0:
                ((um3) this.c).a((View) this.f3875b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f3874a;
        Object obj = this.f3875b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((um3) obj2).c();
                return;
            case 1:
                ((iq3) obj2).f2634a.d(1.0f);
                dq3.e((View) obj);
                return;
            default:
                k53 k53Var = ((n53) obj2).f3398b;
                s53 s53Var = (s53) obj;
                ArrayList arrayList = s53Var.g;
                if (k53Var != null) {
                    s53Var.z(arrayList.indexOf(k53Var));
                }
                TabIndexView tabIndexView = (TabIndexView) this.d;
                tabIndexView.setTranslationZ(0.0f);
                tabIndexView.setAlpha(1.0f);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f3874a) {
            case 0:
                ((um3) this.c).b();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public pm3(n53 n53Var, s53 s53Var, TabIndexView tabIndexView) {
        this.f3874a = 3;
        this.c = n53Var;
        this.f3875b = s53Var;
        this.d = tabIndexView;
    }
}
