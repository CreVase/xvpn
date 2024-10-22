package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class c00 extends fh2 implements d00 {
    public final WeakReference d;
    public final v31 e;
    public List f = new ArrayList();

    public c00(WeakReference weakReference, dy2 dy2Var) {
        this.d = weakReference;
        this.e = dy2Var;
    }

    public static int C(gc3 gc3Var, boolean z) {
        ArrayList arrayList;
        ((zp2) gc3Var.d).o = z;
        int i = 1;
        if (!gc3Var.a() && (arrayList = gc3Var.f2235b) != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                gc3 gc3Var2 = (gc3) it.next();
                if (!gc3Var2.a()) {
                    i += C(gc3Var2, z);
                } else {
                    ((zp2) gc3Var2.d).o = z;
                    i++;
                }
            }
        }
        return i;
    }

    public final void B(gc3 gc3Var) {
        if (gc3Var != null) {
            ArrayList arrayList = gc3Var.f2235b;
            boolean z = true;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (!((zp2) ((gc3) it.next()).d).o) {
                        z = false;
                    }
                }
            }
            if (!z) {
                ((zp2) gc3Var.d).o = z;
            }
            int indexOf = this.f.indexOf(gc3Var);
            if (indexOf >= 0) {
                g(indexOf);
            }
            gc3 gc3Var2 = gc3Var.f2234a;
            if (gc3Var2 != null) {
                B(gc3Var2);
            }
        }
    }

    public final int D(ArrayList arrayList, gc3 gc3Var) {
        int i = 0;
        gc3Var.c = false;
        if (!gc3Var.a()) {
            Iterator it = gc3Var.f2235b.iterator();
            while (it.hasNext()) {
                gc3 gc3Var2 = (gc3) it.next();
                if (gc3Var2.c) {
                    i += D(arrayList, gc3Var2);
                }
                arrayList.remove(gc3Var2);
                i++;
            }
        }
        return i;
    }

    public final int E(ArrayList arrayList, gc3 gc3Var, boolean z, int i) {
        int i2 = i + 1;
        ArrayList arrayList2 = gc3Var.f2235b;
        arrayList.addAll(i2, arrayList2);
        int size = arrayList2.size() + 0;
        if (z) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int E = E(arrayList, (gc3) it.next(), true, i2);
                i2 += E + 1;
                size += E;
            }
        }
        gc3Var.c = true;
        return size;
    }

    public final void F(h hVar) {
        int C;
        int e = hVar.e();
        if (e < 0) {
            return;
        }
        gc3 gc3Var = (gc3) this.f.get(e);
        zp2 zp2Var = (zp2) gc3Var.d;
        boolean z = true;
        boolean z2 = !zp2Var.o;
        if (m20.L(zp2Var.a(), "8ebagyhr8n")) {
            Iterator it = this.f.iterator();
            C = 0;
            while (it.hasNext()) {
                C = C((gc3) it.next(), z2);
            }
        } else {
            C = C(gc3Var, z2);
        }
        RecyclerView recyclerView = (RecyclerView) this.d.get();
        if (recyclerView != null) {
            recyclerView.l0();
        }
        this.f2091a.c(e, C, null);
        B(gc3Var.f2234a);
        int i = 0;
        for (Object obj : this.f) {
            int i2 = i + 1;
            if (i >= 0) {
                gc3 gc3Var2 = (gc3) obj;
                if (i != 0 && gc3Var2.f2234a == null && !((zp2) gc3Var2.d).o) {
                    z = false;
                }
                i = i2;
            } else {
                tf3.y0();
                throw null;
            }
        }
        if (!z) {
            ((zp2) ((gc3) this.f.get(0)).d).o = z;
        }
        g(0);
        this.e.invoke();
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.f.size();
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        b00 b00Var = (b00) hVar;
        if (i < c() && i >= 0) {
            gc3 gc3Var = (gc3) this.f.get(i);
            e00 e00Var = b00Var.u;
            e00Var.setServerNode(gc3Var);
            e00Var.setHolder(b00Var);
            e00Var.setCallback(this);
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        return new b00(new e00(recyclerView.getContext()));
    }
}
