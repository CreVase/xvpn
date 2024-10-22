package defpackage;

import a.bx;
import a.du;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final /* synthetic */ class iz implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jz f2678b;

    public /* synthetic */ iz(jz jzVar, int i) {
        this.f2677a = i;
        this.f2678b = jzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredHeight;
        int i = this.f2677a;
        jz jzVar = this.f2678b;
        switch (i) {
            case 0:
                String str = jzVar.j;
                vt3 vt3Var = jzVar.h;
                bx bxVar = new bx();
                bxVar.z(str);
                if (vt3Var == null) {
                    vt3Var = new vt3();
                }
                bxVar.z(vt3Var.f4896a);
                bxVar.y(vt3Var.f4897b);
                bxVar.z(vt3Var.c);
                bxVar.z(vt3Var.d);
                du.d(49, bxVar);
                bxVar.h();
                t9.g();
                vt3 vt3Var2 = jzVar.h;
                bx bxVar2 = new bx();
                if (vt3Var2 == null) {
                    vt3Var2 = new vt3();
                }
                bxVar2.z(vt3Var2.f4896a);
                bxVar2.y(vt3Var2.f4897b);
                bxVar2.z(vt3Var2.c);
                bxVar2.z(vt3Var2.d);
                du.d(16, bxVar2);
                bxVar2.h();
                return;
            default:
                if (jzVar.getParent() instanceof RecyclerView) {
                    int measuredHeight2 = ((RecyclerView) jzVar.getParent()).getMeasuredHeight();
                    if (jzVar.getBottom() > measuredHeight2) {
                        measuredHeight = jzVar.getBottom() - measuredHeight2;
                    } else {
                        if (jzVar.getMeasuredHeight() + jzVar.getTop() < measuredHeight2) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = jzVar.getMeasuredHeight();
                        }
                    }
                    ((RecyclerView) jzVar.getParent()).scrollBy(0, measuredHeight);
                    return;
                }
                return;
        }
    }
}
