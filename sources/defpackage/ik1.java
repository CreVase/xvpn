package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public abstract class ik1 extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2614a;

    /* renamed from: b, reason: collision with root package name */
    public int f2615b;
    public int c;
    public int d;
    public int e;
    public int f;
    public float g;
    public boolean h;
    public int[] i;
    public int[] j;
    public Drawable k;
    public int l;
    public int m;
    public int n;
    public int o;

    public ik1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2614a = true;
        this.f2615b = -1;
        this.c = 0;
        this.e = 8388659;
        int[] iArr = cg2.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        go2 go2Var = new go2(context, obtainStyledAttributes);
        ll3.o(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        int h = go2Var.h(cg2.LinearLayoutCompat_android_orientation, -1);
        if (h >= 0) {
            setOrientation(h);
        }
        int h2 = go2Var.h(cg2.LinearLayoutCompat_android_gravity, -1);
        if (h2 >= 0) {
            setGravity(h2);
        }
        boolean a2 = go2Var.a(cg2.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.g = obtainStyledAttributes.getFloat(cg2.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f2615b = go2Var.h(cg2.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = go2Var.a(cg2.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(go2Var.e(cg2.LinearLayoutCompat_divider));
        this.n = go2Var.h(cg2.LinearLayoutCompat_showDividers, 0);
        this.o = go2Var.d(cg2.LinearLayoutCompat_dividerPadding, 0);
        go2Var.o();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof hk1;
    }

    public final void f(Canvas canvas, int i) {
        this.k.setBounds(getPaddingLeft() + this.o, i, (getWidth() - getPaddingRight()) - this.o, this.m + i);
        this.k.draw(canvas);
    }

    public final void g(Canvas canvas, int i) {
        this.k.setBounds(i, getPaddingTop() + this.o, this.l + i, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2615b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2615b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f2615b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.c;
            if (this.d == 1 && (i = this.e & 112) != 48) {
                if (i != 16) {
                    if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    }
                } else {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((hk1) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2615b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    @Override // android.view.ViewGroup
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public hk1 generateDefaultLayoutParams() {
        int i = this.d;
        if (i == 0) {
            return new hk1(-2);
        }
        if (i == 1) {
            return new hk1(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public hk1 generateLayoutParams(AttributeSet attributeSet) {
        return new hk1(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public hk1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new hk1(layoutParams);
    }

    public final boolean k(int i) {
        if (i == 0) {
            if ((this.n & 1) == 0) {
                return false;
            }
            return true;
        }
        if (i == getChildCount()) {
            if ((this.n & 4) == 0) {
                return false;
            }
            return true;
        }
        if ((this.n & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.k == null) {
            return;
        }
        int i2 = 0;
        if (this.d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && k(i2)) {
                    f(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((hk1) childAt.getLayoutParams())).topMargin) - this.m);
                }
                i2++;
            }
            if (k(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((hk1) childAt2.getLayoutParams())).bottomMargin;
                }
                f(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean a2 = bn3.a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && k(i2)) {
                hk1 hk1Var = (hk1) childAt3.getLayoutParams();
                if (a2) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) hk1Var).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) hk1Var).leftMargin) - this.l;
                }
                g(canvas, left2);
            }
            i2++;
        }
        if (k(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (a2) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth() - getPaddingRight();
                    i = this.l;
                    right = left - i;
                }
            } else {
                hk1 hk1Var2 = (hk1) childAt4.getLayoutParams();
                if (a2) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) hk1Var2).leftMargin;
                    i = this.l;
                    right = left - i;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) hk1Var2).rightMargin;
                }
            }
            g(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x06c4  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06e2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f2614a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2615b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.k) {
            return;
        }
        this.k = drawable;
        boolean z = false;
        if (drawable != null) {
            this.l = drawable.getIntrinsicWidth();
            this.m = drawable.getIntrinsicHeight();
        } else {
            this.l = 0;
            this.m = 0;
        }
        if (drawable == null) {
            z = true;
        }
        setWillNotDraw(z);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.o = i;
    }

    public void setGravity(int i) {
        if (this.e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.e;
        if ((8388615 & i3) != i2) {
            this.e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.n) {
            requestLayout();
        }
        this.n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.e;
        if ((i3 & 112) != i2) {
            this.e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
