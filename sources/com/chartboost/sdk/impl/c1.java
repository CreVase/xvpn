package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c1 extends v1<Void> {
    public final u3 k;
    public final a2 l;
    public final b1 m;
    public String n;

    public c1(u3 u3Var, a2 a2Var, b1 b1Var, File file, String str) {
        super("GET", b1Var.d, o7.NORMAL, file);
        this.i = 1;
        this.k = u3Var;
        this.l = a2Var;
        this.m = b1Var;
        this.n = str;
    }

    @Override // com.chartboost.sdk.impl.v1
    public w1 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.n);
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        hashMap.put("X-Chartboost-Reachability", Integer.toString(this.l.c().b()));
        return new w1(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(Void r1, y1 y1Var) {
        this.k.a(this, null, null);
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(CBError cBError, y1 y1Var) {
        this.k.a(this, cBError, y1Var);
    }
}
