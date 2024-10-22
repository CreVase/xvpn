package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class w81 extends t81 {
    public boolean c;

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        if (this.c && viewGroup != null) {
            this.f4463b.removeMessages(0);
            this.c = false;
            m20.u0(viewGroup.findViewById(R.id.connectStatusTip));
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            String string = viewGroup.getContext().getString(R.string.HomeBannerReconnectHighlight);
            SpannableStringBuilder R = bx3.R(i23.k1(pd0.y(R.string.HomeBannerReconnect), string, "", false), bx3.g(string, 1, 0, 0, true, new ja(3), 102));
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
                textView2.setText(R);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
            }
            this.c = true;
            this.f4462a = new WeakReference(viewGroup);
            k9 k9Var = this.f4463b;
            k9Var.removeMessages(0);
            k9Var.sendEmptyMessageDelayed(1, 10000L);
        }
    }
}
