package defpackage;

import android.util.Log;
import com.facebook.ads.AudienceNetworkAds;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class k83 implements AudienceNetworkAds.InitListener {
    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        String str;
        if (initResult != null) {
            str = initResult.getMessage();
        } else {
            str = null;
        }
        Log.e("ThirdPartSDKInitHelper", "facebook onInitialized: " + str);
        boolean z = false;
        if (initResult != null && initResult.isSuccess()) {
            z = true;
        }
        if (z) {
            AtomicBoolean atomicBoolean = l83.f3083a;
            l83.d.set(true);
        }
    }
}
