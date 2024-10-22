package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class v7 {
    public long c = System.nanoTime();

    /* renamed from: b, reason: collision with root package name */
    public int f4788b = 1;

    /* renamed from: a, reason: collision with root package name */
    public ru3 f4787a = new ru3(null);

    public void a(mu3 mu3Var, o40 o40Var) {
        b(mu3Var, o40Var, null);
    }

    public final void b(mu3 mu3Var, o40 o40Var, JSONObject jSONObject) {
        int i;
        JSONObject jSONObject2 = new JSONObject();
        ev3.b(jSONObject2, "environment", "app");
        ev3.b(jSONObject2, "adSessionType", (u7) o40Var.h);
        JSONObject jSONObject3 = new JSONObject();
        ev3.b(jSONObject3, "deviceType", Build.MANUFACTURER + "; " + Build.MODEL);
        ev3.b(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        ev3.b(jSONObject3, "os", "Android");
        ev3.b(jSONObject2, "deviceInfo", jSONObject3);
        int currentModeType = fl.q.getCurrentModeType();
        if (currentModeType != 1) {
            if (currentModeType != 4) {
                i = 3;
            } else {
                i = 1;
            }
        } else {
            i = 2;
        }
        ev3.b(jSONObject2, "deviceCategory", hx2.c(i));
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        ev3.b(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        sb2 sb2Var = (sb2) o40Var.f3596a;
        ev3.b(jSONObject4, "partnerName", sb2Var.f4307a);
        ev3.b(jSONObject4, "partnerVersion", sb2Var.f4308b);
        ev3.b(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        ev3.b(jSONObject5, "libraryVersion", "1.4.3-Vungle");
        ev3.b(jSONObject5, "appId", s4.f4267b.f4268a.getApplicationContext().getPackageName());
        ev3.b(jSONObject2, "app", jSONObject5);
        String str = (String) o40Var.g;
        if (str != null) {
            ev3.b(jSONObject2, "contentUrl", str);
        }
        String str2 = (String) o40Var.f;
        if (str2 != null) {
            ev3.b(jSONObject2, "customReferenceData", str2);
        }
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = Collections.unmodifiableList((List) o40Var.c).iterator();
        if (!it.hasNext()) {
            v73.d.a(e(), "startSession", mu3Var.g, jSONObject2, jSONObject6, jSONObject);
        } else {
            p71.C(it.next());
            throw null;
        }
    }

    public final void c(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        ev3.b(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        v73.d.a(e(), "setLastActivity", jSONObject);
    }

    public void d() {
        this.f4787a.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WebView e() {
        return (WebView) this.f4787a.get();
    }

    public void f() {
    }
}
