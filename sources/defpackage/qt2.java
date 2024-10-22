package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class qt2 implements a22, v41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4056a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x31 f4057b;

    public /* synthetic */ qt2(int i, x31 x31Var) {
        this.f4056a = i;
        this.f4057b = x31Var;
    }

    @Override // defpackage.a22
    public final /* synthetic */ void F(Object obj) {
        int i = this.f4056a;
        x31 x31Var = this.f4057b;
        switch (i) {
            case 0:
                x31Var.invoke(obj);
                return;
            case 1:
                x31Var.invoke(obj);
                return;
            default:
                x31Var.invoke(obj);
                return;
        }
    }

    @Override // defpackage.v41
    public final m41 a() {
        return this.f4057b;
    }

    public final boolean equals(Object obj) {
        x31 x31Var = this.f4057b;
        switch (this.f4056a) {
            case 0:
                if (!(obj instanceof a22) || !(obj instanceof v41)) {
                    return false;
                }
                return m20.L(x31Var, ((v41) obj).a());
            case 1:
                if (!(obj instanceof a22) || !(obj instanceof v41)) {
                    return false;
                }
                return m20.L(x31Var, ((v41) obj).a());
            default:
                if (!(obj instanceof a22) || !(obj instanceof v41)) {
                    return false;
                }
                return m20.L(x31Var, ((v41) obj).a());
        }
    }

    public final int hashCode() {
        int i = this.f4056a;
        x31 x31Var = this.f4057b;
        switch (i) {
            case 0:
                return x31Var.hashCode();
            case 1:
                return x31Var.hashCode();
            default:
                return x31Var.hashCode();
        }
    }
}
