package defpackage;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final /* synthetic */ class yg implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ns1 f5330b;
    public final /* synthetic */ ur1 c;

    public /* synthetic */ yg(ur1 ur1Var, ns1 ns1Var, int i) {
        this.f5329a = i;
        this.c = ur1Var;
        this.f5330b = ns1Var;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        switch (this.f5329a) {
            case 0:
                ah ahVar = (ah) this.c;
                ns1 ns1Var = this.f5330b;
                ahVar.getClass();
                ns1Var.getClass();
                if (wi3.f5017a < 30) {
                    Handler handler = ns1Var.f3527a;
                    handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    ns1Var.a(j);
                    return;
                }
            default:
                l43 l43Var = (l43) this.c;
                ns1 ns1Var2 = this.f5330b;
                l43Var.getClass();
                ns1Var2.getClass();
                if (wi3.f5017a < 30) {
                    Handler handler2 = ns1Var2.f3527a;
                    handler2.sendMessageAtFrontOfQueue(Message.obtain(handler2, 0, (int) (j >> 32), (int) j));
                    return;
                } else {
                    ns1Var2.a(j);
                    return;
                }
        }
    }
}
