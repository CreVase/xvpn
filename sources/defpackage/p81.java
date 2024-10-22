package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.security.xvpn.z35kb.AdvancedFeaturesActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;
import com.security.xvpn.z35kb.menu.OtherDevicesForPCActivity;
import com.security.xvpn.z35kb.quickconn.ApplyQuickConnActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class p81 extends t81 {
    public final /* synthetic */ int c;

    public /* synthetic */ p81(int i) {
        this.c = i;
    }

    @Override // defpackage.t81
    public final void a(ViewGroup viewGroup) {
        View findViewById;
        View findViewById2;
        View findViewById3;
        View findViewById4;
        View findViewById5;
        View findViewById6;
        int i = this.c;
        k9 k9Var = this.f4463b;
        switch (i) {
            case 0:
                if (viewGroup != null && (findViewById = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
                    findViewById.setOnClickListener(null);
                    m20.u0(findViewById);
                    return;
                }
                return;
            case 1:
                if (viewGroup != null) {
                    m20.u0(viewGroup.findViewById(R.id.connectStatusTip));
                    return;
                }
                return;
            case 2:
                if (viewGroup != null && (findViewById2 = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
                    findViewById2.setOnClickListener(null);
                    m20.u0(findViewById2);
                    return;
                }
                return;
            case 3:
                if (viewGroup != null && (findViewById3 = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
                    findViewById3.setOnClickListener(null);
                    m20.u0(findViewById3);
                    return;
                }
                return;
            case 4:
                if (viewGroup != null && (findViewById4 = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
                    findViewById4.setOnClickListener(null);
                    m20.u0(findViewById4);
                    return;
                }
                return;
            case 5:
                if (viewGroup != null && (findViewById5 = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
                    findViewById5.setOnClickListener(null);
                    m20.u0(findViewById5);
                    return;
                }
                return;
            case 6:
                if (viewGroup != null && (findViewById6 = viewGroup.findViewById(R.id.connectStatusTip)) != null) {
                    findViewById6.setOnClickListener(null);
                    m20.u0(findViewById6);
                    return;
                }
                return;
            case 7:
                if (viewGroup != null) {
                    k9Var.removeMessages(0);
                    View findViewById7 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById7 != null) {
                        m20.u0(findViewById7);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (viewGroup != null) {
                    k9Var.removeMessages(0);
                    m20.u0(viewGroup.findViewById(R.id.connectStatusTip));
                    return;
                }
                return;
        }
    }

    @Override // defpackage.t81
    public final void b(ViewGroup viewGroup) {
        Activity T;
        int i = this.c;
        k9 k9Var = this.f4463b;
        switch (i) {
            case 0:
                if (viewGroup != null) {
                    ImageView imageView = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView != null) {
                        imageView.setImageResource(R.drawable.ic_bubble_app_control);
                        m20.Y0(imageView);
                    }
                    TextView textView = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView != null) {
                        textView.setText(pd0.y(R.string.HomeBannerAppControl));
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
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (viewGroup != null) {
                    String y = pd0.y(R.string.ContactSupport);
                    SpannableStringBuilder R = bx3.R(i23.k1(pd0.y(R.string.HomeBannerConnectFailed), y, "", true), bx3.g(y, 1, 0, 0, false, new ja(2), 102));
                    View findViewById2 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById2 != null) {
                        Resources resources2 = findViewById2.getResources();
                        Resources.Theme theme2 = findViewById2.getContext().getTheme();
                        ThreadLocal threadLocal2 = jk2.f2780a;
                        GradientDrawable gradientDrawable2 = (GradientDrawable) ck2.a(resources2, R.drawable.bg_connect_status_tip, theme2);
                        gradientDrawable2.setColor(-8409877);
                        findViewById2.setBackground(gradientDrawable2);
                        TextView textView3 = (TextView) findViewById2.findViewById(R.id.tvBannerTip);
                        if (textView3 != null) {
                            textView3.setTextColor(-1);
                        }
                        m20.Y0(findViewById2);
                        findViewById2.setOnClickListener(null);
                    }
                    ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView2 != null) {
                        m20.u0(imageView2);
                    }
                    TextView textView4 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView4 != null) {
                        textView4.setText(R);
                        textView4.setMovementMethod(LinkMovementMethod.getInstance());
                        return;
                    }
                    return;
                }
                return;
            case 2:
                if (viewGroup != null) {
                    SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.HomeBannerDisconnectTimeout));
                    bx3.i(valueOf, pd0.y(R.string.HomeBannerDisconnectTimeoutHighlight), new q81(0));
                    View findViewById3 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById3 != null) {
                        Resources resources3 = findViewById3.getResources();
                        Resources.Theme theme3 = findViewById3.getContext().getTheme();
                        ThreadLocal threadLocal3 = jk2.f2780a;
                        GradientDrawable gradientDrawable3 = (GradientDrawable) ck2.a(resources3, R.drawable.bg_connect_status_tip, theme3);
                        gradientDrawable3.setColor(-8409877);
                        findViewById3.setBackground(gradientDrawable3);
                        TextView textView5 = (TextView) findViewById3.findViewById(R.id.tvBannerTip);
                        if (textView5 != null) {
                            textView5.setTextColor(-1);
                        }
                        m20.Y0(findViewById3);
                        findViewById3.setOnClickListener(this);
                    }
                    ((TextView) viewGroup.findViewById(R.id.tvBannerTip)).setText(valueOf);
                    m20.u0(viewGroup.findViewById(R.id.ivBannerTip));
                    if (k13.f2871a.getAndSet(false) && (T = ya0.T(viewGroup)) != null && (T instanceof ic)) {
                        t9.w0(((ic) T).getSupportFragmentManager(), new fv2(T, 6));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                if (viewGroup != null) {
                    ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView3 != null) {
                        imageView3.setImageResource(R.drawable.ic_bubble_kill_switch);
                        m20.Y0(imageView3);
                    }
                    TextView textView6 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView6 != null) {
                        textView6.setText(pd0.y(R.string.HomeBannerKillSwitch));
                        textView6.setMovementMethod(null);
                    }
                    View findViewById4 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById4 != null) {
                        Resources resources4 = findViewById4.getResources();
                        Resources.Theme theme4 = findViewById4.getContext().getTheme();
                        ThreadLocal threadLocal4 = jk2.f2780a;
                        GradientDrawable gradientDrawable4 = (GradientDrawable) ck2.a(resources4, R.drawable.bg_connect_status_tip, theme4);
                        gradientDrawable4.setColor(-268125);
                        findViewById4.setBackground(gradientDrawable4);
                        TextView textView7 = (TextView) findViewById4.findViewById(R.id.tvBannerTip);
                        if (textView7 != null) {
                            textView7.setTextColor(-13421773);
                        }
                        m20.Y0(findViewById4);
                        findViewById4.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (viewGroup != null) {
                    ImageView imageView4 = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView4 != null) {
                        imageView4.setImageResource(R.drawable.ic_bubble_notification_bar);
                        m20.Y0(imageView4);
                    }
                    TextView textView8 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView8 != null) {
                        textView8.setText(pd0.y(R.string.HomeBannerNotification));
                        textView8.setMovementMethod(null);
                    }
                    View findViewById5 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById5 != null) {
                        Resources resources5 = findViewById5.getResources();
                        Resources.Theme theme5 = findViewById5.getContext().getTheme();
                        ThreadLocal threadLocal5 = jk2.f2780a;
                        GradientDrawable gradientDrawable5 = (GradientDrawable) ck2.a(resources5, R.drawable.bg_connect_status_tip, theme5);
                        gradientDrawable5.setColor(-268125);
                        findViewById5.setBackground(gradientDrawable5);
                        TextView textView9 = (TextView) findViewById5.findViewById(R.id.tvBannerTip);
                        if (textView9 != null) {
                            textView9.setTextColor(-13421773);
                        }
                        m20.Y0(findViewById5);
                        findViewById5.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (viewGroup != null) {
                    ImageView imageView5 = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView5 != null) {
                        imageView5.setImageResource(R.drawable.ic_bubble_other_devices);
                        m20.Y0(imageView5);
                    }
                    TextView textView10 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView10 != null) {
                        textView10.setText(pd0.y(R.string.HomeBannerOtherDevice));
                        textView10.setMovementMethod(null);
                    }
                    View findViewById6 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById6 != null) {
                        Resources resources6 = findViewById6.getResources();
                        Resources.Theme theme6 = findViewById6.getContext().getTheme();
                        ThreadLocal threadLocal6 = jk2.f2780a;
                        GradientDrawable gradientDrawable6 = (GradientDrawable) ck2.a(resources6, R.drawable.bg_connect_status_tip, theme6);
                        gradientDrawable6.setColor(-268125);
                        findViewById6.setBackground(gradientDrawable6);
                        TextView textView11 = (TextView) findViewById6.findViewById(R.id.tvBannerTip);
                        if (textView11 != null) {
                            textView11.setTextColor(-13421773);
                        }
                        m20.Y0(findViewById6);
                        findViewById6.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                if (viewGroup != null) {
                    ImageView imageView6 = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView6 != null) {
                        imageView6.setImageResource(R.drawable.ic_bubble_speed_test);
                        m20.Y0(imageView6);
                    }
                    TextView textView12 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView12 != null) {
                        textView12.setText(pd0.y(R.string.HomeBannerSpeedTest));
                        textView12.setMovementMethod(null);
                    }
                    View findViewById7 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById7 != null) {
                        Resources resources7 = findViewById7.getResources();
                        Resources.Theme theme7 = findViewById7.getContext().getTheme();
                        ThreadLocal threadLocal7 = jk2.f2780a;
                        GradientDrawable gradientDrawable7 = (GradientDrawable) ck2.a(resources7, R.drawable.bg_connect_status_tip, theme7);
                        gradientDrawable7.setColor(-268125);
                        findViewById7.setBackground(gradientDrawable7);
                        TextView textView13 = (TextView) findViewById7.findViewById(R.id.tvBannerTip);
                        if (textView13 != null) {
                            textView13.setTextColor(-13421773);
                        }
                        m20.Y0(findViewById7);
                        findViewById7.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                if (viewGroup != null) {
                    String y2 = pd0.y(R.string.HomeBannerUAEProtocolAHighlight);
                    SpannableStringBuilder R2 = bx3.R(i23.k1(pd0.y(R.string.HomeBannerUAEProtocolA), y2, "", false), bx3.g(y2, 1, 0, 0, true, new ja(5), 102));
                    View findViewById8 = viewGroup.findViewById(R.id.ivBannerTip);
                    if (findViewById8 != null) {
                        m20.u0(findViewById8);
                    }
                    TextView textView14 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView14 != null) {
                        textView14.setText(R2);
                        textView14.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    View findViewById9 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById9 != null) {
                        Resources resources8 = findViewById9.getResources();
                        Resources.Theme theme8 = findViewById9.getContext().getTheme();
                        ThreadLocal threadLocal8 = jk2.f2780a;
                        GradientDrawable gradientDrawable8 = (GradientDrawable) ck2.a(resources8, R.drawable.bg_connect_status_tip, theme8);
                        gradientDrawable8.setColor(-8409877);
                        findViewById9.setBackground(gradientDrawable8);
                        TextView textView15 = (TextView) findViewById9.findViewById(R.id.tvBannerTip);
                        if (textView15 != null) {
                            textView15.setTextColor(-1);
                        }
                        m20.Y0(findViewById9);
                    }
                    this.f4462a = new WeakReference(viewGroup);
                    k9Var.removeMessages(0);
                    k9Var.sendEmptyMessageDelayed(1, 10000L);
                    return;
                }
                return;
            default:
                if (viewGroup != null) {
                    String y3 = pd0.y(R.string.HomeBannerUAEProtocolDHighLight);
                    SpannableString valueOf2 = SpannableString.valueOf(pd0.y(R.string.HomeBannerUAEProtocolD));
                    bx3.i(valueOf2, y3, new ja(6));
                    View findViewById10 = viewGroup.findViewById(R.id.connectStatusTip);
                    if (findViewById10 != null) {
                        Resources resources9 = findViewById10.getResources();
                        Resources.Theme theme9 = findViewById10.getContext().getTheme();
                        ThreadLocal threadLocal9 = jk2.f2780a;
                        GradientDrawable gradientDrawable9 = (GradientDrawable) ck2.a(resources9, R.drawable.bg_connect_status_tip, theme9);
                        gradientDrawable9.setColor(-8409877);
                        findViewById10.setBackground(gradientDrawable9);
                        TextView textView16 = (TextView) findViewById10.findViewById(R.id.tvBannerTip);
                        if (textView16 != null) {
                            textView16.setTextColor(-1);
                        }
                        m20.Y0(findViewById10);
                        findViewById10.setOnClickListener(null);
                    }
                    ImageView imageView7 = (ImageView) viewGroup.findViewById(R.id.ivBannerTip);
                    if (imageView7 != null) {
                        m20.u0(imageView7);
                    }
                    TextView textView17 = (TextView) viewGroup.findViewById(R.id.tvBannerTip);
                    if (textView17 != null) {
                        textView17.setText(valueOf2);
                        textView17.setMovementMethod(LinkMovementMethod.getInstance());
                    }
                    this.f4462a = new WeakReference(viewGroup);
                    k9Var.removeMessages(0);
                    k9Var.sendEmptyMessageDelayed(1, 10000L);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.t81, android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.c) {
            case 0:
                ya0.H(view.getContext(), SplitTunnelingActivity.class);
                ew3.g("tm5pxn6s9d");
                return;
            case 1:
            default:
                return;
            case 2:
                m20.f1(view.getContext());
                return;
            case 3:
                ya0.H(view.getContext(), AdvancedFeaturesActivity.class);
                ew3.g("z6pj2w3axy");
                return;
            case 4:
                ya0.H(view.getContext(), ApplyQuickConnActivity.class);
                ew3.g("maecav3ncf");
                return;
            case 5:
                ya0.H(view.getContext(), OtherDevicesForPCActivity.class);
                ew3.g("9b2nzkn78g");
                return;
            case 6:
                ya0.H(view.getContext(), SpeedTestActivity.class);
                ew3.g("bsxdcst8eb");
                return;
        }
    }
}
