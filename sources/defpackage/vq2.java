package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class vq2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4879a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4880b;
    public final Object c;
    public final Object d;

    public vq2(ck1 ck1Var, tj1 tj1Var) {
        this.c = ck1Var;
        this.d = tj1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ja1 ja1Var;
        int i = this.f4879a;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                if (!this.f4880b) {
                    ((ck1) obj2).e((tj1) obj);
                    this.f4880b = true;
                    return;
                }
                return;
            default:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                vl3 vl3Var = swipeDismissBehavior.f1526a;
                if (vl3Var != null && vl3Var.g()) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    uk3.m((View) obj2, this);
                    return;
                } else {
                    if (this.f4880b && (ja1Var = swipeDismissBehavior.f1527b) != null) {
                        ja1Var.H((View) obj2);
                        return;
                    }
                    return;
                }
        }
    }

    public vq2(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.d = swipeDismissBehavior;
        this.c = view;
        this.f4880b = z;
    }
}
