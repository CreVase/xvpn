package com.security.xvpn.z35kb.browser;

import android.os.Bundle;
import defpackage.br;
import defpackage.ic;
import defpackage.ya0;

/* loaded from: classes2.dex */
public class BrowserBridgeActivity extends ic {
    @Override // androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() != null) {
            br brVar = br.f513a;
            ya0.H(this, PrivateBrowserActivity.class);
            finish();
        }
    }
}
