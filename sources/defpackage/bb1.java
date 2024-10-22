package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class bb1 extends e1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f434a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f435b;

    public bb1(Object obj, Object obj2) {
        this.f434a = obj;
        this.f435b = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f434a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f435b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
