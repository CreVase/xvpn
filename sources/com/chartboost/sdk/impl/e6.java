package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import defpackage.m20;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final s0 f795a;

    /* renamed from: b, reason: collision with root package name */
    public final r f796b;
    public final CBError c;
    public final long d;
    public final long e;

    public e6(s0 s0Var, r rVar, CBError cBError, long j, long j2) {
        this.f795a = s0Var;
        this.f796b = rVar;
        this.c = cBError;
        this.d = j;
        this.e = j2;
    }

    public final r a() {
        return this.f796b;
    }

    public final CBError b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return m20.L(this.f795a, e6Var.f795a) && m20.L(this.f796b, e6Var.f796b) && m20.L(this.c, e6Var.c) && this.d == e6Var.d && this.e == e6Var.e;
    }

    public int hashCode() {
        int hashCode = this.f795a.hashCode() * 31;
        r rVar = this.f796b;
        int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
        CBError cBError = this.c;
        int hashCode3 = cBError != null ? cBError.hashCode() : 0;
        long j = this.d;
        int i = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.e;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "LoadResult(appRequest=" + this.f795a + ", adUnit=" + this.f796b + ", error=" + this.c + ", requestResponseCodeNs=" + this.d + ", readDataNs=" + this.e + ')';
    }

    public /* synthetic */ e6(s0 s0Var, r rVar, CBError cBError, long j, long j2, int i, ng0 ng0Var) {
        this(s0Var, (i & 2) != 0 ? null : rVar, (i & 4) == 0 ? cBError : null, (i & 8) != 0 ? 0L : j, (i & 16) == 0 ? j2 : 0L);
    }
}
