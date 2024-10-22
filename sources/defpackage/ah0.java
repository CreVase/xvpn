package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.drm.b;

/* loaded from: classes.dex */
public final class ah0 implements wn0 {

    /* renamed from: a, reason: collision with root package name */
    public final un0 f84a;

    /* renamed from: b, reason: collision with root package name */
    public rn0 f85b;
    public boolean c;
    public final /* synthetic */ b d;

    public ah0(b bVar, un0 un0Var) {
        this.d = bVar;
        this.f84a = un0Var;
    }

    @Override // defpackage.wn0
    public final void release() {
        Handler handler = this.d.t;
        handler.getClass();
        wi3.F(handler, new nw3(this, 16));
    }
}
