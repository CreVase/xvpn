package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public interface wd1 extends List, RandomAccess {
    boolean isModifiable();

    void makeImmutable();

    wd1 mutableCopyWithCapacity(int i);
}
