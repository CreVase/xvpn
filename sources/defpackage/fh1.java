package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class fh1 extends yg1 {
    public String g;
    public boolean h;

    public fh1(qf1 qf1Var, x31 x31Var) {
        super(qf1Var, x31Var, 1);
        this.h = true;
    }

    @Override // defpackage.yg1, defpackage.l0
    public final eg1 L() {
        return new tg1((Map) this.f);
    }

    @Override // defpackage.yg1, defpackage.l0
    public final void M(String str, eg1 eg1Var) {
        String str2 = null;
        if (this.h) {
            if (eg1Var instanceof wg1) {
                this.g = ((wg1) eg1Var).c();
                this.h = false;
                return;
            } else {
                if (!(eg1Var instanceof tg1)) {
                    if (eg1Var instanceof rf1) {
                        throw t9.c(tf1.f4494b);
                    }
                    throw new j11(null);
                }
                throw t9.c(vg1.f4831b);
            }
        }
        Map map = (Map) this.f;
        String str3 = this.g;
        if (str3 != null) {
            str2 = str3;
        }
        map.put(str2, eg1Var);
        this.h = true;
    }
}
