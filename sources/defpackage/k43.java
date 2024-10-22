package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class k43 implements ui1, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public v31 f2884a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2885b = v73.f4790a;
    public final Object c = this;

    public k43(v31 v31Var) {
        this.f2884a = v31Var;
    }

    @Override // defpackage.ui1
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f2885b;
        v73 v73Var = v73.f4790a;
        if (obj2 != v73Var) {
            return obj2;
        }
        synchronized (this.c) {
            obj = this.f2885b;
            if (obj == v73Var) {
                obj = this.f2884a.invoke();
                this.f2885b = obj;
                this.f2884a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        boolean z;
        if (this.f2885b != v73.f4790a) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
