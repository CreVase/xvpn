package defpackage;

/* loaded from: classes2.dex */
public final class vl {

    /* renamed from: a, reason: collision with root package name */
    public final String f4852a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4853b;

    public vl(String str, String str2) {
        if (str != null) {
            this.f4852a = str;
            if (str2 != null) {
                this.f4853b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vl)) {
            return false;
        }
        vl vlVar = (vl) obj;
        if (this.f4852a.equals(vlVar.f4852a) && this.f4853b.equals(vlVar.f4853b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4852a.hashCode() ^ 1000003) * 1000003) ^ this.f4853b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.f4852a);
        sb.append(", version=");
        return hx2.s(sb, this.f4853b, "}");
    }
}
