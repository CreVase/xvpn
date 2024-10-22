package com.chartboost.sdk.impl;

import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import java.io.File;

/* loaded from: classes.dex */
public final class y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1320a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1321b;
    public final File c;
    public final File d;
    public final long e;
    public final String f;
    public long g;

    public y9(String str, String str2, File file, File file2, long j, String str3, long j2) {
        this.f1320a = str;
        this.f1321b = str2;
        this.c = file;
        this.d = file2;
        this.e = j;
        this.f = str3;
        this.g = j2;
    }

    public final long a() {
        return this.e;
    }

    public final File b() {
        return this.d;
    }

    public final long c() {
        return this.g;
    }

    public final String d() {
        return this.f1321b;
    }

    public final File e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y9)) {
            return false;
        }
        y9 y9Var = (y9) obj;
        return m20.L(this.f1320a, y9Var.f1320a) && m20.L(this.f1321b, y9Var.f1321b) && m20.L(this.c, y9Var.c) && m20.L(this.d, y9Var.d) && this.e == y9Var.e && m20.L(this.f, y9Var.f) && this.g == y9Var.g;
    }

    public final String f() {
        return this.f;
    }

    public final String g() {
        return this.f1320a;
    }

    public int hashCode() {
        int hashCode;
        int h = p71.h(this.f1321b, this.f1320a.hashCode() * 31, 31);
        File file = this.c;
        int i = 0;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        int i2 = (h + hashCode) * 31;
        File file2 = this.d;
        if (file2 != null) {
            i = file2.hashCode();
        }
        long j = this.e;
        int h2 = p71.h(this.f, (((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31, 31);
        long j2 = this.g;
        return h2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "VideoAsset(url=" + this.f1320a + ", filename=" + this.f1321b + ", localFile=" + this.c + ", directory=" + this.d + ", creationDate=" + this.e + ", queueFilePath=" + this.f + ", expectedFileSize=" + this.g + ')';
    }

    public final void a(long j) {
        this.g = j;
    }

    public /* synthetic */ y9(String str, String str2, File file, File file2, long j, String str3, long j2, int i, ng0 ng0Var) {
        this(str, str2, file, file2, (i & 16) != 0 ? c9.a() : j, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? 0L : j2);
    }
}
