package defpackage;

/* loaded from: classes2.dex */
public final class ug extends Thread {
    public ug() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        xg a2;
        while (true) {
            try {
                synchronized (xg.class) {
                    xg.Companion.getClass();
                    a2 = tg.a();
                    if (a2 == xg.head) {
                        xg.head = null;
                        return;
                    }
                }
                if (a2 != null) {
                    a2.timedOut();
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}
