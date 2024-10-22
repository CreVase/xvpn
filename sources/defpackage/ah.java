package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ah implements ur1 {

    /* renamed from: a, reason: collision with root package name */
    public final MediaCodec f82a;

    /* renamed from: b, reason: collision with root package name */
    public final dh f83b;
    public final ch c;
    public final boolean d;
    public boolean e;
    public int f = 0;

    public ah(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z) {
        this.f82a = mediaCodec;
        this.f83b = new dh(handlerThread);
        this.c = new ch(mediaCodec, handlerThread2);
        this.d = z;
    }

    public static void o(ah ahVar, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        boolean z;
        dh dhVar = ahVar.f83b;
        if (dhVar.c == null) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        HandlerThread handlerThread = dhVar.f1777b;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = ahVar.f82a;
        mediaCodec.setCallback(dhVar, handler);
        dhVar.c = handler;
        m20.N("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, 0);
        m20.e0();
        ch chVar = ahVar.c;
        if (!chVar.f) {
            HandlerThread handlerThread2 = chVar.f631b;
            handlerThread2.start();
            chVar.c = new k9(chVar, handlerThread2.getLooper(), 2);
            chVar.f = true;
        }
        m20.N("startCodec");
        mediaCodec.start();
        m20.e0();
        ahVar.f = 1;
    }

    public static String p(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.ur1
    public final void a() {
    }

    @Override // defpackage.ur1
    public final MediaFormat b() {
        MediaFormat mediaFormat;
        dh dhVar = this.f83b;
        synchronized (dhVar.f1776a) {
            mediaFormat = dhVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.ur1
    public final void c(Bundle bundle) {
        q();
        this.f82a.setParameters(bundle);
    }

    @Override // defpackage.ur1
    public final void d(int i, long j) {
        this.f82a.releaseOutputBuffer(i, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001f A[Catch: all -> 0x0042, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:25:0x0038, B:26:0x0034, B:27:0x003a, B:28:0x003c, B:29:0x003d, B:30:0x003f), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0021 A[Catch: all -> 0x0042, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:12:0x001f, B:16:0x0021, B:18:0x0026, B:20:0x002a, B:25:0x0038, B:26:0x0034, B:27:0x003a, B:28:0x003c, B:29:0x003d, B:30:0x003f), top: B:3:0x000a }] */
    @Override // defpackage.ur1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e() {
        /*
            r9 = this;
            ch r0 = r9.c
            r0.b()
            dh r0 = r9.f83b
            java.lang.Object r1 = r0.f1776a
            monitor-enter(r1)
            long r2 = r0.k     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L1b
            boolean r2 = r0.l     // Catch: java.lang.Throwable -> L42
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            goto L1c
        L1b:
            r2 = 1
        L1c:
            r3 = -1
            if (r2 == 0) goto L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            goto L39
        L21:
            java.lang.IllegalStateException r2 = r0.m     // Catch: java.lang.Throwable -> L42
            r4 = 0
            if (r2 != 0) goto L3d
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L3a
            kh r0 = r0.d     // Catch: java.lang.Throwable -> L42
            int r2 = r0.c     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L31
            r6 = 1
        L31:
            if (r6 == 0) goto L34
            goto L38
        L34:
            int r3 = r0.e()     // Catch: java.lang.Throwable -> L42
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
        L39:
            return r3
        L3a:
            r0.j = r4     // Catch: java.lang.Throwable -> L42
            throw r2     // Catch: java.lang.Throwable -> L42
        L3d:
            r0.m = r4     // Catch: java.lang.Throwable -> L42
            throw r2     // Catch: java.lang.Throwable -> L42
        L40:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r0
        L42:
            r0 = move-exception
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah.e():int");
    }

    @Override // defpackage.ur1
    public final void f(ns1 ns1Var, Handler handler) {
        q();
        this.f82a.setOnFrameRenderedListener(new yg(this, ns1Var, 0), handler);
    }

    @Override // defpackage.ur1
    public final void flush() {
        this.c.a();
        this.f82a.flush();
        dh dhVar = this.f83b;
        synchronized (dhVar.f1776a) {
            dhVar.k++;
            Handler handler = dhVar.c;
            int i = wi3.f5017a;
            handler.post(new nw3(dhVar, 18));
        }
        this.f82a.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e A[Catch: all -> 0x006d, DONT_GENERATE, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:11:0x001e, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:24:0x0032, B:25:0x0035, B:27:0x003b, B:28:0x0062, B:33:0x0058, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0020 A[Catch: all -> 0x006d, TryCatch #0 {, blocks: (B:4:0x000a, B:6:0x0014, B:11:0x001e, B:16:0x0020, B:18:0x0025, B:20:0x0029, B:24:0x0032, B:25:0x0035, B:27:0x003b, B:28:0x0062, B:33:0x0058, B:34:0x0065, B:35:0x0067, B:36:0x0068, B:37:0x006a), top: B:3:0x000a }] */
    @Override // defpackage.ur1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int g(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            ch r0 = r9.c
            r0.b()
            dh r0 = r9.f83b
            java.lang.Object r1 = r0.f1776a
            monitor-enter(r1)
            long r2 = r0.k     // Catch: java.lang.Throwable -> L6d
            r4 = 0
            r6 = 0
            r7 = 1
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L1b
            boolean r2 = r0.l     // Catch: java.lang.Throwable -> L6d
            if (r2 == 0) goto L19
            goto L1b
        L19:
            r2 = 0
            goto L1c
        L1b:
            r2 = 1
        L1c:
            if (r2 == 0) goto L20
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            goto L33
        L20:
            java.lang.IllegalStateException r2 = r0.m     // Catch: java.lang.Throwable -> L6d
            r3 = 0
            if (r2 != 0) goto L68
            android.media.MediaCodec$CodecException r2 = r0.j     // Catch: java.lang.Throwable -> L6d
            if (r2 != 0) goto L65
            kh r2 = r0.e     // Catch: java.lang.Throwable -> L6d
            int r3 = r2.c     // Catch: java.lang.Throwable -> L6d
            if (r3 != 0) goto L30
            r6 = 1
        L30:
            if (r6 == 0) goto L35
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
        L33:
            r10 = -1
            goto L64
        L35:
            int r2 = r2.e()     // Catch: java.lang.Throwable -> L6d
            if (r2 < 0) goto L55
            android.media.MediaFormat r3 = r0.h     // Catch: java.lang.Throwable -> L6d
            defpackage.cp3.o(r3)     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r0 = r0.f     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r0 = r0.remove()     // Catch: java.lang.Throwable -> L6d
            android.media.MediaCodec$BufferInfo r0 = (android.media.MediaCodec.BufferInfo) r0     // Catch: java.lang.Throwable -> L6d
            int r4 = r0.offset     // Catch: java.lang.Throwable -> L6d
            int r5 = r0.size     // Catch: java.lang.Throwable -> L6d
            long r6 = r0.presentationTimeUs     // Catch: java.lang.Throwable -> L6d
            int r8 = r0.flags     // Catch: java.lang.Throwable -> L6d
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch: java.lang.Throwable -> L6d
            goto L62
        L55:
            r10 = -2
            if (r2 != r10) goto L62
            java.util.ArrayDeque r10 = r0.g     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r10 = r10.remove()     // Catch: java.lang.Throwable -> L6d
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch: java.lang.Throwable -> L6d
            r0.h = r10     // Catch: java.lang.Throwable -> L6d
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            r10 = r2
        L64:
            return r10
        L65:
            r0.j = r3     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L68:
            r0.m = r3     // Catch: java.lang.Throwable -> L6d
            throw r2     // Catch: java.lang.Throwable -> L6d
        L6b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6d
            throw r10
        L6d:
            r10 = move-exception
            goto L6b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah.g(android.media.MediaCodec$BufferInfo):int");
    }

    @Override // defpackage.ur1
    public final void h(int i, boolean z) {
        this.f82a.releaseOutputBuffer(i, z);
    }

    @Override // defpackage.ur1
    public final void i(int i, fc0 fc0Var, long j) {
        bh bhVar;
        ch chVar = this.c;
        chVar.b();
        ArrayDeque arrayDeque = ch.g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                bhVar = new bh();
            } else {
                bhVar = (bh) arrayDeque.removeFirst();
            }
        }
        bhVar.f462a = i;
        bhVar.f463b = 0;
        bhVar.c = 0;
        bhVar.e = j;
        bhVar.f = 0;
        int i2 = fc0Var.f;
        MediaCodec.CryptoInfo cryptoInfo = bhVar.d;
        cryptoInfo.numSubSamples = i2;
        int[] iArr = fc0Var.d;
        int[] iArr2 = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArr2 != null && iArr2.length >= iArr.length) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            } else {
                iArr2 = Arrays.copyOf(iArr, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArr2;
        int[] iArr3 = fc0Var.e;
        int[] iArr4 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 != null) {
            if (iArr4 != null && iArr4.length >= iArr3.length) {
                System.arraycopy(iArr3, 0, iArr4, 0, iArr3.length);
            } else {
                iArr4 = Arrays.copyOf(iArr3, iArr3.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArr4;
        byte[] bArr = fc0Var.f2072b;
        byte[] bArr2 = cryptoInfo.key;
        if (bArr != null) {
            if (bArr2 != null && bArr2.length >= bArr.length) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            } else {
                bArr2 = Arrays.copyOf(bArr, bArr.length);
            }
        }
        bArr2.getClass();
        cryptoInfo.key = bArr2;
        byte[] bArr3 = fc0Var.f2071a;
        byte[] bArr4 = cryptoInfo.iv;
        if (bArr3 != null) {
            if (bArr4 != null && bArr4.length >= bArr3.length) {
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            } else {
                bArr4 = Arrays.copyOf(bArr3, bArr3.length);
            }
        }
        bArr4.getClass();
        cryptoInfo.iv = bArr4;
        cryptoInfo.mode = fc0Var.c;
        if (wi3.f5017a >= 24) {
            q2.p();
            cryptoInfo.setPattern(q2.f(fc0Var.g, fc0Var.h));
        }
        chVar.c.obtainMessage(1, bhVar).sendToTarget();
    }

    @Override // defpackage.ur1
    public final void j(int i) {
        q();
        this.f82a.setVideoScalingMode(i);
    }

    @Override // defpackage.ur1
    public final ByteBuffer k(int i) {
        return this.f82a.getInputBuffer(i);
    }

    @Override // defpackage.ur1
    public final void l(Surface surface) {
        q();
        this.f82a.setOutputSurface(surface);
    }

    @Override // defpackage.ur1
    public final ByteBuffer m(int i) {
        return this.f82a.getOutputBuffer(i);
    }

    @Override // defpackage.ur1
    public final void n(int i, int i2, long j, int i3) {
        bh bhVar;
        ch chVar = this.c;
        chVar.b();
        ArrayDeque arrayDeque = ch.g;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                bhVar = new bh();
            } else {
                bhVar = (bh) arrayDeque.removeFirst();
            }
        }
        bhVar.f462a = i;
        bhVar.f463b = 0;
        bhVar.c = i2;
        bhVar.e = j;
        bhVar.f = i3;
        k9 k9Var = chVar.c;
        int i4 = wi3.f5017a;
        k9Var.obtainMessage(0, bhVar).sendToTarget();
    }

    public final void q() {
        if (this.d) {
            try {
                ch chVar = this.c;
                u93 u93Var = chVar.e;
                u93Var.e();
                k9 k9Var = chVar.c;
                k9Var.getClass();
                k9Var.obtainMessage(2).sendToTarget();
                u93Var.c();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.ur1
    public final void release() {
        try {
            if (this.f == 1) {
                ch chVar = this.c;
                if (chVar.f) {
                    chVar.a();
                    chVar.f631b.quit();
                }
                chVar.f = false;
                dh dhVar = this.f83b;
                synchronized (dhVar.f1776a) {
                    dhVar.l = true;
                    dhVar.f1777b.quit();
                    dhVar.a();
                }
            }
            this.f = 2;
        } finally {
            if (!this.e) {
                this.f82a.release();
                this.e = true;
            }
        }
    }
}
