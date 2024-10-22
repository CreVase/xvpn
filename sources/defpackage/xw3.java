package defpackage;

/* loaded from: classes2.dex */
public final class xw3 implements yw3 {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile yw3 f5239a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f5240b = c;

    public xw3(yw3 yw3Var) {
        this.f5239a = yw3Var;
    }

    public static yw3 a(yw3 yw3Var) {
        if (yw3Var instanceof xw3) {
            return yw3Var;
        }
        return new xw3(yw3Var);
    }

    @Override // defpackage.yw3
    public final Object zza() {
        Object obj = this.f5240b;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f5240b;
                if (obj == obj2) {
                    obj = this.f5239a.zza();
                    Object obj3 = this.f5240b;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.f5240b = obj;
                    this.f5239a = null;
                }
            }
        }
        return obj;
    }
}
