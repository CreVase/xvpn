package defpackage;

import android.os.Looper;
import androidx.lifecycle.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ck1 extends vj1 {
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f657b = true;
    public vv0 c = new vv0();
    public uj1 d = uj1.INITIALIZED;
    public final ArrayList i = new ArrayList();

    public ck1(bk1 bk1Var) {
        this.e = new WeakReference(bk1Var);
    }

    @Override // defpackage.vj1
    public final void a(ak1 ak1Var) {
        bk1 bk1Var;
        boolean z;
        tj1 tj1Var;
        d("addObserver");
        uj1 uj1Var = this.d;
        uj1 uj1Var2 = uj1.DESTROYED;
        if (uj1Var != uj1Var2) {
            uj1Var2 = uj1.INITIALIZED;
        }
        a aVar = new a(ak1Var, uj1Var2);
        if (((a) this.c.c(ak1Var, aVar)) != null || (bk1Var = (bk1) this.e.get()) == null) {
            return;
        }
        if (this.f == 0 && !this.g) {
            z = false;
        } else {
            z = true;
        }
        uj1 c = c(ak1Var);
        this.f++;
        while (aVar.f261a.compareTo(c) < 0 && this.c.e.containsKey(ak1Var)) {
            uj1 uj1Var3 = aVar.f261a;
            ArrayList arrayList = this.i;
            arrayList.add(uj1Var3);
            rj1 rj1Var = tj1.Companion;
            uj1 uj1Var4 = aVar.f261a;
            rj1Var.getClass();
            int ordinal = uj1Var4.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        tj1Var = null;
                    } else {
                        tj1Var = tj1.ON_RESUME;
                    }
                } else {
                    tj1Var = tj1.ON_START;
                }
            } else {
                tj1Var = tj1.ON_CREATE;
            }
            if (tj1Var != null) {
                aVar.a(bk1Var, tj1Var);
                arrayList.remove(arrayList.size() - 1);
                c = c(ak1Var);
            } else {
                throw new IllegalStateException("no event up from " + aVar.f261a);
            }
        }
        if (!z) {
            g();
        }
        this.f--;
    }

    @Override // defpackage.vj1
    public final void b(ak1 ak1Var) {
        d("removeObserver");
        this.c.e(ak1Var);
    }

    public final uj1 c(ak1 ak1Var) {
        fm2 fm2Var;
        uj1 uj1Var;
        a aVar;
        vv0 vv0Var = this.c;
        uj1 uj1Var2 = null;
        if (vv0Var.e.containsKey(ak1Var)) {
            fm2Var = ((fm2) vv0Var.e.get(ak1Var)).d;
        } else {
            fm2Var = null;
        }
        if (fm2Var != null && (aVar = (a) fm2Var.f2120b) != null) {
            uj1Var = aVar.f261a;
        } else {
            uj1Var = null;
        }
        ArrayList arrayList = this.i;
        if (!arrayList.isEmpty()) {
            uj1Var2 = (uj1) arrayList.get(arrayList.size() - 1);
        }
        uj1 uj1Var3 = this.d;
        if (uj1Var == null || uj1Var.compareTo(uj1Var3) >= 0) {
            uj1Var = uj1Var3;
        }
        if (uj1Var2 == null || uj1Var2.compareTo(uj1Var) >= 0) {
            return uj1Var;
        }
        return uj1Var2;
    }

    public final void d(String str) {
        boolean z;
        if (this.f657b) {
            ag.C0().K.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException(hx2.q("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(tj1 tj1Var) {
        d("handleLifecycleEvent");
        f(tj1Var.a());
    }

    public final void f(uj1 uj1Var) {
        boolean z;
        uj1 uj1Var2 = this.d;
        if (uj1Var2 == uj1Var) {
            return;
        }
        uj1 uj1Var3 = uj1.INITIALIZED;
        uj1 uj1Var4 = uj1.DESTROYED;
        if (uj1Var2 == uj1Var3 && uj1Var == uj1Var4) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.d = uj1Var;
            if (!this.g && this.f == 0) {
                this.g = true;
                g();
                this.g = false;
                if (this.d == uj1Var4) {
                    this.c = new vv0();
                    return;
                }
                return;
            }
            this.h = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.d + " in component " + this.e.get()).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck1.g():void");
    }
}
