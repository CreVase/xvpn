package defpackage;

import android.os.Handler;

/* loaded from: classes2.dex */
public final class hs2 implements hv3 {
    public static hs2 f;

    /* renamed from: a, reason: collision with root package name */
    public float f2479a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2480b;
    public final Object c;
    public Object d;
    public Object e;

    public hs2(v73 v73Var, c02 c02Var) {
        this.f2480b = v73Var;
        this.c = c02Var;
    }

    public static hs2 b() {
        if (f == null) {
            f = new hs2(new v73(), new c02(29));
        }
        return f;
    }

    @Override // defpackage.hv3
    public final void a(boolean z) {
        if (z) {
            hc3.g.getClass();
            hc3.c();
            return;
        }
        hc3.g.getClass();
        Handler handler = hc3.i;
        if (handler != null) {
            handler.removeCallbacks(hc3.k);
            hc3.i = null;
        }
    }
}
