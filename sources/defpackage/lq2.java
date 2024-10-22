package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class lq2 extends fh2 implements eq2 {
    public final WeakReference d;
    public final f83 e;
    public List f = new ArrayList();
    public jq2 g;

    public lq2(WeakReference weakReference, f83 f83Var) {
        this.d = weakReference;
        this.e = f83Var;
    }

    public final int B(ArrayList arrayList, gc3 gc3Var) {
        int i = 0;
        gc3Var.c = false;
        if (!gc3Var.a()) {
            Iterator it = gc3Var.f2235b.iterator();
            while (it.hasNext()) {
                gc3 gc3Var2 = (gc3) it.next();
                if (gc3Var2.c) {
                    i += B(arrayList, gc3Var2);
                }
                arrayList.remove(gc3Var2);
                i++;
            }
        }
        return i;
    }

    public final int C(ArrayList arrayList, gc3 gc3Var, boolean z, int i) {
        int i2 = i + 1;
        ArrayList arrayList2 = gc3Var.f2235b;
        arrayList.addAll(i2, arrayList2);
        int size = arrayList2.size() + 0;
        if (z) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                int C = C(arrayList, (gc3) it.next(), true, i2);
                i2 += C + 1;
                size += C;
            }
        }
        gc3Var.c = true;
        return size;
    }

    public final void D(h hVar) {
        int e = hVar.e();
        if (e < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        int B = B(arrayList, (gc3) arrayList.get(e));
        RecyclerView recyclerView = (RecyclerView) this.d.get();
        if (recyclerView != null) {
            recyclerView.l0();
        }
        this.f = arrayList;
        g(e);
        this.f2091a.e(e + 1, B);
    }

    public final void E(h hVar) {
        boolean z;
        int e = hVar.e();
        if (e < 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.f);
        gc3 gc3Var = (gc3) arrayList.get(e);
        if (((zp2) gc3Var.d).k == 2) {
            z = true;
        } else {
            z = false;
        }
        int C = C(arrayList, gc3Var, z, e);
        RecyclerView recyclerView = (RecyclerView) this.d.get();
        if (recyclerView != null) {
            recyclerView.l0();
        }
        this.f = arrayList;
        i(e, new Object());
        l(e + 1, C);
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.f.size();
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        if (hVar.f != 1 && i < c() && i >= 0) {
            gc3 gc3Var = (gc3) this.f.get(i);
            zp2 zp2Var = (zp2) gc3Var.d;
            if (zp2Var.k == -1) {
                hVar.f281a.setOnClickListener(new ww2(13, this, zp2Var));
            } else if (hVar instanceof kq2) {
                fq2 fq2Var = ((kq2) hVar).u;
                fq2Var.setServerNode(gc3Var);
                fq2Var.setHolder(hVar);
                fq2Var.setCallback(this);
            }
        }
    }

    @Override // defpackage.fh2
    public final void o(h hVar, int i, List list) {
        boolean z;
        if (i < c() && i >= 0) {
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z && (hVar instanceof kq2)) {
                gc3 gc3Var = (gc3) this.f.get(i);
                fq2 fq2Var = ((kq2) hVar).u;
                fq2Var.setServerNode(gc3Var);
                fq2Var.setHolder(hVar);
                fq2Var.setCallback(this);
            }
            n(hVar, i);
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        return new kq2(new fq2(recyclerView.getContext()), this.e);
    }
}
