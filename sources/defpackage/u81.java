package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class u81 extends t81 {
    public String c = "";

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            View findViewById = viewGroup.findViewById(R.id.ivBannerTip);
            if (findViewById != null) {
                m20.u0(findViewById);
            }
            TextView textView = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
            if (textView != null) {
                textView.setText(this.c);
                textView.setTextColor(-1);
                textView.setMovementMethod(null);
            }
            View findViewById2 = viewGroup.findViewById(R.id.connectStatusTip);
            if (findViewById2 != null) {
                findViewById2.setBackgroundResource(R.drawable.bg_goto_premium);
                m20.Y0(findViewById2);
                findViewById2.setOnClickListener(this);
            }
        }
    }

    @Override // defpackage.t81, android.view.View.OnClickListener
    public final void onClick(View view) {
    }
}
