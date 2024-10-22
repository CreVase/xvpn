package defpackage;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class cw3 implements ThreadFactory {
    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "zwprnjyev2-thread");
    }
}
