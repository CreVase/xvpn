package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final /* synthetic */ class kg0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mg0 f2940a;

    public final void a(int i) {
        int i2;
        mg0 mg0Var = this.f2940a;
        synchronized (mg0Var) {
            int i3 = mg0Var.i;
            if (i3 == 0 || mg0Var.e) {
                if (i3 != i) {
                    mg0Var.i = i;
                    if (i != 1 && i != 0 && i != 8) {
                        mg0Var.l = mg0Var.b(i);
                        ((t43) mg0Var.d).getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (mg0Var.f > 0) {
                            i2 = (int) (elapsedRealtime - mg0Var.g);
                        } else {
                            i2 = 0;
                        }
                        mg0Var.c(i2, mg0Var.h, mg0Var.l);
                        mg0Var.g = elapsedRealtime;
                        mg0Var.h = 0L;
                        mg0Var.k = 0L;
                        mg0Var.j = 0L;
                        gw2 gw2Var = mg0Var.c;
                        gw2Var.f2335b.clear();
                        gw2Var.d = -1;
                        gw2Var.e = 0;
                        gw2Var.f = 0;
                    }
                }
            }
        }
    }
}
