package com.security.xvpn.z35kb.browser;

import android.content.Intent;
import android.os.Bundle;
import defpackage.br;
import defpackage.ew3;
import defpackage.ic;
import defpackage.md1;

/* loaded from: classes2.dex */
public class IntentReceiverActivity extends ic {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1600a = 0;

    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(getIntent());
        br brVar = br.f513a;
        intent.setClass(this, PrivateBrowserActivity.class);
        intent.setFlags(268435456);
        intent.putExtra("com.security.xvpn.z35kb.browser.BrowserIntent", true);
        ew3.b0(new md1(this, intent, 0));
    }
}
