package defpackage;

import android.os.Handler;

/* loaded from: classes.dex */
public final class jk3 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2782a;

    /* renamed from: b, reason: collision with root package name */
    public final kk3 f2783b;

    public jk3(Handler handler, yt0 yt0Var) {
        this.f2782a = handler;
        this.f2783b = yt0Var;
    }

    public final void a(se0 se0Var) {
        synchronized (se0Var) {
        }
        Handler handler = this.f2782a;
        if (handler != null) {
            handler.post(new gk3(this, se0Var, 0));
        }
    }
}
