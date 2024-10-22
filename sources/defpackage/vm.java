package defpackage;

import android.os.Process;

/* loaded from: classes2.dex */
public abstract class vm implements Runnable {
    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
