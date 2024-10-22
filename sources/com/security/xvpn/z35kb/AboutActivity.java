package com.security.xvpn.z35kb;

import a.bx;
import a.du;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import b.ContentWrapper;
import com.google.android.gms.internal.consent_sdk.zzl;
import com.security.xvpn.z35kb.AboutActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.d;
import defpackage.dn;
import defpackage.du3;
import defpackage.eu3;
import defpackage.ew3;
import defpackage.f;
import defpackage.fl;
import defpackage.fv2;
import defpackage.gu3;
import defpackage.h;
import defpackage.hu3;
import defpackage.hx2;
import defpackage.l83;
import defpackage.m20;
import defpackage.n01;
import defpackage.pd0;
import defpackage.q90;
import defpackage.r60;
import defpackage.tf3;
import defpackage.uf;
import defpackage.v73;
import defpackage.ww2;
import defpackage.xv3;
import defpackage.yv3;
import defpackage.zf3;

/* loaded from: classes2.dex */
public final class AboutActivity extends dn {
    public static final /* synthetic */ int m = 0;
    public eu3 k;
    public long l;

    @Override // defpackage.lt3
    public final String M() {
        return "AboutPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        ContentWrapper contentWrapper = new ContentWrapper(this, null, 6);
        contentWrapper.setId(-1);
        final int i6 = 0;
        eu3 eu3Var = new eu3(contentWrapper.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        q90 q90Var = new q90(1, this, contentWrapper);
        View toolbar = new Toolbar(eu3Var.getContext(), null, 6);
        q90Var.invoke(toolbar);
        eu3Var.addView(toolbar);
        gu3 gu3Var = new gu3(eu3Var.getContext());
        contentWrapper.a(new fv2(gu3Var, 3));
        eu3 eu3Var2 = new eu3(gu3Var.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(-1);
        eu3Var2.setGravity(1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(eu3Var2.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.img_about_logo);
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        int D = tf3.D(142);
        layoutParams2.width = D;
        layoutParams2.height = D;
        layoutParams2.topMargin = tf3.D(22);
        appCompatImageView.setLayoutParams(layoutParams2);
        eu3Var2.addView(appCompatImageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        if (appCompatTextView.isInEditMode()) {
            appCompatTextView.setText(pd0.z(R.string.VersionFormat, "10"));
        } else {
            bx i7 = hx2.i(465);
            String u = i7.u();
            i7.h();
            appCompatTextView.setText(pd0.z(R.string.VersionFormat, u));
        }
        appCompatTextView.setTextSize(12.0f);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        layoutParams4.topMargin = -tf3.D(16);
        appCompatTextView.setLayoutParams(layoutParams4);
        fl.n(this, appCompatTextView, 1000014);
        appCompatTextView.setOnClickListener(new View.OnClickListener(this) { // from class: c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutActivity f560b;

            {
                this.f560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                char c;
                int i8 = i6;
                AboutActivity aboutActivity = this.f560b;
                switch (i8) {
                    case 0:
                        int i9 = AboutActivity.m;
                        aboutActivity.getClass();
                        if (!ew3.T()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i10 = pe0.j;
                            if (i10 != 0 && currentTimeMillis - pe0.k >= 1000) {
                                pe0.j = 0;
                            } else {
                                pe0.j = i10 + 1;
                                pe0.k = currentTimeMillis;
                            }
                            if (pe0.j >= 10) {
                                c = 0;
                            } else {
                                c = 65535;
                            }
                            if (c == 0) {
                                Toast.makeText(aboutActivity.c, pd0.y(R.string.DebugModeOpen), 0).show();
                                du.d(73, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i11 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var = aboutActivity.c;
                            try {
                                try {
                                    lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/1698353826871507")));
                                    return;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            } catch (Exception unused) {
                                lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    case 2:
                        int i12 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var2 = aboutActivity.c;
                            try {
                                try {
                                    lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?user_id=880248410535800836")));
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            } catch (ActivityNotFoundException unused2) {
                                lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    default:
                        int i13 = AboutActivity.m;
                        uf ufVar = uf.f4657a;
                        if (((Boolean) uf.i.getValue()).booleanValue() && !aboutActivity.a0()) {
                            uf.d(aboutActivity);
                            return;
                        }
                        return;
                }
            }
        });
        eu3Var2.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setText(pd0.y(R.string.FollowUs));
        appCompatTextView2.setTextSize(18.0f);
        appCompatTextView2.setTypeface(n01.a());
        fl.n(this, appCompatTextView2, 1000014);
        ViewGroup.LayoutParams layoutParams5 = appCompatTextView2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams6 = layoutParams5 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams5 : null;
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams6.width = -2;
        layoutParams6.height = -2;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        layoutParams6.topMargin = tf3.D(30);
        appCompatTextView2.setLayoutParams(layoutParams6);
        eu3Var2.addView(appCompatTextView2);
        eu3 h = hx2.h(eu3Var2.getContext(), null, 6, 0, 0);
        h.setId(-1);
        int D2 = tf3.D(36);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(h.getContext(), null);
        appCompatImageView2.setId(-1);
        appCompatImageView2.setImageResource(R.drawable.icon_share_fb);
        ViewGroup.LayoutParams layoutParams7 = appCompatImageView2.getLayoutParams();
        LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
        if (layoutParams8 == null) {
            layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams8.width = -2;
        layoutParams8.height = -2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        layoutParams8.width = D2;
        layoutParams8.height = D2;
        appCompatImageView2.setLayoutParams(layoutParams8);
        final int i8 = 1;
        appCompatImageView2.setOnClickListener(new View.OnClickListener(this) { // from class: c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutActivity f560b;

            {
                this.f560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                char c;
                int i82 = i8;
                AboutActivity aboutActivity = this.f560b;
                switch (i82) {
                    case 0:
                        int i9 = AboutActivity.m;
                        aboutActivity.getClass();
                        if (!ew3.T()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i10 = pe0.j;
                            if (i10 != 0 && currentTimeMillis - pe0.k >= 1000) {
                                pe0.j = 0;
                            } else {
                                pe0.j = i10 + 1;
                                pe0.k = currentTimeMillis;
                            }
                            if (pe0.j >= 10) {
                                c = 0;
                            } else {
                                c = 65535;
                            }
                            if (c == 0) {
                                Toast.makeText(aboutActivity.c, pd0.y(R.string.DebugModeOpen), 0).show();
                                du.d(73, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i11 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var = aboutActivity.c;
                            try {
                                try {
                                    lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/1698353826871507")));
                                    return;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            } catch (Exception unused) {
                                lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    case 2:
                        int i12 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var2 = aboutActivity.c;
                            try {
                                try {
                                    lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?user_id=880248410535800836")));
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            } catch (ActivityNotFoundException unused2) {
                                lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    default:
                        int i13 = AboutActivity.m;
                        uf ufVar = uf.f4657a;
                        if (((Boolean) uf.i.getValue()).booleanValue() && !aboutActivity.a0()) {
                            uf.d(aboutActivity);
                            return;
                        }
                        return;
                }
            }
        });
        h.addView(appCompatImageView2);
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(h.getContext(), null);
        appCompatImageView3.setId(-1);
        appCompatImageView3.setImageResource(R.drawable.icon_share_twitter);
        ViewGroup.LayoutParams layoutParams9 = appCompatImageView3.getLayoutParams();
        LinearLayout.LayoutParams layoutParams10 = layoutParams9 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams9 : null;
        if (layoutParams10 == null) {
            layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams10.width = -2;
        layoutParams10.height = -2;
        layoutParams10.weight = Math.max(-1.0f, layoutParams10.weight);
        layoutParams10.gravity = Math.max(-1, layoutParams10.gravity);
        layoutParams10.leftMargin = Math.max(-1, layoutParams10.leftMargin);
        layoutParams10.topMargin = Math.max(-1, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(-1, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        layoutParams10.width = D2;
        layoutParams10.height = D2;
        layoutParams10.setMarginStart(tf3.D(30));
        appCompatImageView3.setLayoutParams(layoutParams10);
        final int i9 = 2;
        appCompatImageView3.setOnClickListener(new View.OnClickListener(this) { // from class: c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutActivity f560b;

            {
                this.f560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                char c;
                int i82 = i9;
                AboutActivity aboutActivity = this.f560b;
                switch (i82) {
                    case 0:
                        int i92 = AboutActivity.m;
                        aboutActivity.getClass();
                        if (!ew3.T()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i10 = pe0.j;
                            if (i10 != 0 && currentTimeMillis - pe0.k >= 1000) {
                                pe0.j = 0;
                            } else {
                                pe0.j = i10 + 1;
                                pe0.k = currentTimeMillis;
                            }
                            if (pe0.j >= 10) {
                                c = 0;
                            } else {
                                c = 65535;
                            }
                            if (c == 0) {
                                Toast.makeText(aboutActivity.c, pd0.y(R.string.DebugModeOpen), 0).show();
                                du.d(73, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i11 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var = aboutActivity.c;
                            try {
                                try {
                                    lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/1698353826871507")));
                                    return;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            } catch (Exception unused) {
                                lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    case 2:
                        int i12 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var2 = aboutActivity.c;
                            try {
                                try {
                                    lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?user_id=880248410535800836")));
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            } catch (ActivityNotFoundException unused2) {
                                lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    default:
                        int i13 = AboutActivity.m;
                        uf ufVar = uf.f4657a;
                        if (((Boolean) uf.i.getValue()).booleanValue() && !aboutActivity.a0()) {
                            uf.d(aboutActivity);
                            return;
                        }
                        return;
                }
            }
        });
        h.addView(appCompatImageView3);
        if (h.getAttachToParent()) {
            eu3Var2.addView(h);
        }
        ViewGroup.LayoutParams layoutParams11 = h.getLayoutParams();
        LinearLayout.LayoutParams layoutParams12 = layoutParams11 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams11 : null;
        if (layoutParams12 == null) {
            layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams12.width = -2;
        layoutParams12.height = -2;
        layoutParams12.weight = Math.max(-1.0f, layoutParams12.weight);
        layoutParams12.gravity = Math.max(-1, layoutParams12.gravity);
        layoutParams12.leftMargin = Math.max(-1, layoutParams12.leftMargin);
        layoutParams12.topMargin = Math.max(-1, layoutParams12.topMargin);
        layoutParams12.rightMargin = Math.max(-1, layoutParams12.rightMargin);
        layoutParams12.bottomMargin = Math.max(-1, layoutParams12.bottomMargin);
        layoutParams12.topMargin = tf3.D(15);
        layoutParams12.width = -2;
        h.setLayoutParams(layoutParams12);
        Space space = new Space(eu3Var2.getContext());
        int D3 = tf3.D(30);
        if (space.getLayoutParams() == null) {
            hx2.v(-2, -2, space);
        }
        ViewGroup.LayoutParams layoutParams13 = space.getLayoutParams();
        LinearLayout.LayoutParams layoutParams14 = layoutParams13 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams13 : null;
        if (layoutParams14 == null) {
            layoutParams14 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams14.width = -2;
        layoutParams14.height = -2;
        layoutParams14.weight = Math.max(-1.0f, layoutParams14.weight);
        layoutParams14.gravity = Math.max(-1, layoutParams14.gravity);
        layoutParams14.leftMargin = Math.max(-1, layoutParams14.leftMargin);
        layoutParams14.topMargin = Math.max(-1, layoutParams14.topMargin);
        layoutParams14.rightMargin = Math.max(-1, layoutParams14.rightMargin);
        layoutParams14.bottomMargin = Math.max(-1, layoutParams14.bottomMargin);
        layoutParams14.height = D3;
        space.setLayoutParams(layoutParams14);
        eu3Var2.addView(space);
        Z(eu3Var2, new f(this, 7));
        Z(eu3Var2, new f(this, 8));
        Z(eu3Var2, new f(this, 9));
        Z(eu3Var2, new f(this, 1));
        Z(eu3Var2, new f(this, 4));
        du3 du3Var = new du3(eu3Var2.getContext(), null, 6, 0);
        du3Var.setId(-1);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(du3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setText(pd0.y(R.string.VersionUpdate));
        appCompatTextView3.setTextSize(15.0f);
        appCompatTextView3.setPadding(tf3.D(20), 0, tf3.D(20), 0);
        appCompatTextView3.setGravity(16);
        ViewGroup.LayoutParams layoutParams15 = appCompatTextView3.getLayoutParams();
        FrameLayout.LayoutParams layoutParams16 = layoutParams15 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams15 : null;
        if (layoutParams16 == null) {
            layoutParams16 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams16.width = -2;
        layoutParams16.height = -2;
        layoutParams16.gravity = Math.max(-1, layoutParams16.gravity);
        layoutParams16.setMarginStart(Math.max(-1, layoutParams16.leftMargin));
        layoutParams16.topMargin = Math.max(-1, layoutParams16.topMargin);
        layoutParams16.setMarginEnd(Math.max(-1, layoutParams16.rightMargin));
        layoutParams16.bottomMargin = Math.max(-1, layoutParams16.bottomMargin);
        layoutParams16.width = -1;
        layoutParams16.height = tf3.D(48);
        appCompatTextView3.setLayoutParams(layoutParams16);
        appCompatTextView3.setBackgroundResource(R.drawable.bg_pressed_rectangle_a0);
        appCompatTextView3.setFocusable(true);
        fl.n(this, appCompatTextView3, 1000014);
        appCompatTextView3.setBackground(ew3.g1(v73.j(1000009)));
        final int i10 = 3;
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AboutActivity f560b;

            {
                this.f560b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                char c;
                int i82 = i10;
                AboutActivity aboutActivity = this.f560b;
                switch (i82) {
                    case 0:
                        int i92 = AboutActivity.m;
                        aboutActivity.getClass();
                        if (!ew3.T()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i102 = pe0.j;
                            if (i102 != 0 && currentTimeMillis - pe0.k >= 1000) {
                                pe0.j = 0;
                            } else {
                                pe0.j = i102 + 1;
                                pe0.k = currentTimeMillis;
                            }
                            if (pe0.j >= 10) {
                                c = 0;
                            } else {
                                c = 65535;
                            }
                            if (c == 0) {
                                Toast.makeText(aboutActivity.c, pd0.y(R.string.DebugModeOpen), 0).show();
                                du.d(73, null);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        int i11 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var = aboutActivity.c;
                            try {
                                try {
                                    lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("fb://page/1698353826871507")));
                                    return;
                                } catch (Exception e) {
                                    e.printStackTrace();
                                    return;
                                }
                            } catch (Exception unused) {
                                lt3Var.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    case 2:
                        int i12 = AboutActivity.m;
                        if (!aboutActivity.a0()) {
                            lt3 lt3Var2 = aboutActivity.c;
                            try {
                                try {
                                    lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("twitter://user?user_id=880248410535800836")));
                                    return;
                                } catch (Exception e2) {
                                    e2.printStackTrace();
                                    return;
                                }
                            } catch (ActivityNotFoundException unused2) {
                                lt3Var2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/xvpnteam")));
                                return;
                            }
                        }
                        return;
                    default:
                        int i13 = AboutActivity.m;
                        uf ufVar = uf.f4657a;
                        if (((Boolean) uf.i.getValue()).booleanValue() && !aboutActivity.a0()) {
                            uf.d(aboutActivity);
                            return;
                        }
                        return;
                }
            }
        });
        du3Var.addView(appCompatTextView3);
        View hu3Var = new hu3(du3Var.getContext());
        fl.g(this, hu3Var, 1000010);
        ViewGroup.LayoutParams layoutParams17 = hu3Var.getLayoutParams();
        FrameLayout.LayoutParams layoutParams18 = layoutParams17 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams17 : null;
        if (layoutParams18 == null) {
            layoutParams18 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams18.width = -2;
        layoutParams18.height = -2;
        layoutParams18.gravity = Math.max(-1, layoutParams18.gravity);
        layoutParams18.setMarginStart(Math.max(-1, layoutParams18.leftMargin));
        layoutParams18.topMargin = Math.max(-1, layoutParams18.topMargin);
        layoutParams18.setMarginEnd(Math.max(-1, layoutParams18.rightMargin));
        layoutParams18.bottomMargin = Math.max(-1, layoutParams18.bottomMargin);
        layoutParams18.width = -1;
        layoutParams18.height = Math.max(1, (int) Math.ceil(tf3.F * 0.5f));
        layoutParams18.setMarginStart(tf3.D(20));
        layoutParams18.gravity = 80;
        hu3Var.setLayoutParams(layoutParams18);
        du3Var.addView(hu3Var);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(du3Var.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setText(pd0.y(R.string.NotAvailable));
        fl.n(this, appCompatTextView4, 1000014);
        appCompatTextView4.setGravity(8388613);
        if (appCompatTextView4.getLayoutParams() == null) {
            appCompatTextView4.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams19 = appCompatTextView4.getLayoutParams();
        LinearLayout.LayoutParams layoutParams20 = layoutParams19 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams19 : null;
        if (layoutParams20 == null) {
            i = -2;
            layoutParams20 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i = -2;
        }
        layoutParams20.width = i;
        layoutParams20.height = i;
        layoutParams20.weight = Math.max(-1.0f, layoutParams20.weight);
        layoutParams20.gravity = Math.max(-1, layoutParams20.gravity);
        layoutParams20.leftMargin = Math.max(-1, layoutParams20.leftMargin);
        layoutParams20.topMargin = Math.max(-1, layoutParams20.topMargin);
        layoutParams20.rightMargin = Math.max(-1, layoutParams20.rightMargin);
        layoutParams20.bottomMargin = Math.max(-1, layoutParams20.bottomMargin);
        layoutParams20.gravity = 8388613;
        appCompatTextView4.setLayoutParams(layoutParams20);
        ViewGroup.LayoutParams layoutParams21 = appCompatTextView4.getLayoutParams();
        FrameLayout.LayoutParams layoutParams22 = layoutParams21 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams21 : null;
        if (layoutParams22 == null) {
            i2 = -2;
            layoutParams22 = new FrameLayout.LayoutParams(-2, -2);
        } else {
            i2 = -2;
        }
        layoutParams22.width = i2;
        layoutParams22.height = i2;
        layoutParams22.gravity = Math.max(-1, layoutParams22.gravity);
        layoutParams22.setMarginStart(Math.max(-1, layoutParams22.leftMargin));
        layoutParams22.topMargin = Math.max(-1, layoutParams22.topMargin);
        layoutParams22.setMarginEnd(Math.max(-1, layoutParams22.rightMargin));
        layoutParams22.bottomMargin = Math.max(-1, layoutParams22.bottomMargin);
        layoutParams22.width = -2;
        layoutParams22.height = -2;
        layoutParams22.gravity = 8388629;
        layoutParams22.setMarginEnd(tf3.K(16));
        appCompatTextView4.setLayoutParams(layoutParams22);
        du3Var.addView(appCompatTextView4);
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(du3Var.getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setText(pd0.y(R.string.New));
        appCompatTextView5.setTextColor(-2729665);
        appCompatTextView5.setGravity(16);
        if (appCompatTextView5.getLayoutParams() == null) {
            appCompatTextView5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams23 = appCompatTextView5.getLayoutParams();
        LinearLayout.LayoutParams layoutParams24 = layoutParams23 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams23 : null;
        if (layoutParams24 == null) {
            i3 = -2;
            layoutParams24 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i3 = -2;
        }
        layoutParams24.width = i3;
        layoutParams24.height = i3;
        layoutParams24.weight = Math.max(-1.0f, layoutParams24.weight);
        layoutParams24.gravity = Math.max(-1, layoutParams24.gravity);
        layoutParams24.leftMargin = Math.max(-1, layoutParams24.leftMargin);
        layoutParams24.topMargin = Math.max(-1, layoutParams24.topMargin);
        layoutParams24.rightMargin = Math.max(-1, layoutParams24.rightMargin);
        layoutParams24.bottomMargin = Math.max(-1, layoutParams24.bottomMargin);
        layoutParams24.gravity = 8388613;
        appCompatTextView5.setLayoutParams(layoutParams24);
        appCompatTextView5.setBackground(getDrawable(R.drawable.bg_new_version_tag));
        tf3.V(appCompatTextView5);
        appCompatTextView5.setPadding(tf3.K(15), 0, tf3.K(15), 0);
        ViewGroup.LayoutParams layoutParams25 = appCompatTextView5.getLayoutParams();
        FrameLayout.LayoutParams layoutParams26 = layoutParams25 instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams25 : null;
        if (layoutParams26 == null) {
            i4 = -2;
            layoutParams26 = new FrameLayout.LayoutParams(-2, -2);
        } else {
            i4 = -2;
        }
        layoutParams26.width = i4;
        layoutParams26.height = i4;
        layoutParams26.gravity = Math.max(-1, layoutParams26.gravity);
        layoutParams26.setMarginStart(Math.max(-1, layoutParams26.leftMargin));
        layoutParams26.topMargin = Math.max(-1, layoutParams26.topMargin);
        layoutParams26.setMarginEnd(Math.max(-1, layoutParams26.rightMargin));
        layoutParams26.bottomMargin = Math.max(-1, layoutParams26.bottomMargin);
        layoutParams26.width = -2;
        layoutParams26.height = tf3.K(26);
        layoutParams26.gravity = 8388629;
        layoutParams26.setMarginEnd(tf3.K(25));
        appCompatTextView5.setLayoutParams(layoutParams26);
        du3Var.addView(appCompatTextView5);
        boolean booleanValue = ((Boolean) uf.i.getValue()).booleanValue();
        m20.g1(appCompatTextView4, !booleanValue);
        m20.g1(appCompatTextView5, booleanValue);
        zf3.T(this, null, new h(appCompatTextView4, appCompatTextView5, null), 3);
        if (du3Var.getAttachToParent()) {
            eu3Var2.addView(du3Var);
        }
        ViewGroup.LayoutParams layoutParams27 = du3Var.getLayoutParams();
        LinearLayout.LayoutParams layoutParams28 = layoutParams27 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams27 : null;
        if (layoutParams28 == null) {
            i5 = -2;
            layoutParams28 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i5 = -2;
        }
        layoutParams28.width = i5;
        layoutParams28.height = i5;
        layoutParams28.weight = Math.max(-1.0f, layoutParams28.weight);
        layoutParams28.gravity = Math.max(-1, layoutParams28.gravity);
        layoutParams28.leftMargin = Math.max(-1, layoutParams28.leftMargin);
        layoutParams28.topMargin = Math.max(-1, layoutParams28.topMargin);
        layoutParams28.rightMargin = Math.max(-1, layoutParams28.rightMargin);
        layoutParams28.bottomMargin = Math.max(-1, layoutParams28.bottomMargin);
        layoutParams28.height = -2;
        layoutParams28.width = -1;
        du3Var.setLayoutParams(layoutParams28);
        this.k = Z(eu3Var2, new f(this, 6));
        if (eu3Var2.getAttachToParent()) {
            gu3Var.addView(eu3Var2);
        }
        if (gu3Var.getAttachToParent()) {
            eu3Var.addView(gu3Var);
        }
        if (eu3Var.getAttachToParent()) {
            contentWrapper.addView(eu3Var);
        }
        int j = v73.j(1000004);
        yv3.e = j;
        xv3 xv3Var = yv3.f5397a;
        if (xv3Var != null) {
            xv3Var.setBackgroundColor(j);
        }
        int y = v73.y();
        yv3.f = y;
        xv3 xv3Var2 = yv3.f5397a;
        if (xv3Var2 != null) {
            xv3Var2.f5233a.setTextColor(y);
        }
        setContentView(contentWrapper);
        eu3 eu3Var3 = this.k;
        if (eu3Var3 != null) {
            if (!ew3.X()) {
                zzl zzlVar = l83.f;
                if ((zzlVar != null ? zzlVar.getPrivacyOptionsRequirementStatus() : null) == r60.REQUIRED) {
                    z = true;
                    m20.g1(eu3Var3, z);
                }
            }
            z = false;
            m20.g1(eu3Var3, z);
        }
    }

    public final eu3 Z(eu3 eu3Var, f fVar) {
        LinearLayout.LayoutParams layoutParams;
        d dVar = new d();
        fVar.invoke(dVar);
        LinearLayout.LayoutParams layoutParams2 = null;
        eu3 eu3Var2 = new eu3(eu3Var.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(-1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(dVar.f1710a);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setPadding(tf3.D(20), 0, tf3.D(20), 0);
        appCompatTextView.setGravity(16);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        layoutParams.width = -1;
        layoutParams.height = tf3.D(48);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setBackgroundResource(R.drawable.bg_pressed_rectangle_a0);
        appCompatTextView.setFocusable(true);
        appCompatTextView.setOnClickListener(new ww2(2, this, dVar));
        fl.n(this, appCompatTextView, 1000014);
        appCompatTextView.setBackground(ew3.g1(v73.j(1000009)));
        eu3Var2.addView(appCompatTextView);
        View hu3Var = new hu3(eu3Var2.getContext());
        fl.g(this, hu3Var, 1000010);
        ViewGroup.LayoutParams layoutParams4 = hu3Var.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams4;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        layoutParams2.width = -1;
        layoutParams2.height = Math.max(1, (int) Math.ceil(0.5f * tf3.F));
        layoutParams2.leftMargin = tf3.D(15);
        hu3Var.setLayoutParams(layoutParams2);
        eu3Var2.addView(hu3Var);
        if (eu3Var2.getAttachToParent()) {
            eu3Var.addView(eu3Var2);
        }
        return eu3Var2;
    }

    public final boolean a0() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.l >= 500) {
            this.l = currentTimeMillis;
            return false;
        }
        return true;
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ViewGroup viewGroup;
        try {
            View findViewById = findViewById(520093697);
            if (findViewById != null) {
                yv3.f5398b = false;
                ViewParent parent = findViewById.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup = (ViewGroup) parent;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    viewGroup.removeView(findViewById);
                    return;
                }
                return;
            }
            super.onBackPressed();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.dn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        int j = v73.j(1000004);
        yv3.e = j;
        xv3 xv3Var = yv3.f5397a;
        if (xv3Var != null) {
            xv3Var.setBackgroundColor(j);
        }
        int y = v73.y();
        yv3.f = y;
        xv3 xv3Var2 = yv3.f5397a;
        if (xv3Var2 != null) {
            xv3Var2.f5233a.setTextColor(y);
        }
    }
}
