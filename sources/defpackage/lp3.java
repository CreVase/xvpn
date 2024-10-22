package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class lp3 extends r70 {
    public ArrayList q0 = new ArrayList();

    @Override // defpackage.r70
    public void D() {
        this.q0.clear();
        super.D();
    }

    @Override // defpackage.r70
    public final void G(wq2 wq2Var) {
        super.G(wq2Var);
        int size = this.q0.size();
        for (int i = 0; i < size; i++) {
            ((r70) this.q0.get(i)).G(wq2Var);
        }
    }

    public abstract void R();
}
