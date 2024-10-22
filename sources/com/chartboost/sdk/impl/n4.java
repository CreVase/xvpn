package com.chartboost.sdk.impl;

import android.content.Context;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class n4 {
    public static final <T> Iterator<T> iterator(JSONArray jSONArray) {
        return o4.a(jSONArray);
    }

    public static final i9 toBodyFields(h9 h9Var) {
        return o4.a(h9Var);
    }

    public static final o3 toDeviceBodyFields(Context context) {
        return o4.a(context);
    }

    public static final z7 toReachabilityBodyFields(a2 a2Var) {
        return o4.a(a2Var);
    }
}
