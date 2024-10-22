package defpackage;

import java.util.Random;

/* loaded from: classes2.dex */
public final class pv0 extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        return new Random();
    }
}
