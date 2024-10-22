package defpackage;

import android.content.DialogInterface;
import com.security.xvpn.z35kb.SplashActivity;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class ao implements DialogInterface.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f303b;

    public /* synthetic */ ao(Object obj, int i) {
        this.f302a = i;
        this.f303b = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.f302a;
        Object obj = this.f303b;
        switch (i) {
            case 0:
                ArrayList arrayList = BaseIAPHelper.f;
                ((BaseIAPHelper) obj).f();
                return;
            case 1:
                ArrayList arrayList2 = BaseIAPHelper.f;
                ((BaseIAPHelper) obj).s();
                return;
            default:
                int i2 = SplashActivity.o;
                ((SplashActivity) obj).finish();
                return;
        }
    }
}
