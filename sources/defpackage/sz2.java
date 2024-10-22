package defpackage;

import a.du;

/* loaded from: classes2.dex */
public final class sz2 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ sn g;
    public final /* synthetic */ boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz2(sn snVar, boolean z, int i) {
        super(0);
        this.f = i;
        this.g = snVar;
        this.h = z;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m249invoke();
                return ch3Var;
            case 1:
                m249invoke();
                return ch3Var;
            case 2:
                m249invoke();
                return ch3Var;
            case 3:
                m249invoke();
                return ch3Var;
            default:
                m249invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m249invoke() {
        int i = this.f;
        boolean z = this.h;
        sn snVar = this.g;
        switch (i) {
            case 0:
                tz2 tz2Var = (tz2) snVar;
                int i2 = tz2.m;
                tz2Var.E(z);
                tz2Var.l = null;
                return;
            case 1:
                du.d(134, null);
                int i3 = tz2.m;
                ((tz2) snVar).G(z);
                return;
            case 2:
                tz2 tz2Var2 = (tz2) snVar;
                int i4 = tz2.m;
                tz2Var2.G(z);
                tz2Var2.l = null;
                return;
            case 3:
                tz2 tz2Var3 = (tz2) snVar;
                int i5 = tz2.m;
                tz2Var3.H(z);
                tz2Var3.l = null;
                return;
            default:
                in1 in1Var = (in1) snVar;
                in1Var.G(in1Var.p, in1Var.s != z);
                return;
        }
    }
}
