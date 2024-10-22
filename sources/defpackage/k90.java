package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k90 extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public h90 f2909a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2910b;
    public final int c;
    public int d;
    public final int e;
    public final int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final Rect q;

    public k90() {
        super(-2, -2);
        this.f2910b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public final boolean a(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.o;
        }
        return this.n;
    }

    public final void b(h90 h90Var) {
        h90 h90Var2 = this.f2909a;
        if (h90Var2 != h90Var) {
            if (h90Var2 != null) {
                h90Var2.f();
            }
            this.f2909a = h90Var;
            this.f2910b = true;
            if (h90Var != null) {
                h90Var.c(this);
            }
        }
    }

    public k90(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h90 h90Var;
        this.f2910b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wf2.CoordinatorLayout_Layout);
        this.c = obtainStyledAttributes.getInteger(wf2.CoordinatorLayout_Layout_android_layout_gravity, 0);
        this.f = obtainStyledAttributes.getResourceId(wf2.CoordinatorLayout_Layout_layout_anchor, -1);
        this.d = obtainStyledAttributes.getInteger(wf2.CoordinatorLayout_Layout_layout_anchorGravity, 0);
        this.e = obtainStyledAttributes.getInteger(wf2.CoordinatorLayout_Layout_layout_keyline, -1);
        this.g = obtainStyledAttributes.getInt(wf2.CoordinatorLayout_Layout_layout_insetEdge, 0);
        this.h = obtainStyledAttributes.getInt(wf2.CoordinatorLayout_Layout_layout_dodgeInsetEdges, 0);
        int i = wf2.CoordinatorLayout_Layout_layout_behavior;
        boolean hasValue = obtainStyledAttributes.hasValue(i);
        this.f2910b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(i);
            String str = CoordinatorLayout.t;
            if (TextUtils.isEmpty(string)) {
                h90Var = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.t;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.v;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.u);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    h90Var = (h90) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException(hx2.p("Could not inflate Behavior subclass ", string), e);
                }
            }
            this.f2909a = h90Var;
        }
        obtainStyledAttributes.recycle();
        h90 h90Var2 = this.f2909a;
        if (h90Var2 != null) {
            h90Var2.c(this);
        }
    }

    public k90(k90 k90Var) {
        super((ViewGroup.MarginLayoutParams) k90Var);
        this.f2910b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public k90(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2910b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }

    public k90(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2910b = false;
        this.c = 0;
        this.d = 0;
        this.e = -1;
        this.f = -1;
        this.g = 0;
        this.h = 0;
        this.q = new Rect();
    }
}
