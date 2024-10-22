package com.security.xvpn.z35kb.purchase;

import a.du;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity;
import com.security.xvpn.z35kb.widget.BorderLinearLayout;
import defpackage.Cdo;
import defpackage.am0;
import defpackage.ao2;
import defpackage.bx3;
import defpackage.ew3;
import defpackage.fd;
import defpackage.fl;
import defpackage.hx2;
import defpackage.i23;
import defpackage.k6;
import defpackage.kj1;
import defpackage.m20;
import defpackage.n01;
import defpackage.n61;
import defpackage.o61;
import defpackage.pd0;
import defpackage.sm1;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.v73;
import defpackage.x31;
import defpackage.z73;
import defpackage.zb2;
import defpackage.zf3;
import defpackage.zg2;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class GuideToPurchaseNew2Activity extends zo implements Cdo {
    public static final /* synthetic */ int p = 0;
    public final fd l = new fd(this, 15);
    public final zb2[] m = ew3.F();
    public final ui1 n = m20.D0(kj1.f2953a, new tc0(this, 12));
    public int o;

    @Override // defpackage.Cdo
    public final void D(String str, String str2) {
        ew3.a();
        ew3.i0(str2, ew3.y(), str);
    }

    @Override // defpackage.lt3
    public final String M() {
        return "GuideToPurchaseActivity";
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        String str;
        du.d(319, null);
        du.d(637, null);
        if (tf3.l()) {
            m20.u0(Z().f2894b);
        }
        final int i = 0;
        Z().f2894b.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i2 = i;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i2) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i3 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i4 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i5 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i6 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z().c.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i2;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i3 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i4 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i5 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i6 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        TextView textView = Z().n;
        textView.setSelected(true);
        textView.setBackground(v73.t(9 * tf3.F, 0.0f, 1000120));
        fl.n(this, textView, 1000121);
        ConstraintLayout constraintLayout = Z().f;
        constraintLayout.setBackground(v73.q());
        constraintLayout.setSelected(true);
        final int i3 = 2;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i3;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i4 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i5 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i6 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        ConstraintLayout constraintLayout2 = Z().e;
        constraintLayout2.setBackground(v73.q());
        final int i4 = 3;
        constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i4;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i5 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i6 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        TextView textView2 = Z().w;
        fl.n(this, textView2, 1000013);
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.StartGuideSubTitle));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity$initViews$6$1$highLightStyle$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setTypeface(n01.c());
            }
        };
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity$initViews$6$1$highLightStyle2$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setTypeface(n01.c());
            }
        };
        bx3.i(valueOf, pd0.y(R.string.StartGuideSubTitleHighlight1), foregroundColorSpan);
        bx3.i(valueOf, pd0.y(R.string.StartGuideSubTitleHighlight2), foregroundColorSpan2);
        textView2.setText(valueOf);
        d0(Z().d, AppCompatTextView.class, new o61(this, i2));
        d0(Z().d, BorderLinearLayout.class, new o61(this, i3));
        final int i5 = 4;
        Z().v.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i5;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i52 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i6 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        final int i6 = 5;
        Z().t.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i6;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i52 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i62 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        Z().l.setPaintFlags(13);
        Z().m.setPaintFlags(13);
        final int i7 = 6;
        Z().l.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i7;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i52 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i62 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i72 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        final int i8 = 7;
        Z().m.setOnClickListener(new View.OnClickListener(this) { // from class: m61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseNew2Activity f3243b;

            {
                this.f3243b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2;
                int i22 = i8;
                GuideToPurchaseNew2Activity guideToPurchaseNew2Activity = this.f3243b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseNew2Activity.o == 1) {
                            ew3.b0(new d9(17));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseNew2Activity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseNew2Activity.p;
                        String y = ew3.y();
                        if (guideToPurchaseNew2Activity.Z().f.isSelected()) {
                            str2 = ew3.z().f5459a;
                        } else {
                            str2 = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str2);
                        o61 o61Var = new o61(guideToPurchaseNew2Activity, 0);
                        yc2.a();
                        o61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().e.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().y.getText());
                        return;
                    case 3:
                        int i52 = GuideToPurchaseNew2Activity.p;
                        view.setSelected(true);
                        guideToPurchaseNew2Activity.Z().f.setSelected(false);
                        guideToPurchaseNew2Activity.Z().u.setText(guideToPurchaseNew2Activity.Z().s.getText());
                        return;
                    case 4:
                        int i62 = GuideToPurchaseNew2Activity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseNew2Activity.c, true, bundle2);
                        return;
                    case 5:
                        int i72 = GuideToPurchaseNew2Activity.p;
                        d42 d42Var = d42.o;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i82 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseNew2Activity.p;
                        tf3.h0(guideToPurchaseNew2Activity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseNew2Activity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        TextView textView3 = Z().p;
        SpannableString valueOf2 = SpannableString.valueOf(pd0.y(R.string.GuideComparePremiumTitle));
        bx3.i(valueOf2, "6", new ForegroundColorSpan(-14292));
        bx3.i(valueOf2, pd0.y(R.string.Premium), new ForegroundColorSpan(-14292));
        textView3.setText(valueOf2);
        TextView textView4 = Z().o;
        SpannableString valueOf3 = SpannableString.valueOf(pd0.y(R.string.GuideCommentsTitle));
        bx3.i(valueOf3, pd0.y(R.string.GuideCommentsTitleHighlight), new ForegroundColorSpan(-14292));
        textView4.setText(valueOf3);
        Z().g.setClipToOutline(true);
        Z().g.setElevation(4 * tf3.F);
        if (m20.L(ew3.y(), "PurchaseFromGlobalGuideAbtestGroupC")) {
            m20.Y0(Z().o);
            m20.Y0(Z().k);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new n61(R.drawable.ic_comment_avatar1, "Jacob", "United States", pd0.y(R.string.GuideComment1)));
            arrayList.add(new n61(R.drawable.ic_comment_avatar2, "Oliver", "United Kingdom", pd0.y(R.string.GuideComment2)));
            Context z = zf3.z();
            if (z == null || (str = z.getString(R.string.GuideComment3)) == null) {
                str = "";
            }
            arrayList.add(new n61(R.drawable.ic_comment_avatar3, "Khalid", "UAE", str));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                n61 n61Var = (n61) it.next();
                LayoutInflater layoutInflater = getLayoutInflater();
                LinearLayout linearLayout = Z().h;
                View inflate = layoutInflater.inflate(R.layout.component_guide_comment, (ViewGroup) linearLayout, false);
                linearLayout.addView(inflate);
                int i9 = R.id.ivAvatar;
                ImageView imageView = (ImageView) m20.g0(inflate, R.id.ivAvatar);
                if (imageView != null) {
                    i9 = R.id.tvComment;
                    TextView textView5 = (TextView) m20.g0(inflate, R.id.tvComment);
                    if (textView5 != null) {
                        i9 = R.id.tvCountry;
                        TextView textView6 = (TextView) m20.g0(inflate, R.id.tvCountry);
                        if (textView6 != null) {
                            TextView textView7 = (TextView) m20.g0(inflate, R.id.tvName);
                            if (textView7 != null) {
                                CardView cardView = (CardView) inflate;
                                imageView.setImageResource(n61Var.f3401a);
                                textView7.setText(n61Var.f3402b);
                                textView6.setText(n61Var.c);
                                textView5.setText(n61Var.d);
                                fl.n(this, textView7, 1000013);
                                fl.n(this, textView6, 1000013);
                                fl.n(this, textView5, 1000014);
                                if (cardView != null) {
                                    cardView.setCardBackgroundColor(v73.j(1000156));
                                    this.i.a(new z73(12, 1000156, cardView));
                                }
                            } else {
                                i9 = R.id.tvName;
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i9)));
            }
            Z().h.addOnLayoutChangeListener(new ao2(this, i3));
        }
        TextView textView8 = Z().y;
        zb2[] zb2VarArr = this.m;
        zb2 zb2Var = zb2VarArr[0];
        if (zb2Var.c == 0) {
            textView8.setText(pd0.z(R.string.StartGuidePriceYearlyNF, hx2.p("$", zb2Var.e)));
        } else {
            SpannableString valueOf4 = SpannableString.valueOf(pd0.z(R.string.StartGuidePriceYearly, hx2.p("$", zb2Var.e)));
            bx3.i(valueOf4, pd0.y(R.string.StartGuideFreeTryHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity$initProduct$1$1$highLightStyle$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setTypeface(n01.c());
                }
            });
            textView8.setText(valueOf4);
        }
        Z().u.setText(textView8.getText());
        TextView textView9 = Z().s;
        zb2 zb2Var2 = zb2VarArr[1];
        if (zb2Var2.c == 0) {
            textView9.setText(pd0.z(R.string.StartGuidePriceMonthlyNF, hx2.p("$", zb2Var2.e)));
        } else {
            SpannableString valueOf5 = SpannableString.valueOf(pd0.z(R.string.StartGuidePriceMonthly, hx2.p("$", zb2Var2.e)));
            bx3.i(valueOf5, pd0.y(R.string.StartGuideFreeTryHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseNew2Activity$initProduct$2$1$highLightStyle$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setTypeface(n01.c());
                }
            });
            textView9.setText(valueOf5);
        }
        fl.h(this, Z().f2894b, 1000024);
        fl.n(this, Z().x, 1000098);
        fl.n(this, Z().r, 1000098);
        fl.n(this, Z().y, 1000098);
        fl.n(this, Z().s, 1000098);
        bindInvalidate(Z().f);
        bindInvalidate(Z().e);
        fl.n(this, Z().v, 1000122);
        fl.n(this, Z().t, 1000122);
        Z().c.setBackground(v73.t(24 * tf3.F, 0.0f, 1000120));
        fl.n(this, Z().c, 1000017);
        fl.n(this, Z().l, 1000013);
        fl.n(this, Z().m, 1000013);
        fl.n(this, Z().q, 1000013);
        fl.n(this, Z().p, 1000013);
        fl.n(this, Z().o, 1000013);
        fl.n(this, Z().u, 1000013);
        float f = 10;
        ((LinearLayout) Z().i.d).setBackground(new zg2(1000001, tf3.F * f));
        LinearLayout linearLayout2 = (LinearLayout) Z().i.e;
        float f2 = f * tf3.F;
        linearLayout2.setBackground(v73.s(1000153, f2, 0.0f, f2, 20));
        ((LinearLayout) Z().i.c).setBackground(v73.s(1000153, 0.0f, 0.0f, 0.0f, 30));
        float f3 = 1;
        ((LinearLayout) Z().i.c).setDividerDrawable(new am0(1000154, tf3.F * f3));
        ((LinearLayout) Z().i.e).setDividerDrawable(new am0(1000154, tf3.F * f3));
        ((LinearLayout) Z().i.d).setDividerDrawable(new am0(1000155, f3 * tf3.F));
        LinearLayout linearLayout3 = Z().g;
        float f4 = 30 * tf3.F;
        linearLayout3.setBackground(v73.s(1000156, f4, f4, 0.0f, 24));
        LinearLayout linearLayout4 = (LinearLayout) Z().i.c;
        int childCount = linearLayout4.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = linearLayout4.getChildAt(i10);
            if (childAt instanceof TextView) {
                fl.n(this, (TextView) childAt, 1000015);
            }
        }
        LinearLayout linearLayout5 = (LinearLayout) Z().i.e;
        int childCount2 = linearLayout5.getChildCount();
        while (i < childCount2) {
            View childAt2 = linearLayout5.getChildAt(i);
            if (childAt2 instanceof TextView) {
                fl.n(this, (TextView) childAt2, 1000014);
            }
            i++;
        }
        sm1 a2 = sm1.a(this);
        IntentFilter intentFilter = new IntentFilter("LoginSuccessAction");
        intentFilter.addAction("ExitAction");
        a2.b(this.l, intentFilter);
    }

    public final void b0() {
        super.finish();
        ew3.a();
    }

    @Override // defpackage.zo
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final k6 Z() {
        return (k6) this.n.getValue();
    }

    public final void d0(ViewGroup viewGroup, Class cls, x31 x31Var) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (m20.L(childAt.getClass(), cls)) {
                ((o61) x31Var).invoke(childAt);
            }
            if (childAt instanceof ViewGroup) {
                d0((ViewGroup) childAt, cls, x31Var);
            }
        }
    }

    @Override // defpackage.dn, defpackage.lt3, android.app.Activity
    public final void finish() {
        tf3.h0(this, MainActivity.class, null, 0, 6);
        ew3.a();
        ew3.e0();
        super.finish();
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        moveTaskToBack(true);
    }

    @Override // defpackage.zo, defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.o = getIntent().getIntExtra("PurchaseGuideType", 0);
        ew3.Q("show", ew3.y(), "");
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        sm1.a(this).d(this.l);
        super.onDestroy();
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (ew3.o()) {
            TextView textView = Z().v;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = Z().z;
            if (view != null) {
                view.setVisibility(8);
            }
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(Intent intent) {
        ComponentName component;
        String className;
        super.startActivity(intent);
        boolean z = false;
        if (intent != null && (component = intent.getComponent()) != null && (className = component.getClassName()) != null && i23.R0(className, "MainActivity", false)) {
            z = true;
        }
        if (z) {
            ew3.a();
            ew3.e0();
            super.finish();
        }
    }
}
