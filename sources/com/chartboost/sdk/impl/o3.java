package com.chartboost.sdk.impl;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;

/* loaded from: classes.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1039a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1040b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;

    public o3() {
        this(0, 0, 0, 0, 0.0f, null, 0, null, null, null, false, 2047, null);
    }

    public final int a() {
        return this.f1040b;
    }

    public final String b() {
        return this.h;
    }

    public final int c() {
        return this.f1039a;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return this.f1039a == o3Var.f1039a && this.f1040b == o3Var.f1040b && this.c == o3Var.c && this.d == o3Var.d && Float.compare(this.e, o3Var.e) == 0 && m20.L(this.f, o3Var.f) && this.g == o3Var.g && m20.L(this.h, o3Var.h) && m20.L(this.i, o3Var.i) && m20.L(this.j, o3Var.j) && this.k == o3Var.k;
    }

    public final int f() {
        return this.g;
    }

    public final String g() {
        return this.i;
    }

    public final float h() {
        return this.e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        int floatToIntBits = (Float.floatToIntBits(this.e) + (((((((this.f1039a * 31) + this.f1040b) * 31) + this.c) * 31) + this.d) * 31)) * 31;
        String str = this.f;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int h = p71.h(this.h, (((floatToIntBits + hashCode) * 31) + this.g) * 31, 31);
        String str2 = this.i;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (h + hashCode2) * 31;
        String str3 = this.j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        int i3 = (i2 + i) * 31;
        boolean z = this.k;
        int i4 = z;
        if (z != 0) {
            i4 = 1;
        }
        return i3 + i4;
    }

    public final String i() {
        return this.j;
    }

    public final int j() {
        return this.c;
    }

    public final boolean k() {
        return this.k;
    }

    public String toString() {
        return "DeviceBodyFields(deviceWidth=" + this.f1039a + ", deviceHeight=" + this.f1040b + ", width=" + this.c + ", height=" + this.d + ", scale=" + this.e + ", dpi=" + this.f + ", ortbDeviceType=" + this.g + ", deviceType=" + this.h + ", packageName=" + this.i + ", versionName=" + this.j + ", isPortrait=" + this.k + ')';
    }

    public o3(int i, int i2, int i3, int i4, float f, String str, int i5, String str2, String str3, String str4, boolean z) {
        this.f1039a = i;
        this.f1040b = i2;
        this.c = i3;
        this.d = i4;
        this.e = f;
        this.f = str;
        this.g = i5;
        this.h = str2;
        this.i = str3;
        this.j = str4;
        this.k = z;
    }

    public /* synthetic */ o3(int i, int i2, int i3, int i4, float f, String str, int i5, String str2, String str3, String str4, boolean z, int i6, ng0 ng0Var) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) == 0 ? i4 : 0, (i6 & 16) != 0 ? 0.0f : f, (i6 & 32) != 0 ? "" : str, (i6 & 64) != 0 ? q3.f1082a : i5, (i6 & 128) != 0 ? "phone" : str2, (i6 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str3, (i6 & 512) == 0 ? str4 : null, (i6 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z);
    }
}
