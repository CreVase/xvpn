package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.List;

/* loaded from: classes2.dex */
public final class ac extends fh2 {
    public final p d;
    public boolean f;
    public x31 g;
    public List e = cr0.f1659a;
    public int h = -1;

    public ac(p pVar) {
        this.d = pVar;
        A(true);
    }

    @Override // defpackage.fh2
    public final int c() {
        return this.e.size();
    }

    @Override // defpackage.fh2
    public final long d(int i) {
        return ((ef) this.e.get(i)).hashCode();
    }

    @Override // defpackage.fh2
    public final void n(h hVar, final int i) {
        ef efVar = (ef) this.e.get(i);
        View view = hVar.f281a;
        ((ImageView) ((ViewGroup) view).getChildAt(0)).setImageDrawable(efVar.f1927b);
        ((TextView) ((ViewGroup) view).getChildAt(1)).setText(efVar.f1926a);
        view.setOnClickListener(new y8(i, 1, this));
        view.setOnKeyListener(new View.OnKeyListener() { // from class: zb
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i2, KeyEvent keyEvent) {
                int keyCode = keyEvent.getKeyCode();
                ac acVar = ac.this;
                if (keyCode == 4 && keyEvent.getAction() == 0 && acVar.d.E() > 0) {
                    acVar.d.P();
                    return true;
                }
                if (keyEvent.getAction() == 0) {
                    if (i == acVar.c() - 1 && i2 == 20) {
                        return true;
                    }
                }
                if (i2 == 21) {
                    return true;
                }
                return false;
            }
        });
        if (i == this.h) {
            view.requestFocus();
            this.h = -1;
        }
    }

    @Override // defpackage.fh2
    public final h s(RecyclerView recyclerView, int i) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        eu3 h = hx2.h(recyclerView.getContext(), null, 6, 0, 0);
        h.setId(-1);
        h.setFocusable(true);
        h.setGravity(16);
        int K = tf3.K(45);
        int K2 = tf3.K(5);
        int K3 = tf3.K(5);
        int K4 = tf3.K(30);
        int K5 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams4 = h.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams4;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, K);
        }
        layoutParams.width = -1;
        layoutParams.height = K;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(K4, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(K2, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(K5, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(K3, layoutParams.bottomMargin);
        h.setLayoutParams(layoutParams);
        h.setPadding(tf3.K(40), 0, tf3.K(40), 0);
        View appCompatImageView = new AppCompatImageView(h.getContext(), null);
        appCompatImageView.setId(-1);
        int K6 = tf3.K(25);
        int K7 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams5 = appCompatImageView.getLayoutParams();
        if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams5;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(K6, K7);
        }
        layoutParams2.width = K6;
        layoutParams2.height = K7;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams2);
        h.addView(appCompatImageView);
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setDuplicateParentStateEnabled(true);
        appCompatTextView.setTextSize(15.0f);
        appCompatTextView.setTextColor(xm3.f5183a);
        int K8 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(K8, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        layoutParams3.weight = 1.0f;
        appCompatTextView.setLayoutParams(layoutParams3);
        h.addView(appCompatTextView);
        if (this.f) {
            AppCompatImageView appCompatImageView2 = new AppCompatImageView(h.getContext(), null);
            appCompatImageView2.setId(-1);
            appCompatImageView2.setImageTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, StateSet.WILD_CARD}, new int[]{-2475462, -1, -6710887}));
            appCompatImageView2.setDuplicateParentStateEnabled(true);
            appCompatImageView2.setImageResource(com.security.xvpn.z35kb.R.drawable.tv_ic_split_tunneling_remove);
            h.addView(appCompatImageView2);
        }
        h.setBackgroundResource(com.security.xvpn.z35kb.R.drawable.tv_common_item_background);
        h.setStateListAnimator(tf3.z0());
        return new qx(h);
    }
}
