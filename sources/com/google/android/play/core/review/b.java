package com.google.android.play.core.review;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.l;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import defpackage.dy3;
import defpackage.i4;
import defpackage.ky3;
import defpackage.oy3;
import defpackage.wk2;
import defpackage.xy3;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final dy3 f1574a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1575b = new Handler(Looper.getMainLooper());

    public b(dy3 dy3Var) {
        this.f1574a = dy3Var;
    }

    public final Task a(l lVar, ReviewInfo reviewInfo) {
        zza zzaVar = (zza) reviewInfo;
        if (zzaVar.f1578b) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent(lVar, (Class<?>) PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", zzaVar.f1577a);
        intent.putExtra("window_flags", lVar.getWindow().getDecorView().getWindowSystemUiVisibility());
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        intent.putExtra("result_receiver", new zzc(this.f1575b, taskCompletionSource));
        lVar.startActivity(intent);
        return taskCompletionSource.getTask();
    }

    public final Task b() {
        dy3 dy3Var = this.f1574a;
        i4 i4Var = dy3.c;
        i4Var.a("requestInAppReview (%s)", dy3Var.f1864b);
        if (dy3Var.f1863a == null) {
            Object[] objArr = new Object[0];
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", i4.b(i4Var.f2534a, "Play Store app is either not installed or not the official version", objArr));
            }
            return Tasks.forException(new wk2());
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        xy3 xy3Var = dy3Var.f1863a;
        ky3 ky3Var = new ky3(dy3Var, taskCompletionSource, taskCompletionSource, 2);
        synchronized (xy3Var.f) {
            xy3Var.e.add(taskCompletionSource);
            taskCompletionSource.getTask().addOnCompleteListener(new oy3(xy3Var, taskCompletionSource, 1));
        }
        synchronized (xy3Var.f) {
            if (xy3Var.k.getAndIncrement() > 0) {
                i4 i4Var2 = xy3Var.f5250b;
                Object[] objArr2 = new Object[0];
                if (Log.isLoggable("PlayCore", 3)) {
                    i4.b(i4Var2.f2534a, "Already connected to the service.", objArr2);
                } else {
                    i4Var2.getClass();
                }
            }
        }
        xy3Var.a().post(new ky3(xy3Var, taskCompletionSource, ky3Var, 0));
        return taskCompletionSource.getTask();
    }
}
