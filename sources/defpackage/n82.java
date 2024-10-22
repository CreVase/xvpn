package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;

/* loaded from: classes2.dex */
public final class n82 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PrivateBrowserActivity f3411b;

    public /* synthetic */ n82(PrivateBrowserActivity privateBrowserActivity, int i) {
        this.f3410a = i;
        this.f3411b = privateBrowserActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f3410a;
        PrivateBrowserActivity privateBrowserActivity = this.f3411b;
        switch (i) {
            case 0:
                privateBrowserActivity.k.getClass();
                br.a(false);
                privateBrowserActivity.k.getClass();
                br.b();
                return;
            default:
                privateBrowserActivity.finish();
                return;
        }
    }
}
