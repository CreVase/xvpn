package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class b91 extends t81 {
    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        View findViewById;
        if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
            m20.u0(findViewById);
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            String y = pd0.y(R.string.ContactSupport);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pd0.y(R.string.HomeBannerUserChooseSerevr));
            int W0 = i23.W0(0, spannableStringBuilder, y, true);
            if (W0 >= 0) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.banner.HomeBannerUserChooseSerevr$show$1$1$1
                    @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                    public final void updateDrawState(TextPaint textPaint) {
                        textPaint.setFakeBoldText(true);
                        textPaint.setUnderlineText(true);
                        textPaint.setColor(-13982994);
                    }
                }, W0, y.length() + W0, 33);
            }
            ImageView imageView = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
            if (imageView != null) {
                imageView.setImageResource(R.drawable.ic_reconnect_tip);
                m20.Y0(imageView);
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
            if (textView != null) {
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(null);
            }
            View findViewById = viewGroup.findViewById(R.id.connectStatusTip);
            if (findViewById != null) {
                Resources resources = findViewById.getResources();
                Resources.Theme theme = findViewById.getContext().getTheme();
                ThreadLocal threadLocal = jk2.f2780a;
                GradientDrawable gradientDrawable = (GradientDrawable) ck2.a(resources, R.drawable.bg_connect_status_tip, theme);
                gradientDrawable.setColor(-268125);
                findViewById.setBackground(gradientDrawable);
                TextView textView2 = (TextView) findViewById.findViewById(R.id.tvBannerTip);
                if (textView2 != null) {
                    textView2.setTextColor(-13421773);
                }
                m20.Y0(findViewById);
                findViewById.setOnClickListener(this);
            }
        }
    }

    @Override // defpackage.t81, android.view.View.OnClickListener
    public final void onClick(View view) {
        bx3.a(view.getContext());
        ew3.g("589pyhghcf");
    }
}
