package com.security.xvpn.z35kb.menu;

import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.dn;
import defpackage.fl;
import defpackage.pd0;

/* loaded from: classes2.dex */
public class OtherDevicesForPCActivity extends dn {
    @Override // defpackage.lt3
    public final String M() {
        return "OtherDevicesForPCActivity";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_other_devices_for_pc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.ForAllDevices));
        toolbar.setShowBackBtn(true);
        addThemeInvalidateListener(toolbar);
        fl.n(this, (TextView) findViewById(R.id.text1), 1000014);
        fl.n(this, (TextView) findViewById(R.id.text2), 1000014);
        fl.n(this, (TextView) findViewById(R.id.text3), 1000014);
        fl.n(this, (TextView) findViewById(R.id.text4), 1000014);
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000005;
    }
}
