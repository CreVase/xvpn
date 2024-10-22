package defpackage;

import android.text.SpannableString;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.banner.BannerUtil$Companion$highlightInBlack$1;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class a91 extends t81 {
    public TextView c;

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        TextView textView;
        if (viewGroup != null && (textView = this.c) != null) {
            if (viewGroup.findViewById(textView.getId()) != null) {
                ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                if (viewGroup2 != null) {
                    viewGroup2.removeAllViews();
                }
                if (viewGroup2 != null) {
                    m20.u0(viewGroup2);
                }
                ew3.i();
            }
            this.c = null;
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        ViewParent parent;
        if (viewGroup != null) {
            TextView textView = new TextView(viewGroup.getContext());
            textView.setTag("banner");
            textView.setBackgroundResource(R.drawable.bg_goto_premium2);
            textView.setPadding(bx3.t(viewGroup.getContext(), 20), bx3.t(viewGroup.getContext(), 15), bx3.t(viewGroup.getContext(), 20), bx3.t(viewGroup.getContext(), 15));
            textView.setTextColor(-1);
            SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.HomeBannerSupportServer));
            bx3.i(valueOf, pd0.y(R.string.Notice), new BannerUtil$Companion$highlightInBlack$1());
            textView.setText(valueOf);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            int t = bx3.t(viewGroup.getContext(), 10);
            layoutParams.leftMargin = t;
            layoutParams.rightMargin = t;
            textView.setLayoutParams(layoutParams);
            WeakHashMap weakHashMap = ll3.f3151a;
            textView.setId(vk3.a());
            this.c = textView;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
            if (viewGroup2 != null) {
                m20.Y0(viewGroup2);
            }
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
            }
            TextView textView2 = this.c;
            if (textView2 != null && (parent = textView2.getParent()) != null) {
                ((ViewGroup) parent).removeView(this.c);
            }
            if (viewGroup2 != null) {
                viewGroup2.addView(this.c);
            }
        }
    }
}
