package defpackage;

import android.graphics.Rect;
import com.security.xvpn.z35kb.television.purchase.PurchaseActivity;

/* loaded from: classes2.dex */
public final class i50 extends ji1 implements x31 {
    public final /* synthetic */ int f;
    public final /* synthetic */ du3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i50(du3 du3Var, int i) {
        super(1);
        this.f = i;
        this.g = du3Var;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f;
        du3 du3Var = this.g;
        switch (i) {
            case 0:
                tf3.h0(du3Var.getContext(), PurchaseActivity.class, null, 0, 6);
                return ch3Var;
            default:
                du3Var.setPadding(0, ((Rect) obj).top, 0, 0);
                return ch3Var;
        }
    }
}
