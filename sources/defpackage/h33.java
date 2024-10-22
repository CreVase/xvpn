package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class h33 implements g33, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final g33 f2359a;

    /* renamed from: b, reason: collision with root package name */
    public volatile transient boolean f2360b;
    public transient Object c;

    public h33(g33 g33Var) {
        g33Var.getClass();
        this.f2359a = g33Var;
    }

    @Override // defpackage.g33
    public final Object get() {
        if (!this.f2360b) {
            synchronized (this) {
                if (!this.f2360b) {
                    Object obj = this.f2359a.get();
                    this.c = obj;
                    this.f2360b = true;
                    return obj;
                }
            }
        }
        return this.c;
    }

    public final String toString() {
        Object obj;
        if (this.f2360b) {
            String valueOf = String.valueOf(this.c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 25);
            sb.append("<supplier that returned ");
            sb.append(valueOf);
            sb.append(">");
            obj = sb.toString();
        } else {
            obj = this.f2359a;
        }
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 19);
        sb2.append("Suppliers.memoize(");
        sb2.append(valueOf2);
        sb2.append(")");
        return sb2.toString();
    }
}
