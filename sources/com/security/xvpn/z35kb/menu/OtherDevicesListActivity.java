package com.security.xvpn.z35kb.menu;

import a.du;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.menu.OtherDevicesForPCActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesListActivity;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fl;
import defpackage.m20;
import defpackage.pd0;
import defpackage.t9;
import defpackage.v73;
import defpackage.y62;

/* loaded from: classes2.dex */
public final class OtherDevicesListActivity extends dn {
    public static final /* synthetic */ int l = 0;
    public final int k = 3841;

    @Override // defpackage.lt3
    public final String M() {
        return "OtherDevicesListActivity";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_other_devices_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        final int i = 1;
        toolbar.setShowBackBtn(true);
        toolbar.setTitle(pd0.y(R.string.OtherDeviceUse));
        addThemeInvalidateListener(toolbar);
        View findViewById = findViewById(R.id.toPCsPage);
        final int i2 = 0;
        findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: a42

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDevicesListActivity f22b;

            {
                this.f22b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                OtherDevicesListActivity otherDevicesListActivity = this.f22b;
                switch (i3) {
                    case 0:
                        int i4 = OtherDevicesListActivity.l;
                        ew3.g("9b2nzkn78g");
                        ya0.H(otherDevicesListActivity.c, OtherDevicesForPCActivity.class);
                        du.d(268, null);
                        return;
                    default:
                        int i5 = OtherDevicesListActivity.l;
                        if (ew3.o()) {
                            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), new c42(otherDevicesListActivity, 0));
                            return;
                        } else {
                            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), y62.H);
                            return;
                        }
                }
            }
        });
        ew3.z0(findViewById, v73.j(1000008), v73.j(1000009));
        findViewById.setBackground(v73.v(0.0f, 1000008, 3));
        bindInvalidate(findViewById);
        View findViewById2 = findViewById(R.id.openPasscodeLogin);
        ew3.z0(findViewById2, v73.j(1000008), v73.j(1000009));
        findViewById2.setBackground(v73.v(0.0f, 1000008, 3));
        bindInvalidate(findViewById2);
        findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: a42

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDevicesListActivity f22b;

            {
                this.f22b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                OtherDevicesListActivity otherDevicesListActivity = this.f22b;
                switch (i3) {
                    case 0:
                        int i4 = OtherDevicesListActivity.l;
                        ew3.g("9b2nzkn78g");
                        ya0.H(otherDevicesListActivity.c, OtherDevicesForPCActivity.class);
                        du.d(268, null);
                        return;
                    default:
                        int i5 = OtherDevicesListActivity.l;
                        if (ew3.o()) {
                            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), new c42(otherDevicesListActivity, 0));
                            return;
                        } else {
                            t9.w0(otherDevicesListActivity.getSupportFragmentManager(), y62.H);
                            return;
                        }
                }
            }
        });
        ((ImageView) findViewById(R.id.ivArrow1)).getDrawable().setAutoMirrored(true);
        ((ImageView) findViewById(R.id.ivArrow2)).getDrawable().setAutoMirrored(true);
        fl.n(this, (TextView) findViewById(R.id.tvForPc), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvForPcDetails), 1000014);
        fl.n(this, (TextView) findViewById(R.id.tvPasscodeLogin), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvPasscodeLoginDetails), 1000014);
        fl.g(this, findViewById(R.id.divider_1), 1000008);
        fl.g(this, findViewById(R.id.divider_2), 1000008);
        du.d(267, null);
        du.d(294, null);
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        String str;
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == this.k) {
            if (intent != null) {
                str = intent.getStringExtra("LoginFailed");
            } else {
                str = null;
            }
            if (m20.L("DeviceLimitReached", str)) {
                t9.w0(getSupportFragmentManager(), y62.I);
            }
        }
    }
}
