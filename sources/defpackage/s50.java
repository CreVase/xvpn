package defpackage;

import com.security.xvpn.z35kb.ui.components.ConnectingStatusView;

/* loaded from: classes2.dex */
public final /* synthetic */ class s50 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConnectingStatusView f4273b;

    public /* synthetic */ s50(ConnectingStatusView connectingStatusView, int i) {
        this.f4272a = i;
        this.f4273b = connectingStatusView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4272a;
        ConnectingStatusView connectingStatusView = this.f4273b;
        switch (i) {
            case 0:
                int i2 = ConnectingStatusView.f;
                connectingStatusView.setVisibility(8);
                return;
            default:
                int i3 = ConnectingStatusView.f;
                connectingStatusView.setVisibility(0);
                connectingStatusView.setAlpha(0.0f);
                connectingStatusView.animate().alpha(1.0f).setDuration(1000L).start();
                return;
        }
    }
}
