package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.CancellationTokenSource;

/* loaded from: classes2.dex */
public final class l63 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l63(Object obj, int i) {
        super(1);
        this.f = i;
        this.g = obj;
    }

    public final String b(int i) {
        int i2 = this.f;
        Object obj = this.g;
        switch (i2) {
            case 2:
                StringBuilder sb = new StringBuilder();
                op2 op2Var = (op2) obj;
                sb.append(op2Var.f[i]);
                sb.append(": ");
                sb.append(op2Var.g[i].a());
                return sb.toString();
            default:
                StringBuilder sb2 = new StringBuilder();
                f62 f62Var = (f62) obj;
                sb2.append(f62Var.e[i]);
                sb2.append(": ");
                sb2.append(f62Var.h(i).a());
                return sb2.toString();
        }
    }

    public final void c(k00 k00Var) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 1:
                k00.a(k00Var, "type", b23.f391b);
                k00.a(k00Var, AppMeasurementSdk.ConditionalUserProperty.VALUE, t9.q("kotlinx.serialization.Polymorphic<" + ((j00) ((j62) obj).f2709a).b() + '>', sp2.f4394a, new mp2[0], md3.A));
                k00Var.f2864a = cr0.f1659a;
                return;
            case 2:
            default:
                kc3 kc3Var = (kc3) obj;
                k00.a(k00Var, "first", kc3Var.f2933a.getDescriptor());
                k00.a(k00Var, "second", kc3Var.f2934b.getDescriptor());
                k00.a(k00Var, "third", kc3Var.c.getDescriptor());
                return;
            case 3:
                k00Var.f2864a = ((as0) obj).d;
                return;
        }
    }

    public final void d(eg1 eg1Var) {
        int i = this.f;
        Object obj = this.g;
        switch (i) {
            case 6:
                l0 l0Var = (l0) obj;
                l0Var.M((String) d20.L0(l0Var.f4237a), eg1Var);
                return;
            default:
                ((ei2) obj).f1938a = eg1Var;
                return;
        }
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                ((CancellationTokenSource) this.g).cancel();
                return ch3Var;
            case 1:
                c((k00) obj);
                return ch3Var;
            case 2:
                return b(((Number) obj).intValue());
            case 3:
                c((k00) obj);
                return ch3Var;
            case 4:
                return b(((Number) obj).intValue());
            case 5:
                c((k00) obj);
                return ch3Var;
            case 6:
                d((eg1) obj);
                return ch3Var;
            default:
                d((eg1) obj);
                return ch3Var;
        }
    }
}
