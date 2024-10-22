package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.a;
import androidx.fragment.app.l;

/* loaded from: classes.dex */
public final class m30 extends a {
    public final /* synthetic */ ComponentActivity h;

    public m30(l lVar) {
        this.h = lVar;
    }

    @Override // androidx.activity.result.a
    public final void b(int i, x6 x6Var, Object obj) {
        Bundle bundle;
        ComponentActivity componentActivity = this.h;
        ja1 b2 = x6Var.b(componentActivity, obj);
        int i2 = 0;
        if (b2 != null) {
            new Handler(Looper.getMainLooper()).post(new l30(this, i, b2, i2));
            return;
        }
        Intent a2 = x6Var.a(obj);
        if (a2.getExtras() != null && a2.getExtras().getClassLoader() == null) {
            a2.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a2.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a2.getAction())) {
            String[] stringArrayExtra = a2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            a6.a(componentActivity, stringArrayExtra, i);
            return;
        }
        if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a2.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a2.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = intentSenderRequest.f136a;
                Intent intent = intentSenderRequest.f137b;
                int i3 = intentSenderRequest.c;
                int i4 = intentSenderRequest.d;
                int i5 = a6.f29a;
                s5.c(componentActivity, intentSender, i, intent, i3, i4, 0, bundle);
                return;
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new l30(this, i, e, 1));
                return;
            }
        }
        int i6 = a6.f29a;
        s5.b(componentActivity, a2, i, bundle);
    }
}
