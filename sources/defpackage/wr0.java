package defpackage;

/* loaded from: classes2.dex */
public final class wr0 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ xr0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr0(int i, String str, xr0 xr0Var) {
        super(0);
        this.f = i;
        this.g = str;
        this.h = xr0Var;
    }

    @Override // defpackage.v31
    public final Object invoke() {
        int i = this.f;
        mp2[] mp2VarArr = new mp2[i];
        for (int i2 = 0; i2 < i; i2++) {
            mp2VarArr[i2] = t9.q(this.g + '.' + this.h.e[i2], o23.d, new mp2[0], md3.A);
        }
        return mp2VarArr;
    }
}
