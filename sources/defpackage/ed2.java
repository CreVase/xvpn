package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.widget.Toolbar;

/* loaded from: classes2.dex */
public final class ed2 extends pn {
    public int m;
    public String n;
    public dd2 o;

    @Override // defpackage.pn
    public final String l() {
        return "PurchaseBindErrorDialog";
    }

    @Override // defpackage.pn, defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        Spanned fromHtml;
        Button button;
        super.onCreate(bundle);
        fl.g(this, this.l, 1000004);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.Account));
        final int i = 0;
        final int i2 = 1;
        if (XApplication.c) {
            toolbar.setShowCloseBtn(true);
            toolbar.getBtnClose().setBackgroundResource(R.drawable.bg_status_bar_icon);
            toolbar.getBtnClose().setOnClickListener(new View.OnClickListener(this) { // from class: bd2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ed2 f451b;

                {
                    this.f451b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    ed2 ed2Var = this.f451b;
                    switch (i3) {
                        case 0:
                            ed2Var.dismiss();
                            return;
                        case 1:
                            ed2Var.dismiss();
                            return;
                        case 2:
                            ed2Var.dismiss();
                            return;
                        case 3:
                            ed2Var.getClass();
                            bx3.G(view.getContext(), true, null);
                            ed2Var.dismiss();
                            return;
                        default:
                            ed2Var.dismiss();
                            return;
                    }
                }
            });
        } else {
            toolbar.setShowBackBtn(true);
            toolbar.getBtnBack().setOnClickListener(new View.OnClickListener(this) { // from class: bd2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ed2 f451b;

                {
                    this.f451b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i2;
                    ed2 ed2Var = this.f451b;
                    switch (i3) {
                        case 0:
                            ed2Var.dismiss();
                            return;
                        case 1:
                            ed2Var.dismiss();
                            return;
                        case 2:
                            ed2Var.dismiss();
                            return;
                        case 3:
                            ed2Var.getClass();
                            bx3.G(view.getContext(), true, null);
                            ed2Var.dismiss();
                            return;
                        default:
                            ed2Var.dismiss();
                            return;
                    }
                }
            });
        }
        fl.j(toolbar, this);
        String str = ew3.k().f4307a;
        if (str == null) {
            str = "";
        }
        if (this.m != 1 && (button = (Button) findViewById(R.id.ok_btn)) != null) {
            button.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
            fl.n(this, button, 1000117);
        }
        int i3 = this.m;
        final int i4 = 4;
        if (i3 != 1) {
            final int i5 = 2;
            if (i3 != 2) {
                final int i6 = 3;
                if (i3 != 3) {
                    if (i3 == 4) {
                        String z = pd0.z(R.string.PremiumBindOtherAccount, this.n);
                        TextView textView = (TextView) findViewById(R.id.bind_another_tip1_tv);
                        if (Build.VERSION.SDK_INT >= 24) {
                            fromHtml = Html.fromHtml(z, 0);
                            textView.setText(fromHtml);
                        } else {
                            textView.setText(Html.fromHtml(z));
                        }
                        ((TextView) findViewById(R.id.bind_another_tip2_tv)).setText(pd0.y(R.string.PremiumSignInAccount));
                        Button button2 = (Button) findViewById(R.id.ok_btn);
                        button2.setText(pd0.y(R.string.SignIn));
                        button2.setOnClickListener(new View.OnClickListener(this) { // from class: bd2

                            /* renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ ed2 f451b;

                            {
                                this.f451b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                int i32 = i6;
                                ed2 ed2Var = this.f451b;
                                switch (i32) {
                                    case 0:
                                        ed2Var.dismiss();
                                        return;
                                    case 1:
                                        ed2Var.dismiss();
                                        return;
                                    case 2:
                                        ed2Var.dismiss();
                                        return;
                                    case 3:
                                        ed2Var.getClass();
                                        bx3.G(view.getContext(), true, null);
                                        ed2Var.dismiss();
                                        return;
                                    default:
                                        ed2Var.dismiss();
                                        return;
                                }
                            }
                        });
                        fl.n(this, (TextView) findViewById(R.id.cancel_btn), 1000138);
                        fl.n(this, textView, 1000139);
                        fl.n(this, (TextView) findViewById(R.id.bind_another_tip2_tv), 1000139);
                    }
                } else {
                    ((TextView) findViewById(R.id.bind_another_tip1_tv)).setText(pd0.y(R.string.PremiumBindKickedError));
                    ((TextView) findViewById(R.id.bind_another_tip2_tv)).setText(pd0.y(R.string.PremiumTakeBackByRestore));
                    Button button3 = (Button) findViewById(R.id.ok_btn);
                    button3.setText(pd0.y(R.string.RestorePurchase));
                    button3.setOnClickListener(new cd2(this, i2));
                    fl.n(this, (TextView) findViewById(R.id.bind_another_tip1_tv), 1000139);
                    fl.n(this, (TextView) findViewById(R.id.bind_another_tip2_tv), 1000139);
                    fl.n(this, (TextView) findViewById(R.id.cancel_btn), 1000138);
                }
            } else {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pd0.z(R.string.PremiumAlreadyBindFailed, str));
                bx3.i(spannableStringBuilder, str, new ForegroundColorSpan(-13982994));
                TextView textView2 = (TextView) findViewById(R.id.title_tv);
                textView2.setText(spannableStringBuilder);
                ((XTextViewNew) findViewById(R.id.purchase_remind_notice_tv)).setText(pd0.y(R.string.AccountAlreadyPremiumDesc));
                findViewById(R.id.ok_btn).setOnClickListener(new View.OnClickListener(this) { // from class: bd2

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ed2 f451b;

                    {
                        this.f451b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i32 = i5;
                        ed2 ed2Var = this.f451b;
                        switch (i32) {
                            case 0:
                                ed2Var.dismiss();
                                return;
                            case 1:
                                ed2Var.dismiss();
                                return;
                            case 2:
                                ed2Var.dismiss();
                                return;
                            case 3:
                                ed2Var.getClass();
                                bx3.G(view.getContext(), true, null);
                                ed2Var.dismiss();
                                return;
                            default:
                                ed2Var.dismiss();
                                return;
                        }
                    }
                });
                fl.n(this, textView2, 1000139);
                fl.n(this, (TextView) findViewById(R.id.purchase_remind_notice_tv), 1000139);
            }
        } else {
            fl.n(this, (TextView) findViewById(R.id.tvTitle), 1000139);
            fl.n(this, (TextView) findViewById(R.id.tvDesc1), 1000139);
            fl.n(this, (TextView) findViewById(R.id.tvDesc2), 1000139);
            fl.n(this, (TextView) findViewById(R.id.cancel_btn), 1000138);
            ((XTextViewNew) findViewById(R.id.account_tv)).setText(str);
            View findViewById = findViewById(R.id.vFailed);
            AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.ivFailed);
            fl.h(this, appCompatImageView, 1000139);
            appCompatImageView.setBackground(new zg2(1000137, 30 * tf3.F, 0.0f, false));
            findViewById.setBackground(new zg2(1000140, 10 * tf3.F, 0.0f, false));
            findViewById(R.id.retry_btn).setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
            fl.n(this, (TextView) findViewById(R.id.retry_btn), 1000117);
            fl.j(findViewById, this);
            findViewById(R.id.retry_btn).setOnClickListener(new cd2(this, i));
        }
        View findViewById2 = findViewById(R.id.cancel_btn);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: bd2

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ ed2 f451b;

                {
                    this.f451b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i32 = i4;
                    ed2 ed2Var = this.f451b;
                    switch (i32) {
                        case 0:
                            ed2Var.dismiss();
                            return;
                        case 1:
                            ed2Var.dismiss();
                            return;
                        case 2:
                            ed2Var.dismiss();
                            return;
                        case 3:
                            ed2Var.getClass();
                            bx3.G(view.getContext(), true, null);
                            ed2Var.dismiss();
                            return;
                        default:
                            ed2Var.dismiss();
                            return;
                    }
                }
            });
        }
    }
}
