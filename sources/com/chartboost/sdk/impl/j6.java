package com.chartboost.sdk.impl;

import android.content.ActivityNotFoundException;
import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;
import defpackage.ch3;
import defpackage.i23;
import defpackage.ji1;
import defpackage.p71;
import defpackage.v31;
import defpackage.x31;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j6 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f893a;

    /* renamed from: b, reason: collision with root package name */
    public final f9 f894b;
    public final s9 c;
    public x4 d;
    public float e;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f895a;

        static {
            int[] iArr = new int[k6.values().length];
            try {
                iArr[k6.GET_PARAMETERS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k6.GET_MAX_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k6.GET_SCREEN_SIZE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[k6.GET_CURRENT_POSITION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[k6.GET_DEFAULT_POSITION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[k6.GET_ORIENTATION_PROPERTIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[k6.CLICK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[k6.CLOSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[k6.SKIPPED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[k6.VIDEO_COMPLETED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[k6.VIDEO_RESUMED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[k6.VIDEO_PAUSED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[k6.VIDEO_REPLAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[k6.CURRENT_VIDEO_DURATION.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[k6.TOTAL_VIDEO_DURATION.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[k6.SHOW.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[k6.ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[k6.WARNING.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[k6.DEBUG.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[k6.TRACKING.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[k6.OPEN_URL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[k6.SET_ORIENTATION_PROPERTIES.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[k6.REWARD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[k6.REWARDED_VIDEO_COMPLETED.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[k6.PLAY_VIDEO.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[k6.PAUSE_VIDEO.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[k6.CLOSE_VIDEO.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[k6.MUTE_VIDEO.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[k6.UNMUTE_VIDEO.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[k6.OM_MEASUREMENT_RESOURCES.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[k6.START.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[k6.BUFFER_START.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[k6.BUFFER_END.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[k6.VIDEO_FINISHED.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[k6.VIDEO_STARTED.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[k6.ON_FOREGROUND.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[k6.VIDEO_ENDED.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[k6.VIDEO_FAILED.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[k6.PLAYBACK_TIME.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[k6.ON_BACKGROUND.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            f895a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class a0 extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a0 f896a = new a0();

        public a0() {
            super(0);
        }

        public final void a() {
            f6.b("NativeBridgeCommand", "Video replay command is run");
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements v31 {
        public b() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.t();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b0 extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f899b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(JSONObject jSONObject) {
            super(0);
            this.f899b = jSONObject;
        }

        public final void a() {
            j6.this.a(this.f899b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f901b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(JSONObject jSONObject) {
            super(0);
            this.f901b = jSONObject;
        }

        public final void a() {
            j6.this.c(this.f901b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c0 extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f903b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(JSONObject jSONObject) {
            super(0);
            this.f903b = jSONObject;
        }

        public final void a() {
            j6.this.i(this.f903b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject jSONObject) {
            super(0);
            this.f905b = jSONObject;
        }

        public final void a() {
            j6.this.k(this.f905b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class d0 extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public static final d0 f906a = new d0();

        public d0() {
            super(1);
        }

        @Override // defpackage.x31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x9 invoke(JSONObject jSONObject) {
            return x9.a(jSONObject.getString("vendorKey"), new URL(jSONObject.getString(ImagesContract.URL)), jSONObject.getString("params"));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(JSONObject jSONObject) {
            super(0);
            this.f908b = jSONObject;
        }

        public final void a() {
            j6.this.b(this.f908b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f910b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(JSONObject jSONObject) {
            super(0);
            this.f910b = jSONObject;
        }

        public final void a() {
            j6.this.j(this.f910b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(JSONObject jSONObject) {
            super(0);
            this.f912b = jSONObject;
        }

        public final void a() {
            j6.this.d(this.f912b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f914b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(JSONObject jSONObject) {
            super(0);
            this.f914b = jSONObject;
        }

        public final void a() {
            j6.this.g(this.f914b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends ji1 implements v31 {
        public i() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.z();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends ji1 implements v31 {
        public j() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.p();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends ji1 implements v31 {
        public k() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.u();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f919b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(JSONObject jSONObject) {
            super(0);
            this.f919b = jSONObject;
        }

        public final void a() {
            Boolean bool;
            f9 f9Var = j6.this.f894b;
            Context context = j6.this.f893a;
            JSONObject jSONObject = this.f919b;
            if (jSONObject != null) {
                bool = j6.this.h(jSONObject);
            } else {
                bool = null;
            }
            f9Var.a(context, bool);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends ji1 implements v31 {
        public m() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.i();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends ji1 implements v31 {
        public n() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.y();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends ji1 implements v31 {
        public o() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.C();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends ji1 implements v31 {
        public p() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.m();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f925b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(JSONObject jSONObject) {
            super(0);
            this.f925b = jSONObject;
        }

        public final void a() {
            j6.this.e(this.f925b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class r extends ji1 implements v31 {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ JSONObject f927b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(JSONObject jSONObject) {
            super(0);
            this.f927b = jSONObject;
        }

        public final void a() {
            j6.this.f(this.f927b);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class s extends ji1 implements v31 {
        public s() {
            super(0);
        }

        public final void a() {
            j6.this.b();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class t extends ji1 implements v31 {
        public t() {
            super(0);
        }

        public final void a() {
            j6.this.a();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class u extends ji1 implements v31 {
        public u() {
            super(0);
        }

        public final void a() {
            j6.this.c();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class v extends ji1 implements v31 {
        public v() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.s();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class w extends ji1 implements v31 {
        public w() {
            super(0);
        }

        public final void a() {
            j6.this.f894b.a(w9.SKIP);
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class x extends ji1 implements v31 {
        public x() {
            super(0);
        }

        public final void a() {
            j6.this.f();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class y extends ji1 implements v31 {
        public y() {
            super(0);
        }

        public final void a() {
            j6.this.e();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class z extends ji1 implements v31 {
        public z() {
            super(0);
        }

        public final void a() {
            j6.this.d();
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return ch3.f636a;
        }
    }

    public j6(Context context, f9 f9Var, s9 s9Var) {
        this.f893a = context;
        this.f894b = f9Var;
        this.c = s9Var;
    }

    public final void i(JSONObject jSONObject) {
        float optDouble;
        if (jSONObject != null) {
            try {
                optDouble = (float) jSONObject.optDouble("duration", 0.0d);
            } catch (Exception e2) {
                k(new JSONObject().put("message", "Parsing exception unknown field for total player duration: " + e2));
                return;
            }
        } else {
            optDouble = 0.0f;
        }
        StringBuilder sb = new StringBuilder("######### JS->Native Video total player duration");
        float f2 = optDouble * 1000;
        sb.append(f2);
        f6.a("NativeBridgeCommand", sb.toString());
        this.e = f2;
        this.f894b.b(f2);
    }

    public final void j(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                String string = jSONObject.getString("event");
                if (string != null) {
                    this.f894b.e(string);
                }
            } catch (Exception e2) {
                p71.z("Exception occured while parsing the message for webview tracking VAST: ", e2, "NativeBridgeCommand");
                return;
            }
        }
        f6.b("NativeBridgeCommand", "Tracking command received but event is missing!");
    }

    public final void k(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("message");
            } catch (Exception unused) {
                this.f894b.d("Warning message is empty");
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "Missing message argument";
        }
        this.f894b.d(string);
    }

    public final void a(x4 x4Var) {
        this.d = x4Var;
    }

    public final void b(JSONObject jSONObject) {
        try {
            f6.a("NativeBridgeCommand", "Debug message: " + b(jSONObject, "JS->Native Debug message: "));
        } catch (Exception e2) {
            p71.z("Exception occurred while parsing the message for webview debug track event: ", e2, "NativeBridgeCommand");
        }
    }

    public final void c(JSONObject jSONObject) {
        try {
            this.f894b.g();
            this.f894b.c(b(jSONObject, "JS->Native Error message: "));
        } catch (Exception unused) {
            f6.b("NativeBridgeCommand", "Error message is empty");
            this.f894b.c("");
        }
    }

    public final void d() {
        this.f894b.a(m7.PAUSED);
        this.f894b.a(w9.PAUSE);
    }

    public final void e() {
        this.f894b.a(w9.RESUME);
        this.f894b.a(m7.PLAYING);
    }

    public final void f() {
        x4 x4Var = this.d;
        if (x4Var != null) {
            x4Var.onHideCustomView();
        }
        this.f894b.a(m7.IDLE);
        this.f894b.j();
    }

    public final void g(JSONObject jSONObject) {
        boolean z2 = true;
        if (jSONObject != null) {
            try {
                z2 = jSONObject.optBoolean("allowOrientationChange", true);
            } catch (Exception unused) {
                f6.b("NativeBridgeCommand", "Invalid set orientation command");
                return;
            }
        }
        String str = DevicePublicKeyStringDef.NONE;
        String optString = jSONObject != null ? jSONObject.optString("forceOrientation", DevicePublicKeyStringDef.NONE) : null;
        if (optString != null) {
            str = optString;
        }
        this.f894b.a(z2, str);
    }

    public final Boolean h(JSONObject jSONObject) {
        return u1.a(jSONObject, "shouldDismiss");
    }

    public final String a(JSONObject jSONObject, String str) {
        k6 a2 = k6.f950b.a(str);
        if (a2 == null) {
            return "Function name not recognized.";
        }
        f6.a("NativeBridgeCommand", "TEMPLATE EVENT: " + a2.c());
        return a(jSONObject, a2);
    }

    public final void d(JSONObject jSONObject) {
        String string;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString(ImagesContract.URL);
            } catch (ActivityNotFoundException e2) {
                f6.b("NativeBridgeCommand", "ActivityNotFoundException occured when opening a url in a browser: " + e2);
                return;
            } catch (Exception e3) {
                p71.z("Exception while opening a browser view with MRAID url: ", e3, "NativeBridgeCommand");
                return;
            }
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (!i23.q1(string, "http://", false) && !i23.q1(string, "https://", false)) {
            string = "https://".concat(string);
        }
        this.f894b.a(this.f893a, string, jSONObject != null ? h(jSONObject) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x003f A[Catch: Exception -> 0x003a, TRY_LEAVE, TryCatch #0 {Exception -> 0x003a, blocks: (B:15:0x0004, B:17:0x000c, B:21:0x0017, B:22:0x0032, B:5:0x003f, B:23:0x001a), top: B:14:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(org.json.JSONObject r4) {
        /*
            r3 = this;
            java.lang.String r0 = "NativeBridgeCommand"
            if (r4 == 0) goto L3c
            java.lang.String r1 = "resources"
            java.lang.String r4 = r4.getString(r1)     // Catch: java.lang.Exception -> L3a
            if (r4 == 0) goto L3c
            int r1 = r4.length()     // Catch: java.lang.Exception -> L3a
            if (r1 != 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            if (r1 == 0) goto L1a
            cr0 r4 = defpackage.cr0.f1659a     // Catch: java.lang.Exception -> L3a
            goto L32
        L1a:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L3a
            r1.<init>(r4)     // Catch: java.lang.Exception -> L3a
            java.util.Iterator r4 = com.chartboost.sdk.impl.n4.iterator(r1)     // Catch: java.lang.Exception -> L3a
            fp2 r4 = defpackage.jp2.q0(r4)     // Catch: java.lang.Exception -> L3a
            com.chartboost.sdk.impl.j6$d0 r1 = com.chartboost.sdk.impl.j6.d0.f906a     // Catch: java.lang.Exception -> L3a
            lb3 r2 = new lb3     // Catch: java.lang.Exception -> L3a
            r2.<init>(r4, r1)     // Catch: java.lang.Exception -> L3a
            java.util.List r4 = defpackage.ip2.r0(r2)     // Catch: java.lang.Exception -> L3a
        L32:
            com.chartboost.sdk.impl.f9 r1 = r3.f894b     // Catch: java.lang.Exception -> L3a
            r1.a(r4)     // Catch: java.lang.Exception -> L3a
            ch3 r4 = defpackage.ch3.f636a     // Catch: java.lang.Exception -> L3a
            goto L3d
        L3a:
            r4 = move-exception
            goto L45
        L3c:
            r4 = 0
        L3d:
            if (r4 != 0) goto L4a
            java.lang.String r4 = "Invalid om resources command: missing json"
            com.chartboost.sdk.impl.f6.b(r0, r4)     // Catch: java.lang.Exception -> L3a
            goto L4a
        L45:
            java.lang.String r1 = "Invalid om resources command: "
            defpackage.p71.z(r1, r4, r0)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.j6.e(org.json.JSONObject):void");
    }

    public final void f(JSONObject jSONObject) {
        double d2 = 0.0d;
        if (jSONObject != null) {
            try {
                d2 = jSONObject.optDouble("duration", 0.0d);
            } catch (Exception e2) {
                p71.z("Invalid start command: ", e2, "NativeBridgeCommand");
                return;
            }
        }
        this.e = (float) d2;
        this.f894b.a(w9.START);
    }

    public final String a(JSONObject jSONObject, k6 k6Var) {
        switch (a.f895a[k6Var.ordinal()]) {
            case 1:
                k6Var.c();
                return this.f894b.h();
            case 2:
                k6Var.c();
                return this.f894b.f();
            case 3:
                k6Var.c();
                return this.f894b.A();
            case 4:
                k6Var.c();
                return this.f894b.r();
            case 5:
                k6Var.c();
                return this.f894b.v();
            case 6:
                k6Var.c();
                return this.f894b.B();
            case 7:
                this.c.a(new l(jSONObject));
                return "Native function successfully called.";
            case 8:
                this.c.a(new v());
                return "Native function successfully called.";
            case 9:
                this.c.a(new w());
                return "Native function successfully called.";
            case 10:
                this.c.a(new x());
                return "Native function successfully called.";
            case 11:
                this.c.a(new y());
                return "Native function successfully called.";
            case 12:
                this.c.a(new z());
                return "Native function successfully called.";
            case 13:
                this.c.a(a0.f896a);
                return "Native function successfully called.";
            case 14:
                this.c.a(new b0(jSONObject));
                return "Native function successfully called.";
            case 15:
                this.c.a(new c0(jSONObject));
                return "Native function successfully called.";
            case 16:
                this.c.a(new b());
                return "Native function successfully called.";
            case 17:
                this.c.a(new c(jSONObject));
                return "Native function successfully called.";
            case 18:
                this.c.a(new d(jSONObject));
                return "Native function successfully called.";
            case 19:
                this.c.a(new e(jSONObject));
                return "Native function successfully called.";
            case 20:
                this.c.a(new f(jSONObject));
                return "Native function successfully called.";
            case 21:
                this.c.a(new g(jSONObject));
                return "Native function successfully called.";
            case 22:
                this.c.a(new h(jSONObject));
                return "Native function successfully called.";
            case 23:
                this.c.a(new i());
                return "Native function successfully called.";
            case 24:
                this.c.a(new j());
                return "Native function successfully called.";
            case 25:
                this.c.a(new k());
                return "Native function successfully called.";
            case 26:
                this.c.a(new m());
                return "Native function successfully called.";
            case 27:
                this.c.a(new n());
                return "Native function successfully called.";
            case 28:
                this.c.a(new o());
                return "Native function successfully called.";
            case 29:
                this.c.a(new p());
                return "Native function successfully called.";
            case 30:
                this.c.a(new q(jSONObject));
                return "Native function successfully called.";
            case 31:
                this.c.a(new r(jSONObject));
                return "Native function successfully called.";
            case 32:
                this.c.a(new s());
                return "Native function successfully called.";
            case 33:
                this.c.a(new t());
                return "Native function successfully called.";
            case 34:
                this.c.a(new u());
                return "Native function successfully called.";
            default:
                return "Native function successfully called.";
        }
    }

    public final void c() {
        try {
            this.f894b.a(w9.COMPLETED);
        } catch (Exception e2) {
            p71.z("Invalid buffer end command: ", e2, "NativeBridgeCommand");
        }
    }

    public final void b() {
        try {
            this.f894b.a(w9.BUFFER_START);
        } catch (Exception e2) {
            p71.z("Invalid bufer start command: ", e2, "NativeBridgeCommand");
        }
    }

    public final String b(JSONObject jSONObject, String str) {
        String string = jSONObject != null ? jSONObject.getString("message") : null;
        return string == null ? "" : string;
    }

    public final void a(JSONObject jSONObject) {
        float f2;
        if (jSONObject != null) {
            try {
                f2 = (float) jSONObject.getDouble("duration");
            } catch (Exception e2) {
                k(new JSONObject().put("message", "Parsing exception unknown field for current player duration: " + e2));
                return;
            }
        } else {
            f2 = 0.0f;
        }
        if (f2 > 0.0f) {
            float f3 = f2 * 1000;
            f6.a("NativeBridgeCommand", "######### JS->Native Video current player duration: " + f3);
            this.f894b.a(f3);
            this.f894b.a(this.e, f3);
        }
    }

    public final void a() {
        try {
            this.f894b.a(w9.BUFFER_END);
        } catch (Exception e2) {
            p71.z("Invalid buffer end command: ", e2, "NativeBridgeCommand");
        }
    }
}
