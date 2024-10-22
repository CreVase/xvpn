package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes2.dex */
public final class n52 extends n1 {
    @Override // defpackage.n1
    public final Random a() {
        return ThreadLocalRandom.current();
    }
}
