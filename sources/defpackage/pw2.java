package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pw2 {
    private static final Iterator<Object> ITERATOR = new lw2();
    private static final Iterable<Object> ITERABLE = new nw2();

    private pw2() {
    }

    public static <T> Iterable<T> iterable() {
        return (Iterable<T>) ITERABLE;
    }
}
