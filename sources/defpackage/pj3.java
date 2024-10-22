package defpackage;

/* loaded from: classes.dex */
public abstract class pj3 extends oj3 {

    /* renamed from: a, reason: collision with root package name */
    public z42[] f3856a;

    /* renamed from: b, reason: collision with root package name */
    public String f3857b;
    public int c;
    public final int d;

    public pj3() {
        this.f3856a = null;
        this.c = 0;
    }

    public z42[] getPathData() {
        return this.f3856a;
    }

    public String getPathName() {
        return this.f3857b;
    }

    public void setPathData(z42[] z42VarArr) {
        if (!ew3.A0(this.f3856a, z42VarArr)) {
            this.f3856a = ew3.K0(z42VarArr);
            return;
        }
        z42[] z42VarArr2 = this.f3856a;
        for (int i = 0; i < z42VarArr.length; i++) {
            z42VarArr2[i].f5423a = z42VarArr[i].f5423a;
            int i2 = 0;
            while (true) {
                float[] fArr = z42VarArr[i].f5424b;
                if (i2 < fArr.length) {
                    z42VarArr2[i].f5424b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public pj3(pj3 pj3Var) {
        this.f3856a = null;
        this.c = 0;
        this.f3857b = pj3Var.f3857b;
        this.d = pj3Var.d;
        this.f3856a = ew3.K0(pj3Var.f3856a);
    }
}
