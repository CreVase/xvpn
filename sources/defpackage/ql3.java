package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class ql3 implements Choreographer.FrameCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tl3 f4017a;

    public ql3(tl3 tl3Var) {
        this.f4017a = tl3Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f4017a.f4530b.run();
    }
}
