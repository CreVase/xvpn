package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class rl {

    /* renamed from: a, reason: collision with root package name */
    public final String f4171a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4172b;

    public rl(String str, ArrayList arrayList) {
        if (str != null) {
            this.f4171a = str;
            this.f4172b = arrayList;
            return;
        }
        throw new NullPointerException("Null userAgent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rl)) {
            return false;
        }
        rl rlVar = (rl) obj;
        if (this.f4171a.equals(rlVar.f4171a) && this.f4172b.equals(rlVar.f4172b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4171a.hashCode() ^ 1000003) * 1000003) ^ this.f4172b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f4171a + ", usedDates=" + this.f4172b + "}";
    }
}
