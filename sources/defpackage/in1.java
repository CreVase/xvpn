package defpackage;

import a.bx;
import a.du;
import android.animation.LayoutTransition;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.util.CenterScrollLayoutManager;
import com.security.xvpn.z35kb.util.ColorFontSpan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class in1 extends lo implements qt3 {
    public static final /* synthetic */ int t = 0;
    public final ArrayList e;
    public final kn1 f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public final ArrayList j;
    public AppCompatEditText k;
    public eu3 l;
    public du3 m;
    public AppCompatTextView n;
    public cf3 o;
    public int p;
    public CenterScrollLayoutManager q;
    public boolean r;
    public boolean s;

    public in1() {
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        this.f = new kn1(arrayList);
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new ArrayList();
        this.p = -1;
    }

    public static final void D(in1 in1Var, String str) {
        Object obj;
        in1Var.r = true;
        ArrayList arrayList = in1Var.e;
        arrayList.clear();
        arrayList.addAll(tf3.L(tf3.j0(fl.X(str))));
        eu3 eu3Var = in1Var.l;
        AppCompatTextView appCompatTextView = null;
        if (eu3Var == null) {
            eu3Var = null;
        }
        fl.g0(eu3Var, arrayList.isEmpty());
        eu3 eu3Var2 = in1Var.l;
        if (eu3Var2 == null) {
            eu3Var2 = null;
        }
        Iterator it = ew3.O0(eu3Var2).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((View) obj) instanceof TextView) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            ((TextView) view).setText(R.string.NoResult);
        }
        AppCompatTextView appCompatTextView2 = in1Var.n;
        if (appCompatTextView2 != null) {
            appCompatTextView = appCompatTextView2;
        }
        m20.Y0(appCompatTextView);
        in1Var.f.f();
    }

    public final void E() {
        cf3 cf3Var = this.o;
        if (cf3Var == null) {
            cf3Var = null;
        }
        cf3Var.requestFocus();
        int i = -1;
        if (this.r) {
            AppCompatEditText appCompatEditText = this.k;
            if (appCompatEditText == null) {
                appCompatEditText = null;
            }
            appCompatEditText.setText("");
            this.p = -1;
        }
        cf3 cf3Var2 = this.o;
        if (cf3Var2 == null) {
            cf3Var2 = null;
        }
        Iterator it = ew3.O0(cf3Var2).iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i2 >= 0) {
                if (((View) next).isSelected()) {
                    i = i2;
                    break;
                }
                i2++;
            } else {
                tf3.y0();
                throw null;
            }
        }
        G(i, false);
    }

    public final void G(int i, boolean z) {
        int i2;
        Object obj;
        boolean z2;
        if (this.p == i && !z) {
            return;
        }
        this.p = i;
        ArrayList arrayList = this.e;
        boolean z3 = true;
        kn1 kn1Var = this.f;
        du3 du3Var = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        arrayList.clear();
                        arrayList.addAll(this.j);
                        CenterScrollLayoutManager centerScrollLayoutManager = this.q;
                        if (centerScrollLayoutManager == null) {
                            centerScrollLayoutManager = null;
                        }
                        centerScrollLayoutManager.g1();
                        kn1Var.f();
                        i2 = R.string.LocationHistoryEmptyTips;
                    }
                } else {
                    arrayList.clear();
                    ArrayList arrayList2 = this.i;
                    fl.s(arrayList2);
                    arrayList.addAll(arrayList2);
                    CenterScrollLayoutManager centerScrollLayoutManager2 = this.q;
                    if (centerScrollLayoutManager2 == null) {
                        centerScrollLayoutManager2 = null;
                    }
                    centerScrollLayoutManager2.g1();
                    kn1Var.f();
                }
            } else {
                arrayList.clear();
                ArrayList arrayList3 = this.h;
                fl.s(arrayList3);
                arrayList.addAll(arrayList3);
                CenterScrollLayoutManager centerScrollLayoutManager3 = this.q;
                if (centerScrollLayoutManager3 == null) {
                    centerScrollLayoutManager3 = null;
                }
                centerScrollLayoutManager3.g1();
                kn1Var.f();
            }
            i2 = R.string.NoResult;
        } else {
            arrayList.clear();
            arrayList.addAll(this.g);
            kn1Var.f();
            CenterScrollLayoutManager centerScrollLayoutManager4 = this.q;
            if (centerScrollLayoutManager4 == null) {
                centerScrollLayoutManager4 = null;
            }
            centerScrollLayoutManager4.g1();
            i2 = R.string.LocationFavoriteEmptyTips;
        }
        eu3 eu3Var = this.l;
        if (eu3Var == null) {
            eu3Var = null;
        }
        fl.g0(eu3Var, arrayList.isEmpty());
        eu3 eu3Var2 = this.l;
        if (eu3Var2 == null) {
            eu3Var2 = null;
        }
        Iterator it = ew3.O0(eu3Var2).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((View) obj) instanceof TextView) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        View view = (View) obj;
        if (view != null) {
            ((TextView) view).setText(i2);
        }
        eu3 eu3Var3 = this.l;
        if (eu3Var3 == null) {
            eu3Var3 = null;
        }
        Iterator it2 = ew3.O0(eu3Var3).iterator();
        if (it2.hasNext()) {
            View view2 = (View) it2.next();
            if (i != 1 && i != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            m20.g1(view2, z2);
            AppCompatTextView appCompatTextView = this.n;
            if (appCompatTextView == null) {
                appCompatTextView = null;
            }
            m20.u0(appCompatTextView);
            du3 du3Var2 = this.m;
            if (du3Var2 != null) {
                du3Var = du3Var2;
            }
            if (i != 2 && i != 3) {
                z3 = false;
            }
            m20.g1(du3Var, z3);
            return;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        zf3.T(this, null, new hn1(this, new sz2(this, z2, 4), null), 3);
        this.s = z2;
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        FrameLayout.LayoutParams layoutParams3;
        f70 f70Var;
        int i;
        f70 f70Var2;
        int i2;
        f70 f70Var3;
        int i3;
        f70 f70Var4;
        int i4;
        LinearLayout.LayoutParams layoutParams4;
        int i5;
        int i6;
        FrameLayout.LayoutParams layoutParams5;
        int i7;
        LinearLayout.LayoutParams layoutParams6;
        int i8;
        LinearLayout.LayoutParams layoutParams7;
        int i9;
        int i10;
        boolean z;
        int i11;
        LinearLayout.LayoutParams layoutParams8;
        ei2 ei2Var = new ei2();
        this.q = new CenterScrollLayoutManager(layoutInflater.getContext());
        qe3 qe3Var = new qe3(layoutInflater.getContext());
        final int i12 = 0;
        qe3Var.setOrientation(0);
        qe3Var.setId(-1);
        cf3 cf3Var = new cf3(qe3Var.getContext());
        cf3Var.setId(-1);
        cf3Var.setOnChildFocusChange(new a60(1, ei2Var, this));
        cf3Var.setOnSelfFocusChange(new fn1(this, i12));
        cf3Var.setOnBackPressed(new gn1(this, i12));
        cf3Var.setPadding(tf3.K(40), tf3.K(40), 0, cf3Var.getPaddingBottom());
        LinearLayout.LayoutParams layoutParams9 = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(cf3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText(R.string.Location);
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(21.0f);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextColor(-1);
        int K = tf3.K(28);
        int K2 = tf3.K(60);
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams10;
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
        layoutParams.topMargin = Math.max(0, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(K2, layoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams);
        cf3Var.addView(appCompatTextView);
        bx bxVar = new bx();
        du.d(194, bxVar);
        boolean q = bxVar.q();
        bxVar.h();
        boolean z2 = !q;
        int i13 = 0;
        for (Object obj : tf3.b0(Integer.valueOf(R.string.Favorite), Integer.valueOf(R.string.ChooseServerTabAll), Integer.valueOf(R.string.Streaming), Integer.valueOf(R.string.History))) {
            int i14 = i13 + 1;
            if (i13 >= 0) {
                int intValue = ((Number) obj).intValue();
                bf3 bf3Var = new bf3(cf3Var.getContext(), null);
                bf3Var.setId(-1);
                bf3Var.setText(intValue);
                if (i13 == z2) {
                    z = true;
                } else {
                    z = false;
                }
                bf3Var.setSelected(z);
                if (i13 == z2) {
                    i11 = -16768221;
                } else {
                    i11 = -1;
                }
                bf3Var.setId(i11);
                bf3Var.setNextFocusRightId(R.id.recyclerViewFocusItem);
                int K3 = tf3.K(45);
                int K4 = tf3.K(8);
                ViewGroup.LayoutParams layoutParams11 = bf3Var.getLayoutParams();
                if (layoutParams11 instanceof LinearLayout.LayoutParams) {
                    layoutParams8 = (LinearLayout.LayoutParams) layoutParams11;
                } else {
                    layoutParams8 = null;
                }
                if (layoutParams8 == null) {
                    layoutParams8 = new LinearLayout.LayoutParams(-1, K3);
                }
                layoutParams8.width = -1;
                layoutParams8.height = K3;
                layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
                layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
                layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
                layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
                layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
                layoutParams8.bottomMargin = Math.max(K4, layoutParams8.bottomMargin);
                bf3Var.setLayoutParams(layoutParams8);
                if (i13 == z2) {
                    cf3Var.setLastFocusChild(bf3Var);
                    ei2Var.f1938a = bf3Var;
                }
                cf3Var.addView(bf3Var);
                i13 = i14;
            } else {
                tf3.y0();
                throw null;
            }
        }
        qe3Var.addView(cf3Var);
        int K5 = tf3.K(250);
        ViewGroup.LayoutParams layoutParams12 = cf3Var.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams12;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(K5, -1);
        }
        layoutParams2.width = K5;
        layoutParams2.height = -1;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        cf3Var.setLayoutParams(layoutParams2);
        this.o = cf3Var;
        eu3 eu3Var = new eu3(qe3Var.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        eu3Var.setLayoutTransition(new LayoutTransition());
        eu3Var.setPadding(tf3.K(60), tf3.K(30), tf3.K(60), eu3Var.getPaddingBottom());
        du3 du3Var = new du3(eu3Var.getContext(), null, 6, 0);
        du3Var.setId(-1);
        du3Var.setFocusable(true);
        du3Var.setBackground(zf3.A(R.drawable.tv_location_search_wrapper_background));
        AppCompatEditText appCompatEditText = new AppCompatEditText(du3Var.getContext(), null);
        appCompatEditText.setId(-1);
        tf3.A0(appCompatEditText);
        appCompatEditText.setGravity(19);
        appCompatEditText.setTextSize(15.0f);
        appCompatEditText.setHint(pd0.y(R.string.TvAppSearchHint));
        appCompatEditText.setBackgroundResource(R.drawable.tv_location_search_background);
        appCompatEditText.setTextColor(zf3.y(R.color.tv_common_input_text));
        appCompatEditText.setHintTextColor(zf3.v(R.color.textTertiary));
        appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tv_ic_location_search, 0, 0, 0);
        appCompatEditText.setCompoundDrawablePadding(tf3.K(15));
        appCompatEditText.setPadding(tf3.K(18), appCompatEditText.getPaddingTop(), appCompatEditText.getPaddingRight(), appCompatEditText.getPaddingBottom());
        int K6 = tf3.K(40);
        ViewGroup.LayoutParams layoutParams13 = appCompatEditText.getLayoutParams();
        if (layoutParams13 instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) layoutParams13;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new FrameLayout.LayoutParams(-1, K6);
        }
        layoutParams3.width = -1;
        layoutParams3.height = K6;
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.setMarginStart(Math.max(-1, layoutParams3.leftMargin));
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.setMarginEnd(Math.max(-1, layoutParams3.rightMargin));
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatEditText.setLayoutParams(layoutParams3);
        appCompatEditText.setOnKeyListener(new View.OnKeyListener(this) { // from class: dn1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ in1 f1810b;

            {
                this.f1810b = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i15, KeyEvent keyEvent) {
                int i16 = i12;
                in1 in1Var = this.f1810b;
                switch (i16) {
                    case 0:
                        int i17 = in1.t;
                        if (i15 != 4) {
                            if (i15 != 21) {
                                return false;
                            }
                            AppCompatEditText appCompatEditText2 = in1Var.k;
                            if (appCompatEditText2 == null) {
                                appCompatEditText2 = null;
                            }
                            if (appCompatEditText2.getSelectionStart() != 0) {
                                return false;
                            }
                        }
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        in1Var.E();
                        return true;
                    default:
                        int i18 = in1.t;
                        if ((i15 != 4 && i15 != 21) || keyEvent.getAction() != 0) {
                            return false;
                        }
                        in1Var.E();
                        return true;
                }
            }
        });
        appCompatEditText.setSingleLine();
        appCompatEditText.setImeOptions(6);
        appCompatEditText.setOnEditorActionListener(new b42(3, this, appCompatEditText));
        du3Var.addView(appCompatEditText);
        this.k = appCompatEditText;
        final int i15 = 1;
        du3Var.setOnKeyListener(new View.OnKeyListener(this) { // from class: dn1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ in1 f1810b;

            {
                this.f1810b = this;
            }

            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i152, KeyEvent keyEvent) {
                int i16 = i15;
                in1 in1Var = this.f1810b;
                switch (i16) {
                    case 0:
                        int i17 = in1.t;
                        if (i152 != 4) {
                            if (i152 != 21) {
                                return false;
                            }
                            AppCompatEditText appCompatEditText2 = in1Var.k;
                            if (appCompatEditText2 == null) {
                                appCompatEditText2 = null;
                            }
                            if (appCompatEditText2.getSelectionStart() != 0) {
                                return false;
                            }
                        }
                        if (keyEvent.getAction() != 0) {
                            return false;
                        }
                        in1Var.E();
                        return true;
                    default:
                        int i18 = in1.t;
                        if ((i152 != 4 && i152 != 21) || keyEvent.getAction() != 0) {
                            return false;
                        }
                        in1Var.E();
                        return true;
                }
            }
        });
        m20.G0(du3Var, new fn1(this, i15));
        if (du3Var.getAttachToParent()) {
            eu3Var.addView(du3Var);
        }
        this.m = du3Var;
        cu3 cu3Var = new cu3(eu3Var.getContext(), null, 6);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView2.setId(R.id.tvLocationGuide1);
        appCompatTextView2.setText(R.string.LocationOperationGuide1);
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(19);
        SpannableString valueOf = SpannableString.valueOf(appCompatTextView2.getText());
        Drawable A = zf3.A(R.drawable.tv_ic_location_guide_right);
        A.setBounds(0, 0, tf3.S(10), tf3.S(10));
        bx3.i(valueOf, "→", new ImageSpan(A, 1));
        Drawable A2 = zf3.A(R.drawable.tv_location_guide_dot);
        A2.setBounds(0, 0, tf3.K(4), tf3.K(4));
        bx3.i(valueOf, "·", new tv(A2));
        appCompatTextView2.setText(valueOf);
        ViewGroup.LayoutParams layoutParams14 = appCompatTextView2.getLayoutParams();
        if (layoutParams14 instanceof f70) {
            f70Var = (f70) layoutParams14;
        } else {
            f70Var = null;
        }
        if (f70Var == null) {
            i = -2;
            f70Var = new f70(0, -2);
        } else {
            i = -2;
        }
        ((ViewGroup.MarginLayoutParams) f70Var).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var).height = i;
        f70Var.i = 0;
        f70Var.e = 0;
        f70Var.g = R.id.tvLocationGuide2;
        appCompatTextView2.setLayoutParams(f70Var);
        t9.l0(appCompatTextView2);
        t9.k0(appCompatTextView2, tf3.S(9), tf3.S(12), 1);
        cu3Var.addView(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView3.setId(R.id.tvLocationGuide2);
        appCompatTextView3.setText(R.string.LocationOperationGuide2);
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setTextSize(12.0f);
        appCompatTextView3.setMaxLines(1);
        appCompatTextView3.setGravity(19);
        SpannableString valueOf2 = SpannableString.valueOf(appCompatTextView3.getText());
        Drawable A3 = zf3.A(R.drawable.tv_ic_location_guide_left);
        A3.setBounds(0, 0, tf3.S(10), tf3.S(10));
        bx3.i(valueOf2, "←", new ImageSpan(A3, 1));
        Drawable A4 = zf3.A(R.drawable.tv_location_guide_dot);
        A4.setBounds(0, 0, tf3.K(4), tf3.K(4));
        bx3.i(valueOf2, "·", new tv(A4));
        appCompatTextView3.setText(valueOf2);
        ViewGroup.LayoutParams layoutParams15 = appCompatTextView3.getLayoutParams();
        if (layoutParams15 instanceof f70) {
            f70Var2 = (f70) layoutParams15;
        } else {
            f70Var2 = null;
        }
        if (f70Var2 == null) {
            i2 = -2;
            f70Var2 = new f70(0, -2);
        } else {
            i2 = -2;
        }
        ((ViewGroup.MarginLayoutParams) f70Var2).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = i2;
        f70Var2.i = 0;
        f70Var2.h = 0;
        f70Var2.f = R.id.tvLocationGuide1;
        appCompatTextView3.setLayoutParams(f70Var2);
        t9.l0(appCompatTextView3);
        t9.k0(appCompatTextView3, tf3.S(9), tf3.S(12), 1);
        cu3Var.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView4.setId(R.id.tvLocationGuide3);
        appCompatTextView4.setText(R.string.LocationOperationGuide3);
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setTextSize(12.0f);
        appCompatTextView4.setSingleLine(true);
        appCompatTextView4.setGravity(19);
        SpannableString valueOf3 = SpannableString.valueOf(appCompatTextView4.getText());
        bx3.i(valueOf3, "OK", new ColorFontSpan(n01.a(), -13841976));
        Drawable A5 = zf3.A(R.drawable.tv_location_guide_dot);
        A5.setBounds(0, 0, tf3.K(4), tf3.K(4));
        bx3.i(valueOf3, "·", new tv(A5));
        appCompatTextView4.setText(valueOf3);
        ViewGroup.LayoutParams layoutParams16 = appCompatTextView4.getLayoutParams();
        if (layoutParams16 instanceof f70) {
            f70Var3 = (f70) layoutParams16;
        } else {
            f70Var3 = null;
        }
        if (f70Var3 == null) {
            i3 = -2;
            f70Var3 = new f70(0, -2);
        } else {
            i3 = -2;
        }
        ((ViewGroup.MarginLayoutParams) f70Var3).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var3).height = i3;
        f70Var3.j = R.id.tvLocationGuide1;
        f70Var3.e = 0;
        f70Var3.g = R.id.tvLocationGuide4;
        appCompatTextView4.setLayoutParams(f70Var3);
        cu3Var.addView(appCompatTextView4);
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView5.setId(R.id.tvLocationGuide4);
        appCompatTextView5.setText(R.string.LocationOperationGuide4);
        tf3.A0(appCompatTextView5);
        appCompatTextView5.setTextSize(12.0f);
        appCompatTextView5.setMaxLines(1);
        appCompatTextView5.setGravity(19);
        SpannableString valueOf4 = SpannableString.valueOf(appCompatTextView5.getText());
        bx3.i(valueOf4, "OK", new ColorFontSpan(n01.a(), -13841976));
        Drawable A6 = zf3.A(R.drawable.tv_location_guide_dot);
        A6.setBounds(0, 0, tf3.K(4), tf3.K(4));
        bx3.i(valueOf4, "·", new tv(A6));
        appCompatTextView5.setText(valueOf4);
        ViewGroup.LayoutParams layoutParams17 = appCompatTextView5.getLayoutParams();
        if (layoutParams17 instanceof f70) {
            f70Var4 = (f70) layoutParams17;
        } else {
            f70Var4 = null;
        }
        if (f70Var4 == null) {
            i4 = -2;
            f70Var4 = new f70(0, -2);
        } else {
            i4 = -2;
        }
        ((ViewGroup.MarginLayoutParams) f70Var4).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var4).height = i4;
        f70Var4.j = R.id.tvLocationGuide2;
        f70Var4.h = 0;
        f70Var4.f = R.id.tvLocationGuide3;
        appCompatTextView5.setLayoutParams(f70Var4);
        t9.l0(appCompatTextView5);
        t9.k0(appCompatTextView5, tf3.S(9), tf3.S(12), 1);
        cu3Var.addView(appCompatTextView5);
        if (cu3Var.getAttachToParent()) {
            eu3Var.addView(cu3Var);
        }
        int K7 = tf3.K(20);
        int K8 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams18 = cu3Var.getLayoutParams();
        if (layoutParams18 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams18;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            i5 = -2;
            i6 = -1;
            layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        } else {
            i5 = -2;
            i6 = -1;
        }
        layoutParams4.width = i6;
        layoutParams4.height = i5;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(i6, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(i6, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K7, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(i6, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(K8, layoutParams4.bottomMargin);
        cu3Var.setLayoutParams(layoutParams4);
        du3 du3Var2 = new du3(eu3Var.getContext(), null, 6, 0);
        du3Var2.setId(i6);
        ze3 ze3Var = new ze3(du3Var2.getContext());
        ze3Var.setFocusable(false);
        ze3Var.setItemAnimator(null);
        CenterScrollLayoutManager centerScrollLayoutManager = this.q;
        if (centerScrollLayoutManager == null) {
            centerScrollLayoutManager = null;
        }
        ze3Var.setLayoutManager(centerScrollLayoutManager);
        ze3Var.setAdapter(this.f);
        du3Var2.addView(ze3Var);
        ViewGroup.LayoutParams layoutParams19 = ze3Var.getLayoutParams();
        if (layoutParams19 instanceof FrameLayout.LayoutParams) {
            layoutParams5 = (FrameLayout.LayoutParams) layoutParams19;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            i7 = -1;
            layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
        } else {
            i7 = -1;
        }
        layoutParams5.width = i7;
        layoutParams5.height = i7;
        layoutParams5.gravity = Math.max(i7, layoutParams5.gravity);
        layoutParams5.setMarginStart(Math.max(i7, layoutParams5.leftMargin));
        layoutParams5.topMargin = Math.max(i7, layoutParams5.topMargin);
        layoutParams5.setMarginEnd(Math.max(i7, layoutParams5.rightMargin));
        layoutParams5.bottomMargin = Math.max(i7, layoutParams5.bottomMargin);
        ze3Var.setLayoutParams(layoutParams5);
        eu3 eu3Var2 = new eu3(du3Var2.getContext(), null, 6, 0);
        eu3Var2.setOrientation(1);
        eu3Var2.setId(i7);
        eu3Var2.setGravity(1);
        tf3.w0(eu3Var2, 0, tf3.K(120), 5);
        tf3.w0(eu3Var2, 0, tf3.K(20), 5);
        AppCompatImageView appCompatImageView = new AppCompatImageView(eu3Var2.getContext(), null);
        appCompatImageView.setId(i7);
        appCompatImageView.setImageResource(R.drawable.tv_img_location_empty);
        eu3Var2.addView(appCompatImageView);
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView6.setId(i7);
        appCompatTextView6.setText(R.string.NoResult);
        tf3.A0(appCompatTextView6);
        appCompatTextView6.setTextSize(21.0f);
        appCompatTextView6.setTextColor(i7);
        int K9 = tf3.K(17);
        ViewGroup.LayoutParams layoutParams20 = appCompatTextView6.getLayoutParams();
        if (layoutParams20 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams20;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            i8 = -2;
            layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i8 = -2;
        }
        layoutParams6.width = i8;
        layoutParams6.height = i8;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(K9, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView6.setLayoutParams(layoutParams6);
        eu3Var2.addView(appCompatTextView6);
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(eu3Var2.getContext(), null);
        appCompatTextView7.setId(-1);
        appCompatTextView7.setText(R.string.LocationSearchEmptyTips);
        tf3.A0(appCompatTextView7);
        appCompatTextView7.setTextSize(16.0f);
        appCompatTextView7.setTextColor(-1);
        int K10 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams21 = appCompatTextView7.getLayoutParams();
        if (layoutParams21 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams21;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            i9 = -2;
            layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i9 = -2;
        }
        layoutParams7.width = i9;
        layoutParams7.height = i9;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(K10, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        appCompatTextView7.setLayoutParams(layoutParams7);
        m20.u0(appCompatTextView7);
        eu3Var2.addView(appCompatTextView7);
        this.n = appCompatTextView7;
        if (eu3Var2.getAttachToParent()) {
            du3Var2.addView(eu3Var2);
        }
        this.l = eu3Var2;
        if (du3Var2.getAttachToParent()) {
            eu3Var.addView(du3Var2);
        }
        if (eu3Var.getAttachToParent()) {
            qe3Var.addView(eu3Var);
        }
        int K11 = tf3.H - tf3.K(350);
        ViewGroup.LayoutParams layoutParams22 = eu3Var.getLayoutParams();
        if (layoutParams22 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams22;
        }
        if (layoutParams9 == null) {
            i10 = -1;
            layoutParams9 = new LinearLayout.LayoutParams(K11, -1);
        } else {
            i10 = -1;
        }
        layoutParams9.width = K11;
        layoutParams9.height = i10;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(i10, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(i10, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(i10, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(i10, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(i10, layoutParams9.bottomMargin);
        eu3Var.setLayoutParams(layoutParams9);
        return qe3Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        rt3.e().l(this);
    }

    @Override // defpackage.lo, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            zf3.T(this, null, new hn1(this, e.I, null), 3);
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        rt3.e().c(this);
        AppCompatEditText appCompatEditText = this.k;
        if (appCompatEditText == null) {
            appCompatEditText = null;
        }
        appCompatEditText.addTextChangedListener(new xn2(this, 6));
        fn1 fn1Var = new fn1(this, 4);
        kn1 kn1Var = this.f;
        kn1Var.e = fn1Var;
        kn1Var.f = new gn1(this, 1);
        kn1Var.g = new gn1(this, 2);
        zf3.T(this, null, new en1(this, null), 3);
    }
}
