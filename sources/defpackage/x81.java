package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.banner.BannerUtil$Companion$highlightInBlack$1;

/* loaded from: classes2.dex */
public final class x81 extends t81 {
    public View c;
    public ViewGroup d;

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        View view;
        if (viewGroup != null && (view = this.c) != null && viewGroup.findViewById(view.getId()) != null) {
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

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        TextView textView;
        ViewParent parent;
        this.d = viewGroup;
        if (viewGroup != null) {
            View view = this.c;
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                view.setOnClickListener(this);
            }
            this.c = view;
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
            m20.Y0(viewGroup2);
            viewGroup2.removeAllViews();
            View view2 = this.c;
            if (view2 != null && (parent = view2.getParent()) != null) {
                ((ViewGroup) parent).removeView(this.c);
            }
            View view3 = this.c;
            if (view3 != null && (textView = (TextView) view3.findViewById(R.id.text)) != null) {
                SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.GuideBannerSATitle));
                bx3.i(valueOf, pd0.y(R.string.StableVPNConnection), new BannerUtil$Companion$highlightInBlack$1());
                textView.setText(valueOf);
                textView.setTextSize(2, 16.0f);
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
                r61 r61Var = new r61(context);
                r61Var.l(25);
                r61Var.show();
                ew3.g("mr5new2s34");
                ew3.j();
            }
        }
    }
}
