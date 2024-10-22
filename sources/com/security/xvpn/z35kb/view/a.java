package com.security.xvpn.z35kb.view;

import a.bx;
import a.du;
import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.protocol.ProtocolActivity;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.view.a;
import defpackage.a50;
import defpackage.bp1;
import defpackage.bx3;
import defpackage.d5;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fl;
import defpackage.hx2;
import defpackage.j73;
import defpackage.l30;
import defpackage.m20;
import defpackage.p71;
import defpackage.pd0;
import defpackage.pe0;
import defpackage.pn;
import defpackage.t60;
import defpackage.t9;
import defpackage.tf3;
import defpackage.v73;
import defpackage.ya0;
import defpackage.yc2;
import defpackage.z32;
import defpackage.z40;
import defpackage.zb2;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a extends pn implements View.OnClickListener {
    public static volatile boolean o = false;
    public static volatile String p = "";
    public final String m;
    public final int n;

    public a(Activity activity, int i, int i2, String str) {
        super(activity, i);
        this.m = str;
        this.n = i2;
    }

    public static a m(Activity activity, int i, String str) {
        int i2;
        switch (i) {
            case 0:
                if (XApplication.c) {
                    i2 = R.layout.dialog_connected_failed_normal_tv;
                    break;
                } else {
                    i2 = R.layout.dialog_connected_failed_normal;
                    break;
                }
            case 1:
            case 2:
            case 4:
                i2 = R.layout.dialog_connected_failed_default;
                break;
            case 3:
            default:
                throw new IllegalArgumentException(hx2.m("type:", i));
            case 5:
                i2 = R.layout.dialog_connected_failed_other;
                break;
            case 6:
                i2 = R.layout.dialog_connected_failed_freeblock;
                break;
            case 7:
                i2 = R.layout.dialog_connected_failed_connect_log;
                break;
            case 8:
                i2 = R.layout.dialog_update_alert;
                break;
        }
        return new a(activity, i2, i, str);
    }

    public static SpannableStringBuilder n(String str, HashMap hashMap) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        for (String str2 : hashMap.keySet()) {
            Pair B = pe0.B(str, str2);
            if (((Integer) B.first).intValue() >= 0) {
                spannableStringBuilder.setSpan(hashMap.get(str2), ((Integer) B.first).intValue(), ((Integer) B.second).intValue(), 33);
            }
        }
        return spannableStringBuilder;
    }

    @Override // defpackage.pn
    public final String l() {
        StringBuilder sb = new StringBuilder("ConnFailDialog_");
        int i = this.n;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i == 5) {
                            sb.append("other_vpn");
                        }
                    } else {
                        sb.append("no_net");
                    }
                } else {
                    sb.append("no_permission");
                }
            } else {
                sb.append("reboot");
            }
        } else {
            sb.append("normal");
        }
        return sb.toString();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 9;
        int i2 = 1;
        switch (view.getId()) {
            case R.id.btnChangeLocation /* 2131230860 */:
                if (!ew3.X() && this.n != 7) {
                    m20.C0(getContext(), 15);
                } else if (XApplication.c) {
                    ew3.d0(new l30(ya0.T(view), HomeActivity.class, i2, i));
                } else {
                    ew3.d0(new l30(ya0.T(view), ServerChooseActivity.class, i2, i));
                }
                dismiss();
                return;
            case R.id.btnChangeProtocol /* 2131230862 */:
                ew3.d0(new l30(ya0.T(view), ProtocolActivity.class, 2, i));
                dismiss();
                return;
            case R.id.btnSubscribe /* 2131230885 */:
                String str = t60.f4456a;
                boolean z = XApplication.c;
                ya0.T(view);
                yc2.a();
                GoogleIABHelper.g.h(5);
                du.d(633, null);
                return;
            case R.id.tv_err_code /* 2131231818 */:
                t9.w0(((dn) getOwnerActivity()).getSupportFragmentManager(), new bp1(this, 6));
                return;
            case R.id.vAction /* 2131231866 */:
                dismiss();
                o = true;
                p = this.m;
                p71.x(this.m, 300);
                if (this.n == 7) {
                    ew3.T0("");
                }
                pe0.c();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.pn, defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        TextView textView;
        int i3;
        int i4;
        int i5;
        super.onCreate(bundle);
        fl.g(this, this.l, 1000004);
        fl.h(this, (AppCompatImageView) findViewById(R.id.btnClose), 1000024);
        fl.n(this, (TextView) findViewById(R.id.tvTitle), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvContent), 1000014);
        fl.h(this, (AppCompatImageView) findViewById(R.id.btnClose), 1000066);
        final int i6 = 0;
        findViewById(R.id.btnClose).setOnClickListener(new View.OnClickListener(this) { // from class: y40

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a f5267b;

            {
                this.f5267b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                a aVar = this.f5267b;
                switch (i7) {
                    case 0:
                        aVar.dismiss();
                        return;
                    default:
                        aVar.dismiss();
                        uf ufVar = uf.f4657a;
                        uf.d((lt3) aVar.getOwnerActivity());
                        return;
                }
            }
        });
        TextView textView2 = (TextView) findViewById(R.id.tvContent);
        ImageView imageView = (ImageView) findViewById(R.id.pic_iv);
        int i7 = this.n;
        String str = this.m;
        final int i8 = 1;
        switch (i7) {
            case 0:
                fl.n(this, (TextView) findViewById(R.id.tv_flag_1), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tv_flag_2), 1000013);
                fl.n(this, (TextView) findViewById(R.id.contact_support), 1000014);
                fl.n(this, (TextView) findViewById(R.id.tv_err_code), 1000014);
                TextView textView3 = (TextView) findViewById(R.id.vAction);
                textView3.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
                fl.n(this, textView3, 1000117);
                View findViewById = findViewById(R.id.vError);
                textView3.setOnClickListener(this);
                textView3.setText(pd0.y(R.string.TryAgain1));
                findViewById.setVisibility(8);
                bx bxVar = new bx();
                bxVar.z(str);
                du.d(299, bxVar);
                bxVar.h();
                View findViewById2 = findViewById(R.id.tv_err_code);
                if (TextUtils.isEmpty(str)) {
                    findViewById2.setVisibility(8);
                } else {
                    findViewById2.setOnClickListener(this);
                    ((TextView) findViewById2).getPaint().setFlags(9);
                }
                TextView textView4 = (TextView) findViewById(R.id.btnChangeProtocol);
                textView4.getPaint().setUnderlineText(true);
                textView4.setOnClickListener(this);
                TextView textView5 = (TextView) findViewById(R.id.btnChangeLocation);
                textView5.getPaint().setUnderlineText(true);
                textView5.setOnClickListener(this);
                TextView textView6 = (TextView) findViewById(R.id.contact_support);
                if (ew3.X()) {
                    textView5.setText(pd0.y(R.string.ChangeLocation));
                    ((TextView) findViewById(R.id.tv_flag_2)).setText(pd0.y(R.string.SelectLocationBannedTips));
                }
                if (XApplication.c) {
                    textView6.setVisibility(8);
                    findViewById(R.id.contact_support_tv).setVisibility(0);
                    return;
                }
                String y = pd0.y(R.string.StillConnectFailedTips);
                Pair B = pe0.B(y, pd0.y(R.string.ContactSupport));
                if (((Integer) B.first).intValue() >= 0 && !XApplication.c) {
                    SpannableString spannableString = new SpannableString(y);
                    spannableString.setSpan(new a50(this, i6), ((Integer) B.first).intValue(), ((Integer) B.second).intValue(), 33);
                    textView6.setText(spannableString);
                    textView6.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            case 1:
                imageView.setImageResource(R.drawable.img_alert_reboot);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pd0.y(R.string.ConnectFailedReboot));
                bx3.i(spannableStringBuilder, pd0.y(R.string.ConnectFailedRebootHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.view.ConnFailDialog$1
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setFakeBoldText(true);
                    }
                });
                textView2.setText(spannableStringBuilder);
                return;
            case 2:
                imageView.setImageResource(R.drawable.img_alert_nopermission);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(pd0.y(R.string.ConnectFailedPermission));
                bx3.i(spannableStringBuilder2, pd0.y(R.string.Okay), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.view.ConnFailDialog$2
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setFakeBoldText(true);
                    }
                });
                textView2.setText(spannableStringBuilder2);
                TextView textView7 = (TextView) findViewById(R.id.sub_content_tv);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(pd0.y(R.string.ConnectFailedPermissionFixStep));
                bx3.i(spannableStringBuilder3, spannableStringBuilder3.toString(), new z40(2));
                spannableStringBuilder3.append((CharSequence) "\n\n");
                spannableStringBuilder3.append((CharSequence) pd0.y(R.string.ConnectFailedPermissionFixStep1));
                spannableStringBuilder3.append((CharSequence) "\n\n");
                spannableStringBuilder3.append((CharSequence) pd0.y(R.string.ConnectFailedPermissionFixStep2));
                textView7.setText(spannableStringBuilder3);
                textView7.setLineSpacing(1.0f, 1.3f);
                textView7.setVisibility(0);
                return;
            case 3:
            default:
                return;
            case 4:
                imageView.setImageResource(R.drawable.img_alert_no_net);
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(pd0.y(R.string.ConnFailedCheckNetwork));
                bx3.i(spannableStringBuilder4, pd0.y(R.string.ConnFailedCheckNetworkHighlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.view.ConnFailDialog$4
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setFakeBoldText(true);
                    }
                });
                textView2.setText(spannableStringBuilder4);
                return;
            case 5:
                fl.n(this, (TextView) findViewById(R.id.tv_flag_1), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tv_flag_2), 1000013);
                HashMap hashMap = new HashMap();
                ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(-11153696);
                hashMap.put(pd0.y(R.string.ConnectFailedByOtherVPNL1Highlight), foregroundColorSpan);
                ((TextView) findViewById(R.id.tv_flag_1)).setText(n(pd0.y(R.string.ConnectFailedByOtherVPNL1), hashMap));
                hashMap.put(pd0.y(R.string.ConnectFailedByOtherVPNL2Highlight), foregroundColorSpan);
                ((TextView) findViewById(R.id.tv_flag_2)).setText(n(pd0.y(R.string.ConnectFailedByOtherVPNL2), hashMap));
                return;
            case 6:
                fl.n(this, (TextView) findViewById(R.id.tv_flag_1), 1000014);
                fl.n(this, (TextView) findViewById(R.id.tv_flag_2), 1000014);
                fl.n(this, (TextView) findViewById(R.id.tv_flag_3), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tvPurchasePrice), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tvPurchaseRule), 1000015);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(pd0.y(R.string.ConnectFailedFreeBlockL1));
                bx3.i(spannableStringBuilder5, pd0.y(R.string.ConnectFailedFreeBlockL1Highlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.view.ConnFailDialog$6
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setFakeBoldText(true);
                    }
                });
                SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(pd0.y(R.string.ConnectFailedFreeBlockL2));
                bx3.i(spannableStringBuilder6, pd0.y(R.string.ConnectFailedFreeBlockL2Highlight), new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.view.ConnFailDialog$7
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        super.updateDrawState(textPaint);
                        textPaint.setFakeBoldText(true);
                    }
                });
                ((TextView) findViewById(R.id.tv_flag_1)).setText(spannableStringBuilder5);
                ((TextView) findViewById(R.id.tv_flag_2)).setText(spannableStringBuilder6);
                TextView textView8 = (TextView) findViewById(R.id.tvPurchasePrice);
                Button button = (Button) findViewById(R.id.btnSubscribe);
                TextView textView9 = (TextView) findViewById(R.id.tvPurchaseRule);
                if (d5.B()) {
                    i = R.string.PurchaseRuleNF;
                } else {
                    i = R.string.PurchaseRule;
                }
                SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder(pd0.y(i));
                j73 k = bx3.k(true);
                j73 l = bx3.l(true);
                bx3.i(spannableStringBuilder7, pd0.y(R.string.PrivacyPolicy), k.f2718b);
                bx3.i(spannableStringBuilder7, pd0.y(R.string.TermsOfService), l.f2718b);
                textView9.setText(spannableStringBuilder7);
                textView9.setMovementMethod(LinkMovementMethod.getInstance());
                textView9.setLinkTextColor(v73.j(1000092));
                if (d5.B()) {
                    if (XApplication.d) {
                        i4 = R.string.PurchasePriceMonthlyNF;
                    } else {
                        i4 = R.string.PurchasePriceYearlyNF;
                    }
                    textView8.setText(pd0.y(i4));
                    findViewById(R.id.tv_flag_3).setVisibility(8);
                } else {
                    if (XApplication.d) {
                        i2 = R.string.PurchasePriceMonthly;
                    } else {
                        i2 = R.string.PurchasePriceYearly;
                    }
                    textView8.setText(pd0.y(i2));
                    if (ew3.z().c == 3 && (textView = (TextView) findViewById(R.id.tv_flag_3)) != null) {
                        textView.setText(pd0.y(R.string.Start3DayFreeTry));
                    }
                }
                if (!XApplication.d) {
                    zb2 z = ew3.z();
                    if (z.c == 0) {
                        if (z.g) {
                            i3 = R.string.PurchasePriceMonthNFFormat;
                        } else {
                            i3 = R.string.PurchasePriceYearNFFormat;
                        }
                    } else if (z.g) {
                        i3 = R.string.PurchasePriceMonthFormat;
                    } else {
                        i3 = R.string.PurchasePriceYearFormat;
                    }
                    textView8.setText(pd0.z(i3, hx2.p("$", z.f)));
                    TextView textView10 = (TextView) findViewById(R.id.tv_flag_3);
                    if (textView10 != null) {
                        textView10.setText(pd0.w());
                    }
                }
                button.setOnClickListener(this);
                return;
            case 7:
                fl.n(this, (TextView) findViewById(R.id.tv_flag_1), 1000013);
                fl.n(this, (TextView) findViewById(R.id.tv_flag_2), 1000013);
                fl.n(this, (TextView) findViewById(R.id.contact_support), 1000014);
                fl.n(this, (TextView) findViewById(R.id.tv_err_code), 1000014);
                fl.n(this, (TextView) findViewById(R.id.btnCheckNetwork), 1000015);
                TextView textView11 = (TextView) findViewById(R.id.vAction);
                View findViewById3 = findViewById(R.id.vError);
                textView11.setOnClickListener(this);
                TextView textView12 = (TextView) findViewById(R.id.tv_flag_2);
                SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.ConnectByLogIPExpired));
                bx3.i(valueOf, pd0.y(R.string.MayExpired), new z32(this, 2));
                textView12.setText(valueOf);
                textView11.setText(pd0.y(R.string.RetryWithTheFastestServer));
                findViewById3.setVisibility(8);
                bx bxVar2 = new bx();
                bxVar2.z(str);
                du.d(299, bxVar2);
                bxVar2.h();
                View findViewById4 = findViewById(R.id.tv_err_code);
                if (TextUtils.isEmpty(str)) {
                    i5 = 8;
                    findViewById4.setVisibility(8);
                } else {
                    i5 = 8;
                    findViewById4.setOnClickListener(this);
                    ((TextView) findViewById4).getPaint().setFlags(9);
                }
                TextView textView13 = (TextView) findViewById(R.id.contact_support);
                if (XApplication.c) {
                    textView13.setVisibility(i5);
                    findViewById(R.id.contact_support_tv).setVisibility(0);
                    return;
                }
                String y2 = pd0.y(R.string.StillConnectFailedTips);
                Pair B2 = pe0.B(y2, pd0.y(R.string.ContactSupport));
                if (((Integer) B2.first).intValue() >= 0 && !XApplication.c) {
                    SpannableString spannableString2 = new SpannableString(y2);
                    spannableString2.setSpan(new a50(this, i8), ((Integer) B2.first).intValue(), ((Integer) B2.second).intValue(), 33);
                    textView13.setText(spannableString2);
                    textView13.setMovementMethod(LinkMovementMethod.getInstance());
                    return;
                }
                return;
            case 8:
                fl.n(this, (TextView) findViewById(R.id.tvDesc), 1000014);
                TextView textView14 = (TextView) findViewById(R.id.tvDescP2);
                fl.n(this, textView14, 1000014);
                SpannableString spannableString3 = new SpannableString(pd0.y(R.string.UpdateAlertP2));
                bx3.i(spannableString3, pd0.y(R.string.AppUpgradeBtn), new z40(0));
                bx3.i(spannableString3, pd0.y(R.string.Retry), new z40(1));
                textView14.setText(spannableString3);
                ((TextView) findViewById(R.id.vAction)).setOnClickListener(new View.OnClickListener(this) { // from class: y40

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ a f5267b;

                    {
                        this.f5267b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i72 = i8;
                        a aVar = this.f5267b;
                        switch (i72) {
                            case 0:
                                aVar.dismiss();
                                return;
                            default:
                                aVar.dismiss();
                                uf ufVar = uf.f4657a;
                                uf.d((lt3) aVar.getOwnerActivity());
                                return;
                        }
                    }
                });
                return;
        }
    }

    @Override // defpackage.pn, android.app.Dialog
    public final void show() {
        super.show();
        int i = this.n;
        if (i == 6) {
            du.d(632, null);
        } else if (i == 5) {
            du.d(631, null);
        }
    }
}
