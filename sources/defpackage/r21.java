package defpackage;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r21 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f4093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f4094b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ArrayList f;
    public final /* synthetic */ t21 g;

    public r21(t21 t21Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.g = t21Var;
        this.f4093a = obj;
        this.f4094b = arrayList;
        this.e = obj2;
        this.f = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        t21 t21Var = this.g;
        Object obj = this.f4093a;
        if (obj != null) {
            t21Var.t(obj, this.f4094b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            t21Var.t(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            t21Var.t(obj3, this.f, null);
        }
    }
}
