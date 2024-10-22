package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class np3 {
    public static int f;

    /* renamed from: b, reason: collision with root package name */
    public final int f3514b;
    public int c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3513a = new ArrayList();
    public ArrayList d = null;
    public int e = -1;

    public np3(int i) {
        this.f3514b = -1;
        int i2 = f;
        f = i2 + 1;
        this.f3514b = i2;
        this.c = i;
    }

    public final void a(ArrayList arrayList) {
        int size = this.f3513a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                np3 np3Var = (np3) arrayList.get(i);
                if (this.e == np3Var.f3514b) {
                    c(this.c, np3Var);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(ok1 ok1Var, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.f3513a;
        if (arrayList.size() == 0) {
            return 0;
        }
        s70 s70Var = (s70) ((r70) arrayList.get(0)).T;
        ok1Var.t();
        s70Var.c(ok1Var, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((r70) arrayList.get(i2)).c(ok1Var, false);
        }
        if (i == 0 && s70Var.z0 > 0) {
            t9.k(s70Var, ok1Var, arrayList, 0);
        }
        if (i == 1 && s70Var.A0 > 0) {
            t9.k(s70Var, ok1Var, arrayList, 1);
        }
        try {
            ok1Var.p();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.d.add(new mp3(this, (r70) arrayList.get(i3), ok1Var, i));
        }
        if (i == 0) {
            n = ok1.n(s70Var.I);
            n2 = ok1.n(s70Var.K);
            ok1Var.t();
        } else {
            n = ok1.n(s70Var.J);
            n2 = ok1.n(s70Var.L);
            ok1Var.t();
        }
        return n2 - n;
    }

    public final void c(int i, np3 np3Var) {
        Iterator it = this.f3513a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            int i2 = np3Var.f3514b;
            if (hasNext) {
                r70 r70Var = (r70) it.next();
                ArrayList arrayList = np3Var.f3513a;
                if (!arrayList.contains(r70Var)) {
                    arrayList.add(r70Var);
                }
                if (i == 0) {
                    r70Var.n0 = i2;
                } else {
                    r70Var.o0 = i2;
                }
            } else {
                this.e = i2;
                return;
            }
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String r = hx2.r(sb, this.f3514b, "] <");
        Iterator it = this.f3513a.iterator();
        while (it.hasNext()) {
            r70 r70Var = (r70) it.next();
            StringBuilder p = p71.p(r, " ");
            p.append(r70Var.h0);
            r = p.toString();
        }
        return p71.l(r, " >");
    }
}
