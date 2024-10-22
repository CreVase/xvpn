package defpackage;

/* loaded from: classes2.dex */
public final class sl {

    /* renamed from: a, reason: collision with root package name */
    public final String f4362a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4363b;

    public sl(String str, String str2) {
        if (str != null) {
            this.f4362a = str;
            this.f4363b = str2;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sl)) {
            return false;
        }
        sl slVar = (sl) obj;
        if (this.f4362a.equals(slVar.f4362a)) {
            String str = slVar.f4363b;
            String str2 = this.f4363b;
            if (str2 == null) {
                if (str == null) {
                    return true;
                }
            } else if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f4362a.hashCode() ^ 1000003) * 1000003;
        String str = this.f4363b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallIds{crashlyticsInstallId=");
        sb.append(this.f4362a);
        sb.append(", firebaseInstallationId=");
        return hx2.s(sb, this.f4363b, "}");
    }
}
