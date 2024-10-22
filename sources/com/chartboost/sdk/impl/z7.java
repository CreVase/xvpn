package com.chartboost.sdk.impl;

import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class z7 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1337b;
    public final String c;
    public final o6 d;

    public z7() {
        this(null, null, null, null, 15, null);
    }

    public final Integer a() {
        return this.f1336a;
    }

    public final Integer b() {
        return this.f1337b;
    }

    public final String c() {
        return this.c;
    }

    public final o6 d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7)) {
            return false;
        }
        z7 z7Var = (z7) obj;
        return m20.L(this.f1336a, z7Var.f1336a) && m20.L(this.f1337b, z7Var.f1337b) && m20.L(this.c, z7Var.c) && this.d == z7Var.d;
    }

    public int hashCode() {
        Integer num = this.f1336a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f1337b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "ReachabilityBodyFields(cellularConnectionType=" + this.f1336a + ", connectionTypeFromActiveNetwork=" + this.f1337b + ", detailedConnectionType=" + this.c + ", openRTBConnectionType=" + this.d + ')';
    }

    public z7(Integer num, Integer num2, String str, o6 o6Var) {
        this.f1336a = num;
        this.f1337b = num2;
        this.c = str;
        this.d = o6Var;
    }

    public /* synthetic */ z7(Integer num, Integer num2, String str, o6 o6Var, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? 0 : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? o6.UNKNOWN : o6Var);
    }
}
