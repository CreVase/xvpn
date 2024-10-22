package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class gm1 {
    Context mContext;
    int mId;
    cm1 mListener;
    bm1 mOnLoadCanceledListener;
    boolean mStarted = false;
    boolean mAbandoned = false;
    boolean mReset = true;
    boolean mContentChanged = false;
    boolean mProcessingChange = false;

    public gm1(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        pe0.g(sb, obj);
        sb.append("}");
        return sb.toString();
    }

    public void deliverCancellation() {
    }

    public void deliverResult(Object obj) {
        cm1 cm1Var = this.mListener;
        if (cm1Var != null) {
            jm1 jm1Var = (jm1) cm1Var;
            jm1Var.getClass();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                jm1Var.i(obj);
            } else {
                jm1Var.j(obj);
            }
        }
    }

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public void onAbandon() {
    }

    public abstract boolean onCancelLoad();

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public abstract void onForceLoad();

    public void onReset() {
    }

    public abstract void onStartLoading();

    public void onStopLoading() {
    }

    public void registerListener(int i, cm1 cm1Var) {
        if (this.mListener == null) {
            this.mListener = cm1Var;
            this.mId = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(bm1 bm1Var) {
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        pe0.g(sb, this);
        sb.append(" id=");
        return hx2.r(sb, this.mId, "}");
    }

    public void unregisterListener(cm1 cm1Var) {
        cm1 cm1Var2 = this.mListener;
        if (cm1Var2 != null) {
            if (cm1Var2 == cm1Var) {
                this.mListener = null;
                return;
            }
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
        throw new IllegalStateException("No listener register");
    }

    public void unregisterOnLoadCanceledListener(bm1 bm1Var) {
        throw new IllegalStateException("No listener register");
    }
}
