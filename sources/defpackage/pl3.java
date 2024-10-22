package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pl3 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3869a;

    public /* synthetic */ pl3(int i) {
        this.f3869a = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        tl3 tl3Var;
        switch (this.f3869a) {
            case 0:
                if (view != null) {
                    tl3Var = (tl3) view.getTag(cf2.dataBinding);
                } else {
                    tl3Var = null;
                }
                tl3Var.f4530b.run();
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ll3.f3151a;
                yk3.c(view);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
