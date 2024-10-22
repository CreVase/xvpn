package defpackage;

import com.vungle.ads.VungleError;

/* loaded from: classes2.dex */
public abstract class qr {

    /* renamed from: a, reason: collision with root package name */
    public static final qw f4042a = new qw(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f4043b = pd0.Q("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);
    public static final int c = pd0.Q("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", VungleError.DEFAULT, 0, 0, 12);
    public static final pq0 d = new pq0("BUFFERED", 6, 0);
    public static final pq0 e = new pq0("SHOULD_BUFFER", 6, 0);
    public static final pq0 f = new pq0("S_RESUMING_BY_RCV", 6, 0);
    public static final pq0 g = new pq0("RESUMING_BY_EB", 6, 0);
    public static final pq0 h = new pq0("POISONED", 6, 0);
    public static final pq0 i = new pq0("DONE_RCV", 6, 0);
    public static final pq0 j = new pq0("INTERRUPTED_SEND", 6, 0);
    public static final pq0 k = new pq0("INTERRUPTED_RCV", 6, 0);
    public static final pq0 l = new pq0("CHANNEL_CLOSED", 6, 0);
    public static final pq0 m = new pq0("SUSPEND", 6, 0);
    public static final pq0 n = new pq0("SUSPEND_NO_WAITER", 6, 0);
    public static final pq0 o = new pq0("FAILED", 6, 0);
    public static final pq0 p = new pq0("NO_RECEIVE_RESULT", 6, 0);
    public static final pq0 q = new pq0("CLOSE_HANDLER_CLOSED", 6, 0);
    public static final pq0 r = new pq0("CLOSE_HANDLER_INVOKED", 6, 0);
    public static final pq0 s = new pq0("NO_CLOSE_CAUSE", 6, 0);

    public static final boolean a(uu uuVar, Object obj, x31 x31Var) {
        pq0 f2 = uuVar.f(obj, x31Var);
        if (f2 != null) {
            uuVar.l(f2);
            return true;
        }
        return false;
    }
}
