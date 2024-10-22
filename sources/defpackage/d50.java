package defpackage;

import android.content.DialogInterface;
import com.security.xvpn.z35kb.purchase.BaseIAPHelper;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final /* synthetic */ class d50 implements DialogInterface.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1731a;

    public /* synthetic */ d50(int i) {
        this.f1731a = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.f1731a) {
            case 0:
                h50.c();
                return;
            default:
                ArrayList arrayList = BaseIAPHelper.f;
                return;
        }
    }
}
