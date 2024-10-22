package defpackage;

import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public final class nu extends ou {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3540a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3541b;

    public /* synthetic */ nu(Object obj, int i) {
        this.f3540a = i;
        this.f3541b = obj;
    }

    @Override // defpackage.ou
    public final void a(Throwable th) {
        int i = this.f3540a;
        Object obj = this.f3541b;
        switch (i) {
            case 0:
                if (th != null) {
                    ((Future) obj).cancel(false);
                    return;
                }
                return;
            case 1:
                ((yl0) obj).d();
                return;
            default:
                ((x31) obj).invoke(th);
                return;
        }
    }

    @Override // defpackage.x31
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        switch (this.f3540a) {
            case 0:
                a((Throwable) obj);
                return ch3Var;
            case 1:
                a((Throwable) obj);
                return ch3Var;
            default:
                a((Throwable) obj);
                return ch3Var;
        }
    }

    public final String toString() {
        int i = this.f3540a;
        Object obj = this.f3541b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "DisposeOnCancel[" + ((yl0) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((x31) obj).getClass().getSimpleName() + '@' + pe0.u(this) + ']';
        }
    }
}
