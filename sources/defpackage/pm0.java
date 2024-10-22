package defpackage;

import com.google.android.exoplayer2.offline.DownloadRequest;
import java.io.IOException;

/* loaded from: classes.dex */
public final class pm0 extends Thread implements xm0 {

    /* renamed from: a, reason: collision with root package name */
    public final DownloadRequest f3872a;

    /* renamed from: b, reason: collision with root package name */
    public final o92 f3873b;
    public final tm0 c;
    public final boolean d;
    public final int e;
    public volatile nm0 f;
    public volatile boolean g;
    public Exception h;
    public long i = -1;

    public pm0(DownloadRequest downloadRequest, o92 o92Var, tm0 tm0Var, boolean z, int i, nm0 nm0Var) {
        this.f3872a = downloadRequest;
        this.f3873b = o92Var;
        this.c = tm0Var;
        this.d = z;
        this.e = i;
        this.f = nm0Var;
    }

    public final void a(boolean z) {
        if (z) {
            this.f = null;
        }
        if (!this.g) {
            this.g = true;
            o92 o92Var = this.f3873b;
            o92Var.g = true;
            n92 n92Var = o92Var.f;
            if (n92Var != null) {
                n92Var.cancel(true);
            }
            interrupt();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.d) {
                this.f3873b.b();
            } else {
                long j = -1;
                int i = 0;
                while (!this.g) {
                    try {
                        this.f3873b.a(this);
                        break;
                    } catch (IOException e) {
                        if (!this.g) {
                            long j2 = this.c.f4533a;
                            if (j2 != j) {
                                j = j2;
                                i = 0;
                            }
                            i++;
                            if (i <= this.e) {
                                Thread.sleep(Math.min((i - 1) * 1000, 5000));
                            } else {
                                throw e;
                            }
                        }
                    }
                }
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (Exception e2) {
            this.h = e2;
        }
        nm0 nm0Var = this.f;
        if (nm0Var != null) {
            nm0Var.obtainMessage(9, this).sendToTarget();
        }
    }
}
