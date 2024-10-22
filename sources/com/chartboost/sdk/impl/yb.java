package com.chartboost.sdk.impl;

import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import com.chartboost.sdk.impl.ab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class yb implements ab {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1322a = new int[2];

    @Override // com.chartboost.sdk.impl.ab
    public JSONObject a(View view) {
        if (view == null) {
            return tb.a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f1322a);
        int[] iArr = this.f1322a;
        return tb.a(iArr[0], iArr[1], width, height);
    }

    @TargetApi(21)
    public final void b(ViewGroup viewGroup, JSONObject jSONObject, ab.a aVar, boolean z) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.ab
    public void a(View view, JSONObject jSONObject, ab.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                b(viewGroup, jSONObject, aVar, z2);
            } else {
                a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }

    public final void a(ViewGroup viewGroup, JSONObject jSONObject, ab.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }
}
