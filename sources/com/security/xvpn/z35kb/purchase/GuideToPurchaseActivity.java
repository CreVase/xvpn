package com.security.xvpn.z35kb.purchase;

import a.du;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.ContentWrapper;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity;
import com.security.xvpn.z35kb.widget.BorderLinearLayout;
import defpackage.Cdo;
import defpackage.bx3;
import defpackage.ew3;
import defpackage.fd;
import defpackage.fl;
import defpackage.g53;
import defpackage.hx2;
import defpackage.i23;
import defpackage.i6;
import defpackage.j61;
import defpackage.kj1;
import defpackage.m20;
import defpackage.n01;
import defpackage.pd0;
import defpackage.sm1;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.v73;
import defpackage.x31;
import defpackage.zb2;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class GuideToPurchaseActivity extends zo implements Cdo {
    public static final /* synthetic */ int p = 0;
    public final fd l = new fd(this, 13);
    public final zb2[] m = ew3.F();
    public final ui1 n = m20.D0(kj1.f2953a, new tc0(this, 10));
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
        du.d(319, null);
        du.d(637, null);
        if (tf3.l()) {
            m20.u0(Z().f2542b);
        }
        final int i = 0;
        Z().f2542b.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i2 = i;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i2) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i3 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i4 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i5 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i6 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        final int i2 = 1;
        Z().c.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i2;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i3 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i4 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i5 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i6 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        TextView textView = Z().m;
        textView.setSelected(true);
        textView.setBackground(v73.t(9 * tf3.F, 0.0f, 1000118));
        fl.n(this, textView, 1000121);
        ConstraintLayout constraintLayout = Z().h;
        constraintLayout.setBackground(v73.o());
        constraintLayout.setSelected(true);
        final int i3 = 2;
        constraintLayout.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i3;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i4 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i5 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i6 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        ConstraintLayout constraintLayout2 = Z().g;
        constraintLayout2.setBackground(v73.o());
        final int i4 = 3;
        constraintLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i4;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i5 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i6 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        fl.n(this, Z().t, 1000013);
        TextView textView2 = Z().s;
        fl.n(this, textView2, 1000013);
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.StartGuideSubTitle));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity$initViews$6$1$highLightStyle$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setTypeface(n01.c());
            }
        };
        ForegroundColorSpan foregroundColorSpan2 = new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity$initViews$6$1$highLightStyle2$1
            @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
            public final void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setTypeface(n01.c());
            }
        };
        bx3.i(valueOf, pd0.y(R.string.StartGuideSubTitleHighlight1), foregroundColorSpan);
        bx3.i(valueOf, pd0.y(R.string.StartGuideSubTitleHighlight2), foregroundColorSpan2);
        textView2.setText(valueOf);
        d0(Z().f, AppCompatTextView.class, new j61(this, i3));
        d0(Z().f, BorderLinearLayout.class, new j61(this, i4));
        final int i5 = 4;
        Z().r.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i5;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i52 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i6 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        final int i6 = 5;
        Z().q.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i6;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i52 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i62 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i7 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        Z().k.setPaintFlags(13);
        Z().l.setPaintFlags(13);
        final int i7 = 6;
        Z().k.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i7;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i52 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i62 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i72 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i8 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        final int i8 = 7;
        Z().l.setOnClickListener(new View.OnClickListener(this) { // from class: i61

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ GuideToPurchaseActivity f2544b;

            {
                this.f2544b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                int i22 = i8;
                GuideToPurchaseActivity guideToPurchaseActivity = this.f2544b;
                switch (i22) {
                    case 0:
                        if (guideToPurchaseActivity.o == 1) {
                            ew3.b0(new d9(15));
                        } else {
                            ew3.a();
                            du.d(279, null);
                            ew3.e0();
                            du.d(647, null);
                        }
                        guideToPurchaseActivity.finish();
                        return;
                    case 1:
                        int i32 = GuideToPurchaseActivity.p;
                        String y = ew3.y();
                        if (guideToPurchaseActivity.Z().h.isSelected()) {
                            str = ew3.z().f5459a;
                        } else {
                            str = ew3.F()[1].f5459a;
                        }
                        ew3.Q("click", y, str);
                        j61 j61Var = new j61(guideToPurchaseActivity, 1);
                        yc2.a();
                        j61Var.invoke(GoogleIABHelper.g);
                        du.d(638, null);
                        return;
                    case 2:
                        int i42 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().g.setSelected(false);
                        return;
                    case 3:
                        int i52 = GuideToPurchaseActivity.p;
                        view.setSelected(true);
                        guideToPurchaseActivity.Z().h.setSelected(false);
                        return;
                    case 4:
                        int i62 = GuideToPurchaseActivity.p;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("isFromGuide", true);
                        bx3.G(guideToPurchaseActivity.c, true, bundle2);
                        return;
                    case 5:
                        int i72 = GuideToPurchaseActivity.p;
                        d42 d42Var = d42.m;
                        yc2.a();
                        d42Var.invoke(GoogleIABHelper.g);
                        return;
                    case 6:
                        int i82 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.f() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                    default:
                        int i9 = GuideToPurchaseActivity.p;
                        tf3.h0(guideToPurchaseActivity, WebViewActivity.class, tf3.r(new n42("intentTargetUrl", tf3.g() + "&dark=" + v73.l()), new n42("intentTitle", guideToPurchaseActivity.getTitle())), 0, 4);
                        return;
                }
            }
        });
        j61 j61Var = new j61(this, i);
        ContentWrapper contentWrapper = this.k;
        if (contentWrapper != null) {
            contentWrapper.f372a.add(j61Var);
            j61Var.invoke(contentWrapper.f373b);
        }
        Z().i.post(new g53(this, 4));
        TextView textView3 = Z().v;
        zb2[] zb2VarArr = this.m;
        zb2 zb2Var = zb2VarArr[0];
        if (zb2Var.c == 0) {
            textView3.setText(pd0.z(R.string.StartGuidePriceYearlyNF, hx2.p("$", zb2Var.e)));
        } else {
            SpannableString valueOf2 = SpannableString.valueOf(pd0.z(R.string.StartGuidePriceYearly, hx2.p("$", zb2Var.e)));
            bx3.i(valueOf2, pd0.y(R.string.StartGuideFreeTryHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity$initProduct$1$1$highLightStyle$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setTypeface(n01.c());
                }
            });
            textView3.setText(valueOf2);
        }
        TextView textView4 = Z().p;
        zb2 zb2Var2 = zb2VarArr[1];
        if (zb2Var2.c == 0) {
            textView4.setText(pd0.z(R.string.StartGuidePriceMonthlyNF, hx2.p("$", zb2Var2.e)));
        } else {
            SpannableString valueOf3 = SpannableString.valueOf(pd0.z(R.string.StartGuidePriceMonthly, hx2.p("$", zb2Var2.e)));
            bx3.i(valueOf3, pd0.y(R.string.StartGuideFreeTryHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.purchase.GuideToPurchaseActivity$initProduct$2$1$highLightStyle$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    super.updateDrawState(textPaint);
                    textPaint.setTypeface(n01.c());
                }
            });
            textView4.setText(valueOf3);
        }
        fl.h(this, Z().f2542b, 1000024);
        fl.n(this, Z().u, 1000098);
        fl.n(this, Z().o, 1000098);
        fl.n(this, Z().v, 1000098);
        fl.n(this, Z().p, 1000098);
        bindInvalidate(Z().h);
        bindInvalidate(Z().g);
        fl.n(this, Z().r, 1000122);
        fl.n(this, Z().q, 1000122);
        Z().c.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        fl.n(this, Z().c, 1000117);
        fl.n(this, Z().k, 1000013);
        fl.n(this, Z().l, 1000013);
        fl.n(this, Z().n, 1000013);
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
    public final i6 Z() {
        return (i6) this.n.getValue();
    }

    public final void d0(ViewGroup viewGroup, Class cls, x31 x31Var) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (m20.L(childAt.getClass(), cls)) {
                ((j61) x31Var).invoke(childAt);
            }
            if (childAt instanceof ViewGroup) {
                d0((ViewGroup) childAt, cls, x31Var);
            }
        }
    }

    public final void e0() {
        Rect rect;
        ContentWrapper contentWrapper = this.k;
        if (contentWrapper == null || (rect = contentWrapper.getWindowInsets()) == null) {
            rect = new Rect();
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tf3.H, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(tf3.I * 2, 0);
        Z().d.measure(makeMeasureSpec, makeMeasureSpec2);
        Z().e.measure(makeMeasureSpec, makeMeasureSpec2);
        Z().c.measure(makeMeasureSpec, makeMeasureSpec2);
        int K = (((((tf3.I - rect.top) - rect.bottom) - tf3.K(30)) - Z().c.getMeasuredHeight()) - Z().d.getMeasuredHeight()) - Z().e.getMeasuredHeight();
        Integer[] numArr = {Integer.valueOf(R.id.tmpSpace1), Integer.valueOf(R.id.tmpSpace2), Integer.valueOf(R.id.tmpSpace3), Integer.valueOf(R.id.tmpSpace4), Integer.valueOf(R.id.tmpSpace5), Integer.valueOf(R.id.tmpSpace6)};
        for (int i = 0; i < 6; i++) {
            int intValue = numArr[i].intValue();
            Z().i.measure(makeMeasureSpec, makeMeasureSpec2);
            if (K < Z().i.getMeasuredHeight()) {
                m20.u0(findViewById(intValue));
                Z().i.requestLayout();
            }
        }
        Z().i.measure(makeMeasureSpec, makeMeasureSpec2);
        Z().i.measure(makeMeasureSpec, makeMeasureSpec2);
        if (K < Z().i.getMeasuredHeight()) {
            Z().i.setLayoutParams(new LinearLayout.LayoutParams(-1, K));
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
            TextView textView = Z().r;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = Z().w;
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
