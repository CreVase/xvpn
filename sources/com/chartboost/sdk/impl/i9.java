package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public final class i9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f880a;

    /* renamed from: b, reason: collision with root package name */
    public final long f881b;
    public final long c;

    public i9(long j, long j2, long j3) {
        this.f880a = j;
        this.f881b = j2;
        this.c = j3;
    }

    public final long a() {
        return this.f880a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9)) {
            return false;
        }
        i9 i9Var = (i9) obj;
        return this.f880a == i9Var.f880a && this.f881b == i9Var.f881b && this.c == i9Var.c;
    }

    public int hashCode() {
        long j = this.f880a;
        long j2 = this.f881b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        return i + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "TimeSourceBodyFields(currentTimeMillis=" + this.f880a + ", nanoTime=" + this.f881b + ", uptimeMillis=" + this.c + ')';
    }
}
