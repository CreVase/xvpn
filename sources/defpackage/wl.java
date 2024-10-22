package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wl extends un1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5031a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5032b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final oz1 g;

    public wl(long j, Integer num, long j2, byte[] bArr, String str, long j3, oz1 oz1Var) {
        this.f5031a = j;
        this.f5032b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = oz1Var;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] bArr;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof un1)) {
            return false;
        }
        un1 un1Var = (un1) obj;
        wl wlVar = (wl) un1Var;
        if (this.f5031a == wlVar.f5031a && ((num = this.f5032b) != null ? num.equals(wlVar.f5032b) : wlVar.f5032b == null)) {
            if (this.c == wlVar.c) {
                if (un1Var instanceof wl) {
                    bArr = ((wl) un1Var).d;
                } else {
                    bArr = wlVar.d;
                }
                if (Arrays.equals(this.d, bArr)) {
                    String str = wlVar.e;
                    String str2 = this.e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f == wlVar.f) {
                            oz1 oz1Var = wlVar.g;
                            oz1 oz1Var2 = this.g;
                            if (oz1Var2 == null) {
                                if (oz1Var == null) {
                                    return true;
                                }
                            } else if (oz1Var2.equals(oz1Var)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.f5031a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        int i2 = 0;
        Integer num = this.f5032b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        long j2 = this.c;
        int hashCode3 = (((i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i4 = (hashCode3 ^ hashCode2) * 1000003;
        long j3 = this.f;
        int i5 = (i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        oz1 oz1Var = this.g;
        if (oz1Var != null) {
            i2 = oz1Var.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f5031a + ", eventCode=" + this.f5032b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
