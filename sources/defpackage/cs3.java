package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.UUID;

/* loaded from: classes.dex */
public final class cs3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1667a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rr2 f1668b;
    public final /* synthetic */ ds3 c;

    public /* synthetic */ cs3(ds3 ds3Var, rr2 rr2Var, int i) {
        this.f1667a = i;
        this.c = ds3Var;
        this.f1668b = rr2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1667a;
        rr2 rr2Var = this.f1668b;
        ds3 ds3Var = this.c;
        switch (i) {
            case 0:
                rr2Var.j(ds3Var.d.getForegroundInfoAsync());
                return;
            default:
                try {
                    p01 p01Var = (p01) rr2Var.get();
                    if (p01Var != null) {
                        bo1 c = bo1.c();
                        int i2 = ds3.g;
                        Object[] objArr = new Object[1];
                        rs3 rs3Var = ds3Var.c;
                        ListenableWorker listenableWorker = ds3Var.d;
                        objArr[0] = rs3Var.c;
                        String.format("Updating notification for %s", objArr);
                        c.a(new Throwable[0]);
                        listenableWorker.setRunInForeground(true);
                        rr2 rr2Var2 = ds3Var.f1829a;
                        s01 s01Var = ds3Var.e;
                        Context context = ds3Var.f1830b;
                        UUID id = listenableWorker.getId();
                        es3 es3Var = (es3) s01Var;
                        es3Var.getClass();
                        rr2 rr2Var3 = new rr2();
                        ((y33) es3Var.f1986a).r(new bq3(es3Var, rr2Var3, id, p01Var, context, 1));
                        rr2Var2.j(rr2Var3);
                        return;
                    }
                    throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", ds3Var.c.c));
                } catch (Throwable th) {
                    ds3Var.f1829a.i(th);
                    return;
                }
        }
    }
}
