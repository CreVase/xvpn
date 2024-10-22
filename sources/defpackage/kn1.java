package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class kn1 extends fh2 implements te3 {
    public final List d;
    public x31 e;
    public v31 f;
    public v31 g;

    public kn1(ArrayList arrayList) {
        this.d = arrayList;
        A(true);
    }

    public final int B(gc3 gc3Var) {
        int i = 0;
        gc3Var.c = false;
        if (!gc3Var.a()) {
            Iterator it = gc3Var.f2235b.iterator();
            while (it.hasNext()) {
                gc3 gc3Var2 = (gc3) it.next();
                if (gc3Var2.c) {
                    i += B(gc3Var2);
                }
                this.d.remove(gc3Var2);
                i++;
            }
        }
        return i;
    }

    public final int C(gc3 gc3Var, boolean z, int i) {
        int i2 = i + 1;
        ArrayList arrayList = gc3Var.f2235b;
        this.d.addAll(i2, arrayList);
        int i3 = 0;
        int size = arrayList.size() + 0;
        if (z) {
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 >= 0) {
                    int C = C((gc3) obj, true, i2);
                    i2 += C + 1;
                    size += C;
                    i3 = i4;
                } else {
                    tf3.y0();
                    throw null;
                }
            }
        }
        gc3Var.c = true;
        return size;
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.d.size();
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        int hashCode;
        gc3 gc3Var = (gc3) this.d.get(i);
        zp2 zp2Var = (zp2) gc3Var.d;
        if (zp2Var != null) {
            hashCode = zp2Var.a().hashCode();
        } else {
            hashCode = gc3Var.hashCode();
        }
        return hashCode;
    }

    @Override // defpackage.fh2
    public final void n(h hVar, int i) {
        jn1 jn1Var = (jn1) hVar;
        gc3 gc3Var = (gc3) this.d.get(i);
        ue3 ue3Var = jn1Var.u;
        ue3Var.setServerNode(gc3Var);
        ue3Var.setHolder(jn1Var);
        ue3Var.setCallback(this);
    }

    @Override // defpackage.fh2
    public final void o(h hVar, int i, List list) {
        boolean z;
        jn1 jn1Var = (jn1) hVar;
        if (i < c() && i >= 0) {
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                gc3 gc3Var = (gc3) this.d.get(i);
                ue3 ue3Var = jn1Var.u;
                ue3Var.setServerNode(gc3Var);
                ue3Var.setHolder(jn1Var);
                ue3Var.setCallback(this);
            }
            n(jn1Var, i);
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        return new jn1(new ue3(recyclerView.getContext()));
    }
}
