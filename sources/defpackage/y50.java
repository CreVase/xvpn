package defpackage;

import android.view.View;
import com.security.xvpn.z35kb.connlog.ConnectionLogActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class y50 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectionLogActivity f5271b;

    public /* synthetic */ y50(ConnectionLogActivity connectionLogActivity, int i) {
        this.f5270a = i;
        this.f5271b = connectionLogActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f5270a;
        ConnectionLogActivity connectionLogActivity = this.f5271b;
        switch (i) {
            case 0:
                int i2 = ConnectionLogActivity.s;
                t9.w0(connectionLogActivity.getSupportFragmentManager(), y62.A);
                return;
            default:
                if (!ew3.X()) {
                    int i3 = ConnectionLogActivity.s;
                    connectionLogActivity.getClass();
                    m20.C0(connectionLogActivity, 29);
                    return;
                }
                t9.u0(connectionLogActivity, new z50(connectionLogActivity, 0));
                return;
        }
    }
}
