package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class hc3 implements iu3 {
    public static final hc3 g = new hc3();
    public static final Handler h = new Handler(Looper.getMainLooper());
    public static Handler i = null;
    public static final pw3 j = new pw3(3);
    public static final pw3 k = new pw3(4);
    public long f;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2401a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2402b = new ArrayList();
    public final dc2 d = new dc2(1);
    public final uy0 c = new uy0(28);
    public final uy0 e = new uy0(new eb3(11), 29, 0);

    public static void c() {
        if (i == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            i = handler;
            handler.post(j);
            i.postDelayed(k, 200L);
        }
    }

    public final void a(View view, ou3 ou3Var, JSONObject jSONObject, boolean z) {
        boolean z2;
        int i2;
        String str;
        boolean z3;
        boolean z4;
        boolean z5;
        if (fl.a(view) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        dc2 dc2Var = this.d;
        if (((HashSet) dc2Var.e).contains(view)) {
            i2 = 1;
        } else if (dc2Var.f1756a) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        if (i2 == 3) {
            return;
        }
        JSONObject a2 = ou3Var.a(view);
        WindowManager windowManager = ev3.f2002a;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(a2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (((HashMap) dc2Var.f1757b).size() == 0) {
            str = null;
        } else {
            str = (String) ((HashMap) dc2Var.f1757b).get(view);
            if (str != null) {
                ((HashMap) dc2Var.f1757b).remove(view);
            }
        }
        if (str != null) {
            try {
                a2.put("adSessionId", str);
            } catch (JSONException e2) {
                bx3.c("Error with setting ad session id", e2);
            }
            if (((Map) dc2Var.i).containsKey(view)) {
                ((Map) dc2Var.i).put(view, Boolean.TRUE);
                z3 = false;
            } else {
                z3 = true;
            }
            try {
                a2.put("hasWindowFocus", Boolean.valueOf(z3));
            } catch (JSONException e3) {
                bx3.c("Error with setting has window focus", e3);
            }
            dc2Var.f1756a = true;
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            p71.C(((HashMap) dc2Var.c).get(view));
            if (!z) {
                z5 = false;
            } else {
                z5 = true;
            }
            b(view, ou3Var, a2, i2, z5);
        }
    }

    public final void b(View view, ou3 ou3Var, JSONObject jSONObject, int i2, boolean z) {
        ou3Var.a(view, jSONObject, this, i2 == 1, z);
    }
}
