package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class rd3 extends eu3 implements vd3 {

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f4138b;

    public rd3(Context context, int i, int i2) {
        super(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        setGravity(16);
        setFocusable(true);
        setBackground(new qd3(false));
        if (i2 == R.drawable.tv_ic_drawer_settings) {
            int K = tf3.K(58);
            int K2 = tf3.K(75);
            ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
            if (layoutParams4 instanceof LinearLayout.LayoutParams) {
                layoutParams3 = (LinearLayout.LayoutParams) layoutParams4;
            } else {
                layoutParams3 = null;
            }
            layoutParams3 = layoutParams3 == null ? new LinearLayout.LayoutParams(-1, K) : layoutParams3;
            layoutParams3.width = -1;
            layoutParams3.height = K;
            layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
            layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
            layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
            layoutParams3.topMargin = Math.max(K2, layoutParams3.topMargin);
            layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
            layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
            setLayoutParams(layoutParams3);
        } else {
            int K3 = tf3.K(58);
            ViewGroup.LayoutParams layoutParams5 = getLayoutParams();
            if (layoutParams5 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams5;
            } else {
                layoutParams = null;
            }
            layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(-1, K3) : layoutParams;
            layoutParams.width = -1;
            layoutParams.height = K3;
            layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
            layoutParams.gravity = Math.max(-1, layoutParams.gravity);
            layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
            layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
            layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
            layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
            setLayoutParams(layoutParams);
        }
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        pe0.Q(appCompatImageView, zf3.y(R.color.tv_drawer_item_color));
        appCompatImageView.setImageResource(i2);
        addView(appCompatImageView);
        int K4 = tf3.K(19);
        int K5 = tf3.K(19);
        int K6 = tf3.K(40);
        ViewGroup.LayoutParams layoutParams6 = appCompatImageView.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams2 = null;
        }
        layoutParams2 = layoutParams2 == null ? new LinearLayout.LayoutParams(K4, K5) : layoutParams2;
        layoutParams2.width = K4;
        layoutParams2.height = K5;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(K6, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText(i);
        tf3.A0(appCompatTextView);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setTextSize(19.0f);
        appCompatTextView.setTextColor(zf3.y(R.color.tv_drawer_item_color));
        appCompatTextView.setDuplicateParentStateEnabled(true);
        int K7 = tf3.K(140);
        int K8 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView.getLayoutParams();
        LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
        layoutParams8 = layoutParams8 == null ? new LinearLayout.LayoutParams(K7, -2) : layoutParams8;
        layoutParams8.width = K7;
        layoutParams8.height = -2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(K8, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams8);
        t9.l0(appCompatTextView);
        t9.k0(appCompatTextView, tf3.S(10), tf3.S(19), tf3.K(1));
        addView(appCompatTextView);
        this.f4138b = appCompatTextView;
    }

    @Override // defpackage.vd3
    public final void a(boolean z) {
        m20.g1(this.f4138b, z);
    }

    public final TextView getTitle() {
        return this.f4138b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }
}
