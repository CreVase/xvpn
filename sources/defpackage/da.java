package defpackage;

import a.bx;
import a.du;
import android.app.Application;
import android.content.Context;
import android.view.View;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final /* synthetic */ class da implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1751a;

    public /* synthetic */ da(int i) {
        this.f1751a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = null;
        switch (this.f1751a) {
            case 0:
                int i = na.e;
                d5.D(ew3.M());
                return;
            case 1:
                int i2 = na.e;
                d5.D(ew3.M());
                return;
            case 2:
                int i3 = na.e;
                d5.D(ew3.M());
                return;
            case 3:
                int i4 = ConnectionLogActivity.s;
                t9.a();
                return;
            case 4:
                int i5 = nq2.z;
                Context context2 = view.getContext();
                if (context2 instanceof ServerChooseActivity) {
                    context = context2;
                }
                ServerChooseActivity serverChooseActivity = (ServerChooseActivity) context;
                if (serverChooseActivity != null) {
                    serverChooseActivity.Z().m.onClick(serverChooseActivity.Z().m.getChildAt(2));
                    return;
                }
                return;
            case 5:
                int i6 = g82.f;
                yb.f5305b.getClass();
                du.d(498, null);
                Application application = yb.c;
                if (application == null) {
                    application = null;
                }
                l83.a(application);
                bx bxVar = new bx();
                du.d(135, bxVar);
                boolean q = bxVar.q();
                bxVar.h();
                if (!q) {
                    du.d(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, null);
                }
                yb.d.g(Boolean.valueOf(ew3.o0()));
                return;
            case 6:
                int i7 = rl0.n;
                view.setSelected(!view.isSelected());
                return;
            default:
                int i8 = rl0.n;
                view.setSelected(!view.isSelected());
                return;
        }
    }
}
