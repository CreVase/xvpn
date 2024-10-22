package defpackage;

import android.os.Process;

/* loaded from: classes.dex */
public final class mj2 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final int f3308a;

    public mj2(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f3308a = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f3308a);
        super.run();
    }
}
