package defpackage;

import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.XApplication;

/* loaded from: classes2.dex */
public final /* synthetic */ class iy2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2674a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SplashActivity f2675b;

    public /* synthetic */ iy2(SplashActivity splashActivity, int i) {
        this.f2674a = i;
        this.f2675b = splashActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2674a;
        int i2 = 1;
        SplashActivity splashActivity = this.f2675b;
        switch (i) {
            case 0:
                int i3 = SplashActivity.o;
                XApplication.d();
                try {
                    splashActivity.runOnUiThread(new iy2(splashActivity, i2));
                    try {
                        rx0.a().c(ew3.w());
                    } catch (Exception unused) {
                    }
                    rt3.e().d();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                if (splashActivity.l.getAndSet(true)) {
                    splashActivity.Z();
                    return;
                }
                return;
        }
    }
}
