package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Libraries.CBUtility;
import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pa extends v1<Object> {
    public final a2 k;
    public final a l;
    public final String m;

    /* loaded from: classes.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, long j, f0 f0Var);

        void a(String str, String str2, CBError cBError);
    }

    public pa(a2 a2Var, File file, String str, a aVar, o7 o7Var, String str2) {
        super("GET", str, o7Var, file);
        this.k = a2Var;
        this.l = aVar;
        this.m = str2;
        this.i = 1;
    }

    @Override // com.chartboost.sdk.impl.v1
    public w1 a() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Chartboost-App", this.m);
        hashMap.put("X-Chartboost-Client", CBUtility.b());
        a2 a2Var = this.k;
        hashMap.put("X-Chartboost-Reachability", String.valueOf(a2Var != null ? a2Var.c() : null));
        return new w1(hashMap, null, null);
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(Object obj, y1 y1Var) {
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(e(), this.e.getName());
        }
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(CBError cBError, y1 y1Var) {
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(e(), this.e.getName(), cBError);
        }
    }

    @Override // com.chartboost.sdk.impl.v1
    public void a(String str, long j) {
        a aVar = this.l;
        if (aVar != null) {
            aVar.a(str, this.e.getName(), j, null);
        }
    }
}
