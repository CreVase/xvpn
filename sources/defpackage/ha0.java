package defpackage;

import java.io.IOException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ha0 {

    /* renamed from: a, reason: collision with root package name */
    public final nd0 f2388a;

    /* renamed from: b, reason: collision with root package name */
    public final ga0 f2389b;

    public ha0(nd0 nd0Var, jx0 jx0Var) {
        this.f2388a = nd0Var;
        this.f2389b = new ga0(jx0Var);
    }

    public final void a(ir2 ir2Var) {
        Objects.toString(ir2Var);
        ga0 ga0Var = this.f2389b;
        String str = ir2Var.f2639a;
        synchronized (ga0Var) {
            if (!Objects.equals(ga0Var.c, str)) {
                jx0 jx0Var = ga0Var.f2219a;
                String str2 = ga0Var.f2220b;
                if (str2 != null && str != null) {
                    try {
                        jx0Var.o(str2, "aqs.".concat(str)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                ga0Var.c = str;
            }
        }
    }

    public final void b(String str) {
        ga0 ga0Var = this.f2389b;
        synchronized (ga0Var) {
            if (!Objects.equals(ga0Var.f2220b, str)) {
                jx0 jx0Var = ga0Var.f2219a;
                String str2 = ga0Var.c;
                if (str != null && str2 != null) {
                    try {
                        jx0Var.o(str, "aqs.".concat(str2)).createNewFile();
                    } catch (IOException unused) {
                    }
                }
                ga0Var.f2220b = str;
            }
        }
    }
}
