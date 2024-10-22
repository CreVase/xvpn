package defpackage;

import a.du;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.browser.BrowserSettingActivity;
import com.security.xvpn.z35kb.browser.BrowserTabIndexActivity;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import defpackage.c61;
import defpackage.s53;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/* loaded from: classes2.dex */
public final class s53 extends sn {
    public static final /* synthetic */ int q = 0;
    public TextView d;
    public boolean e;
    public final br f;
    public final ArrayList g;
    public final z91 h;
    public final int i;
    public li1 j;
    public int k;
    public o11 l;
    public boolean m;
    public v31 n;
    public int o;
    public final Handler p;

    public s53() {
        super(0);
        this.f = br.f513a;
        this.i = -1;
        this.k = -1;
        ArrayList arrayList = new ArrayList(br.d);
        if (arrayList.isEmpty()) {
            this.g = new ArrayList();
        } else {
            z91 z91Var = (z91) d20.L0(arrayList);
            this.h = z91Var;
            if (arrayList.size() > 1) {
                m90 m90Var = new m90(2);
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, m90Var);
                }
            }
            this.i = arrayList.indexOf(z91Var);
            ArrayList arrayList2 = new ArrayList(a20.C0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                z91 z91Var2 = (z91) it.next();
                k53 k53Var = new k53(z91Var2, m20.L(this.h, z91Var2));
                k53Var.d = ((j53) z91Var2).c();
                arrayList2.add(k53Var);
            }
            this.g = new ArrayList(arrayList2);
        }
        this.p = new Handler();
    }

    public final void D(int i) {
        c cVar;
        o11 o11Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        o11 o11Var2 = this.l;
        if (o11Var2 != null && (recyclerView2 = o11Var2.d) != null) {
            cVar = recyclerView2.getLayoutManager();
        } else {
            cVar = null;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) cVar;
        ArrayList arrayList = this.g;
        if (arrayList.size() > 6) {
            if (i >= arrayList.size() - 4) {
                if (gridLayoutManager != null) {
                    gridLayoutManager.a1(tf3.N(arrayList), -2);
                    return;
                }
                return;
            }
            if (i > 3) {
                int max = Math.max(0, i - 2);
                if (gridLayoutManager != null) {
                    gridLayoutManager.a1(max, -2);
                    return;
                }
                return;
            }
            if ((!arrayList.isEmpty()) && (o11Var = this.l) != null && (recyclerView = o11Var.d) != null && !recyclerView.x) {
                c cVar2 = recyclerView.n;
                if (cVar2 == null) {
                    Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                } else {
                    cVar2.x0(recyclerView, i);
                }
            }
        }
    }

    public final void E() {
        ImageView imageView;
        o11 o11Var = this.l;
        if (o11Var != null) {
            imageView = o11Var.c;
        } else {
            imageView = null;
        }
        ArrayList arrayList = this.g;
        if (imageView != null) {
            imageView.setEnabled(!arrayList.isEmpty());
        }
        TextView textView = this.d;
        if (textView == null) {
            return;
        }
        int size = arrayList.size();
        if (size == 0) {
            textView.setText("");
        } else if (size > 99) {
            textView.setText(Html.fromHtml("99<sup>+</sup>"));
            textView.setTextSize(0, tf3.K(8));
        } else {
            textView.setTextSize(0, tf3.K(10));
            textView.setText(String.valueOf(size));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_browser_tab_index, (ViewGroup) null, false);
        int i = R.id.btn_toSetting;
        AppCompatImageView appCompatImageView = (AppCompatImageView) m20.g0(inflate, R.id.btn_toSetting);
        if (appCompatImageView != null) {
            i = R.id.ivTabsFrame;
            ImageView imageView = (ImageView) m20.g0(inflate, R.id.ivTabsFrame);
            if (imageView != null) {
                i = R.id.rv;
                RecyclerView recyclerView = (RecyclerView) m20.g0(inflate, R.id.rv);
                if (recyclerView != null) {
                    i = R.id.to_xvpn;
                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) m20.g0(inflate, R.id.to_xvpn);
                    if (appCompatImageView2 != null) {
                        i = R.id.toolbar;
                        if (((LinearLayout) m20.g0(inflate, R.id.toolbar)) != null) {
                            i = R.id.tvCount;
                            if (((TextView) m20.g0(inflate, R.id.tvCount)) != null) {
                                i = R.id.tvDone;
                                TextView textView = (TextView) m20.g0(inflate, R.id.tvDone);
                                if (textView != null) {
                                    i = R.id.vAlert;
                                    LinearLayout linearLayout = (LinearLayout) m20.g0(inflate, R.id.vAlert);
                                    if (linearLayout != null) {
                                        i = R.id.vBottom;
                                        if (((LinearLayout) m20.g0(inflate, R.id.vBottom)) != null) {
                                            i = R.id.vDelete;
                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) m20.g0(inflate, R.id.vDelete);
                                            if (appCompatImageView3 != null) {
                                                i = R.id.vNewTab;
                                                ImageView imageView2 = (ImageView) m20.g0(inflate, R.id.vNewTab);
                                                if (imageView2 != null) {
                                                    i = R.id.vTabsCount;
                                                    FrameLayout frameLayout = (FrameLayout) m20.g0(inflate, R.id.vTabsCount);
                                                    if (frameLayout != null) {
                                                        i = R.id.vUndo;
                                                        TextView textView2 = (TextView) m20.g0(inflate, R.id.vUndo);
                                                        if (textView2 != null) {
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                                                            this.l = new o11(constraintLayout, appCompatImageView, imageView, recyclerView, appCompatImageView2, textView, linearLayout, appCompatImageView3, imageView2, frameLayout, textView2);
                                                            return constraintLayout;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.m = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        super.onResume();
        this.e = false;
        this.m = false;
        ya0.L();
        if (bw3.b("Connected", pe0.b())) {
            o11 o11Var = this.l;
            if (o11Var != null && (appCompatImageView2 = o11Var.e) != null) {
                appCompatImageView2.setImageResource(R.drawable.icon_browser_vpn_connect);
                return;
            }
            return;
        }
        o11 o11Var2 = this.l;
        if (o11Var2 != null && (appCompatImageView = o11Var2.e) != null) {
            appCompatImageView.setImageResource(R.drawable.icon_browser_vpn_disconnect);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        boolean z;
        v31 v31Var = this.n;
        if (v31Var != null) {
            v31Var.invoke();
        }
        if (ya0.e0() && (this.e || !((XApplication) requireActivity().getApplication()).c())) {
            z = true;
        } else {
            z = false;
        }
        br brVar = this.f;
        if (z) {
            brVar.getClass();
            br.h = false;
            requireActivity().finish();
        }
        brVar.getClass();
        if (z) {
            br.a(false);
            br.b();
        }
        super.onStop();
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        b onBackPressedDispatcher = requireActivity().getOnBackPressedDispatcher();
        final int i = 1;
        p22 p22Var = new p22(new fv2(this, 8), true);
        onBackPressedDispatcher.f131b.c(p22Var);
        p22Var.f2194b.add(new n22(onBackPressedDispatcher, p22Var));
        onBackPressedDispatcher.d();
        p22Var.c = new o22(onBackPressedDispatcher, 1);
        this.d = (TextView) view.findViewById(R.id.tvCount);
        final o11 o11Var = this.l;
        if (o11Var != null) {
            String y = pd0.y(R.string.Undo);
            TextView textView = o11Var.k;
            textView.setText(y);
            textView.getPaint().setUnderlineText(true);
            requireContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager() { // from class: com.security.xvpn.z35kb.browser.TabIndexFragment$onViewCreated$2$layoutManager$1
                @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.c
                public final d s(Context context, AttributeSet attributeSet) {
                    c61 c61Var = new c61(context, attributeSet);
                    ((ViewGroup.MarginLayoutParams) c61Var).height = (int) ((o11Var.d.getHeight() - (42 * s53.this.getResources().getDisplayMetrics().density)) / 3);
                    return c61Var;
                }
            };
            li1 li1Var = new li1(new p53(this), new yy2(this, 10));
            this.j = li1Var;
            li1Var.g = this.g;
            RecyclerView recyclerView = o11Var.d;
            final int i2 = 0;
            recyclerView.getViewTreeObserver().addOnPreDrawListener(new q53(i2, o11Var, gridLayoutManager, this));
            li1 li1Var2 = this.j;
            if (li1Var2 == null) {
                li1Var2 = null;
            }
            recyclerView.setAdapter(li1Var2);
            o11Var.e.setOnClickListener(new View.OnClickListener() { // from class: l53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i2;
                    zj2 zj2Var = null;
                    Context context = null;
                    s53 s53Var = this;
                    switch (i3) {
                        case 0:
                            s53Var.f.getClass();
                            ViewGroup viewGroup = br.f;
                            if (viewGroup != null) {
                                context = viewGroup.getContext();
                            }
                            PrivateBrowserActivity privateBrowserActivity = (PrivateBrowserActivity) context;
                            boolean z = true;
                            if (privateBrowserActivity != null) {
                                privateBrowserActivity.a0();
                                privateBrowserActivity.l = true;
                                if (ya0.e0()) {
                                    privateBrowserActivity.k.getClass();
                                    br.a(false);
                                }
                                XApplication.e.remove(privateBrowserActivity);
                            }
                            Stack stack = XApplication.e;
                            if (stack.size() > 0) {
                                try {
                                    int size = stack.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                            Stack stack2 = XApplication.e;
                                            if (stack2.get(i4) instanceof BrowserTabIndexActivity) {
                                                ((Activity) stack2.get(i4)).finish();
                                                stack2.remove(stack2.get(i4));
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            s53Var.e = true;
                            v31 v31Var = s53Var.n;
                            if (v31Var != null) {
                                v31Var.invoke();
                            }
                            br.h = !br.d.isEmpty();
                            ya0.H(s53Var.requireActivity(), MainActivity.class);
                            s53Var.requireActivity().overridePendingTransition(R.anim.browser_slide_left_in, R.anim.browser_slide_right_out);
                            if (ya0.e0()) {
                                br.a(false);
                            }
                            XApplication.e.remove(s53Var.requireActivity());
                            if (!ya0.e0() || (!s53Var.e && ((XApplication) s53Var.requireActivity().getApplication()).c())) {
                                z = false;
                            }
                            if (z) {
                                br.h = false;
                            }
                            if (z) {
                                br.a(false);
                                br.b();
                                return;
                            }
                            return;
                        case 1:
                            int i5 = s53.q;
                            ya0.H(s53Var.requireActivity(), BrowserSettingActivity.class);
                            if (!ew3.X()) {
                                du.d(629, null);
                            }
                            v31 v31Var2 = s53Var.n;
                            if (v31Var2 != null) {
                                v31Var2.invoke();
                                return;
                            }
                            return;
                        default:
                            int i6 = s53.q;
                            if (!s53Var.requireActivity().isFinishing()) {
                                s53Var.n = null;
                                s53Var.f.getClass();
                                br.a(false);
                                br.h = false;
                                new File(s53Var.requireContext().getCacheDir(), "web_icon").delete();
                                zj2 zj2Var2 = d5.e;
                                if (zj2Var2 != null) {
                                    zj2Var = zj2Var2;
                                }
                                zj2Var.evictAll();
                                s53Var.requireActivity().finish();
                                return;
                            }
                            return;
                    }
                }
            });
            o11Var.i.setOnClickListener(new r53(this, o11Var));
            o11Var.f3579b.setOnClickListener(new View.OnClickListener() { // from class: l53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i3 = i;
                    zj2 zj2Var = null;
                    Context context = null;
                    s53 s53Var = this;
                    switch (i3) {
                        case 0:
                            s53Var.f.getClass();
                            ViewGroup viewGroup = br.f;
                            if (viewGroup != null) {
                                context = viewGroup.getContext();
                            }
                            PrivateBrowserActivity privateBrowserActivity = (PrivateBrowserActivity) context;
                            boolean z = true;
                            if (privateBrowserActivity != null) {
                                privateBrowserActivity.a0();
                                privateBrowserActivity.l = true;
                                if (ya0.e0()) {
                                    privateBrowserActivity.k.getClass();
                                    br.a(false);
                                }
                                XApplication.e.remove(privateBrowserActivity);
                            }
                            Stack stack = XApplication.e;
                            if (stack.size() > 0) {
                                try {
                                    int size = stack.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                            Stack stack2 = XApplication.e;
                                            if (stack2.get(i4) instanceof BrowserTabIndexActivity) {
                                                ((Activity) stack2.get(i4)).finish();
                                                stack2.remove(stack2.get(i4));
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            s53Var.e = true;
                            v31 v31Var = s53Var.n;
                            if (v31Var != null) {
                                v31Var.invoke();
                            }
                            br.h = !br.d.isEmpty();
                            ya0.H(s53Var.requireActivity(), MainActivity.class);
                            s53Var.requireActivity().overridePendingTransition(R.anim.browser_slide_left_in, R.anim.browser_slide_right_out);
                            if (ya0.e0()) {
                                br.a(false);
                            }
                            XApplication.e.remove(s53Var.requireActivity());
                            if (!ya0.e0() || (!s53Var.e && ((XApplication) s53Var.requireActivity().getApplication()).c())) {
                                z = false;
                            }
                            if (z) {
                                br.h = false;
                            }
                            if (z) {
                                br.a(false);
                                br.b();
                                return;
                            }
                            return;
                        case 1:
                            int i5 = s53.q;
                            ya0.H(s53Var.requireActivity(), BrowserSettingActivity.class);
                            if (!ew3.X()) {
                                du.d(629, null);
                            }
                            v31 v31Var2 = s53Var.n;
                            if (v31Var2 != null) {
                                v31Var2.invoke();
                                return;
                            }
                            return;
                        default:
                            int i6 = s53.q;
                            if (!s53Var.requireActivity().isFinishing()) {
                                s53Var.n = null;
                                s53Var.f.getClass();
                                br.a(false);
                                br.h = false;
                                new File(s53Var.requireContext().getCacheDir(), "web_icon").delete();
                                zj2 zj2Var2 = d5.e;
                                if (zj2Var2 != null) {
                                    zj2Var = zj2Var2;
                                }
                                zj2Var.evictAll();
                                s53Var.requireActivity().finish();
                                return;
                            }
                            return;
                    }
                }
            });
            o11Var.j.setOnClickListener(new ww2(6, o11Var, this));
            final int i3 = 2;
            o11Var.h.setOnClickListener(new View.OnClickListener() { // from class: l53
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i32 = i3;
                    zj2 zj2Var = null;
                    Context context = null;
                    s53 s53Var = this;
                    switch (i32) {
                        case 0:
                            s53Var.f.getClass();
                            ViewGroup viewGroup = br.f;
                            if (viewGroup != null) {
                                context = viewGroup.getContext();
                            }
                            PrivateBrowserActivity privateBrowserActivity = (PrivateBrowserActivity) context;
                            boolean z = true;
                            if (privateBrowserActivity != null) {
                                privateBrowserActivity.a0();
                                privateBrowserActivity.l = true;
                                if (ya0.e0()) {
                                    privateBrowserActivity.k.getClass();
                                    br.a(false);
                                }
                                XApplication.e.remove(privateBrowserActivity);
                            }
                            Stack stack = XApplication.e;
                            if (stack.size() > 0) {
                                try {
                                    int size = stack.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 < size) {
                                            Stack stack2 = XApplication.e;
                                            if (stack2.get(i4) instanceof BrowserTabIndexActivity) {
                                                ((Activity) stack2.get(i4)).finish();
                                                stack2.remove(stack2.get(i4));
                                            } else {
                                                i4++;
                                            }
                                        }
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                            s53Var.e = true;
                            v31 v31Var = s53Var.n;
                            if (v31Var != null) {
                                v31Var.invoke();
                            }
                            br.h = !br.d.isEmpty();
                            ya0.H(s53Var.requireActivity(), MainActivity.class);
                            s53Var.requireActivity().overridePendingTransition(R.anim.browser_slide_left_in, R.anim.browser_slide_right_out);
                            if (ya0.e0()) {
                                br.a(false);
                            }
                            XApplication.e.remove(s53Var.requireActivity());
                            if (!ya0.e0() || (!s53Var.e && ((XApplication) s53Var.requireActivity().getApplication()).c())) {
                                z = false;
                            }
                            if (z) {
                                br.h = false;
                            }
                            if (z) {
                                br.a(false);
                                br.b();
                                return;
                            }
                            return;
                        case 1:
                            int i5 = s53.q;
                            ya0.H(s53Var.requireActivity(), BrowserSettingActivity.class);
                            if (!ew3.X()) {
                                du.d(629, null);
                            }
                            v31 v31Var2 = s53Var.n;
                            if (v31Var2 != null) {
                                v31Var2.invoke();
                                return;
                            }
                            return;
                        default:
                            int i6 = s53.q;
                            if (!s53Var.requireActivity().isFinishing()) {
                                s53Var.n = null;
                                s53Var.f.getClass();
                                br.a(false);
                                br.h = false;
                                new File(s53Var.requireContext().getCacheDir(), "web_icon").delete();
                                zj2 zj2Var2 = d5.e;
                                if (zj2Var2 != null) {
                                    zj2Var = zj2Var2;
                                }
                                zj2Var.evictAll();
                                s53Var.requireActivity().finish();
                                return;
                            }
                            return;
                    }
                }
            });
            E();
        }
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        fl.g(this, view, 1000003);
    }

    public final void z(int i) {
        ImageView imageView;
        LinearLayout linearLayout;
        TextView textView;
        TextView textView2;
        ViewTreeObserver viewTreeObserver;
        if (i == -1) {
            return;
        }
        ArrayList arrayList = this.g;
        k53 k53Var = (k53) arrayList.get(i);
        k53Var.getClass();
        arrayList.remove(i);
        li1 li1Var = this.j;
        li1 li1Var2 = null;
        if (li1Var == null) {
            li1Var = null;
        }
        li1Var.f2091a.e(i, 1);
        li1 li1Var3 = this.j;
        if (li1Var3 == null) {
            li1Var3 = null;
        }
        li1Var3.f2091a.c(i, (arrayList.size() + 1) - i, null);
        E();
        o11 o11Var = this.l;
        if (o11Var != null) {
            imageView = o11Var.c;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setEnabled(!arrayList.isEmpty());
        }
        this.k = i;
        o11 o11Var2 = this.l;
        int i2 = 0;
        if (o11Var2 != null && (textView2 = o11Var2.f) != null && (viewTreeObserver = textView2.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new o53(i2, this, k53Var));
        }
        o11 o11Var3 = this.l;
        if (o11Var3 != null && (textView = o11Var3.k) != null) {
            textView.setOnClickListener(new ww2(7, this, k53Var));
        }
        v31 v31Var = this.n;
        if (v31Var != null) {
            v31Var.invoke();
        }
        o11 o11Var4 = this.l;
        if (o11Var4 != null && (linearLayout = o11Var4.g) != null) {
            linearLayout.setVisibility(0);
        }
        z91 z91Var = k53Var.f2891a;
        this.n = new a72(3, this, z91Var);
        int i3 = this.o + 1;
        this.o = i3;
        this.p.postDelayed(new gk2(i3, this), 3000L);
        this.f.getClass();
        ArrayList arrayList2 = br.d;
        if (m20.L(d20.L0(arrayList2), z91Var) && arrayList2.size() > 1) {
            z91 z91Var2 = (z91) arrayList2.get(tf3.N(arrayList2) - 1);
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (m20.L(((k53) it.next()).f2891a, z91Var2)) {
                        break;
                    } else {
                        i2++;
                    }
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 != -1) {
                ((k53) arrayList.get(i2)).f2892b = true;
                D(i2);
                li1 li1Var4 = this.j;
                if (li1Var4 != null) {
                    li1Var2 = li1Var4;
                }
                li1Var2.f();
            }
        }
    }
}
