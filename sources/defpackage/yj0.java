package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class yj0 implements dk0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ck0 f5347b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TimeUnit f;

    public /* synthetic */ yj0(ck0 ck0Var, Runnable runnable, long j, long j2, TimeUnit timeUnit, int i) {
        this.f5346a = i;
        this.f5347b = ck0Var;
        this.c = runnable;
        this.d = j;
        this.e = j2;
        this.f = timeUnit;
    }

    @Override // defpackage.dk0
    public final ScheduledFuture a(uo uoVar) {
        int i = this.f5346a;
        Runnable runnable = this.c;
        ck0 ck0Var = this.f5347b;
        switch (i) {
            case 0:
                return ck0Var.f656b.scheduleWithFixedDelay(new zj0(ck0Var, runnable, uoVar, 1), this.d, this.e, this.f);
            default:
                return ck0Var.f656b.scheduleAtFixedRate(new zj0(ck0Var, runnable, uoVar, 0), this.d, this.e, this.f);
        }
    }
}
