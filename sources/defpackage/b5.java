package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b5 implements jv1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f400a;

    /* renamed from: b, reason: collision with root package name */
    public Context f401b;
    public ju1 c;
    public final LayoutInflater d;
    public iv1 e;
    public final int f;
    public final int g;
    public mv1 h;
    public a5 i;
    public Drawable j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public final SparseBooleanArray r;
    public w4 s;
    public w4 t;
    public y4 u;
    public x4 v;
    public final v51 w;

    public b5(Context context) {
        int i = kf2.abc_action_menu_layout;
        int i2 = kf2.abc_action_menu_item_layout;
        this.f400a = context;
        this.d = LayoutInflater.from(context);
        this.f = i;
        this.g = i2;
        this.r = new SparseBooleanArray();
        this.w = new v51(this, 5);
    }

    @Override // defpackage.jv1
    public final void a(ju1 ju1Var, boolean z) {
        i();
        w4 w4Var = this.t;
        if (w4Var != null && w4Var.b()) {
            w4Var.j.dismiss();
        }
        iv1 iv1Var = this.e;
        if (iv1Var != null) {
            iv1Var.a(ju1Var, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [lv1] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View b(su1 su1Var, View view, ViewGroup viewGroup) {
        ActionMenuItemView actionMenuItemView;
        View actionView = su1Var.getActionView();
        int i = 0;
        if (actionView == null || su1Var.e()) {
            if (view instanceof lv1) {
                actionMenuItemView = (lv1) view;
            } else {
                actionMenuItemView = (lv1) this.d.inflate(this.g, viewGroup, false);
            }
            actionMenuItemView.c(su1Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.v == null) {
                this.v = new x4(this);
            }
            actionMenuItemView2.setPopupCallback(this.v);
            actionView = actionMenuItemView;
        }
        if (su1Var.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!((ActionMenuView) viewGroup).checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(ActionMenuView.l(layoutParams));
        }
        return actionView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    @Override // defpackage.jv1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(defpackage.q23 r9) {
        /*
            r8 = this;
            boolean r0 = r9.hasVisibleItems()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r9
        L9:
            ju1 r2 = r0.z
            ju1 r3 = r8.c
            if (r2 == r3) goto L13
            r0 = r2
            q23 r0 = (defpackage.q23) r0
            goto L9
        L13:
            mv1 r2 = r8.h
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r2 != 0) goto L1a
            goto L38
        L1a:
            int r3 = r2.getChildCount()
            r4 = 0
        L1f:
            if (r4 >= r3) goto L38
            android.view.View r5 = r2.getChildAt(r4)
            boolean r6 = r5 instanceof defpackage.lv1
            if (r6 == 0) goto L35
            r6 = r5
            lv1 r6 = (defpackage.lv1) r6
            su1 r6 = r6.getItemData()
            su1 r7 = r0.A
            if (r6 != r7) goto L35
            goto L39
        L35:
            int r4 = r4 + 1
            goto L1f
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L3c
            return r1
        L3c:
            su1 r0 = r9.A
            r0.getClass()
            int r0 = r9.size()
            r2 = 0
        L46:
            r3 = 1
            if (r2 >= r0) goto L5e
            android.view.MenuItem r4 = r9.getItem(r2)
            boolean r6 = r4.isVisible()
            if (r6 == 0) goto L5b
            android.graphics.drawable.Drawable r4 = r4.getIcon()
            if (r4 == 0) goto L5b
            r0 = 1
            goto L5f
        L5b:
            int r2 = r2 + 1
            goto L46
        L5e:
            r0 = 0
        L5f:
            w4 r2 = new w4
            android.content.Context r4 = r8.f401b
            r2.<init>(r8, r4, r9, r5)
            r8.t = r2
            r2.h = r0
            zu1 r2 = r2.j
            if (r2 == 0) goto L71
            r2.n(r0)
        L71:
            w4 r0 = r8.t
            boolean r2 = r0.b()
            if (r2 == 0) goto L7b
        L79:
            r1 = 1
            goto L84
        L7b:
            android.view.View r2 = r0.f
            if (r2 != 0) goto L80
            goto L84
        L80:
            r0.d(r1, r1, r1, r1)
            goto L79
        L84:
            if (r1 == 0) goto L8e
            iv1 r0 = r8.e
            if (r0 == 0) goto L8d
            r0.n(r9)
        L8d:
            return r3
        L8e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "MenuPopupHelper cannot be used without an anchor"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5.c(q23):boolean");
    }

    @Override // defpackage.jv1
    public final boolean d() {
        ArrayList arrayList;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ju1 ju1Var = this.c;
        if (ju1Var != null) {
            arrayList = ju1Var.l();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i3 = this.p;
        int i4 = this.o;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i5 = 0;
        boolean z8 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            su1 su1Var = (su1) arrayList.get(i5);
            int i8 = su1Var.y;
            if ((i8 & 2) == 2) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                i6++;
            } else {
                if ((i8 & 1) == 1) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z7) {
                    i7++;
                } else {
                    z8 = true;
                }
            }
            if (this.q && su1Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.l && (z8 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            su1 su1Var2 = (su1) arrayList.get(i10);
            int i12 = su1Var2.y;
            if ((i12 & 2) == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i13 = su1Var2.f4415b;
            if (z2) {
                View b2 = b(su1Var2, null, viewGroup);
                b2.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b2.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                su1Var2.g(z);
            } else {
                if ((i12 & 1) == z) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    boolean z9 = sparseBooleanArray.get(i13);
                    if ((i9 > 0 || z9) && i4 > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        View b3 = b(su1Var2, null, viewGroup);
                        b3.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = b3.getMeasuredWidth();
                        i4 -= measuredWidth2;
                        if (i11 == 0) {
                            i11 = measuredWidth2;
                        }
                        if (i4 + i11 > 0) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z4 &= z5;
                    }
                    if (z4 && i13 != 0) {
                        sparseBooleanArray.put(i13, true);
                    } else if (z9) {
                        sparseBooleanArray.put(i13, false);
                        for (int i14 = 0; i14 < i10; i14++) {
                            su1 su1Var3 = (su1) arrayList.get(i14);
                            if (su1Var3.f4415b == i13) {
                                if (su1Var3.f()) {
                                    i9++;
                                }
                                su1Var3.g(false);
                            }
                        }
                    }
                    if (z4) {
                        i9--;
                    }
                    su1Var2.g(z4);
                } else {
                    su1Var2.g(false);
                    i10++;
                    i2 = 2;
                    z = true;
                }
            }
            i10++;
            i2 = 2;
            z = true;
        }
        return true;
    }

    @Override // defpackage.jv1
    public final /* bridge */ /* synthetic */ boolean e(su1 su1Var) {
        return false;
    }

    @Override // defpackage.jv1
    public final void f(iv1 iv1Var) {
        this.e = iv1Var;
    }

    @Override // defpackage.jv1
    public final /* bridge */ /* synthetic */ boolean g(su1 su1Var) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jv1
    public final void h() {
        int i;
        boolean z;
        su1 su1Var;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            ju1 ju1Var = this.c;
            if (ju1Var != null) {
                ju1Var.i();
                ArrayList l = this.c.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    su1 su1Var2 = (su1) l.get(i2);
                    if (su1Var2.f()) {
                        View childAt = viewGroup.getChildAt(i);
                        if (childAt instanceof lv1) {
                            su1Var = ((lv1) childAt).getItemData();
                        } else {
                            su1Var = null;
                        }
                        View b2 = b(su1Var2, childAt, viewGroup);
                        if (su1Var2 != su1Var) {
                            b2.setPressed(false);
                            b2.jumpDrawablesToCurrentState();
                        }
                        if (b2 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b2.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b2);
                            }
                            ((ViewGroup) this.h).addView(b2, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.i) {
                    z = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z = true;
                }
                if (!z) {
                    i++;
                }
            }
        }
        ((View) this.h).requestLayout();
        ju1 ju1Var2 = this.c;
        if (ju1Var2 != null) {
            ju1Var2.i();
            ArrayList arrayList2 = ju1Var2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tu1 tu1Var = ((su1) arrayList2.get(i3)).A;
            }
        }
        ju1 ju1Var3 = this.c;
        if (ju1Var3 != null) {
            ju1Var3.i();
            arrayList = ju1Var3.j;
        }
        if (this.l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((su1) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.i == null) {
                this.i = new a5(this, this.f400a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                a5 a5Var = this.i;
                actionMenuView.getClass();
                e5 e5Var = new e5();
                ((LinearLayout.LayoutParams) e5Var).gravity = 16;
                e5Var.f1884a = true;
                actionMenuView.addView(a5Var, e5Var);
            }
        } else {
            a5 a5Var2 = this.i;
            if (a5Var2 != null) {
                Object parent = a5Var2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.l);
    }

    public final boolean i() {
        Object obj;
        y4 y4Var = this.u;
        if (y4Var != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(y4Var);
            this.u = null;
            return true;
        }
        w4 w4Var = this.s;
        if (w4Var != null) {
            if (w4Var.b()) {
                w4Var.j.dismiss();
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.jv1
    public final void j(Context context, ju1 ju1Var) {
        this.f401b = context;
        LayoutInflater.from(context);
        this.c = ju1Var;
        Resources resources = context.getResources();
        if (!this.m) {
            this.l = true;
        }
        int i = 2;
        this.n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i2 <= 600 && ((i2 <= 960 || i3 <= 720) && (i2 <= 720 || i3 <= 960))) {
            if (i2 < 500 && ((i2 <= 640 || i3 <= 480) && (i2 <= 480 || i3 <= 640))) {
                if (i2 >= 360) {
                    i = 3;
                }
            } else {
                i = 4;
            }
        } else {
            i = 5;
        }
        this.p = i;
        int i4 = this.n;
        if (this.l) {
            if (this.i == null) {
                a5 a5Var = new a5(this, this.f400a);
                this.i = a5Var;
                if (this.k) {
                    a5Var.setImageDrawable(this.j);
                    this.j = null;
                    this.k = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.i.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.i.getMeasuredWidth();
        } else {
            this.i = null;
        }
        this.o = i4;
        float f = resources.getDisplayMetrics().density;
    }

    public final boolean k() {
        w4 w4Var = this.s;
        if (w4Var != null && w4Var.b()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        ju1 ju1Var;
        int i = 0;
        if (this.l && !k() && (ju1Var = this.c) != null && this.h != null && this.u == null) {
            ju1Var.i();
            if (!ju1Var.j.isEmpty()) {
                y4 y4Var = new y4(i, this, new w4(this, this.f401b, this.c, this.i));
                this.u = y4Var;
                ((View) this.h).post(y4Var);
                return true;
            }
        }
        return false;
    }
}
