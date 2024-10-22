package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.c2;
import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.internal.Networking.NetworkHelper;
import java.util.HashMap;

/* loaded from: classes.dex */
public class p9 extends c2 {
    public final o9 q;
    public final v3 r;
    public final m9 s;

    public p9(String str, o9 o9Var, v3 v3Var) {
        this(NetworkHelper.a(str), NetworkHelper.b(str), null, o9Var, v3Var, new m9());
    }

    @Override // com.chartboost.sdk.impl.c2, com.chartboost.sdk.impl.v1
    public w1 a() {
        String a2 = this.s.a(this.q, this.r);
        HashMap hashMap = new HashMap();
        hashMap.put("Accept", "application/json");
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-API", "9.4.1");
        return new w1(hashMap, a2.getBytes(), "application/json");
    }

    public final void j() {
        Mediation e = this.q.e();
        if (e != null && e.toMediationBodyFields() != null) {
            i6 mediationBodyFields = e.toMediationBodyFields();
            a("mediation", mediationBodyFields.c());
            a("mediation_version", mediationBodyFields.b());
            a("adapter_version", mediationBodyFields.a());
        }
    }

    public p9(String str, String str2, c2.a aVar, o9 o9Var, v3 v3Var, m9 m9Var) {
        super(str, str2, null, o7.NORMAL, aVar);
        this.o = false;
        this.q = o9Var;
        this.r = v3Var;
        this.s = m9Var;
        j();
    }
}
