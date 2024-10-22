package com.chartboost.sdk.impl;

import android.view.View;
import org.json.JSONObject;

/* loaded from: classes.dex */
public interface ab {

    /* loaded from: classes.dex */
    public interface a {
        void a(View view, ab abVar, JSONObject jSONObject, boolean z);
    }

    JSONObject a(View view);

    void a(View view, JSONObject jSONObject, a aVar, boolean z, boolean z2);
}
