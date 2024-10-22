package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.banner.BannerUtil$Companion$highlightInBlack$1;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class z81 extends t81 {
    public View c;

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        View view;
        if (viewGroup != null && (view = this.c) != null && viewGroup.findViewById(view.getId()) != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
            viewGroup2.removeAllViews();
            m20.u0(viewGroup2);
            ew3.i();
        }
        this.c = null;
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        String str;
        String str2;
        String str3;
        int d1;
        ViewParent parent;
        String string;
        if (viewGroup != null) {
            View view = this.c;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                view.setOnClickListener(this);
            }
            this.c = view;
            TextView textView = (TextView) view.findViewById(R.id.text);
            Context z = zf3.z();
            String str4 = "";
            if (z == null || (str = z.getString(R.string.StableConnectionIsOn)) == null) {
                str = "";
            }
            Context z2 = zf3.z();
            if (z2 == null || (str2 = z2.getString(R.string.StableConnectionBannerDesc)) == null) {
                str2 = "";
            }
            SpannableString valueOf = SpannableString.valueOf(str + "\n" + str2);
            Context z3 = zf3.z();
            if (z3 == null || (str3 = z3.getString(R.string.SettingsStableConnection)) == null) {
                str3 = "";
            }
            bx3.i(valueOf, str3, new ForegroundColorSpan() { // from class: com.security.xvpn.z35kb.banner.HomeBannerStableConnection$show$1$text$1$1
                @Override // android.text.style.ForegroundColorSpan, android.text.style.CharacterStyle
                public final void updateDrawState(TextPaint textPaint) {
                    textPaint.setColor(-9706269);
                }
            });
            Context z4 = zf3.z();
            if (z4 != null && (string = z4.getString(R.string.On)) != null) {
                str4 = string;
            }
            if (!m20.L("On", str4) && !m20.L("بر", str4)) {
                d1 = i23.d1(valueOf, str4, valueOf.length(), 4);
            } else {
                d1 = i23.d1(str, str4.toUpperCase(Locale.ROOT), 0, 6);
            }
            if (d1 != -1) {
                valueOf.setSpan(new BannerUtil$Companion$highlightInBlack$1(), d1, str4.length() + d1, 17);
            }
            if (textView != null) {
                textView.setText(valueOf);
            }
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
            m20.Y0(viewGroup2);
            viewGroup2.removeAllViews();
            View view2 = this.c;
            if (view2 != null && (parent = view2.getParent()) != null) {
                ((ViewGroup) parent).removeView(this.c);
            }
            viewGroup2.addView(this.c);
        }
    }

    @Override // defpackage.t81, android.view.View.OnClickListener
    public final void onClick(View view) {
        Object parent;
        View view2;
        if (view != null && (parent = view.getParent()) != null) {
            Context context = null;
            if (parent instanceof View) {
                view2 = (View) parent;
            } else {
                view2 = null;
            }
            if (view2 != null) {
                context = view2.getContext();
            }
            if (context instanceof MainActivity) {
                ew3.g("tzgbt6hhmf");
                ew3.j();
            }
        }
    }
}
