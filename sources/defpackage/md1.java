package defpackage;

import android.content.Intent;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.IntentReceiverActivity;

/* loaded from: classes2.dex */
public final /* synthetic */ class md1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntentReceiverActivity f3281b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ md1(IntentReceiverActivity intentReceiverActivity, Intent intent, int i) {
        this.f3280a = i;
        this.f3281b = intentReceiverActivity;
        this.c = intent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3280a;
        Intent intent = this.c;
        int i2 = 1;
        IntentReceiverActivity intentReceiverActivity = this.f3281b;
        switch (i) {
            case 0:
                int i3 = IntentReceiverActivity.f1600a;
                intentReceiverActivity.getClass();
                XApplication.d();
                intentReceiverActivity.runOnUiThread(new md1(intentReceiverActivity, intent, i2));
                return;
            default:
                int i4 = IntentReceiverActivity.f1600a;
                intentReceiverActivity.getClass();
                ya0.h = true;
                rt3.e().d();
                intentReceiverActivity.startActivity(intent);
                intentReceiverActivity.overridePendingTransition(R.anim.none, R.anim.none);
                intentReceiverActivity.finish();
                return;
        }
    }
}
