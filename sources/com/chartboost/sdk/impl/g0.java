package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.chartboost.sdk.impl.ga;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.a93;
import defpackage.bb3;
import defpackage.bu0;
import defpackage.dt1;
import defpackage.gb3;
import defpackage.gt1;
import defpackage.ic0;
import defpackage.ji1;
import defpackage.jo;
import defpackage.k43;
import defpackage.lk3;
import defpackage.n41;
import defpackage.ng0;
import defpackage.o52;
import defpackage.ot0;
import defpackage.p52;
import defpackage.q52;
import defpackage.qh;
import defpackage.rt1;
import defpackage.t52;
import defpackage.tk0;
import defpackage.u52;
import defpackage.ui1;
import defpackage.v31;
import defpackage.v52;
import defpackage.w52;
import defpackage.wi3;
import defpackage.x52;
import defpackage.y83;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g0 implements k0, SurfaceHolder.Callback, v52, ga.b, f1 {

    /* renamed from: a, reason: collision with root package name */
    public final k4 f827a;

    /* renamed from: b, reason: collision with root package name */
    public final SurfaceView f828b;
    public final l0 c;
    public final ui1 d;
    public final ui1 e;
    public boolean f;
    public boolean g;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h4 f829a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f830b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(h4 h4Var, g0 g0Var) {
            super(0);
            this.f829a = h4Var;
            this.f830b = g0Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ot0 invoke() {
            ot0 a2 = this.f829a.a();
            g0 g0Var = this.f830b;
            bu0 bu0Var = (bu0) a2;
            bu0Var.getClass();
            g0Var.getClass();
            bu0Var.k.a(g0Var);
            return bu0Var;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ n41 f831a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0 f832b;
        public final /* synthetic */ s9 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n41 n41Var, g0 g0Var, s9 s9Var) {
            super(0);
            this.f831a = n41Var;
            this.f832b = g0Var;
            this.c = s9Var;
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ga invoke() {
            return (ga) this.f831a.invoke(this.f832b.c, this.f832b, this.c);
        }
    }

    public g0(Context context, h4 h4Var, k4 k4Var, SurfaceView surfaceView, l0 l0Var, s9 s9Var, n41 n41Var) {
        this.f827a = k4Var;
        this.f828b = surfaceView;
        this.c = l0Var;
        this.d = new k43(new a(h4Var, this));
        this.e = new k43(new b(n41Var, this, s9Var));
    }

    @Override // com.chartboost.sdk.impl.q8
    public void a(int i, int i2) {
    }

    @Override // com.chartboost.sdk.impl.ga.b
    public long b() {
        return ((bu0) g()).i();
    }

    @Override // com.chartboost.sdk.impl.k0
    public float c() {
        bu0 bu0Var = (bu0) g();
        bu0Var.C();
        return bu0Var.U;
    }

    @Override // com.chartboost.sdk.impl.k0
    public void d() {
        ((bu0) g()).x(0.0f);
    }

    @Override // com.chartboost.sdk.impl.f1
    public void e() {
        this.g = true;
    }

    @Override // com.chartboost.sdk.impl.k0
    public boolean f() {
        return this.f;
    }

    public final ot0 g() {
        return (ot0) this.d.getValue();
    }

    public final ga h() {
        return (ga) this.e.getValue();
    }

    public final void i() {
        stop();
        l();
        l0 l0Var = this.c;
        if (l0Var != null) {
            l0Var.b();
        }
    }

    public final void j() {
        long K;
        a(this, 0, 0, 3, null);
        l0 l0Var = this.c;
        if (l0Var != null) {
            l0Var.d();
        }
        l0 l0Var2 = this.c;
        if (l0Var2 != null) {
            bu0 bu0Var = (bu0) g();
            bu0Var.C();
            if (bu0Var.q()) {
                p52 p52Var = bu0Var.a0;
                rt1 rt1Var = p52Var.f3786b;
                Object obj = rt1Var.f3536a;
                a93 a93Var = p52Var.f3785a;
                y83 y83Var = bu0Var.m;
                a93Var.h(obj, y83Var);
                K = wi3.K(y83Var.a(rt1Var.f3537b, rt1Var.c));
            } else {
                a93 k = bu0Var.k();
                if (k.q()) {
                    K = -9223372036854775807L;
                } else {
                    K = wi3.K(k.n(bu0Var.g(), bu0Var.f2797a).n);
                }
            }
            l0Var2.b(K);
        }
    }

    public final void k() {
        ga.a.a(h(), 0L, 1, null);
    }

    public final void l() {
        h().a();
    }

    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(qh qhVar) {
    }

    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(t52 t52Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onCues(ic0 ic0Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(tk0 tk0Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i, boolean z) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onEvents(x52 x52Var, u52 u52Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z) {
    }

    @Override // defpackage.v52
    public void onIsPlayingChanged(boolean z) {
        String str;
        str = h0.f848a;
        f6.a(str, "onIsPlayingChanged() - isPlaying: " + z);
        if (z) {
            this.f = true;
            l0 l0Var = this.c;
            if (l0Var != null) {
                l0Var.a();
            }
            k();
            return;
        }
        l();
    }

    @Override // defpackage.v52
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onMediaItemTransition(dt1 dt1Var, int i) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(gt1 gt1Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z, int i) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(q52 q52Var) {
    }

    @Override // defpackage.v52
    public void onPlaybackStateChanged(int i) {
        String str;
        String b2;
        str = h0.f848a;
        StringBuilder sb = new StringBuilder("onPlaybackStateChanged() - playbackState: ");
        b2 = h0.b(i);
        sb.append(b2);
        f6.a(str, sb.toString());
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    i();
                    return;
                }
                return;
            }
            j();
            return;
        }
        l0 l0Var = this.c;
        if (l0Var != null) {
            l0Var.c();
        }
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i) {
    }

    @Override // defpackage.v52
    public void onPlayerError(o52 o52Var) {
        String str;
        str = h0.f848a;
        f6.a(str, "ExoPlayer error", o52Var);
        stop();
        l0 l0Var = this.c;
        if (l0Var != null) {
            String message = o52Var.getMessage();
            if (message == null) {
                message = "No error message from ExoPlayer";
            }
            l0Var.a(message);
        }
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(o52 o52Var) {
    }

    @Override // defpackage.v52
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(gt1 gt1Var) {
    }

    @Override // defpackage.v52
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Override // defpackage.v52
    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i, int i2) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onTimelineChanged(a93 a93Var, int i) {
    }

    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(bb3 bb3Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onTracksChanged(gb3 gb3Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(lk3 lk3Var) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // com.chartboost.sdk.impl.k0
    public void pause() {
        String str;
        str = h0.f848a;
        f6.a(str, "pause()");
        jo joVar = (jo) g();
        joVar.getClass();
        bu0 bu0Var = (bu0) joVar;
        bu0Var.C();
        bu0Var.C();
        bu0Var.z(bu0Var.x.e(bu0Var.a0.e, false), 1, false);
    }

    @Override // com.chartboost.sdk.impl.k0
    public void play() {
        String str;
        SurfaceHolder holder;
        int i;
        str = h0.f848a;
        f6.a(str, "play()");
        ot0 g = g();
        SurfaceView surfaceView = this.f828b;
        bu0 bu0Var = (bu0) g;
        bu0Var.C();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        bu0Var.C();
        if (holder == null) {
            bu0Var.C();
            bu0Var.u();
            bu0Var.w(null);
            bu0Var.t(0, 0);
        } else {
            bu0Var.u();
            bu0Var.P = true;
            bu0Var.O = holder;
            holder.addCallback(bu0Var.u);
            Surface surface = holder.getSurface();
            if (surface != null && surface.isValid()) {
                bu0Var.w(surface);
                Rect surfaceFrame = holder.getSurfaceFrame();
                bu0Var.t(surfaceFrame.width(), surfaceFrame.height());
            } else {
                bu0Var.w(null);
                bu0Var.t(0, 0);
            }
        }
        jo joVar = (jo) g();
        joVar.getClass();
        bu0 bu0Var2 = (bu0) joVar;
        bu0Var2.C();
        bu0Var2.C();
        int e = bu0Var2.x.e(bu0Var2.a0.e, true);
        if (e != 1) {
            i = 2;
        } else {
            i = 1;
        }
        bu0Var2.z(e, i, true);
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0089 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.chartboost.sdk.impl.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void stop() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.g0.stop():void");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        String str;
        str = h0.f848a;
        f6.a(str, "surfaceCreated()");
        if (this.g) {
            play();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        String str;
        str = h0.f848a;
        f6.a(str, "surfaceDestroyed()");
    }

    public final dt1 b(y9 y9Var) {
        String unused;
        dt1 a2 = this.f827a.a(y9Var);
        unused = h0.f848a;
        Objects.toString(a2);
        return a2;
    }

    @Override // defpackage.v52
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // defpackage.v52
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(w52 w52Var, w52 w52Var2, int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x014e, code lost:            if (r5 == null) goto L28;     */
    @Override // com.chartboost.sdk.impl.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(com.chartboost.sdk.impl.y9 r23) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.g0.a(com.chartboost.sdk.impl.y9):void");
    }

    public final void b(int i, int i2) {
        qa.a(this.f828b, m4.b(g()), m4.a(g()), i, i2);
    }

    public /* synthetic */ g0(Context context, h4 h4Var, k4 k4Var, SurfaceView surfaceView, l0 l0Var, s9 s9Var, n41 n41Var, int i, ng0 ng0Var) {
        this(context, (i & 2) != 0 ? new h4(context, null, null, null, 14, null) : h4Var, k4Var, surfaceView, (i & 16) != 0 ? null : l0Var, s9Var, n41Var);
    }

    @Override // com.chartboost.sdk.impl.k0
    public void a() {
        ((bu0) g()).x(1.0f);
    }

    public static /* synthetic */ void a(g0 g0Var, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = g0Var.f828b.getWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = g0Var.f828b.getHeight();
        }
        g0Var.b(i, i2);
    }
}
