package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class tk2 extends t32 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final tk2 f4523a = new tk2();

    @Override // defpackage.t32
    public final t32 a() {
        return xy1.f5247a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }
}
