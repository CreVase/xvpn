package com.chartboost.sdk.impl;

import android.text.TextUtils;
import com.chartboost.sdk.impl.nb;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hc extends eb {
    public hc(nb.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar, hashSet, jSONObject, j);
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (tb.h(this.d, this.f1023b.a())) {
            return null;
        }
        this.f1023b.a(this.d);
        return this.d.toString();
    }

    public final void b(String str) {
        rb c = rb.c();
        if (c != null) {
            for (xa xaVar : c.b()) {
                if (this.c.contains(xaVar.j())) {
                    xaVar.k().b(str, this.e);
                }
            }
        }
    }

    @Override // com.chartboost.sdk.impl.nb, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
