package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.UUID;

/* loaded from: classes.dex */
public final class bq3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f511a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f512b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bq3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f511a = i;
        this.f = obj;
        this.f512b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f511a) {
            case 0:
                dq3.h((View) this.f512b, (x50) this.d);
                ((ValueAnimator) this.e).start();
                return;
            default:
                try {
                    if (!(((rr2) this.f512b).f2184a instanceof z)) {
                        String uuid = ((UUID) this.c).toString();
                        fs3 e = ((es3) this.f).c.e(uuid);
                        if (e != null && !e.a()) {
                            ((v82) ((es3) this.f).f1987b).g(uuid, (p01) this.d);
                            ((Context) this.e).startService(v43.a((Context) this.e, uuid, (p01) this.d));
                        } else {
                            throw new IllegalStateException("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                        }
                    }
                    ((rr2) this.f512b).h(null);
                    return;
                } catch (Throwable th) {
                    ((rr2) this.f512b).i(th);
                    return;
                }
        }
    }
}
