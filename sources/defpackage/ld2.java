package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.television.HomeActivity;

/* loaded from: classes2.dex */
public final class ld2 extends pn implements View.OnClickListener {
    public static final /* synthetic */ int p = 0;
    public final int m;
    public ImageView n;
    public ImageView o;

    public ld2(ic icVar, int i, int i2) {
        super(icVar, i);
        this.m = i2;
    }

    public static ld2 m(ic icVar, int i) {
        int i2;
        if (i != 1 && i != 2) {
            throw new IllegalArgumentException("type invalid!");
        }
        if (XApplication.c) {
            i2 = R.layout.dialog_purchase_remind_new_tv;
        } else {
            i2 = R.layout.dialog_purchase_remind_new;
        }
        return new ld2(icVar, i2, i);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        Activity ownerActivity;
        super.cancel();
        if (this.m != 1 || (ownerActivity = getOwnerActivity()) == null) {
            return;
        }
        if (XApplication.c) {
            ya0.I(ownerActivity, HomeActivity.class);
        } else {
            ya0.I(ownerActivity, MainActivity.class);
        }
    }

    @Override // defpackage.pn
    public final String l() {
        return "PurchaseRemindDialog";
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id = view.getId();
        if (id != R.id.ok_btn) {
            ot3 ot3Var = ot3.c;
            if (id != R.id.sign_in_btn) {
                if (id == R.id.sign_up_btn) {
                    Activity ownerActivity = getOwnerActivity();
                    if (ownerActivity != null && !ownerActivity.isFinishing()) {
                        ot3Var.f3728b = true;
                        bx3.G(ownerActivity, false, null);
                    }
                    dismiss();
                    return;
                }
                return;
            }
            Activity ownerActivity2 = getOwnerActivity();
            if (ownerActivity2 != null && !ownerActivity2.isFinishing()) {
                ot3Var.f3728b = true;
                bx3.G(ownerActivity2, true, null);
            }
            dismiss();
            return;
        }
        if (XApplication.c) {
            ya0.I(getOwnerActivity(), HomeActivity.class);
        } else {
            ya0.I(getOwnerActivity(), MainActivity.class);
        }
        cancel();
    }

    @Override // defpackage.pn, defpackage.qn, defpackage.ld, defpackage.t30, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView textView = (TextView) findViewById(R.id.purchase_remind_title_tv);
        TextView textView2 = (TextView) findViewById(R.id.purchase_remind_subtitle_tv);
        TextView textView3 = (TextView) findViewById(R.id.purchase_remind_notice_tv);
        Button button = (Button) findViewById(R.id.sign_up_btn);
        TextView textView4 = (TextView) findViewById(R.id.sign_in_btn);
        this.o = (ImageView) findViewById(R.id.vTopBg);
        Button button2 = (Button) findViewById(R.id.ok_btn);
        this.n = (ImageView) findViewById(R.id.ivAvatar);
        fl.n(this, textView3, 1000014);
        if (!XApplication.c) {
            fl.g(this, this.l, 1000004);
            fl.n(this, textView4, 1000138);
        }
        Drawable drawable = getContext().getDrawable(R.drawable.img_purchase_top_arch);
        fl.o(this, drawable, 1000137);
        findViewById(R.id.vArch).setBackground(drawable);
        if (v73.l()) {
            this.n.setImageResource(R.drawable.ic_purchase_succeed_avatar_dark);
            this.o.setColorFilter(1929379840);
        } else {
            this.n.setImageResource(R.drawable.ic_purchase_succeed_avatar);
            this.o.setColorFilter(0);
        }
        int i = 2;
        int i2 = this.m;
        if (i2 != 1) {
            if (i2 == 2) {
                textView.setText(pd0.y(R.string.PremiumBindSuccess));
                String str = ew3.k().f4307a;
                if (str == null) {
                    str = "";
                }
                textView2.setText(str);
                textView3.setText(pd0.y(R.string.PremiumBindSuccessTips));
                button.setVisibility(8);
                textView4.setVisibility(8);
                button2.setVisibility(0);
            }
        } else {
            textView.setText(pd0.y(R.string.Congratulations));
            textView2.setText(pd0.y(R.string.PremiumNoAccountSuccess));
            textView3.setText(pd0.y(R.string.PremiumSignUpTips));
            button2.setVisibility(8);
            button.setVisibility(0);
            textView4.setVisibility(0);
        }
        sm1.a(button2.getContext()).c(new Intent("RefreshUserInfoAction"));
        button.setOnClickListener(this);
        textView4.setOnClickListener(this);
        button2.setOnClickListener(this);
        findViewById(R.id.vClose).setOnClickListener(new q61(this, i));
        float f = 24;
        button.setBackground(v73.t(tf3.F * f, 0.0f, 1000116));
        button2.setBackground(v73.t(f * tf3.F, 0.0f, 1000116));
        fl.n(this, button, 1000117);
        fl.n(this, button2, 1000117);
    }

    @Override // defpackage.qn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        if (z) {
            return;
        }
        if (v73.l()) {
            this.n.setImageResource(R.drawable.ic_purchase_succeed_avatar_dark);
            this.o.setColorFilter(1929379840);
        } else {
            this.n.setImageResource(R.drawable.ic_purchase_succeed_avatar);
            this.o.setColorFilter(0);
        }
    }
}
