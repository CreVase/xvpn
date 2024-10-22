package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.dy3;
import defpackage.i4;
import defpackage.my3;
import defpackage.xy3;
import defpackage.zx3;

/* loaded from: classes2.dex */
public final class c extends zx3 {

    /* renamed from: b, reason: collision with root package name */
    public final i4 f1576b;
    public final TaskCompletionSource c;
    public final /* synthetic */ dy3 d;

    public c(dy3 dy3Var, TaskCompletionSource taskCompletionSource) {
        i4 i4Var = new i4("OnRequestInstallCallback");
        this.d = dy3Var;
        this.f1576b = i4Var;
        this.c = taskCompletionSource;
    }

    public final void zzb(Bundle bundle) {
        xy3 xy3Var = this.d.f1863a;
        int i = 0;
        if (xy3Var != null) {
            TaskCompletionSource taskCompletionSource = this.c;
            synchronized (xy3Var.f) {
                xy3Var.e.remove(taskCompletionSource);
            }
            synchronized (xy3Var.f) {
                if (xy3Var.k.get() > 0 && xy3Var.k.decrementAndGet() > 0) {
                    xy3Var.f5250b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    xy3Var.a().post(new my3(xy3Var, i));
                }
            }
        }
        this.f1576b.a("onGetLaunchReviewFlowInfo", new Object[0]);
        this.c.trySetResult(new zza((PendingIntent) bundle.get("confirmation_intent"), bundle.getBoolean("is_review_no_op")));
    }
}
