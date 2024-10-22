package defpackage;

/* loaded from: classes2.dex */
public final class rk extends ua0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4166a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4167b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final gb1 i;

    public rk(int i, String str, int i2, int i3, long j, long j2, long j3, String str2, gb1 gb1Var) {
        this.f4166a = i;
        this.f4167b = str;
        this.c = i2;
        this.d = i3;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = str2;
        this.i = gb1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj;
        if (this.f4166a == ((rk) ua0Var).f4166a) {
            rk rkVar = (rk) ua0Var;
            if (this.f4167b.equals(rkVar.f4167b) && this.c == rkVar.c && this.d == rkVar.d && this.e == rkVar.e && this.f == rkVar.f && this.g == rkVar.g) {
                String str = rkVar.h;
                String str2 = this.h;
                if (str2 != null ? str2.equals(str) : str == null) {
                    gb1 gb1Var = rkVar.i;
                    gb1 gb1Var2 = this.i;
                    if (gb1Var2 == null) {
                        if (gb1Var == null) {
                            return true;
                        }
                    } else if (gb1Var2.equals(gb1Var)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((((((this.f4166a ^ 1000003) * 1000003) ^ this.f4167b.hashCode()) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.g;
        int i3 = (i2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        int i4 = 0;
        String str = this.h;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (i3 ^ hashCode) * 1000003;
        gb1 gb1Var = this.i;
        if (gb1Var != null) {
            i4 = gb1Var.hashCode();
        }
        return i5 ^ i4;
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f4166a + ", processName=" + this.f4167b + ", reasonCode=" + this.c + ", importance=" + this.d + ", pss=" + this.e + ", rss=" + this.f + ", timestamp=" + this.g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}
