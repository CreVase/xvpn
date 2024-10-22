package defpackage;

/* loaded from: classes2.dex */
public abstract class nk2 extends mn {
    public nk2(c90 c90Var) {
        super(c90Var);
        boolean z;
        if (c90Var != null) {
            if (c90Var.getContext() == zq0.f5530a) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return zq0.f5530a;
    }
}
