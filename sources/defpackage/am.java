package defpackage;

/* loaded from: classes.dex */
public final class am {

    /* renamed from: a, reason: collision with root package name */
    public final long f108a;

    /* renamed from: b, reason: collision with root package name */
    public final lm f109b;
    public final pl c;

    public am(long j, lm lmVar, pl plVar) {
        this.f108a = j;
        if (lmVar != null) {
            this.f109b = lmVar;
            this.c = plVar;
            return;
        }
        throw new NullPointerException("Null transportContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof am)) {
            return false;
        }
        am amVar = (am) obj;
        if (this.f108a == amVar.f108a && this.f109b.equals(amVar.f109b) && this.c.equals(amVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f108a;
        return this.c.hashCode() ^ ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f109b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f108a + ", transportContext=" + this.f109b + ", event=" + this.c + "}";
    }
}
