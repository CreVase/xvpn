package defpackage;

import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.security.xvpn.z35kb.server.ServerChooseActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class gk2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2266a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2267b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gk2(int i, int i2, Object obj) {
        this.f2266a = i2;
        this.c = obj;
        this.f2267b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v31 v31Var;
        int i = this.f2266a;
        int i2 = this.f2267b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((tf3) obj).l0(i2);
                return;
            case 1:
                wh whVar = ((uh) obj).f4670b;
                whVar.getClass();
                boolean z = true;
                if (i2 != -3 && i2 != -2) {
                    if (i2 != -1) {
                        if (i2 != 1) {
                            sn1.f();
                            return;
                        } else {
                            whVar.d(1);
                            whVar.b(1);
                            return;
                        }
                    }
                    whVar.b(-1);
                    whVar.a();
                    return;
                }
                if (i2 != -2) {
                    qh qhVar = whVar.d;
                    if (qhVar == null || qhVar.f3995a != 1) {
                        z = false;
                    }
                    if (!z) {
                        whVar.d(3);
                        return;
                    }
                }
                whVar.b(0);
                whVar.d(2);
                return;
            case 2:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.p.get();
                if (view != null) {
                    sideSheetBehavior.v(view, false, i2);
                    return;
                }
                return;
            case 3:
                s53 s53Var = (s53) obj;
                if (i2 == s53Var.o && (v31Var = s53Var.n) != null) {
                    v31Var.invoke();
                    return;
                }
                return;
            default:
                p71.x(((ServerChooseActivity) obj).l[i2], 127);
                return;
        }
    }

    public /* synthetic */ gk2(int i, s53 s53Var) {
        this.f2266a = 3;
        this.f2267b = i;
        this.c = s53Var;
    }
}
