package com.chartboost.sdk.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import com.chartboost.sdk.impl.db;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class tb {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f1162a;

    /* renamed from: b, reason: collision with root package name */
    public static String[] f1163b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1164a;

        static {
            int[] iArr = new int[i7.values().length];
            f1164a = iArr;
            try {
                iArr[i7.NOT_DETECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f1165a;

        /* renamed from: b, reason: collision with root package name */
        public final float f1166b;

        public b(float f, float f2) {
            this.f1165a = f;
            this.f1166b = f2;
        }
    }

    public static float a(int i) {
        return i / c;
    }

    public static void b(JSONObject jSONObject) {
        b a2 = a(jSONObject);
        try {
            jSONObject.put("width", a2.f1165a);
            jSONObject.put("height", a2.f1166b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean c(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice")));
    }

    public static boolean f(JSONObject jSONObject, JSONObject jSONObject2) {
        for (String str : f1163b) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    public static boolean g(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    public static boolean h(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        return jSONObject != null && jSONObject2 != null && f(jSONObject, jSONObject2) && g(jSONObject, jSONObject2) && e(jSONObject, jSONObject2) && d(jSONObject, jSONObject2) && c(jSONObject, jSONObject2) && b(jSONObject, jSONObject2);
    }

    public static b a(JSONObject jSONObject) {
        float f;
        float f2;
        if (f1162a != null) {
            Point point = new Point(0, 0);
            f1162a.getDefaultDisplay().getRealSize(point);
            f = a(point.x);
            f2 = a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new b(f, f2);
    }

    public static void b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            zb.a("Error with setting not visible reason", e);
        }
    }

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", a(i));
            jSONObject.put("y", a(i2));
            jSONObject.put("width", a(i3));
            jSONObject.put("height", a(i4));
        } catch (JSONException e) {
            zb.a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static boolean b(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (!a(optJSONArray, optJSONArray2)) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!h(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static void a(Context context) {
        if (context != null) {
            c = context.getResources().getDisplayMetrics().density;
            f1162a = (WindowManager) context.getSystemService("window");
        }
    }

    public static void a(JSONObject jSONObject, db.a aVar) {
        dc a2 = aVar.a();
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = aVar.b().iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a2.d());
            jSONObject.put("friendlyObstructionPurpose", a2.b());
            jSONObject.put("friendlyObstructionReason", a2.a());
        } catch (JSONException e) {
            zb.a("Error with setting friendly obstruction", e);
        }
    }

    public static void a(JSONObject jSONObject, i7 i7Var) {
        try {
            jSONObject.put("noOutputDevice", a(i7Var));
        } catch (JSONException e) {
            zb.a("Error with setting output device status", e);
        }
    }

    public static void a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            zb.a("Error with setting has window focus", e);
        }
    }

    public static void a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            zb.a("Error with setting ad session id", e);
        }
    }

    public static void a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            zb.a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean a(i7 i7Var) {
        return a.f1164a[i7Var.ordinal()] == 1;
    }

    public static boolean a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
