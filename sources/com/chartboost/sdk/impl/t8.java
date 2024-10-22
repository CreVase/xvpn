package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.LGPD;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class t8 {
    public final String A;
    public final String B;
    public final String C;
    public final a D;
    public b E;
    public final String F;
    public final n9 G;
    public final ea H;
    public final p6 I;

    /* renamed from: a, reason: collision with root package name */
    public final String f1156a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1157b;
    public final boolean c;
    public final List<String> d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final long m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final List<String> r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final int v;
    public final boolean w;
    public final int x;
    public final boolean y;
    public final String z;

    public t8(JSONObject jSONObject) {
        this.f1156a = jSONObject.optString("configVariant");
        this.f1157b = jSONObject.optBoolean("prefetchDisable");
        this.c = jSONObject.optBoolean("publisherDisable");
        this.D = a.a(jSONObject);
        try {
            this.E = b.a(jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.F = jSONObject.optString("publisherWarning", null);
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("invalidateFolderList");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                String optString = optJSONArray.optString(i);
                if (!optString.isEmpty()) {
                    arrayList.add(optString);
                }
            }
        }
        this.d = Collections.unmodifiableList(arrayList);
        JSONObject optJSONObject = jSONObject.optJSONObject("trackingLevels");
        optJSONObject = optJSONObject == null ? new JSONObject() : optJSONObject;
        this.e = optJSONObject.optBoolean("critical", true);
        this.l = optJSONObject.optBoolean("includeStackTrace", true);
        this.f = optJSONObject.optBoolean(MRAIDPresenter.ERROR);
        this.g = optJSONObject.optBoolean("debug");
        this.h = optJSONObject.optBoolean("session");
        this.i = optJSONObject.optBoolean("system");
        this.j = optJSONObject.optBoolean("timing");
        this.k = optJSONObject.optBoolean("user");
        this.G = n9.a(jSONObject);
        JSONObject optJSONObject2 = jSONObject.optJSONObject("videoPreCaching");
        this.H = ea.a(optJSONObject2 == null ? new JSONObject() : optJSONObject2);
        JSONObject optJSONObject3 = jSONObject.optJSONObject("omSdk");
        this.I = q6.a(optJSONObject3 == null ? new JSONObject() : optJSONObject3);
        this.m = jSONObject.optLong("getAdRetryBaseMs", 200L);
        this.n = jSONObject.optInt("getAdRetryMaxBackoffExponent", 3);
        JSONObject optJSONObject4 = jSONObject.optJSONObject("webview");
        optJSONObject4 = optJSONObject4 == null ? new JSONObject() : optJSONObject4;
        this.o = optJSONObject4.optInt("cacheMaxBytes", 104857600);
        int optInt = optJSONObject4.optInt("cacheMaxUnits", 10);
        this.p = optInt > 0 ? optInt : 10;
        this.q = (int) TimeUnit.SECONDS.toDays(optJSONObject4.optInt("cacheTTLs", m1.f982a));
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = optJSONObject4.optJSONArray("directories");
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                String optString2 = optJSONArray2.optString(i2);
                if (!optString2.isEmpty()) {
                    arrayList2.add(optString2);
                }
            }
        }
        this.r = Collections.unmodifiableList(arrayList2);
        this.s = optJSONObject4.optBoolean("enabled", g());
        this.t = optJSONObject4.optBoolean("inplayEnabled", true);
        this.u = optJSONObject4.optBoolean("interstitialEnabled", true);
        int optInt2 = optJSONObject4.optInt("invalidatePendingImpression", 3);
        this.v = optInt2 <= 0 ? 3 : optInt2;
        this.w = optJSONObject4.optBoolean("lockOrientation", true);
        this.x = optJSONObject4.optInt("prefetchSession", 3);
        this.y = optJSONObject4.optBoolean("rewardVideoEnabled", true);
        String optString3 = optJSONObject4.optString("version", x2.f1288a);
        this.z = optString3;
        this.A = String.format("%s/%s%s", "webview", optString3, "/interstitial/get");
        this.B = String.format("%s/%s/%s", "webview", optString3, "prefetch");
        this.C = String.format("%s/%s%s", "webview", optString3, "/reward/get");
    }

    public static boolean g() {
        int[] iArr = {4, 4, 2};
        String a2 = p0.b().a();
        if (a2 != null && a2.length() > 0) {
            String[] split = a2.replaceAll("[^\\d.]", "").split("\\.");
            for (int i = 0; i < split.length && i < 3; i++) {
                try {
                    if (Integer.valueOf(split[i]).intValue() > iArr[i]) {
                        return true;
                    }
                    if (Integer.valueOf(split[i]).intValue() < iArr[i]) {
                        return false;
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return false;
    }

    public a a() {
        return this.D;
    }

    public p6 b() {
        return this.I;
    }

    public ea c() {
        return this.H;
    }

    public boolean d() {
        return this.c;
    }

    public String e() {
        return this.F;
    }

    public n9 f() {
        return this.G;
    }

    public f3 h() {
        return new f3(this.f1156a, this.s, this.z);
    }

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1158a;

        public static a a(JSONObject jSONObject) {
            a aVar = new a();
            aVar.f1158a = jSONObject.optBoolean("bannerEnable", true);
            return aVar;
        }

        public boolean a() {
            return this.f1158a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public HashSet<String> f1159a;

        public static b a(JSONObject jSONObject) throws JSONException {
            b bVar = new b();
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add(CCPA.CCPA_STANDARD);
            hashSet.add(COPPA.COPPA_STANDARD);
            hashSet.add(LGPD.LGPD_STANDARD);
            JSONArray optJSONArray = jSONObject.optJSONArray("privacyStandards");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                a(optJSONArray, hashSet, length);
                a(hashSet, length);
            }
            bVar.f1159a = hashSet;
            return bVar;
        }

        public static void a(JSONArray jSONArray, HashSet<String> hashSet, int i) throws JSONException {
            for (int i2 = 0; i2 < i; i2++) {
                hashSet.add(jSONArray.getString(i2));
            }
        }

        public static void a(HashSet<String> hashSet, int i) {
            if (i == 0) {
                hashSet.clear();
            }
        }

        public HashSet<String> a() {
            return this.f1159a;
        }
    }
}
