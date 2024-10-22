package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import defpackage.br1;
import defpackage.ct3;
import defpackage.dt3;
import defpackage.ew3;
import defpackage.fs2;
import defpackage.jx1;
import defpackage.k73;
import defpackage.l73;
import defpackage.ll3;
import defpackage.mc;
import defpackage.op;
import defpackage.qf2;
import defpackage.rs2;
import defpackage.s63;
import defpackage.sz;
import defpackage.t9;
import defpackage.uk3;
import defpackage.uz;
import defpackage.vk3;
import defpackage.vz;
import defpackage.wz;
import defpackage.x80;
import defpackage.y63;
import defpackage.ya0;
import defpackage.zf3;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class Chip extends mc implements vz, rs2, Checkable {
    public static final int w = qf2.Widget_MaterialComponents_Chip_Action;
    public static final Rect x = new Rect();
    public static final int[] y = {R.attr.state_selected};
    public static final int[] z = {R.attr.state_checkable};
    public wz e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public CharSequence q;
    public final uz r;
    public boolean s;
    public final Rect t;
    public final RectF u;
    public final sz v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r20, android.util.AttributeSet r21) {
        /*
            Method dump skipped, instructions count: 969
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.u;
        rectF.setEmpty();
        if (c() && this.h != null) {
            wz wzVar = this.e;
            Rect bounds = wzVar.getBounds();
            rectF.setEmpty();
            if (wzVar.T()) {
                float f = wzVar.p0 + wzVar.o0 + wzVar.O + wzVar.n0 + wzVar.m0;
                if (t9.J(wzVar) == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.t;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private s63 getTextAppearance() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.w0.f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.k != z2) {
            this.k = z2;
            refreshDrawableState();
        }
    }

    public final void b(int i) {
        int i2;
        int i3;
        this.p = i;
        if (!this.n) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable != null) {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        int max = Math.max(0, i - ((int) this.e.z));
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 != null) {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    e();
                    return;
                }
                return;
            }
            e();
            return;
        }
        if (max2 > 0) {
            i2 = max2 / 2;
        } else {
            i2 = 0;
        }
        if (max > 0) {
            i3 = max / 2;
        } else {
            i3 = 0;
        }
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                e();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        e();
    }

    public final boolean c() {
        wz wzVar = this.e;
        if (wzVar != null) {
            Object obj = wzVar.L;
            if (obj != null) {
                if (obj instanceof ct3) {
                    obj = ((dt3) ((ct3) obj)).f;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                return true;
            }
        }
        return false;
    }

    public final void d() {
        boolean z2;
        if (c()) {
            wz wzVar = this.e;
            if (wzVar != null && wzVar.K) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && this.h != null) {
                ll3.p(this, this.r);
                this.s = true;
                return;
            }
        }
        ll3.p(this, null);
        this.s = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:            if (r1 != Integer.MIN_VALUE) goto L34;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            boolean r0 = r10.s
            if (r0 != 0) goto L9
            boolean r11 = super.dispatchHoverEvent(r11)
            return r11
        L9:
            uz r0 = r10.r
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r2 = r1.isEnabled()
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L70
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L1c
            goto L70
        L1c:
            int r1 = r11.getAction()
            r2 = 256(0x100, float:3.59E-43)
            r5 = 128(0x80, float:1.8E-43)
            r6 = 7
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r6) goto L42
            r6 = 9
            if (r1 == r6) goto L42
            r6 = 10
            if (r1 == r6) goto L32
            goto L70
        L32:
            int r1 = r0.m
            if (r1 == r7) goto L70
            if (r1 != r7) goto L39
            goto L6e
        L39:
            r0.m = r7
            r0.q(r7, r5)
            r0.q(r1, r2)
            goto L6e
        L42:
            float r1 = r11.getX()
            float r6 = r11.getY()
            com.google.android.material.chip.Chip r8 = r0.n
            boolean r9 = r8.c()
            if (r9 == 0) goto L5e
            android.graphics.RectF r8 = r8.getCloseIconTouchBounds()
            boolean r1 = r8.contains(r1, r6)
            if (r1 == 0) goto L5e
            r1 = 1
            goto L5f
        L5e:
            r1 = 0
        L5f:
            int r6 = r0.m
            if (r6 != r1) goto L64
            goto L6c
        L64:
            r0.m = r1
            r0.q(r1, r5)
            r0.q(r6, r2)
        L6c:
            if (r1 == r7) goto L70
        L6e:
            r0 = 1
            goto L71
        L70:
            r0 = 0
        L71:
            if (r0 != 0) goto L79
            boolean r11 = super.dispatchHoverEvent(r11)
            if (r11 == 0) goto L7a
        L79:
            r3 = 1
        L7a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.s) {
            return super.dispatchKeyEvent(keyEvent);
        }
        uz uzVar = this.r;
        uzVar.getClass();
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode != 19) {
                                    if (keyCode != 21) {
                                        if (keyCode != 22) {
                                            i2 = 130;
                                        }
                                    } else {
                                        i2 = 17;
                                    }
                                } else {
                                    i2 = 33;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i < repeatCount && uzVar.m(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = uzVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = uzVar.n;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.h;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.s) {
                                chip.r.q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = uzVar.m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = uzVar.m(1, null);
            }
        }
        if (z2 && uzVar.l != Integer.MIN_VALUE) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [int, boolean] */
    @Override // defpackage.mc, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        wz wzVar = this.e;
        boolean z2 = false;
        if (wzVar != null && wz.t(wzVar.L)) {
            wz wzVar2 = this.e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(wzVar2.K0, iArr)) {
                wzVar2.K0 = iArr;
                if (wzVar2.T()) {
                    z2 = wzVar2.v(wzVar2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        this.g = new RippleDrawable(ya0.d0(this.e.D), getBackgroundDrawable(), null);
        wz wzVar = this.e;
        if (wzVar.L0) {
            wzVar.L0 = false;
            wzVar.M0 = null;
            wzVar.onStateChange(wzVar.getState());
        }
        RippleDrawable rippleDrawable = this.g;
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.q(this, rippleDrawable);
        f();
    }

    public final void f() {
        wz wzVar;
        if (!TextUtils.isEmpty(getText()) && (wzVar = this.e) != null) {
            int q = (int) (wzVar.q() + wzVar.p0 + wzVar.m0);
            wz wzVar2 = this.e;
            int p = (int) (wzVar2.p() + wzVar2.i0 + wzVar2.l0);
            if (this.f != null) {
                Rect rect = new Rect();
                this.f.getPadding(rect);
                p += rect.left;
                q += rect.right;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            WeakHashMap weakHashMap = ll3.f3151a;
            vk3.k(this, p, paddingTop, q, paddingBottom);
        }
    }

    public final void g() {
        TextPaint paint = getPaint();
        wz wzVar = this.e;
        if (wzVar != null) {
            paint.drawableState = wzVar.getState();
        }
        s63 textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.e(getContext(), paint, this.v);
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        boolean z2;
        if (!TextUtils.isEmpty(this.q)) {
            return this.q;
        }
        wz wzVar = this.e;
        if (wzVar != null && wzVar.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            getParent();
            return "android.widget.Button";
        }
        if (isClickable()) {
            return "android.widget.Button";
        }
        return "android.view.View";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        if (insetDrawable == null) {
            return this.e;
        }
        return insetDrawable;
    }

    public Drawable getCheckedIcon() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.X;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.Y;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.y;
        }
        return null;
    }

    public float getChipCornerRadius() {
        wz wzVar = this.e;
        if (wzVar == null) {
            return 0.0f;
        }
        return Math.max(0.0f, wzVar.r());
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.p0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        wz wzVar = this.e;
        if (wzVar == null || (drawable = wzVar.G) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof ct3;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = ((dt3) ((ct3) drawable)).f;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.I;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.H;
        }
        return null;
    }

    public float getChipMinHeight() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.z;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.i0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.B;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.C;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        wz wzVar = this.e;
        if (wzVar == null || (drawable = wzVar.L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof ct3;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = ((dt3) ((ct3) drawable)).f;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.P;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.o0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.O;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.n0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.N;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.O0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.s) {
            uz uzVar = this.r;
            if (uzVar.l == 1 || uzVar.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public jx1 getHideMotionSpec() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.h0;
        }
        return null;
    }

    public float getIconEndPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.k0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.j0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.D;
        }
        return null;
    }

    public fs2 getShapeAppearanceModel() {
        return this.e.f2139a.f1978a;
    }

    public jx1 getShowMotionSpec() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.Z;
        }
        return null;
    }

    public float getTextEndPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.m0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        wz wzVar = this.e;
        if (wzVar != null) {
            return wzVar.l0;
        }
        return 0.0f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zf3.h0(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z2;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, y);
        }
        wz wzVar = this.e;
        if (wzVar != null && wzVar.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            View.mergeDrawableStates(onCreateDrawableState, z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.s) {
            uz uzVar = this.r;
            int i2 = uzVar.l;
            if (i2 != Integer.MIN_VALUE) {
                uzVar.j(i2);
            }
            if (z2) {
                uzVar.m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        wz wzVar = this.e;
        if (wzVar != null && wzVar.Q) {
            z2 = true;
        } else {
            z2 = false;
        }
        accessibilityNodeInfo.setCheckable(z2);
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            f();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:            if (r0 != 3) goto L28;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            if (r0 == r2) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L44
            goto L50
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L50
            if (r1 != 0) goto L4e
            r5.setCloseIconPressed(r3)
            goto L4e
        L2b:
            boolean r0 = r5.k
            if (r0 == 0) goto L44
            r5.playSoundEffect(r3)
            android.view.View$OnClickListener r0 = r5.h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            boolean r0 = r5.s
            if (r0 == 0) goto L42
            uz r0 = r5.r
            r0.q(r2, r2)
        L42:
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r5.setCloseIconPressed(r3)
            goto L51
        L49:
            if (r1 == 0) goto L50
            r5.setCloseIconPressed(r2)
        L4e:
            r0 = 1
            goto L51
        L50:
            r0 = 0
        L51:
            if (r0 != 0) goto L5b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L5a
            goto L5b
        L5a:
            r2 = 0
        L5b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.q = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // defpackage.mc, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // defpackage.mc, android.view.View
    public void setBackgroundResource(int i) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
    }

    public void setCheckable(boolean z2) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.w(z2);
        }
    }

    public void setCheckableResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.w(wzVar.q0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        wz wzVar = this.e;
        if (wzVar == null) {
            this.j = z2;
        } else if (wzVar.Q) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.x(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.x(ew3.P0(wzVar.q0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.y(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.y(x80.getColorStateList(wzVar.q0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.z(wzVar.q0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        wz wzVar = this.e;
        if (wzVar != null && wzVar.y != colorStateList) {
            wzVar.y = colorStateList;
            wzVar.onStateChange(wzVar.getState());
        }
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList colorStateList;
        wz wzVar = this.e;
        if (wzVar != null && wzVar.y != (colorStateList = x80.getColorStateList(wzVar.q0, i))) {
            wzVar.y = colorStateList;
            wzVar.onStateChange(wzVar.getState());
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.A(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.A(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(wz wzVar) {
        wz wzVar2 = this.e;
        if (wzVar2 != wzVar) {
            if (wzVar2 != null) {
                wzVar2.N0 = new WeakReference(null);
            }
            this.e = wzVar;
            wzVar.P0 = false;
            wzVar.N0 = new WeakReference(this);
            b(this.p);
        }
    }

    public void setChipEndPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null && wzVar.p0 != f) {
            wzVar.p0 = f;
            wzVar.invalidateSelf();
            wzVar.u();
        }
    }

    public void setChipEndPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            float dimension = wzVar.q0.getResources().getDimension(i);
            if (wzVar.p0 != dimension) {
                wzVar.p0 = dimension;
                wzVar.invalidateSelf();
                wzVar.u();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.B(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.B(ew3.P0(wzVar.q0, i));
        }
    }

    public void setChipIconSize(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.C(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.C(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.D(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.D(x80.getColorStateList(wzVar.q0, i));
        }
    }

    public void setChipIconVisible(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.E(wzVar.q0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        wz wzVar = this.e;
        if (wzVar != null && wzVar.z != f) {
            wzVar.z = f;
            wzVar.invalidateSelf();
            wzVar.u();
        }
    }

    public void setChipMinHeightResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            float dimension = wzVar.q0.getResources().getDimension(i);
            if (wzVar.z != dimension) {
                wzVar.z = dimension;
                wzVar.invalidateSelf();
                wzVar.u();
            }
        }
    }

    public void setChipStartPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null && wzVar.i0 != f) {
            wzVar.i0 = f;
            wzVar.invalidateSelf();
            wzVar.u();
        }
    }

    public void setChipStartPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            float dimension = wzVar.q0.getResources().getDimension(i);
            if (wzVar.i0 != dimension) {
                wzVar.i0 = dimension;
                wzVar.invalidateSelf();
                wzVar.u();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.F(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.F(x80.getColorStateList(wzVar.q0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.G(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.G(wzVar.q0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.H(drawable);
        }
        d();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        op opVar;
        wz wzVar = this.e;
        if (wzVar != null && wzVar.P != charSequence) {
            String str = op.d;
            Locale locale = Locale.getDefault();
            int i = l73.f3078a;
            boolean z2 = true;
            if (k73.a(locale) != 1) {
                z2 = false;
            }
            if (z2) {
                opVar = op.g;
            } else {
                opVar = op.f;
            }
            wzVar.P = opVar.c(charSequence, opVar.c);
            wzVar.invalidateSelf();
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.I(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.I(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.H(ew3.P0(wzVar.q0, i));
        }
        d();
    }

    public void setCloseIconSize(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.J(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.J(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.K(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.K(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.L(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.L(x80.getColorStateList(wzVar.q0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.mc, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // defpackage.mc, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable == null) {
            if (drawable3 == null) {
                super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
                return;
            }
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.i(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            wz wzVar = this.e;
            if (wzVar != null) {
                wzVar.O0 = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.n = z2;
        b(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i == 8388627) {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(jx1 jx1Var) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.h0 = jx1Var;
        }
    }

    public void setHideMotionSpecResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.h0 = jx1.a(wzVar.q0, i);
        }
    }

    public void setIconEndPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.N(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.N(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.O(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.O(wzVar.q0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(br1 br1Var) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.Q0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        d();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.P(colorStateList);
        }
        if (!this.e.L0) {
            e();
        }
    }

    public void setRippleColorResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.P(x80.getColorStateList(wzVar.q0, i));
            if (!this.e.L0) {
                e();
            }
        }
    }

    @Override // defpackage.rs2
    public void setShapeAppearanceModel(fs2 fs2Var) {
        this.e.setShapeAppearanceModel(fs2Var);
    }

    public void setShowMotionSpec(jx1 jx1Var) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.Z = jx1Var;
        }
    }

    public void setShowMotionSpecResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.Z = jx1.a(wzVar.q0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        wz wzVar = this.e;
        if (wzVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        if (wzVar.P0) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        super.setText(charSequence2, bufferType);
        wz wzVar2 = this.e;
        if (wzVar2 != null && !TextUtils.equals(wzVar2.E, charSequence)) {
            wzVar2.E = charSequence;
            wzVar2.w0.d = true;
            wzVar2.invalidateSelf();
            wzVar2.u();
        }
    }

    public void setTextAppearance(s63 s63Var) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.Q(s63Var);
        }
        g();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null && wzVar.m0 != f) {
            wzVar.m0 = f;
            wzVar.invalidateSelf();
            wzVar.u();
        }
    }

    public void setTextEndPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            float dimension = wzVar.q0.getResources().getDimension(i);
            if (wzVar.m0 != dimension) {
                wzVar.m0 = dimension;
                wzVar.invalidateSelf();
                wzVar.u();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        wz wzVar = this.e;
        if (wzVar != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            y63 y63Var = wzVar.w0;
            s63 s63Var = y63Var.f;
            if (s63Var != null) {
                s63Var.k = applyDimension;
                y63Var.f5281a.setTextSize(applyDimension);
                wzVar.u();
                wzVar.invalidateSelf();
            }
        }
        g();
    }

    public void setTextStartPadding(float f) {
        wz wzVar = this.e;
        if (wzVar != null && wzVar.l0 != f) {
            wzVar.l0 = f;
            wzVar.invalidateSelf();
            wzVar.u();
        }
    }

    public void setTextStartPaddingResource(int i) {
        wz wzVar = this.e;
        if (wzVar != null) {
            float dimension = wzVar.q0.getResources().getDimension(i);
            if (wzVar.l0 != dimension) {
                wzVar.l0 = dimension;
                wzVar.invalidateSelf();
                wzVar.u();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.M(z2);
        }
        d();
    }

    public void setCheckedIconVisible(boolean z2) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.z(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.E(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.Q(new s63(wzVar.q0, i));
        }
        g();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        wz wzVar = this.e;
        if (wzVar != null) {
            wzVar.Q(new s63(wzVar.q0, i));
        }
        g();
    }
}
