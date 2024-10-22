package com.chartboost.sdk.impl;

import android.view.View;
import com.chartboost.sdk.impl.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class sb implements ab {

    /* renamed from: a, reason: collision with root package name */
    public final ab f1137a;

    public sb(ab abVar) {
        this.f1137a = abVar;
    }

    public ArrayList<View> a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        rb c = rb.c();
        if (c != null) {
            Collection<xa> a2 = c.a();
            IdentityHashMap identityHashMap = new IdentityHashMap((a2.size() * 2) + 3);
            Iterator<xa> it = a2.iterator();
            while (it.hasNext()) {
                View e = it.next().e();
                if (e != null && lc.e(e) && (rootView = e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float c2 = lc.c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && lc.c(arrayList.get(size - 1)) > c2) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.chartboost.sdk.impl.ab
    public JSONObject a(View view) {
        JSONObject a2 = tb.a(0, 0, 0, 0);
        tb.a(a2, cc.a());
        return a2;
    }

    @Override // com.chartboost.sdk.impl.ab
    public void a(View view, JSONObject jSONObject, ab.a aVar, boolean z, boolean z2) {
        Iterator<View> it = a().iterator();
        while (it.hasNext()) {
            aVar.a(it.next(), this.f1137a, jSONObject, z2);
        }
    }
}
