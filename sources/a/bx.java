package a;

import androidx.annotation.Keep;

/* loaded from: classes.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f2a;

    /* renamed from: b, reason: collision with root package name */
    public static final Object f3b;

    @Keep
    private long o = 0;

    static {
        Object obj = new Object();
        f3b = obj;
        synchronized (obj) {
            if (!f2a) {
                System.loadLibrary("pnfwifbfud");
                f2a = true;
            }
        }
    }

    @Keep
    private native boolean a();

    @Keep
    private native void b(boolean z);

    @Keep
    private native String c();

    @Keep
    private native void d(String str);

    @Keep
    private native long e();

    @Keep
    private native void f(long j);

    @Keep
    private native long g();

    @Keep
    private native void h(long j);

    @Keep
    private native float i();

    @Keep
    private native void j(float f);

    @Keep
    private native double k();

    @Keep
    private native void l(double d);

    @Keep
    private native byte[] m();

    @Keep
    private native void n(byte[] bArr);

    @Keep
    private native void o();

    @Keep
    private static Class p(String str) throws Exception {
        return bx.class.getClassLoader().loadClass(str);
    }

    @Keep
    private native void p();

    public final void b() {
        o();
    }

    public final void h() {
        p();
    }

    public final boolean q() {
        return a();
    }

    public final byte[] r() {
        return m();
    }

    public final double s() {
        return k();
    }

    public final long t() {
        return g();
    }

    public final String u() {
        return c();
    }

    public final void v(boolean z) {
        b(z);
    }

    public final void w(byte[] bArr) {
        n(bArr);
    }

    public final void x(double d) {
        l(d);
    }

    public final void y(long j) {
        h(j);
    }

    public final void z(String str) {
        d(str);
    }
}
