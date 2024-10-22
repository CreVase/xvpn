package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.z6;
import defpackage.ch3;
import defpackage.p71;

/* loaded from: classes.dex */
public final class b7 {

    /* renamed from: a, reason: collision with root package name */
    public final z6.a f728a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f729b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public b7(z6.a aVar, boolean z) {
        this.f728a = aVar;
        this.f729b = z;
    }

    public final void a() {
        String str;
        ch3 ch3Var;
        String str2;
        String str3;
        String str4;
        if (!this.f729b) {
            str4 = c7.f737a;
            f6.b(str4, "OMSDK signal impression event OM is disabled by the cb config!");
            return;
        }
        try {
            h b2 = this.f728a.b();
            if (b2 != null) {
                b2.a();
                str3 = c7.f737a;
                f6.a(str3, "Signal om ad event impression occurred!");
                ch3Var = ch3.f636a;
            } else {
                ch3Var = null;
            }
            if (ch3Var == null) {
                str2 = c7.f737a;
                f6.a(str2, "Omid signal impression event is null!");
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void b() {
        String str;
        ch3 ch3Var;
        String str2;
        String str3;
        String str4;
        if (!this.f729b) {
            str4 = c7.f737a;
            f6.b(str4, "OMSDK signal load OM is disabled by the cb config!");
            return;
        }
        try {
            h b2 = this.f728a.b();
            if (b2 != null) {
                b2.b();
                str3 = c7.f737a;
                f6.a(str3, "Signal om ad event loaded!");
                ch3Var = ch3.f636a;
            } else {
                ch3Var = null;
            }
            if (ch3Var == null) {
                str2 = c7.f737a;
                f6.a(str2, "Omid load event is null!");
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void c() {
        String str;
        try {
            g6 a2 = a("signalMediaBufferFinish");
            if (a2 != null) {
                a2.a();
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void d() {
        String str;
        try {
            g6 a2 = a("signalMediaBufferStart");
            if (a2 != null) {
                a2.b();
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void e() {
        String str;
        try {
            g6 a2 = a("signalMediaComplete");
            if (a2 != null) {
                a2.c();
            }
            this.f = true;
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void f() {
        String str;
        String str2;
        try {
            if (!this.c) {
                str2 = c7.f737a;
                f6.a(str2, "Signal media first quartile");
                g6 a2 = a("signalMediaFirstQuartile");
                if (a2 != null) {
                    a2.d();
                }
                this.c = true;
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void g() {
        String str;
        String str2;
        try {
            if (!this.d) {
                str2 = c7.f737a;
                f6.a(str2, "Signal media midpoint");
                g6 a2 = a("signalMediaMidpoint");
                if (a2 != null) {
                    a2.e();
                }
                this.d = true;
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void h() {
        String str;
        try {
            g6 a2 = a("signalMediaPause");
            if (a2 != null) {
                a2.f();
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void i() {
        String str;
        try {
            g6 a2 = a("signalMediaResume");
            if (a2 != null) {
                a2.g();
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void j() {
        String str;
        String str2;
        try {
            if (!this.g && !this.f) {
                str2 = c7.f737a;
                f6.a(str2, "Signal media skipped");
                g6 a2 = a("signalMediaSkipped");
                if (a2 != null) {
                    a2.h();
                }
                this.g = true;
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void k() {
        String str;
        String str2;
        try {
            if (!this.e) {
                str2 = c7.f737a;
                f6.a(str2, "Signal media third quartile");
                g6 a2 = a("signalMediaThirdQuartile");
                if (a2 != null) {
                    a2.i();
                }
                this.e = true;
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void l() {
        String str;
        try {
            g6 a2 = a("signalUserInteractionClick");
            if (a2 != null) {
                a2.a(b6.CLICK);
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void m() {
        String str;
        ch3 ch3Var;
        String str2;
        String str3;
        String str4;
        if (!this.f729b) {
            str4 = c7.f737a;
            f6.b(str4, "OMSDK start session OM is disabled by the cb config!");
            return;
        }
        try {
            l c = this.f728a.c();
            if (c != null) {
                c.b();
                str3 = c7.f737a;
                f6.a(str3, "Omid session started successfully!");
                ch3Var = ch3.f636a;
            } else {
                ch3Var = null;
            }
            if (ch3Var == null) {
                str2 = c7.f737a;
                f6.a(str2, "Omid start session is null!");
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void n() {
        String str;
        String str2;
        String str3;
        if (!this.f729b) {
            str3 = c7.f737a;
            f6.b(str3, "OMSDK stop session OM is disabled by the cb config!");
            return;
        }
        try {
            try {
                l c = this.f728a.c();
                if (c != null) {
                    c.a();
                    c.a(null);
                }
                r6.b();
                str2 = c7.f737a;
                f6.a(str2, "Omid session finished!");
            } catch (Exception e) {
                str = c7.f737a;
                f6.b(str, "OMSDK stop session exception: " + e);
            }
        } finally {
            this.f728a.a((l) null);
            this.f728a.a((h) null);
        }
    }

    public final void a(float f, float f2) {
        String str;
        this.c = false;
        this.d = false;
        this.e = false;
        try {
            g6 a2 = a("signalMediaStart duration: " + f + " and volume " + f2);
            if (a2 != null) {
                a2.a(f, f2);
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void a(float f) {
        String str;
        try {
            g6 a2 = a("signalMediaVolumeChange volume: " + f);
            if (a2 != null) {
                a2.c(f);
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final void a(l7 l7Var) {
        String str;
        try {
            g6 a2 = a("signalMediaStateChange state: " + l7Var.name());
            if (a2 != null) {
                a2.a(l7Var);
            }
        } catch (Exception e) {
            str = c7.f737a;
            p71.z("Error: ", e, str);
        }
    }

    public final g6 a(String str) {
        String str2;
        String str3;
        if (this.f728a.a() == null) {
            str3 = c7.f737a;
            f6.a(str3, "MediaEvents are null when executing " + str);
        } else {
            str2 = c7.f737a;
            f6.a(str2, "MediaEvents valid when executing: " + str);
        }
        return this.f728a.a();
    }
}
