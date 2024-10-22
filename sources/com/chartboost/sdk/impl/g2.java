package com.chartboost.sdk.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.Window;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.m20;
import defpackage.v31;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public ra I;
    public float N;
    public float O;
    public float P;

    /* renamed from: a, reason: collision with root package name */
    public final Context f833a;

    /* renamed from: b, reason: collision with root package name */
    public final String f834b;
    public final h6 c;
    public final String d;
    public final s9 e;
    public final r4 f;
    public final z1 g;
    public final e2 h;
    public final Mediation i;
    public final String j;
    public final v6 k;
    public final c0 l;
    public final wa m;
    public String n;
    public long o;
    public long p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public int E = -1;
    public boolean F = true;
    public int G = -1;
    public m7 H = m7.PLAYING;
    public int J = 1;
    public int K = 1;
    public int L = 1;
    public int M = 1;
    public final l3 Q = new b();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f835a;

        static {
            int[] iArr = new int[w9.values().length];
            try {
                iArr[w9.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w9.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w9.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w9.BUFFER_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w9.BUFFER_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w9.QUARTILE1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w9.MIDPOINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[w9.QUARTILE3.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[w9.COMPLETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[w9.SKIP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[w9.VOLUME_CHANGE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f835a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {
        public c() {
            super(0);
        }

        public final void a() {
            if (!g2.this.A()) {
                f6.a("CBViewProtocol", "Webview seems to be taking more time loading the html content, so closing the view.");
                g2.this.a("show_timeout_error", "");
                g2.this.m.a();
            }
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    public g2(Context context, String str, h6 h6Var, String str2, s9 s9Var, r4 r4Var, z1 z1Var, e2 e2Var, Mediation mediation, String str3, v6 v6Var, c0 c0Var, wa waVar) {
        this.f833a = context;
        this.f834b = str;
        this.c = h6Var;
        this.d = str2;
        this.e = s9Var;
        this.f = r4Var;
        this.g = z1Var;
        this.h = e2Var;
        this.i = mediation;
        this.j = str3;
        this.k = v6Var;
        this.l = c0Var;
        this.m = waVar;
    }

    public final boolean A() {
        return this.q;
    }

    public final boolean B() {
        if (this.H == m7.PLAYING) {
            return true;
        }
        return false;
    }

    public final void C() {
        this.P = 0.0f;
    }

    public abstract void D();

    public final void E() {
        Context context;
        this.q = true;
        this.p = System.currentTimeMillis();
        f6.a("CBViewProtocol", "Total web view load response time " + ((this.p - this.o) / 1000));
        ra raVar = this.I;
        if (raVar != null && (context = raVar.getContext()) != null) {
            b(context);
            a(context);
            f();
        }
    }

    public void F() {
        i2 i2Var;
        e2 e2Var;
        ra raVar = this.I;
        if (raVar != null && (i2Var = raVar.f1114b) != null && (e2Var = this.h) != null) {
            e2Var.a(i2Var, this.f834b, this.d);
            i2Var.onPause();
        }
    }

    public void G() {
        e2 e2Var;
        ra raVar = this.I;
        if (raVar != null) {
            if (raVar.f1113a == null || CBUtility.a(raVar.getContext()) != raVar.f1113a) {
                raVar.a(false);
            }
            i2 i2Var = raVar.f1114b;
            if (i2Var != null && (e2Var = this.h) != null) {
                e2Var.b(i2Var, this.f834b, this.d);
                i2Var.onResume();
            }
        }
    }

    public final CBError.CBImpressionError H() {
        boolean z;
        File file = this.f.a().f1125a;
        if (file == null) {
            f6.b("CBViewProtocol", "External Storage path is unavailable or media not mounted");
            return CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW;
        }
        this.n = AdPayload.FILE_SCHEME + file.getAbsolutePath() + '/';
        String str = this.j;
        boolean z2 = false;
        if (str != null) {
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            f6.b("CBViewProtocol", "Empty template being passed in the response");
            return CBError.CBImpressionError.ERROR_DISPLAYING_VIEW;
        }
        return null;
    }

    public final void I() {
        this.e.a(15000L, new c());
    }

    public final void J() {
        Context context;
        ra raVar = this.I;
        Activity activity = null;
        if (raVar != null) {
            context = raVar.getContext();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null && !CBUtility.a(activity)) {
            int requestedOrientation = activity.getRequestedOrientation();
            int i = this.E;
            if (requestedOrientation != i) {
                activity.setRequestedOrientation(i);
            }
            this.F = true;
            this.G = -1;
        }
    }

    public final void K() {
        this.P = 1.0f;
    }

    public final String a(int i) {
        return i != -1 ? i != 0 ? i != 1 ? MRAIDPresenter.ERROR : "portrait" : "landscape" : DevicePublicKeyStringDef.NONE;
    }

    public abstract ra c(Context context);

    public final void c(long j) {
        this.o = j;
    }

    public final void d(int i) {
        this.K = i;
    }

    public final void e(int i) {
        this.J = i;
    }

    public final void f() {
        ra raVar = this.I;
        if (raVar != null && this.q) {
            int[] iArr = new int[2];
            raVar.getLocationInWindow(iArr);
            int i = iArr[0];
            int i2 = iArr[1] - this.v;
            int width = raVar.getWidth();
            int height = raVar.getHeight();
            this.w = i;
            this.x = i2;
            int i3 = width + i;
            this.y = i3;
            int i4 = height + i2;
            this.z = i4;
            this.A = i;
            this.B = i2;
            this.C = i3;
            this.D = i4;
            f6.a("CBViewProtocol", "CalculatePosition: defaultXPos: " + this.w + " , currentXPos: " + this.A);
            return;
        }
        this.A = this.w;
        this.B = this.x;
        this.C = this.y;
        this.D = this.z;
    }

    public void g() {
        this.k.f();
        ra raVar = this.I;
        if (raVar != null) {
            raVar.a();
            raVar.removeAllViews();
        }
        this.I = null;
    }

    public final String h() {
        return this.d;
    }

    public final Context i() {
        return this.f833a;
    }

    public final String j() {
        f();
        return a(this.A, this.B, this.C, this.D);
    }

    public final l3 k() {
        return this.Q;
    }

    public final String l() {
        f();
        return a(this.w, this.x, this.y, this.z);
    }

    public final int m() {
        return this.L;
    }

    public final int n() {
        return this.M;
    }

    public final String o() {
        return this.f834b;
    }

    public final String p() {
        return t1.a(t1.a("width", Integer.valueOf(this.t)), t1.a("height", Integer.valueOf(this.u))).toString();
    }

    public final int q() {
        return this.K;
    }

    public final int r() {
        return this.J;
    }

    public final v6 s() {
        return this.k;
    }

    public final String t() {
        return t1.a(t1.a("allowOrientationChange", Boolean.valueOf(this.F)), t1.a("forceOrientation", a(this.G))).toString();
    }

    public final String u() {
        return t1.a(t1.a("width", Integer.valueOf(this.r)), t1.a("height", Integer.valueOf(this.s))).toString();
    }

    public final e2 v() {
        return this.h;
    }

    public final s9 w() {
        return this.e;
    }

    public final float x() {
        return this.N;
    }

    public final float y() {
        return this.O;
    }

    public final ra z() {
        return this.I;
    }

    public final void b(int i) {
        this.L = i;
    }

    public final void c(int i) {
        this.M = i;
    }

    public final void d(String str) {
        z1 z1Var;
        if (!(str == null || str.length() == 0) && (z1Var = this.g) != null) {
            z1Var.a(new v1("GET", str, o7.NORMAL, null));
            f6.a("CBViewProtocol", "###### Sending VAST Tracking Event: " + str);
            return;
        }
        f6.a("CBViewProtocol", "###### Sending VAST Tracking Event Failed: " + str);
    }

    public final void e() {
        int i;
        ra raVar = this.I;
        Context context = raVar != null ? raVar.getContext() : null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || CBUtility.a(activity)) {
            return;
        }
        int i2 = this.G;
        if (i2 != 0) {
            i = 1;
            if (i2 != 1) {
                i = this.F ? -1 : activity.getResources().getConfiguration().orientation;
            }
        } else {
            i = 0;
        }
        activity.setRequestedOrientation(i);
    }

    public final void b(float f) {
        this.O = f;
    }

    public final int c(String str) {
        if (m20.L(str, "portrait")) {
            return 1;
        }
        return m20.L(str, "landscape") ? 0 : -1;
    }

    /* loaded from: classes.dex */
    public static final class b implements l3 {
        public b() {
        }

        @Override // com.chartboost.sdk.impl.l3
        public void a() {
            g2.this.c(System.currentTimeMillis());
            g2 g2Var = g2.this;
            g2Var.E = g2Var.i() instanceof Activity ? ((Activity) g2.this.i()).getRequestedOrientation() : -1;
        }

        @Override // com.chartboost.sdk.impl.l3
        public void b() {
            i2 i2Var;
            ra z = g2.this.z();
            if (z != null) {
                i2Var = z.f1114b;
            } else {
                i2Var = null;
            }
            if (g2.this.c != h6.VIDEO && i2Var != null) {
                g2.this.s().a(g2.this.c, i2Var, Collections.emptyList());
            }
        }

        @Override // com.chartboost.sdk.impl.l3
        public void c() {
            g2.this.E();
        }

        @Override // com.chartboost.sdk.impl.l3
        public void d() {
            g2.this.I();
        }

        @Override // com.chartboost.sdk.impl.l3
        public void a(String str) {
            g2.this.b(str);
        }
    }

    public final CBError.CBImpressionError b(String str) {
        a("show_webview_error", str);
        f6.b("CBViewProtocol", str);
        this.q = true;
        return CBError.CBImpressionError.WEB_VIEW_CLIENT_RECEIVED_ERROR;
    }

    public final void a(float f) {
        this.N = f;
    }

    public final CBError.CBImpressionError a(ViewGroup viewGroup) {
        if (this.I == null) {
            if ((viewGroup != null ? viewGroup.getContext() : null) != null) {
                this.I = c(viewGroup.getContext());
            } else {
                return CBError.CBImpressionError.ERROR_CREATING_VIEW;
            }
        }
        return null;
    }

    public final void b(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.r = displayMetrics.widthPixels;
        this.s = displayMetrics.heightPixels;
    }

    public final CBError.CBImpressionError a(CBImpressionActivity cBImpressionActivity) {
        if (this.I == null) {
            this.I = c(cBImpressionActivity);
        }
        this.l.a(this.f833a);
        return null;
    }

    public final void a(String str, String str2) {
        y3.d(new j3(str, str2, this.d, this.f834b, this.i));
    }

    public final void a(Context context) {
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.v = a(window);
            if (this.r == 0 || this.s == 0) {
                b(context);
            }
            int width = rect.width();
            int i = this.s - this.v;
            if (width == this.t && i == this.u) {
                return;
            }
            this.t = width;
            this.u = i;
        }
    }

    public final int a(Window window) {
        return window.findViewById(R.id.content).getTop();
    }

    public final void a(boolean z, String str) {
        this.F = z;
        this.G = c(str);
        e();
    }

    public final String a(int i, int i2, int i3, int i4) {
        return t1.a(t1.a("x", Integer.valueOf(i)), t1.a("y", Integer.valueOf(i2)), t1.a("width", Integer.valueOf(i3)), t1.a("height", Integer.valueOf(i4))).toString();
    }

    public final void a(float f, float f2) {
        float f3 = 4;
        float f4 = f / f3;
        float f5 = f / 2;
        float f6 = (f * 3) / f3;
        if (f2 >= f4 && f2 < f5) {
            a(w9.QUARTILE1);
            return;
        }
        if (f2 >= f5 && f2 < f6) {
            a(w9.MIDPOINT);
        } else if (f2 >= f6) {
            a(w9.QUARTILE3);
        }
    }

    public final void a(w9 w9Var) {
        f6.a("CBViewProtocol", "sendWebViewVastOmEvent: " + w9Var.name());
        if (this.c != h6.VIDEO) {
            return;
        }
        v6 v6Var = this.k;
        switch (a.f835a[w9Var.ordinal()]) {
            case 1:
                v6Var.a(this.N, this.P);
                return;
            case 2:
                if (this.H == m7.PAUSED) {
                    v6Var.e();
                    return;
                }
                return;
            case 3:
                v6Var.a();
                return;
            case 4:
                v6Var.a(true);
                return;
            case 5:
                v6Var.a(false);
                return;
            case 6:
                v6Var.a(x7.FIRST);
                return;
            case 7:
                v6Var.a(x7.MIDDLE);
                return;
            case 8:
                v6Var.a(x7.THIRD);
                return;
            case 9:
                v6Var.d();
                return;
            case 10:
                v6Var.c();
                return;
            case 11:
                v6Var.a(this.P);
                return;
            default:
                return;
        }
    }

    public final void a(m7 m7Var) {
        this.H = m7Var;
    }

    public final void a(List<x9> list) {
        i2 i2Var;
        ra raVar = this.I;
        if (raVar == null || (i2Var = raVar.f1114b) == null) {
            return;
        }
        this.k.a(this.c, i2Var, list);
    }
}
