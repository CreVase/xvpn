package com.security.xvpn.z35kb.menu;

import a.bx;
import a.du;
import android.content.IntentFilter;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.menu.OtherDevicesForPlayStationActivity;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.bp1;
import defpackage.bx3;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fd;
import defpackage.fl;
import defpackage.g43;
import defpackage.hx2;
import defpackage.ke1;
import defpackage.l41;
import defpackage.m20;
import defpackage.pd0;
import defpackage.tf3;
import defpackage.ut2;
import defpackage.v73;
import defpackage.x9;
import defpackage.y32;
import defpackage.ya0;
import defpackage.z32;

/* loaded from: classes2.dex */
public class OtherDevicesForPlayStationActivity extends dn implements ke1 {
    public static final /* synthetic */ int u = 0;
    public WebView k;
    public TextView l;
    public TextView m;
    public SwitchCompat n;
    public ImageView p;
    public ImageView q;
    public LinearLayout r;
    public TextView s;
    public boolean o = false;
    public final fd t = new fd(this, 12);

    @Override // defpackage.lt3
    public final String M() {
        return "OtherDevicesForPlayStationActivity";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_other_devices_for_play_station);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.ForGameConsoles));
        final int i = 1;
        toolbar.setShowBackBtn(true);
        addThemeInvalidateListener(toolbar);
        this.k = (WebView) findViewById(R.id.webview);
        this.l = (TextView) findViewById(R.id.tvAddress);
        this.m = (TextView) findViewById(R.id.tvPort);
        this.n = (SwitchCompat) findViewById(R.id.sw_http_proxy);
        this.p = (ImageView) findViewById(R.id.ivStep2);
        this.q = (ImageView) findViewById(R.id.ivStep5);
        this.r = (LinearLayout) findViewById(R.id.vServers);
        this.s = (TextView) findViewById(R.id.tvServersReminder);
        final int i2 = 0;
        if (ew3.X()) {
            bx i3 = hx2.i(493);
            boolean q = i3.q();
            i3.h();
            if (q) {
                this.n.setChecked(true);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                registerReceiver(this.t, intentFilter);
                this.o = true;
                g43 g43Var = new g43(this.n);
                g43.a(g43Var, new bp1(this, 5), new l41(this) { // from class: w32

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OtherDevicesForPlayStationActivity f4935b;

                    {
                        this.f4935b = this;
                    }

                    @Override // defpackage.l41
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = i2;
                        OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = this.f4935b;
                        switch (i4) {
                            case 0:
                                int i5 = OtherDevicesForPlayStationActivity.u;
                                m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                return null;
                            case 1:
                                int i6 = OtherDevicesForPlayStationActivity.u;
                                otherDevicesForPlayStationActivity.getClass();
                                t9.u0(otherDevicesForPlayStationActivity, new ut2(4));
                                return null;
                            default:
                                CompoundButton compoundButton = (CompoundButton) obj;
                                int i7 = OtherDevicesForPlayStationActivity.u;
                                otherDevicesForPlayStationActivity.getClass();
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                fd fdVar = otherDevicesForPlayStationActivity.t;
                                if (booleanValue) {
                                    if (!ew3.X()) {
                                        m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                        compoundButton.setChecked(false);
                                    } else {
                                        bx i8 = hx2.i(142);
                                        boolean q2 = i8.q();
                                        i8.h();
                                        if (q2) {
                                            t9.u0(otherDevicesForPlayStationActivity, new ut2(3));
                                        }
                                        IntentFilter intentFilter2 = new IntentFilter();
                                        intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                        otherDevicesForPlayStationActivity.registerReceiver(fdVar, intentFilter2);
                                        otherDevicesForPlayStationActivity.o = true;
                                        du.d(491, null);
                                        du.d(295, null);
                                    }
                                } else {
                                    if (otherDevicesForPlayStationActivity.o) {
                                        otherDevicesForPlayStationActivity.unregisterReceiver(fdVar);
                                        otherDevicesForPlayStationActivity.o = false;
                                    }
                                    du.d(492, null);
                                    du.d(296, null);
                                    otherDevicesForPlayStationActivity.Z(Boolean.TRUE);
                                    otherDevicesForPlayStationActivity.l.setText("-");
                                    otherDevicesForPlayStationActivity.m.setText("-");
                                }
                                return null;
                        }
                    }
                });
                final int i4 = 2;
                g43.a(g43Var, new ut2(i4), new l41(this) { // from class: w32

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OtherDevicesForPlayStationActivity f4935b;

                    {
                        this.f4935b = this;
                    }

                    @Override // defpackage.l41
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i;
                        OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = this.f4935b;
                        switch (i42) {
                            case 0:
                                int i5 = OtherDevicesForPlayStationActivity.u;
                                m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                return null;
                            case 1:
                                int i6 = OtherDevicesForPlayStationActivity.u;
                                otherDevicesForPlayStationActivity.getClass();
                                t9.u0(otherDevicesForPlayStationActivity, new ut2(4));
                                return null;
                            default:
                                CompoundButton compoundButton = (CompoundButton) obj;
                                int i7 = OtherDevicesForPlayStationActivity.u;
                                otherDevicesForPlayStationActivity.getClass();
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                fd fdVar = otherDevicesForPlayStationActivity.t;
                                if (booleanValue) {
                                    if (!ew3.X()) {
                                        m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                        compoundButton.setChecked(false);
                                    } else {
                                        bx i8 = hx2.i(142);
                                        boolean q2 = i8.q();
                                        i8.h();
                                        if (q2) {
                                            t9.u0(otherDevicesForPlayStationActivity, new ut2(3));
                                        }
                                        IntentFilter intentFilter2 = new IntentFilter();
                                        intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                        otherDevicesForPlayStationActivity.registerReceiver(fdVar, intentFilter2);
                                        otherDevicesForPlayStationActivity.o = true;
                                        du.d(491, null);
                                        du.d(295, null);
                                    }
                                } else {
                                    if (otherDevicesForPlayStationActivity.o) {
                                        otherDevicesForPlayStationActivity.unregisterReceiver(fdVar);
                                        otherDevicesForPlayStationActivity.o = false;
                                    }
                                    du.d(492, null);
                                    du.d(296, null);
                                    otherDevicesForPlayStationActivity.Z(Boolean.TRUE);
                                    otherDevicesForPlayStationActivity.l.setText("-");
                                    otherDevicesForPlayStationActivity.m.setText("-");
                                }
                                return null;
                        }
                    }
                });
                g43Var.d(new l41(this) { // from class: w32

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ OtherDevicesForPlayStationActivity f4935b;

                    {
                        this.f4935b = this;
                    }

                    @Override // defpackage.l41
                    public final Object invoke(Object obj, Object obj2) {
                        int i42 = i4;
                        OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = this.f4935b;
                        switch (i42) {
                            case 0:
                                int i5 = OtherDevicesForPlayStationActivity.u;
                                m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                return null;
                            case 1:
                                int i6 = OtherDevicesForPlayStationActivity.u;
                                otherDevicesForPlayStationActivity.getClass();
                                t9.u0(otherDevicesForPlayStationActivity, new ut2(4));
                                return null;
                            default:
                                CompoundButton compoundButton = (CompoundButton) obj;
                                int i7 = OtherDevicesForPlayStationActivity.u;
                                otherDevicesForPlayStationActivity.getClass();
                                boolean booleanValue = ((Boolean) obj2).booleanValue();
                                fd fdVar = otherDevicesForPlayStationActivity.t;
                                if (booleanValue) {
                                    if (!ew3.X()) {
                                        m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                        compoundButton.setChecked(false);
                                    } else {
                                        bx i8 = hx2.i(142);
                                        boolean q2 = i8.q();
                                        i8.h();
                                        if (q2) {
                                            t9.u0(otherDevicesForPlayStationActivity, new ut2(3));
                                        }
                                        IntentFilter intentFilter2 = new IntentFilter();
                                        intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                        otherDevicesForPlayStationActivity.registerReceiver(fdVar, intentFilter2);
                                        otherDevicesForPlayStationActivity.o = true;
                                        du.d(491, null);
                                        du.d(295, null);
                                    }
                                } else {
                                    if (otherDevicesForPlayStationActivity.o) {
                                        otherDevicesForPlayStationActivity.unregisterReceiver(fdVar);
                                        otherDevicesForPlayStationActivity.o = false;
                                    }
                                    du.d(492, null);
                                    du.d(296, null);
                                    otherDevicesForPlayStationActivity.Z(Boolean.TRUE);
                                    otherDevicesForPlayStationActivity.l.setText("-");
                                    otherDevicesForPlayStationActivity.m.setText("-");
                                }
                                return null;
                        }
                    }
                });
                fl.n(this, (TextView) findViewById(R.id.tvP1), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tvP2), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep1Desc), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep2Desc), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep3Desc), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep3DescP2), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep4Desc), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep5Desc), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep6DescP1), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep6DescP2), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep6DescP3), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStep6DescP4), 1000109);
                fl.n(this, (TextView) findViewById(R.id.tvStepsTitle), 1000110);
                fl.n(this, (TextView) findViewById(R.id.tvStep1), 1000110);
                fl.n(this, (TextView) findViewById(R.id.tvStep2), 1000110);
                fl.n(this, (TextView) findViewById(R.id.tvStep3), 1000110);
                fl.n(this, (TextView) findViewById(R.id.tvStep4), 1000110);
                fl.n(this, (TextView) findViewById(R.id.tvStep5), 1000110);
                fl.n(this, (TextView) findViewById(R.id.tvStep6), 1000110);
                fl.g(this, findViewById(R.id.clHighlightContent), 1000008);
                fl.g(this, findViewById(R.id.middle_divider), 1000010);
                fl.n(this, (TextView) findViewById(R.id.tv_switch_text), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tv_proxy_desc), 1000108);
                fl.n(this, (TextView) findViewById(R.id.tvServersReminder), 1000108);
                fl.n(this, (TextView) findViewById(R.id.view1), 1000015);
                fl.n(this, (TextView) findViewById(R.id.view2), 1000015);
                this.n.setThumbDrawable(v73.w());
                this.n.setTrackDrawable(v73.x());
                bindInvalidate(this.n);
                fl.k(this, this);
                TextView textView = (TextView) findViewById(R.id.tvStep4Desc);
                SpannableString spannableString = new SpannableString("Set the same Wi-Fi connection on your game console.");
                bx3.i(spannableString, "same Wi-Fi connection", new z32(this, 0));
                textView.setText(spannableString);
                TextView textView2 = (TextView) findViewById(R.id.tvStep5Desc);
                SpannableString spannableString2 = new SpannableString("Select options: for Proxy Server, select Use.");
                bx3.i(spannableString2, "for Proxy Server, select Use.", new z32(this, 0));
                textView2.setText(spannableString2);
                TextView textView3 = (TextView) findViewById(R.id.tvStep6DescP1);
                SpannableString spannableString3 = new SpannableString("Enter the provided Address & Port Number in Proxy Server and set up the connection.");
                bx3.i(spannableString3, "provided Address & Port Number", new z32(this, 0));
                textView3.setText(spannableString3);
                findViewById(R.id.vStep6Configure).setBackground(new y32(i2));
                fl.n(this, this.l, 1000107);
                fl.n(this, this.m, 1000107);
                fl.n(this, (TextView) findViewById(R.id.textAddress), 1000107);
                fl.n(this, (TextView) findViewById(R.id.textPort), 1000107);
                fl.n(this, (TextView) findViewById(R.id.tvStep6Configure), 1000108);
                TextView textView4 = (TextView) findViewById(R.id.tvStep6Note);
                SpannableString spannableString4 = new SpannableString("*NOTE: When you don't need to use VPN connection on your game console, just simply turn off \"Allow VPN connection\" and set your network options back to normal.");
                spannableString4.setSpan(new z32(this, 1), 0, 6, 0);
                textView4.setText(spannableString4);
                fl.n(this, textView4, 1000108);
                textView4.setBackground(new y32(i));
                TextView textView5 = (TextView) findViewById(R.id.tvStep6DescP4);
                SpannableString spannableString5 = new SpannableString("You may check details on X-VPN official website or contact support.");
                bx3.i(spannableString5, "contact support", new x9(this, 3));
                textView5.setText(spannableString5);
                textView5.setMovementMethod(LinkMovementMethod.getInstance());
            }
        }
        this.n.setChecked(false);
        Z(Boolean.TRUE);
        this.l.setText("-");
        this.m.setText("-");
        g43 g43Var2 = new g43(this.n);
        g43.a(g43Var2, new bp1(this, 5), new l41(this) { // from class: w32

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDevicesForPlayStationActivity f4935b;

            {
                this.f4935b = this;
            }

            @Override // defpackage.l41
            public final Object invoke(Object obj, Object obj2) {
                int i42 = i2;
                OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = this.f4935b;
                switch (i42) {
                    case 0:
                        int i5 = OtherDevicesForPlayStationActivity.u;
                        m20.C0(otherDevicesForPlayStationActivity.c, 8);
                        return null;
                    case 1:
                        int i6 = OtherDevicesForPlayStationActivity.u;
                        otherDevicesForPlayStationActivity.getClass();
                        t9.u0(otherDevicesForPlayStationActivity, new ut2(4));
                        return null;
                    default:
                        CompoundButton compoundButton = (CompoundButton) obj;
                        int i7 = OtherDevicesForPlayStationActivity.u;
                        otherDevicesForPlayStationActivity.getClass();
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        fd fdVar = otherDevicesForPlayStationActivity.t;
                        if (booleanValue) {
                            if (!ew3.X()) {
                                m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                compoundButton.setChecked(false);
                            } else {
                                bx i8 = hx2.i(142);
                                boolean q2 = i8.q();
                                i8.h();
                                if (q2) {
                                    t9.u0(otherDevicesForPlayStationActivity, new ut2(3));
                                }
                                IntentFilter intentFilter2 = new IntentFilter();
                                intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                otherDevicesForPlayStationActivity.registerReceiver(fdVar, intentFilter2);
                                otherDevicesForPlayStationActivity.o = true;
                                du.d(491, null);
                                du.d(295, null);
                            }
                        } else {
                            if (otherDevicesForPlayStationActivity.o) {
                                otherDevicesForPlayStationActivity.unregisterReceiver(fdVar);
                                otherDevicesForPlayStationActivity.o = false;
                            }
                            du.d(492, null);
                            du.d(296, null);
                            otherDevicesForPlayStationActivity.Z(Boolean.TRUE);
                            otherDevicesForPlayStationActivity.l.setText("-");
                            otherDevicesForPlayStationActivity.m.setText("-");
                        }
                        return null;
                }
            }
        });
        final int i42 = 2;
        g43.a(g43Var2, new ut2(i42), new l41(this) { // from class: w32

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDevicesForPlayStationActivity f4935b;

            {
                this.f4935b = this;
            }

            @Override // defpackage.l41
            public final Object invoke(Object obj, Object obj2) {
                int i422 = i;
                OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = this.f4935b;
                switch (i422) {
                    case 0:
                        int i5 = OtherDevicesForPlayStationActivity.u;
                        m20.C0(otherDevicesForPlayStationActivity.c, 8);
                        return null;
                    case 1:
                        int i6 = OtherDevicesForPlayStationActivity.u;
                        otherDevicesForPlayStationActivity.getClass();
                        t9.u0(otherDevicesForPlayStationActivity, new ut2(4));
                        return null;
                    default:
                        CompoundButton compoundButton = (CompoundButton) obj;
                        int i7 = OtherDevicesForPlayStationActivity.u;
                        otherDevicesForPlayStationActivity.getClass();
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        fd fdVar = otherDevicesForPlayStationActivity.t;
                        if (booleanValue) {
                            if (!ew3.X()) {
                                m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                compoundButton.setChecked(false);
                            } else {
                                bx i8 = hx2.i(142);
                                boolean q2 = i8.q();
                                i8.h();
                                if (q2) {
                                    t9.u0(otherDevicesForPlayStationActivity, new ut2(3));
                                }
                                IntentFilter intentFilter2 = new IntentFilter();
                                intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                otherDevicesForPlayStationActivity.registerReceiver(fdVar, intentFilter2);
                                otherDevicesForPlayStationActivity.o = true;
                                du.d(491, null);
                                du.d(295, null);
                            }
                        } else {
                            if (otherDevicesForPlayStationActivity.o) {
                                otherDevicesForPlayStationActivity.unregisterReceiver(fdVar);
                                otherDevicesForPlayStationActivity.o = false;
                            }
                            du.d(492, null);
                            du.d(296, null);
                            otherDevicesForPlayStationActivity.Z(Boolean.TRUE);
                            otherDevicesForPlayStationActivity.l.setText("-");
                            otherDevicesForPlayStationActivity.m.setText("-");
                        }
                        return null;
                }
            }
        });
        g43Var2.d(new l41(this) { // from class: w32

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ OtherDevicesForPlayStationActivity f4935b;

            {
                this.f4935b = this;
            }

            @Override // defpackage.l41
            public final Object invoke(Object obj, Object obj2) {
                int i422 = i42;
                OtherDevicesForPlayStationActivity otherDevicesForPlayStationActivity = this.f4935b;
                switch (i422) {
                    case 0:
                        int i5 = OtherDevicesForPlayStationActivity.u;
                        m20.C0(otherDevicesForPlayStationActivity.c, 8);
                        return null;
                    case 1:
                        int i6 = OtherDevicesForPlayStationActivity.u;
                        otherDevicesForPlayStationActivity.getClass();
                        t9.u0(otherDevicesForPlayStationActivity, new ut2(4));
                        return null;
                    default:
                        CompoundButton compoundButton = (CompoundButton) obj;
                        int i7 = OtherDevicesForPlayStationActivity.u;
                        otherDevicesForPlayStationActivity.getClass();
                        boolean booleanValue = ((Boolean) obj2).booleanValue();
                        fd fdVar = otherDevicesForPlayStationActivity.t;
                        if (booleanValue) {
                            if (!ew3.X()) {
                                m20.C0(otherDevicesForPlayStationActivity.c, 8);
                                compoundButton.setChecked(false);
                            } else {
                                bx i8 = hx2.i(142);
                                boolean q2 = i8.q();
                                i8.h();
                                if (q2) {
                                    t9.u0(otherDevicesForPlayStationActivity, new ut2(3));
                                }
                                IntentFilter intentFilter2 = new IntentFilter();
                                intentFilter2.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                                otherDevicesForPlayStationActivity.registerReceiver(fdVar, intentFilter2);
                                otherDevicesForPlayStationActivity.o = true;
                                du.d(491, null);
                                du.d(295, null);
                            }
                        } else {
                            if (otherDevicesForPlayStationActivity.o) {
                                otherDevicesForPlayStationActivity.unregisterReceiver(fdVar);
                                otherDevicesForPlayStationActivity.o = false;
                            }
                            du.d(492, null);
                            du.d(296, null);
                            otherDevicesForPlayStationActivity.Z(Boolean.TRUE);
                            otherDevicesForPlayStationActivity.l.setText("-");
                            otherDevicesForPlayStationActivity.m.setText("-");
                        }
                        return null;
                }
            }
        });
        fl.n(this, (TextView) findViewById(R.id.tvP1), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvP2), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep1Desc), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep2Desc), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep3Desc), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep3DescP2), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep4Desc), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep5Desc), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep6DescP1), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep6DescP2), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep6DescP3), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStep6DescP4), 1000109);
        fl.n(this, (TextView) findViewById(R.id.tvStepsTitle), 1000110);
        fl.n(this, (TextView) findViewById(R.id.tvStep1), 1000110);
        fl.n(this, (TextView) findViewById(R.id.tvStep2), 1000110);
        fl.n(this, (TextView) findViewById(R.id.tvStep3), 1000110);
        fl.n(this, (TextView) findViewById(R.id.tvStep4), 1000110);
        fl.n(this, (TextView) findViewById(R.id.tvStep5), 1000110);
        fl.n(this, (TextView) findViewById(R.id.tvStep6), 1000110);
        fl.g(this, findViewById(R.id.clHighlightContent), 1000008);
        fl.g(this, findViewById(R.id.middle_divider), 1000010);
        fl.n(this, (TextView) findViewById(R.id.tv_switch_text), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tv_proxy_desc), 1000108);
        fl.n(this, (TextView) findViewById(R.id.tvServersReminder), 1000108);
        fl.n(this, (TextView) findViewById(R.id.view1), 1000015);
        fl.n(this, (TextView) findViewById(R.id.view2), 1000015);
        this.n.setThumbDrawable(v73.w());
        this.n.setTrackDrawable(v73.x());
        bindInvalidate(this.n);
        fl.k(this, this);
        TextView textView6 = (TextView) findViewById(R.id.tvStep4Desc);
        SpannableString spannableString6 = new SpannableString("Set the same Wi-Fi connection on your game console.");
        bx3.i(spannableString6, "same Wi-Fi connection", new z32(this, 0));
        textView6.setText(spannableString6);
        TextView textView22 = (TextView) findViewById(R.id.tvStep5Desc);
        SpannableString spannableString22 = new SpannableString("Select options: for Proxy Server, select Use.");
        bx3.i(spannableString22, "for Proxy Server, select Use.", new z32(this, 0));
        textView22.setText(spannableString22);
        TextView textView32 = (TextView) findViewById(R.id.tvStep6DescP1);
        SpannableString spannableString32 = new SpannableString("Enter the provided Address & Port Number in Proxy Server and set up the connection.");
        bx3.i(spannableString32, "provided Address & Port Number", new z32(this, 0));
        textView32.setText(spannableString32);
        findViewById(R.id.vStep6Configure).setBackground(new y32(i2));
        fl.n(this, this.l, 1000107);
        fl.n(this, this.m, 1000107);
        fl.n(this, (TextView) findViewById(R.id.textAddress), 1000107);
        fl.n(this, (TextView) findViewById(R.id.textPort), 1000107);
        fl.n(this, (TextView) findViewById(R.id.tvStep6Configure), 1000108);
        TextView textView42 = (TextView) findViewById(R.id.tvStep6Note);
        SpannableString spannableString42 = new SpannableString("*NOTE: When you don't need to use VPN connection on your game console, just simply turn off \"Allow VPN connection\" and set your network options back to normal.");
        spannableString42.setSpan(new z32(this, 1), 0, 6, 0);
        textView42.setText(spannableString42);
        fl.n(this, textView42, 1000108);
        textView42.setBackground(new y32(i));
        TextView textView52 = (TextView) findViewById(R.id.tvStep6DescP4);
        SpannableString spannableString52 = new SpannableString("You may check details on X-VPN official website or contact support.");
        bx3.i(spannableString52, "contact support", new x9(this, 3));
        textView52.setText(spannableString52);
        textView52.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000111;
    }

    public final void Z(Boolean bool) {
        String U;
        boolean z;
        String str = "-";
        if (bool.booleanValue()) {
            U = "-";
        } else {
            U = ya0.U();
        }
        String[] split = U.split("\n");
        if (!bool.booleanValue()) {
            bx i = hx2.i(490);
            str = i.u();
            i.h();
        }
        this.r.removeAllViews();
        int i2 = 0;
        int i3 = 0;
        for (String str2 : split) {
            if (!str2.isEmpty()) {
                i3++;
            }
        }
        for (int i4 = 0; i4 < split.length; i4++) {
            String str3 = split[i4];
            if (!str3.isEmpty()) {
                TextView textView = new TextView(this);
                textView.setTextSize(24.0f);
                fl.n(this, textView, 1000013);
                textView.setText(str3);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
                layoutParams.weight = 1.5f;
                TextView textView2 = new TextView(this);
                textView2.setTextSize(24.0f);
                textView2.setText(str);
                fl.n(this, textView2, 1000013);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
                layoutParams2.weight = 1.0f;
                LinearLayout linearLayout = new LinearLayout(this);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setLayoutDirection(0);
                int D = tf3.D(20);
                int D2 = tf3.D(10);
                linearLayout.setPadding(D, D2, D, D2);
                linearLayout.setGravity(16);
                linearLayout.addView(textView, layoutParams);
                linearLayout.addView(textView2, layoutParams2);
                if (i4 != 0) {
                    ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).topMargin = tf3.D(10);
                }
                if (i3 > 1) {
                    fl.g(this, linearLayout, 1000111);
                }
                this.r.addView(linearLayout);
            }
        }
        TextView textView3 = this.s;
        if (i3 > 1) {
            z = true;
        } else {
            z = false;
        }
        m20.g1(textView3, z);
        if (i3 <= 1) {
            i2 = tf3.D(15);
        }
        LinearLayout linearLayout2 = this.r;
        linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.r.getPaddingTop(), this.r.getPaddingRight(), i2);
    }

    @Override // defpackage.ke1
    public final void a() {
        this.p.setImageResource(R.drawable.img_http_proxy_step2);
        this.q.setImageResource(R.drawable.img_http_proxy_step5);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.o) {
            unregisterReceiver(this.t);
            this.o = false;
        }
    }
}
