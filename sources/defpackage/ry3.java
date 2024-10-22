package defpackage;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class ry3 extends py3 {
    public ry3(uy3 uy3Var, TaskCompletionSource taskCompletionSource) {
        super(uy3Var, new pq0("OnCompleteUpdateCallback", 3), taskCompletionSource);
    }

    @Override // defpackage.py3, defpackage.cy3
    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        int i = bundle.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource = this.c;
        if (i != 0) {
            taskCompletionSource.trySetException(new tc1(bundle.getInt("error.code", -2)));
        } else {
            taskCompletionSource.trySetResult(null);
        }
    }
}
