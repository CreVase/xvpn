package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import defpackage.bq3;
import defpackage.dv;
import defpackage.es3;
import defpackage.g63;
import defpackage.jd0;
import defpackage.ls3;
import defpackage.m92;
import defpackage.ml1;
import defpackage.p01;
import defpackage.rr2;
import defpackage.s01;
import defpackage.y33;
import defpackage.zs3;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    private WorkerParameters mWorkerParams;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context != null) {
            if (workerParameters != null) {
                this.mAppContext = context;
                this.mWorkerParams = workerParameters;
                return;
            }
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        throw new IllegalArgumentException("Application Context is null");
    }

    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f;
    }

    public ml1 getForegroundInfoAsync() {
        rr2 rr2Var = new rr2();
        rr2Var.i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return rr2Var;
    }

    public final UUID getId() {
        return this.mWorkerParams.f289a;
    }

    public final jd0 getInputData() {
        return this.mWorkerParams.f290b;
    }

    public final Network getNetwork() {
        return (Network) this.mWorkerParams.d.d;
    }

    public final int getRunAttemptCount() {
        return this.mWorkerParams.e;
    }

    public final Set<String> getTags() {
        return this.mWorkerParams.c;
    }

    public g63 getTaskExecutor() {
        return this.mWorkerParams.g;
    }

    public final List<String> getTriggeredContentAuthorities() {
        return (List) this.mWorkerParams.d.f5263b;
    }

    public final List<Uri> getTriggeredContentUris() {
        return (List) this.mWorkerParams.d.c;
    }

    public zs3 getWorkerFactory() {
        return this.mWorkerParams.h;
    }

    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    public final ml1 setForegroundAsync(p01 p01Var) {
        this.mRunInForeground = true;
        s01 s01Var = this.mWorkerParams.j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        es3 es3Var = (es3) s01Var;
        es3Var.getClass();
        rr2 rr2Var = new rr2();
        ((y33) es3Var.f1986a).r(new bq3(es3Var, rr2Var, id, p01Var, applicationContext, 1));
        return rr2Var;
    }

    public ml1 setProgressAsync(jd0 jd0Var) {
        m92 m92Var = this.mWorkerParams.i;
        getApplicationContext();
        UUID id = getId();
        ls3 ls3Var = (ls3) m92Var;
        ls3Var.getClass();
        rr2 rr2Var = new rr2();
        ((y33) ls3Var.f3183b).r(new dv(ls3Var, id, jd0Var, rr2Var, 2));
        return rr2Var;
    }

    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    public final void setUsed() {
        this.mUsed = true;
    }

    public abstract ml1 startWork();

    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
