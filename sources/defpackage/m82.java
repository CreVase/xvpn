package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.security.xvpn.z35kb.browser.PrivateBrowser;

/* loaded from: classes2.dex */
public final class m82 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivateBrowser f3253b;

    public /* synthetic */ m82(PrivateBrowser privateBrowser, int i) {
        this.f3252a = i;
        this.f3253b = privateBrowser;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f3252a;
        PrivateBrowser privateBrowser = this.f3253b;
        switch (i) {
            case 0:
                privateBrowser.finish();
                return;
            default:
                int i2 = PrivateBrowser.L;
                privateBrowser.Z(false);
                return;
        }
    }
}
