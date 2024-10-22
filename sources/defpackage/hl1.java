package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class hl1 implements gt2 {
    public static final Method A;
    public static final Method B;
    public static final Method C;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2444a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2445b;
    public go0 c;
    public int f;
    public int g;
    public boolean i;
    public boolean j;
    public boolean k;
    public el1 n;
    public View o;
    public AdapterView.OnItemClickListener p;
    public AdapterView.OnItemSelectedListener q;
    public final Handler v;
    public Rect x;
    public boolean y;
    public final td z;
    public final int d = -2;
    public int e = -2;
    public final int h = 1002;
    public int l = 0;
    public final int m = Integer.MAX_VALUE;
    public final al1 r = new al1(this, 2);
    public final gl1 s = new gl1(this);
    public final fl1 t = new fl1(this);
    public final al1 u = new al1(this, 1);
    public final Rect w = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                B = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public hl1(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2444a = context;
        this.v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cg2.ListPopupWindow, i, i2);
        this.f = obtainStyledAttributes.getDimensionPixelOffset(cg2.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(cg2.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.i = true;
        }
        obtainStyledAttributes.recycle();
        td tdVar = new td(context, attributeSet, i, i2);
        this.z = tdVar;
        tdVar.setInputMethodMode(1);
    }

    public go0 a(Context context, boolean z) {
        return new go0(context, z);
    }

    @Override // defpackage.gt2
    public final boolean b() {
        return this.z.isShowing();
    }

    public final int c() {
        return this.f;
    }

    @Override // defpackage.gt2
    public final void dismiss() {
        td tdVar = this.z;
        tdVar.dismiss();
        tdVar.setContentView(null);
        this.c = null;
        this.v.removeCallbacks(this.r);
    }

    public final void e(int i) {
        this.f = i;
    }

    public final Drawable g() {
        return this.z.getBackground();
    }

    @Override // defpackage.gt2
    public final go0 i() {
        return this.c;
    }

    public final void j(Drawable drawable) {
        this.z.setBackgroundDrawable(drawable);
    }

    public final void l(int i) {
        this.g = i;
        this.i = true;
    }

    public final int o() {
        if (!this.i) {
            return 0;
        }
        return this.g;
    }

    public void p(ListAdapter listAdapter) {
        el1 el1Var = this.n;
        if (el1Var == null) {
            this.n = new el1(this, 0);
        } else {
            ListAdapter listAdapter2 = this.f2445b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(el1Var);
            }
        }
        this.f2445b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.n);
        }
        go0 go0Var = this.c;
        if (go0Var != null) {
            go0Var.setAdapter(this.f2445b);
        }
    }

    public final void q(int i) {
        Drawable background = this.z.getBackground();
        if (background != null) {
            Rect rect = this.w;
            background.getPadding(rect);
            this.e = rect.left + rect.right + i;
            return;
        }
        this.e = i;
    }

    @Override // defpackage.gt2
    public final void show() {
        int i;
        boolean z;
        int a2;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        go0 go0Var;
        int i4;
        int i5;
        go0 go0Var2 = this.c;
        td tdVar = this.z;
        int i6 = 0;
        Context context = this.f2444a;
        if (go0Var2 == null) {
            go0 a3 = a(context, !this.y);
            this.c = a3;
            a3.setAdapter(this.f2445b);
            this.c.setOnItemClickListener(this.p);
            this.c.setFocusable(true);
            this.c.setFocusableInTouchMode(true);
            this.c.setOnItemSelectedListener(new bl1(this, 0));
            this.c.setOnScrollListener(this.t);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.q;
            if (onItemSelectedListener != null) {
                this.c.setOnItemSelectedListener(onItemSelectedListener);
            }
            tdVar.setContentView(this.c);
        }
        Drawable background = tdVar.getBackground();
        Rect rect = this.w;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.i) {
                this.g = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (tdVar.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.o;
        int i8 = this.g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = B;
            if (method != null) {
                try {
                    a2 = ((Integer) method.invoke(tdVar, view, Integer.valueOf(i8), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            a2 = tdVar.getMaxAvailableHeight(view, i8);
        } else {
            a2 = cl1.a(tdVar, view, i8, z);
        }
        int i9 = this.d;
        if (i9 == -1) {
            i3 = a2 + i;
        } else {
            int i10 = this.e;
            if (i10 != -2) {
                if (i10 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int a4 = this.c.a(makeMeasureSpec, a2 + 0);
            if (a4 > 0) {
                i2 = this.c.getPaddingBottom() + this.c.getPaddingTop() + i + 0;
            } else {
                i2 = 0;
            }
            i3 = a4 + i2;
        }
        if (tdVar.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        tf3.t0(tdVar, this.h);
        if (tdVar.isShowing()) {
            View view2 = this.o;
            WeakHashMap weakHashMap = ll3.f3151a;
            if (!xk3.b(view2)) {
                return;
            }
            int i11 = this.e;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.o.getWidth();
            }
            if (i9 == -1) {
                if (z2) {
                    i9 = i3;
                } else {
                    i9 = -1;
                }
                if (z2) {
                    if (this.e == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    tdVar.setWidth(i5);
                    tdVar.setHeight(0);
                } else {
                    if (this.e == -1) {
                        i6 = -1;
                    }
                    tdVar.setWidth(i6);
                    tdVar.setHeight(-1);
                }
            } else if (i9 == -2) {
                i9 = i3;
            }
            tdVar.setOutsideTouchable(true);
            View view3 = this.o;
            int i12 = this.f;
            int i13 = this.g;
            if (i11 < 0) {
                i11 = -1;
            }
            if (i9 < 0) {
                i4 = -1;
            } else {
                i4 = i9;
            }
            tdVar.update(view3, i12, i13, i11, i4);
            return;
        }
        int i14 = this.e;
        if (i14 == -1) {
            i14 = -1;
        } else if (i14 == -2) {
            i14 = this.o.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = i3;
        }
        tdVar.setWidth(i14);
        tdVar.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = A;
            if (method2 != null) {
                try {
                    method2.invoke(tdVar, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            dl1.b(tdVar, true);
        }
        tdVar.setOutsideTouchable(true);
        tdVar.setTouchInterceptor(this.s);
        if (this.k) {
            tf3.s0(tdVar, this.j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = C;
            if (method3 != null) {
                try {
                    method3.invoke(tdVar, this.x);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            dl1.a(tdVar, this.x);
        }
        o62.a(tdVar, this.o, this.f, this.g, this.l);
        this.c.setSelection(-1);
        if ((!this.y || this.c.isInTouchMode()) && (go0Var = this.c) != null) {
            go0Var.setListSelectionHidden(true);
            go0Var.requestLayout();
        }
        if (!this.y) {
            this.v.post(this.u);
        }
    }
}
