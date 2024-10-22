package defpackage;

/* loaded from: classes2.dex */
public final class ia extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ na g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ia(na naVar, int i) {
        super(0);
        this.f = i;
        this.g = naVar;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m104invoke();
                return ch3Var;
            case 1:
                m104invoke();
                return ch3Var;
            case 2:
                m104invoke();
                return ch3Var;
            default:
                m104invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m104invoke() {
        int i = this.f;
        na naVar = this.g;
        switch (i) {
            case 0:
                na.z(naVar);
                return;
            case 1:
                na.z(naVar);
                return;
            case 2:
                na.z(naVar);
                return;
            default:
                zf3.T(naVar, null, new la(naVar, null), 3);
                return;
        }
    }
}
