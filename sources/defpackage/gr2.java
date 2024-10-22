package defpackage;

import android.os.SystemClock;

/* loaded from: classes2.dex */
public final class gr2 {

    /* renamed from: a, reason: collision with root package name */
    public final t83 f2310a;

    /* renamed from: b, reason: collision with root package name */
    public final t90 f2311b;
    public final fy0 c;
    public final lr2 d;
    public final iq e;
    public long f;
    public final ew0 g;

    public gr2(v73 v73Var, t90 t90Var, fy0 fy0Var, lr2 lr2Var, iq iqVar) {
        this.f2310a = v73Var;
        this.f2311b = t90Var;
        this.c = fy0Var;
        this.d = lr2Var;
        this.e = iqVar;
        int i = po0.d;
        this.f = fl.d0(SystemClock.elapsedRealtime(), to0.c);
        a();
        this.g = new ew0(this, 1);
    }

    public final void a() {
        String a2;
        iq iqVar = this.e;
        int i = iqVar.f2633b + 1;
        iqVar.f2633b = i;
        Object obj = iqVar.e;
        if (i == 0) {
            a2 = (String) obj;
        } else {
            a2 = iqVar.a();
        }
        int i2 = iqVar.f2633b;
        ((v73) ((t83) iqVar.c)).getClass();
        ar2 ar2Var = new ar2(1000 * System.currentTimeMillis(), a2, (String) obj, i2);
        iqVar.f = ar2Var;
        zf3.T(pd0.d(this.f2311b), null, new fr2(this, ar2Var, null), 3);
    }
}
