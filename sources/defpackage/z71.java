package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class z71 extends r70 implements x71 {
    public r70[] q0 = new r70[4];
    public int r0 = 0;

    public final void R(int i, np3 np3Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            r70 r70Var = this.q0[i2];
            ArrayList arrayList2 = np3Var.f3513a;
            if (!arrayList2.contains(r70Var)) {
                arrayList2.add(r70Var);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            pe0.r(this.q0[i3], i, arrayList, np3Var);
        }
    }

    public void a() {
    }
}
