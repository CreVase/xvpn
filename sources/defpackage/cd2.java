package defpackage;

import android.view.View;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class cd2 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f613a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ed2 f614b;

    public /* synthetic */ cd2(ed2 ed2Var, int i) {
        this.f613a = i;
        this.f614b = ed2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f613a;
        ed2 ed2Var = this.f614b;
        switch (i) {
            case 0:
                ed2Var.dismiss();
                dd2 dd2Var = ed2Var.o;
                if (dd2Var != null) {
                    un unVar = (un) dd2Var;
                    int i2 = unVar.f4700a;
                    BaseIAPHelper baseIAPHelper = unVar.f4701b;
                    switch (i2) {
                        case 1:
                            ArrayList arrayList = BaseIAPHelper.f;
                            baseIAPHelper.m();
                            baseIAPHelper.j();
                            return;
                        default:
                            ArrayList arrayList2 = BaseIAPHelper.f;
                            baseIAPHelper.m();
                            baseIAPHelper.j();
                            return;
                    }
                }
                return;
            default:
                ya0.T(view);
                yc2.a();
                GoogleIABHelper.g.l();
                ed2Var.dismiss();
                return;
        }
    }
}
