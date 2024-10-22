package defpackage;

import android.view.View;
import android.view.animation.Animation;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.p;
import java.util.Objects;

/* loaded from: classes.dex */
public final class xi0 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ux2 f5163a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f5164b;
    public final /* synthetic */ View c;
    public final /* synthetic */ c d;

    public xi0(View view, c cVar, e eVar, ux2 ux2Var) {
        this.f5163a = ux2Var;
        this.f5164b = eVar;
        this.c = view;
        this.d = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        e eVar = this.f5164b;
        eVar.f224a.post(new cq0(3, eVar, this.c, this.d));
        if (p.I(2)) {
            Objects.toString(this.f5163a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (p.I(2)) {
            Objects.toString(this.f5163a);
        }
    }
}
