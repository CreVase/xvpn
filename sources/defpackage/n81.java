package defpackage;

import a.du;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XTextViewNew;

/* loaded from: classes2.dex */
public final class n81 extends t81 {
    public final /* synthetic */ int c;
    public nk3 d;

    public /* synthetic */ n81(int i) {
        this.c = i;
    }

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        se1 se1Var;
        ConstraintLayout constraintLayout;
        switch (this.c) {
            case 0:
                if (viewGroup != null && ((x30) this.d) != null) {
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    x30 x30Var = (x30) this.d;
                    if (x30Var != null) {
                        constraintLayout = x30Var.c();
                    } else {
                        constraintLayout = null;
                    }
                    if (viewGroup.indexOfChild(constraintLayout) != -1) {
                        viewGroup2.removeAllViews();
                        m20.u0(viewGroup2);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (viewGroup != null && (se1Var = (se1) this.d) != null && viewGroup.indexOfChild((FrameLayout) se1Var.c) != -1) {
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    viewGroup3.removeAllViews();
                    m20.u0(viewGroup3);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        ViewParent parent;
        FrameLayout frameLayout3;
        ConstraintLayout c;
        ViewParent parent2;
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2 = null;
        switch (this.c) {
            case 0:
                if (viewGroup != null) {
                    x30 x30Var = (x30) this.d;
                    if (x30Var == null) {
                        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_goto_premium, viewGroup, false);
                        int i = R.id.ivBg;
                        ImageView imageView = (ImageView) m20.g0(inflate, R.id.ivBg);
                        if (imageView != null) {
                            i = R.id.ivCrown;
                            ImageView imageView2 = (ImageView) m20.g0(inflate, R.id.ivCrown);
                            if (imageView2 != null) {
                                i = R.id.text;
                                XTextViewNew xTextViewNew = (XTextViewNew) m20.g0(inflate, R.id.text);
                                if (xTextViewNew != null) {
                                    x30 x30Var2 = new x30((ConstraintLayout) inflate, imageView, imageView2, xTextViewNew, 4);
                                    x30Var2.c().setOnClickListener(this);
                                    x30Var = x30Var2;
                                }
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
                    }
                    this.d = x30Var;
                    XTextViewNew xTextViewNew2 = (XTextViewNew) x30Var.e;
                    if (xTextViewNew2 != null) {
                        xTextViewNew2.setText("Azərbaycanda sürətli və sabit əlaqəni əldə et.");
                    }
                    ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    m20.Y0(viewGroup2);
                    if (viewGroup2 != null) {
                        viewGroup2.removeAllViews();
                    }
                    x30 x30Var3 = (x30) this.d;
                    if (x30Var3 != null && (c = x30Var3.c()) != null && (parent2 = c.getParent()) != null) {
                        ViewGroup viewGroup3 = (ViewGroup) parent2;
                        x30 x30Var4 = (x30) this.d;
                        if (x30Var4 != null) {
                            constraintLayout = x30Var4.c();
                        } else {
                            constraintLayout = null;
                        }
                        viewGroup3.removeView(constraintLayout);
                    }
                    if (viewGroup2 != null) {
                        x30 x30Var5 = (x30) this.d;
                        if (x30Var5 != null) {
                            constraintLayout2 = x30Var5.c();
                        }
                        viewGroup2.addView(constraintLayout2);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (viewGroup != null) {
                    se1 se1Var = (se1) this.d;
                    if (se1Var == null) {
                        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_guide_to_rate, viewGroup, false);
                        int i2 = R.id.tvGuide;
                        TextView textView = (TextView) m20.g0(inflate2, R.id.tvGuide);
                        if (textView != null) {
                            i2 = R.id.vBg;
                            ImageView imageView3 = (ImageView) m20.g0(inflate2, R.id.vBg);
                            if (imageView3 != null) {
                                FrameLayout frameLayout4 = (FrameLayout) inflate2;
                                se1 se1Var2 = new se1(frameLayout4, textView, imageView3, 2);
                                frameLayout4.setOnClickListener(this);
                                se1Var = se1Var2;
                            }
                        }
                        throw new NullPointerException("Missing required view with ID: ".concat(inflate2.getResources().getResourceName(i2)));
                    }
                    this.d = se1Var;
                    ViewGroup viewGroup4 = (ViewGroup) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
                    m20.Y0(viewGroup4);
                    viewGroup4.removeAllViews();
                    se1 se1Var3 = (se1) this.d;
                    if (se1Var3 != null && (frameLayout2 = (FrameLayout) se1Var3.c) != null && (parent = frameLayout2.getParent()) != null) {
                        ViewGroup viewGroup5 = (ViewGroup) parent;
                        se1 se1Var4 = (se1) this.d;
                        if (se1Var4 != null) {
                            frameLayout3 = (FrameLayout) se1Var4.c;
                        } else {
                            frameLayout3 = null;
                        }
                        viewGroup5.removeView(frameLayout3);
                    }
                    se1 se1Var5 = (se1) this.d;
                    if (se1Var5 != null && (frameLayout = (FrameLayout) se1Var5.c) != null) {
                        viewGroup4.addView(frameLayout);
                    }
                    du.d(653, null);
                    ew3.Z("heb1g", "show");
                    return;
                }
                return;
        }
    }

    @Override // defpackage.t81, android.view.View.OnClickListener
    public final void onClick(View view) {
        Object parent;
        View view2;
        Context context;
        Object parent2;
        View view3;
        Context context2 = null;
        switch (this.c) {
            case 0:
                if (view != null && (parent2 = view.getParent()) != null) {
                    if (parent2 instanceof View) {
                        view3 = (View) parent2;
                    } else {
                        view3 = null;
                    }
                    if (view3 != null) {
                        context2 = view3.getContext();
                    }
                    if (context2 instanceof MainActivity) {
                        m20.C0(context2, 27);
                        ew3.g("546hj5bnt9");
                        ew3.j();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (view != null && (parent = view.getParent()) != null) {
                    if (parent instanceof View) {
                        view2 = (View) parent;
                    } else {
                        view2 = null;
                    }
                    if (view2 != null) {
                        context = view2.getContext();
                    } else {
                        context = null;
                    }
                    if (context instanceof MainActivity) {
                        int i = lg2.g;
                        v73.r(context);
                        ew3.g("zst999hhzg");
                        du.d(654, null);
                        ew3.Z("heb1g", "evaluation");
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
