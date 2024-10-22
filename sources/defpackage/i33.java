package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class i33 implements g33 {

    /* renamed from: a, reason: collision with root package name */
    public volatile g33 f2532a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f2533b;
    public Object c;

    public i33(g33 g33Var) {
        g33Var.getClass();
        this.f2532a = g33Var;
    }

    @Override // defpackage.g33
    public final Object get() {
        if (!this.f2533b) {
            synchronized (this) {
                if (!this.f2533b) {
                    g33 g33Var = this.f2532a;
                    Objects.requireNonNull(g33Var);
                    Object obj = g33Var.get();
                    this.c = obj;
                    this.f2533b = true;
                    this.f2532a = null;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj = this.f2532a;
        if (obj == null) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
