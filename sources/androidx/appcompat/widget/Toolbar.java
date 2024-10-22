package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import defpackage.b5;
import defpackage.cg2;
import defpackage.ew3;
import defpackage.f9;
import defpackage.go2;
import defpackage.hu1;
import defpackage.ie2;
import defpackage.iv1;
import defpackage.j4;
import defpackage.ja1;
import defpackage.ju1;
import defpackage.kq1;
import defpackage.kv1;
import defpackage.ll3;
import defpackage.lu1;
import defpackage.p33;
import defpackage.p93;
import defpackage.pu1;
import defpackage.q93;
import defpackage.qd;
import defpackage.qw3;
import defpackage.r93;
import defpackage.rl2;
import defpackage.s93;
import defpackage.su1;
import defpackage.u11;
import defpackage.v51;
import defpackage.vk3;
import defpackage.w93;
import defpackage.xk3;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements lu1 {
    public ColorStateList A;
    public boolean B;
    public boolean C;
    public final ArrayList D;
    public final ArrayList E;
    public final int[] F;
    public final pu1 G;
    public ArrayList H;
    public s93 I;
    public final ja1 J;
    public w93 K;
    public b5 L;
    public h M;
    public iv1 N;
    public hu1 O;
    public boolean P;
    public OnBackInvokedCallback Q;
    public OnBackInvokedDispatcher R;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f170a;

    /* renamed from: b, reason: collision with root package name */
    public AppCompatTextView f171b;
    public AppCompatTextView c;
    public qd d;
    public AppCompatImageView e;
    public final Drawable f;
    public final CharSequence g;
    public qd h;
    public boolean h0;
    public View i;
    public final qw3 i0;
    public Context j;
    public int k;
    public int l;
    public int m;
    public final int n;
    public final int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public rl2 t;
    public int u;
    public int v;
    public final int w;
    public CharSequence x;
    public CharSequence y;
    public ColorStateList z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new i();
        public int c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.c = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.d = z;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ie2.toolbarStyle);
    }

    public static r93 g(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof r93) {
            return new r93((r93) layoutParams);
        }
        if (layoutParams instanceof j4) {
            return new r93((j4) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new r93((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new r93(layoutParams);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p33(getContext());
    }

    public static int i(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return kq1.b(marginLayoutParams) + kq1.c(marginLayoutParams);
    }

    public static int j(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(int i, ArrayList arrayList) {
        boolean z;
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, vk3.d(this));
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                r93 r93Var = (r93) childAt.getLayoutParams();
                if (r93Var.f4118b == 0 && r(childAt)) {
                    int i3 = r93Var.f2700a;
                    WeakHashMap weakHashMap2 = ll3.f3151a;
                    int d = vk3.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, d) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = d == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            r93 r93Var2 = (r93) childAt2.getLayoutParams();
            if (r93Var2.f4118b == 0 && r(childAt2)) {
                int i5 = r93Var2.f2700a;
                WeakHashMap weakHashMap3 = ll3.f3151a;
                int d2 = vk3.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, d2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = d2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    @Override // defpackage.lu1
    public final void addMenuProvider(kv1 kv1Var) {
        pu1 pu1Var = this.G;
        pu1Var.f3920b.add(kv1Var);
        pu1Var.f3919a.run();
    }

    public final void b(View view, boolean z) {
        r93 r93Var;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            r93Var = new r93();
        } else if (!checkLayoutParams(layoutParams)) {
            r93Var = g(layoutParams);
        } else {
            r93Var = (r93) layoutParams;
        }
        r93Var.f4118b = 1;
        if (z && this.i != null) {
            view.setLayoutParams(r93Var);
            this.E.add(view);
        } else {
            addView(view, r93Var);
        }
    }

    public final void c() {
        if (this.h == null) {
            qd qdVar = new qd(getContext(), null, ie2.toolbarNavigationButtonStyle);
            this.h = qdVar;
            qdVar.setImageDrawable(this.f);
            this.h.setContentDescription(this.g);
            r93 r93Var = new r93();
            r93Var.f2700a = (this.n & 112) | 8388611;
            r93Var.f4118b = 2;
            this.h.setLayoutParams(r93Var);
            this.h.setOnClickListener(new f9(this, 1));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof r93)) {
            return true;
        }
        return false;
    }

    public final void d() {
        e();
        ActionMenuView actionMenuView = this.f170a;
        if (actionMenuView.p == null) {
            ju1 ju1Var = (ju1) actionMenuView.getMenu();
            if (this.M == null) {
                this.M = new h(this);
            }
            this.f170a.setExpandedActionViewsExclusive(true);
            ju1Var.b(this.M, this.j);
            s();
        }
    }

    public final void e() {
        if (this.f170a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f170a = actionMenuView;
            actionMenuView.setPopupTheme(this.k);
            this.f170a.setOnMenuItemClickListener(this.J);
            ActionMenuView actionMenuView2 = this.f170a;
            iv1 iv1Var = this.N;
            v51 v51Var = new v51(this, 7);
            actionMenuView2.u = iv1Var;
            actionMenuView2.v = v51Var;
            r93 r93Var = new r93();
            r93Var.f2700a = (this.n & 112) | 8388613;
            this.f170a.setLayoutParams(r93Var);
            b(this.f170a, false);
        }
    }

    public final void f() {
        if (this.d == null) {
            this.d = new qd(getContext(), null, ie2.toolbarNavigationButtonStyle);
            r93 r93Var = new r93();
            r93Var.f2700a = (this.n & 112) | 8388611;
            this.d.setLayoutParams(r93Var);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new r93();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return g(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        qd qdVar = this.h;
        if (qdVar != null) {
            return qdVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        qd qdVar = this.h;
        if (qdVar != null) {
            return qdVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        rl2 rl2Var = this.t;
        if (rl2Var != null) {
            if (rl2Var.g) {
                return rl2Var.f4173a;
            }
            return rl2Var.f4174b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.v;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        rl2 rl2Var = this.t;
        if (rl2Var != null) {
            return rl2Var.f4173a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        rl2 rl2Var = this.t;
        if (rl2Var != null) {
            return rl2Var.f4174b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        rl2 rl2Var = this.t;
        if (rl2Var != null) {
            if (rl2Var.g) {
                return rl2Var.f4174b;
            }
            return rl2Var.f4173a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.u;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        ju1 ju1Var;
        ActionMenuView actionMenuView = this.f170a;
        if (actionMenuView != null && (ju1Var = actionMenuView.p) != null && ju1Var.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.v, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.u, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            return appCompatImageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        d();
        return this.f170a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        qd qdVar = this.d;
        if (qdVar != null) {
            return qdVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        qd qdVar = this.d;
        if (qdVar != null) {
            return qdVar.getDrawable();
        }
        return null;
    }

    public b5 getOuterActionMenuPresenter() {
        return this.L;
    }

    public Drawable getOverflowIcon() {
        d();
        return this.f170a.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.j;
    }

    public int getPopupTheme() {
        return this.k;
    }

    public CharSequence getSubtitle() {
        return this.y;
    }

    public final TextView getSubtitleTextView() {
        return this.c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.s;
    }

    public int getTitleMarginEnd() {
        return this.q;
    }

    public int getTitleMarginStart() {
        return this.p;
    }

    public int getTitleMarginTop() {
        return this.r;
    }

    public final TextView getTitleTextView() {
        return this.f171b;
    }

    public ze0 getWrapper() {
        if (this.K == null) {
            this.K = new w93(this, true);
        }
        return this.K;
    }

    public final int h(View view, int i) {
        int i2;
        r93 r93Var = (r93) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = r93Var.f2700a & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.w & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) r93Var).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) r93Var).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) r93Var).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public void k(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void l() {
        Iterator it = this.H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        MenuInflater menuInflater = getMenuInflater();
        Iterator it2 = this.G.f3920b.iterator();
        while (it2.hasNext()) {
            ((u11) ((kv1) it2.next())).f4613a.j(menu, menuInflater);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.H = currentMenuItems2;
    }

    public final boolean m(View view) {
        if (view.getParent() != this && !this.E.contains(view)) {
            return false;
        }
        return true;
    }

    public final int n(View view, int i, int i2, int[] iArr) {
        r93 r93Var = (r93) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) r93Var).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int h = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, h, max + measuredWidth, view.getMeasuredHeight() + h);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) r93Var).rightMargin + max;
    }

    public final int o(View view, int i, int i2, int[] iArr) {
        r93 r93Var = (r93) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) r93Var).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int h = h(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, h, max, view.getMeasuredHeight() + h);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) r93Var).leftMargin);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.i0);
        s();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.C = false;
        }
        if (!this.C) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0292 A[LOOP:0: B:40:0x0290->B:41:0x0292, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02ae A[LOOP:1: B:44:0x02ac->B:45:0x02ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02cd A[LOOP:2: B:48:0x02cb->B:49:0x02cd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x031b A[LOOP:3: B:57:0x0319->B:58:0x031b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ju1 ju1Var;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f200a);
        ActionMenuView actionMenuView = this.f170a;
        if (actionMenuView != null) {
            ju1Var = actionMenuView.p;
        } else {
            ju1Var = null;
        }
        int i = savedState.c;
        if (i != 0 && this.M != null && ju1Var != null && (findItem = ju1Var.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (savedState.d) {
            qw3 qw3Var = this.i0;
            removeCallbacks(qw3Var);
            post(qw3Var);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.t == null) {
            this.t = new rl2();
        }
        rl2 rl2Var = this.t;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != rl2Var.g) {
            rl2Var.g = z;
            if (rl2Var.h) {
                if (z) {
                    int i2 = rl2Var.d;
                    if (i2 == Integer.MIN_VALUE) {
                        i2 = rl2Var.e;
                    }
                    rl2Var.f4173a = i2;
                    int i3 = rl2Var.c;
                    if (i3 == Integer.MIN_VALUE) {
                        i3 = rl2Var.f;
                    }
                    rl2Var.f4174b = i3;
                    return;
                }
                int i4 = rl2Var.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = rl2Var.e;
                }
                rl2Var.f4173a = i4;
                int i5 = rl2Var.d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = rl2Var.f;
                }
                rl2Var.f4174b = i5;
                return;
            }
            rl2Var.f4173a = rl2Var.e;
            rl2Var.f4174b = rl2Var.f;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        su1 su1Var;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        h hVar = this.M;
        if (hVar != null && (su1Var = hVar.f180b) != null) {
            savedState.c = su1Var.f4414a;
        }
        ActionMenuView actionMenuView = this.f170a;
        boolean z2 = false;
        if (actionMenuView != null) {
            b5 b5Var = actionMenuView.t;
            if (b5Var != null && b5Var.k()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        savedState.d = z2;
        return savedState;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = false;
        }
        if (!this.B) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.B = false;
        }
        return true;
    }

    public final int p(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void q(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean r(View view) {
        if (view != null && view.getParent() == this && view.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override // defpackage.lu1
    public final void removeMenuProvider(kv1 kv1Var) {
        this.G.b(kv1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a2 = q93.a(this);
            h hVar = this.M;
            boolean z2 = false;
            int i = 1;
            if (hVar != null && hVar.f180b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && a2 != null) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (xk3.b(this) && this.h0) {
                    z2 = true;
                }
            }
            if (z2 && this.R == null) {
                if (this.Q == null) {
                    this.Q = q93.b(new p93(this, i));
                }
                q93.c(a2, this.Q);
                this.R = a2;
                return;
            }
            if (!z2 && (onBackInvokedDispatcher = this.R) != null) {
                q93.d(onBackInvokedDispatcher, this.Q);
                this.R = null;
            }
        }
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.h0 != z) {
            this.h0 = z;
            s();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(ew3.P0(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.P = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.u) {
            this.u = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(ew3.P0(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(ew3.P0(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        f();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(s93 s93Var) {
        this.I = s93Var;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        this.f170a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.k != i) {
            this.k = i;
            if (i == 0) {
                this.j = getContext();
            } else {
                this.j = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.p = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.w = 8388627;
        this.D = new ArrayList();
        this.E = new ArrayList();
        this.F = new int[2];
        this.G = new pu1(new p93(this, 0));
        this.H = new ArrayList();
        this.J = new ja1(this, 4);
        this.i0 = new qw3(this, 5);
        Context context2 = getContext();
        int[] iArr = cg2.Toolbar;
        go2 m = go2.m(context2, attributeSet, iArr, i);
        Object obj = m.f2294b;
        ll3.o(this, context, iArr, attributeSet, (TypedArray) obj, i);
        this.l = m.i(cg2.Toolbar_titleTextAppearance, 0);
        this.m = m.i(cg2.Toolbar_subtitleTextAppearance, 0);
        this.w = ((TypedArray) obj).getInteger(cg2.Toolbar_android_gravity, 8388627);
        this.n = ((TypedArray) obj).getInteger(cg2.Toolbar_buttonGravity, 48);
        int c = m.c(cg2.Toolbar_titleMargin, 0);
        int i2 = cg2.Toolbar_titleMargins;
        c = m.l(i2) ? m.c(i2, c) : c;
        this.s = c;
        this.r = c;
        this.q = c;
        this.p = c;
        int c2 = m.c(cg2.Toolbar_titleMarginStart, -1);
        if (c2 >= 0) {
            this.p = c2;
        }
        int c3 = m.c(cg2.Toolbar_titleMarginEnd, -1);
        if (c3 >= 0) {
            this.q = c3;
        }
        int c4 = m.c(cg2.Toolbar_titleMarginTop, -1);
        if (c4 >= 0) {
            this.r = c4;
        }
        int c5 = m.c(cg2.Toolbar_titleMarginBottom, -1);
        if (c5 >= 0) {
            this.s = c5;
        }
        this.o = m.d(cg2.Toolbar_maxButtonHeight, -1);
        int c6 = m.c(cg2.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int c7 = m.c(cg2.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int d = m.d(cg2.Toolbar_contentInsetLeft, 0);
        int d2 = m.d(cg2.Toolbar_contentInsetRight, 0);
        if (this.t == null) {
            this.t = new rl2();
        }
        rl2 rl2Var = this.t;
        rl2Var.h = false;
        if (d != Integer.MIN_VALUE) {
            rl2Var.e = d;
            rl2Var.f4173a = d;
        }
        if (d2 != Integer.MIN_VALUE) {
            rl2Var.f = d2;
            rl2Var.f4174b = d2;
        }
        if (c6 != Integer.MIN_VALUE || c7 != Integer.MIN_VALUE) {
            rl2Var.a(c6, c7);
        }
        this.u = m.c(cg2.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.v = m.c(cg2.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f = m.e(cg2.Toolbar_collapseIcon);
        this.g = m.k(cg2.Toolbar_collapseContentDescription);
        CharSequence k = m.k(cg2.Toolbar_title);
        if (!TextUtils.isEmpty(k)) {
            setTitle(k);
        }
        CharSequence k2 = m.k(cg2.Toolbar_subtitle);
        if (!TextUtils.isEmpty(k2)) {
            setSubtitle(k2);
        }
        this.j = getContext();
        setPopupTheme(m.i(cg2.Toolbar_popupTheme, 0));
        Drawable e = m.e(cg2.Toolbar_navigationIcon);
        if (e != null) {
            setNavigationIcon(e);
        }
        CharSequence k3 = m.k(cg2.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(k3)) {
            setNavigationContentDescription(k3);
        }
        Drawable e2 = m.e(cg2.Toolbar_logo);
        if (e2 != null) {
            setLogo(e2);
        }
        CharSequence k4 = m.k(cg2.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(k4)) {
            setLogoDescription(k4);
        }
        int i3 = cg2.Toolbar_titleTextColor;
        if (m.l(i3)) {
            setTitleTextColor(m.b(i3));
        }
        int i4 = cg2.Toolbar_subtitleTextColor;
        if (m.l(i4)) {
            setSubtitleTextColor(m.b(i4));
        }
        int i5 = cg2.Toolbar_menu;
        if (m.l(i5)) {
            k(m.i(i5, 0));
        }
        m.o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new r93(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        qd qdVar = this.h;
        if (qdVar != null) {
            qdVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            qd qdVar = this.h;
            if (qdVar != null) {
                qdVar.setImageDrawable(this.f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new AppCompatImageView(getContext(), null);
            }
            if (!m(this.e)) {
                b(this.e, true);
            }
        } else {
            AppCompatImageView appCompatImageView = this.e;
            if (appCompatImageView != null && m(appCompatImageView)) {
                removeView(this.e);
                this.E.remove(this.e);
            }
        }
        AppCompatImageView appCompatImageView2 = this.e;
        if (appCompatImageView2 != null) {
            appCompatImageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new AppCompatImageView(getContext(), null);
        }
        AppCompatImageView appCompatImageView = this.e;
        if (appCompatImageView != null) {
            appCompatImageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            f();
        }
        qd qdVar = this.d;
        if (qdVar != null) {
            qdVar.setContentDescription(charSequence);
            ew3.c1(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            f();
            if (!m(this.d)) {
                b(this.d, true);
            }
        } else {
            qd qdVar = this.d;
            if (qdVar != null && m(qdVar)) {
                removeView(this.d);
                this.E.remove(this.d);
            }
        }
        qd qdVar2 = this.d;
        if (qdVar2 != null) {
            qdVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.c == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.c = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.c.setTextColor(colorStateList);
                }
            }
            if (!m(this.c)) {
                b(this.c, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.c;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.c);
                this.E.remove(this.c);
            }
        }
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        AppCompatTextView appCompatTextView = this.c;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f171b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
                this.f171b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f171b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.l;
                if (i != 0) {
                    this.f171b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.z;
                if (colorStateList != null) {
                    this.f171b.setTextColor(colorStateList);
                }
            }
            if (!m(this.f171b)) {
                b(this.f171b, true);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.f171b;
            if (appCompatTextView2 != null && m(appCompatTextView2)) {
                removeView(this.f171b);
                this.E.remove(this.f171b);
            }
        }
        AppCompatTextView appCompatTextView3 = this.f171b;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.z = colorStateList;
        AppCompatTextView appCompatTextView = this.f171b;
        if (appCompatTextView != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }
}
