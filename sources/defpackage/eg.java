package defpackage;

/* loaded from: classes2.dex */
public final class eg extends xk1 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(mp2 mp2Var, int i) {
        super(mp2Var);
        this.c = i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                } else {
                    super(mp2Var);
                    return;
                }
            }
            super(mp2Var);
            return;
        }
        super(mp2Var);
    }

    @Override // defpackage.mp2
    public final String a() {
        switch (this.c) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.ArrayList";
            case 2:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
