package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class pl {

    /* renamed from: a, reason: collision with root package name */
    public final String f3864a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3865b;
    public final hr0 c;
    public final long d;
    public final long e;
    public final Map f;

    public pl(String str, Integer num, hr0 hr0Var, long j, long j2, Map map) {
        this.f3864a = str;
        this.f3865b = num;
        this.c = hr0Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final jx0 c() {
        jx0 jx0Var = new jx0(3);
        jx0Var.C(this.f3864a);
        jx0Var.f2846b = this.f3865b;
        jx0Var.z(this.c);
        jx0Var.d = Long.valueOf(this.d);
        jx0Var.e = Long.valueOf(this.e);
        jx0Var.f = new HashMap(this.f);
        return jx0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pl)) {
            return false;
        }
        pl plVar = (pl) obj;
        if (this.f3864a.equals(plVar.f3864a)) {
            Integer num = plVar.f3865b;
            Integer num2 = this.f3865b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(plVar.c) && this.d == plVar.d && this.e == plVar.e && this.f.equals(plVar.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3864a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3865b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f3864a + ", code=" + this.f3865b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
