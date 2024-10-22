package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class kn {
    public static v31 d;

    /* renamed from: a, reason: collision with root package name */
    public final String f2978a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2979b;
    public WeakReference c = new WeakReference(null);

    public kn(String str, String str2) {
        this.f2978a = str;
        this.f2979b = str2;
    }

    public final void a(String str) {
        String str2 = this.f2978a;
        lb2 s = ew3.s(str2);
        String str3 = s.f3096a;
        String str4 = s.c;
        String str5 = s.f3097b;
        StringBuilder q = p71.q("load ", str3, " ", str4, " ");
        q.append(str5);
        q.append(" failed: ");
        q.append(str);
        String sb = q.toString();
        Object[] objArr = new Object[0];
        if (ew3.T()) {
            Log.i("===DebugLog===", sb + " " + Arrays.toString(objArr));
        }
        p71.x(str2, 246);
    }

    public final void b() {
        String str = this.f2978a;
        lb2 s = ew3.s(str);
        String s2 = hx2.s(p71.q("load ", s.f3096a, " ", s.c, " "), s.f3097b, " success");
        Object[] objArr = new Object[0];
        if (ew3.T()) {
            Log.i("===DebugLog===", s2 + " " + Arrays.toString(objArr));
        }
        p71.x(str, 245);
    }

    public final void c(ep2 ep2Var, String str) {
        lb2 s = ew3.s(this.f2978a);
        String str2 = s.f3096a;
        String str3 = s.c;
        String str4 = s.f3097b;
        StringBuilder q = p71.q("play ", str2, " ", str3, " ");
        q.append(str4);
        q.append(" failed: ");
        q.append(str);
        String sb = q.toString();
        Object[] objArr = new Object[0];
        if (ew3.T()) {
            Log.i("===DebugLog===", sb + " " + Arrays.toString(objArr));
        }
        ep2Var.j(Boolean.FALSE);
    }

    public final void d(ep2 ep2Var) {
        String str = this.f2978a;
        lb2 s = ew3.s(str);
        String s2 = hx2.s(p71.q("play ", s.f3096a, " ", s.c, " "), s.f3097b, " success");
        Object[] objArr = new Object[0];
        if (ew3.T()) {
            Log.i("===DebugLog===", s2 + " " + Arrays.toString(objArr));
        }
        p71.x(str, 254);
        ep2Var.j(Boolean.TRUE);
    }

    public void e() {
    }

    public void f() {
    }

    public abstract ch3 g(y82 y82Var);

    public abstract ch3 h();
}
