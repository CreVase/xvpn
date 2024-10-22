package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class nv3 extends qu3 {
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv3(uy0 uy0Var, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(uy0Var, hashSet, jSONObject, j);
        this.f = i;
    }

    @Override // defpackage.xu3
    /* renamed from: a */
    public final void onPostExecute(String str) {
        switch (this.f) {
            case 0:
                c(str);
                super.onPostExecute(str);
                return;
            default:
                if (!TextUtils.isEmpty(str)) {
                    c(str);
                }
                super.onPostExecute(str);
                return;
        }
    }

    public final String b() {
        int i = this.f;
        JSONObject jSONObject = this.d;
        switch (i) {
            case 0:
                return jSONObject.toString();
            default:
                uy0 uy0Var = this.f5229b;
                if (ev3.e(jSONObject, (JSONObject) uy0Var.f4757b)) {
                    return null;
                }
                uy0Var.f4757b = jSONObject;
                return jSONObject.toString();
        }
    }

    public final void c(String str) {
        v73 v73Var = v73.d;
        HashSet hashSet = this.c;
        int i = this.f;
        long j = this.e;
        switch (i) {
            case 0:
                dv3 dv3Var = dv3.c;
                if (dv3Var != null) {
                    for (mu3 mu3Var : Collections.unmodifiableCollection(dv3Var.f1844a)) {
                        if (hashSet.contains(mu3Var.g)) {
                            v7 v7Var = mu3Var.d;
                            if (j >= v7Var.c && v7Var.f4788b != 3) {
                                v7Var.f4788b = 3;
                                v73Var.a(v7Var.e(), "setNativeViewHierarchy", str);
                            }
                        }
                    }
                    return;
                }
                return;
            default:
                dv3 dv3Var2 = dv3.c;
                if (dv3Var2 != null) {
                    for (mu3 mu3Var2 : Collections.unmodifiableCollection(dv3Var2.f1844a)) {
                        if (hashSet.contains(mu3Var2.g)) {
                            v7 v7Var2 = mu3Var2.d;
                            if (j >= v7Var2.c) {
                                v7Var2.f4788b = 2;
                                v73Var.a(v7Var2.e(), "setNativeViewHierarchy", str);
                            }
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        switch (this.f) {
            case 0:
                return b();
            default:
                return b();
        }
    }

    @Override // defpackage.xu3, android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                onPostExecute((String) obj);
                return;
            default:
                onPostExecute((String) obj);
                return;
        }
    }
}
