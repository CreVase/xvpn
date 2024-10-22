package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.p;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wi0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5016b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ux2 d;
    public final /* synthetic */ c e;

    public wi0(e eVar, View view, boolean z, ux2 ux2Var, c cVar) {
        this.f5015a = eVar;
        this.f5016b = view;
        this.c = z;
        this.d = ux2Var;
        this.e = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f5015a.f224a;
        View view = this.f5016b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        ux2 ux2Var = this.d;
        if (z) {
            ux2Var.f4753a.a(view);
        }
        this.e.a();
        if (p.I(2)) {
            Objects.toString(ux2Var);
        }
    }
}
