package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class c20 extends b20 {
    public static final void D0(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static final void E0(Collection collection, Object[] objArr) {
        collection.addAll(Arrays.asList(objArr));
    }
}
