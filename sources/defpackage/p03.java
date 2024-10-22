package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class p03 implements rr1 {

    /* renamed from: a, reason: collision with root package name */
    public final f10 f3762a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3763b;
    public long c;
    public long d;
    public q52 e = q52.d;

    public p03(f10 f10Var) {
        this.f3762a = f10Var;
    }

    @Override // defpackage.rr1
    public final void a(q52 q52Var) {
        if (this.f3763b) {
            c(b());
        }
        this.e = q52Var;
    }

    @Override // defpackage.rr1
    public final long b() {
        long j;
        long j2 = this.c;
        if (this.f3763b) {
            ((t43) this.f3762a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.d;
            if (this.e.f3957a == 1.0f) {
                j = wi3.C(elapsedRealtime);
            } else {
                j = elapsedRealtime * r4.c;
            }
            return j2 + j;
        }
        return j2;
    }

    public final void c(long j) {
        this.c = j;
        if (this.f3763b) {
            ((t43) this.f3762a).getClass();
            this.d = SystemClock.elapsedRealtime();
        }
    }

    @Override // defpackage.rr1
    public final q52 d() {
        return this.e;
    }

    public final void e() {
        if (!this.f3763b) {
            ((t43) this.f3762a).getClass();
            this.d = SystemClock.elapsedRealtime();
            this.f3763b = true;
        }
    }
}
