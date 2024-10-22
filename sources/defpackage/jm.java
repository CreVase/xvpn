package defpackage;

/* loaded from: classes2.dex */
public final class jm {

    /* renamed from: a, reason: collision with root package name */
    public final String f2788a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2789b;
    public final boolean c;

    public jm(String str, String str2, boolean z) {
        if (str != null) {
            this.f2788a = str;
            if (str2 != null) {
                this.f2789b = str2;
                this.c = z;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jm)) {
            return false;
        }
        jm jmVar = (jm) obj;
        if (this.f2788a.equals(jmVar.f2788a) && this.f2789b.equals(jmVar.f2789b) && this.c == jmVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f2788a.hashCode() ^ 1000003) * 1000003) ^ this.f2789b.hashCode()) * 1000003;
        if (this.c) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OsData{osRelease=" + this.f2788a + ", osCodeName=" + this.f2789b + ", isRooted=" + this.c + "}";
    }
}
