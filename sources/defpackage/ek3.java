package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class ek3 implements Choreographer.FrameCallback, Handler.Callback {
    public static final ek3 e = new ek3();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f1951a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1952b;
    public Choreographer c;
    public int d;

    public ek3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = wi3.f5017a;
        Handler handler = new Handler(looper, this);
        this.f1952b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f1951a = j;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return false;
                }
                Choreographer choreographer = this.c;
                if (choreographer != null) {
                    int i2 = this.d - 1;
                    this.d = i2;
                    if (i2 == 0) {
                        choreographer.removeFrameCallback(this);
                        this.f1951a = -9223372036854775807L;
                    }
                }
                return true;
            }
            Choreographer choreographer2 = this.c;
            if (choreographer2 != null) {
                int i3 = this.d + 1;
                this.d = i3;
                if (i3 == 1) {
                    choreographer2.postFrameCallback(this);
                }
            }
            return true;
        }
        try {
            this.c = Choreographer.getInstance();
        } catch (RuntimeException e2) {
            sn1.g("Vsync sampling disabled due to platform error", e2);
        }
        return true;
    }
}
