package defpackage;

/* loaded from: classes2.dex */
public final class vi1 implements fb2 {
    public static final Object c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f4839a = c;

    /* renamed from: b, reason: collision with root package name */
    public volatile fb2 f4840b;

    public vi1(fb2 fb2Var) {
        this.f4840b = fb2Var;
    }

    @Override // defpackage.fb2
    public final Object get() {
        Object obj = this.f4839a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.f4839a;
                if (obj == obj2) {
                    obj = this.f4840b.get();
                    this.f4839a = obj;
                    this.f4840b = null;
                }
            }
        }
        return obj;
    }
}
