package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class fv extends zu1 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public static final int B = kf2.abc_cascading_menu_item_layout;
    public boolean A;

    /* renamed from: b, reason: collision with root package name */
    public final Context f2159b;
    public final int c;
    public final int d;
    public final int e;
    public final boolean f;
    public final Handler g;
    public final bv j;
    public final cv k;
    public View o;
    public View p;
    public int q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean w;
    public iv1 x;
    public ViewTreeObserver y;
    public PopupWindow.OnDismissListener z;
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();
    public final v51 l = new v51(this, 4);
    public int m = 0;
    public int n = 0;
    public boolean v = false;

    public fv(Context context, View view, int i, int i2, boolean z) {
        this.j = new bv(this, r1);
        this.k = new cv(this, r1);
        this.f2159b = context;
        this.o = view;
        this.d = i;
        this.e = i2;
        this.f = z;
        WeakHashMap weakHashMap = ll3.f3151a;
        this.q = vk3.d(view) != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(se2.abc_config_prefDialogWidth));
        this.g = new Handler();
    }

    @Override // defpackage.jv1
    public final void a(ju1 ju1Var, boolean z) {
        int i;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (ju1Var == ((ev) arrayList.get(i2)).f2000b) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((ev) arrayList.get(i3)).f2000b.c(false);
        }
        ev evVar = (ev) arrayList.remove(i2);
        evVar.f2000b.r(this);
        boolean z2 = this.A;
        hv1 hv1Var = evVar.f1999a;
        if (z2) {
            if (Build.VERSION.SDK_INT >= 23) {
                dv1.b(hv1Var.z, null);
            } else {
                hv1Var.getClass();
            }
            hv1Var.z.setAnimationStyle(0);
        }
        hv1Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.q = ((ev) arrayList.get(size2 - 1)).c;
        } else {
            View view = this.o;
            WeakHashMap weakHashMap = ll3.f3151a;
            if (vk3.d(view) == 1) {
                i = 0;
            } else {
                i = 1;
            }
            this.q = i;
        }
        if (size2 == 0) {
            dismiss();
            iv1 iv1Var = this.x;
            if (iv1Var != null) {
                iv1Var.a(ju1Var, true);
            }
            ViewTreeObserver viewTreeObserver = this.y;
            if (viewTreeObserver != null) {
                if (viewTreeObserver.isAlive()) {
                    this.y.removeGlobalOnLayoutListener(this.j);
                }
                this.y = null;
            }
            this.p.removeOnAttachStateChangeListener(this.k);
            this.z.onDismiss();
            return;
        }
        if (z) {
            ((ev) arrayList.get(0)).f2000b.c(false);
        }
    }

    @Override // defpackage.gt2
    public final boolean b() {
        ArrayList arrayList = this.i;
        if (arrayList.size() <= 0 || !((ev) arrayList.get(0)).f1999a.b()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.jv1
    public final boolean c(q23 q23Var) {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ev evVar = (ev) it.next();
            if (q23Var == evVar.f2000b) {
                evVar.f1999a.c.requestFocus();
                return true;
            }
        }
        if (q23Var.hasVisibleItems()) {
            k(q23Var);
            iv1 iv1Var = this.x;
            if (iv1Var != null) {
                iv1Var.n(q23Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jv1
    public final boolean d() {
        return false;
    }

    @Override // defpackage.gt2
    public final void dismiss() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        if (size > 0) {
            ev[] evVarArr = (ev[]) arrayList.toArray(new ev[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    ev evVar = evVarArr[size];
                    if (evVar.f1999a.b()) {
                        evVar.f1999a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    @Override // defpackage.jv1
    public final void f(iv1 iv1Var) {
        this.x = iv1Var;
    }

    @Override // defpackage.jv1
    public final void h() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((ev) it.next()).f1999a.c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((gu1) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt2
    public final go0 i() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((ev) arrayList.get(arrayList.size() - 1)).f1999a.c;
    }

    @Override // defpackage.zu1
    public final void k(ju1 ju1Var) {
        ju1Var.b(this, this.f2159b);
        if (b()) {
            u(ju1Var);
        } else {
            this.h.add(ju1Var);
        }
    }

    @Override // defpackage.zu1
    public final void m(View view) {
        if (this.o != view) {
            this.o = view;
            int i = this.m;
            WeakHashMap weakHashMap = ll3.f3151a;
            this.n = Gravity.getAbsoluteGravity(i, vk3.d(view));
        }
    }

    @Override // defpackage.zu1
    public final void n(boolean z) {
        this.v = z;
    }

    @Override // defpackage.zu1
    public final void o(int i) {
        if (this.m != i) {
            this.m = i;
            View view = this.o;
            WeakHashMap weakHashMap = ll3.f3151a;
            this.n = Gravity.getAbsoluteGravity(i, vk3.d(view));
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ev evVar;
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                evVar = (ev) arrayList.get(i);
                if (!evVar.f1999a.b()) {
                    break;
                } else {
                    i++;
                }
            } else {
                evVar = null;
                break;
            }
        }
        if (evVar != null) {
            evVar.f2000b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // defpackage.zu1
    public final void p(int i) {
        this.r = true;
        this.t = i;
    }

    @Override // defpackage.zu1
    public final void q(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.zu1
    public final void r(boolean z) {
        this.w = z;
    }

    @Override // defpackage.zu1
    public final void s(int i) {
        this.s = true;
        this.u = i;
    }

    @Override // defpackage.gt2
    public final void show() {
        boolean z;
        if (b()) {
            return;
        }
        ArrayList arrayList = this.h;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            u((ju1) it.next());
        }
        arrayList.clear();
        View view = this.o;
        this.p = view;
        if (view != null) {
            if (this.y == null) {
                z = true;
            } else {
                z = false;
            }
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.y = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.j);
            }
            this.p.addOnAttachStateChangeListener(this.k);
        }
    }

    public final void u(ju1 ju1Var) {
        View view;
        ev evVar;
        Rect rect;
        int i;
        boolean z;
        char c;
        int i2;
        int i3;
        int width;
        MenuItem menuItem;
        gu1 gu1Var;
        int i4;
        int firstVisiblePosition;
        Context context = this.f2159b;
        LayoutInflater from = LayoutInflater.from(context);
        gu1 gu1Var2 = new gu1(ju1Var, from, this.f, B);
        if (!b() && this.v) {
            gu1Var2.c = true;
        } else if (b()) {
            gu1Var2.c = zu1.t(ju1Var);
        }
        int l = zu1.l(gu1Var2, context, this.c);
        hv1 hv1Var = new hv1(context, this.d, this.e);
        hv1Var.D = this.l;
        hv1Var.p = this;
        td tdVar = hv1Var.z;
        tdVar.setOnDismissListener(this);
        hv1Var.o = this.o;
        hv1Var.l = this.n;
        hv1Var.y = true;
        tdVar.setFocusable(true);
        tdVar.setInputMethodMode(2);
        hv1Var.p(gu1Var2);
        hv1Var.q(l);
        hv1Var.l = this.n;
        ArrayList arrayList = this.i;
        if (arrayList.size() > 0) {
            evVar = (ev) arrayList.get(arrayList.size() - 1);
            ju1 ju1Var2 = evVar.f2000b;
            int size = ju1Var2.size();
            int i5 = 0;
            while (true) {
                if (i5 < size) {
                    menuItem = ju1Var2.getItem(i5);
                    if (menuItem.hasSubMenu() && ju1Var == menuItem.getSubMenu()) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    menuItem = null;
                    break;
                }
            }
            if (menuItem != null) {
                go0 go0Var = evVar.f1999a.c;
                ListAdapter adapter = go0Var.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i4 = headerViewListAdapter.getHeadersCount();
                    gu1Var = (gu1) headerViewListAdapter.getWrappedAdapter();
                } else {
                    gu1Var = (gu1) adapter;
                    i4 = 0;
                }
                int count = gu1Var.getCount();
                int i6 = 0;
                while (true) {
                    if (i6 < count) {
                        if (menuItem == gu1Var.getItem(i6)) {
                            break;
                        } else {
                            i6++;
                        }
                    } else {
                        i6 = -1;
                        break;
                    }
                }
                if (i6 != -1 && (firstVisiblePosition = (i6 + i4) - go0Var.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < go0Var.getChildCount()) {
                    view = go0Var.getChildAt(firstVisiblePosition);
                }
            }
            view = null;
        } else {
            view = null;
            evVar = null;
        }
        if (view != null) {
            if (Build.VERSION.SDK_INT <= 28) {
                Method method = hv1.E;
                if (method != null) {
                    try {
                        method.invoke(tdVar, Boolean.FALSE);
                    } catch (Exception unused) {
                        Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                    }
                }
            } else {
                ev1.a(tdVar, false);
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 23) {
                dv1.a(tdVar, null);
            }
            go0 go0Var2 = ((ev) arrayList.get(arrayList.size() - 1)).f1999a.c;
            int[] iArr = new int[2];
            go0Var2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            this.p.getWindowVisibleDisplayFrame(rect2);
            if (this.q != 1 ? iArr[0] - l < 0 : go0Var2.getWidth() + iArr[0] + l <= rect2.right) {
                i = 1;
            } else {
                i = 0;
            }
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            this.q = i;
            if (i7 >= 26) {
                hv1Var.o = view;
                i3 = 0;
                i2 = 0;
            } else {
                int[] iArr2 = new int[2];
                this.o.getLocationOnScreen(iArr2);
                int[] iArr3 = new int[2];
                view.getLocationOnScreen(iArr3);
                if ((this.n & 7) == 5) {
                    c = 0;
                    iArr2[0] = this.o.getWidth() + iArr2[0];
                    iArr3[0] = view.getWidth() + iArr3[0];
                } else {
                    c = 0;
                }
                i2 = iArr3[c] - iArr2[c];
                i3 = iArr3[1] - iArr2[1];
            }
            if ((this.n & 5) == 5) {
                if (z) {
                    width = i2 + l;
                    hv1Var.f = width;
                    hv1Var.k = true;
                    hv1Var.j = true;
                    hv1Var.l(i3);
                } else {
                    l = view.getWidth();
                    width = i2 - l;
                    hv1Var.f = width;
                    hv1Var.k = true;
                    hv1Var.j = true;
                    hv1Var.l(i3);
                }
            } else {
                if (z) {
                    width = i2 + view.getWidth();
                    hv1Var.f = width;
                    hv1Var.k = true;
                    hv1Var.j = true;
                    hv1Var.l(i3);
                }
                width = i2 - l;
                hv1Var.f = width;
                hv1Var.k = true;
                hv1Var.j = true;
                hv1Var.l(i3);
            }
        } else {
            if (this.r) {
                hv1Var.f = this.t;
            }
            if (this.s) {
                hv1Var.l(this.u);
            }
            Rect rect3 = this.f5549a;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            hv1Var.x = rect;
        }
        arrayList.add(new ev(hv1Var, ju1Var, this.q));
        hv1Var.show();
        go0 go0Var3 = hv1Var.c;
        go0Var3.setOnKeyListener(this);
        if (evVar == null && this.w && ju1Var.m != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(kf2.abc_popup_menu_header_item_layout, (ViewGroup) go0Var3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(ju1Var.m);
            go0Var3.addHeaderView(frameLayout, null, false);
            hv1Var.show();
        }
    }
}
