package com.chartboost.sdk.impl;

import android.text.TextUtils;
import android.util.Base64;
import com.chartboost.sdk.Analytics;
import defpackage.dx;
import defpackage.j11;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final u8 f1026a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f1027b;
    public final h8 c;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1028a;

        static {
            int[] iArr = new int[Analytics.IAPType.values().length];
            try {
                iArr[Analytics.IAPType.GOOGLE_PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Analytics.IAPType.AMAZON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f1028a = iArr;
        }
    }

    public o0(u8 u8Var, z1 z1Var, h8 h8Var) {
        this.f1026a = u8Var;
        this.f1027b = z1Var;
        this.c = h8Var;
    }

    public final void a(String str, Analytics.LevelType levelType, int i, int i2, String str2, long j) {
        try {
            if (!a()) {
                f6.b("AnalyticsApi", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
                return;
            }
            boolean z = true;
            if (str.length() == 0) {
                f6.b("AnalyticsApi", "Invalid value: event label cannot be empty or null");
                return;
            }
            if (i >= 0 && i2 >= 0) {
                if (str2.length() != 0) {
                    z = false;
                }
                if (z) {
                    f6.b("AnalyticsApi", "Invalid value: description cannot be empty or null");
                    return;
                }
                JSONArray jSONArray = new JSONArray();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_label", str);
                jSONObject.put("event_field", levelType.getLevelType());
                jSONObject.put("main_level", i);
                jSONObject.put("sub_level", i2);
                jSONObject.put("description", str2);
                jSONObject.put("timestamp", j);
                jSONObject.put("data_type", "level_info");
                jSONArray.put(jSONObject);
                a(jSONArray);
                return;
            }
            f6.b("AnalyticsApi", "Invalid value: Level number should be > 0");
        } catch (Exception e) {
            f6.b("AnalyticsApi", e.toString());
        }
    }

    public final JSONObject b(String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (str2 == null || str2.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("purchaseData", str);
                jSONObject.put("purchaseSignature", str2);
                jSONObject.put("type", Analytics.IAPType.GOOGLE_PLAY.ordinal());
                return jSONObject;
            }
        }
        f6.b("AnalyticsApi", "Null object is passed for for purchase data or purchase signature");
        return new JSONObject();
    }

    public final void a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, Analytics.IAPType iAPType) {
        JSONObject b2;
        try {
            if (!a()) {
                f6.b("AnalyticsApi", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
                return;
            }
            float a2 = a(str4);
            if (a2 == -1.0f) {
                return;
            }
            int i = a.f1028a[iAPType.ordinal()];
            if (i == 1) {
                b2 = b(str6, str7);
            } else {
                if (i != 2) {
                    throw new j11(null);
                }
                b2 = a(str8, str9);
            }
            if (b2.length() == 0) {
                f6.b("AnalyticsApi", "Error while parsing the receipt to a JSON Object, ");
                return;
            }
            String encodeToString = Base64.encodeToString(b2.toString().getBytes(dx.f1853a), 2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("localized-title", str2);
            jSONObject.put("localized-description", str3);
            jSONObject.put("price", Float.valueOf(a2));
            jSONObject.put("currency", str5);
            jSONObject.put("productID", str);
            jSONObject.put("receipt", encodeToString);
            a(jSONObject);
        } catch (Exception e) {
            f6.b("AnalyticsApi", e.toString());
        }
    }

    public final boolean a() {
        return this.f1026a.e();
    }

    public final JSONObject a(String str, String str2) {
        if (!(str == null || str.length() == 0)) {
            if (!(str2 == null || str2.length() == 0)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("userID", str);
                jSONObject.put("purchaseToken", str2);
                jSONObject.put("type", Analytics.IAPType.AMAZON.ordinal());
                return jSONObject;
            }
        }
        f6.b("AnalyticsApi", "Null object is passed for for amazon user id or amazon purchase token");
        return new JSONObject();
    }

    public final float a(String str) {
        try {
            Matcher matcher = Pattern.compile("(\\d+\\.\\d+)|(\\d+)").matcher(str);
            matcher.find();
            String group = matcher.group();
            if (TextUtils.isEmpty(group)) {
                f6.b("AnalyticsApi", "Invalid price object");
                return -1.0f;
            }
            return Float.parseFloat(group);
        } catch (IllegalStateException unused) {
            f6.b("AnalyticsApi", "Invalid price object");
            return -1.0f;
        }
    }

    public final void a(JSONObject jSONObject) {
        c2 c2Var = new c2("https://live.chartboost.com", String.format(Locale.US, "%s%s", Arrays.copyOf(new Object[]{"/post-install-event/", "iap"}, 2)), this.c.build(), o7.NORMAL, "iap", null);
        c2Var.a("iap", jSONObject);
        c2Var.o = true;
        this.f1027b.a(c2Var);
    }

    public final void a(JSONArray jSONArray) {
        c2 c2Var = new c2("https://live.chartboost.com", "/post-install-event/tracking", this.c.build(), o7.NORMAL, "tracking", null);
        c2Var.a("track_info", jSONArray);
        c2Var.o = true;
        this.f1027b.a(c2Var);
    }
}
