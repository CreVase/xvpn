package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class dg0 {

    /* renamed from: a, reason: collision with root package name */
    public Exception f1773a;

    /* renamed from: b, reason: collision with root package name */
    public long f1774b;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f1773a == null) {
            this.f1773a = exc;
            this.f1774b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f1774b) {
            Exception exc2 = this.f1773a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f1773a;
            this.f1773a = null;
            throw exc3;
        }
    }
}
