package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.util.CenterScrollLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class e8 extends sn {
    public static final /* synthetic */ int j = 0;
    public AppCompatEditText d;
    public du3 e;
    public final ArrayList f;
    public ac g;
    public eu3 h;
    public boolean i;

    public e8() {
        super(0);
        this.f = new ArrayList();
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        int i;
        LinearLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        FrameLayout.LayoutParams layoutParams4;
        FrameLayout.LayoutParams layoutParams5;
        FrameLayout.LayoutParams layoutParams6;
        LinearLayout.LayoutParams layoutParams7;
        LinearLayout.LayoutParams layoutParams8;
        LinearLayout.LayoutParams layoutParams9;
        Context context = layoutInflater.getContext();
        LinearLayout.LayoutParams layoutParams10 = null;
        final int i2 = 0;
        eu3 h = hx2.h(context, null, 6, 0, 1);
        h.setId(-1);
        ViewGroup.LayoutParams layoutParams11 = h.getLayoutParams();
        if (layoutParams11 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams11;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        h.setLayoutParams(layoutParams);
        h.setAttachToParent(false);
        if (mz2.d) {
            i = R.string.AppsUseVPN;
        } else {
            i = R.string.AppsDoNotUseVPN;
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(pd0.y(i));
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(20.0f);
        appCompatTextView.setTextColor(-1);
        int K = tf3.K(40);
        int K2 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams12 = appCompatTextView.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams12;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(K2, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        h.addView(appCompatTextView);
        du3 du3Var = new du3(h.getContext(), null, 6, 0);
        du3Var.setId(-1);
        du3Var.setId(R.id.container);
        int K3 = tf3.K(15);
        int K4 = tf3.K(30);
        int K5 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams13 = du3Var.getLayoutParams();
        if (layoutParams13 instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) layoutParams13;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams3.width = -1;
        layoutParams3.height = -2;
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.setMarginStart(Math.max(K4, layoutParams3.leftMargin));
        layoutParams3.topMargin = Math.max(K3, layoutParams3.topMargin);
        layoutParams3.setMarginEnd(Math.max(K5, layoutParams3.rightMargin));
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        du3Var.setLayoutParams(layoutParams3);
        du3Var.setBackgroundResource(R.drawable.tv_bg_et_split_tunneling);
        du3Var.setFocusable(true);
        du3Var.setOnClickListener(new cr1(this, 25));
        du3Var.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e8 f37b;

            {
                this.f37b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i3 = i2;
                View view2 = null;
                e8 e8Var = this.f37b;
                switch (i3) {
                    case 0:
                        AppCompatEditText appCompatEditText = e8Var.d;
                        if (appCompatEditText != null) {
                            view2 = appCompatEditText;
                        }
                        view2.setSelected(z);
                        return;
                    default:
                        du3 du3Var2 = e8Var.e;
                        if (du3Var2 != null) {
                            view2 = du3Var2;
                        }
                        view2.setSelected(z);
                        return;
                }
            }
        });
        du3Var.setOnKeyListener(new x3(this, 2));
        final AppCompatEditText appCompatEditText = new AppCompatEditText(du3Var.getContext(), null);
        appCompatEditText.setId(-1);
        tf3.A0(appCompatEditText);
        appCompatEditText.setId(R.id.etSearchInput);
        appCompatEditText.setDuplicateParentStateEnabled(true);
        Drawable drawable = x80.getDrawable(appCompatEditText.getContext(), R.drawable.tv_ic_apps_search);
        if (drawable != null) {
            drawable.setTintList(xm3.f5183a);
        }
        appCompatEditText.setTextColor(xm3.f5183a);
        appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        appCompatEditText.setHint(R.string.TvAppSearchHint);
        appCompatEditText.setHintTextColor(-10066330);
        xm3.h(appCompatEditText);
        appCompatEditText.setBackground(null);
        appCompatEditText.setTextSize(15.0f);
        appCompatEditText.setMaxLines(1);
        appCompatEditText.setSingleLine(true);
        appCompatEditText.setCompoundDrawablePadding(tf3.K(10));
        appCompatEditText.setPadding(0, tf3.K(15), 0, tf3.K(15));
        ViewGroup.LayoutParams layoutParams14 = appCompatEditText.getLayoutParams();
        if (layoutParams14 instanceof FrameLayout.LayoutParams) {
            layoutParams4 = (FrameLayout.LayoutParams) layoutParams14;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        }
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.setMarginStart(Math.max(-1, layoutParams4.leftMargin));
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.setMarginEnd(Math.max(-1, layoutParams4.rightMargin));
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatEditText.setLayoutParams(layoutParams4);
        appCompatEditText.addTextChangedListener(new xn2(this, 7));
        appCompatEditText.setImeOptions(6);
        appCompatEditText.setOnEditorActionListener(new b42(4, appCompatEditText, this));
        final int i3 = 1;
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener(this) { // from class: a8

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e8 f37b;

            {
                this.f37b = this;
            }

            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i32 = i3;
                View view2 = null;
                e8 e8Var = this.f37b;
                switch (i32) {
                    case 0:
                        AppCompatEditText appCompatEditText2 = e8Var.d;
                        if (appCompatEditText2 != null) {
                            view2 = appCompatEditText2;
                        }
                        view2.setSelected(z);
                        return;
                    default:
                        du3 du3Var2 = e8Var.e;
                        if (du3Var2 != null) {
                            view2 = du3Var2;
                        }
                        view2.setSelected(z);
                        return;
                }
            }
        });
        appCompatEditText.setOnKeyListener(new View.OnKeyListener() { // from class: b8
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i4, KeyEvent keyEvent) {
                int i5 = e8.j;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 0) {
                    e8 e8Var = e8.this;
                    if (e8Var.getParentFragmentManager().E() > 0) {
                        e8Var.getParentFragmentManager().P();
                        return true;
                    }
                }
                if (keyEvent.getAction() == 0 && i4 == 21 && appCompatEditText.getSelectionEnd() == 0) {
                    return true;
                }
                return false;
            }
        });
        du3Var.addView(appCompatEditText);
        this.d = appCompatEditText;
        if (du3Var.getAttachToParent()) {
            h.addView(du3Var);
        }
        this.e = du3Var;
        du3 du3Var2 = new du3(h.getContext(), null, 6, 0);
        du3Var2.setId(-1);
        ViewGroup.LayoutParams layoutParams15 = du3Var2.getLayoutParams();
        if (layoutParams15 instanceof FrameLayout.LayoutParams) {
            layoutParams5 = (FrameLayout.LayoutParams) layoutParams15;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams5.width = -1;
        layoutParams5.height = -1;
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.setMarginStart(Math.max(-1, layoutParams5.leftMargin));
        layoutParams5.topMargin = Math.max(-1, layoutParams5.topMargin);
        layoutParams5.setMarginEnd(Math.max(-1, layoutParams5.rightMargin));
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        du3Var2.setLayoutParams(layoutParams5);
        RecyclerView recyclerView = new RecyclerView(du3Var2.getContext(), null);
        int K6 = tf3.K(330);
        int K7 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams16 = recyclerView.getLayoutParams();
        if (layoutParams16 instanceof FrameLayout.LayoutParams) {
            layoutParams6 = (FrameLayout.LayoutParams) layoutParams16;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new FrameLayout.LayoutParams(-1, K6);
        }
        layoutParams6.width = -1;
        layoutParams6.height = K6;
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.setMarginStart(Math.max(-1, layoutParams6.leftMargin));
        layoutParams6.topMargin = Math.max(K7, layoutParams6.topMargin);
        layoutParams6.setMarginEnd(Math.max(-1, layoutParams6.rightMargin));
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        recyclerView.setLayoutParams(layoutParams6);
        recyclerView.setLayoutManager(new CenterScrollLayoutManager(recyclerView.getContext()));
        ac acVar = new ac(getParentFragmentManager());
        this.g = acVar;
        acVar.e = this.f;
        acVar.g = new fv2(this, 16);
        recyclerView.setAdapter(acVar);
        du3Var2.addView(recyclerView);
        eu3 eu3Var = new eu3(du3Var2.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        ViewGroup.LayoutParams layoutParams17 = eu3Var.getLayoutParams();
        if (layoutParams17 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams17;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams7.width = -1;
        layoutParams7.height = -1;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        eu3Var.setLayoutParams(layoutParams7);
        eu3Var.setGravity(1);
        AppCompatImageView appCompatImageView = new AppCompatImageView(eu3Var.getContext(), null);
        appCompatImageView.setId(-1);
        int K8 = tf3.K(100);
        ViewGroup.LayoutParams layoutParams18 = appCompatImageView.getLayoutParams();
        if (layoutParams18 instanceof LinearLayout.LayoutParams) {
            layoutParams8 = (LinearLayout.LayoutParams) layoutParams18;
        } else {
            layoutParams8 = null;
        }
        if (layoutParams8 == null) {
            layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams8.width = -2;
        layoutParams8.height = -2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(K8, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams8);
        appCompatImageView.setImageResource(R.drawable.tv_img_location_empty);
        eu3Var.addView(appCompatImageView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        int g = p71.g(appCompatTextView2, -1, "", appCompatTextView2, 17);
        ViewGroup.LayoutParams layoutParams19 = appCompatTextView2.getLayoutParams();
        if (layoutParams19 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams19;
        } else {
            layoutParams9 = null;
        }
        if (layoutParams9 == null) {
            layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams9.width = -2;
        layoutParams9.height = -2;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(g, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams9);
        appCompatTextView2.setTextSize(21.0f);
        appCompatTextView2.setTextColor(-1);
        appCompatTextView2.setText(pd0.y(R.string.NoResult));
        eu3Var.addView(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(eu3Var.getContext(), null);
        int g2 = p71.g(appCompatTextView3, -1, "", appCompatTextView3, 10);
        ViewGroup.LayoutParams layoutParams20 = appCompatTextView3.getLayoutParams();
        if (layoutParams20 instanceof LinearLayout.LayoutParams) {
            layoutParams10 = (LinearLayout.LayoutParams) layoutParams20;
        }
        if (layoutParams10 == null) {
            layoutParams10 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams10.width = -2;
        layoutParams10.height = -2;
        layoutParams10.weight = Math.max(-1.0f, layoutParams10.weight);
        layoutParams10.gravity = Math.max(-1, layoutParams10.gravity);
        layoutParams10.leftMargin = Math.max(-1, layoutParams10.leftMargin);
        layoutParams10.topMargin = Math.max(g2, layoutParams10.topMargin);
        layoutParams10.rightMargin = Math.max(-1, layoutParams10.rightMargin);
        layoutParams10.bottomMargin = Math.max(-1, layoutParams10.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams10);
        appCompatTextView3.setTextSize(16.0f);
        appCompatTextView3.setTextColor(-1);
        appCompatTextView3.setText(pd0.y(R.string.LocationSearchEmptyTips));
        eu3Var.addView(appCompatTextView3);
        if (eu3Var.getAttachToParent()) {
            du3Var2.addView(eu3Var);
        }
        this.h = eu3Var;
        if (du3Var2.getAttachToParent()) {
            h.addView(du3Var2);
        }
        if ((context instanceof Activity) && h.getAttachToParent()) {
            ((Activity) context).setContentView(h);
        }
        return h;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!this.i) {
            return;
        }
        if (!z) {
            ac acVar = this.g;
            if (acVar == null) {
                acVar = null;
            }
            acVar.h = 0;
        }
        z();
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        this.i = true;
        ac acVar = this.g;
        if (acVar == null) {
            acVar = null;
        }
        acVar.h = 0;
        z();
    }

    public final void z() {
        boolean z;
        AppCompatEditText appCompatEditText;
        du3 du3Var;
        List list = gf.f2244b;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            ef efVar = (ef) next;
            Iterator it2 = mz2.f3379a.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (m20.L(efVar.c, (String) it2.next())) {
                        break;
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            if (i == -1) {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = this.f;
        arrayList2.clear();
        AppCompatEditText appCompatEditText2 = this.d;
        ac acVar = null;
        if (appCompatEditText2 == null) {
            appCompatEditText2 = null;
        }
        String obj = appCompatEditText2.getText().toString();
        if (obj.length() == 0) {
            z = true;
        }
        if (z) {
            arrayList2.addAll(arrayList);
            if (arrayList2.isEmpty()) {
                du3 du3Var2 = this.e;
                if (du3Var2 == null) {
                    du3Var2 = null;
                }
                du3Var2.requestFocus();
                AppCompatEditText appCompatEditText3 = this.d;
                if (appCompatEditText3 == null) {
                    appCompatEditText = null;
                } else {
                    appCompatEditText = appCompatEditText3;
                }
                if (appCompatEditText3 == null) {
                    appCompatEditText3 = null;
                }
                appCompatEditText.setNextFocusDownId(appCompatEditText3.getId());
                du3 du3Var3 = this.e;
                if (du3Var3 == null) {
                    du3Var = null;
                } else {
                    du3Var = du3Var3;
                }
                if (du3Var3 == null) {
                    du3Var3 = null;
                }
                du3Var.setNextFocusDownId(du3Var3.getId());
            } else {
                AppCompatEditText appCompatEditText4 = this.d;
                if (appCompatEditText4 == null) {
                    appCompatEditText4 = null;
                }
                appCompatEditText4.setNextFocusDownId(-1);
                du3 du3Var4 = this.e;
                if (du3Var4 == null) {
                    du3Var4 = null;
                }
                du3Var4.setNextFocusDownId(-1);
            }
        } else {
            AppCompatEditText appCompatEditText5 = this.d;
            if (appCompatEditText5 == null) {
                appCompatEditText5 = null;
            }
            appCompatEditText5.setNextFocusDownId(-1);
            du3 du3Var5 = this.e;
            if (du3Var5 == null) {
                du3Var5 = null;
            }
            du3Var5.setNextFocusDownId(-1);
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                Object next2 = it3.next();
                if (i23.R0(((ef) next2).f1926a, obj, true)) {
                    arrayList3.add(next2);
                }
            }
            arrayList2.addAll(arrayList3);
        }
        eu3 eu3Var = this.h;
        if (eu3Var == null) {
            eu3Var = null;
        }
        m20.g1(eu3Var, arrayList2.isEmpty());
        ac acVar2 = this.g;
        if (acVar2 != null) {
            acVar = acVar2;
        }
        acVar.f();
    }
}
