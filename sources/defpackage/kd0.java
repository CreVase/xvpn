package defpackage;

/* loaded from: classes.dex */
public final class kd0 extends y03 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2936a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2937b;

    public kd0(Object obj, int i) {
        this.f2936a = obj;
        this.f2937b = i;
    }

    public final void a() {
        int i;
        boolean z = false;
        Object obj = this.f2936a;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        if (i == this.f2937b) {
            z = true;
        }
        if (z) {
        } else {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
