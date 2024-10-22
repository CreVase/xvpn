package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.television.setting.LanguageFragment$onCreateView$1$2$1;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class pi1 extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public final sb2[] f3846a = ew3.t();

    /* renamed from: b, reason: collision with root package name */
    public String f3847b = ew3.P();
    public LanguageFragment$onCreateView$1$2$1 c;
    public RecyclerView d;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        Context context = layoutInflater.getContext();
        LinearLayout.LayoutParams layoutParams2 = null;
        eu3 h = hx2.h(context, null, 6, 0, 1);
        h.setId(-1);
        h.setAttachToParent(false);
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "", appCompatTextView, 132);
        int K = tf3.K(30);
        int K2 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
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
        layoutParams.leftMargin = Math.max(K, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(g, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(K2, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(20.0f);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(pd0.y(R.string.Language));
        h.addView(appCompatTextView);
        RecyclerView recyclerView = new RecyclerView(h.getContext(), null);
        int K3 = tf3.K(220);
        int K4 = tf3.K(22);
        ViewGroup.LayoutParams layoutParams4 = recyclerView.getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams4;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-1, K3);
        }
        layoutParams2.width = -1;
        layoutParams2.height = K3;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K4, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        recyclerView.setLayoutParams(layoutParams2);
        LanguageFragment$onCreateView$1$2$1 languageFragment$onCreateView$1$2$1 = new LanguageFragment$onCreateView$1$2$1(recyclerView.getContext());
        this.c = languageFragment$onCreateView$1$2$1;
        recyclerView.setLayoutManager(languageFragment$onCreateView$1$2$1);
        recyclerView.setAdapter(new n40(this));
        h.addView(recyclerView);
        this.d = recyclerView;
        if ((context instanceof Activity) && h.getAttachToParent()) {
            ((Activity) context).setContentView(h);
        }
        return h;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (getView() != null && z) {
            LanguageFragment$onCreateView$1$2$1 languageFragment$onCreateView$1$2$1 = this.c;
            if (languageFragment$onCreateView$1$2$1 != null) {
                languageFragment$onCreateView$1$2$1.g1();
            }
            RecyclerView recyclerView = this.d;
            if (recyclerView == null) {
                recyclerView = null;
            }
            Iterator it = ew3.O0(recyclerView).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setId(-1);
            }
        }
    }
}
