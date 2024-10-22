package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.account.ChangePasswordActivity;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class tt2 implements x31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4575a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f4576b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ tt2(y4 y4Var, String str, String str2) {
        this.c = y4Var;
        this.f4576b = str;
        this.d = str2;
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        ch3 ch3Var = ch3.f636a;
        int i = this.f4575a;
        final String str = this.f4576b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final y4 y4Var = (y4) obj3;
                final String str2 = (String) obj2;
                p9 p9Var = (p9) obj;
                y4Var.getClass();
                p9Var.f3798a = pd0.y(R.string.SignInFailed);
                p9Var.f3799b = pd0.y(R.string.AccountDeviceLimitReachedError);
                p9Var.h = pd0.y(R.string.Cancel);
                p9Var.d = pd0.y(R.string.ChangePassword);
                p9Var.f = new v31() { // from class: vt2
                    @Override // defpackage.v31
                    public final Object invoke() {
                        y4 y4Var2 = y4.this;
                        y4Var2.getClass();
                        ku kuVar = (ku) y4Var2.c;
                        Intent intent = new Intent(((wt2) kuVar.d).getActivity(), (Class<?>) ChangePasswordActivity.class);
                        intent.putExtra("PARAMS_EMAIL", str);
                        intent.putExtra("PARAMS_PASSWORD", str2);
                        intent.putExtra("INTENT_WITH_PASSWORD", true);
                        ((wt2) kuVar.d).getActivity().startActivityForResult(intent, 101);
                        return ch3.f636a;
                    }
                };
                return ch3Var;
            default:
                BaseIAPHelper baseIAPHelper = (BaseIAPHelper) obj3;
                ac2[] ac2VarArr = (ac2[]) obj2;
                String str3 = (String) obj;
                ArrayList arrayList = BaseIAPHelper.f;
                baseIAPHelper.getClass();
                int i2 = 0;
                for (int i3 = 0; i3 < ac2VarArr.length; i3++) {
                    if (TextUtils.equals(ac2VarArr[i3].f56b, str3)) {
                        ac2VarArr[i3].f55a = true;
                    }
                }
                baseIAPHelper.m();
                ew3.b0(new bo(baseIAPHelper, ac2VarArr, str, i2));
                return ch3Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tt2(BaseIAPHelper baseIAPHelper, ac2[] ac2VarArr, String str) {
        this.c = baseIAPHelper;
        this.d = ac2VarArr;
        this.f4576b = str;
    }
}
