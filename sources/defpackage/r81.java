package defpackage;

import a.du;
import android.app.Activity;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.banner.BannerUtil$Companion$highlightInBlack$1;

/* loaded from: classes2.dex */
public final class r81 extends t81 {
    public final /* synthetic */ int c;
    public View d;

    public /* synthetic */ r81(int i) {
        this.c = i;
    }

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        View view;
        View view2;
        View view3;
        switch (this.c) {
            case 0:
                if (viewGroup != null && (view2 = this.d) != null && viewGroup.findViewById(view2.getId()) != null) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    viewGroup2.removeAllViews();
                    m20.u0(viewGroup2);
                    ew3.i();
                }
                this.d = null;
                return;
            case 1:
                if (viewGroup != null && (view3 = this.d) != null && viewGroup.findViewById(view3.getId()) != null) {
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    if (viewGroup3 != null) {
                        viewGroup3.removeAllViews();
                    }
                    if (viewGroup3 != null) {
                        m20.u0(viewGroup3);
                    }
                    ew3.i();
                }
                this.d = null;
                return;
            case 2:
                if (viewGroup != null) {
                    m20.u0(viewGroup.findViewById(R.id.connectStatusTip));
                    View view4 = this.d;
                    if (view4 != null && viewGroup.findViewById(view4.getId()) != null) {
                        ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                        if (viewGroup4 != null) {
                            viewGroup4.removeAllViews();
                        }
                        if (viewGroup4 != null) {
                            m20.u0(viewGroup4);
                        }
                    }
                }
                this.d = null;
                return;
            case 3:
                if (viewGroup != null) {
                    View findViewById = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById != null) {
                        m20.u0(findViewById);
                    }
                    View view5 = this.d;
                    if (view5 != null && viewGroup.findViewById(view5.getId()) != null) {
                        ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                        viewGroup5.removeAllViews();
                        m20.u0(viewGroup5);
                    }
                }
                this.d = null;
                return;
            default:
                if (viewGroup != null && (view = this.d) != null && viewGroup.findViewById(view.getId()) != null) {
                    ViewGroup viewGroup6 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    if (viewGroup6 != null) {
                        viewGroup6.removeAllViews();
                    }
                    if (viewGroup6 != null) {
                        m20.u0(viewGroup6);
                    }
                }
                this.d = null;
                return;
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        ViewParent parent;
        ViewParent parent2;
        TextView textView;
        TextView textView2;
        ViewParent parent3;
        TextView textView3;
        ViewParent parent4;
        TextView textView4;
        ViewParent parent5;
        switch (this.c) {
            case 0:
                if (viewGroup != null) {
                    View view = this.d;
                    if (view == null) {
                        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                        view.setOnClickListener(this);
                    }
                    this.d = view;
                    String y = pd0.y(R.string.GoPremium2);
                    SpannableStringBuilder R = bx3.R(bx3.R(i23.k1(pd0.y(R.string.HomeBannerMMPurchase), y, "", false), "\n"), bx3.e(1, -14848, 18, y));
                    View view2 = this.d;
                    if (view2 != null && (textView = (TextView) view2.findViewById(R.id.text)) != null) {
                        textView.setText(R);
                    }
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    m20.Y0(viewGroup2);
                    viewGroup2.removeAllViews();
                    View view3 = this.d;
                    if (view3 != null && (parent2 = view3.getParent()) != null) {
                        ((ViewGroup) parent2).removeView(this.d);
                    }
                    viewGroup2.addView(this.d);
                    return;
                }
                return;
            case 1:
                if (viewGroup != null) {
                    View view4 = this.d;
                    if (view4 == null) {
                        view4 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                        view4.setOnClickListener(this);
                    }
                    this.d = view4;
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    if (viewGroup3 != null) {
                        m20.Y0(viewGroup3);
                    }
                    if (viewGroup3 != null) {
                        viewGroup3.removeAllViews();
                    }
                    View view5 = this.d;
                    if (view5 != null && (parent3 = view5.getParent()) != null) {
                        ((ViewGroup) parent3).removeView(this.d);
                    }
                    if (viewGroup3 != null) {
                        viewGroup3.addView(this.d);
                    }
                    String y2 = pd0.y(R.string.HomeBannerTryNow2);
                    SpannableStringBuilder R2 = bx3.R(bx3.R(i23.k1(pd0.y(R.string.HomeBannerOtherPurchase), y2, "", false), "\n"), bx3.e(1, -14848, 18, y2));
                    View view6 = this.d;
                    if (view6 != null && (textView2 = (TextView) view6.findViewById(R.id.text)) != null) {
                        textView2.setText(R2);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (viewGroup != null) {
                    View view7 = this.d;
                    if (view7 == null) {
                        view7 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                        view7.setOnClickListener(this);
                    }
                    this.d = view7;
                    ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    m20.Y0(viewGroup4);
                    viewGroup4.removeAllViews();
                    View view8 = this.d;
                    if (view8 != null && (parent4 = view8.getParent()) != null) {
                        ((ViewGroup) parent4).removeView(this.d);
                    }
                    viewGroup4.addView(this.d);
                    String y3 = pd0.y(R.string.HomeBannerTryNow);
                    SpannableStringBuilder R3 = bx3.R(bx3.R(i23.k1(pd0.y(R.string.HomeBannerSAConnectFailed), y3, "", false), "\n"), bx3.e(1, -14848, 18, y3));
                    View view9 = this.d;
                    if (view9 != null && (textView3 = (TextView) view9.findViewById(R.id.text)) != null) {
                        textView3.setText(R3);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (viewGroup != null) {
                    View view10 = this.d;
                    if (view10 == null) {
                        view10 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                        view10.setOnClickListener(this);
                    }
                    this.d = view10;
                    ViewGroup viewGroup5 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    if (viewGroup5 != null) {
                        m20.Y0(viewGroup5);
                    }
                    if (viewGroup5 != null) {
                        viewGroup5.removeAllViews();
                    }
                    View view11 = this.d;
                    if (view11 != null && (parent5 = view11.getParent()) != null) {
                        ((ViewGroup) parent5).removeView(this.d);
                    }
                    if (viewGroup5 != null) {
                        viewGroup5.addView(this.d);
                    }
                    String y4 = pd0.y(R.string.HomeBannerUAEConnectFailedPurchaseHightlight);
                    SpannableStringBuilder R4 = bx3.R(bx3.R(i23.k1(pd0.y(R.string.HomeBannerUAEConnectFailedPurchase), y4, "", false), "\n"), bx3.e(1, -14848, 18, y4));
                    View view12 = this.d;
                    if (view12 != null && (textView4 = (TextView) view12.findViewById(R.id.text)) != null) {
                        textView4.setText(R4);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (viewGroup != null) {
                    View view13 = this.d;
                    if (view13 == null) {
                        view13 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                        view13.setOnClickListener(this);
                    }
                    this.d = view13;
                    TextView textView5 = (TextView) view13.findViewById(R.id.text);
                    if (textView5 != null) {
                        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.HomeBannerUAEPurchase));
                        bx3.i(valueOf, pd0.y(R.string.StableVPNConnection), new BannerUtil$Companion$highlightInBlack$1());
                        textView5.setText(valueOf);
                        textView5.setTextSize(2, 16.0f);
                    }
                    ViewGroup viewGroup6 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    if (viewGroup6 != null) {
                        m20.Y0(viewGroup6);
                    }
                    if (viewGroup6 != null) {
                        viewGroup6.removeAllViews();
                    }
                    View view14 = this.d;
                    if (view14 != null && (parent = view14.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.d);
                    }
                    if (viewGroup6 != null) {
                        viewGroup6.addView(this.d);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.t81, android.view.View.OnClickListener
    public final void onClick(View view) {
        Object parent;
        View view2;
        Object parent2;
        View view3;
        Object parent3;
        View view4;
        Context context = null;
        switch (this.c) {
            case 0:
                if (view != null && (parent2 = view.getParent()) != null) {
                    if (parent2 instanceof View) {
                        view3 = (View) parent2;
                    } else {
                        view3 = null;
                    }
                    if (view3 != null) {
                        context = view3.getContext();
                    }
                    if (context instanceof MainActivity) {
                        m20.C0(context, 28);
                        ew3.g("aa9wh54cvy");
                        ew3.j();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (view != null && (parent3 = view.getParent()) != null) {
                    if (parent3 instanceof View) {
                        view4 = (View) parent3;
                    } else {
                        view4 = null;
                    }
                    if (view4 != null) {
                        context = view4.getContext();
                    }
                    if (context instanceof MainActivity) {
                        ((MainActivity) context).clickToPremiumPage(view);
                        ew3.g("247p2y8qjz");
                        ew3.j();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                Activity T = ya0.T(view);
                if (T != null || (T = tf3.t) != null) {
                    r61 r61Var = new r61(T);
                    r61Var.l(25);
                    r61Var.show();
                    ew3.j();
                    return;
                }
                return;
            case 3:
                Activity T2 = ya0.T(view);
                if (T2 != null || (T2 = tf3.t) != null) {
                    r61 r61Var2 = new r61(T2);
                    r61Var2.l(22);
                    r61Var2.show();
                    ew3.j();
                    return;
                }
                return;
            default:
                du.d(484, null);
                if (view != null && (parent = view.getParent()) != null) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                    if (view2 != null) {
                        context = view2.getContext();
                    }
                    if (context instanceof MainActivity) {
                        ((MainActivity) context).clickToPremiumGuide(view);
                        ew3.g("ts67q45ccg");
                        ew3.j();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
