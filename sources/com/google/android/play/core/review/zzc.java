package com.google.android.play.core.review;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class zzc extends ResultReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f1579a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(Handler handler, TaskCompletionSource taskCompletionSource) {
        super(handler);
        this.f1579a = taskCompletionSource;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f1579a.trySetResult(null);
    }
}
