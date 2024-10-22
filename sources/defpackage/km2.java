package defpackage;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public final class km2 implements ui1, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(km2.class, Object.class, "b");

    /* renamed from: a, reason: collision with root package name */
    public volatile v31 f2975a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f2976b = v73.f4790a;

    public km2(v31 v31Var) {
        this.f2975a = v31Var;
    }

    @Override // defpackage.ui1
    public final Object getValue() {
        boolean z;
        Object obj = this.f2976b;
        v73 v73Var = v73.f4790a;
        if (obj != v73Var) {
            return obj;
        }
        v31 v31Var = this.f2975a;
        if (v31Var != null) {
            Object invoke = v31Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, v73Var, invoke)) {
                    z = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != v73Var) {
                    z = false;
                    break;
                }
            }
            if (z) {
                this.f2975a = null;
                return invoke;
            }
        }
        return this.f2976b;
    }

    public final String toString() {
        boolean z;
        if (this.f2976b != v73.f4790a) {
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
