package defpackage;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final /* synthetic */ class mh0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3296a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nh0 f3297b;

    public /* synthetic */ mh0(nh0 nh0Var, int i) {
        this.f3296a = i;
        this.f3297b = nh0Var;
    }

    private final void a() {
        nh0 nh0Var = this.f3297b;
        synchronized (nh0Var) {
            ((v71) nh0Var.f3458a.get()).k(((pj0) nh0Var.c.get()).a(), System.currentTimeMillis());
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String byteArrayOutputStream;
        switch (this.f3296a) {
            case 0:
                nh0 nh0Var = this.f3297b;
                synchronized (nh0Var) {
                    v71 v71Var = (v71) nh0Var.f3458a.get();
                    ArrayList c = v71Var.c();
                    v71Var.b();
                    JSONArray jSONArray = new JSONArray();
                    for (int i = 0; i < c.size(); i++) {
                        rl rlVar = (rl) c.get(i);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("agent", rlVar.f4171a);
                        jSONObject.put("dates", new JSONArray((Collection) rlVar.f4172b));
                        jSONArray.put(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("heartbeats", jSONArray);
                    jSONObject2.put("version", "2");
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                    try {
                        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                        try {
                            gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                            gZIPOutputStream.close();
                            base64OutputStream.close();
                            byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                        } finally {
                        }
                    } finally {
                    }
                }
                return byteArrayOutputStream;
            default:
                a();
                return null;
        }
    }
}
