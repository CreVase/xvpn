package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.exoplayer2.scheduler.Requirements;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class qm0 {
    public static final Requirements o = new Requirements(1);

    /* renamed from: a, reason: collision with root package name */
    public final Context f4020a;

    /* renamed from: b, reason: collision with root package name */
    public final ht3 f4021b;
    public final nm0 c;
    public final z5 d;
    public final CopyOnWriteArraySet e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public int j;
    public int k;
    public boolean l;
    public List m;
    public rj2 n;

    public qm0(Context context, he0 he0Var, jt jtVar, yd0 yd0Var, ExecutorService executorService) {
        tg0 tg0Var = new tg0(he0Var);
        mt mtVar = new mt();
        mtVar.f3347a = jtVar;
        mtVar.e = yd0Var;
        ug0 ug0Var = new ug0(mtVar, executorService);
        this.f4020a = context.getApplicationContext();
        this.f4021b = tg0Var;
        this.j = 3;
        this.i = true;
        this.m = Collections.emptyList();
        this.e = new CopyOnWriteArraySet();
        Handler l = wi3.l(new lm0(this, 0));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        nm0 nm0Var = new nm0(handlerThread, tg0Var, ug0Var, l, this.j, this.i);
        this.c = nm0Var;
        z5 z5Var = new z5(this, 21);
        this.d = z5Var;
        rj2 rj2Var = new rj2(context, z5Var, o);
        this.n = rj2Var;
        int b2 = rj2Var.b();
        this.k = b2;
        this.f = 1;
        nm0Var.obtainMessage(0, b2, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((om0) it.next()).onWaitingForRequirementsChanged(this, this.l);
        }
    }

    public final void b(rj2 rj2Var, int i) {
        Requirements requirements = rj2Var.c;
        if (this.k != i) {
            this.k = i;
            this.f++;
            this.c.obtainMessage(2, i, 0).sendToTarget();
        }
        boolean d = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((om0) it.next()).onRequirementsStateChanged(this, requirements, i);
        }
        if (d) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i == z) {
            return;
        }
        this.i = z;
        this.f++;
        this.c.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
        boolean d = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((om0) it.next()).onDownloadsPausedChanged(this, z);
        }
        if (d) {
            a();
        }
    }

    public final boolean d() {
        boolean z;
        boolean z2 = true;
        if (!this.i && this.k != 0) {
            for (int i = 0; i < this.m.size(); i++) {
                if (((jm0) this.m.get(i)).f2791b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.l == z) {
            z2 = false;
        }
        this.l = z;
        return z2;
    }
}
