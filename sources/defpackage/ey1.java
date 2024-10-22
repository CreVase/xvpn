package defpackage;

import androidx.lifecycle.b;

/* loaded from: classes.dex */
public class ey1 extends b {
    @Override // androidx.lifecycle.b
    public void i(Object obj) {
        b.a("setValue");
        this.g++;
        this.e = obj;
        c(null);
    }

    public final void j(Object obj) {
        boolean z;
        synchronized (this.f263a) {
            if (this.f == b.k) {
                z = true;
            } else {
                z = false;
            }
            this.f = obj;
        }
        if (z) {
            ag.C0().D0(this.j);
        }
    }
}
