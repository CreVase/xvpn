package defpackage;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class mu3 extends t7 {

    /* renamed from: a, reason: collision with root package name */
    public final o40 f3356a;
    public v7 d;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3357b = new ArrayList();
    public boolean e = false;
    public boolean f = false;
    public final String g = UUID.randomUUID().toString();
    public ru3 c = new ru3(null);

    static {
        Pattern.compile("^[a-zA-Z0-9 ]+$");
    }

    public mu3(et2 et2Var, o40 o40Var) {
        v7 pu3Var;
        this.f3356a = o40Var;
        u7 u7Var = (u7) o40Var.h;
        if (u7Var != u7.HTML && u7Var != u7.JAVASCRIPT) {
            pu3Var = new wu3(Collections.unmodifiableMap((Map) o40Var.d), (String) o40Var.e);
        } else {
            pu3Var = new pu3((WebView) o40Var.f3597b);
        }
        this.d = pu3Var;
        pu3Var.f();
        dv3.c.f1844a.add(this);
        v7 v7Var = this.d;
        v73 v73Var = v73.d;
        WebView e = v7Var.e();
        JSONObject jSONObject = new JSONObject();
        ev3.b(jSONObject, "impressionOwner", (g42) et2Var.f1995b);
        ev3.b(jSONObject, "mediaEventsOwner", (g42) et2Var.c);
        ev3.b(jSONObject, "creativeType", (cc0) et2Var.d);
        ev3.b(jSONObject, "impressionType", (sb1) et2Var.e);
        ev3.b(jSONObject, "isolateVerificationScripts", Boolean.valueOf(et2Var.f1994a));
        v73Var.a(e, "init", jSONObject);
    }
}
