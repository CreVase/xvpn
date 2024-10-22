package defpackage;

import java.util.Collection;

/* loaded from: classes2.dex */
public abstract class a20 extends tf3 {
    public static final int C0(Iterable iterable, int i) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }
}
