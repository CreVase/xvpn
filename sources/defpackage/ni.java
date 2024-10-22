package defpackage;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class ni {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public final eg0 f3462a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f3463b;
    public AudioTrack c;
    public int d;
    public int e;
    public mi f;
    public int g;
    public boolean h;
    public long i;
    public float j;
    public boolean k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public int w;
    public int x;
    public long y;
    public long z;

    public ni(eg0 eg0Var) {
        this.f3462a = eg0Var;
        if (wi3.f5017a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f3463b = new long[10];
    }

    public final long a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.y;
        if (j != -9223372036854775807L) {
            return Math.min(this.B, this.A + ((wi3.q((elapsedRealtime * 1000) - j, this.j) * this.g) / 1000000));
        }
        if (elapsedRealtime - this.s >= 5) {
            AudioTrack audioTrack = this.c;
            audioTrack.getClass();
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (this.h) {
                    if (playState == 2 && playbackHeadPosition == 0) {
                        this.v = this.t;
                    }
                    playbackHeadPosition += this.v;
                }
                if (wi3.f5017a <= 29) {
                    if (playbackHeadPosition == 0 && this.t > 0 && playState == 3) {
                        if (this.z == -9223372036854775807L) {
                            this.z = elapsedRealtime;
                        }
                    } else {
                        this.z = -9223372036854775807L;
                    }
                }
                if (this.t > playbackHeadPosition) {
                    this.u++;
                }
                this.t = playbackHeadPosition;
            }
            this.s = elapsedRealtime;
        }
        return this.t + (this.u << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean b(long r6) {
        /*
            r5 = this;
            long r0 = r5.a()
            r2 = 1
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto L2b
            boolean r6 = r5.h
            r7 = 0
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.c
            r6.getClass()
            int r6 = r6.getPlayState()
            r0 = 2
            if (r6 != r0) goto L26
            long r0 = r5.a()
            r3 = 0
            int r6 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r6 != 0) goto L26
            r6 = 1
            goto L27
        L26:
            r6 = 0
        L27:
            if (r6 == 0) goto L2a
            goto L2b
        L2a:
            r2 = 0
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ni.b(long):boolean");
    }

    public final void c() {
        this.l = 0L;
        this.x = 0;
        this.w = 0;
        this.m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.k = false;
    }
}
