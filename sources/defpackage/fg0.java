package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class fg0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2088a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f2089b;

    public /* synthetic */ fg0(int i, Handler handler) {
        this.f2088a = i;
        this.f2089b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f2088a;
        Handler handler = this.f2089b;
        switch (i) {
            case 0:
                handler.post(runnable);
                return;
            default:
                handler.post(runnable);
                return;
        }
    }
}
