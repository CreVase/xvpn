package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class ig0 implements ji {
    public static final Object d0 = new Object();
    public static ExecutorService e0;
    public static int f0;
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public zh[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public mm X;
    public yf0 Y;
    public boolean Z;

    /* renamed from: a, reason: collision with root package name */
    public final th f2585a;
    public long a0;

    /* renamed from: b, reason: collision with root package name */
    public final y33 f2586b;
    public boolean b0;
    public final boolean c;
    public boolean c0;
    public final nw d;
    public final ic3 e;
    public final zh[] f;
    public final zh[] g;
    public final u93 h;
    public final ni i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public hg0 m;
    public final dg0 n;
    public final dg0 o;
    public final jg0 p;
    public z52 q;
    public ja1 r;
    public bg0 s;
    public bg0 t;
    public AudioTrack u;
    public qh v;
    public cg0 w;
    public cg0 x;
    public q52 y;
    public ByteBuffer z;

    public ig0(ag0 ag0Var) {
        boolean z;
        boolean z2;
        int i;
        this.f2585a = ag0Var.f78a;
        y33 y33Var = ag0Var.f79b;
        this.f2586b = y33Var;
        int i2 = wi3.f5017a;
        if (i2 >= 21 && ag0Var.c) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        if (i2 >= 23 && ag0Var.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.k = z2;
        if (i2 >= 29) {
            i = ag0Var.e;
        } else {
            i = 0;
        }
        this.l = i;
        this.p = ag0Var.f;
        u93 u93Var = new u93(f10.f2029a);
        this.h = u93Var;
        u93Var.h();
        this.i = new ni(new eg0(this));
        nw nwVar = new nw();
        this.d = nwVar;
        ic3 ic3Var = new ic3();
        this.e = ic3Var;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new sj2(), nwVar, ic3Var);
        Collections.addAll(arrayList, (zh[]) y33Var.f5263b);
        this.f = (zh[]) arrayList.toArray(new zh[0]);
        this.g = new zh[]{new bz0()};
        this.J = 1.0f;
        this.v = qh.g;
        this.W = 0;
        this.X = new mm();
        q52 q52Var = q52.d;
        this.x = new cg0(q52Var, false, 0L, 0L);
        this.y = q52Var;
        this.R = -1;
        this.K = new zh[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new dg0();
        this.o = new dg0();
    }

    public static AudioFormat e(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    public static boolean n(AudioTrack audioTrack) {
        boolean isOffloadedPlayback;
        if (wi3.f5017a >= 29) {
            isOffloadedPlayback = audioTrack.isOffloadedPlayback();
            if (isOffloadedPlayback) {
                return true;
            }
        }
        return false;
    }

    public final void a(long j) {
        q52 q52Var;
        boolean z;
        boolean u = u();
        y33 y33Var = this.f2586b;
        if (u) {
            q52Var = g().f628a;
            kx2 kx2Var = (kx2) y33Var.d;
            float f = q52Var.f3957a;
            if (kx2Var.c != f) {
                kx2Var.c = f;
                kx2Var.i = true;
            }
            float f2 = kx2Var.d;
            float f3 = q52Var.f3958b;
            if (f2 != f3) {
                kx2Var.d = f3;
                kx2Var.i = true;
            }
        } else {
            q52Var = q52.d;
        }
        q52 q52Var2 = q52Var;
        int i = 0;
        if (u()) {
            z = g().f629b;
            ((ru2) y33Var.c).m = z;
        } else {
            z = false;
        }
        this.j.add(new cg0(q52Var2, z, Math.max(0L, j), (i() * 1000000) / this.t.e));
        zh[] zhVarArr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (zh zhVar : zhVarArr) {
            if (zhVar.a()) {
                arrayList.add(zhVar);
            } else {
                zhVar.flush();
            }
        }
        int size = arrayList.size();
        this.K = (zh[]) arrayList.toArray(new zh[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            zh[] zhVarArr2 = this.K;
            if (i >= zhVarArr2.length) {
                break;
            }
            zh zhVar2 = zhVarArr2[i];
            zhVar2.flush();
            this.L[i] = zhVar2.b();
            i++;
        }
        ja1 ja1Var = this.r;
        if (ja1Var != null) {
            x50 x50Var = ((wr1) ja1Var.f2735b).P0;
            Handler handler = (Handler) x50Var.f5117b;
            if (handler != null) {
                handler.post(new ym(3, x50Var, z));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0156, code lost:            if ((r4 & r5) != false) goto L98;     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0159, code lost:            if (r21 > 0) goto L98;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015c, code lost:            if (r2 > 0) goto L98;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x015f, code lost:            if (r2 < 0) goto L98;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:65:0x012c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(defpackage.y01 r25, int[] r26) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.b(y01, int[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0029 -> B:4:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c() {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            int r4 = r9.R
            zh[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.p(r7)
            boolean r0 = r4.f()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.w(r0, r7)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.c():boolean");
    }

    public final void d() {
        boolean z;
        if (m()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.c0 = false;
            this.F = 0;
            this.x = new cg0(g().f628a, g().f629b, 0L, 0L);
            this.I = 0L;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0L;
            int i = 0;
            while (true) {
                zh[] zhVarArr = this.K;
                if (i >= zhVarArr.length) {
                    break;
                }
                zh zhVar = zhVarArr[i];
                zhVar.flush();
                this.L[i] = zhVar.b();
                i++;
            }
            AudioTrack audioTrack = this.i.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.u.pause();
            }
            if (n(this.u)) {
                hg0 hg0Var = this.m;
                hg0Var.getClass();
                this.u.unregisterStreamEventCallback(hg0Var.f2416b);
                hg0Var.f2415a.removeCallbacksAndMessages(null);
            }
            if (wi3.f5017a < 21 && !this.V) {
                this.W = 0;
            }
            bg0 bg0Var = this.s;
            if (bg0Var != null) {
                this.t = bg0Var;
                this.s = null;
            }
            ni niVar = this.i;
            niVar.c();
            niVar.c = null;
            niVar.f = null;
            AudioTrack audioTrack2 = this.u;
            u93 u93Var = this.h;
            u93Var.e();
            synchronized (d0) {
                try {
                    if (e0 == null) {
                        e0 = Executors.newSingleThreadExecutor(new p40("ExoPlayer:AudioTrackReleaseThread", 1));
                    }
                    f0++;
                    e0.execute(new lf(12, audioTrack2, u93Var));
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.u = null;
        }
        this.o.f1773a = null;
        this.n.f1773a = null;
    }

    public final int f(y01 y01Var) {
        boolean z = true;
        if ("audio/raw".equals(y01Var.l)) {
            int i = y01Var.A;
            if (!wi3.A(i)) {
                sn1.f();
                return 0;
            }
            if (i != 2 && (!this.c || i != 4)) {
                return 1;
            }
            return 2;
        }
        if (!this.b0 && v(y01Var, this.v)) {
            return 2;
        }
        if (this.f2585a.a(y01Var) == null) {
            z = false;
        }
        if (!z) {
            return 0;
        }
        return 2;
    }

    public final cg0 g() {
        cg0 cg0Var = this.w;
        if (cg0Var == null) {
            ArrayDeque arrayDeque = this.j;
            if (!arrayDeque.isEmpty()) {
                return (cg0) arrayDeque.getLast();
            }
            return this.x;
        }
        return cg0Var;
    }

    public final long h() {
        if (this.t.c == 0) {
            return this.B / r0.f461b;
        }
        return this.C;
    }

    public final long i() {
        if (this.t.c == 0) {
            return this.D / r0.d;
        }
        return this.E;
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0105, code lost:            if (r9.a() == 0) goto L69;     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean j(java.nio.ByteBuffer r25, long r26, int r28) {
        /*
            Method dump skipped, instructions count: 1010
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.j(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean k() {
        if (m() && this.i.b(i())) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l() {
        /*
            Method dump skipped, instructions count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.l():boolean");
    }

    public final boolean m() {
        if (this.u != null) {
            return true;
        }
        return false;
    }

    public final void o() {
        if (!this.T) {
            this.T = true;
            long i = i();
            ni niVar = this.i;
            niVar.A = niVar.a();
            niVar.y = SystemClock.elapsedRealtime() * 1000;
            niVar.B = i;
            this.u.stop();
            this.A = 0;
        }
    }

    public final void p(long j) {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = zh.f5478a;
                }
            }
            if (i == length) {
                w(byteBuffer, j);
            } else {
                zh zhVar = this.K[i];
                if (i > this.R) {
                    zhVar.c(byteBuffer);
                }
                ByteBuffer b2 = zhVar.b();
                this.L[i] = b2;
                if (b2.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void q() {
        d();
        for (zh zhVar : this.f) {
            zhVar.g();
        }
        for (zh zhVar2 : this.g) {
            zhVar2.g();
        }
        this.U = false;
        this.b0 = false;
    }

    public final void r(q52 q52Var, boolean z) {
        cg0 g = g();
        if (!q52Var.equals(g.f628a) || z != g.f629b) {
            cg0 cg0Var = new cg0(q52Var, z, -9223372036854775807L, -9223372036854775807L);
            if (m()) {
                this.w = cg0Var;
            } else {
                this.x = cg0Var;
            }
        }
    }

    public final void s(q52 q52Var) {
        PlaybackParams allowDefaults;
        PlaybackParams speed;
        PlaybackParams pitch;
        PlaybackParams audioFallbackMode;
        PlaybackParams playbackParams;
        float speed2;
        PlaybackParams playbackParams2;
        float pitch2;
        if (m()) {
            allowDefaults = u2.e().allowDefaults();
            speed = allowDefaults.setSpeed(q52Var.f3957a);
            pitch = speed.setPitch(q52Var.f3958b);
            audioFallbackMode = pitch.setAudioFallbackMode(2);
            try {
                this.u.setPlaybackParams(audioFallbackMode);
            } catch (IllegalArgumentException e) {
                sn1.g("Failed to set playback params", e);
            }
            playbackParams = this.u.getPlaybackParams();
            speed2 = playbackParams.getSpeed();
            playbackParams2 = this.u.getPlaybackParams();
            pitch2 = playbackParams2.getPitch();
            q52Var = new q52(speed2, pitch2);
            float f = q52Var.f3957a;
            ni niVar = this.i;
            niVar.j = f;
            mi miVar = niVar.f;
            if (miVar != null) {
                miVar.a();
            }
            niVar.c();
        }
        this.y = q52Var;
    }

    public final void t() {
        if (m()) {
            if (wi3.f5017a >= 21) {
                this.u.setVolume(this.J);
                return;
            }
            AudioTrack audioTrack = this.u;
            float f = this.J;
            audioTrack.setStereoVolume(f, f);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean u() {
        /*
            r4 = this;
            boolean r0 = r4.Z
            r1 = 0
            if (r0 != 0) goto L37
            bg0 r0 = r4.t
            y01 r0 = r0.f460a
            java.lang.String r0 = r0.l
            java.lang.String r2 = "audio/raw"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L37
            bg0 r0 = r4.t
            y01 r0 = r0.f460a
            int r0 = r0.A
            boolean r2 = r4.c
            r3 = 1
            if (r2 == 0) goto L33
            int r2 = defpackage.wi3.f5017a
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            if (r0 == r2) goto L2e
            r2 = 805306368(0x30000000, float:4.656613E-10)
            if (r0 == r2) goto L2e
            r2 = 4
            if (r0 != r2) goto L2c
            goto L2e
        L2c:
            r0 = 0
            goto L2f
        L2e:
            r0 = 1
        L2f:
            if (r0 == 0) goto L33
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            if (r0 != 0) goto L37
            r1 = 1
        L37:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.u():boolean");
    }

    public final boolean v(y01 y01Var, qh qhVar) {
        int i;
        int n;
        boolean isOffloadedPlaybackSupported;
        int i2;
        boolean z;
        boolean z2;
        int i3 = wi3.f5017a;
        if (i3 < 29 || (i = this.l) == 0) {
            return false;
        }
        String str = y01Var.l;
        str.getClass();
        int b2 = vw1.b(str, y01Var.i);
        if (b2 == 0 || (n = wi3.n(y01Var.y)) == 0) {
            return false;
        }
        AudioFormat e = e(y01Var.z, n, b2);
        AudioAttributes audioAttributes = (AudioAttributes) qhVar.a().f4780b;
        if (i3 >= 31) {
            i2 = AudioManager.getPlaybackOffloadSupport(e, audioAttributes);
        } else {
            isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(e, audioAttributes);
            if (!isOffloadedPlaybackSupported) {
                i2 = 0;
            } else if (i3 == 30 && wi3.d.startsWith("Pixel")) {
                i2 = 2;
            } else {
                i2 = 1;
            }
        }
        if (i2 == 0) {
            return false;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                return true;
            }
            throw new IllegalStateException();
        }
        if (y01Var.B == 0 && y01Var.C == 0) {
            z = false;
        } else {
            z = true;
        }
        if (i == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x00df, code lost:            if (r12 < r11) goto L47;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void w(java.nio.ByteBuffer r10, long r11) {
        /*
            Method dump skipped, instructions count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ig0.w(java.nio.ByteBuffer, long):void");
    }
}
