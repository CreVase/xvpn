package defpackage;

/* loaded from: classes.dex */
public final class ol {

    /* renamed from: a, reason: collision with root package name */
    public final Object f3685a;

    /* renamed from: b, reason: collision with root package name */
    public final y72 f3686b;

    public ol(Object obj, y72 y72Var) {
        if (obj != null) {
            this.f3685a = obj;
            this.f3686b = y72Var;
            return;
        }
        throw new NullPointerException("Null payload");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ol)) {
            return false;
        }
        ol olVar = (ol) obj;
        olVar.getClass();
        if (this.f3685a.equals(olVar.f3685a) && this.f3686b.equals(olVar.f3686b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3685a.hashCode() ^ (-721379959)) * 1000003) ^ this.f3686b.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f3685a + ", priority=" + this.f3686b + "}";
    }
}
