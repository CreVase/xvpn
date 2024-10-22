package defpackage;

import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class d6 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ String g;
    public final /* synthetic */ x31 h;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(String str, x31 x31Var, String str2, int i) {
        super(1);
        this.f = i;
        this.g = str;
        this.h = x31Var;
        this.i = str2;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        String str = this.i;
        x31 x31Var = this.h;
        String str2 = this.g;
        switch (i) {
            case 0:
                p9 p9Var = (p9) obj;
                p9Var.f3798a = str2;
                p9.b(p9Var, pd0.y(R.string.UnderstandToConnect), new c6(0, str, x31Var), 2);
                p9Var.h = pd0.y(R.string.Cancel);
                return ch3Var;
            default:
                ad3 ad3Var = (ad3) obj;
                ad3Var.f61a = str2;
                ad3.a(ad3Var, pd0.y(R.string.UnderstandToConnect), new c6(1, str, x31Var), 2);
                ad3Var.c = pd0.y(R.string.Cancel);
                return ch3Var;
        }
    }
}
