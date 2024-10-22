package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes2.dex */
public final class up1 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ uh1 g;
    public final /* synthetic */ uh1 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up1(uh1 uh1Var, uh1 uh1Var2, int i) {
        super(1);
        this.f = i;
        this.g = uh1Var;
        this.h = uh1Var2;
    }

    public final void a(k00 k00Var) {
        int i = this.f;
        uh1 uh1Var = this.h;
        uh1 uh1Var2 = this.g;
        switch (i) {
            case 0:
                k00.a(k00Var, "key", uh1Var2.getDescriptor());
                k00.a(k00Var, AppMeasurementSdk.ConditionalUserProperty.VALUE, uh1Var.getDescriptor());
                return;
            default:
                k00.a(k00Var, "first", uh1Var2.getDescriptor());
                k00.a(k00Var, "second", uh1Var.getDescriptor());
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                a((k00) obj);
                return ch3Var;
            default:
                a((k00) obj);
                return ch3Var;
        }
    }
}
