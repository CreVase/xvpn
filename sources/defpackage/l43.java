package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l43 implements ur1 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f3061a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f3062b;
    public ByteBuffer[] c;

    public l43(MediaCodec mediaCodec) {
        this.f3061a = mediaCodec;
        if (wi3.f5017a < 21) {
            this.f3062b = mediaCodec.getInputBuffers();
            this.c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // defpackage.ur1
    public final void a() {
    }

    @Override // defpackage.ur1
    public final MediaFormat b() {
        return this.f3061a.getOutputFormat();
    }

    @Override // defpackage.ur1
    public final void c(Bundle bundle) {
        this.f3061a.setParameters(bundle);
    }

    @Override // defpackage.ur1
    public final void d(int i, long j) {
        this.f3061a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.ur1
    public final int e() {
        return this.f3061a.dequeueInputBuffer(0L);
    }

    @Override // defpackage.ur1
    public final void f(ns1 ns1Var, Handler handler) {
        this.f3061a.setOnFrameRenderedListener(new yg(this, ns1Var, 1), handler);
    }

    @Override // defpackage.ur1
    public final void flush() {
        this.f3061a.flush();
    }

    @Override // defpackage.ur1
    public final int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = this.f3061a;
            dequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && wi3.f5017a < 21) {
                this.c = mediaCodec.getOutputBuffers();
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // defpackage.ur1
    public final void h(int i, boolean z) {
        this.f3061a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.ur1
    public final void i(int i, fc0 fc0Var, long j) {
        this.f3061a.queueSecureInputBuffer(i, 0, fc0Var.i, j, 0);
    }

    @Override // defpackage.ur1
    public final void j(int i) {
        this.f3061a.setVideoScalingMode(i);
    }

    @Override // defpackage.ur1
    public final ByteBuffer k(int i) {
        if (wi3.f5017a >= 21) {
            return this.f3061a.getInputBuffer(i);
        }
        return this.f3062b[i];
    }

    @Override // defpackage.ur1
    public final void l(Surface surface) {
        this.f3061a.setOutputSurface(surface);
    }

    @Override // defpackage.ur1
    public final ByteBuffer m(int i) {
        if (wi3.f5017a >= 21) {
            return this.f3061a.getOutputBuffer(i);
        }
        return this.c[i];
    }

    @Override // defpackage.ur1
    public final void n(int i, int i2, long j, int i3) {
        this.f3061a.queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.ur1
    public final void release() {
        this.f3062b = null;
        this.c = null;
        this.f3061a.release();
    }
}
