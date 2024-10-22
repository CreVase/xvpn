package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class ev3 {

    /* renamed from: a, reason: collision with root package name */
    public static WindowManager f2002a;

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f2003b = {"x", "y", "width", "height"};
    public static float c = Resources.getSystem().getDisplayMetrics().density;

    public static JSONObject a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / c);
            jSONObject.put("y", i2 / c);
            jSONObject.put("width", i3 / c);
            jSONObject.put("height", i4 / c);
        } catch (JSONException e) {
            bx3.c("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    public static void b(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            bx3.c("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    public static void c(JSONObject jSONObject) {
        float f;
        float f2;
        if (f2002a != null) {
            Point point = new Point(0, 0);
            f2002a.getDefaultDisplay().getRealSize(point);
            float f3 = point.x;
            float f4 = c;
            f = f3 / f4;
            f2 = point.y / f4;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean d(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            if (!e(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        String[] strArr = f2003b;
        int i = 0;
        while (true) {
            if (i < 4) {
                String str = strArr[i];
                if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                    z = false;
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        if (z && jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", "")) && Boolean.valueOf(jSONObject.optBoolean("noOutputDevice")).equals(Boolean.valueOf(jSONObject2.optBoolean("noOutputDevice"))) && Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")))) {
            JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
            if (optJSONArray != null || optJSONArray2 != null) {
                if ((optJSONArray == null && optJSONArray2 == null) || (optJSONArray != null && optJSONArray2 != null && optJSONArray.length() == optJSONArray2.length())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        if (optJSONArray.optString(i2, "").equals(optJSONArray2.optString(i2, ""))) {
                        }
                    }
                }
                z3 = false;
                if (!z3 && d(jSONObject, jSONObject2)) {
                    return true;
                }
            }
            z3 = true;
            if (!z3) {
            }
        }
        return false;
    }
}
