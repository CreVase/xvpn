package com.security.xvpn.z35kb.ui.debug;

import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.RouteInfo;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import b.ContentWrapper;
import com.security.xvpn.z35kb.ui.debug.DeviceInfoActivity;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import defpackage.dn;
import defpackage.eu3;
import defpackage.fl;
import defpackage.gu3;
import defpackage.hx2;
import defpackage.p71;
import defpackage.rr0;
import defpackage.tf3;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class DeviceInfoActivity extends dn {
    public static final /* synthetic */ int l = 0;
    public AppCompatTextView k;

    @Override // defpackage.lt3
    public final String M() {
        return "DeviceInfoPage";
    }

    public final void Z() {
        if (this.k == null) {
            return;
        }
        StringBuilder n = p71.n("Device info:\nBrand:");
        n.append(Build.BOARD);
        n.append("\nModel:");
        n.append(Build.MODEL);
        n.append("\nSDK version:");
        n.append(Build.VERSION.SDK_INT);
        n.append("\ninstall from:");
        n.append(getPackageManager().getInstallerPackageName(getPackageName()));
        n.append("\n\nNetwork info:\n");
        ArrayList arrayList = new ArrayList();
        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService("connectivity");
        for (Network network : connectivityManager.getAllNetworks()) {
            LinkProperties linkProperties = connectivityManager.getLinkProperties(network);
            if (linkProperties != null) {
                for (RouteInfo routeInfo : linkProperties.getRoutes()) {
                    if (routeInfo.isDefaultRoute() && routeInfo.getGateway() != null && routeInfo.getGateway().getAddress() != null) {
                        arrayList.add(routeInfo);
                    }
                }
                n.append(linkProperties.getInterfaceName());
                n.append("  :  ");
                n.append(linkProperties.getLinkAddresses().get(0).getPrefixLength());
                n.append("  :  ");
                n.append(linkProperties.getLinkAddresses().get(0).getFlags());
                n.append("  :  ");
                n.append(linkProperties.getDomains());
                n.append("\n");
                Iterator<T> it = linkProperties.getLinkAddresses().iterator();
                while (it.hasNext()) {
                    n.append(((LinkAddress) it.next()).toString());
                    n.append("\n");
                }
            }
        }
        n.append("\n\n");
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            n.append(((RouteInfo) it2.next()).toString());
            n.append("\n");
        }
        AppCompatTextView appCompatTextView = this.k;
        if (appCompatTextView != null) {
            appCompatTextView.setText(n);
        }
    }

    @Override // defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ContentWrapper contentWrapper = new ContentWrapper(this, null, 6);
        contentWrapper.setId(-1);
        final int i = 0;
        eu3 eu3Var = new eu3(contentWrapper.getContext(), null, 6, 0);
        final int i2 = 1;
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        contentWrapper.a(new rr0(eu3Var, 2));
        eu3 h = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        AppCompatButton appCompatButton = new AppCompatButton(h.getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        appCompatButton.setText(MRAIDPresenter.CLOSE);
        appCompatButton.setOnClickListener(new View.OnClickListener(this) { // from class: uk0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceInfoActivity f4688b;

            {
                this.f4688b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                DeviceInfoActivity deviceInfoActivity = this.f4688b;
                switch (i3) {
                    case 0:
                        int i4 = DeviceInfoActivity.l;
                        deviceInfoActivity.onBackPressed();
                        return;
                    default:
                        int i5 = DeviceInfoActivity.l;
                        deviceInfoActivity.Z();
                        return;
                }
            }
        });
        h.addView(appCompatButton);
        AppCompatButton appCompatButton2 = new AppCompatButton(h.getContext(), null);
        appCompatButton2.setId(-1);
        appCompatButton2.setText("");
        tf3.A0(appCompatButton2);
        appCompatButton2.setText("refresh");
        appCompatButton2.setOnClickListener(new View.OnClickListener(this) { // from class: uk0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ DeviceInfoActivity f4688b;

            {
                this.f4688b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                DeviceInfoActivity deviceInfoActivity = this.f4688b;
                switch (i3) {
                    case 0:
                        int i4 = DeviceInfoActivity.l;
                        deviceInfoActivity.onBackPressed();
                        return;
                    default:
                        int i5 = DeviceInfoActivity.l;
                        deviceInfoActivity.Z();
                        return;
                }
            }
        });
        h.addView(appCompatButton2);
        if (h.getAttachToParent()) {
            eu3Var.addView(h);
        }
        gu3 gu3Var = new gu3(eu3Var.getContext());
        AppCompatTextView appCompatTextView = new AppCompatTextView(gu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        fl.n(this, appCompatTextView, 1000013);
        gu3Var.addView(appCompatTextView);
        this.k = appCompatTextView;
        if (gu3Var.getAttachToParent()) {
            eu3Var.addView(gu3Var);
        }
        if (eu3Var.getAttachToParent()) {
            contentWrapper.addView(eu3Var);
        }
        setContentView(contentWrapper);
        Z();
    }
}
