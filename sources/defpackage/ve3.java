package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class ve3 extends eu3 {

    /* renamed from: b, reason: collision with root package name */
    public TextView f4822b;
    public TextView c;
    public final AppCompatTextView d;
    public x31 e;
    public v31 f;
    public bc2 g;

    public ve3(Context context) {
        super(context, null, 4, 0);
        LinearLayout.LayoutParams layoutParams;
        setOrientation(1);
        setFocusable(true);
        setBackground(new xe3());
        setLayoutParams(new LinearLayout.LayoutParams(tf3.K(467), -2));
        setPadding(tf3.K(25), tf3.K(18), tf3.K(25), tf3.K(18));
        eu3 h = hx2.h(getContext(), null, 6, 0, 0);
        h.setId(-1);
        TextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(19.0f);
        appCompatTextView.setTextColor(zf3.y(R.color.tv_protocol_name));
        appCompatTextView.setDuplicateParentStateEnabled(true);
        h.addView(appCompatTextView);
        setTvTitle(appCompatTextView);
        TextView appCompatTextView2 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        int ceil = (int) Math.ceil(tf3.F * 4.5d);
        ViewGroup.LayoutParams layoutParams2 = appCompatTextView2.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(ceil, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams);
        tf3.V(appCompatTextView2);
        appCompatTextView2.setTextSize(14.0f);
        appCompatTextView2.setTextColor(zf3.y(R.color.tv_protocol_name));
        appCompatTextView2.setDuplicateParentStateEnabled(true);
        appCompatTextView2.setText(pd0.y(R.string.Recommended));
        h.addView(appCompatTextView2);
        setTvRecommend(appCompatTextView2);
        if (h.getAttachToParent()) {
            addView(h);
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setTextSize(14.0f);
        appCompatTextView3.setTextColor(zf3.y(R.color.tv_protocol_desc));
        appCompatTextView3.setDuplicateParentStateEnabled(true);
        addView(appCompatTextView3);
        int K = tf3.K(10);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView3.getLayoutParams();
        LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams3 : null;
        layoutParams4 = layoutParams4 == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams4;
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams4);
        this.d = appCompatTextView3;
        setOnClickListener(new cr1(this, 22));
    }

    public final bc2 getData() {
        return this.g;
    }

    public final v31 getOnBackPress() {
        return this.f;
    }

    public final x31 getOnItemClick() {
        return this.e;
    }

    public final TextView getTvDesc() {
        return this.d;
    }

    public final TextView getTvRecommend() {
        TextView textView = this.c;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    public final TextView getTvTitle() {
        TextView textView = this.f4822b;
        if (textView != null) {
            return textView;
        }
        return null;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 && i != 21) {
            return super.onKeyDown(i, keyEvent);
        }
        v31 v31Var = this.f;
        if (v31Var != null) {
            v31Var.invoke();
            return true;
        }
        return true;
    }

    public final void setData(bc2 bc2Var) {
        this.g = bc2Var;
        if (bc2Var == null) {
            return;
        }
        getTvTitle().setText(bc2Var.f446b);
        this.d.setText(pd0.A(bc2Var.e));
    }

    public final void setOnBackPress(v31 v31Var) {
        this.f = v31Var;
    }

    public final void setOnItemClick(x31 x31Var) {
        this.e = x31Var;
    }

    public final void setTvRecommend(TextView textView) {
        this.c = textView;
    }

    public final void setTvTitle(TextView textView) {
        this.f4822b = textView;
    }
}
