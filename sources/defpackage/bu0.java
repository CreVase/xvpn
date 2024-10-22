package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class bu0 extends jo implements ot0 {
    public static final /* synthetic */ int d0 = 0;
    public final j93 A;
    public final long B;
    public int C;
    public int D;
    public boolean E;
    public int F;
    public final mo2 G;
    public ht2 H;
    public t52 I;
    public gt1 J;
    public y01 K;
    public AudioTrack L;
    public Object M;
    public Surface N;
    public SurfaceHolder O;
    public boolean P;
    public final int Q;
    public ew2 R;
    public final int S;
    public final qh T;
    public float U;
    public boolean V;
    public final boolean W;
    public boolean X;
    public tk0 Y;
    public gt1 Z;
    public p52 a0;

    /* renamed from: b, reason: collision with root package name */
    public final db3 f529b;
    public int b0;
    public final t52 c;
    public long c0;
    public final u93 d = new u93(4);
    public final Context e;
    public final x52 f;
    public final ko[] g;
    public final hq1 h;
    public final z43 i;
    public final hu0 j;
    public final pk0 k;
    public final CopyOnWriteArraySet l;
    public final y83 m;
    public final ArrayList n;
    public final boolean o;
    public final qt1 p;
    public final pa q;
    public final Looper r;
    public final xm s;
    public final t43 t;
    public final yt0 u;
    public final zt0 v;
    public final ob2 w;
    public final wh x;
    public final t13 y;
    public final j93 z;

    static {
        iu0.a("goog.exo.exoplayer");
    }

    public bu0(nt0 nt0Var) {
        boolean z;
        z52 a2;
        boolean z2;
        try {
            sn1.e("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + wi3.e + "]");
            this.e = nt0Var.f3534a.getApplicationContext();
            this.q = (pa) nt0Var.h.apply(nt0Var.f3535b);
            this.T = nt0Var.j;
            this.Q = nt0Var.k;
            this.V = false;
            this.B = nt0Var.p;
            yt0 yt0Var = new yt0(this);
            this.u = yt0Var;
            this.v = new zt0();
            Handler handler = new Handler(nt0Var.i);
            ko[] a3 = ((ni0) nt0Var.c.get()).a(handler, yt0Var, yt0Var, yt0Var, yt0Var);
            this.g = a3;
            if (a3.length > 0) {
                z = true;
            } else {
                z = false;
            }
            cp3.m(z);
            this.h = (hq1) nt0Var.e.get();
            this.p = (qt1) nt0Var.d.get();
            this.s = (xm) nt0Var.g.get();
            this.o = nt0Var.l;
            this.G = nt0Var.m;
            Looper looper = nt0Var.i;
            this.r = looper;
            t43 t43Var = nt0Var.f3535b;
            this.t = t43Var;
            this.f = this;
            this.k = new pk0(looper, t43Var, new qt0(this));
            this.l = new CopyOnWriteArraySet();
            this.n = new ArrayList();
            this.H = new ht2();
            this.f529b = new db3(new cj2[a3.length], new mu0[a3.length], gb3.f2226b, null);
            this.m = new y83();
            u93 u93Var = new u93(5);
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i = 0; i < 21; i++) {
                u93Var.b(iArr[i]);
            }
            this.h.getClass();
            u93Var.b(29);
            wy0 d = u93Var.d();
            this.c = new t52(d);
            u93 u93Var2 = new u93(5);
            for (int i2 = 0; i2 < d.b(); i2++) {
                u93Var2.b(d.a(i2));
            }
            u93Var2.b(4);
            u93Var2.b(10);
            this.I = new t52(u93Var2.d());
            this.i = this.t.a(this.r, null);
            qt0 qt0Var = new qt0(this);
            this.a0 = p52.g(this.f529b);
            ((uf0) this.q).s(this.f, this.r);
            int i3 = wi3.f5017a;
            if (i3 < 31) {
                a2 = new z52();
            } else {
                a2 = vt0.a(this.e, this, nt0Var.q);
            }
            this.j = new hu0(this.g, this.h, this.f529b, (wl1) nt0Var.f.get(), this.s, 0, this.q, this.G, nt0Var.n, nt0Var.o, false, this.r, this.t, qt0Var, a2);
            this.U = 1.0f;
            gt1 gt1Var = gt1.I;
            this.J = gt1Var;
            this.Z = gt1Var;
            int i4 = -1;
            this.b0 = -1;
            if (i3 < 21) {
                AudioTrack audioTrack = this.L;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.L.release();
                    this.L = null;
                }
                if (this.L == null) {
                    this.L = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.S = this.L.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.e.getSystemService("audio");
                if (audioManager != null) {
                    i4 = audioManager.generateAudioSessionId();
                }
                this.S = i4;
            }
            String str = ic0.c;
            this.W = true;
            pa paVar = this.q;
            paVar.getClass();
            this.k.a(paVar);
            xm xmVar = this.s;
            Handler handler2 = new Handler(this.r);
            pa paVar2 = this.q;
            mg0 mg0Var = (mg0) xmVar;
            mg0Var.getClass();
            paVar2.getClass();
            v51 v51Var = mg0Var.f3289b;
            v51Var.getClass();
            v51Var.r(paVar2);
            ((CopyOnWriteArrayList) v51Var.f4780b).add(new wm(handler2, paVar2));
            this.l.add(this.u);
            ob2 ob2Var = new ob2(nt0Var.f3534a, handler, this.u);
            this.w = ob2Var;
            ob2Var.d(false);
            wh whVar = new wh(nt0Var.f3534a, handler, this.u);
            this.x = whVar;
            whVar.c();
            t13 t13Var = new t13(nt0Var.f3534a, handler, this.u);
            this.y = t13Var;
            t13Var.b(wi3.t(this.T.c));
            j93 j93Var = new j93(nt0Var.f3534a, 2);
            this.z = j93Var;
            j93Var.e();
            j93 j93Var2 = new j93(nt0Var.f3534a, 3);
            this.A = j93Var2;
            j93Var2.e();
            this.Y = b(t13Var);
            String str2 = lk3.e;
            this.R = ew2.c;
            hq1 hq1Var = this.h;
            qh qhVar = this.T;
            nj0 nj0Var = (nj0) hq1Var;
            synchronized (nj0Var.c) {
                z2 = !nj0Var.h.equals(qhVar);
                nj0Var.h = qhVar;
            }
            if (z2) {
                nj0Var.g();
            }
            v(1, 10, Integer.valueOf(this.S));
            v(2, 10, Integer.valueOf(this.S));
            v(1, 3, this.T);
            v(2, 4, Integer.valueOf(this.Q));
            v(2, 5, 0);
            v(1, 9, Boolean.valueOf(this.V));
            v(2, 7, this.v);
            v(6, 8, this.v);
        } finally {
            this.d.h();
        }
    }

    public static tk0 b(t13 t13Var) {
        int i;
        t13Var.getClass();
        if (wi3.f5017a >= 28) {
            i = t13Var.d.getStreamMinVolume(t13Var.f);
        } else {
            i = 0;
        }
        return new tk0(0, i, t13Var.d.getStreamMaxVolume(t13Var.f));
    }

    public static long o(p52 p52Var) {
        z83 z83Var = new z83();
        y83 y83Var = new y83();
        p52Var.f3785a.h(p52Var.f3786b.f3536a, y83Var);
        long j = p52Var.c;
        if (j == -9223372036854775807L) {
            return p52Var.f3785a.n(y83Var.c, z83Var).m;
        }
        return y83Var.e + j;
    }

    public static boolean p(p52 p52Var) {
        if (p52Var.e == 3 && p52Var.l && p52Var.m == 0) {
            return true;
        }
        return false;
    }

    public final void A(final p52 p52Var, final int i, final int i2, boolean z, int i3, long j) {
        Pair pair;
        int i4;
        dt1 dt1Var;
        int l;
        int e;
        int i5;
        boolean z2;
        Object obj;
        int i6;
        dt1 dt1Var2;
        Object obj2;
        int i7;
        long j2;
        long j3;
        long j4;
        long o;
        Object obj3;
        dt1 dt1Var3;
        Object obj4;
        int i8;
        p52 p52Var2 = this.a0;
        this.a0 = p52Var;
        boolean z3 = !p52Var2.f3785a.equals(p52Var.f3785a);
        a93 a93Var = p52Var2.f3785a;
        a93 a93Var2 = p52Var.f3785a;
        if (a93Var2.q() && a93Var.q()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (a93Var2.q() != a93Var.q()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else {
            rt1 rt1Var = p52Var2.f3786b;
            Object obj5 = rt1Var.f3536a;
            y83 y83Var = this.m;
            int i9 = a93Var.h(obj5, y83Var).c;
            z83 z83Var = this.f2797a;
            Object obj6 = a93Var.n(i9, z83Var).f5444a;
            rt1 rt1Var2 = p52Var.f3786b;
            if (!obj6.equals(a93Var2.n(a93Var2.h(rt1Var2.f3536a, y83Var).c, z83Var).f5444a)) {
                if (z && i3 == 0) {
                    i4 = 1;
                } else if (z && i3 == 1) {
                    i4 = 2;
                } else {
                    if (!z3) {
                        throw new IllegalStateException();
                    }
                    i4 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
            } else if (z && i3 == 0 && rt1Var.d < rt1Var2.d) {
                pair = new Pair(Boolean.TRUE, 0);
            } else {
                pair = new Pair(Boolean.FALSE, -1);
            }
        }
        boolean booleanValue = ((Boolean) pair.first).booleanValue();
        int intValue = ((Integer) pair.second).intValue();
        gt1 gt1Var = this.J;
        if (booleanValue) {
            dt1Var = !p52Var.f3785a.q() ? p52Var.f3785a.n(p52Var.f3785a.h(p52Var.f3786b.f3536a, this.m).c, this.f2797a).c : null;
            this.Z = gt1.I;
        } else {
            dt1Var = null;
        }
        if (booleanValue || !p52Var2.j.equals(p52Var.j)) {
            gt1 gt1Var2 = this.Z;
            gt1Var2.getClass();
            ft1 ft1Var = new ft1(gt1Var2);
            List list = p52Var.j;
            for (int i10 = 0; i10 < list.size(); i10++) {
                Metadata metadata = (Metadata) list.get(i10);
                int i11 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f1467a;
                    if (i11 < entryArr.length) {
                        entryArr[i11].w(ft1Var);
                        i11++;
                    }
                }
            }
            this.Z = new gt1(ft1Var);
            gt1Var = a();
        }
        boolean z4 = !gt1Var.equals(this.J);
        this.J = gt1Var;
        boolean z5 = p52Var2.l != p52Var.l;
        boolean z6 = p52Var2.e != p52Var.e;
        if (z6 || z5) {
            B();
        }
        boolean z7 = p52Var2.g != p52Var.g;
        if (z3) {
            final int i12 = 0;
            this.k.j(0, new rl1() { // from class: st0
                @Override // defpackage.rl1
                public final void invoke(Object obj7) {
                    int i13 = i12;
                    int i14 = i;
                    p52 p52Var3 = p52Var;
                    switch (i13) {
                        case 0:
                            ((v52) obj7).onTimelineChanged(p52Var3.f3785a, i14);
                            return;
                        default:
                            ((v52) obj7).onPlayWhenReadyChanged(p52Var3.l, i14);
                            return;
                    }
                }
            });
        }
        if (z) {
            y83 y83Var2 = new y83();
            if (p52Var2.f3785a.q()) {
                obj = null;
                i6 = -1;
                dt1Var2 = null;
                obj2 = null;
                i7 = -1;
            } else {
                Object obj7 = p52Var2.f3786b.f3536a;
                p52Var2.f3785a.h(obj7, y83Var2);
                int i13 = y83Var2.c;
                i7 = p52Var2.f3785a.b(obj7);
                obj = p52Var2.f3785a.n(i13, this.f2797a).f5444a;
                dt1Var2 = this.f2797a.c;
                obj2 = obj7;
                i6 = i13;
            }
            if (i3 == 0) {
                if (p52Var2.f3786b.a()) {
                    rt1 rt1Var3 = p52Var2.f3786b;
                    j4 = y83Var2.a(rt1Var3.f3537b, rt1Var3.c);
                    o = o(p52Var2);
                } else if (p52Var2.f3786b.e != -1) {
                    j4 = o(this.a0);
                    o = j4;
                } else {
                    j2 = y83Var2.e;
                    j3 = y83Var2.d;
                    j4 = j2 + j3;
                    o = j4;
                }
            } else if (p52Var2.f3786b.a()) {
                j4 = p52Var2.r;
                o = o(p52Var2);
            } else {
                j2 = y83Var2.e;
                j3 = p52Var2.r;
                j4 = j2 + j3;
                o = j4;
            }
            long K = wi3.K(j4);
            long K2 = wi3.K(o);
            rt1 rt1Var4 = p52Var2.f3786b;
            w52 w52Var = new w52(obj, i6, dt1Var2, obj2, i7, K, K2, rt1Var4.f3537b, rt1Var4.c);
            int g = g();
            if (this.a0.f3785a.q()) {
                obj3 = null;
                dt1Var3 = null;
                obj4 = null;
                i8 = -1;
            } else {
                p52 p52Var3 = this.a0;
                Object obj8 = p52Var3.f3786b.f3536a;
                p52Var3.f3785a.h(obj8, this.m);
                int b2 = this.a0.f3785a.b(obj8);
                a93 a93Var3 = this.a0.f3785a;
                z83 z83Var2 = this.f2797a;
                Object obj9 = a93Var3.n(g, z83Var2).f5444a;
                i8 = b2;
                dt1Var3 = z83Var2.c;
                obj4 = obj8;
                obj3 = obj9;
            }
            long K3 = wi3.K(j);
            long K4 = this.a0.f3786b.a() ? wi3.K(o(this.a0)) : K3;
            rt1 rt1Var5 = this.a0.f3786b;
            this.k.j(11, new bi3(w52Var, new w52(obj3, g, dt1Var3, obj4, i8, K3, K4, rt1Var5.f3537b, rt1Var5.c), i3));
        }
        if (booleanValue) {
            this.k.j(1, new ut0(dt1Var, intValue));
        }
        final int i14 = 4;
        if (p52Var2.f != p52Var.f) {
            final int i15 = 3;
            this.k.j(10, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj10) {
                    int i16 = i15;
                    p52 p52Var4 = p52Var;
                    switch (i16) {
                        case 0:
                            ((v52) obj10).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj10).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj10).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj10).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj10).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj10).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj10;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj10).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj10).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
            if (p52Var.f != null) {
                this.k.j(10, new rl1() { // from class: tt0
                    @Override // defpackage.rl1
                    public final void invoke(Object obj10) {
                        int i16 = i14;
                        p52 p52Var4 = p52Var;
                        switch (i16) {
                            case 0:
                                ((v52) obj10).onPlaybackSuppressionReasonChanged(p52Var4.m);
                                return;
                            case 1:
                                ((v52) obj10).onIsPlayingChanged(bu0.p(p52Var4));
                                return;
                            case 2:
                                ((v52) obj10).onPlaybackParametersChanged(p52Var4.n);
                                return;
                            case 3:
                                ((v52) obj10).onPlayerErrorChanged(p52Var4.f);
                                return;
                            case 4:
                                ((v52) obj10).onPlayerError(p52Var4.f);
                                return;
                            case 5:
                                ((v52) obj10).onTracksChanged(p52Var4.i.d);
                                return;
                            case 6:
                                v52 v52Var = (v52) obj10;
                                v52Var.onLoadingChanged(p52Var4.g);
                                v52Var.onIsLoadingChanged(p52Var4.g);
                                return;
                            case 7:
                                ((v52) obj10).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                                return;
                            default:
                                ((v52) obj10).onPlaybackStateChanged(p52Var4.e);
                                return;
                        }
                    }
                });
            }
        }
        db3 db3Var = p52Var2.i;
        db3 db3Var2 = p52Var.i;
        final int i16 = 5;
        if (db3Var != db3Var2) {
            hq1 hq1Var = this.h;
            Object obj10 = db3Var2.e;
            hq1Var.getClass();
            this.k.j(2, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i16;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        int i17 = 12;
        if (z4) {
            this.k.j(14, new z5(this.J, i17));
        }
        final int i18 = 6;
        if (z7) {
            this.k.j(3, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i18;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        final int i19 = 7;
        if (z6 || z5) {
            this.k.j(-1, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i19;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        final int i20 = 8;
        if (z6) {
            this.k.j(4, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i20;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        if (z5) {
            final int i21 = 1;
            this.k.j(5, new rl1() { // from class: st0
                @Override // defpackage.rl1
                public final void invoke(Object obj72) {
                    int i132 = i21;
                    int i142 = i2;
                    p52 p52Var32 = p52Var;
                    switch (i132) {
                        case 0:
                            ((v52) obj72).onTimelineChanged(p52Var32.f3785a, i142);
                            return;
                        default:
                            ((v52) obj72).onPlayWhenReadyChanged(p52Var32.l, i142);
                            return;
                    }
                }
            });
        }
        if (p52Var2.m != p52Var.m) {
            final int i22 = 0;
            this.k.j(6, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i22;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        if (p(p52Var2) != p(p52Var)) {
            final int i23 = 1;
            this.k.j(7, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i23;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        if (!p52Var2.n.equals(p52Var.n)) {
            final int i24 = 2;
            this.k.j(12, new rl1() { // from class: tt0
                @Override // defpackage.rl1
                public final void invoke(Object obj102) {
                    int i162 = i24;
                    p52 p52Var4 = p52Var;
                    switch (i162) {
                        case 0:
                            ((v52) obj102).onPlaybackSuppressionReasonChanged(p52Var4.m);
                            return;
                        case 1:
                            ((v52) obj102).onIsPlayingChanged(bu0.p(p52Var4));
                            return;
                        case 2:
                            ((v52) obj102).onPlaybackParametersChanged(p52Var4.n);
                            return;
                        case 3:
                            ((v52) obj102).onPlayerErrorChanged(p52Var4.f);
                            return;
                        case 4:
                            ((v52) obj102).onPlayerError(p52Var4.f);
                            return;
                        case 5:
                            ((v52) obj102).onTracksChanged(p52Var4.i.d);
                            return;
                        case 6:
                            v52 v52Var = (v52) obj102;
                            v52Var.onLoadingChanged(p52Var4.g);
                            v52Var.onIsLoadingChanged(p52Var4.g);
                            return;
                        case 7:
                            ((v52) obj102).onPlayerStateChanged(p52Var4.l, p52Var4.e);
                            return;
                        default:
                            ((v52) obj102).onPlaybackStateChanged(p52Var4.e);
                            return;
                    }
                }
            });
        }
        t52 t52Var = this.I;
        int i25 = wi3.f5017a;
        bu0 bu0Var = (bu0) this.f;
        boolean q = bu0Var.q();
        a93 k = bu0Var.k();
        boolean q2 = k.q();
        z83 z83Var3 = bu0Var.f2797a;
        boolean z8 = !q2 && k.n(bu0Var.g(), z83Var3).h;
        a93 k2 = bu0Var.k();
        if (k2.q()) {
            l = -1;
        } else {
            int g2 = bu0Var.g();
            bu0Var.C();
            bu0Var.C();
            l = k2.l(g2, 0, false);
        }
        boolean z9 = l != -1;
        a93 k3 = bu0Var.k();
        if (k3.q()) {
            e = -1;
        } else {
            int g3 = bu0Var.g();
            bu0Var.C();
            bu0Var.C();
            e = k3.e(g3, 0, false);
        }
        boolean z10 = e != -1;
        a93 k4 = bu0Var.k();
        boolean z11 = !k4.q() && k4.n(bu0Var.g(), z83Var3).a();
        a93 k5 = bu0Var.k();
        boolean z12 = !k5.q() && k5.n(bu0Var.g(), z83Var3).i;
        boolean q3 = bu0Var.k().q();
        s52 s52Var = new s52();
        wy0 wy0Var = this.c.f4453a;
        u93 u93Var = s52Var.f4276a;
        u93Var.getClass();
        for (int i26 = 0; i26 < wy0Var.b(); i26++) {
            u93Var.b(wy0Var.a(i26));
        }
        boolean z13 = !q;
        s52Var.a(4, z13);
        s52Var.a(5, z8 && !q);
        s52Var.a(6, z9 && !q);
        s52Var.a(7, !q3 && (z9 || !z11 || z8) && !q);
        s52Var.a(8, z10 && !q);
        s52Var.a(9, !q3 && (z10 || (z11 && z12)) && !q);
        s52Var.a(10, z13);
        s52Var.a(11, z8 && !q);
        if (!z8 || q) {
            i5 = 12;
            z2 = false;
        } else {
            i5 = 12;
            z2 = true;
        }
        s52Var.a(i5, z2);
        t52 t52Var2 = new t52(s52Var.f4276a.d());
        this.I = t52Var2;
        if (!t52Var2.equals(t52Var)) {
            this.k.j(13, new qt0(this));
        }
        this.k.g();
        if (p52Var2.o != p52Var.o) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((yt0) it.next()).f5387a.B();
            }
        }
    }

    public final void B() {
        C();
        int i = this.a0.e;
        boolean z = false;
        j93 j93Var = this.A;
        j93 j93Var2 = this.z;
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i != 4) {
                    throw new IllegalStateException();
                }
            } else {
                C();
                boolean z2 = this.a0.o;
                if (n() && !z2) {
                    z = true;
                }
                j93Var2.f(z);
                j93Var.f(n());
                return;
            }
        }
        j93Var2.f(false);
        j93Var.f(false);
    }

    public final void C() {
        IllegalStateException illegalStateException;
        u93 u93Var = this.d;
        synchronized (u93Var) {
            boolean z = false;
            while (!u93Var.f4639a) {
                try {
                    u93Var.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.r;
        if (currentThread != looper.getThread()) {
            String m = wi3.m("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), looper.getThread().getName());
            if (!this.W) {
                if (this.X) {
                    illegalStateException = null;
                } else {
                    illegalStateException = new IllegalStateException();
                }
                sn1.g(m, illegalStateException);
                this.X = true;
                return;
            }
            throw new IllegalStateException(m);
        }
    }

    public final gt1 a() {
        a93 k = k();
        if (k.q()) {
            return this.Z;
        }
        dt1 dt1Var = k.n(g(), this.f2797a).c;
        gt1 gt1Var = this.Z;
        gt1Var.getClass();
        ft1 ft1Var = new ft1(gt1Var);
        gt1 gt1Var2 = dt1Var.d;
        if (gt1Var2 != null) {
            CharSequence charSequence = gt1Var2.f2321a;
            if (charSequence != null) {
                ft1Var.f2149a = charSequence;
            }
            CharSequence charSequence2 = gt1Var2.f2322b;
            if (charSequence2 != null) {
                ft1Var.f2150b = charSequence2;
            }
            CharSequence charSequence3 = gt1Var2.c;
            if (charSequence3 != null) {
                ft1Var.c = charSequence3;
            }
            CharSequence charSequence4 = gt1Var2.d;
            if (charSequence4 != null) {
                ft1Var.d = charSequence4;
            }
            CharSequence charSequence5 = gt1Var2.e;
            if (charSequence5 != null) {
                ft1Var.e = charSequence5;
            }
            CharSequence charSequence6 = gt1Var2.f;
            if (charSequence6 != null) {
                ft1Var.f = charSequence6;
            }
            CharSequence charSequence7 = gt1Var2.g;
            if (charSequence7 != null) {
                ft1Var.g = charSequence7;
            }
            ig2 ig2Var = gt1Var2.h;
            if (ig2Var != null) {
                ft1Var.h = ig2Var;
            }
            ig2 ig2Var2 = gt1Var2.i;
            if (ig2Var2 != null) {
                ft1Var.i = ig2Var2;
            }
            byte[] bArr = gt1Var2.j;
            if (bArr != null) {
                ft1Var.j = (byte[]) bArr.clone();
                ft1Var.k = gt1Var2.k;
            }
            Uri uri = gt1Var2.l;
            if (uri != null) {
                ft1Var.l = uri;
            }
            Integer num = gt1Var2.m;
            if (num != null) {
                ft1Var.m = num;
            }
            Integer num2 = gt1Var2.n;
            if (num2 != null) {
                ft1Var.n = num2;
            }
            Integer num3 = gt1Var2.o;
            if (num3 != null) {
                ft1Var.o = num3;
            }
            Boolean bool = gt1Var2.p;
            if (bool != null) {
                ft1Var.p = bool;
            }
            Boolean bool2 = gt1Var2.q;
            if (bool2 != null) {
                ft1Var.q = bool2;
            }
            Integer num4 = gt1Var2.r;
            if (num4 != null) {
                ft1Var.r = num4;
            }
            Integer num5 = gt1Var2.s;
            if (num5 != null) {
                ft1Var.r = num5;
            }
            Integer num6 = gt1Var2.t;
            if (num6 != null) {
                ft1Var.s = num6;
            }
            Integer num7 = gt1Var2.u;
            if (num7 != null) {
                ft1Var.t = num7;
            }
            Integer num8 = gt1Var2.v;
            if (num8 != null) {
                ft1Var.u = num8;
            }
            Integer num9 = gt1Var2.w;
            if (num9 != null) {
                ft1Var.v = num9;
            }
            Integer num10 = gt1Var2.x;
            if (num10 != null) {
                ft1Var.w = num10;
            }
            CharSequence charSequence8 = gt1Var2.y;
            if (charSequence8 != null) {
                ft1Var.x = charSequence8;
            }
            CharSequence charSequence9 = gt1Var2.z;
            if (charSequence9 != null) {
                ft1Var.y = charSequence9;
            }
            CharSequence charSequence10 = gt1Var2.A;
            if (charSequence10 != null) {
                ft1Var.z = charSequence10;
            }
            Integer num11 = gt1Var2.B;
            if (num11 != null) {
                ft1Var.A = num11;
            }
            Integer num12 = gt1Var2.C;
            if (num12 != null) {
                ft1Var.B = num12;
            }
            CharSequence charSequence11 = gt1Var2.D;
            if (charSequence11 != null) {
                ft1Var.C = charSequence11;
            }
            CharSequence charSequence12 = gt1Var2.E;
            if (charSequence12 != null) {
                ft1Var.D = charSequence12;
            }
            CharSequence charSequence13 = gt1Var2.F;
            if (charSequence13 != null) {
                ft1Var.E = charSequence13;
            }
            Integer num13 = gt1Var2.G;
            if (num13 != null) {
                ft1Var.F = num13;
            }
            Bundle bundle = gt1Var2.H;
            if (bundle != null) {
                ft1Var.G = bundle;
            }
        }
        return new gt1(ft1Var);
    }

    public final c62 c(ko koVar) {
        int i;
        int l = l();
        a93 a93Var = this.a0.f3785a;
        if (l == -1) {
            i = 0;
        } else {
            i = l;
        }
        t43 t43Var = this.t;
        hu0 hu0Var = this.j;
        return new c62(hu0Var, koVar, a93Var, i, t43Var, hu0Var.j);
    }

    public final long d() {
        C();
        if (q()) {
            p52 p52Var = this.a0;
            a93 a93Var = p52Var.f3785a;
            Object obj = p52Var.f3786b.f3536a;
            y83 y83Var = this.m;
            a93Var.h(obj, y83Var);
            p52 p52Var2 = this.a0;
            if (p52Var2.c == -9223372036854775807L) {
                return wi3.K(p52Var2.f3785a.n(g(), this.f2797a).m);
            }
            return wi3.K(y83Var.e) + wi3.K(this.a0.c);
        }
        return i();
    }

    public final int e() {
        C();
        if (q()) {
            return this.a0.f3786b.f3537b;
        }
        return -1;
    }

    public final int f() {
        C();
        if (q()) {
            return this.a0.f3786b.c;
        }
        return -1;
    }

    public final int g() {
        C();
        int l = l();
        if (l == -1) {
            return 0;
        }
        return l;
    }

    public final int h() {
        C();
        if (this.a0.f3785a.q()) {
            return 0;
        }
        p52 p52Var = this.a0;
        return p52Var.f3785a.b(p52Var.f3786b.f3536a);
    }

    public final long i() {
        C();
        return wi3.K(j(this.a0));
    }

    public final long j(p52 p52Var) {
        if (p52Var.f3785a.q()) {
            return wi3.C(this.c0);
        }
        if (p52Var.f3786b.a()) {
            return p52Var.r;
        }
        a93 a93Var = p52Var.f3785a;
        rt1 rt1Var = p52Var.f3786b;
        long j = p52Var.r;
        Object obj = rt1Var.f3536a;
        y83 y83Var = this.m;
        a93Var.h(obj, y83Var);
        return j + y83Var.e;
    }

    public final a93 k() {
        C();
        return this.a0.f3785a;
    }

    public final int l() {
        if (this.a0.f3785a.q()) {
            return this.b0;
        }
        p52 p52Var = this.a0;
        return p52Var.f3785a.h(p52Var.f3786b.f3536a, this.m).c;
    }

    public final Pair m(a93 a93Var, d62 d62Var) {
        boolean z;
        long d = d();
        int i = -1;
        if (!a93Var.q() && !d62Var.q()) {
            Pair j = a93Var.j(this.f2797a, this.m, g(), wi3.C(d));
            Object obj = j.first;
            if (d62Var.b(obj) != -1) {
                return j;
            }
            Object H = hu0.H(this.f2797a, this.m, 0, false, obj, a93Var, d62Var);
            if (H != null) {
                y83 y83Var = this.m;
                d62Var.h(H, y83Var);
                int i2 = y83Var.c;
                return s(d62Var, i2, wi3.K(d62Var.n(i2, this.f2797a).m));
            }
            return s(d62Var, -1, -9223372036854775807L);
        }
        if (!a93Var.q() && d62Var.q()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = l();
        }
        if (z) {
            d = -9223372036854775807L;
        }
        return s(d62Var, i, d);
    }

    public final boolean n() {
        C();
        return this.a0.l;
    }

    public final boolean q() {
        C();
        return this.a0.f3786b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a3, code lost:            if (r2 != r4.c) goto L28;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.p52 r(defpackage.p52 r21, defpackage.d62 r22, android.util.Pair r23) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bu0.r(p52, d62, android.util.Pair):p52");
    }

    public final Pair s(d62 d62Var, int i, long j) {
        if (d62Var.q()) {
            this.b0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.c0 = j;
            return null;
        }
        if (i == -1 || i >= d62Var.g) {
            i = d62Var.a(false);
            j = wi3.K(d62Var.n(i, this.f2797a).m);
        }
        return d62Var.j(this.f2797a, this.m, i, wi3.C(j));
    }

    public final void t(final int i, final int i2) {
        ew2 ew2Var = this.R;
        if (i != ew2Var.f2010a || i2 != ew2Var.f2011b) {
            this.R = new ew2(i, i2);
            this.k.l(24, new rl1() { // from class: pt0
                @Override // defpackage.rl1
                public final void invoke(Object obj) {
                    ((v52) obj).onSurfaceSizeChanged(i, i2);
                }
            });
        }
    }

    public final void u() {
        SurfaceHolder surfaceHolder = this.O;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.u);
            this.O = null;
        }
    }

    public final void v(int i, int i2, Object obj) {
        for (ko koVar : this.g) {
            if (koVar.f2983a == i) {
                c62 c = c(koVar);
                cp3.m(!c.g);
                c.d = i2;
                cp3.m(!c.g);
                c.e = obj;
                c.c();
            }
        }
    }

    public final void w(Surface surface) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (ko koVar : this.g) {
            if (koVar.f2983a == 2) {
                c62 c = c(koVar);
                cp3.m(!c.g);
                c.d = 1;
                cp3.m(true ^ c.g);
                c.e = surface;
                c.c();
                arrayList.add(c);
            }
        }
        Object obj = this.M;
        if (obj != null && obj != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((c62) it.next()).a(this.B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj2 = this.M;
            Surface surface2 = this.N;
            if (obj2 == surface2) {
                surface2.release();
                this.N = null;
            }
        }
        this.M = surface;
        if (z) {
            y(new jt0(2, new ju0(3), 1003));
        }
    }

    public final void x(float f) {
        C();
        final float h = wi3.h(f, 0.0f, 1.0f);
        if (this.U == h) {
            return;
        }
        this.U = h;
        v(1, 2, Float.valueOf(this.x.g * h));
        this.k.l(22, new rl1() { // from class: rt0
            @Override // defpackage.rl1
            public final void invoke(Object obj) {
                ((v52) obj).onVolumeChanged(h);
            }
        });
    }

    public final void y(jt0 jt0Var) {
        boolean z;
        p52 p52Var = this.a0;
        p52 a2 = p52Var.a(p52Var.f3786b);
        a2.p = a2.r;
        a2.q = 0L;
        p52 e = a2.e(1);
        if (jt0Var != null) {
            e = e.d(jt0Var);
        }
        p52 p52Var2 = e;
        this.C++;
        z43 z43Var = this.j.h;
        z43Var.getClass();
        y43 b2 = z43.b();
        b2.f5269a = z43Var.f5426a.obtainMessage(6);
        b2.a();
        if (p52Var2.f3785a.q() && !this.a0.f3785a.q()) {
            z = true;
        } else {
            z = false;
        }
        A(p52Var2, 0, 1, z, 4, j(p52Var2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r14v4 */
    public final void z(int i, int i2, boolean z) {
        ?? r14;
        int i3 = 0;
        if (z && i != -1) {
            r14 = 1;
        } else {
            r14 = 0;
        }
        if (r14 != 0 && i != 1) {
            i3 = 1;
        }
        p52 p52Var = this.a0;
        if (p52Var.l == r14 && p52Var.m == i3) {
            return;
        }
        this.C++;
        p52 c = p52Var.c(i3, r14);
        z43 z43Var = this.j.h;
        z43Var.getClass();
        y43 b2 = z43.b();
        b2.f5269a = z43Var.f5426a.obtainMessage(1, r14, i3);
        b2.a();
        A(c, 0, i2, false, 5, -9223372036854775807L);
    }
}
