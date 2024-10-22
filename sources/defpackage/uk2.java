package defpackage;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class uk2 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public static final uk2 f4689a = new uk2();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj2).compareTo((Comparable) obj);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return wy1.f5086a;
    }
}
