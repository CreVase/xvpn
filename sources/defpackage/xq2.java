package defpackage;

/* loaded from: classes2.dex */
public final class xq2 {

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f5205a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f5206b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public xq2(Boolean bool, Double d, Integer num, Integer num2, Long l) {
        this.f5205a = bool;
        this.f5206b = d;
        this.c = num;
        this.d = num2;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq2)) {
            return false;
        }
        xq2 xq2Var = (xq2) obj;
        return m20.L(this.f5205a, xq2Var.f5205a) && m20.L(this.f5206b, xq2Var.f5206b) && m20.L(this.c, xq2Var.c) && m20.L(this.d, xq2Var.d) && m20.L(this.e, xq2Var.e);
    }

    public final int hashCode() {
        Boolean bool = this.f5205a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d = this.f5206b;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Integer num = this.c;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.e;
        return hashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f5205a + ", sessionSamplingRate=" + this.f5206b + ", sessionRestartTimeout=" + this.c + ", cacheDuration=" + this.d + ", cacheUpdatedTime=" + this.e + ')';
    }
}
