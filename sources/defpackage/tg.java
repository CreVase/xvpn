package defpackage;

/* loaded from: classes2.dex */
public final class tg {
    public static xg a() {
        long j;
        long j2;
        xg xgVar = xg.head.next;
        if (xgVar == null) {
            long nanoTime = System.nanoTime();
            j = xg.IDLE_TIMEOUT_MILLIS;
            xg.class.wait(j);
            if (xg.head.next != null) {
                return null;
            }
            long nanoTime2 = System.nanoTime() - nanoTime;
            j2 = xg.IDLE_TIMEOUT_NANOS;
            if (nanoTime2 >= j2) {
                return xg.head;
            }
            return null;
        }
        long access$remainingNanos = xg.access$remainingNanos(xgVar, System.nanoTime());
        if (access$remainingNanos <= 0) {
            xg.head.next = xgVar.next;
            xgVar.next = null;
            return xgVar;
        }
        long j3 = access$remainingNanos / 1000000;
        xg.class.wait(j3, (int) (access$remainingNanos - (1000000 * j3)));
        return null;
    }
}
