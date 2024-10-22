package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import defpackage.af;
import defpackage.bn3;
import defpackage.ew3;
import defpackage.h83;
import defpackage.hk;
import defpackage.i93;
import defpackage.ja1;
import defpackage.je;
import defpackage.jf3;
import defpackage.kc;
import defpackage.m93;
import defpackage.p71;
import defpackage.pd;
import defpackage.r62;
import defpackage.re;
import defpackage.s62;
import defpackage.se;
import defpackage.t9;
import defpackage.te;
import defpackage.tf3;
import defpackage.v51;
import defpackage.x50;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements m93, hk {

    /* renamed from: a, reason: collision with root package name */
    public final kc f160a;

    /* renamed from: b, reason: collision with root package name */
    public final re f161b;
    public final x50 c;
    public pd d;
    public boolean e;
    public v51 f;
    public Future g;

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private pd getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new pd(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        kc kcVar = this.f160a;
        if (kcVar != null) {
            kcVar.a();
        }
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (bn3.f495b) {
            return super.getAutoSizeMaxTextSize();
        }
        re reVar = this.f161b;
        if (reVar != null) {
            return Math.round(reVar.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (bn3.f495b) {
            return super.getAutoSizeMinTextSize();
        }
        re reVar = this.f161b;
        if (reVar != null) {
            return Math.round(reVar.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (bn3.f495b) {
            return super.getAutoSizeStepGranularity();
        }
        re reVar = this.f161b;
        if (reVar != null) {
            return Math.round(reVar.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (bn3.f495b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        re reVar = this.f161b;
        if (reVar != null) {
            return reVar.i.f;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (bn3.f495b) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        re reVar = this.f161b;
        if (reVar == null) {
            return 0;
        }
        return reVar.i.f72a;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return t9.J0(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public se getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                this.f = new te(this);
            } else if (i >= 26) {
                this.f = new v51(this, 6);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        kc kcVar = this.f160a;
        if (kcVar != null) {
            return kcVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        kc kcVar = this.f160a;
        if (kcVar != null) {
            return kcVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f161b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f161b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                p71.C(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                t9.L(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        x50 x50Var;
        if (Build.VERSION.SDK_INT < 28 && (x50Var = this.c) != null) {
            TextClassifier textClassifier = (TextClassifier) x50Var.c;
            if (textClassifier == null) {
                return je.a((TextView) x50Var.f5117b);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public r62 getTextMetricsParamsCompat() {
        return t9.L(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f161b.getClass();
        re.h(this, onCreateInputConnection, editorInfo);
        t9.W(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        re reVar = this.f161b;
        if (reVar != null && !bn3.f495b) {
            reVar.i.a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                p71.C(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                t9.L(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        re reVar = this.f161b;
        if (reVar != null && !bn3.f495b) {
            af afVar = reVar.i;
            if (afVar.h() && afVar.f72a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            reVar.i.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView, defpackage.hk
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (bn3.f495b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (bn3.f495b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.j(iArr, i);
        }
    }

    @Override // android.widget.TextView, defpackage.hk
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (bn3.f495b) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        kc kcVar = this.f160a;
        if (kcVar != null) {
            kcVar.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        kc kcVar = this.f160a;
        if (kcVar != null) {
            kcVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(t9.M0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            t9.m0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().g(i);
        } else {
            t9.n0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        tf3.v(i);
        if (i != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i - r0, 1.0f);
        }
    }

    public void setPrecomputedText(s62 s62Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        t9.L(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        kc kcVar = this.f160a;
        if (kcVar != null) {
            kcVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        kc kcVar = this.f160a;
        if (kcVar != null) {
            kcVar.j(mode);
        }
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        re reVar = this.f161b;
        reVar.l(colorStateList);
        reVar.b();
    }

    @Override // defpackage.m93
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        re reVar = this.f161b;
        reVar.m(mode);
        reVar.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x50 x50Var;
        if (Build.VERSION.SDK_INT >= 28 || (x50Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            x50Var.c = textClassifier;
        }
    }

    public void setTextFuture(Future<s62> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setTextMetricsParamsCompat(defpackage.r62 r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            android.text.TextDirectionHeuristic r1 = r4.f4109b
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L9
            goto L32
        L9:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto Le
            goto L32
        Le:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.ANYRTL_LTR
            if (r1 != r2) goto L14
            r1 = 2
            goto L33
        L14:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LTR
            if (r1 != r2) goto L1a
            r1 = 3
            goto L33
        L1a:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.RTL
            if (r1 != r2) goto L20
            r1 = 4
            goto L33
        L20:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.LOCALE
            if (r1 != r2) goto L26
            r1 = 5
            goto L33
        L26:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r1 != r2) goto L2c
            r1 = 6
            goto L33
        L2c:
            android.text.TextDirectionHeuristic r2 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            if (r1 != r2) goto L32
            r1 = 7
            goto L33
        L32:
            r1 = 1
        L33:
            defpackage.n73.h(r3, r1)
            r1 = 23
            android.text.TextPaint r2 = r4.f4108a
            if (r0 >= r1) goto L5d
            float r4 = r2.getTextScaleX()
            android.text.TextPaint r0 = r3.getPaint()
            r0.set(r2)
            float r0 = r3.getTextScaleX()
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = r4 / r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            r3.setTextScaleX(r0)
        L59:
            r3.setTextScaleX(r4)
            goto L6e
        L5d:
            android.text.TextPaint r0 = r3.getPaint()
            r0.set(r2)
            int r0 = r4.c
            defpackage.o73.e(r3, r0)
            int r4 = r4.d
            defpackage.o73.h(r3, r4)
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatTextView.setTextMetricsParamsCompat(r62):void");
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = bn3.f495b;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        re reVar = this.f161b;
        if (reVar != null && !z2) {
            af afVar = reVar.i;
            if (afVar.h() && afVar.f72a != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                afVar.e(f, i);
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            ja1 ja1Var = jf3.f2758a;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i93.a(context);
        this.e = false;
        this.f = null;
        h83.a(getContext(), this);
        kc kcVar = new kc(this);
        this.f160a = kcVar;
        kcVar.e(attributeSet, i);
        re reVar = new re(this);
        this.f161b = reVar;
        reVar.f(attributeSet, i);
        reVar.b();
        this.c = new x50(this);
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ew3.P0(context, i) : null, i2 != 0 ? ew3.P0(context, i2) : null, i3 != 0 ? ew3.P0(context, i3) : null, i4 != 0 ? ew3.P0(context, i4) : null);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ew3.P0(context, i) : null, i2 != 0 ? ew3.P0(context, i2) : null, i3 != 0 ? ew3.P0(context, i3) : null, i4 != 0 ? ew3.P0(context, i4) : null);
        re reVar = this.f161b;
        if (reVar != null) {
            reVar.b();
        }
    }
}
