package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class o13 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public static final /* synthetic */ int e = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f3582a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3583b;
    public final long c;

    public o13(String str, String str2, long j) {
        this.f3582a = str;
        this.f3583b = str2;
        this.c = j;
    }

    public static o13 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new o13(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e2) {
                e2.toString();
                return null;
            }
        }
        return new o13(str, null, 0L);
    }
}
