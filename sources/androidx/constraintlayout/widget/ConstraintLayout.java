package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.d70;
import defpackage.f70;
import defpackage.h70;
import defpackage.mp3;
import defpackage.ok1;
import defpackage.p70;
import defpackage.r70;
import defpackage.s70;
import defpackage.t61;
import defpackage.v70;
import defpackage.vf2;
import defpackage.y60;
import defpackage.zs2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static zs2 p;

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f185a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f186b;
    public final s70 c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public p70 j;
    public h70 k;
    public int l;
    public HashMap m;
    public final SparseArray n;
    public final mp3 o;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f185a = new SparseArray();
        this.f186b = new ArrayList(4);
        this.c = new s70();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new mp3(this, this);
        o(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static zs2 getSharedValues() {
        if (p == null) {
            p = new zs2();
        }
        return p;
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public f70 generateDefaultLayoutParams() {
        return new f70(-2, -2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof f70;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f186b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((d70) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public f70 generateLayoutParams(AttributeSet attributeSet) {
        return new f70(getContext(), attributeSet);
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.h = true;
        super.forceLayout();
    }

    public int getMaxHeight() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.f;
    }

    public int getMinHeight() {
        return this.e;
    }

    public int getMinWidth() {
        return this.d;
    }

    public int getOptimizationLevel() {
        return this.c.D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        s70 s70Var = this.c;
        if (s70Var.j == null) {
            int id2 = getId();
            if (id2 != -1) {
                s70Var.j = getContext().getResources().getResourceEntryName(id2);
            } else {
                s70Var.j = "parent";
            }
        }
        if (s70Var.h0 == null) {
            s70Var.h0 = s70Var.j;
        }
        Iterator it = s70Var.q0.iterator();
        while (it.hasNext()) {
            r70 r70Var = (r70) it.next();
            View view = (View) r70Var.f0;
            if (view != null) {
                if (r70Var.j == null && (id = view.getId()) != -1) {
                    r70Var.j = getContext().getResources().getResourceEntryName(id);
                }
                if (r70Var.h0 == null) {
                    r70Var.h0 = r70Var.j;
                }
            }
        }
        s70Var.o(sb);
        return sb.toString();
    }

    public final r70 n(View view) {
        if (view == this) {
            return this.c;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof f70) {
                return ((f70) view.getLayoutParams()).p0;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof f70) {
                return ((f70) view.getLayoutParams()).p0;
            }
            return null;
        }
        return null;
    }

    public final void o(AttributeSet attributeSet, int i) {
        s70 s70Var = this.c;
        s70Var.f0 = this;
        mp3 mp3Var = this.o;
        s70Var.u0 = mp3Var;
        s70Var.s0.h = mp3Var;
        this.f185a.put(getId(), this);
        this.j = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, vf2.ConstraintLayout_Layout, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == vf2.ConstraintLayout_Layout_android_minWidth) {
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                } else if (index == vf2.ConstraintLayout_Layout_android_minHeight) {
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                } else if (index == vf2.ConstraintLayout_Layout_android_maxWidth) {
                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                } else if (index == vf2.ConstraintLayout_Layout_android_maxHeight) {
                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                } else if (index == vf2.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.i = obtainStyledAttributes.getInt(index, this.i);
                } else if (index == vf2.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.k = new h70(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.k = null;
                        }
                    }
                } else if (index == vf2.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        p70 p70Var = new p70();
                        this.j = p70Var;
                        p70Var.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.j = null;
                    }
                    this.l = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        s70Var.D0 = this.i;
        ok1.p = s70Var.W(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            f70 f70Var = (f70) childAt.getLayoutParams();
            r70 r70Var = f70Var.p0;
            if (childAt.getVisibility() != 8 || f70Var.d0 || f70Var.e0 || isInEditMode) {
                int s = r70Var.s();
                int t = r70Var.t();
                childAt.layout(s, t, r70Var.r() + s, r70Var.l() + t);
            }
        }
        ArrayList arrayList = this.f186b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((d70) arrayList.get(i6)).j();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x071a  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01f3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1897
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        r70 n = n(view);
        if ((view instanceof Guideline) && !(n instanceof t61)) {
            f70 f70Var = (f70) view.getLayoutParams();
            t61 t61Var = new t61();
            f70Var.p0 = t61Var;
            f70Var.d0 = true;
            t61Var.S(f70Var.V);
        }
        if (view instanceof d70) {
            d70 d70Var = (d70) view;
            d70Var.k();
            ((f70) view.getLayoutParams()).e0 = true;
            ArrayList arrayList = this.f186b;
            if (!arrayList.contains(d70Var)) {
                arrayList.add(d70Var);
            }
        }
        this.f185a.put(view.getId(), view);
        this.h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f185a.remove(view.getId());
        r70 n = n(view);
        this.c.q0.remove(n);
        n.D();
        this.f186b.remove(view);
        this.h = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    public final boolean s() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    public void setConstraintSet(p70 p70Var) {
        this.j = p70Var;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f185a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.g) {
            return;
        }
        this.g = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f) {
            return;
        }
        this.f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.e) {
            return;
        }
        this.e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.d) {
            return;
        }
        this.d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(v70 v70Var) {
        h70 h70Var = this.k;
        if (h70Var != null) {
            h70Var.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.i = i;
        s70 s70Var = this.c;
        s70Var.D0 = i;
        ok1.p = s70Var.W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void t(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.m == null) {
                this.m = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.m.put(str, Integer.valueOf(num.intValue()));
        }
    }

    public final void v(r70 r70Var, f70 f70Var, SparseArray sparseArray, int i, y60 y60Var) {
        View view = (View) this.f185a.get(i);
        r70 r70Var2 = (r70) sparseArray.get(i);
        if (r70Var2 != null && view != null && (view.getLayoutParams() instanceof f70)) {
            f70Var.c0 = true;
            y60 y60Var2 = y60.BASELINE;
            if (y60Var == y60Var2) {
                f70 f70Var2 = (f70) view.getLayoutParams();
                f70Var2.c0 = true;
                f70Var2.p0.E = true;
            }
            r70Var.j(y60Var2).b(r70Var2.j(y60Var), f70Var.D, f70Var.C, true);
            r70Var.E = true;
            r70Var.j(y60.TOP).j();
            r70Var.j(y60.BOTTOM).j();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x02ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w() {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.w():boolean");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new f70(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f185a = new SparseArray();
        this.f186b = new ArrayList(4);
        this.c = new s70();
        this.d = 0;
        this.e = 0;
        this.f = Integer.MAX_VALUE;
        this.g = Integer.MAX_VALUE;
        this.h = true;
        this.i = 257;
        this.j = null;
        this.k = null;
        this.l = -1;
        this.m = new HashMap();
        this.n = new SparseArray();
        this.o = new mp3(this, this);
        o(attributeSet, i);
    }
}
