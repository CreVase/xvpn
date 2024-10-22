package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.nb;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class eb extends nb {
    public final HashSet<String> c;
    public final JSONObject d;
    public final long e;

    public eb(nb.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
