package com.google.android.material.appbar;

import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.bn0;
import defpackage.bx3;
import defpackage.fr1;
import defpackage.ju1;
import defpackage.m90;
import defpackage.qf2;
import defpackage.t9;
import defpackage.zf3;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public class MaterialToolbar extends Toolbar {
    public static final int o0 = qf2.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] p0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer j0;
    public boolean k0;
    public boolean l0;
    public ImageView.ScaleType m0;
    public Boolean n0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.he2.toolbarStyle
            int r4 = com.google.android.material.appbar.MaterialToolbar.o0
            android.content.Context r8 = defpackage.ir1.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.bg2.MaterialToolbar
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.y73.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.bg2.MaterialToolbar_navigationIconTint
            boolean r1 = r9.hasValue(r0)
            r2 = -1
            if (r1 == 0) goto L2a
            int r0 = r9.getColor(r0, r2)
            r7.setNavigationIconTint(r0)
        L2a:
            int r0 = defpackage.bg2.MaterialToolbar_titleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.k0 = r0
            int r0 = defpackage.bg2.MaterialToolbar_subtitleCentered
            boolean r0 = r9.getBoolean(r0, r6)
            r7.l0 = r0
            int r0 = defpackage.bg2.MaterialToolbar_logoScaleType
            int r0 = r9.getInt(r0, r2)
            if (r0 < 0) goto L4b
            android.widget.ImageView$ScaleType[] r1 = com.google.android.material.appbar.MaterialToolbar.p0
            int r2 = r1.length
            if (r0 >= r2) goto L4b
            r0 = r1[r0]
            r7.m0 = r0
        L4b:
            int r0 = defpackage.bg2.MaterialToolbar_logoAdjustViewBounds
            boolean r1 = r9.hasValue(r0)
            if (r1 == 0) goto L5d
            boolean r0 = r9.getBoolean(r0, r6)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.n0 = r0
        L5d:
            r9.recycle()
            android.graphics.drawable.Drawable r9 = r7.getBackground()
            if (r9 == 0) goto L6b
            boolean r0 = r9 instanceof android.graphics.drawable.ColorDrawable
            if (r0 != 0) goto L6b
            goto L8e
        L6b:
            fr1 r0 = new fr1
            r0.<init>()
            if (r9 == 0) goto L78
            android.graphics.drawable.ColorDrawable r9 = (android.graphics.drawable.ColorDrawable) r9
            int r6 = r9.getColor()
        L78:
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r6)
            r0.j(r9)
            r0.h(r8)
            java.util.WeakHashMap r8 = defpackage.ll3.f3151a
            float r8 = defpackage.al3.i(r7)
            r0.i(r8)
            defpackage.uk3.q(r7, r0)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.m0;
    }

    public Integer getNavigationIconTint() {
        return this.j0;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void k(int i) {
        Menu menu = getMenu();
        boolean z = menu instanceof ju1;
        if (z) {
            ((ju1) menu).w();
        }
        super.k(i);
        if (z) {
            ((ju1) menu).v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof fr1) {
            zf3.h0(this, (fr1) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView;
        TextView textView2;
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.k0 || this.l0) {
            ArrayList B = bx3.B(this, getTitle());
            boolean isEmpty = B.isEmpty();
            m90 m90Var = bx3.j;
            if (isEmpty) {
                textView = null;
            } else {
                textView = (TextView) Collections.min(B, m90Var);
            }
            ArrayList B2 = bx3.B(this, getSubtitle());
            if (B2.isEmpty()) {
                textView2 = null;
            } else {
                textView2 = (TextView) Collections.max(B2, m90Var);
            }
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.k0 && textView != null) {
                    t(textView, pair);
                }
                if (this.l0 && textView2 != null) {
                    t(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.n0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.m0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof fr1) {
            ((fr1) background).i(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.n0;
        if (bool == null || bool.booleanValue() != z) {
            this.n0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.m0 != scaleType) {
            this.m0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.j0 != null) {
            drawable = t9.L0(drawable.mutate());
            bn0.g(drawable, this.j0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.j0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.l0 != z) {
            this.l0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.k0 != z) {
            this.k0 = z;
            requestLayout();
        }
    }

    public final void t(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
