package defpackage;

/* loaded from: classes2.dex */
public final class sk extends ta0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4357a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4358b;
    public final String c;

    public sk(String str, String str2, String str3) {
        this.f4357a = str;
        this.f4358b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ta0)) {
            return false;
        }
        ta0 ta0Var = (ta0) obj;
        if (this.f4357a.equals(((sk) ta0Var).f4357a)) {
            sk skVar = (sk) ta0Var;
            if (this.f4358b.equals(skVar.f4358b) && this.c.equals(skVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4357a.hashCode() ^ 1000003) * 1000003) ^ this.f4358b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BuildIdMappingForArch{arch=");
        sb.append(this.f4357a);
        sb.append(", libraryName=");
        sb.append(this.f4358b);
        sb.append(", buildId=");
        return hx2.s(sb, this.c, "}");
    }
}
