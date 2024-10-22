package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.h;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class nq2 extends h implements ke1 {
    public static final /* synthetic */ int z = 0;
    public final TextView u;
    public final TextView v;
    public final TextView w;
    public final TextView x;
    public final /* synthetic */ oq2 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq2(oq2 oq2Var, View view, int i) {
        super(view);
        String string;
        this.y = oq2Var;
        TextView textView = (TextView) view.findViewById(R.id.tvSendEmail);
        this.u = textView;
        this.v = (TextView) view.findViewById(R.id.tvContactSupport);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_tips);
        this.w = textView2;
        TextView textView3 = (TextView) view.findViewById(R.id.tvTryAllLocation);
        this.x = textView3;
        int i2 = 4;
        if (i == 4) {
            m20.Y0(textView3);
            m20.u0(textView);
            textView3.setOnClickListener(new da(i2));
            Context z2 = zf3.z();
            textView2.setText((z2 == null || (string = z2.getString(R.string.CanNotFindStreaming)) == null) ? "" : string);
        }
        a();
    }

    @Override // defpackage.ke1
    public final void a() {
        this.w.setTextColor(v73.j(1000015));
        View view = this.f281a;
        ((TextView) view.findViewById(R.id.tv_tips)).setTextColor(v73.y());
        view.setBackgroundColor(v73.j(1000050));
        boolean l = v73.l();
        TextView textView = this.x;
        oq2 oq2Var = this.y;
        TextView textView2 = this.u;
        TextView textView3 = this.v;
        if (l) {
            if (oq2Var.e == 4) {
                textView.setBackground(zf3.A(R.drawable.bg_contact_support_dark));
                textView3.setBackground(zf3.A(R.drawable.bg_send_email_dark));
                textView3.setTextColor(-2500135);
                return;
            } else {
                textView2.setBackground(zf3.A(R.drawable.bg_send_email_dark));
                textView2.setTextColor(-2500135);
                textView3.setBackground(zf3.A(R.drawable.bg_contact_support_dark));
                return;
            }
        }
        int i = -16777216;
        if (oq2Var.e == 4) {
            textView.setBackground(zf3.A(R.drawable.bg_contact_support));
            textView3.setBackground(zf3.A(R.drawable.bg_send_email));
            Context z2 = zf3.z();
            if (z2 != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    Resources resources = z2.getResources();
                    if (resources != null) {
                        i = resources.getColor(R.color.send_email_text_color, z2.getTheme());
                    }
                } else {
                    Resources resources2 = z2.getResources();
                    if (resources2 != null) {
                        i = resources2.getColor(R.color.send_email_text_color);
                    }
                }
            }
            textView3.setTextColor(i);
            return;
        }
        textView2.setBackground(zf3.A(R.drawable.bg_send_email));
        textView3.setBackground(zf3.A(R.drawable.bg_contact_support));
        Context z3 = zf3.z();
        if (z3 != null) {
            if (Build.VERSION.SDK_INT >= 23) {
                Resources resources3 = z3.getResources();
                if (resources3 != null) {
                    i = resources3.getColor(R.color.send_email_text_color, z3.getTheme());
                }
            } else {
                Resources resources4 = z3.getResources();
                if (resources4 != null) {
                    i = resources4.getColor(R.color.send_email_text_color);
                }
            }
        }
        textView2.setTextColor(i);
    }
}
