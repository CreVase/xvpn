package com.chartboost.sdk.impl;

import android.media.MediaPlayer;
import android.os.Build;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.aa;
import com.chartboost.sdk.impl.ga;
import com.chartboost.sdk.impl.i0;
import defpackage.ch3;
import defpackage.hx2;
import defpackage.n41;
import defpackage.o41;
import defpackage.p71;
import defpackage.v31;
import defpackage.v90;
import defpackage.y41;

/* loaded from: classes.dex */
public final class i0 implements k0, SurfaceHolder.Callback, ga.b, aa.b, f1 {

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f867a;

    /* renamed from: b, reason: collision with root package name */
    public SurfaceView f868b;
    public l0 c;
    public final s9 d;
    public final o41 e;
    public final v90 f;
    public final r4 g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public SurfaceHolder n;
    public y7 o;
    public aa p;
    public final ga q;
    public boolean r;
    public float s;

    /* loaded from: classes.dex */
    public /* synthetic */ class a extends y41 implements v31 {
        public a(Object obj) {
            super(0, obj, i0.class, "startMediaPlayer", "startMediaPlayer()V", 0);
        }

        public final void a() {
            ((i0) this.receiver).n();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    public i0(MediaPlayer mediaPlayer, SurfaceView surfaceView, l0 l0Var, s9 s9Var, n41 n41Var, o41 o41Var, v90 v90Var, r4 r4Var) {
        this.f867a = mediaPlayer;
        this.f868b = surfaceView;
        this.c = l0Var;
        this.d = s9Var;
        this.e = o41Var;
        this.f = v90Var;
        this.g = r4Var;
        this.n = surfaceView != null ? surfaceView.getHolder() : null;
        this.q = (ga) n41Var.invoke(this.c, this, s9Var);
    }

    @Override // com.chartboost.sdk.impl.ga.b
    public long b() {
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        this.h = currentPosition;
        return currentPosition;
    }

    public final void c(int i, int i2) {
        String str;
        String n = hx2.n("error: ", i, " extra: ", i2);
        str = j0.f887a;
        f6.b(str, "MediaPlayer error: " + n);
        if (this.i) {
            h();
        }
    }

    @Override // com.chartboost.sdk.impl.k0
    public void d() {
        this.s = 0.0f;
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.f1
    public void e() {
        this.m = true;
    }

    @Override // com.chartboost.sdk.impl.k0
    public boolean f() {
        return this.r;
    }

    @Override // com.chartboost.sdk.impl.aa.b
    public void g() {
        this.j = true;
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        l();
        MediaPlayer mediaPlayer2 = this.f867a;
        if (mediaPlayer2 != null) {
            mediaPlayer2.prepareAsync();
        }
        l0 l0Var = this.c;
        if (l0Var != null) {
            l0Var.d();
        }
    }

    public final void h() {
        if (this.j && !this.l) {
            aa aaVar = this.p;
            if (aaVar != null) {
                aaVar.a();
            }
            this.l = false;
            l0 l0Var = this.c;
            if (l0Var != null) {
                l0Var.c();
            }
            pause();
            aa aaVar2 = this.p;
            if (aaVar2 != null) {
                aaVar2.c();
            }
        }
    }

    public final void i() {
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.c = null;
        this.f867a = null;
        this.n = null;
        this.f868b = null;
        this.p = null;
    }

    public final void j() {
        this.q.a();
    }

    public final void k() {
        ga.a.a(this.q, 0L, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:            if (r2 == null) goto L12;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l() {
        /*
            r5 = this;
            ch3 r0 = defpackage.ch3.f636a
            r1 = 0
            com.chartboost.sdk.impl.y7 r2 = r5.o     // Catch: java.io.IOException -> L31
            if (r2 == 0) goto L19
            java.io.FileDescriptor r2 = r2.b()     // Catch: java.io.IOException -> L31
            if (r2 == 0) goto L19
            android.media.MediaPlayer r3 = r5.f867a     // Catch: java.io.IOException -> L31
            if (r3 == 0) goto L16
            r3.setDataSource(r2)     // Catch: java.io.IOException -> L31
            r2 = r0
            goto L17
        L16:
            r2 = r1
        L17:
            if (r2 != 0) goto L25
        L19:
            com.chartboost.sdk.impl.l0 r2 = r5.c     // Catch: java.io.IOException -> L31
            if (r2 == 0) goto L24
            java.lang.String r3 = "Missing video asset"
            r2.a(r3)     // Catch: java.io.IOException -> L31
            r2 = r0
            goto L25
        L24:
            r2 = r1
        L25:
            if (r2 != 0) goto L65
            java.lang.String r2 = com.chartboost.sdk.impl.j0.a()     // Catch: java.io.IOException -> L31
            java.lang.String r3 = "MediaPlayer missing callback on error"
            com.chartboost.sdk.impl.f6.b(r2, r3)     // Catch: java.io.IOException -> L31
            goto L65
        L31:
            r2 = move-exception
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 23
            if (r3 >= r4) goto L41
            android.media.MediaPlayer r3 = r5.f867a
            if (r3 == 0) goto L41
            java.lang.String r4 = ""
            r3.setDataSource(r4)
        L41:
            com.chartboost.sdk.impl.l0 r3 = r5.c
            if (r3 == 0) goto L4d
            java.lang.String r1 = r2.toString()
            r3.a(r1)
            goto L4e
        L4d:
            r0 = r1
        L4e:
            if (r0 != 0) goto L65
            java.lang.String r0 = com.chartboost.sdk.impl.j0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "MediaPlayer missing callback on IOException: "
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.chartboost.sdk.impl.f6.b(r0, r1)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.i0.l():void");
    }

    public final void m() {
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: qv3
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    i0.this.a(mediaPlayer2);
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: rv3
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                    return i0.a(i0.this, mediaPlayer2, i, i2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: sv3
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    i0.a(i0.this, mediaPlayer2);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: tv3
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return i0.b(i0.this, mediaPlayer2, i, i2);
                }
            });
        }
    }

    public final void n() {
        ch3 ch3Var = ch3.f636a;
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.start();
                this.r = true;
                k();
                l0 l0Var = this.c;
                if (l0Var != null) {
                    l0Var.a();
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    mediaPlayer.seekTo(this.h, 3);
                } else {
                    mediaPlayer.seekTo((int) this.h);
                }
            } catch (IllegalStateException e) {
                l0 l0Var2 = this.c;
                if (l0Var2 != null) {
                    l0Var2.a(e.toString());
                } else {
                    ch3Var = null;
                }
            }
            if (ch3Var != null) {
                return;
            }
        }
        l0 l0Var3 = this.c;
        if (l0Var3 != null) {
            l0Var3.a("Missing video player during startVideoPlayer");
        }
    }

    public final void o() {
        this.d.a(500L, new a(this));
    }

    @Override // com.chartboost.sdk.impl.k0
    public void pause() {
        String str;
        str = j0.f887a;
        f6.a(str, "pause()");
        if (this.i && this.j) {
            aa aaVar = this.p;
            if (aaVar != null) {
                aaVar.e();
            }
            j();
            try {
                MediaPlayer mediaPlayer = this.f867a;
                if (mediaPlayer != null) {
                    mediaPlayer.pause();
                }
            } catch (Exception e) {
                l0 l0Var = this.c;
                if (l0Var != null) {
                    l0Var.a(e.toString());
                }
            }
            this.h = b();
            this.j = false;
            this.k = true;
        }
    }

    @Override // com.chartboost.sdk.impl.k0
    public void play() {
        String str;
        str = j0.f887a;
        f6.a(str, "play()");
        if (this.i && !this.j) {
            o();
        }
        this.j = true;
        this.k = this.m;
        this.m = false;
    }

    @Override // com.chartboost.sdk.impl.k0
    public void stop() {
        String str;
        str = j0.f887a;
        f6.a(str, "stop()");
        if (this.i) {
            aa aaVar = this.p;
            if (aaVar != null) {
                aaVar.e();
            }
            this.p = null;
            this.h = 0L;
            j();
            try {
                MediaPlayer mediaPlayer = this.f867a;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                }
            } catch (Exception e) {
                l0 l0Var = this.c;
                if (l0Var != null) {
                    l0Var.a(e.toString());
                }
            }
            this.j = false;
            this.k = false;
            y7 y7Var = this.o;
            if (y7Var != null) {
                y7Var.a();
            }
            this.o = null;
            i();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        String str;
        if (this.k) {
            MediaPlayer mediaPlayer = this.f867a;
            if (mediaPlayer != null) {
                mediaPlayer.setDisplay(surfaceHolder);
            }
            play();
            return;
        }
        try {
            m();
            l();
            MediaPlayer mediaPlayer2 = this.f867a;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f867a;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setDisplay(surfaceHolder);
            }
        } catch (Exception e) {
            str = j0.f887a;
            p71.z("SurfaceCreated exception: ", e, str);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            mediaPlayer.setDisplay(null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:            if (r0 == null) goto L12;     */
    @Override // com.chartboost.sdk.impl.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.chartboost.sdk.impl.y9 r4) {
        /*
            r3 = this;
            java.lang.String r0 = com.chartboost.sdk.impl.j0.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "asset() - asset: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.chartboost.sdk.impl.f6.a(r0, r1)
            android.media.MediaPlayer r0 = r3.f867a
            if (r0 == 0) goto L3d
            o41 r0 = r3.e
            v90 r1 = r3.f
            com.chartboost.sdk.impl.r4 r2 = r3.g
            java.lang.Object r4 = r0.invoke(r4, r3, r1, r2)
            com.chartboost.sdk.impl.aa r4 = (com.chartboost.sdk.impl.aa) r4
            r3.p = r4
            r0 = 0
            if (r4 == 0) goto L2f
            com.chartboost.sdk.impl.y7 r4 = r4.d()
            goto L30
        L2f:
            r4 = r0
        L30:
            r3.o = r4
            android.view.SurfaceHolder r4 = r3.n
            if (r4 == 0) goto L3b
            r4.addCallback(r3)
            ch3 r0 = defpackage.ch3.f636a
        L3b:
            if (r0 != 0) goto L46
        L3d:
            com.chartboost.sdk.impl.l0 r4 = r3.c
            if (r4 == 0) goto L46
            java.lang.String r0 = "Missing media player during startMediaPlayer"
            r4.a(r0)
        L46:
            r4 = 0
            r3.r = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.i0.a(com.chartboost.sdk.impl.y9):void");
    }

    public final void b(int i, int i2) {
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer == null) {
            return;
        }
        SurfaceView surfaceView = this.f868b;
        int videoHeight = mediaPlayer.getVideoHeight();
        MediaPlayer mediaPlayer2 = this.f867a;
        qa.a(surfaceView, mediaPlayer2 != null ? mediaPlayer2.getVideoWidth() : 1, videoHeight, i, i2);
    }

    public static final boolean b(i0 i0Var, MediaPlayer mediaPlayer, int i, int i2) {
        i0Var.c(i, i2);
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public i0(android.media.MediaPlayer r11, android.view.SurfaceView r12, com.chartboost.sdk.impl.l0 r13, com.chartboost.sdk.impl.s9 r14, defpackage.n41 r15, defpackage.o41 r16, defpackage.v90 r17, com.chartboost.sdk.impl.r4 r18, int r19, defpackage.ng0 r20) {
        /*
            r10 = this;
            r0 = r19 & 1
            if (r0 == 0) goto Lb
            android.media.MediaPlayer r0 = new android.media.MediaPlayer
            r0.<init>()
            r2 = r0
            goto Lc
        Lb:
            r2 = r11
        Lc:
            r0 = r19 & 64
            if (r0 == 0) goto L16
            qi0 r0 = defpackage.vl0.f4854a
            yo1 r0 = defpackage.zo1.f5522a
            r8 = r0
            goto L18
        L16:
            r8 = r17
        L18:
            r1 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r9 = r18
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.i0.<init>(android.media.MediaPlayer, android.view.SurfaceView, com.chartboost.sdk.impl.l0, com.chartboost.sdk.impl.s9, n41, o41, v90, com.chartboost.sdk.impl.r4, int, ng0):void");
    }

    @Override // com.chartboost.sdk.impl.k0
    public void a() {
        MediaPlayer mediaPlayer = this.f867a;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.chartboost.sdk.impl.q8
    public void a(int i, int i2) {
        b(i2, i);
    }

    public final void a(MediaPlayer mediaPlayer) {
        this.l = false;
        int duration = mediaPlayer.getDuration();
        SurfaceView surfaceView = this.f868b;
        int width = surfaceView != null ? surfaceView.getWidth() : 0;
        SurfaceView surfaceView2 = this.f868b;
        b(width, surfaceView2 != null ? surfaceView2.getHeight() : 0);
        l0 l0Var = this.c;
        if (l0Var != null) {
            l0Var.b(duration);
        }
        this.i = true;
        aa aaVar = this.p;
        if (aaVar != null) {
            aaVar.a(duration);
        }
        if (this.j) {
            n();
        }
    }

    public static final boolean a(i0 i0Var, MediaPlayer mediaPlayer, int i, int i2) {
        if ((i != 805 && i != 804) || i2 != -1004) {
            return true;
        }
        i0Var.h();
        return true;
    }

    public static final void a(i0 i0Var, MediaPlayer mediaPlayer) {
        if (i0Var.h >= mediaPlayer.getDuration() - (mediaPlayer.getDuration() * 0.05d)) {
            l0 l0Var = i0Var.c;
            if (l0Var != null) {
                l0Var.b();
                return;
            }
            return;
        }
        i0Var.h();
    }

    @Override // com.chartboost.sdk.impl.k0
    public float c() {
        return this.s;
    }
}
