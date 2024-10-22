package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class dh extends MediaCodec.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final HandlerThread f1777b;
    public Handler c;
    public MediaFormat h;
    public MediaFormat i;
    public MediaCodec.CodecException j;
    public long k;
    public boolean l;
    public IllegalStateException m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1776a = new Object();
    public final kh d = new kh();
    public final kh e = new kh();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();

    public dh(HandlerThread handlerThread) {
        this.f1777b = handlerThread;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        if (!arrayDeque.isEmpty()) {
            this.i = (MediaFormat) arrayDeque.getLast();
        }
        kh khVar = this.d;
        khVar.f2942a = 0;
        khVar.f2943b = -1;
        khVar.c = 0;
        kh khVar2 = this.e;
        khVar2.f2942a = 0;
        khVar2.f2943b = -1;
        khVar2.c = 0;
        this.f.clear();
        arrayDeque.clear();
    }

    public final void b(IllegalStateException illegalStateException) {
        synchronized (this.f1776a) {
            this.m = illegalStateException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f1776a) {
            this.j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        synchronized (this.f1776a) {
            this.d.d(i);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f1776a) {
            MediaFormat mediaFormat = this.i;
            if (mediaFormat != null) {
                this.e.d(-2);
                this.g.add(mediaFormat);
                this.i = null;
            }
            this.e.d(i);
            this.f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f1776a) {
            this.e.d(-2);
            this.g.add(mediaFormat);
            this.i = null;
        }
    }
}
