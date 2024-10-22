package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class th3 implements ui1, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public v31 f4506a;

    /* renamed from: b, reason: collision with root package name */
    public Object f4507b = v73.f4790a;

    public th3(v31 v31Var) {
        this.f4506a = v31Var;
    }

    @Override // defpackage.ui1
    public final Object getValue() {
        if (this.f4507b == v73.f4790a) {
            this.f4507b = this.f4506a.invoke();
            this.f4506a = null;
        }
        return this.f4507b;
    }

    public final String toString() {
        boolean z;
        if (this.f4507b != v73.f4790a) {
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
