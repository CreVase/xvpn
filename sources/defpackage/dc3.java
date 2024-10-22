package defpackage;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class dc3 implements cc3 {
    public static volatile hd0 e;

    /* renamed from: a, reason: collision with root package name */
    public final g10 f1758a;

    /* renamed from: b, reason: collision with root package name */
    public final g10 f1759b;
    public final fn2 c;
    public final fi3 d;

    public dc3(g10 g10Var, g10 g10Var2, fn2 fn2Var, fi3 fi3Var, gs3 gs3Var) {
        this.f1758a = g10Var;
        this.f1759b = g10Var2;
        this.c = fn2Var;
        this.d = fi3Var;
        gs3Var.getClass();
        gs3Var.f2317a.execute(new nw3(gs3Var, 13));
    }

    public static dc3 a() {
        hd0 hd0Var = e;
        if (hd0Var != null) {
            return (dc3) hd0Var.g.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (dc3.class) {
                if (e == null) {
                    context.getClass();
                    e = new hd0(context);
                }
            }
        }
    }

    public final ac3 c(ft ftVar) {
        Set singleton;
        byte[] bytes;
        if (ftVar instanceof gr0) {
            ftVar.getClass();
            singleton = Collections.unmodifiableSet(ft.d);
        } else {
            singleton = Collections.singleton(new lr0("proto"));
        }
        y33 a2 = lm.a();
        ftVar.getClass();
        a2.G("cct");
        String str = ftVar.f2147a;
        String str2 = ftVar.f2148b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            Object[] objArr = new Object[4];
            objArr[0] = "1$";
            objArr[1] = str;
            objArr[2] = "\\";
            if (str2 == null) {
                str2 = "";
            }
            objArr[3] = str2;
            bytes = String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
        }
        a2.c = bytes;
        return new ac3(singleton, a2.o(), this);
    }
}
