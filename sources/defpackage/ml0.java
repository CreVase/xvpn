package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public class ml0 extends qk0 {
    public int m;

    public ml0(pp3 pp3Var) {
        super(pp3Var);
        if (pp3Var instanceof c91) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    @Override // defpackage.qk0
    public final void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            lk0 lk0Var = (lk0) it.next();
            lk0Var.a(lk0Var);
        }
    }
}
