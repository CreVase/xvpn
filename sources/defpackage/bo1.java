package defpackage;

import android.util.Log;

/* loaded from: classes.dex */
public final class bo1 implements fv0 {

    /* renamed from: b, reason: collision with root package name */
    public static bo1 f498b;

    /* renamed from: a, reason: collision with root package name */
    public final int f499a;

    public /* synthetic */ bo1(int i) {
        this.f499a = i;
    }

    public static synchronized bo1 c() {
        bo1 bo1Var;
        synchronized (bo1.class) {
            if (f498b == null) {
                f498b = new bo1(3);
            }
            bo1Var = f498b;
        }
        return bo1Var;
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(Throwable... thArr) {
        if (this.f499a <= 3 && thArr.length >= 1) {
            Throwable th = thArr[0];
        }
    }

    public void b(String str, String str2, Throwable... thArr) {
        if (this.f499a <= 6) {
            if (thArr.length >= 1) {
                Log.e(str, str2, thArr[0]);
            } else {
                Log.e(str, str2);
            }
        }
    }

    public void d(String str, String str2, Throwable... thArr) {
        if (this.f499a <= 4) {
            if (thArr.length >= 1) {
                Log.i(str, str2, thArr[0]);
            } else {
                Log.i(str, str2);
            }
        }
    }

    public void f(Throwable... thArr) {
        if (this.f499a <= 5 && thArr.length >= 1) {
            Throwable th = thArr[0];
        }
    }

    @Override // defpackage.fv0
    public void j() {
        switch (this.f499a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.fv0
    public xa3 l(int i, int i2) {
        switch (this.f499a) {
            case 0:
                return new no0();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.fv0
    public void m(lo2 lo2Var) {
        switch (this.f499a) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
