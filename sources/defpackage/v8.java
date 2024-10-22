package defpackage;

/* loaded from: classes2.dex */
public final class v8 extends ji1 implements v31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ String j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v8(int i, String str, String str2, String str3, String str4) {
        super(0);
        this.f = i;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.j = str4;
    }

    @Override // defpackage.v31
    public final /* bridge */ /* synthetic */ Object invoke() {
        ch3 ch3Var = ch3.f636a;
        switch (this.f) {
            case 0:
                m251invoke();
                return ch3Var;
            default:
                m251invoke();
                return ch3Var;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m251invoke() {
        switch (this.f) {
            case 0:
                x8.f5127a.b(this.g, this.h, this.i, this.j);
                return;
            default:
                tf3.x0(new v8(0, this.g, this.h, this.i, this.j));
                return;
        }
    }
}
