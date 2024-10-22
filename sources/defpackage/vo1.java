package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.security.xvpn.z35kb.MainActivity;

/* loaded from: classes2.dex */
public final class vo1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4872a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f4873b;

    public /* synthetic */ vo1(MainActivity mainActivity, int i) {
        this.f4872a = i;
        this.f4873b = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f4872a;
        MainActivity mainActivity = this.f4873b;
        switch (i) {
            case 0:
                if (!intent.getBooleanExtra("excludeMain", false)) {
                    mainActivity.finish();
                    return;
                }
                return;
            default:
                mainActivity.c0();
                return;
        }
    }
}
