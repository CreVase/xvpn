package com.security.xvpn.z35kb.view;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.util.ColorFontSpan;
import defpackage.bx3;
import defpackage.cr1;
import defpackage.cu3;
import defpackage.eu3;
import defpackage.f70;
import defpackage.f83;
import defpackage.fu3;
import defpackage.hu3;
import defpackage.hx2;
import defpackage.md3;
import defpackage.mg2;
import defpackage.n01;
import defpackage.pd0;
import defpackage.tf3;
import defpackage.v73;

/* loaded from: classes2.dex */
public final class GuidePurchaseHeaderView extends fu3 {
    public static final /* synthetic */ int h = 0;
    public final AppCompatImageView e;
    public int f;
    public f83 g;

    public GuidePurchaseHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = 2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        appCompatImageView.setAdjustViewBounds(true);
        if (appCompatImageView.isInEditMode()) {
            appCompatImageView.setImageResource(R.drawable.img_guide_subscribe_choose_server);
        }
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        mg2 mg2Var = layoutParams instanceof mg2 ? (mg2) layoutParams : null;
        mg2Var = mg2Var == null ? new mg2() : mg2Var;
        ((FrameLayout.LayoutParams) mg2Var).width = -1;
        ((FrameLayout.LayoutParams) mg2Var).height = -2;
        appCompatImageView.setLayoutParams(mg2Var);
        addView(appCompatImageView);
        this.e = appCompatImageView;
    }

    public final int getGuideType() {
        return this.f;
    }

    public final ImageView getImageView() {
        return this.e;
    }

    public final f83 getThemeProvider() {
        return this.g;
    }

    public final void setGuideType(int i) {
        this.f = i;
    }

    public final void setImageResource(int i) {
        int i2 = this.f;
        AppCompatImageView appCompatImageView = this.e;
        if (i2 != 25 && i2 != 22) {
            appCompatImageView.setImageResource(i);
            return;
        }
        Drawable drawable = getResources().getDrawable(i);
        drawable.setColorFilter(1711276032, PorterDuff.Mode.SRC_ATOP);
        appCompatImageView.setImageDrawable(drawable);
    }

    public final void setThemeProvider(f83 f83Var) {
        this.g = f83Var;
    }

    public final void setType(int i) {
        mg2 mg2Var;
        mg2 mg2Var2;
        mg2 mg2Var3;
        mg2 mg2Var4;
        mg2 mg2Var5;
        mg2 mg2Var6;
        mg2 mg2Var7;
        f70 f70Var;
        f70 f70Var2;
        f70 f70Var3;
        LinearLayout.LayoutParams layoutParams;
        f70 f70Var4;
        f70 f70Var5;
        this.f = i;
        mg2 mg2Var8 = null;
        if (i != 2) {
            if (i != 22) {
                if (i != 25) {
                    if (i != 30) {
                        if (i == 100) {
                            setRatioWidth(340.0f);
                            setRatioHeight(414.0f);
                            cu3 cu3Var = new cu3(getContext(), null, 6);
                            cu3Var.setId(R.id.root);
                            View hu3Var = new hu3(cu3Var.getContext());
                            hu3Var.setId(R.id.guideline);
                            cu3Var.addView(hu3Var);
                            ViewGroup.LayoutParams layoutParams2 = hu3Var.getLayoutParams();
                            if (layoutParams2 instanceof f70) {
                                f70Var = (f70) layoutParams2;
                            } else {
                                f70Var = null;
                            }
                            if (f70Var == null) {
                                f70Var = new f70(-2, -2);
                            }
                            ((ViewGroup.MarginLayoutParams) f70Var).height = -2;
                            ((ViewGroup.MarginLayoutParams) f70Var).width = 1;
                            f70Var.e = R.id.root;
                            f70Var.h = R.id.root;
                            f70Var.E = 0.12352941f;
                            hu3Var.setLayoutParams(f70Var);
                            AppCompatTextView appCompatTextView = new AppCompatTextView(cu3Var.getContext(), null);
                            appCompatTextView.setId(-1);
                            appCompatTextView.setText("");
                            tf3.A0(appCompatTextView);
                            f83 f83Var = this.g;
                            if (f83Var != null) {
                                f83Var.j(appCompatTextView, 1000141);
                            }
                            appCompatTextView.setText(pd0.y(R.string.GuideHeaderPremiumConnected));
                            appCompatTextView.setTextSize(20.0f);
                            appCompatTextView.setTypeface(n01.c());
                            appCompatTextView.setGravity(17);
                            cu3Var.addView(appCompatTextView);
                            ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
                            if (layoutParams3 instanceof f70) {
                                f70Var2 = (f70) layoutParams3;
                            } else {
                                f70Var2 = null;
                            }
                            if (f70Var2 == null) {
                                f70Var2 = new f70(-2, -2);
                            }
                            ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
                            ((ViewGroup.MarginLayoutParams) f70Var2).width = -1;
                            f70Var2.i = R.id.root;
                            ((ViewGroup.MarginLayoutParams) f70Var2).topMargin = tf3.K(15);
                            ((ViewGroup.MarginLayoutParams) f70Var2).leftMargin = tf3.K(25);
                            ((ViewGroup.MarginLayoutParams) f70Var2).rightMargin = tf3.K(25);
                            appCompatTextView.setLayoutParams(f70Var2);
                            AppCompatTextView appCompatTextView2 = new AppCompatTextView(cu3Var.getContext(), null);
                            appCompatTextView2.setId(-1);
                            appCompatTextView2.setText("");
                            tf3.A0(appCompatTextView2);
                            f83 f83Var2 = this.g;
                            if (f83Var2 != null) {
                                f83Var2.j(appCompatTextView2, 1000141);
                            }
                            appCompatTextView2.setText(pd0.y(R.string.GuideHeaderFree));
                            appCompatTextView2.setTextSize(13.0f);
                            appCompatTextView2.setTypeface(n01.c());
                            cu3Var.addView(appCompatTextView2);
                            ViewGroup.LayoutParams layoutParams4 = appCompatTextView2.getLayoutParams();
                            if (layoutParams4 instanceof f70) {
                                f70Var3 = (f70) layoutParams4;
                            } else {
                                f70Var3 = null;
                            }
                            if (f70Var3 == null) {
                                f70Var3 = new f70(-2, -2);
                            }
                            ((ViewGroup.MarginLayoutParams) f70Var3).width = -2;
                            ((ViewGroup.MarginLayoutParams) f70Var3).height = -2;
                            f70Var3.i = R.id.root;
                            f70Var3.l = R.id.root;
                            f70Var3.e = R.id.guideline;
                            ((ViewGroup.MarginLayoutParams) f70Var3).leftMargin = tf3.K(10);
                            f70Var3.F = 0.3188406f;
                            appCompatTextView2.setLayoutParams(f70Var3);
                            eu3 h2 = hx2.h(cu3Var.getContext(), null, 6, 0, 0);
                            h2.setId(-1);
                            AppCompatTextView appCompatTextView3 = new AppCompatTextView(h2.getContext(), null);
                            appCompatTextView3.setId(-1);
                            appCompatTextView3.setText("");
                            tf3.A0(appCompatTextView3);
                            f83 f83Var3 = this.g;
                            if (f83Var3 != null) {
                                f83Var3.j(appCompatTextView3, 1000141);
                            }
                            appCompatTextView3.setText(pd0.y(R.string.PremiumServers));
                            appCompatTextView3.setTextSize(13.0f);
                            appCompatTextView3.setTypeface(n01.c());
                            h2.addView(appCompatTextView3);
                            AppCompatTextView appCompatTextView4 = new AppCompatTextView(h2.getContext(), null);
                            appCompatTextView4.setId(-1);
                            appCompatTextView4.setText("");
                            tf3.A0(appCompatTextView4);
                            f83 f83Var4 = this.g;
                            if (f83Var4 != null) {
                                f83Var4.j(appCompatTextView4, 1000142);
                            }
                            appCompatTextView4.setText(pd0.y(R.string.UltraFast));
                            appCompatTextView4.setTextSize(13.0f);
                            appCompatTextView4.setTypeface(n01.c());
                            h2.addView(appCompatTextView4);
                            ViewGroup.LayoutParams layoutParams5 = appCompatTextView4.getLayoutParams();
                            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                                layoutParams = (LinearLayout.LayoutParams) layoutParams5;
                            } else {
                                layoutParams = null;
                            }
                            if (layoutParams == null) {
                                layoutParams = new LinearLayout.LayoutParams(-2, -2);
                            }
                            layoutParams.width = -2;
                            layoutParams.height = -2;
                            layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
                            layoutParams.gravity = Math.max(-1, layoutParams.gravity);
                            layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
                            layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
                            layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
                            layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
                            layoutParams.leftMargin = tf3.K(8);
                            appCompatTextView4.setLayoutParams(layoutParams);
                            if (h2.getAttachToParent()) {
                                cu3Var.addView(h2);
                            }
                            ViewGroup.LayoutParams layoutParams6 = h2.getLayoutParams();
                            if (layoutParams6 instanceof f70) {
                                f70Var4 = (f70) layoutParams6;
                            } else {
                                f70Var4 = null;
                            }
                            if (f70Var4 == null) {
                                f70Var4 = new f70(-2, -2);
                            }
                            ((ViewGroup.MarginLayoutParams) f70Var4).width = -2;
                            ((ViewGroup.MarginLayoutParams) f70Var4).height = -2;
                            f70Var4.i = R.id.root;
                            f70Var4.l = R.id.root;
                            f70Var4.e = R.id.guideline;
                            ((ViewGroup.MarginLayoutParams) f70Var4).leftMargin = tf3.K(10);
                            f70Var4.F = 0.49033818f;
                            h2.setLayoutParams(f70Var4);
                            AppCompatButton appCompatButton = new AppCompatButton(cu3Var.getContext(), null);
                            appCompatButton.setId(-1);
                            appCompatButton.setText("");
                            tf3.A0(appCompatButton);
                            appCompatButton.setText(pd0.y(R.string.GetPremiumServers));
                            appCompatButton.setTextColor(-13421773);
                            appCompatButton.setTextSize(17.0f);
                            appCompatButton.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
                            f83 f83Var5 = this.g;
                            if (f83Var5 != null) {
                                f83Var5.j(appCompatButton, 1000117);
                            }
                            appCompatButton.setOnClickListener(new cr1(appCompatButton, 29));
                            cu3Var.addView(appCompatButton);
                            ViewGroup.LayoutParams layoutParams7 = appCompatButton.getLayoutParams();
                            if (layoutParams7 instanceof f70) {
                                f70Var5 = (f70) layoutParams7;
                            } else {
                                f70Var5 = null;
                            }
                            if (f70Var5 == null) {
                                f70Var5 = new f70(-2, -2);
                            }
                            ((ViewGroup.MarginLayoutParams) f70Var5).height = -2;
                            ((ViewGroup.MarginLayoutParams) f70Var5).width = -1;
                            f70Var5.i = R.id.root;
                            f70Var5.l = R.id.root;
                            f70Var5.F = 0.8067633f;
                            ((ViewGroup.MarginLayoutParams) f70Var5).height = tf3.K(44);
                            ((ViewGroup.MarginLayoutParams) f70Var5).leftMargin = tf3.K(35);
                            ((ViewGroup.MarginLayoutParams) f70Var5).rightMargin = tf3.K(35);
                            appCompatButton.setLayoutParams(f70Var5);
                            if (cu3Var.getAttachToParent()) {
                                addView(cu3Var);
                            }
                            ViewGroup.LayoutParams layoutParams8 = cu3Var.getLayoutParams();
                            if (layoutParams8 instanceof mg2) {
                                mg2Var8 = (mg2) layoutParams8;
                            }
                            if (mg2Var8 == null) {
                                mg2Var8 = new mg2();
                            }
                            ((FrameLayout.LayoutParams) mg2Var8).width = -1;
                            ((FrameLayout.LayoutParams) mg2Var8).height = -1;
                            cu3Var.setLayoutParams(mg2Var8);
                            return;
                        }
                        return;
                    }
                    setRatioWidth(375.0f);
                    setRatioHeight(273.0f);
                    AppCompatTextView appCompatTextView5 = new AppCompatTextView(getContext(), null);
                    appCompatTextView5.setId(-1);
                    appCompatTextView5.setText("");
                    tf3.A0(appCompatTextView5);
                    appCompatTextView5.setText(pd0.y(R.string.ConnectFailed));
                    appCompatTextView5.setTextColor(-1);
                    appCompatTextView5.setTextSize(18.0f);
                    appCompatTextView5.setTypeface(n01.a());
                    appCompatTextView5.setGravity(1);
                    ViewGroup.LayoutParams layoutParams9 = appCompatTextView5.getLayoutParams();
                    if (layoutParams9 instanceof mg2) {
                        mg2Var7 = (mg2) layoutParams9;
                    } else {
                        mg2Var7 = null;
                    }
                    if (mg2Var7 == null) {
                        mg2Var7 = new mg2();
                    }
                    ((FrameLayout.LayoutParams) mg2Var7).gravity = 1;
                    mg2Var7.d = 60.0f;
                    mg2Var7.c = 20.0f;
                    mg2Var7.e = 20.0f;
                    appCompatTextView5.setLayoutParams(mg2Var7);
                    addView(appCompatTextView5);
                    AppCompatTextView appCompatTextView6 = new AppCompatTextView(getContext(), null);
                    appCompatTextView6.setId(-1);
                    appCompatTextView6.setText("");
                    tf3.A0(appCompatTextView6);
                    SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.GuideHeaderIPOnlyForPremium));
                    bx3.i(valueOf, pd0.y(R.string.OnlyForPremium), new ColorFontSpan(n01.c(), -74696));
                    appCompatTextView6.setText(valueOf);
                    appCompatTextView6.setTextColor(-1);
                    appCompatTextView6.setTextSize(14.0f);
                    appCompatTextView6.setLineSpacing(24 * tf3.F, 0.0f);
                    appCompatTextView6.setTypeface(n01.d());
                    appCompatTextView6.setGravity(1);
                    ViewGroup.LayoutParams layoutParams10 = appCompatTextView6.getLayoutParams();
                    if (layoutParams10 instanceof mg2) {
                        mg2Var8 = (mg2) layoutParams10;
                    }
                    if (mg2Var8 == null) {
                        mg2Var8 = new mg2();
                    }
                    ((FrameLayout.LayoutParams) mg2Var8).gravity = 1;
                    mg2Var8.d = 94.0f;
                    mg2Var8.c = 20.0f;
                    mg2Var8.e = 20.0f;
                    appCompatTextView6.setLayoutParams(mg2Var8);
                    addView(appCompatTextView6);
                    return;
                }
                setRatioWidth(375.0f);
                setRatioHeight(400.0f);
                AppCompatTextView appCompatTextView7 = new AppCompatTextView(getContext(), null);
                appCompatTextView7.setId(-1);
                appCompatTextView7.setText("");
                tf3.A0(appCompatTextView7);
                appCompatTextView7.setText(pd0.y(R.string.GuideHeaderSATitle));
                appCompatTextView7.setTextColor(-1);
                appCompatTextView7.setTextSize(19.0f);
                appCompatTextView7.setLineSpacing(28 * tf3.F, 0.0f);
                appCompatTextView7.setTypeface(n01.a());
                appCompatTextView7.setGravity(1);
                ViewGroup.LayoutParams layoutParams11 = appCompatTextView7.getLayoutParams();
                if (layoutParams11 instanceof mg2) {
                    mg2Var6 = (mg2) layoutParams11;
                } else {
                    mg2Var6 = null;
                }
                if (mg2Var6 == null) {
                    mg2Var6 = new mg2();
                }
                ((FrameLayout.LayoutParams) mg2Var6).gravity = 1;
                mg2Var6.d = 40.0f;
                mg2Var6.c = 20.0f;
                mg2Var6.e = 20.0f;
                appCompatTextView7.setLayoutParams(mg2Var6);
                addView(appCompatTextView7);
                AppCompatTextView appCompatTextView8 = new AppCompatTextView(getContext(), null);
                appCompatTextView8.setId(-1);
                appCompatTextView8.setText("");
                tf3.A0(appCompatTextView8);
                appCompatTextView8.setText(pd0.y(R.string.GuideHeaderSADesc));
                appCompatTextView8.setTextColor(-1);
                appCompatTextView8.setTextSize(16.0f);
                appCompatTextView8.setLineSpacing(24 * tf3.F, 0.0f);
                appCompatTextView8.setTypeface(n01.a());
                appCompatTextView8.setGravity(1);
                ViewGroup.LayoutParams layoutParams12 = appCompatTextView8.getLayoutParams();
                if (layoutParams12 instanceof mg2) {
                    mg2Var8 = (mg2) layoutParams12;
                }
                if (mg2Var8 == null) {
                    mg2Var8 = new mg2();
                }
                ((FrameLayout.LayoutParams) mg2Var8).gravity = 1;
                mg2Var8.d = 103.0f;
                mg2Var8.c = 20.0f;
                mg2Var8.e = 20.0f;
                appCompatTextView8.setLayoutParams(mg2Var8);
                addView(appCompatTextView8);
                return;
            }
            setRatioWidth(375.0f);
            setRatioHeight(400.0f);
            AppCompatTextView appCompatTextView9 = new AppCompatTextView(getContext(), null);
            appCompatTextView9.setId(-1);
            appCompatTextView9.setText("");
            tf3.A0(appCompatTextView9);
            appCompatTextView9.setText(pd0.y(R.string.HomeBannerUAEPurchase));
            appCompatTextView9.setTextColor(-1);
            appCompatTextView9.setTextSize(19.0f);
            appCompatTextView9.setLineSpacing(28 * tf3.F, 0.0f);
            appCompatTextView9.setTypeface(n01.a());
            appCompatTextView9.setGravity(1);
            ViewGroup.LayoutParams layoutParams13 = appCompatTextView9.getLayoutParams();
            if (layoutParams13 instanceof mg2) {
                mg2Var5 = (mg2) layoutParams13;
            } else {
                mg2Var5 = null;
            }
            if (mg2Var5 == null) {
                mg2Var5 = new mg2();
            }
            ((FrameLayout.LayoutParams) mg2Var5).gravity = 1;
            mg2Var5.d = 40.0f;
            mg2Var5.c = 20.0f;
            mg2Var5.e = 20.0f;
            appCompatTextView9.setLayoutParams(mg2Var5);
            addView(appCompatTextView9);
            AppCompatTextView appCompatTextView10 = new AppCompatTextView(getContext(), null);
            appCompatTextView10.setId(-1);
            appCompatTextView10.setText("");
            tf3.A0(appCompatTextView10);
            appCompatTextView10.setText(pd0.y(R.string.GuideHeaderUAEGuide));
            appCompatTextView10.setTextColor(-1);
            appCompatTextView10.setTextSize(16.0f);
            appCompatTextView10.setLineSpacing(24 * tf3.F, 0.0f);
            appCompatTextView10.setTypeface(n01.a());
            appCompatTextView10.setGravity(1);
            ViewGroup.LayoutParams layoutParams14 = appCompatTextView10.getLayoutParams();
            if (layoutParams14 instanceof mg2) {
                mg2Var8 = (mg2) layoutParams14;
            }
            if (mg2Var8 == null) {
                mg2Var8 = new mg2();
            }
            ((FrameLayout.LayoutParams) mg2Var8).gravity = 1;
            mg2Var8.d = 103.0f;
            mg2Var8.c = 20.0f;
            mg2Var8.e = 20.0f;
            appCompatTextView10.setLayoutParams(mg2Var8);
            addView(appCompatTextView10);
            return;
        }
        setRatioWidth(375.0f);
        setRatioHeight(360.0f);
        AppCompatTextView appCompatTextView11 = new AppCompatTextView(getContext(), null);
        appCompatTextView11.setId(-1);
        appCompatTextView11.setText("");
        tf3.A0(appCompatTextView11);
        String y = pd0.y(R.string.GuideHeaderPremiumServers);
        md3 md3Var = md3.t;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y);
        md3Var.invoke(spannableStringBuilder);
        appCompatTextView11.setText(spannableStringBuilder);
        appCompatTextView11.setTextColor(-1);
        appCompatTextView11.setTextSize(17.0f);
        appCompatTextView11.setLineSpacing(22 * tf3.F, 0.0f);
        appCompatTextView11.setGravity(1);
        ViewGroup.LayoutParams layoutParams15 = appCompatTextView11.getLayoutParams();
        if (layoutParams15 instanceof mg2) {
            mg2Var = (mg2) layoutParams15;
        } else {
            mg2Var = null;
        }
        if (mg2Var == null) {
            mg2Var = new mg2();
        }
        ((FrameLayout.LayoutParams) mg2Var).gravity = 1;
        mg2Var.d = 65.0f;
        mg2Var.c = 35.0f;
        mg2Var.e = 35.0f;
        appCompatTextView11.setLayoutParams(mg2Var);
        addView(appCompatTextView11);
        AppCompatTextView appCompatTextView12 = new AppCompatTextView(getContext(), null);
        appCompatTextView12.setId(-1);
        appCompatTextView12.setText("");
        tf3.A0(appCompatTextView12);
        appCompatTextView12.setText(pd0.y(R.string.GuideHeaderPremium));
        appCompatTextView12.setTextColor(-1);
        appCompatTextView12.setWidth(-1);
        appCompatTextView12.setGravity(1);
        ViewGroup.LayoutParams layoutParams16 = appCompatTextView12.getLayoutParams();
        if (layoutParams16 instanceof mg2) {
            mg2Var2 = (mg2) layoutParams16;
        } else {
            mg2Var2 = null;
        }
        if (mg2Var2 == null) {
            mg2Var2 = new mg2();
        }
        mg2Var2.d = 120.0f;
        mg2Var2.c = 35.0f;
        mg2Var2.e = 35.0f;
        ((FrameLayout.LayoutParams) mg2Var2).width = -1;
        appCompatTextView12.setLayoutParams(mg2Var2);
        addView(appCompatTextView12);
        AppCompatTextView appCompatTextView13 = new AppCompatTextView(getContext(), null);
        appCompatTextView13.setId(-1);
        appCompatTextView13.setText("");
        tf3.A0(appCompatTextView13);
        appCompatTextView13.setText(pd0.y(R.string.GuideHeaderFree));
        appCompatTextView13.setTextColor(-1);
        appCompatTextView13.setTextSize(12.0f);
        ViewGroup.LayoutParams layoutParams17 = appCompatTextView13.getLayoutParams();
        if (layoutParams17 instanceof mg2) {
            mg2Var3 = (mg2) layoutParams17;
        } else {
            mg2Var3 = null;
        }
        if (mg2Var3 == null) {
            mg2Var3 = new mg2();
        }
        mg2Var3.d = 193.0f;
        mg2Var3.c = 89.0f;
        appCompatTextView13.setLayoutParams(mg2Var3);
        addView(appCompatTextView13);
        AppCompatTextView appCompatTextView14 = new AppCompatTextView(getContext(), null);
        appCompatTextView14.setId(-1);
        appCompatTextView14.setText("");
        tf3.A0(appCompatTextView14);
        appCompatTextView14.setText(pd0.y(R.string.GuideHeaderSpeed));
        appCompatTextView14.setTextColor(-1);
        appCompatTextView14.setTextSize(12.0f);
        appCompatTextView14.setTypeface(n01.a());
        appCompatTextView14.setTextColor(-74696);
        ViewGroup.LayoutParams layoutParams18 = appCompatTextView14.getLayoutParams();
        if (layoutParams18 instanceof mg2) {
            mg2Var4 = (mg2) layoutParams18;
        } else {
            mg2Var4 = null;
        }
        if (mg2Var4 == null) {
            mg2Var4 = new mg2();
        }
        ((FrameLayout.LayoutParams) mg2Var4).gravity = 5;
        mg2Var4.e = 43.0f;
        mg2Var4.d = 232.0f;
        appCompatTextView14.setLayoutParams(mg2Var4);
        addView(appCompatTextView14);
        AppCompatTextView appCompatTextView15 = new AppCompatTextView(getContext(), null);
        appCompatTextView15.setId(-1);
        appCompatTextView15.setText("");
        tf3.A0(appCompatTextView15);
        appCompatTextView15.setText(pd0.y(R.string.PremiumServers));
        appCompatTextView15.setTextColor(-1);
        appCompatTextView15.setTextSize(12.0f);
        ViewGroup.LayoutParams layoutParams19 = appCompatTextView15.getLayoutParams();
        if (layoutParams19 instanceof mg2) {
            mg2Var8 = (mg2) layoutParams19;
        }
        if (mg2Var8 == null) {
            mg2Var8 = new mg2();
        }
        ((FrameLayout.LayoutParams) mg2Var8).gravity = 5;
        mg2Var8.e = 43.0f;
        mg2Var8.d = 245.0f;
        appCompatTextView15.setLayoutParams(mg2Var8);
        addView(appCompatTextView15);
    }
}
