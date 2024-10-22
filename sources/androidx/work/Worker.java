package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import defpackage.ml1;
import defpackage.ql1;
import defpackage.rr2;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    rr2 mFuture;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract ql1 doWork();

    @Override // androidx.work.ListenableWorker
    public final ml1 startWork() {
        this.mFuture = new rr2();
        getBackgroundExecutor().execute(new a(this));
        return this.mFuture;
    }
}
