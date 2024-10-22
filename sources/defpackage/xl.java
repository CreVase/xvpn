package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class xl extends yn1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5175a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5176b;
    public final y00 c;
    public final Integer d;
    public final String e;
    public final List f;
    public final pd2 g;

    public xl(long j, long j2, y00 y00Var, Integer num, String str, List list, pd2 pd2Var) {
        this.f5175a = j;
        this.f5176b = j2;
        this.c = y00Var;
        this.d = num;
        this.e = str;
        this.f = list;
        this.g = pd2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yn1)) {
            return false;
        }
        xl xlVar = (xl) ((yn1) obj);
        if (this.f5175a == xlVar.f5175a) {
            if (this.f5176b == xlVar.f5176b) {
                y00 y00Var = xlVar.c;
                y00 y00Var2 = this.c;
                if (y00Var2 != null ? y00Var2.equals(y00Var) : y00Var == null) {
                    Integer num = xlVar.d;
                    Integer num2 = this.d;
                    if (num2 != null ? num2.equals(num) : num == null) {
                        String str = xlVar.e;
                        String str2 = this.e;
                        if (str2 != null ? str2.equals(str) : str == null) {
                            List list = xlVar.f;
                            List list2 = this.f;
                            if (list2 != null ? list2.equals(list) : list == null) {
                                pd2 pd2Var = xlVar.g;
                                pd2 pd2Var2 = this.g;
                                if (pd2Var2 == null) {
                                    if (pd2Var == null) {
                                        return true;
                                    }
                                } else if (pd2Var2.equals(pd2Var)) {
                                    return true;
                                }
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
        int hashCode3;
        int hashCode4;
        long j = this.f5175a;
        long j2 = this.f5176b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        int i2 = 0;
        y00 y00Var = this.c;
        if (y00Var == null) {
            hashCode = 0;
        } else {
            hashCode = y00Var.hashCode();
        }
        int i3 = (i ^ hashCode) * 1000003;
        Integer num = this.d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i4 = (i3 ^ hashCode2) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i5 = (i4 ^ hashCode3) * 1000003;
        List list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i6 = (i5 ^ hashCode4) * 1000003;
        pd2 pd2Var = this.g;
        if (pd2Var != null) {
            i2 = pd2Var.hashCode();
        }
        return i6 ^ i2;
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f5175a + ", requestUptimeMs=" + this.f5176b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
