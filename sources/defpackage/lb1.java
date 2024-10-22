package defpackage;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class lb1 extends kh3 {

    /* renamed from: a, reason: collision with root package name */
    public final kh3 f3094a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3095b = null;
    public kh3 c = xe1.e;

    public lb1(nb1 nb1Var) {
        this.f3094a = nb1Var.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.c.hasNext() && !this.f3094a.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f3094a.next();
            this.f3095b = entry.getKey();
            this.c = ((ab1) entry.getValue()).iterator();
        }
        Object obj = this.f3095b;
        Objects.requireNonNull(obj);
        return new bb1(obj, this.c.next());
    }
}
