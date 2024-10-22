package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class xp3 extends k4 implements q4 {
    public static final AccelerateInterpolator y = new AccelerateInterpolator();
    public static final DecelerateInterpolator z = new DecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public Context f5202a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5203b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public ze0 e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public wp3 i;
    public wp3 j;
    public g5 k;
    public boolean l;
    public final ArrayList m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public tm3 s;
    public boolean t;
    public boolean u;
    public final vp3 v;
    public final vp3 w;
    public final v51 x;

    public xp3(boolean z2, Activity activity) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new vp3(this, 0);
        this.w = new vp3(this, 1);
        this.x = new v51(this, 3);
        View decorView = activity.getWindow().getDecorView();
        u(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // defpackage.k4
    public final boolean b() {
        boolean z2;
        su1 su1Var;
        ze0 ze0Var = this.e;
        if (ze0Var != null) {
            h hVar = ((w93) ze0Var).f4966a.M;
            if (hVar != null && hVar.f180b != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                h hVar2 = ((w93) ze0Var).f4966a.M;
                if (hVar2 == null) {
                    su1Var = null;
                } else {
                    su1Var = hVar2.f180b;
                }
                if (su1Var != null) {
                    su1Var.collapseActionView();
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k4
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList arrayList = this.m;
        if (arrayList.size() <= 0) {
            return;
        }
        p71.C(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.k4
    public final int d() {
        return ((w93) this.e).f4967b;
    }

    @Override // defpackage.k4
    public final Context e() {
        if (this.f5203b == null) {
            TypedValue typedValue = new TypedValue();
            this.f5202a.getTheme().resolveAttribute(ie2.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f5203b = new ContextThemeWrapper(this.f5202a, i);
            } else {
                this.f5203b = this.f5202a;
            }
        }
        return this.f5203b;
    }

    @Override // defpackage.k4
    public final void g() {
        v(this.f5202a.getResources().getBoolean(ke2.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.k4
    public final boolean i(int i, KeyEvent keyEvent) {
        ju1 ju1Var;
        int i2;
        wp3 wp3Var = this.i;
        if (wp3Var == null || (ju1Var = wp3Var.d) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z2 = false;
        }
        ju1Var.setQwertyMode(z2);
        return ju1Var.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.k4
    public final void l(boolean z2) {
        if (!this.h) {
            m(z2);
        }
    }

    @Override // defpackage.k4
    public final void m(boolean z2) {
        int i;
        if (z2) {
            i = 4;
        } else {
            i = 0;
        }
        w93 w93Var = (w93) this.e;
        int i2 = w93Var.f4967b;
        this.h = true;
        w93Var.b((i & 4) | ((-5) & i2));
    }

    @Override // defpackage.k4
    public final void n() {
        w93 w93Var = (w93) this.e;
        w93Var.b((w93Var.f4967b & (-3)) | 2);
    }

    @Override // defpackage.k4
    public final void o() {
        w93 w93Var = (w93) this.e;
        w93Var.e = null;
        w93Var.c();
    }

    @Override // defpackage.k4
    public final void p(boolean z2) {
        tm3 tm3Var;
        this.t = z2;
        if (!z2 && (tm3Var = this.s) != null) {
            tm3Var.a();
        }
    }

    @Override // defpackage.k4
    public final void q(String str) {
        w93 w93Var = (w93) this.e;
        w93Var.g = true;
        w93Var.h = str;
        if ((w93Var.f4967b & 8) != 0) {
            Toolbar toolbar = w93Var.f4966a;
            toolbar.setTitle(str);
            if (w93Var.g) {
                ll3.q(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.k4
    public final void r(CharSequence charSequence) {
        w93 w93Var = (w93) this.e;
        if (!w93Var.g) {
            w93Var.h = charSequence;
            if ((w93Var.f4967b & 8) != 0) {
                Toolbar toolbar = w93Var.f4966a;
                toolbar.setTitle(charSequence);
                if (w93Var.g) {
                    ll3.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // defpackage.k4
    public final h5 s(xc xcVar) {
        wp3 wp3Var = this.i;
        if (wp3Var != null) {
            wp3Var.a();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.e();
        wp3 wp3Var2 = new wp3(this, this.f.getContext(), xcVar);
        ju1 ju1Var = wp3Var2.d;
        ju1Var.w();
        try {
            if (wp3Var2.e.j(wp3Var2, ju1Var)) {
                this.i = wp3Var2;
                wp3Var2.h();
                this.f.c(wp3Var2);
                t(true);
                return wp3Var2;
            }
            return null;
        } finally {
            ju1Var.v();
        }
    }

    public final void t(boolean z2) {
        rm3 l;
        rm3 rm3Var;
        long j;
        if (z2) {
            if (!this.q) {
                this.q = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                w(false);
            }
        } else if (this.q) {
            this.q = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            w(false);
        }
        ActionBarContainer actionBarContainer = this.d;
        WeakHashMap weakHashMap = ll3.f3151a;
        if (xk3.c(actionBarContainer)) {
            if (z2) {
                w93 w93Var = (w93) this.e;
                l = ll3.a(w93Var.f4966a);
                l.a(0.0f);
                l.c(100L);
                l.d(new sm3(w93Var, 4));
                rm3Var = this.f.l(0, 200L);
            } else {
                w93 w93Var2 = (w93) this.e;
                rm3 a2 = ll3.a(w93Var2.f4966a);
                a2.a(1.0f);
                a2.c(200L);
                a2.d(new sm3(w93Var2, 0));
                l = this.f.l(8, 100L);
                rm3Var = a2;
            }
            tm3 tm3Var = new tm3();
            ArrayList arrayList = tm3Var.f4538a;
            arrayList.add(l);
            View view = (View) l.f4181a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) rm3Var.f4181a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(rm3Var);
            tm3Var.b();
            return;
        }
        if (z2) {
            ((w93) this.e).f4966a.setVisibility(4);
            this.f.setVisibility(0);
        } else {
            ((w93) this.e).f4966a.setVisibility(0);
            this.f.setVisibility(8);
        }
    }

    public final void u(View view) {
        String str;
        ze0 wrapper;
        boolean z2;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(ye2.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(ye2.action_bar);
        if (findViewById instanceof ze0) {
            wrapper = (ze0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(ye2.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(ye2.action_bar_container);
        this.d = actionBarContainer;
        ze0 ze0Var = this.e;
        if (ze0Var != null && this.f != null && actionBarContainer != null) {
            Context a2 = ((w93) ze0Var).a();
            this.f5202a = a2;
            if ((((w93) this.e).f4967b & 4) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                this.h = true;
            }
            if (a2.getApplicationInfo().targetSdkVersion < 14) {
            }
            this.e.getClass();
            v(a2.getResources().getBoolean(ke2.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.f5202a.obtainStyledAttributes(null, cg2.ActionBar, ie2.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(cg2.ActionBar_hideOnContentScroll, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
                if (actionBarOverlayLayout2.h) {
                    this.u = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(cg2.ActionBar_elevation, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.d;
                WeakHashMap weakHashMap = ll3.f3151a;
                al3.s(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(xp3.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void v(boolean z2) {
        if (!z2) {
            ((w93) this.e).getClass();
            this.d.setTabContainer(null);
        } else {
            this.d.setTabContainer(null);
            ((w93) this.e).getClass();
        }
        this.e.getClass();
        ((w93) this.e).f4966a.setCollapsible(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void w(boolean z2) {
        boolean z3;
        boolean z4 = this.p;
        if (this.q || !z4) {
            z3 = true;
        } else {
            z3 = false;
        }
        v51 v51Var = this.x;
        int i = 2;
        bc bcVar = null;
        View view = this.g;
        if (z3) {
            if (!this.r) {
                this.r = true;
                tm3 tm3Var = this.s;
                if (tm3Var != null) {
                    tm3Var.a();
                }
                this.d.setVisibility(0);
                int i2 = this.n;
                vp3 vp3Var = this.w;
                if (i2 == 0 && (this.t || z2)) {
                    this.d.setTranslationY(0.0f);
                    float f = -this.d.getHeight();
                    if (z2) {
                        this.d.getLocationInWindow(new int[]{0, 0});
                        f -= r13[1];
                    }
                    this.d.setTranslationY(f);
                    tm3 tm3Var2 = new tm3();
                    rm3 a2 = ll3.a(this.d);
                    a2.e(0.0f);
                    View view2 = (View) a2.f4181a.get();
                    if (view2 != null) {
                        if (v51Var != null) {
                            bcVar = new bc(i, v51Var, view2);
                        }
                        qm3.a(view2.animate(), bcVar);
                    }
                    boolean z5 = tm3Var2.e;
                    ArrayList arrayList = tm3Var2.f4538a;
                    if (!z5) {
                        arrayList.add(a2);
                    }
                    if (this.o && view != null) {
                        view.setTranslationY(f);
                        rm3 a3 = ll3.a(view);
                        a3.e(0.0f);
                        if (!tm3Var2.e) {
                            arrayList.add(a3);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = z;
                    boolean z6 = tm3Var2.e;
                    if (!z6) {
                        tm3Var2.c = decelerateInterpolator;
                    }
                    if (!z6) {
                        tm3Var2.f4539b = 250L;
                    }
                    if (!z6) {
                        tm3Var2.d = vp3Var;
                    }
                    this.s = tm3Var2;
                    tm3Var2.b();
                } else {
                    this.d.setAlpha(1.0f);
                    this.d.setTranslationY(0.0f);
                    if (this.o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    vp3Var.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    yk3.c(actionBarOverlayLayout);
                    return;
                }
                return;
            }
            return;
        }
        if (this.r) {
            this.r = false;
            tm3 tm3Var3 = this.s;
            if (tm3Var3 != null) {
                tm3Var3.a();
            }
            int i3 = this.n;
            vp3 vp3Var2 = this.v;
            if (i3 == 0 && (this.t || z2)) {
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                tm3 tm3Var4 = new tm3();
                float f2 = -this.d.getHeight();
                if (z2) {
                    this.d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r13[1];
                }
                rm3 a4 = ll3.a(this.d);
                a4.e(f2);
                View view3 = (View) a4.f4181a.get();
                if (view3 != null) {
                    if (v51Var != null) {
                        bcVar = new bc(i, v51Var, view3);
                    }
                    qm3.a(view3.animate(), bcVar);
                }
                boolean z7 = tm3Var4.e;
                ArrayList arrayList2 = tm3Var4.f4538a;
                if (!z7) {
                    arrayList2.add(a4);
                }
                if (this.o && view != null) {
                    rm3 a5 = ll3.a(view);
                    a5.e(f2);
                    if (!tm3Var4.e) {
                        arrayList2.add(a5);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = y;
                boolean z8 = tm3Var4.e;
                if (!z8) {
                    tm3Var4.c = accelerateInterpolator;
                }
                if (!z8) {
                    tm3Var4.f4539b = 250L;
                }
                if (!z8) {
                    tm3Var4.d = vp3Var2;
                }
                this.s = tm3Var4;
                tm3Var4.b();
                return;
            }
            vp3Var2.c();
        }
    }

    public xp3(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList();
        this.n = 0;
        this.o = true;
        this.r = true;
        this.v = new vp3(this, 0);
        this.w = new vp3(this, 1);
        this.x = new v51(this, 3);
        u(dialog.getWindow().getDecorView());
    }
}
