package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class ns1 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ os1 f3528b;

    public ns1(os1 os1Var, ur1 ur1Var) {
        this.f3528b = os1Var;
        Handler k = wi3.k(this);
        this.f3527a = k;
        ur1Var.f(this, k);
    }

    public final void a(long j) {
        os1 os1Var = this.f3528b;
        if (this == os1Var.w1 && os1Var.G != null) {
            if (j == Long.MAX_VALUE) {
                os1Var.H0 = true;
                return;
            }
            try {
                os1Var.p0(j);
                os1Var.y0();
                os1Var.J0.e++;
                os1Var.x0();
                os1Var.Y(j);
            } catch (jt0 e) {
                os1Var.I0 = e;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        int i3 = wi3.f5017a;
        a(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
