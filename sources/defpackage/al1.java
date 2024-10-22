package defpackage;

import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class al1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hl1 f107b;

    public /* synthetic */ al1(hl1 hl1Var, int i) {
        this.f106a = i;
        this.f107b = hl1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f106a;
        hl1 hl1Var = this.f107b;
        switch (i) {
            case 1:
                go0 go0Var = hl1Var.c;
                if (go0Var != null) {
                    go0Var.setListSelectionHidden(true);
                    go0Var.requestLayout();
                    return;
                }
                return;
            default:
                go0 go0Var2 = hl1Var.c;
                if (go0Var2 != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (xk3.b(go0Var2) && hl1Var.c.getCount() > hl1Var.c.getChildCount() && hl1Var.c.getChildCount() <= hl1Var.m) {
                        hl1Var.z.setInputMethodMode(2);
                        hl1Var.show();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
