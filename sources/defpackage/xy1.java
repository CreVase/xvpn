package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class xy1 extends t32 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final xy1 f5247a = new xy1();

    @Override // defpackage.t32
    public final t32 a() {
        return tk2.f4523a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
