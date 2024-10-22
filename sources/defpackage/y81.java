package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class y81 extends t81 {
    public boolean c;

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        if (this.c && viewGroup != null) {
            this.c = false;
            m20.u0(viewGroup.findViewById(R.id.connectStatusTip));
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        int i;
        if (viewGroup != null) {
            if (ew3.C()) {
                i = R.string.HomeBannerSplitTunnelingNotUseVpn;
            } else {
                i = R.string.HomeBannerSplitTunnelingUseVpn;
            }
            SpannableString valueOf = SpannableString.valueOf(pd0.y(i));
            bx3.i(valueOf, pd0.y(R.string.SplitTunneling), new ja(4));
            View findViewById = viewGroup.findViewById(R.id.connectStatusTip);
            if (findViewById != null) {
                Resources resources = findViewById.getResources();
                Resources.Theme theme = findViewById.getContext().getTheme();
                ThreadLocal threadLocal = jk2.f2780a;
                GradientDrawable gradientDrawable = (GradientDrawable) ck2.a(resources, R.drawable.bg_connect_status_tip, theme);
                gradientDrawable.setColor(-268125);
                findViewById.setBackground(gradientDrawable);
                TextView textView = (TextView) findViewById.findViewById(R.id.tvBannerTip);
                if (textView != null) {
                    textView.setTextColor(-13421773);
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
                textView2.setText(valueOf);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.c = true;
            this.f4462a = new WeakReference(viewGroup);
        }
    }
}
