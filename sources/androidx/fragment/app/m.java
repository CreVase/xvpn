package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import defpackage.ll3;
import defpackage.yk3;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f233b;
    public final /* synthetic */ Object c;

    public m(n nVar, r rVar) {
        this.c = nVar;
        this.f233b = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f232a;
        Object obj = this.c;
        switch (i) {
            case 0:
                r rVar = this.f233b;
                Fragment fragment = rVar.c;
                rVar.i();
                e.i((ViewGroup) fragment.mView.getParent(), ((n) obj).f234a).h();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ll3.f3151a;
                yk3.c(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public m(r rVar, View view) {
        this.f233b = rVar;
        this.c = view;
    }
}
