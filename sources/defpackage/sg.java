package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public abstract class sg extends gm1 {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile rg mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile rg mTask;
    long mUpdateThrottle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(Context context) {
        super(context);
        ThreadPoolExecutor threadPoolExecutor = rg.i;
        this.mLastLoadCompleteTime = -10000L;
        this.mExecutor = threadPoolExecutor;
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(rg rgVar, Object obj) {
        onCanceled(obj);
        if (this.mCancellingTask == rgVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(rg rgVar, Object obj) {
        if (this.mTask != rgVar) {
            dispatchOnCancelled(rgVar, obj);
            return;
        }
        if (isAbandoned()) {
            onCanceled(obj);
            return;
        }
        commitContentChanged();
        this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
        this.mTask = null;
        deliverResult(obj);
    }

    @Override // defpackage.gm1
    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.g);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.g);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            long j = this.mUpdateThrottle;
            synchronized (v83.f4794a) {
                printWriter.print(new String(v83.f4795b, 0, v83.b(j)));
            }
            printWriter.print(" mLastLoadCompleteTime=");
            long j2 = this.mLastLoadCompleteTime;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j2 == 0) {
                printWriter.print("--");
            } else {
                v83.a(j2 - uptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.g) {
                this.mTask.g = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle > 0 && SystemClock.uptimeMillis() < this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.g = true;
                this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
                return;
            }
            rg rgVar = this.mTask;
            Executor executor = this.mExecutor;
            if (rgVar.c != 1) {
                int x = hx2.x(rgVar.c);
                if (x != 1) {
                    if (x != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    }
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                }
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            rgVar.c = 2;
            rgVar.f4148a.f1856b = null;
            executor.execute(rgVar.f4149b);
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        if (this.mCancellingTask != null) {
            return true;
        }
        return false;
    }

    public abstract Object loadInBackground();

    @Override // defpackage.gm1
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.g) {
                this.mTask.g = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        }
        if (this.mTask.g) {
            this.mTask.g = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        }
        rg rgVar = this.mTask;
        rgVar.d.set(true);
        boolean cancel = rgVar.f4149b.cancel(false);
        if (cancel) {
            this.mCancellingTask = this.mTask;
            cancelLoadInBackground();
        }
        this.mTask = null;
        return cancel;
    }

    public void onCanceled(Object obj) {
    }

    @Override // defpackage.gm1
    public void onForceLoad() {
        cancelLoad();
        this.mTask = new rg(this);
        executePendingTask();
    }

    public Object onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        rg rgVar = this.mTask;
        if (rgVar != null) {
            try {
                rgVar.f.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
