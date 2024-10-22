package com.google.ads.conversiontracking;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.conversiontracking.i;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.hx2;
import defpackage.p71;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@TargetApi(4)
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1391a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f1392b = new Object();
    public static e c = null;

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f1395a;

        /* renamed from: b, reason: collision with root package name */
        public final a f1396b;

        public b(String str, a aVar) {
            this.f1395a = str;
            this.f1396b = aVar;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f1397a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f1398b;
        public boolean c;
        public d d;
        public String e;
        public String f;
        public String g;
        public a h;
        public Map i;
        public String j;
        public long k;
        public boolean l;

        public c a(String str) {
            this.f1397a = str;
            return this;
        }

        public c b(String str) {
            this.e = str;
            return this;
        }

        public c c(String str) {
            this.f = str;
            return this;
        }

        public c d(String str) {
            this.g = str;
            return this;
        }

        public c e(String str) {
            this.j = str;
            return this;
        }

        public c a() {
            this.c = true;
            return this;
        }

        public c b() {
            this.l = true;
            return this;
        }

        public c a(d dVar) {
            this.d = dVar;
            return this;
        }

        public c a(a aVar) {
            this.h = aVar;
            return this;
        }

        public c a(Map<String, ?> map) {
            this.i = map;
            return this;
        }

        public c a(boolean z) {
            this.f1398b = z;
            return this;
        }

        public c a(long j) {
            this.k = TimeUnit.MILLISECONDS.toSeconds(j);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        DOUBLECLICK_AUDIENCE,
        DOUBLECLICK_CONVERSION,
        GOOGLE_CONVERSION,
        IAP_CONVERSION
    }

    public static e a(Context context) {
        e eVar;
        synchronized (f1392b) {
            if (c == null) {
                c = new e(context);
            }
            eVar = c;
        }
        return eVar;
    }

    public static long b(Context context) {
        return context.getSharedPreferences("google_conversion", 0).getLong("last_retry_time", 0L);
    }

    public static void c(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("google_conversion", 0).edit();
        edit.putLong("last_retry_time", System.currentTimeMillis());
        edit.commit();
    }

    public static void d(StringBuilder sb, i.a aVar, String str) {
        String str2;
        if (aVar == null) {
            str2 = null;
        } else {
            str2 = aVar.b() ? "1" : "0";
        }
        if (str2 != null) {
            sb.append(str2.length() != 0 ? ";dc_lat=".concat(str2) : new String(";dc_lat="));
        }
        if (aVar == null) {
            String valueOf = String.valueOf(str);
            sb.append(valueOf.length() != 0 ? ";isu=".concat(valueOf) : new String(";isu="));
        } else {
            String valueOf2 = String.valueOf(aVar.a());
            sb.append(valueOf2.length() != 0 ? ";dc_rdid=".concat(valueOf2) : new String(";dc_rdid="));
        }
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f1393a;

        /* renamed from: b, reason: collision with root package name */
        public final String f1394b;
        public final long c;

        public a(String str, String str2, long j) {
            this.f1393a = str;
            this.f1394b = str2;
            this.c = j;
        }

        public boolean a() {
            long j = this.c + 7776000000L;
            HashMap hashMap = g.f1391a;
            return j < System.currentTimeMillis();
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String[] split = str.split(" ");
            if (split.length != 3) {
                return null;
            }
            try {
                a aVar = new a(split[0], split[1], Long.parseLong(split[2]));
                if (aVar.a()) {
                    return null;
                }
                return aVar;
            } catch (NumberFormatException unused) {
                return null;
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            this(str, str2, System.currentTimeMillis());
            HashMap hashMap = g.f1391a;
        }
    }

    public static String b(long j) {
        return String.format(Locale.US, "%d.%03d", Long.valueOf(j / 1000), Long.valueOf(j % 1000));
    }

    public static String b(c cVar) {
        int i = w.f1416a[cVar.d.ordinal()];
        if (i == 1) {
            return cVar.f1397a;
        }
        if (i != 2) {
            return cVar.e;
        }
        return String.format("google_iap_ping:%s", cVar.j);
    }

    public static boolean d(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return true;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public static boolean a(Context context, c cVar, boolean z) {
        return a(context, a(cVar), b(cVar), z);
    }

    public static void c(Uri.Builder builder, i.a aVar, String str) {
        String str2;
        String str3 = null;
        if (aVar == null) {
            str2 = null;
        } else {
            str2 = aVar.b() ? "1" : "0";
        }
        if (str2 != null) {
            if (aVar != null) {
                str3 = aVar.b() ? "1" : "0";
            }
            builder.appendQueryParameter("lat", str3);
        }
        if (aVar != null) {
            builder.appendQueryParameter("rdid", aVar.a());
        } else {
            builder.appendQueryParameter("muid", str);
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        if (z) {
            return true;
        }
        boolean z2 = context.getSharedPreferences(str, 0).getBoolean(str2, false);
        if (z2) {
            String valueOf = String.valueOf(str2);
            Log.i("GoogleConversionReporter", valueOf.length() != 0 ? "Already sent ping for conversion ".concat(valueOf) : new String("Already sent ping for conversion "));
        }
        return !z2;
    }

    public static String b(c cVar, String str, String str2, i.a aVar, String str3) {
        String a2 = a(cVar.h);
        Uri.Builder appendQueryParameter = Uri.parse("https://www.googleadservices.com/pagead/conversion/").buildUpon().appendEncodedPath(String.valueOf(cVar.f1397a).concat("/")).appendQueryParameter("bundleid", str).appendQueryParameter("appversion", str2).appendQueryParameter("osversion", Build.VERSION.RELEASE).appendQueryParameter("sdkversion", "ct-sdk-a-v2.2.4").appendQueryParameter("gms", aVar != null ? "1" : "0");
        c(appendQueryParameter, aVar, str3);
        String str4 = cVar.e;
        if (str4 != null && cVar.f != null) {
            appendQueryParameter.appendQueryParameter("label", str4).appendQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE, cVar.f);
        }
        long j = cVar.k;
        if (j != 0) {
            appendQueryParameter.appendQueryParameter("timestamp", b(j));
        } else {
            appendQueryParameter.appendQueryParameter("timestamp", b(System.currentTimeMillis()));
        }
        if (cVar.c) {
            appendQueryParameter.appendQueryParameter("remarketing_only", "1");
        }
        if (cVar.l) {
            appendQueryParameter.appendQueryParameter("auto", "1");
        }
        if (cVar.f1398b) {
            appendQueryParameter.appendQueryParameter("usage_tracking_enabled", "1");
        } else {
            appendQueryParameter.appendQueryParameter("usage_tracking_enabled", "0");
        }
        String str5 = cVar.g;
        if (str5 != null) {
            appendQueryParameter.appendQueryParameter("currency_code", str5);
        }
        boolean z = cVar.c;
        Map map = cVar.i;
        if (z && map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() instanceof String) {
                    String valueOf = String.valueOf((String) entry.getKey());
                    appendQueryParameter.appendQueryParameter(valueOf.length() != 0 ? "data.".concat(valueOf) : new String("data."), (String) entry.getValue());
                } else if (entry.getValue() instanceof String[]) {
                    for (String str6 : (String[]) entry.getValue()) {
                        String valueOf2 = String.valueOf((String) entry.getKey());
                        appendQueryParameter.appendQueryParameter(valueOf2.length() != 0 ? "data.".concat(valueOf2) : new String("data."), str6);
                    }
                }
            }
        }
        String valueOf3 = String.valueOf(appendQueryParameter.build());
        return hx2.s(new StringBuilder(String.valueOf(a2).length() + valueOf3.length() + 0), valueOf3, a2);
    }

    public static String c(c cVar, String str, String str2, i.a aVar, String str3) {
        Uri.Builder appendQueryParameter = Uri.parse("https://www.googleadservices.com/pagead/conversion/").buildUpon().appendQueryParameter("sku", cVar.j).appendQueryParameter(AppMeasurementSdk.ConditionalUserProperty.VALUE, cVar.f).appendQueryParameter("bundleid", str).appendQueryParameter("appversion", str2).appendQueryParameter("osversion", Build.VERSION.RELEASE).appendQueryParameter("sdkversion", "ct-sdk-a-v2.2.4").appendQueryParameter("timestamp", b(System.currentTimeMillis()));
        c(appendQueryParameter, aVar, str3);
        return appendQueryParameter.build().toString();
    }

    public static void a(Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
        edit.putBoolean(str2, true);
        edit.commit();
    }

    public static String a(Context context, c cVar) throws NoSuchAlgorithmException {
        return a(context, cVar, new com.google.ads.conversiontracking.a(context).a());
    }

    public static String a(Context context, c cVar, i.a aVar) throws NoSuchAlgorithmException {
        String str;
        String str2;
        String packageName = context.getPackageName();
        try {
            str = context.getPackageManager().getPackageInfo(packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "";
        }
        if (aVar == null) {
            String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            if (string == null) {
                string = "null";
            }
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(string.getBytes());
            str2 = s.a(messageDigest.digest(), false);
        } else {
            str2 = null;
        }
        if (!cVar.c && cVar.d == d.DOUBLECLICK_CONVERSION) {
            return a(cVar, packageName, str, aVar, str2);
        }
        d dVar = cVar.d;
        if (dVar == d.DOUBLECLICK_AUDIENCE) {
            return a(cVar, aVar);
        }
        if (dVar == d.IAP_CONVERSION) {
            return c(cVar, packageName, str, aVar, str2);
        }
        return b(cVar, packageName, str, aVar, str2);
    }

    public static b a(Uri uri) {
        if (uri == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("referrer");
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String valueOf = String.valueOf(queryParameter);
        Uri parse = Uri.parse(valueOf.length() != 0 ? "http://hostname/?".concat(valueOf) : new String("http://hostname/?"));
        String queryParameter2 = parse.getQueryParameter("conv");
        String queryParameter3 = parse.getQueryParameter("gclid");
        if (TextUtils.isEmpty(queryParameter2) || TextUtils.isEmpty(queryParameter3)) {
            return null;
        }
        String queryParameter4 = parse.getQueryParameter("ai");
        if (queryParameter4 == null) {
            queryParameter4 = "";
        }
        return new b(queryParameter2, new a(queryParameter3, queryParameter4));
    }

    public static String a(a aVar) {
        if (aVar == null) {
            return "";
        }
        String str = aVar.f1394b;
        boolean isEmpty = TextUtils.isEmpty(str);
        String str2 = aVar.f1393a;
        if (isEmpty) {
            String valueOf = String.valueOf(str2);
            return valueOf.length() != 0 ? "&gclid=".concat(valueOf) : new String("&gclid=");
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + "ai".length() + String.valueOf(str2).length() + "&gclid=".length() + 2);
        sb.append("&gclid=");
        sb.append(str2);
        sb.append("&ai=");
        sb.append(str);
        return sb.toString();
    }

    public static boolean a(Context context, b bVar) {
        if (bVar == null) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("google_conversion_click_referrer", 0);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : sharedPreferences.getAll().entrySet()) {
            if (a.a((String) entry.getValue()) == null) {
                arrayList.add(entry.getKey());
            }
        }
        if (sharedPreferences.getString(bVar.f1395a, null) == null && sharedPreferences.getAll().size() == 100 && arrayList.isEmpty()) {
            return false;
        }
        a aVar = bVar.f1396b;
        String str = aVar.f1393a;
        String str2 = aVar.f1394b;
        long j = aVar.c;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + String.valueOf(str).length() + 20 + 1 + 1);
        p71.A(sb, str, " ", str2, " ");
        sb.append(j);
        String sb2 = sb.toString();
        synchronized (f1391a) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                f1391a.remove((String) it.next());
            }
            f1391a.put(bVar.f1395a, sb2);
        }
        new Thread(new v(sharedPreferences, arrayList, bVar, sb2)).start();
        return true;
    }

    public static a a(Context context, String str) {
        String str2;
        HashMap hashMap = f1391a;
        synchronized (hashMap) {
            str2 = (String) hashMap.get(str);
        }
        if (str2 == null) {
            str2 = context.getSharedPreferences("google_conversion_click_referrer", 0).getString(str, "");
        }
        return a.a(str2);
    }

    public static String a(c cVar, String str, String str2, i.a aVar, String str3) {
        String str4 = cVar.f1397a;
        String valueOf = String.valueOf(Build.VERSION.RELEASE);
        String b2 = b(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + "timestamp".length() + "ct-sdk-a-v2.2.4".length() + "sdkversion".length() + valueOf.length() + "osversion".length() + String.valueOf(str2).length() + "appversion".length() + String.valueOf(str).length() + "bundleid".length() + "ait".length() + String.valueOf(str4).length() + "https://pubads.g.doubleclick.net/activity;xsp=".length() + 13);
        p71.A(sb, "https://pubads.g.doubleclick.net/activity;xsp=", str4, ";ait=1;bundleid=", str);
        p71.A(sb, ";appversion=", str2, ";osversion=", valueOf);
        StringBuilder sb2 = new StringBuilder(hx2.s(sb, ";sdkversion=ct-sdk-a-v2.2.4;timestamp=", b2));
        d(sb2, aVar, str3);
        return sb2.toString();
    }

    public static String a(c cVar, i.a aVar) {
        if (aVar == null) {
            return null;
        }
        String valueOf = String.valueOf(cVar.f);
        StringBuilder sb = new StringBuilder(valueOf.length() != 0 ? "https://pubads.g.doubleclick.net/activity;dc_iu=".concat(valueOf) : new String("https://pubads.g.doubleclick.net/activity;dc_iu="));
        d(sb, aVar, null);
        Map map = cVar.i;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String encode = Uri.encode((String) entry.getKey());
                String encode2 = Uri.encode(entry.getValue().toString());
                StringBuilder sb2 = new StringBuilder(String.valueOf(encode2).length() + String.valueOf(encode).length() + 2);
                sb2.append(";");
                sb2.append(encode);
                sb2.append("=");
                sb2.append(encode2);
                sb.append(sb2.toString());
            }
        }
        return sb.toString();
    }

    public static String a(c cVar) {
        int i = w.f1416a[cVar.d.ordinal()];
        return i != 1 ? i != 2 ? "google_nonrepeatable_conversion" : "iap_nonrepeatable_conversion" : "doubleclick_nonrepeatable_conversion";
    }

    public static String a(String str) {
        if (((String) a(str)).length() != 0) {
            return str;
        }
        throw new IllegalStateException("Parameter cannot be empty string");
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }
}
