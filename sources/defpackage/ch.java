package defpackage;

import android.media.MediaCodec;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ch {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object h = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f630a;

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f631b;
    public k9 c;
    public final AtomicReference d;
    public final u93 e;
    public boolean f;

    public ch(MediaCodec mediaCodec, HandlerThread handlerThread) {
        u93 u93Var = new u93(4);
        this.f630a = mediaCodec;
        this.f631b = handlerThread;
        this.e = u93Var;
        this.d = new AtomicReference();
    }

    public static void c(bh bhVar) {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            arrayDeque.add(bhVar);
        }
    }

    public final void a() {
        if (this.f) {
            try {
                k9 k9Var = this.c;
                k9Var.getClass();
                k9Var.removeCallbacksAndMessages(null);
                u93 u93Var = this.e;
                u93Var.e();
                k9 k9Var2 = this.c;
                k9Var2.getClass();
                k9Var2.obtainMessage(2).sendToTarget();
                u93Var.c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    public final void b() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException == null) {
        } else {
            throw runtimeException;
        }
    }
}
