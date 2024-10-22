package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class j12 extends cu3 {
    public static final /* synthetic */ int s = 0;
    public f83 r;

    public j12(lt3 lt3Var, f83 f83Var) {
        super(lt3Var, null, 6);
        f70 f70Var;
        f70 f70Var2;
        this.r = f83Var;
        setId(R.id.notificationDisableTip);
        setBackgroundColor(-52361);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        WeakHashMap weakHashMap = ll3.f3151a;
        appCompatTextView.setId(vk3.a());
        appCompatTextView.setText(pd0.y(R.string.AllowNotificationTips));
        appCompatTextView.setTypeface(n01.b());
        appCompatTextView.setTextColor(-1);
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams instanceof f70) {
            f70Var = (f70) layoutParams;
        } else {
            f70Var = null;
        }
        f70Var = f70Var == null ? new f70(-2, -2) : f70Var;
        ((ViewGroup.MarginLayoutParams) f70Var).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var).width = 0;
        f70Var.i = 0;
        f70Var.e = 0;
        f70Var.h = 0;
        ((ViewGroup.MarginLayoutParams) f70Var).topMargin = tf3.K(10);
        ((ViewGroup.MarginLayoutParams) f70Var).leftMargin = tf3.K(20);
        ((ViewGroup.MarginLayoutParams) f70Var).rightMargin = tf3.K(20);
        appCompatTextView.setLayoutParams(f70Var);
        addView(appCompatTextView);
        AppCompatButton appCompatButton = new AppCompatButton(getContext(), null);
        appCompatButton.setId(-1);
        appCompatButton.setText("");
        tf3.A0(appCompatButton);
        appCompatButton.setText(pd0.y(R.string.AllowNotification));
        appCompatButton.setTextColor(-13421773);
        appCompatButton.setBackground(v73.t(24 * tf3.F, 0.0f, 1000116));
        appCompatButton.setPadding(tf3.K(20), tf3.K(6), tf3.K(20), tf3.K(6));
        appCompatButton.setTextSize(12.0f);
        appCompatButton.setAllCaps(false);
        ViewGroup.LayoutParams layoutParams2 = appCompatButton.getLayoutParams();
        if (layoutParams2 instanceof f70) {
            f70Var2 = (f70) layoutParams2;
        } else {
            f70Var2 = null;
        }
        f70Var2 = f70Var2 == null ? new f70(-2, -2) : f70Var2;
        ((ViewGroup.MarginLayoutParams) f70Var2).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = tf3.K(28);
        f70Var2.j = appCompatTextView.getId();
        f70Var2.e = appCompatTextView.getId();
        f70Var2.l = 0;
        ((ViewGroup.MarginLayoutParams) f70Var2).topMargin = tf3.K(10);
        ((ViewGroup.MarginLayoutParams) f70Var2).bottomMargin = tf3.K(10);
        appCompatButton.setLayoutParams(f70Var2);
        appCompatButton.setOnClickListener(new ww2(9, lt3Var, this));
        addView(appCompatButton);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.icon_nav_cancel_light);
        int K = tf3.K(10);
        appCompatImageView.setPadding(K, K, K, K);
        ViewGroup.LayoutParams layoutParams3 = appCompatImageView.getLayoutParams();
        f70 f70Var3 = layoutParams3 instanceof f70 ? (f70) layoutParams3 : null;
        f70Var3 = f70Var3 == null ? new f70(-2, -2) : f70Var3;
        ((ViewGroup.MarginLayoutParams) f70Var3).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var3).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var3).width = tf3.K(44);
        ((ViewGroup.MarginLayoutParams) f70Var3).height = tf3.K(44);
        f70Var3.l = 0;
        f70Var3.h = 0;
        appCompatImageView.setLayoutParams(f70Var3);
        appCompatImageView.setOnClickListener(new cr1(this, 17));
        addView(appCompatImageView);
    }

    public final f83 getThemeProvider() {
        return this.r;
    }

    public final void setThemeProvider(f83 f83Var) {
        this.r = f83Var;
    }
}
