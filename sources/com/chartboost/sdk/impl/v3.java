package com.chartboost.sdk.impl;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.Locale;

/* loaded from: classes.dex */
public class v3 {
    public int A;
    public long B;
    public long C;
    public int D;
    public int E;
    public int F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public String f1230a;

    /* renamed from: b, reason: collision with root package name */
    public int f1231b;
    public String c;
    public String d;
    public boolean e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public int w;
    public boolean x;
    public int y;
    public boolean z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f1232a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1233b;
    }

    public static String D() {
        if ("Amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            return "Amazon";
        }
        return "Android";
    }

    public static String K() {
        LocaleList localeList;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            localeList = LocaleList.getDefault();
            locale = localeList.get(0);
            return locale.getLanguage();
        }
        return Locale.getDefault().getLanguage();
    }

    public String A() {
        return this.p;
    }

    public String B() {
        return this.r;
    }

    public String C() {
        return this.q;
    }

    public int E() {
        return this.f1231b;
    }

    public long F() {
        return this.G;
    }

    public String G() {
        return this.f1230a;
    }

    public int H() {
        return this.F;
    }

    public int I() {
        return this.D;
    }

    public int J() {
        return this.E;
    }

    public String a() {
        return this.c;
    }

    public void b(String str) {
        this.g = str;
    }

    public boolean c() {
        return this.e;
    }

    public void d(int i) {
        this.f1231b = i;
    }

    public String e() {
        return this.h;
    }

    public void f(String str) {
        this.d = str;
    }

    public String g() {
        return this.i;
    }

    public String h() {
        return this.d;
    }

    public void i(String str) {
        this.j = str;
    }

    public void j(String str) {
        this.s = str;
    }

    public void k(String str) {
        this.k = str;
    }

    public void l(String str) {
        this.l = str;
    }

    public String m() {
        return this.o;
    }

    public String n() {
        return this.j;
    }

    public void o(String str) {
        this.n = str;
    }

    public void p(String str) {
        this.t = str;
    }

    public void q(String str) {
        this.f1230a = str;
    }

    public String r() {
        return this.l;
    }

    public boolean s() {
        return this.z;
    }

    public String t() {
        return this.v;
    }

    public String toString() {
        return "Environment{session_id=" + this.f1230a + ", session_count=" + this.f1231b + "', app_id='" + this.c + "', chartboost_sdk_version='" + this.d + "', chartboost_sdk_autocache_enabled=" + this.e + ", chartboost_sdk_gdpr='" + this.f + "', chartboost_sdk_ccpa='" + this.g + "', device_id='" + this.j + "', device_make='" + this.k + "', device_model='" + this.l + "', device_os_version='" + this.m + "', device_platform='" + this.n + "', device_country='" + this.o + "', device_language='" + this.s + "', device_timezone='" + this.t + "', device_connection_type='" + this.u + "', device_orientation='" + this.v + "', device_battery_level='" + this.w + "', device_charging_status='" + this.x + "', device_volume='" + this.y + "', device_mute='" + this.z + "', device_audio_output=" + this.A + ", device_storage='" + this.B + "', device_low_memory_warning='" + this.C + "', device_up_time='" + y() + "', session_impression_interstitial_count='" + this.D + "', session_impression_rewarded_count='" + this.E + "', session_impression_banner_count='" + this.F + "', session_duration='" + this.G + "'}";
    }

    public String u() {
        return this.m;
    }

    public String v() {
        return this.n;
    }

    public long w() {
        return this.B;
    }

    public String x() {
        return this.t;
    }

    public long y() {
        return SystemClock.uptimeMillis();
    }

    public int z() {
        return this.y;
    }

    public void a(String str) {
        this.c = str;
    }

    public void b(int i) {
        this.w = i;
    }

    public void c(String str) {
        this.h = str;
    }

    public void d(String str) {
        this.f = str;
    }

    public void e(String str) {
        this.i = str;
    }

    public String f() {
        return this.f;
    }

    public void g(String str) {
        this.u = str;
    }

    public void h(String str) {
        this.o = str;
    }

    public int i() {
        return this.A;
    }

    public int j() {
        return this.w;
    }

    public boolean k() {
        return this.x;
    }

    public String l() {
        return this.u;
    }

    public void m(String str) {
        this.v = str;
    }

    public void n(String str) {
        this.m = str;
    }

    public String o() {
        return this.s;
    }

    public long p() {
        return this.C;
    }

    public String q() {
        return this.k;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b(boolean z) {
        this.x = z;
    }

    public void c(int i) {
        this.y = i;
    }

    public String d() {
        return this.g;
    }

    public void e(int i) {
        this.F = i;
    }

    public void f(int i) {
        this.D = i;
    }

    public void g(int i) {
        this.E = i;
    }

    public static a d(Context context) {
        int i = Build.VERSION.SDK_INT;
        try {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            if (batteryManager == null) {
                return null;
            }
            int intProperty = batteryManager.getIntProperty(4);
            boolean isCharging = i >= 23 ? batteryManager.isCharging() : false;
            a aVar = new a();
            aVar.f1232a = intProperty;
            aVar.f1233b = isCharging;
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public static long e(Context context) {
        try {
            return new StatFs(context.getCacheDir().toString() + "/.chartboost").getAvailableBytes();
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static boolean f(Context context) {
        AudioManager a2 = a(context);
        return (a2 == null || a2.getRingerMode() == 2) ? false : true;
    }

    public void a(int i) {
        this.A = i;
    }

    public void b(long j) {
        this.B = j;
    }

    public void c(boolean z) {
        this.z = z;
    }

    public static int b(Context context) {
        AudioDeviceInfo[] devices;
        int type;
        int type2;
        int type3;
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            if (Build.VERSION.SDK_INT < 23) {
                return audioManager.isSpeakerphoneOn() ? 0 : 3;
            }
            devices = audioManager.getDevices(2);
            if (devices.length > 0) {
                AudioDeviceInfo audioDeviceInfo = devices[0];
                type = audioDeviceInfo.getType();
                if (type == 2) {
                    return 0;
                }
                type2 = audioDeviceInfo.getType();
                if (type2 == 4) {
                    return 1;
                }
                type3 = audioDeviceInfo.getType();
                return type3 == 8 ? 2 : 3;
            }
        }
        return 0;
    }

    public void a(long j) {
        this.C = j;
    }

    public void c(long j) {
        this.G = j;
    }

    public static v3 a(Context context, y4 y4Var, y8 y8Var, String str, p7 p7Var, String str2) {
        String c;
        int f;
        int d;
        int e;
        int a2;
        long b2;
        v3 v3Var = new v3();
        if (context == null) {
            return v3Var;
        }
        if (y8Var != null) {
            try {
                c = y8Var.c();
                f = y8Var.f();
                d = y8Var.d();
                e = y8Var.e();
                a2 = y8Var.a();
                b2 = y8Var.b();
            } catch (Exception unused) {
            }
        } else {
            f = -1;
            b2 = -1;
            c = "";
            d = 0;
            e = 0;
            a2 = 0;
        }
        v3Var.q(c);
        v3Var.d(f);
        v3Var.a(str2);
        v3Var.f("9.4.1");
        v3Var.a(false);
        DataUseConsent a3 = p7Var.a(CCPA.CCPA_STANDARD);
        if (a3 != null) {
            v3Var.b((String) a3.getConsent());
        }
        DataUseConsent a4 = p7Var.a(GDPR.GDPR_STANDARD);
        if (a4 != null) {
            v3Var.d((String) a4.getConsent());
        } else {
            v3Var.d("-1");
        }
        DataUseConsent a5 = p7Var.a(COPPA.COPPA_STANDARD);
        if (a5 != null) {
            v3Var.c(a5.getConsent().toString());
        } else {
            v3Var.c("");
        }
        DataUseConsent a6 = p7Var.a(LGPD.LGPD_STANDARD);
        if (a6 != null) {
            v3Var.e(a6.getConsent().toString());
        } else {
            v3Var.e("");
        }
        a d2 = d(context);
        if (d2 != null) {
            v3Var.b(d2.f1232a);
            v3Var.b(d2.f1233b);
        }
        v3Var.i(a(y4Var));
        v3Var.h(Locale.getDefault().getCountry());
        v3Var.g(str);
        v3Var.j(K());
        v3Var.k(Build.MANUFACTURER);
        v3Var.l(Build.MODEL);
        v3Var.n("Android " + Build.VERSION.RELEASE);
        v3Var.o(D());
        v3Var.m(CBUtility.b(context));
        v3Var.p(CBUtility.a());
        v3Var.b(e(context));
        v3Var.a(b());
        v3Var.c(c(context));
        v3Var.c(f(context));
        v3Var.a(b(context));
        v3Var.f(d);
        v3Var.g(e);
        v3Var.e(a2);
        v3Var.c(b2);
        return v3Var;
    }

    public static int c(Context context) {
        if (((AudioManager) context.getSystemService("audio")) == null) {
            return -1;
        }
        return (int) ((r2.getStreamVolume(3) / r2.getStreamMaxVolume(3)) * 100.0f);
    }

    public static long b() {
        try {
            Runtime runtime = Runtime.getRuntime();
            return (runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory())) / 1048576;
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static String a(y4 y4Var) {
        if (y4Var == null) {
            return "unknown";
        }
        if (y4Var.a() == null) {
            return y4Var.f();
        }
        return y4Var.a();
    }

    public static AudioManager a(Context context) {
        try {
            return (AudioManager) context.getSystemService("audio");
        } catch (Exception unused) {
            return null;
        }
    }
}
