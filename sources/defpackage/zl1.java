package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class zl1 extends Handler implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final int f5505a;

    /* renamed from: b, reason: collision with root package name */
    public final am1 f5506b;
    public final long c;
    public yl1 d;
    public IOException e;
    public int f;
    public Thread g;
    public boolean h;
    public volatile boolean i;
    public final /* synthetic */ fm1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl1(fm1 fm1Var, Looper looper, am1 am1Var, yl1 yl1Var, int i, long j) {
        super(looper);
        this.j = fm1Var;
        this.f5506b = am1Var;
        this.d = yl1Var;
        this.f5505a = i;
        this.c = j;
    }

    public final void a(boolean z) {
        this.i = z;
        this.e = null;
        if (hasMessages(0)) {
            this.h = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.h = true;
                this.f5506b.E();
                Thread thread = this.g;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.j.f2118b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            yl1 yl1Var = this.d;
            yl1Var.getClass();
            yl1Var.a(this.f5506b, elapsedRealtime, elapsedRealtime - this.c, true);
            this.d = null;
        }
    }

    public final void b(long j) {
        boolean z;
        fm1 fm1Var = this.j;
        if (fm1Var.f2118b == null) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        fm1Var.f2118b = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
            return;
        }
        this.e = null;
        ExecutorService executorService = fm1Var.f2117a;
        zl1 zl1Var = fm1Var.f2118b;
        zl1Var.getClass();
        executorService.execute(zl1Var);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.i) {
            return;
        }
        int i = message.what;
        if (i == 0) {
            this.e = null;
            fm1 fm1Var = this.j;
            ExecutorService executorService = fm1Var.f2117a;
            zl1 zl1Var = fm1Var.f2118b;
            zl1Var.getClass();
            executorService.execute(zl1Var);
            return;
        }
        if (i != 3) {
            this.j.f2118b = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = elapsedRealtime - this.c;
            yl1 yl1Var = this.d;
            yl1Var.getClass();
            if (this.h) {
                yl1Var.a(this.f5506b, elapsedRealtime, j, false);
                return;
            }
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    IOException iOException = (IOException) message.obj;
                    this.e = iOException;
                    int i3 = this.f + 1;
                    this.f = i3;
                    po3 o = yl1Var.o(this.f5506b, elapsedRealtime, j, iOException, i3);
                    int i4 = o.f3886a;
                    if (i4 == 3) {
                        this.j.c = this.e;
                        return;
                    } else {
                        if (i4 != 2) {
                            if (i4 == 1) {
                                this.f = 1;
                            }
                            long j2 = o.f3887b;
                            if (j2 == -9223372036854775807L) {
                                j2 = Math.min((this.f - 1) * 1000, 5000);
                            }
                            b(j2);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            try {
                yl1Var.c(this.f5506b, elapsedRealtime, j);
                return;
            } catch (RuntimeException e) {
                sn1.d("LoadTask", "Unexpected exception handling load completed", e);
                this.j.c = new em1(e);
                return;
            }
        }
        throw ((Error) message.obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                if (!this.h) {
                    z = true;
                } else {
                    z = false;
                }
                this.g = Thread.currentThread();
            }
            if (z) {
                m20.N("load:".concat(this.f5506b.getClass().getSimpleName()));
                try {
                    this.f5506b.y();
                    m20.e0();
                } catch (Throwable th) {
                    m20.e0();
                    throw th;
                }
            }
            synchronized (this) {
                this.g = null;
                Thread.interrupted();
            }
            if (!this.i) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.i) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Error e2) {
            if (!this.i) {
                sn1.d("LoadTask", "Unexpected error loading stream", e2);
                obtainMessage(3, e2).sendToTarget();
            }
            throw e2;
        } catch (Exception e3) {
            if (!this.i) {
                sn1.d("LoadTask", "Unexpected exception loading stream", e3);
                obtainMessage(2, new em1(e3)).sendToTarget();
            }
        } catch (OutOfMemoryError e4) {
            if (!this.i) {
                sn1.d("LoadTask", "OutOfMemory error loading stream", e4);
                obtainMessage(2, new em1(e4)).sendToTarget();
            }
        }
    }
}
