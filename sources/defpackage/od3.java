package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class od3 implements iz0, v41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l41 f3647a;

    public od3(l41 l41Var) {
        this.f3647a = l41Var;
    }

    @Override // defpackage.v41
    public final m41 a() {
        return this.f3647a;
    }

    @Override // defpackage.iz0
    public final /* synthetic */ Object b(Object obj, c90 c90Var) {
        return this.f3647a.invoke(obj, c90Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof iz0) || !(obj instanceof v41)) {
            return false;
        }
        return m20.L(this.f3647a, ((v41) obj).a());
    }

    public final int hashCode() {
        return this.f3647a.hashCode();
    }
}
