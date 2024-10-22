package com.security.xvpn.z35kb;

import a.bx;
import a.du;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import com.google.android.gms.ads.MobileAds;
import com.security.xvpn.z35kb.DebugPageActivity;
import com.security.xvpn.z35kb.ui.debug.DeviceInfoActivity;
import defpackage.f9;
import defpackage.ia0;
import defpackage.lt3;
import defpackage.m4;
import defpackage.ne0;

/* loaded from: classes2.dex */
public class DebugPageActivity extends lt3 {
    public static final /* synthetic */ int i = 0;
    public XTextViewNew h;

    @Override // defpackage.lt3
    public final String M() {
        return "DebugPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        ne0.f3446a = new ia0(this);
        LinearLayout linearLayout = new LinearLayout(this);
        final int i2 = 1;
        linearLayout.setFitsSystemWindows(true);
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(this);
        final int i3 = 0;
        linearLayout2.setOrientation(0);
        Button button = new Button(this);
        button.setText("back");
        final int i4 = 3;
        button.setOnClickListener(new f9(this, i4));
        linearLayout2.addView(button);
        bx bxVar = new bx();
        du.d(74, bxVar);
        int t = (int) bxVar.t();
        String[] strArr = new String[t];
        for (int i5 = 0; i5 < t; i5++) {
            strArr[i5] = bxVar.u();
        }
        bxVar.h();
        int i6 = 0;
        while (true) {
            final int i7 = 2;
            if (i6 < t) {
                String str = strArr[i6];
                Button button2 = new Button(this);
                button2.setText(str);
                button2.setAllCaps(false);
                button2.setOnClickListener(new m4(this, str, i7));
                linearLayout2.addView(button2);
                i6++;
            } else {
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(this);
                horizontalScrollView.addView(linearLayout2);
                linearLayout.addView(horizontalScrollView);
                Button button3 = new Button(this);
                button3.setText("Device Info");
                button3.setAllCaps(false);
                button3.setOnClickListener(new View.OnClickListener(this) { // from class: oe0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DebugPageActivity f3649b;

                    {
                        this.f3649b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i8 = i3;
                        DebugPageActivity debugPageActivity = this.f3649b;
                        switch (i8) {
                            case 0:
                                int i9 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                debugPageActivity.startActivity(new Intent(debugPageActivity, (Class<?>) DeviceInfoActivity.class));
                                return;
                            case 1:
                                int i10 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                m20.f1(debugPageActivity);
                                return;
                            case 2:
                                int i11 = DebugPageActivity.i;
                                MobileAds.openAdInspector(debugPageActivity.c, new uo((Object) debugPageActivity));
                                return;
                            default:
                                int i12 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                vy2 vy2Var = new vy2(true, debugPageActivity);
                                vy2Var.a();
                                vy2Var.b(new ut0(debugPageActivity, 12));
                                return;
                        }
                    }
                });
                linearLayout.addView(button3);
                Button button4 = new Button(this);
                button4.setText("Restart App");
                button4.setAllCaps(false);
                button4.setOnClickListener(new View.OnClickListener(this) { // from class: oe0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DebugPageActivity f3649b;

                    {
                        this.f3649b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i8 = i2;
                        DebugPageActivity debugPageActivity = this.f3649b;
                        switch (i8) {
                            case 0:
                                int i9 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                debugPageActivity.startActivity(new Intent(debugPageActivity, (Class<?>) DeviceInfoActivity.class));
                                return;
                            case 1:
                                int i10 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                m20.f1(debugPageActivity);
                                return;
                            case 2:
                                int i11 = DebugPageActivity.i;
                                MobileAds.openAdInspector(debugPageActivity.c, new uo((Object) debugPageActivity));
                                return;
                            default:
                                int i12 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                vy2 vy2Var = new vy2(true, debugPageActivity);
                                vy2Var.a();
                                vy2Var.b(new ut0(debugPageActivity, 12));
                                return;
                        }
                    }
                });
                linearLayout.addView(button4);
                Button button5 = new Button(this);
                button5.setText("Ad Inspector");
                button5.setAllCaps(false);
                button5.setOnClickListener(new View.OnClickListener(this) { // from class: oe0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DebugPageActivity f3649b;

                    {
                        this.f3649b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i8 = i7;
                        DebugPageActivity debugPageActivity = this.f3649b;
                        switch (i8) {
                            case 0:
                                int i9 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                debugPageActivity.startActivity(new Intent(debugPageActivity, (Class<?>) DeviceInfoActivity.class));
                                return;
                            case 1:
                                int i10 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                m20.f1(debugPageActivity);
                                return;
                            case 2:
                                int i11 = DebugPageActivity.i;
                                MobileAds.openAdInspector(debugPageActivity.c, new uo((Object) debugPageActivity));
                                return;
                            default:
                                int i12 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                vy2 vy2Var = new vy2(true, debugPageActivity);
                                vy2Var.a();
                                vy2Var.b(new ut0(debugPageActivity, 12));
                                return;
                        }
                    }
                });
                linearLayout.addView(button5);
                Button button6 = new Button(this);
                button6.setText("Show Splash Screen");
                button6.setAllCaps(false);
                button6.setOnClickListener(new View.OnClickListener(this) { // from class: oe0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ DebugPageActivity f3649b;

                    {
                        this.f3649b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i8 = i4;
                        DebugPageActivity debugPageActivity = this.f3649b;
                        switch (i8) {
                            case 0:
                                int i9 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                debugPageActivity.startActivity(new Intent(debugPageActivity, (Class<?>) DeviceInfoActivity.class));
                                return;
                            case 1:
                                int i10 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                m20.f1(debugPageActivity);
                                return;
                            case 2:
                                int i11 = DebugPageActivity.i;
                                MobileAds.openAdInspector(debugPageActivity.c, new uo((Object) debugPageActivity));
                                return;
                            default:
                                int i12 = DebugPageActivity.i;
                                debugPageActivity.getClass();
                                vy2 vy2Var = new vy2(true, debugPageActivity);
                                vy2Var.a();
                                vy2Var.b(new ut0(debugPageActivity, 12));
                                return;
                        }
                    }
                });
                linearLayout.addView(button6);
                bx bxVar2 = new bx();
                du.d(76, bxVar2);
                String u = bxVar2.u();
                bxVar2.h();
                XTextViewNew xTextViewNew = new XTextViewNew(this);
                this.h = xTextViewNew;
                xTextViewNew.setTextIsSelectable(true);
                this.h.setText(u);
                ScrollView scrollView = new ScrollView(this);
                scrollView.addView(this.h);
                linearLayout.addView(scrollView);
                setContentView(linearLayout);
                return;
            }
        }
    }

    @Override // defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        ne0.f3446a = null;
        this.h = null;
        super.onDestroy();
    }
}
