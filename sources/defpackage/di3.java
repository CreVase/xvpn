package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class di3 implements i43, dk0, qj0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1791a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f1792b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ di3(fi3 fi3Var, Iterable iterable, lm lmVar, long j) {
        this.f1791a = 0;
        this.c = fi3Var;
        this.d = iterable;
        this.e = lmVar;
        this.f1792b = j;
    }

    @Override // defpackage.dk0
    public final ScheduledFuture a(final uo uoVar) {
        int i = this.f1791a;
        long j = this.f1792b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 1:
                final ck0 ck0Var = (ck0) obj3;
                final Callable callable = (Callable) obj2;
                ck0Var.getClass();
                Callable callable2 = new Callable() { // from class: ak0
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        ck0 ck0Var2 = ck0.this;
                        ck0Var2.getClass();
                        return ck0Var2.f655a.submit(new lf(25, callable, uoVar));
                    }
                };
                return ck0Var.f656b.schedule(callable2, j, (TimeUnit) obj);
            default:
                ck0 ck0Var2 = (ck0) obj3;
                ck0Var2.getClass();
                zj0 zj0Var = new zj0(ck0Var2, (Runnable) obj2, uoVar, 2);
                return ck0Var2.f656b.schedule(zj0Var, j, (TimeUnit) obj);
        }
    }

    @Override // defpackage.i43
    public final Object execute() {
        fi3 fi3Var = (fi3) this.c;
        Iterable iterable = (Iterable) this.d;
        lm lmVar = (lm) this.e;
        am2 am2Var = (am2) fi3Var.c;
        am2Var.getClass();
        if (iterable.iterator().hasNext()) {
            am2Var.d(new pi0(2, am2Var, "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + am2.K(iterable), "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name"));
        }
        am2Var.d(new ul2(((gi3) fi3Var.g).a() + this.f1792b, lmVar));
        return null;
    }

    @Override // defpackage.qj0
    public final void g(fb2 fb2Var) {
        String str = (String) this.c;
        String str2 = (String) this.d;
        long j = this.f1792b;
        gm gmVar = (gm) this.e;
        sa0 sa0Var = (sa0) ((ra0) fb2Var.get());
        sa0Var.getClass();
        ((q32) sa0Var.f4298a).a(new di3(str, str2, j, gmVar, 3));
    }

    public /* synthetic */ di3(Object obj, Object obj2, long j, Object obj3, int i) {
        this.f1791a = i;
        this.c = obj;
        this.d = obj2;
        this.f1792b = j;
        this.e = obj3;
    }
}
