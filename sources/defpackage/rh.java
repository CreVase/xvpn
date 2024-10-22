package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* loaded from: classes.dex */
public final class rh extends BroadcastReceiver implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final yt0 f4153a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f4154b;
    public final /* synthetic */ ob2 c;

    public rh(ob2 ob2Var, Handler handler, yt0 yt0Var) {
        this.c = ob2Var;
        this.f4154b = handler;
        this.f4153a = yt0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f4154b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.f3637a) {
            this.f4153a.f5387a.z(-1, 3, false);
        }
    }
}
