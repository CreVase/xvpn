package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class re3 extends ld {
    public static final /* synthetic */ int h = 0;
    public AppCompatTextView f;
    public v31 g;

    public re3(Context context) {
        super(context, R.style.DialogBase_Fullscreen);
        LinearLayout.LayoutParams layoutParams;
        requestWindowFeature(1);
        e(1);
        getWindow().addFlags(1);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        Context context2 = getLayoutInflater().getContext();
        eu3 h2 = hx2.h(context2, null, 6, 0, 1);
        h2.setId(-1);
        ViewGroup.LayoutParams layoutParams2 = h2.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(-1, -1) : layoutParams;
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        h2.setLayoutParams(layoutParams);
        h2.setGravity(1);
        h2.setBackgroundColor(-16316665);
        tf3.w0(h2, 0, tf3.K(138), 5);
        AppCompatImageView appCompatImageView = new AppCompatImageView(h2.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.tv_loading_logo);
        h2.addView(appCompatImageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(h2.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "", appCompatTextView, 20);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        layoutParams4 = layoutParams4 == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams4;
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(g, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams4);
        appCompatTextView.setText(pd0.y(R.string.Loading));
        appCompatTextView.setTextSize(25.0f);
        appCompatTextView.setTextColor(-6710887);
        h2.addView(appCompatTextView);
        this.f = appCompatTextView;
        tf3.w0(h2, 0, tf3.K(40), 5);
        h2.addView(new om1(h2.getContext()));
        if ((context2 instanceof Activity) && h2.getAttachToParent()) {
            ((Activity) context2).setContentView(h2);
        }
        setContentView(h2, new ViewGroup.LayoutParams(-1, -1));
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new c82(context, 1));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            v31 v31Var = this.g;
            if (v31Var != null) {
                v31Var.invoke();
                return true;
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }
}
