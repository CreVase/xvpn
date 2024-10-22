package defpackage;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.p;

/* loaded from: classes.dex */
public final class x11 extends x6 {
    @Override // defpackage.x6
    public final Intent a(Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.f137b;
        if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f136a, null, intentSenderRequest.c, intentSenderRequest.d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (p.I(2)) {
            intent.toString();
        }
        return intent;
    }

    @Override // defpackage.x6
    public final Object c(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
