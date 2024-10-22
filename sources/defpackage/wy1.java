package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class wy1 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final wy1 f5086a = new wy1();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return uk2.f4689a;
    }
}
