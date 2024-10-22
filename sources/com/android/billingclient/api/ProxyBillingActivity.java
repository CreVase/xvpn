package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.internal.play_billing.zzb;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public ResultReceiver f681a;

    /* renamed from: b, reason: collision with root package name */
    public ResultReceiver f682b;
    public boolean c;
    public boolean d;

    public final Intent a() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        int i;
        super.onCreate(bundle);
        if (bundle == null) {
            zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow");
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
                if (getIntent().hasExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT") && getIntent().getBooleanExtra("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false)) {
                    this.d = true;
                    i = 110;
                }
                i = 100;
            } else {
                if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                    this.f681a = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
                } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                    pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                    this.f682b = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                    i = 101;
                } else {
                    pendingIntent = null;
                }
                i = 100;
            }
            try {
                this.c = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
                return;
            } catch (IntentSender.SendIntentException e) {
                zzb.zzk("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.f681a;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.f682b;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent a2 = a();
                        if (this.d) {
                            a2.putExtra("IS_FIRST_PARTY_PURCHASE", true);
                        }
                        a2.putExtra("RESPONSE_CODE", 6);
                        a2.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(a2);
                    }
                }
                this.c = false;
                finish();
                return;
            }
        }
        zzb.zzi("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
        this.c = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
        if (bundle.containsKey("result_receiver")) {
            this.f681a = (ResultReceiver) bundle.getParcelable("result_receiver");
        } else if (bundle.containsKey("in_app_message_result_receiver")) {
            this.f682b = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
        }
        this.d = bundle.getBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", false);
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (!isFinishing() || !this.c) {
            return;
        }
        Intent a2 = a();
        a2.putExtra("RESPONSE_CODE", 1);
        a2.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
        sendBroadcast(a2);
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.f681a;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.f682b;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.c);
        bundle.putBoolean("IS_FLOW_FROM_FIRST_PARTY_CLIENT", this.d);
    }
}
