package defpackage;

import android.graphics.Typeface;

/* loaded from: classes2.dex */
public final class m01 extends ji1 implements v31 {
    public static final m01 g = new m01(0);
    public static final m01 h = new m01(1);
    public static final m01 i = new m01(2);
    public static final m01 j = new m01(3);
    public static final m01 k = new m01(4);
    public static final m01 l = new m01(5);
    public static final m01 m = new m01(6);
    public static final m01 n = new m01(7);
    public static final m01 o = new m01(8);
    public static final m01 p = new m01(9);
    public static final m01 q = new m01(10);
    public static final m01 r = new m01(11);
    public static final m01 s = new m01(12);
    public static final m01 t = new m01(13);
    public static final m01 u = new m01(14);
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m01(int i2) {
        super(0);
        this.f = i2;
    }

    public final mp2 b() {
        switch (this.f) {
            case 10:
                return zg1.f5477b;
            case 11:
                return sg1.f4338b;
            case 12:
                return mg1.f3291b;
            case 13:
                return vg1.f4831b;
            default:
                return tf1.f4494b;
        }
    }

    public final Typeface c() {
        switch (this.f) {
            case 0:
                return Typeface.DEFAULT_BOLD;
            case 1:
                return Typeface.create(Typeface.DEFAULT, 2);
            case 2:
                return Typeface.create("sans-serif-light", 0);
            case 3:
                return Typeface.create("sans-serif-medium", 0);
            default:
                return Typeface.DEFAULT;
        }
    }

    @Override // defpackage.v31
    public final Object invoke() {
        boolean z;
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return c();
            case 3:
                return c();
            case 4:
                return c();
            case 5:
                m110invoke();
                return ch3Var;
            case 6:
                m110invoke();
                return ch3Var;
            case 7:
                m110invoke();
                return ch3Var;
            case 8:
                m110invoke();
                return ch3Var;
            case 9:
                try {
                    pe0.b();
                    pe0.b();
                    z = true;
                } catch (Throwable unused) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                return b();
            case 11:
                return b();
            case 12:
                return b();
            case 13:
                return b();
            default:
                return b();
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m110invoke() {
        switch (this.f) {
            case 5:
            case 6:
                return;
            case 7:
                ew3.p();
                return;
            default:
                t9.a();
                rt3.e().m();
                tf3.x0(n);
                return;
        }
    }
}
