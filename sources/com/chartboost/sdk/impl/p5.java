package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import defpackage.m20;

/* loaded from: classes.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final q1 f1068a;

    /* renamed from: b, reason: collision with root package name */
    public final CBError.CBImpressionError f1069b;

    public p5(q1 q1Var, CBError.CBImpressionError cBImpressionError) {
        this.f1068a = q1Var;
        this.f1069b = cBImpressionError;
    }

    public final CBError.CBImpressionError a() {
        return this.f1069b;
    }

    public final q1 b() {
        return this.f1068a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj;
        return m20.L(this.f1068a, p5Var.f1068a) && this.f1069b == p5Var.f1069b;
    }

    public int hashCode() {
        q1 q1Var = this.f1068a;
        int hashCode = (q1Var == null ? 0 : q1Var.hashCode()) * 31;
        CBError.CBImpressionError cBImpressionError = this.f1069b;
        return hashCode + (cBImpressionError != null ? cBImpressionError.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionHolder(impression=" + this.f1068a + ", error=" + this.f1069b + ')';
    }
}
