package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class v81 extends t81 {
    public final String c;

    public v81(String str) {
        this.c = str;
    }

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            m20.u0(viewGroup.findViewById(R.id.connectStatusTip));
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        String str;
        if (viewGroup != null) {
            ac2 G = ew3.G();
            if (m20.L(this.c, "ryjpfh54p9")) {
                str = pd0.y(R.string.ProtocolAutoChangeToEverestForEverestLine);
            } else {
                String z = pd0.z(R.string.ProtocolAutoChangeToEverest, G.c);
                if (!G.f55a) {
                    str = pd0.z(R.string.ProtocolAutoChangeToNotEverest, G.f56b, G.c);
                } else {
                    str = z;
                }
            }
            View findViewById = viewGroup.findViewById(R.id.connectStatusTip);
            if (findViewById != null) {
                Resources resources = findViewById.getResources();
                Resources.Theme theme = findViewById.getContext().getTheme();
                ThreadLocal threadLocal = jk2.f2780a;
                GradientDrawable gradientDrawable = (GradientDrawable) ck2.a(resources, R.drawable.bg_connect_status_tip, theme);
                gradientDrawable.setColor(-8409877);
                findViewById.setBackground(gradientDrawable);
                TextView textView = (TextView) findViewById.findViewById(R.id.tvBannerTip);
                if (textView != null) {
                    textView.setTextColor(-1);
                }
                m20.Y0(findViewById);
                findViewById.setOnClickListener(null);
            }
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
            if (imageView != null) {
                m20.u0(imageView);
            }
            TextView textView2 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
            if (textView2 != null) {
                textView2.setText(str);
                textView2.setMovementMethod(null);
            }
        }
    }
}
