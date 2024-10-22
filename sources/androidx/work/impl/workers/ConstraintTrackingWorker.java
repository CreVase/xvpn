package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import defpackage.bo1;
import defpackage.g63;
import defpackage.hs3;
import defpackage.ml1;
import defpackage.qw3;
import defpackage.rr2;
import defpackage.vr3;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements vr3 {
    public static final String f = bo1.e("ConstraintTrkngWrkr");

    /* renamed from: a, reason: collision with root package name */
    public final WorkerParameters f299a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f300b;
    public volatile boolean c;
    public final rr2 d;
    public ListenableWorker e;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f299a = workerParameters;
        this.f300b = new Object();
        this.c = false;
        this.d = new rr2();
    }

    @Override // defpackage.vr3
    public final void d(ArrayList arrayList) {
        bo1 c = bo1.c();
        String.format("Constraints changed for %s", arrayList);
        c.a(new Throwable[0]);
        synchronized (this.f300b) {
            this.c = true;
        }
    }

    @Override // defpackage.vr3
    public final void f(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public final g63 getTaskExecutor() {
        return hs3.a0(getApplicationContext()).t;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.e;
        if (listenableWorker != null && listenableWorker.isRunInForeground()) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.e;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.e.stop();
        }
    }

    @Override // androidx.work.ListenableWorker
    public final ml1 startWork() {
        getBackgroundExecutor().execute(new qw3(this, 11));
        return this.d;
    }
}
