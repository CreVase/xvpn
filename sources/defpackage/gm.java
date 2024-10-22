package defpackage;

/* loaded from: classes2.dex */
public final class gm {

    /* renamed from: a, reason: collision with root package name */
    public final hm f2277a;

    /* renamed from: b, reason: collision with root package name */
    public final jm f2278b;
    public final im c;

    public gm(hm hmVar, jm jmVar, im imVar) {
        this.f2277a = hmVar;
        this.f2278b = jmVar;
        this.c = imVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        if (this.f2277a.equals(gmVar.f2277a) && this.f2278b.equals(gmVar.f2278b) && this.c.equals(gmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2277a.hashCode() ^ 1000003) * 1000003) ^ this.f2278b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f2277a + ", osData=" + this.f2278b + ", deviceData=" + this.c + "}";
    }
}
