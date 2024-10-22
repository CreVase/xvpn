package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class nf implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        new Thread(runnable).start();
    }
}
