package androidx.appcompat.widget;

import android.R;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.view.ActionMode;
import android.view.VelocityTracker;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import defpackage.af2;
import defpackage.aq0;
import defpackage.b43;
import defpackage.ba;
import defpackage.bn0;
import defpackage.bn3;
import defpackage.c02;
import defpackage.c43;
import defpackage.d43;
import defpackage.ew3;
import defpackage.in0;
import defpackage.ll3;
import defpackage.nf2;
import defpackage.pd;
import defpackage.qk3;
import defpackage.t9;
import defpackage.xk3;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {
    public static final b43 R = new b43("thumbPos", 0, Float.class);
    public static final int[] h0 = {R.attr.state_checked};
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final TextPaint I;
    public ColorStateList J;
    public StaticLayout K;
    public StaticLayout L;
    public ba M;
    public ObjectAnimator N;
    public pd O;
    public d43 P;
    public final Rect Q;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f168a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f169b;
    public PorterDuff.Mode c;
    public boolean d;
    public boolean e;
    public Drawable f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public CharSequence o;
    public CharSequence p;
    public CharSequence q;
    public CharSequence r;
    public boolean s;
    public int t;
    public final int u;
    public float v;
    public float w;
    public final VelocityTracker x;
    public final int y;
    public float z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchCompat(android.content.Context r13, android.util.AttributeSet r14) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private pd getEmojiTextViewHelper() {
        if (this.O == null) {
            this.O = new pd(this);
        }
        return this.O;
    }

    private boolean getTargetCheckedState() {
        if (this.z > 0.5f) {
            return true;
        }
        return false;
    }

    private int getThumbOffset() {
        float f;
        if (bn3.a(this)) {
            f = 1.0f - this.z;
        } else {
            f = this.z;
        }
        return (int) ((f * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f;
        if (drawable != null) {
            Rect rect2 = this.Q;
            drawable.getPadding(rect2);
            Drawable drawable2 = this.f168a;
            if (drawable2 != null) {
                rect = in0.b(drawable2);
            } else {
                rect = in0.c;
            }
            return ((((this.A - this.C) - rect2.left) - rect2.right) - rect.left) - rect.right;
        }
        return 0;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.q = charSequence;
        pd emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod o = ((c02) emojiTextViewHelper.f3826b.f2735b).o(this.M);
        if (o != null) {
            charSequence = o.getTransformation(charSequence, this);
        }
        this.r = charSequence;
        this.L = null;
        if (this.s) {
            e();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.o = charSequence;
        pd emojiTextViewHelper = getEmojiTextViewHelper();
        TransformationMethod o = ((c02) emojiTextViewHelper.f3826b.f2735b).o(this.M);
        if (o != null) {
            charSequence = o.getTransformation(charSequence, this);
        }
        this.p = charSequence;
        this.K = null;
        if (this.s) {
            e();
        }
    }

    public final void a() {
        Drawable drawable = this.f168a;
        if (drawable != null) {
            if (this.d || this.e) {
                Drawable mutate = t9.L0(drawable).mutate();
                this.f168a = mutate;
                if (this.d) {
                    bn0.h(mutate, this.f169b);
                }
                if (this.e) {
                    bn0.i(this.f168a, this.c);
                }
                if (this.f168a.isStateful()) {
                    this.f168a.setState(getDrawableState());
                }
            }
        }
    }

    public final void b() {
        Drawable drawable = this.f;
        if (drawable != null) {
            if (this.i || this.j) {
                Drawable mutate = t9.L0(drawable).mutate();
                this.f = mutate;
                if (this.i) {
                    bn0.h(mutate, this.g);
                }
                if (this.j) {
                    bn0.i(this.f, this.h);
                }
                if (this.f.isStateful()) {
                    this.f.setState(getDrawableState());
                }
            }
        }
    }

    public final StaticLayout c(CharSequence charSequence) {
        int i;
        TextPaint textPaint = this.I;
        if (charSequence != null) {
            i = (int) Math.ceil(Layout.getDesiredWidth(charSequence, textPaint));
        } else {
            i = 0;
        }
        return new StaticLayout(charSequence, textPaint, i, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public final void d() {
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        int i3 = this.D;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int thumbOffset = getThumbOffset() + i3;
        Drawable drawable = this.f168a;
        if (drawable != null) {
            rect = in0.b(drawable);
        } else {
            rect = in0.c;
        }
        Drawable drawable2 = this.f;
        Rect rect2 = this.Q;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i7 = rect2.left;
            thumbOffset += i7;
            if (rect != null) {
                int i8 = rect.left;
                if (i8 > i7) {
                    i3 += i8 - i7;
                }
                int i9 = rect.top;
                int i10 = rect2.top;
                if (i9 > i10) {
                    i = (i9 - i10) + i4;
                } else {
                    i = i4;
                }
                int i11 = rect.right;
                int i12 = rect2.right;
                if (i11 > i12) {
                    i5 -= i11 - i12;
                }
                int i13 = rect.bottom;
                int i14 = rect2.bottom;
                if (i13 > i14) {
                    i2 = i6 - (i13 - i14);
                    this.f.setBounds(i3, i, i5, i2);
                }
            } else {
                i = i4;
            }
            i2 = i6;
            this.f.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f168a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i15 = thumbOffset - rect2.left;
            int i16 = thumbOffset + this.C + rect2.right;
            this.f168a.setBounds(i15, i4, i16, i6);
            Drawable background = getBackground();
            if (background != null) {
                bn0.f(background, i15, i4, i16, i6);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f168a;
        if (drawable != null) {
            bn0.e(drawable, f, f2);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            bn0.e(drawable2, f, f2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f168a;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final void e() {
        boolean z;
        if (this.P == null && ((c02) this.O.f3826b.f2735b).j()) {
            if (aq0.k != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                aq0 a2 = aq0.a();
                int b2 = a2.b();
                if (b2 == 3 || b2 == 0) {
                    d43 d43Var = new d43(this);
                    this.P = d43Var;
                    a2.h(d43Var);
                }
            }
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!bn3.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingLeft + this.m;
        }
        return compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (bn3.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.A;
        if (!TextUtils.isEmpty(getText())) {
            return compoundPaddingRight + this.m;
        }
        return compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t9.J0(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.s;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.q;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.f168a;
    }

    public final float getThumbPosition() {
        return this.z;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.f169b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f168a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.N.end();
            this.N = null;
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, h0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        StaticLayout staticLayout;
        int width;
        super.onDraw(canvas);
        Drawable drawable = this.f;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i = this.E;
        int i2 = this.G;
        int i3 = i + rect.top;
        int i4 = i2 - rect.bottom;
        Drawable drawable2 = this.f168a;
        if (drawable != null) {
            if (this.n && drawable2 != null) {
                Rect b2 = in0.b(drawable2);
                drawable2.copyBounds(rect);
                rect.left += b2.left;
                rect.right -= b2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (getTargetCheckedState()) {
            staticLayout = this.K;
        } else {
            staticLayout = this.L;
        }
        if (staticLayout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            TextPaint textPaint = this.I;
            if (colorStateList != null) {
                textPaint.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            textPaint.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (staticLayout.getWidth() / 2), ((i3 + i4) / 2) - (staticLayout.getHeight() / 2));
            staticLayout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            if (isChecked()) {
                charSequence = this.o;
            } else {
                charSequence = this.q;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                CharSequence text = accessibilityNodeInfo.getText();
                if (TextUtils.isEmpty(text)) {
                    accessibilityNodeInfo.setText(charSequence);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(text);
                sb.append(' ');
                sb.append(charSequence);
                accessibilityNodeInfo.setText(sb);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width;
        int i6;
        int i7;
        int i8;
        super.onLayout(z, i, i2, i3, i4);
        int i9 = 0;
        if (this.f168a != null) {
            Drawable drawable = this.f;
            Rect rect = this.Q;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect b2 = in0.b(this.f168a);
            i5 = Math.max(0, b2.left - rect.left);
            i9 = Math.max(0, b2.right - rect.right);
        } else {
            i5 = 0;
        }
        if (bn3.a(this)) {
            i6 = getPaddingLeft() + i5;
            width = ((this.A + i6) - i5) - i9;
        } else {
            width = (getWidth() - getPaddingRight()) - i9;
            i6 = (width - this.A) + i5 + i9;
        }
        int gravity = getGravity() & 112;
        if (gravity != 16) {
            if (gravity != 80) {
                i8 = getPaddingTop();
                i7 = this.B + i8;
            } else {
                i7 = getHeight() - getPaddingBottom();
                i8 = i7 - this.B;
            }
        } else {
            int height = ((getHeight() + getPaddingTop()) - getPaddingBottom()) / 2;
            int i10 = this.B;
            int i11 = height - (i10 / 2);
            i7 = i10 + i11;
            i8 = i11;
        }
        this.D = i6;
        this.E = i8;
        this.G = i7;
        this.F = width;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.s) {
            if (this.K == null) {
                this.K = c(this.p);
            }
            if (this.L == null) {
                this.L = c(this.r);
            }
        }
        Drawable drawable = this.f168a;
        int i7 = 0;
        Rect rect = this.Q;
        if (drawable != null) {
            drawable.getPadding(rect);
            i3 = (this.f168a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.f168a.getIntrinsicHeight();
        } else {
            i3 = 0;
            i4 = 0;
        }
        if (this.s) {
            i5 = (this.k * 2) + Math.max(this.K.getWidth(), this.L.getWidth());
        } else {
            i5 = 0;
        }
        this.C = Math.max(i5, i3);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f168a;
        if (drawable3 != null) {
            Rect b2 = in0.b(drawable3);
            i8 = Math.max(i8, b2.left);
            i9 = Math.max(i9, b2.right);
        }
        if (this.H) {
            i6 = Math.max(this.l, (this.C * 2) + i8 + i9);
        } else {
            i6 = this.l;
        }
        int max = Math.max(i7, i4);
        this.A = i6;
        this.B = max;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max) {
            setMeasuredDimension(getMeasuredWidthAndState(), max);
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (isChecked()) {
            charSequence = this.o;
        } else {
            charSequence = this.q;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:            if (r1 != 3) goto L84;     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        int i = 64;
        int i2 = 2;
        int i3 = 30;
        if (isChecked) {
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.o;
                if (obj == null) {
                    obj = getResources().getString(nf2.abc_capital_on);
                }
                WeakHashMap weakHashMap = ll3.f3151a;
                new qk3(af2.tag_state_description, i, i3, i2).c(this, obj);
            }
        } else if (Build.VERSION.SDK_INT >= 30) {
            Object obj2 = this.q;
            if (obj2 == null) {
                obj2 = getResources().getString(nf2.abc_capital_off);
            }
            WeakHashMap weakHashMap2 = ll3.f3151a;
            new qk3(af2.tag_state_description, i, i3, i2).c(this, obj2);
        }
        float f = 0.0f;
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap3 = ll3.f3151a;
            if (xk3.c(this)) {
                if (isChecked) {
                    f = 1.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, R, f);
                this.N = ofFloat;
                ofFloat.setDuration(250L);
                c43.a(this.N, true);
                this.N.start();
                return;
            }
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        setThumbPosition(f);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t9.M0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
        setTextOnInternal(this.o);
        setTextOffInternal(this.q);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z) {
        this.H = z;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z) {
        if (this.s != z) {
            this.s = z;
            requestLayout();
            if (z) {
                e();
            }
        }
    }

    public void setSplitTrack(boolean z) {
        this.n = z;
        invalidate();
    }

    public void setSwitchMinWidth(int i) {
        this.l = i;
        requestLayout();
    }

    public void setSwitchPadding(int i) {
        this.m = i;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        TextPaint textPaint = this.I;
        if ((textPaint.getTypeface() != null && !textPaint.getTypeface().equals(typeface)) || (textPaint.getTypeface() == null && typeface != null)) {
            textPaint.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (!isChecked()) {
            int i = 30;
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.q;
                if (obj == null) {
                    obj = getResources().getString(nf2.abc_capital_off);
                }
                WeakHashMap weakHashMap = ll3.f3151a;
                new qk3(af2.tag_state_description, 64, i, 2).c(this, obj);
            }
        }
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            int i = 30;
            if (Build.VERSION.SDK_INT >= 30) {
                Object obj = this.o;
                if (obj == null) {
                    obj = getResources().getString(nf2.abc_capital_on);
                }
                WeakHashMap weakHashMap = ll3.f3151a;
                new qk3(af2.tag_state_description, 64, i, 2).c(this, obj);
            }
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f168a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f168a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f) {
        this.z = f;
        invalidate();
    }

    public void setThumbResource(int i) {
        setThumbDrawable(ew3.P0(getContext(), i));
    }

    public void setThumbTextPadding(int i) {
        this.k = i;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f169b = colorStateList;
        this.d = true;
        a();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i) {
        setTrackDrawable(ew3.P0(getContext(), i));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        b();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        b();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f168a && drawable != this.f) {
            return false;
        }
        return true;
    }
}
