package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.CheckableImageButton;
import defpackage.bk2;
import defpackage.bn0;
import defpackage.cd0;
import defpackage.cp3;
import defpackage.dc1;
import defpackage.dd0;
import defpackage.e73;
import defpackage.ec1;
import defpackage.ed0;
import defpackage.ef0;
import defpackage.er1;
import defpackage.ew3;
import defpackage.f73;
import defpackage.fr1;
import defpackage.fs2;
import defpackage.g73;
import defpackage.h20;
import defpackage.he2;
import defpackage.hx2;
import defpackage.in0;
import defpackage.jk;
import defpackage.k73;
import defpackage.kq1;
import defpackage.l73;
import defpackage.ll3;
import defpackage.lo0;
import defpackage.m20;
import defpackage.mf2;
import defpackage.nd;
import defpackage.op;
import defpackage.or0;
import defpackage.ov0;
import defpackage.p90;
import defpackage.pb;
import defpackage.pr0;
import defpackage.qf2;
import defpackage.qq1;
import defpackage.re2;
import defpackage.rk0;
import defpackage.s;
import defpackage.s63;
import defpackage.sb3;
import defpackage.su;
import defpackage.t9;
import defpackage.tf3;
import defpackage.u03;
import defpackage.uk3;
import defpackage.v51;
import defpackage.vk3;
import defpackage.wq;
import defpackage.x10;
import defpackage.x80;
import defpackage.xe2;
import defpackage.xk3;
import defpackage.xn2;
import defpackage.zf3;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int M0 = qf2.Widget_Design_TextInputLayout;
    public static final int[][] N0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public int A0;
    public ColorStateList B;
    public int B0;
    public boolean C;
    public int C0;
    public CharSequence D;
    public int D0;
    public boolean E;
    public int E0;
    public fr1 F;
    public boolean F0;
    public fr1 G;
    public final x10 G0;
    public StateListDrawable H;
    public boolean H0;
    public boolean I;
    public boolean I0;
    public fr1 J;
    public ValueAnimator J0;
    public fr1 K;
    public boolean K0;
    public fs2 L;
    public boolean L0;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f1560a;

    /* renamed from: b, reason: collision with root package name */
    public final u03 f1561b;
    public final pr0 c;
    public EditText d;
    public CharSequence e;
    public int f;
    public int g;
    public int h;
    public int h0;
    public int i;
    public int i0;
    public final ec1 j;
    public int j0;
    public boolean k;
    public final Rect k0;
    public int l;
    public final Rect l0;
    public boolean m;
    public final RectF m0;
    public g73 n;
    public Typeface n0;
    public AppCompatTextView o;
    public ColorDrawable o0;
    public int p;
    public int p0;
    public int q;
    public final LinkedHashSet q0;
    public CharSequence r;
    public ColorDrawable r0;
    public boolean s;
    public int s0;
    public AppCompatTextView t;
    public Drawable t0;
    public ColorStateList u;
    public ColorStateList u0;
    public int v;
    public ColorStateList v0;
    public ov0 w;
    public int w0;
    public ov0 x;
    public int x0;
    public ColorStateList y;
    public int y0;
    public ColorStateList z;
    public ColorStateList z0;

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public CharSequence c;
        public boolean d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.d = parcel.readInt() == 1;
        }

        public final String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.c) + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            TextUtils.writeToParcel(this.c, parcel, i);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r23, android.util.AttributeSet r24) {
        /*
            Method dump skipped, instructions count: 917
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private Drawable getEditTextBoxBackground() {
        boolean z;
        int i;
        EditText editText = this.d;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int x = zf3.x(this.d, he2.colorControlHighlight);
                int i2 = this.O;
                int[][] iArr = N0;
                if (i2 == 2) {
                    Context context = getContext();
                    fr1 fr1Var = this.F;
                    TypedValue L = cp3.L(context, he2.colorSurface, "TextInputLayout");
                    int i3 = L.resourceId;
                    if (i3 != 0) {
                        i = x80.getColor(context, i3);
                    } else {
                        i = L.data;
                    }
                    fr1 fr1Var2 = new fr1(fr1Var.f2139a.f1978a);
                    int U = zf3.U(0.1f, x, i);
                    fr1Var2.j(new ColorStateList(iArr, new int[]{U, 0}));
                    fr1Var2.setTint(i);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{U, i});
                    fr1 fr1Var3 = new fr1(fr1Var.f2139a.f1978a);
                    fr1Var3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, fr1Var2, fr1Var3), fr1Var});
                }
                if (i2 == 1) {
                    fr1 fr1Var4 = this.F;
                    int i4 = this.j0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{zf3.U(0.1f, x, i4), i4}), fr1Var4, fr1Var4);
                }
                return null;
            }
        }
        return this.F;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], f(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = f(true);
        }
        return this.G;
    }

    public static void k(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.d == null) {
            if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.d = editText;
            int i = this.f;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.h);
            }
            int i2 = this.g;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.i);
            }
            this.I = false;
            i();
            setTextInputAccessibilityDelegate(new f73(this));
            Typeface typeface = this.d.getTypeface();
            x10 x10Var = this.G0;
            x10Var.m(typeface);
            float textSize = this.d.getTextSize();
            if (x10Var.h != textSize) {
                x10Var.h = textSize;
                x10Var.h(false);
            }
            int i3 = Build.VERSION.SDK_INT;
            float letterSpacing = this.d.getLetterSpacing();
            if (x10Var.W != letterSpacing) {
                x10Var.W = letterSpacing;
                x10Var.h(false);
            }
            int gravity = this.d.getGravity();
            int i4 = (gravity & (-113)) | 48;
            if (x10Var.g != i4) {
                x10Var.g = i4;
                x10Var.h(false);
            }
            if (x10Var.f != gravity) {
                x10Var.f = gravity;
                x10Var.h(false);
            }
            this.d.addTextChangedListener(new xn2(this, 1));
            if (this.u0 == null) {
                this.u0 = this.d.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.d.getHint();
                    this.e = hint;
                    setHint(hint);
                    this.d.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (i3 >= 29) {
                p();
            }
            if (this.o != null) {
                n(this.d.getText());
            }
            r();
            this.j.b();
            this.f1561b.bringToFront();
            pr0 pr0Var = this.c;
            pr0Var.bringToFront();
            Iterator it = this.q0.iterator();
            while (it.hasNext()) {
                ((or0) it.next()).a(this);
            }
            pr0Var.m();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            u(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            x10 x10Var = this.G0;
            if (charSequence == null || !TextUtils.equals(x10Var.A, charSequence)) {
                x10Var.A = charSequence;
                x10Var.B = null;
                Bitmap bitmap = x10Var.E;
                if (bitmap != null) {
                    bitmap.recycle();
                    x10Var.E = null;
                }
                x10Var.h(false);
            }
            if (!this.F0) {
                j();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            AppCompatTextView appCompatTextView = this.t;
            if (appCompatTextView != null) {
                this.f1560a.addView(appCompatTextView);
                this.t.setVisibility(0);
            }
        } else {
            AppCompatTextView appCompatTextView2 = this.t;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setVisibility(8);
            }
            this.t = null;
        }
        this.s = z;
    }

    public final void a(float f) {
        x10 x10Var = this.G0;
        if (x10Var.f5105b == f) {
            return;
        }
        if (this.J0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.J0 = valueAnimator;
            valueAnimator.setInterpolator(zf3.d0(getContext(), he2.motionEasingEmphasizedInterpolator, pb.f3812b));
            this.J0.setDuration(zf3.c0(getContext(), he2.motionDurationMedium4, 167));
            this.J0.addUpdateListener(new wq(this, 1));
        }
        this.J0.setFloatValues(x10Var.f5105b, f);
        this.J0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f1560a;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            t();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r7 = this;
            fr1 r0 = r7.F
            if (r0 != 0) goto L5
            return
        L5:
            er1 r1 = r0.f2139a
            fs2 r1 = r1.f1978a
            fs2 r2 = r7.L
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.O
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.Q
            if (r0 <= r2) goto L22
            int r0 = r7.i0
            if (r0 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            if (r0 == 0) goto L4b
            fr1 r0 = r7.F
            int r1 = r7.Q
            float r1 = (float) r1
            int r5 = r7.i0
            er1 r6 = r0.f2139a
            r6.k = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            er1 r5 = r0.f2139a
            android.content.res.ColorStateList r6 = r5.d
            if (r6 == r1) goto L4b
            r5.d = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.j0
            int r1 = r7.O
            if (r1 != r4) goto L61
            int r0 = defpackage.he2.colorSurface
            android.content.Context r1 = r7.getContext()
            int r0 = defpackage.zf3.w(r1, r0, r3)
            int r1 = r7.j0
            int r0 = defpackage.h20.b(r1, r0)
        L61:
            r7.j0 = r0
            fr1 r1 = r7.F
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.j(r0)
            fr1 r0 = r7.J
            if (r0 == 0) goto La6
            fr1 r1 = r7.K
            if (r1 != 0) goto L75
            goto La6
        L75:
            int r1 = r7.Q
            if (r1 <= r2) goto L7e
            int r1 = r7.i0
            if (r1 == 0) goto L7e
            r3 = 1
        L7e:
            if (r3 == 0) goto La3
            android.widget.EditText r1 = r7.d
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L8f
            int r1 = r7.w0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto L95
        L8f:
            int r1 = r7.i0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        L95:
            r0.j(r1)
            fr1 r0 = r7.K
            int r1 = r7.i0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.j(r1)
        La3:
            r7.invalidate()
        La6:
            r7.s()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.b():void");
    }

    public final int c() {
        float d;
        if (!this.C) {
            return 0;
        }
        int i = this.O;
        x10 x10Var = this.G0;
        if (i != 0) {
            if (i != 2) {
                return 0;
            }
            d = x10Var.d() / 2.0f;
        } else {
            d = x10Var.d();
        }
        return (int) d;
    }

    public final ov0 d() {
        ov0 ov0Var = new ov0();
        ov0Var.c = zf3.c0(getContext(), he2.motionDurationShort2, 87);
        ov0Var.d = zf3.d0(getContext(), he2.motionEasingLinearInterpolator, pb.f3811a);
        return ov0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.d.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f1560a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.L0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.L0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        fr1 fr1Var;
        super.draw(canvas);
        boolean z = this.C;
        x10 x10Var = this.G0;
        if (z) {
            x10Var.getClass();
            int save = canvas.save();
            if (x10Var.B != null) {
                RectF rectF = x10Var.e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = x10Var.N;
                    textPaint.setTextSize(x10Var.G);
                    float f = x10Var.p;
                    float f2 = x10Var.q;
                    float f3 = x10Var.F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    boolean z2 = true;
                    if (x10Var.d0 <= 1 || x10Var.C) {
                        z2 = false;
                    }
                    if (z2) {
                        float lineStart = x10Var.p - x10Var.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (x10Var.b0 * f4));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f5 = x10Var.H;
                            float f6 = x10Var.I;
                            float f7 = x10Var.J;
                            int i2 = x10Var.K;
                            textPaint.setShadowLayer(f5, f6, f7, h20.d(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                        }
                        x10Var.Y.draw(canvas);
                        textPaint.setAlpha((int) (x10Var.a0 * f4));
                        if (i >= 31) {
                            float f8 = x10Var.H;
                            float f9 = x10Var.I;
                            float f10 = x10Var.J;
                            int i3 = x10Var.K;
                            textPaint.setShadowLayer(f8, f9, f10, h20.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = x10Var.Y.getLineBaseline(0);
                        CharSequence charSequence = x10Var.c0;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(x10Var.H, x10Var.I, x10Var.J, x10Var.K);
                        }
                        String trim = x10Var.c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(x10Var.Y.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        x10Var.Y.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.K != null && (fr1Var = this.J) != null) {
            fr1Var.draw(canvas);
            if (this.d.isFocused()) {
                Rect bounds = this.K.getBounds();
                Rect bounds2 = this.J.getBounds();
                float f12 = x10Var.f5105b;
                int centerX = bounds2.centerX();
                int i4 = bounds2.left;
                LinearInterpolator linearInterpolator = pb.f3811a;
                bounds.left = Math.round((i4 - centerX) * f12) + centerX;
                bounds.right = Math.round(f12 * (bounds2.right - centerX)) + centerX;
                this.K.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        if (this.K0) {
            return;
        }
        boolean z4 = true;
        this.K0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        x10 x10Var = this.G0;
        if (x10Var != null) {
            x10Var.L = drawableState;
            ColorStateList colorStateList2 = x10Var.k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = x10Var.j) != null && colorStateList.isStateful())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                x10Var.h(false);
                z3 = true;
            } else {
                z3 = false;
            }
            z = z3 | false;
        } else {
            z = false;
        }
        if (this.d != null) {
            WeakHashMap weakHashMap = ll3.f3151a;
            if (!xk3.c(this) || !isEnabled()) {
                z4 = false;
            }
            u(z4, false);
        }
        r();
        x();
        if (z) {
            invalidate();
        }
        this.K0 = false;
    }

    public final boolean e() {
        if (this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof ed0)) {
            return true;
        }
        return false;
    }

    public final fr1 f(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(re2.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.d;
        if (editText instanceof qq1) {
            dimensionPixelOffset = ((qq1) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(re2.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(re2.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        jk jkVar = new jk(1);
        jkVar.e = new s(f);
        jkVar.f = new s(f);
        jkVar.h = new s(dimensionPixelOffset2);
        jkVar.g = new s(dimensionPixelOffset2);
        fs2 fs2Var = new fs2(jkVar);
        EditText editText2 = this.d;
        if (editText2 instanceof qq1) {
            colorStateList = ((qq1) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = fr1.w;
            TypedValue L = cp3.L(context, he2.colorSurface, fr1.class.getSimpleName());
            int i2 = L.resourceId;
            if (i2 != 0) {
                i = x80.getColor(context, i2);
            } else {
                i = L.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        fr1 fr1Var = new fr1();
        fr1Var.h(context);
        fr1Var.j(colorStateList);
        fr1Var.i(dimensionPixelOffset);
        fr1Var.setShapeAppearanceModel(fs2Var);
        er1 er1Var = fr1Var.f2139a;
        if (er1Var.h == null) {
            er1Var.h = new Rect();
        }
        fr1Var.f2139a.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        fr1Var.invalidateSelf();
        return fr1Var;
    }

    public final int g(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z && getPrefixText() != null) {
            compoundPaddingLeft = this.f1561b.a();
        } else if (z && getSuffixText() != null) {
            compoundPaddingLeft = this.c.c();
        } else {
            compoundPaddingLeft = this.d.getCompoundPaddingLeft();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.d;
        if (editText != null) {
            return c() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public fr1 getBoxBackground() {
        int i = this.O;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.F;
    }

    public int getBoxBackgroundColor() {
        return this.j0;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean D = cp3.D(this);
        RectF rectF = this.m0;
        if (D) {
            return this.L.h.a(rectF);
        }
        return this.L.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean D = cp3.D(this);
        RectF rectF = this.m0;
        if (D) {
            return this.L.g.a(rectF);
        }
        return this.L.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean D = cp3.D(this);
        RectF rectF = this.m0;
        if (D) {
            return this.L.e.a(rectF);
        }
        return this.L.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean D = cp3.D(this);
        RectF rectF = this.m0;
        if (D) {
            return this.L.f.a(rectF);
        }
        return this.L.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.z0;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.h0;
    }

    public int getCounterMaxLength() {
        return this.l;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.k && this.m && (appCompatTextView = this.o) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.z;
    }

    public ColorStateList getCounterTextColor() {
        return this.y;
    }

    public ColorStateList getCursorColor() {
        return this.A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.u0;
    }

    public EditText getEditText() {
        return this.d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    public CharSequence getError() {
        ec1 ec1Var = this.j;
        if (ec1Var.q) {
            return ec1Var.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.j.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        ec1 ec1Var = this.j;
        if (ec1Var.x) {
            return ec1Var.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.j.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.G0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        x10 x10Var = this.G0;
        return x10Var.e(x10Var.k);
    }

    public ColorStateList getHintTextColor() {
        return this.v0;
    }

    public g73 getLengthCounter() {
        return this.n;
    }

    public int getMaxEms() {
        return this.g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f;
    }

    public int getMinWidth() {
        return this.h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.f1561b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f1561b.f4610b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f1561b.f4610b;
    }

    public fs2 getShapeAppearanceModel() {
        return this.L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f1561b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f1561b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f1561b.g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f1561b.h;
    }

    public CharSequence getSuffixText() {
        return this.c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.c.q;
    }

    public Typeface getTypeface() {
        return this.n0;
    }

    public final int h(int i, boolean z) {
        int compoundPaddingRight;
        if (!z && getSuffixText() != null) {
            compoundPaddingRight = this.c.c();
        } else if (z && getPrefixText() != null) {
            compoundPaddingRight = this.f1561b.a();
        } else {
            compoundPaddingRight = this.d.getCompoundPaddingRight();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        boolean z;
        int i = this.O;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.C && !(this.F instanceof ed0)) {
                        fs2 fs2Var = this.L;
                        int i2 = ed0.y;
                        if (fs2Var == null) {
                            fs2Var = new fs2();
                        }
                        this.F = new dd0(new cd0(fs2Var, new RectF()));
                    } else {
                        this.F = new fr1(this.L);
                    }
                    this.J = null;
                    this.K = null;
                } else {
                    throw new IllegalArgumentException(hx2.r(new StringBuilder(), this.O, " is illegal; only @BoxBackgroundMode constants are supported."));
                }
            } else {
                this.F = new fr1(this.L);
                this.J = new fr1();
                this.K = new fr1();
            }
        } else {
            this.F = null;
            this.J = null;
            this.K = null;
        }
        s();
        x();
        boolean z2 = false;
        if (this.O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.P = getResources().getDimensionPixelSize(re2.material_font_2_0_box_collapsed_padding_top);
            } else if (m20.y0(getContext())) {
                this.P = getResources().getDimensionPixelSize(re2.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.d != null && this.O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                z2 = true;
            }
            if (z2) {
                EditText editText = this.d;
                WeakHashMap weakHashMap = ll3.f3151a;
                vk3.k(editText, vk3.f(editText), getResources().getDimensionPixelSize(re2.material_filled_edittext_font_2_0_padding_top), vk3.e(this.d), getResources().getDimensionPixelSize(re2.material_filled_edittext_font_2_0_padding_bottom));
            } else if (m20.y0(getContext())) {
                EditText editText2 = this.d;
                WeakHashMap weakHashMap2 = ll3.f3151a;
                vk3.k(editText2, vk3.f(editText2), getResources().getDimensionPixelSize(re2.material_filled_edittext_font_1_3_padding_top), vk3.e(this.d), getResources().getDimensionPixelSize(re2.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.O != 0) {
            t();
        }
        EditText editText3 = this.d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        int i2;
        if (!e()) {
            return;
        }
        int width = this.d.getWidth();
        int gravity = this.d.getGravity();
        x10 x10Var = this.G0;
        boolean b2 = x10Var.b(x10Var.A);
        x10Var.C = b2;
        Rect rect = x10Var.d;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                if (b2) {
                    f = rect.right;
                    f2 = x10Var.Z;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
            } else if (b2) {
                i2 = rect.left;
                f3 = i2;
            } else {
                f = rect.right;
                f2 = x10Var.Z;
            }
            float max = Math.max(f3, rect.left);
            rectF = this.m0;
            rectF.left = max;
            rectF.top = rect.top;
            if (gravity == 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                    if (x10Var.C) {
                        i = rect.right;
                        f4 = i;
                    } else {
                        f4 = x10Var.Z + max;
                    }
                } else if (x10Var.C) {
                    f4 = x10Var.Z + max;
                } else {
                    i = rect.right;
                    f4 = i;
                }
            } else {
                f4 = (width / 2.0f) + (x10Var.Z / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = x10Var.d() + rect.top;
            if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                float f5 = rectF.left;
                float f6 = this.N;
                rectF.left = f5 - f6;
                rectF.right += f6;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
                ed0 ed0Var = (ed0) this.F;
                ed0Var.getClass();
                ed0Var.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
        }
        f = width / 2.0f;
        f2 = x10Var.Z / 2.0f;
        f3 = f - f2;
        float max2 = Math.max(f3, rect.left);
        rectF = this.m0;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f4 = (width / 2.0f) + (x10Var.Z / 2.0f);
        rectF.right = Math.min(f4, rect.right);
        rectF.bottom = x10Var.d() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:            if (r3.getTextColors().getDefaultColor() == (-65281)) goto L11;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void l(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            defpackage.t9.p0(r3, r4)     // Catch: java.lang.Exception -> L1b
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1b
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1b
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1b
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1c
        L18:
            r4 = 0
            r0 = 0
            goto L1c
        L1b:
        L1c:
            if (r0 == 0) goto L30
            int r4 = defpackage.qf2.TextAppearance_AppCompat_Caption
            defpackage.t9.p0(r3, r4)
            android.content.Context r4 = r2.getContext()
            int r0 = defpackage.me2.design_error
            int r4 = defpackage.x80.getColor(r4, r0)
            r3.setTextColor(r4)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.l(android.widget.TextView, int):void");
    }

    public final boolean m() {
        ec1 ec1Var = this.j;
        if (ec1Var.o == 1 && ec1Var.r != null && !TextUtils.isEmpty(ec1Var.p)) {
            return true;
        }
        return false;
    }

    public final void n(Editable editable) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        op opVar;
        ((ef0) this.n).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z3 = this.m;
        int i3 = this.l;
        String str = null;
        if (i3 == -1) {
            this.o.setText(String.valueOf(i));
            this.o.setContentDescription(null);
            this.m = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.m = z;
            Context context = getContext();
            AppCompatTextView appCompatTextView = this.o;
            int i4 = this.l;
            if (this.m) {
                i2 = mf2.character_counter_overflowed_content_description;
            } else {
                i2 = mf2.character_counter_content_description;
            }
            appCompatTextView.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z3 != this.m) {
                o();
            }
            String str2 = op.d;
            Locale locale = Locale.getDefault();
            int i5 = l73.f3078a;
            if (k73.a(locale) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                opVar = op.g;
            } else {
                opVar = op.f;
            }
            AppCompatTextView appCompatTextView2 = this.o;
            String string = getContext().getString(mf2.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.l));
            if (string == null) {
                opVar.getClass();
            } else {
                str = opVar.c(string, opVar.c).toString();
            }
            appCompatTextView2.setText(str);
        }
        if (this.d != null && z3 != this.m) {
            u(false, false);
            x();
            r();
        }
    }

    public final void o() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.o;
        if (appCompatTextView != null) {
            if (this.m) {
                i = this.p;
            } else {
                i = this.q;
            }
            l(appCompatTextView, i);
            if (!this.m && (colorStateList2 = this.y) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (this.m && (colorStateList = this.z) != null) {
                this.o.setTextColor(colorStateList);
            }
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.G0.g(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        int compoundPaddingTop;
        boolean z4;
        int compoundPaddingBottom;
        boolean z5;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.d;
        if (editText != null) {
            ThreadLocal threadLocal = rk0.f4168a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.k0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = rk0.f4168a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            rk0.a(this, editText, matrix);
            ThreadLocal threadLocal3 = rk0.f4169b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            fr1 fr1Var = this.J;
            if (fr1Var != null) {
                int i5 = rect.bottom;
                fr1Var.setBounds(rect.left, i5 - this.R, rect.right, i5);
            }
            fr1 fr1Var2 = this.K;
            if (fr1Var2 != null) {
                int i6 = rect.bottom;
                fr1Var2.setBounds(rect.left, i6 - this.h0, rect.right, i6);
            }
            if (this.C) {
                float textSize = this.d.getTextSize();
                x10 x10Var = this.G0;
                if (x10Var.h != textSize) {
                    x10Var.h = textSize;
                    x10Var.h(false);
                }
                int gravity = this.d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (x10Var.g != i7) {
                    x10Var.g = i7;
                    x10Var.h(false);
                }
                if (x10Var.f != gravity) {
                    x10Var.f = gravity;
                    x10Var.h(false);
                }
                if (this.d != null) {
                    boolean D = cp3.D(this);
                    int i8 = rect.bottom;
                    Rect rect2 = this.l0;
                    rect2.bottom = i8;
                    int i9 = this.O;
                    if (i9 != 1) {
                        if (i9 != 2) {
                            rect2.left = g(rect.left, D);
                            rect2.top = getPaddingTop();
                            rect2.right = h(rect.right, D);
                        } else {
                            rect2.left = this.d.getPaddingLeft() + rect.left;
                            rect2.top = rect.top - c();
                            rect2.right = rect.right - this.d.getPaddingRight();
                        }
                    } else {
                        rect2.left = g(rect.left, D);
                        rect2.top = rect.top + this.P;
                        rect2.right = h(rect.right, D);
                    }
                    int i10 = rect2.left;
                    int i11 = rect2.top;
                    int i12 = rect2.right;
                    int i13 = rect2.bottom;
                    Rect rect3 = x10Var.d;
                    if (rect3.left == i10 && rect3.top == i11 && rect3.right == i12 && rect3.bottom == i13) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        rect3.set(i10, i11, i12, i13);
                        x10Var.M = true;
                    }
                    if (this.d != null) {
                        TextPaint textPaint = x10Var.O;
                        textPaint.setTextSize(x10Var.h);
                        textPaint.setTypeface(x10Var.u);
                        textPaint.setLetterSpacing(x10Var.W);
                        float f = -textPaint.ascent();
                        rect2.left = this.d.getCompoundPaddingLeft() + rect.left;
                        if (this.O == 1 && this.d.getMinLines() <= 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                        } else {
                            compoundPaddingTop = rect.top + this.d.getCompoundPaddingTop();
                        }
                        rect2.top = compoundPaddingTop;
                        rect2.right = rect.right - this.d.getCompoundPaddingRight();
                        if (this.O == 1 && this.d.getMinLines() <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            compoundPaddingBottom = (int) (rect2.top + f);
                        } else {
                            compoundPaddingBottom = rect.bottom - this.d.getCompoundPaddingBottom();
                        }
                        rect2.bottom = compoundPaddingBottom;
                        int i14 = rect2.left;
                        int i15 = rect2.top;
                        int i16 = rect2.right;
                        Rect rect4 = x10Var.c;
                        if (rect4.left == i14 && rect4.top == i15 && rect4.right == i16 && rect4.bottom == compoundPaddingBottom) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (!z5) {
                            rect4.set(i14, i15, i16, compoundPaddingBottom);
                            x10Var.M = true;
                        }
                        x10Var.h(false);
                        if (e() && !this.F0) {
                            j();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        EditText editText2 = this.d;
        int i3 = 1;
        pr0 pr0Var = this.c;
        if (editText2 != null && this.d.getMeasuredHeight() < (max = Math.max(pr0Var.getMeasuredHeight(), this.f1561b.getMeasuredHeight()))) {
            this.d.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean q = q();
        if (z || q) {
            this.d.post(new e73(this, i3));
        }
        if (this.t != null && (editText = this.d) != null) {
            this.t.setGravity(editText.getGravity());
            this.t.setPadding(this.d.getCompoundPaddingLeft(), this.d.getCompoundPaddingTop(), this.d.getCompoundPaddingRight(), this.d.getCompoundPaddingBottom());
        }
        pr0Var.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f200a);
        setError(savedState.c);
        if (savedState.d) {
            post(new e73(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        boolean z;
        super.onRtlPropertiesChanged(i);
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.M) {
            p90 p90Var = this.L.e;
            RectF rectF = this.m0;
            float a2 = p90Var.a(rectF);
            float a3 = this.L.f.a(rectF);
            float a4 = this.L.h.a(rectF);
            float a5 = this.L.g.a(rectF);
            fs2 fs2Var = this.L;
            tf3 tf3Var = fs2Var.f2143a;
            jk jkVar = new jk(1);
            tf3 tf3Var2 = fs2Var.f2144b;
            jkVar.f2774a = tf3Var2;
            jk.c(tf3Var2);
            jkVar.f2775b = tf3Var;
            jk.c(tf3Var);
            tf3 tf3Var3 = fs2Var.c;
            jkVar.d = tf3Var3;
            jk.c(tf3Var3);
            tf3 tf3Var4 = fs2Var.d;
            jkVar.c = tf3Var4;
            jk.c(tf3Var4);
            jkVar.e = new s(a3);
            jkVar.f = new s(a2);
            jkVar.h = new s(a5);
            jkVar.g = new s(a4);
            fs2 fs2Var2 = new fs2(jkVar);
            this.M = z;
            setShapeAppearanceModel(fs2Var2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (m()) {
            savedState.c = getError();
        }
        pr0 pr0Var = this.c;
        boolean z2 = true;
        if (pr0Var.i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !pr0Var.g.isChecked()) {
            z2 = false;
        }
        savedState.d = z2;
        return savedState;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue J = cp3.J(context, he2.colorControlActivated);
            if (J != null) {
                int i = J.resourceId;
                if (i != 0) {
                    colorStateList2 = x80.getColorStateList(context, i);
                } else {
                    int i2 = J.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.d.getTextCursorDrawable();
                if (!m() && (this.o == null || !this.m)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (colorStateList = this.B) != null) {
                    colorStateList2 = colorStateList;
                }
                bn0.h(textCursorDrawable2, colorStateList2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:            if (r3.d() != false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0097, code lost:            if (r3.p != null) goto L41;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q() {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.q():boolean");
    }

    public final void r() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        PorterDuffColorFilter h;
        EditText editText = this.d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = in0.f2623a;
        Drawable mutate = background.mutate();
        if (m()) {
            int errorCurrentTextColors = getErrorCurrentTextColors();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            PorterDuff.Mode mode2 = nd.f3438b;
            synchronized (nd.class) {
                h = bk2.h(errorCurrentTextColors, mode);
            }
            mutate.setColorFilter(h);
            return;
        }
        if (this.m && (appCompatTextView = this.o) != null) {
            mutate.setColorFilter(nd.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            t9.w(mutate);
            this.d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.d;
        if (editText != null && this.F != null) {
            if ((this.I || editText.getBackground() == null) && this.O != 0) {
                EditText editText2 = this.d;
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                WeakHashMap weakHashMap = ll3.f3151a;
                uk3.q(editText2, editTextBoxBackground);
                this.I = true;
            }
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.j0 != i) {
            this.j0 = i;
            this.A0 = i;
            this.C0 = i;
            this.D0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(x80.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.A0 = defaultColor;
        this.j0 = defaultColor;
        this.B0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.C0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.D0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.O) {
            return;
        }
        this.O = i;
        if (this.d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.P = i;
    }

    public void setBoxCornerFamily(int i) {
        fs2 fs2Var = this.L;
        fs2Var.getClass();
        jk jkVar = new jk(fs2Var);
        p90 p90Var = this.L.e;
        tf3 m = zf3.m(i);
        jkVar.f2774a = m;
        jk.c(m);
        jkVar.e = p90Var;
        p90 p90Var2 = this.L.f;
        tf3 m2 = zf3.m(i);
        jkVar.f2775b = m2;
        jk.c(m2);
        jkVar.f = p90Var2;
        p90 p90Var3 = this.L.h;
        tf3 m3 = zf3.m(i);
        jkVar.d = m3;
        jk.c(m3);
        jkVar.h = p90Var3;
        p90 p90Var4 = this.L.g;
        tf3 m4 = zf3.m(i);
        jkVar.c = m4;
        jk.c(m4);
        jkVar.g = p90Var4;
        this.L = new fs2(jkVar);
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.w0 = colorStateList.getDefaultColor();
            this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.x0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.y0 != colorStateList.getDefaultColor()) {
            this.y0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.h0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.k != z) {
            Editable editable = null;
            ec1 ec1Var = this.j;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
                this.o = appCompatTextView;
                appCompatTextView.setId(xe2.textinput_counter);
                Typeface typeface = this.n0;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                ec1Var.a(this.o, 2);
                kq1.h((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(re2.mtrl_textinput_counter_margin_start));
                o();
                if (this.o != null) {
                    EditText editText = this.d;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    n(editable);
                }
            } else {
                ec1Var.g(this.o, 2);
                this.o = null;
            }
            this.k = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.l != i) {
            if (i > 0) {
                this.l = i;
            } else {
                this.l = -1;
            }
            if (this.k && this.o != null) {
                EditText editText = this.d;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                n(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.y != colorStateList) {
            this.y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        boolean z;
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (!m() && (this.o == null || !this.m)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        this.v0 = colorStateList;
        if (this.d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        k(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        pr0 pr0Var = this.c;
        CharSequence text = i != 0 ? pr0Var.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pr0Var.g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        pr0 pr0Var = this.c;
        Drawable P0 = i != 0 ? ew3.P0(pr0Var.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pr0Var.g;
        checkableImageButton.setImageDrawable(P0);
        if (P0 != null) {
            ColorStateList colorStateList = pr0Var.k;
            PorterDuff.Mode mode = pr0Var.l;
            TextInputLayout textInputLayout = pr0Var.f3903a;
            m20.K(textInputLayout, checkableImageButton, colorStateList, mode);
            m20.Q0(textInputLayout, checkableImageButton, pr0Var.k);
        }
    }

    public void setEndIconMinSize(int i) {
        pr0 pr0Var = this.c;
        if (i >= 0) {
            if (i != pr0Var.m) {
                pr0Var.m = i;
                CheckableImageButton checkableImageButton = pr0Var.g;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = pr0Var.c;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        pr0Var.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        pr0 pr0Var = this.c;
        View.OnLongClickListener onLongClickListener = pr0Var.o;
        CheckableImageButton checkableImageButton = pr0Var.g;
        checkableImageButton.setOnClickListener(onClickListener);
        m20.V0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        pr0 pr0Var = this.c;
        pr0Var.o = onLongClickListener;
        CheckableImageButton checkableImageButton = pr0Var.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m20.V0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        pr0 pr0Var = this.c;
        pr0Var.n = scaleType;
        pr0Var.g.setScaleType(scaleType);
        pr0Var.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        pr0 pr0Var = this.c;
        if (pr0Var.k != colorStateList) {
            pr0Var.k = colorStateList;
            m20.K(pr0Var.f3903a, pr0Var.g, colorStateList, pr0Var.l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        pr0 pr0Var = this.c;
        if (pr0Var.l != mode) {
            pr0Var.l = mode;
            m20.K(pr0Var.f3903a, pr0Var.g, pr0Var.k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.h(z);
    }

    public void setError(CharSequence charSequence) {
        ec1 ec1Var = this.j;
        if (!ec1Var.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            ec1Var.c();
            ec1Var.p = charSequence;
            ec1Var.r.setText(charSequence);
            int i = ec1Var.n;
            if (i != 1) {
                ec1Var.o = 1;
            }
            ec1Var.i(i, ec1Var.o, ec1Var.h(ec1Var.r, charSequence));
            return;
        }
        ec1Var.f();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        ec1 ec1Var = this.j;
        ec1Var.t = i;
        AppCompatTextView appCompatTextView = ec1Var.r;
        if (appCompatTextView != null) {
            WeakHashMap weakHashMap = ll3.f3151a;
            xk3.f(appCompatTextView, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        ec1 ec1Var = this.j;
        ec1Var.s = charSequence;
        AppCompatTextView appCompatTextView = ec1Var.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        ec1 ec1Var = this.j;
        if (ec1Var.q != z) {
            ec1Var.c();
            TextInputLayout textInputLayout = ec1Var.h;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(ec1Var.g, null);
                ec1Var.r = appCompatTextView;
                appCompatTextView.setId(xe2.textinput_error);
                ec1Var.r.setTextAlignment(5);
                Typeface typeface = ec1Var.B;
                if (typeface != null) {
                    ec1Var.r.setTypeface(typeface);
                }
                int i = ec1Var.u;
                ec1Var.u = i;
                AppCompatTextView appCompatTextView2 = ec1Var.r;
                if (appCompatTextView2 != null) {
                    textInputLayout.l(appCompatTextView2, i);
                }
                ColorStateList colorStateList = ec1Var.v;
                ec1Var.v = colorStateList;
                AppCompatTextView appCompatTextView3 = ec1Var.r;
                if (appCompatTextView3 != null && colorStateList != null) {
                    appCompatTextView3.setTextColor(colorStateList);
                }
                CharSequence charSequence = ec1Var.s;
                ec1Var.s = charSequence;
                AppCompatTextView appCompatTextView4 = ec1Var.r;
                if (appCompatTextView4 != null) {
                    appCompatTextView4.setContentDescription(charSequence);
                }
                int i2 = ec1Var.t;
                ec1Var.t = i2;
                AppCompatTextView appCompatTextView5 = ec1Var.r;
                if (appCompatTextView5 != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    xk3.f(appCompatTextView5, i2);
                }
                ec1Var.r.setVisibility(4);
                ec1Var.a(ec1Var.r, 0);
            } else {
                ec1Var.f();
                ec1Var.g(ec1Var.r, 0);
                ec1Var.r = null;
                textInputLayout.r();
                textInputLayout.x();
            }
            ec1Var.q = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        pr0 pr0Var = this.c;
        pr0Var.i(i != 0 ? ew3.P0(pr0Var.getContext(), i) : null);
        m20.Q0(pr0Var.f3903a, pr0Var.c, pr0Var.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        pr0 pr0Var = this.c;
        CheckableImageButton checkableImageButton = pr0Var.c;
        View.OnLongClickListener onLongClickListener = pr0Var.f;
        checkableImageButton.setOnClickListener(onClickListener);
        m20.V0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        pr0 pr0Var = this.c;
        pr0Var.f = onLongClickListener;
        CheckableImageButton checkableImageButton = pr0Var.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m20.V0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        pr0 pr0Var = this.c;
        if (pr0Var.d != colorStateList) {
            pr0Var.d = colorStateList;
            m20.K(pr0Var.f3903a, pr0Var.c, colorStateList, pr0Var.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        pr0 pr0Var = this.c;
        if (pr0Var.e != mode) {
            pr0Var.e = mode;
            m20.K(pr0Var.f3903a, pr0Var.c, pr0Var.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        ec1 ec1Var = this.j;
        ec1Var.u = i;
        AppCompatTextView appCompatTextView = ec1Var.r;
        if (appCompatTextView != null) {
            ec1Var.h.l(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        ec1 ec1Var = this.j;
        ec1Var.v = colorStateList;
        AppCompatTextView appCompatTextView = ec1Var.r;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.H0 != z) {
            this.H0 = z;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        ec1 ec1Var = this.j;
        if (isEmpty) {
            if (ec1Var.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!ec1Var.x) {
            setHelperTextEnabled(true);
        }
        ec1Var.c();
        ec1Var.w = charSequence;
        ec1Var.y.setText(charSequence);
        int i = ec1Var.n;
        if (i != 2) {
            ec1Var.o = 2;
        }
        ec1Var.i(i, ec1Var.o, ec1Var.h(ec1Var.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        ec1 ec1Var = this.j;
        ec1Var.A = colorStateList;
        AppCompatTextView appCompatTextView = ec1Var.y;
        if (appCompatTextView != null && colorStateList != null) {
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        ec1 ec1Var = this.j;
        if (ec1Var.x != z) {
            ec1Var.c();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(ec1Var.g, null);
                ec1Var.y = appCompatTextView;
                appCompatTextView.setId(xe2.textinput_helper_text);
                ec1Var.y.setTextAlignment(5);
                Typeface typeface = ec1Var.B;
                if (typeface != null) {
                    ec1Var.y.setTypeface(typeface);
                }
                ec1Var.y.setVisibility(4);
                AppCompatTextView appCompatTextView2 = ec1Var.y;
                WeakHashMap weakHashMap = ll3.f3151a;
                xk3.f(appCompatTextView2, 1);
                int i = ec1Var.z;
                ec1Var.z = i;
                AppCompatTextView appCompatTextView3 = ec1Var.y;
                if (appCompatTextView3 != null) {
                    t9.p0(appCompatTextView3, i);
                }
                ColorStateList colorStateList = ec1Var.A;
                ec1Var.A = colorStateList;
                AppCompatTextView appCompatTextView4 = ec1Var.y;
                if (appCompatTextView4 != null && colorStateList != null) {
                    appCompatTextView4.setTextColor(colorStateList);
                }
                ec1Var.a(ec1Var.y, 1);
                ec1Var.y.setAccessibilityDelegate(new dc1(ec1Var));
            } else {
                ec1Var.c();
                int i2 = ec1Var.n;
                if (i2 == 2) {
                    ec1Var.o = 0;
                }
                ec1Var.i(i2, ec1Var.o, ec1Var.h(ec1Var.y, ""));
                ec1Var.g(ec1Var.y, 1);
                ec1Var.y = null;
                TextInputLayout textInputLayout = ec1Var.h;
                textInputLayout.r();
                textInputLayout.x();
            }
            ec1Var.x = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        ec1 ec1Var = this.j;
        ec1Var.z = i;
        AppCompatTextView appCompatTextView = ec1Var.y;
        if (appCompatTextView != null) {
            t9.p0(appCompatTextView, i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.I0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (!z) {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.d.getHint())) {
                    this.d.setHint(this.D);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.d.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        x10 x10Var = this.G0;
        View view = x10Var.f5104a;
        s63 s63Var = new s63(view.getContext(), i);
        ColorStateList colorStateList = s63Var.j;
        if (colorStateList != null) {
            x10Var.k = colorStateList;
        }
        float f = s63Var.k;
        if (f != 0.0f) {
            x10Var.i = f;
        }
        ColorStateList colorStateList2 = s63Var.f4281a;
        if (colorStateList2 != null) {
            x10Var.U = colorStateList2;
        }
        x10Var.S = s63Var.e;
        x10Var.T = s63Var.f;
        x10Var.R = s63Var.g;
        x10Var.V = s63Var.i;
        su suVar = x10Var.y;
        if (suVar != null) {
            suVar.n = true;
        }
        v51 v51Var = new v51(x10Var, 29);
        s63Var.a();
        x10Var.y = new su(v51Var, s63Var.n);
        s63Var.c(view.getContext(), x10Var.y);
        x10Var.h(false);
        this.v0 = x10Var.k;
        if (this.d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            if (this.u0 == null) {
                x10 x10Var = this.G0;
                if (x10Var.k != colorStateList) {
                    x10Var.k = colorStateList;
                    x10Var.h(false);
                }
            }
            this.v0 = colorStateList;
            if (this.d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(g73 g73Var) {
        this.n = g73Var;
    }

    public void setMaxEms(int i) {
        this.g = i;
        EditText editText = this.d;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.d;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f = i;
        EditText editText = this.d;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.h = i;
        EditText editText = this.d;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        pr0 pr0Var = this.c;
        pr0Var.g.setContentDescription(i != 0 ? pr0Var.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        pr0 pr0Var = this.c;
        pr0Var.g.setImageDrawable(i != 0 ? ew3.P0(pr0Var.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        pr0 pr0Var = this.c;
        if (z && pr0Var.i != 1) {
            pr0Var.g(1);
        } else if (!z) {
            pr0Var.g(0);
        } else {
            pr0Var.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        pr0 pr0Var = this.c;
        pr0Var.k = colorStateList;
        m20.K(pr0Var.f3903a, pr0Var.g, colorStateList, pr0Var.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        pr0 pr0Var = this.c;
        pr0Var.l = mode;
        m20.K(pr0Var.f3903a, pr0Var.g, pr0Var.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
            this.t = appCompatTextView;
            appCompatTextView.setId(xe2.textinput_placeholder);
            AppCompatTextView appCompatTextView2 = this.t;
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.s(appCompatTextView2, 2);
            ov0 d = d();
            this.w = d;
            d.f3818b = 67L;
            this.x = d();
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        }
        EditText editText = this.d;
        if (editText != null) {
            editable = editText.getText();
        }
        v(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        AppCompatTextView appCompatTextView = this.t;
        if (appCompatTextView != null) {
            t9.p0(appCompatTextView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            AppCompatTextView appCompatTextView = this.t;
            if (appCompatTextView != null && colorStateList != null) {
                appCompatTextView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        u03 u03Var = this.f1561b;
        u03Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        u03Var.c = charSequence2;
        u03Var.f4610b.setText(charSequence);
        u03Var.e();
    }

    public void setPrefixTextAppearance(int i) {
        t9.p0(this.f1561b.f4610b, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f1561b.f4610b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(fs2 fs2Var) {
        fr1 fr1Var = this.F;
        if (fr1Var != null && fr1Var.f2139a.f1978a != fs2Var) {
            this.L = fs2Var;
            b();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.f1561b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f1561b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? ew3.P0(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        u03 u03Var = this.f1561b;
        if (i >= 0) {
            if (i != u03Var.g) {
                u03Var.g = i;
                CheckableImageButton checkableImageButton = u03Var.d;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        u03Var.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        u03 u03Var = this.f1561b;
        View.OnLongClickListener onLongClickListener = u03Var.i;
        CheckableImageButton checkableImageButton = u03Var.d;
        checkableImageButton.setOnClickListener(onClickListener);
        m20.V0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        u03 u03Var = this.f1561b;
        u03Var.i = onLongClickListener;
        CheckableImageButton checkableImageButton = u03Var.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m20.V0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        u03 u03Var = this.f1561b;
        u03Var.h = scaleType;
        u03Var.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        u03 u03Var = this.f1561b;
        if (u03Var.e != colorStateList) {
            u03Var.e = colorStateList;
            m20.K(u03Var.f4609a, u03Var.d, colorStateList, u03Var.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        u03 u03Var = this.f1561b;
        if (u03Var.f != mode) {
            u03Var.f = mode;
            m20.K(u03Var.f4609a, u03Var.d, u03Var.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f1561b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        pr0 pr0Var = this.c;
        pr0Var.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        pr0Var.p = charSequence2;
        pr0Var.q.setText(charSequence);
        pr0Var.n();
    }

    public void setSuffixTextAppearance(int i) {
        t9.p0(this.c.q, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.c.q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(f73 f73Var) {
        EditText editText = this.d;
        if (editText != null) {
            ll3.p(editText, f73Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.n0) {
            this.n0 = typeface;
            this.G0.m(typeface);
            ec1 ec1Var = this.j;
            if (typeface != ec1Var.B) {
                ec1Var.B = typeface;
                AppCompatTextView appCompatTextView = ec1Var.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = ec1Var.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.o;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.O != 1) {
            FrameLayout frameLayout = this.f1560a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c = c();
            if (c != layoutParams.topMargin) {
                layoutParams.topMargin = c;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        ColorStateList colorStateList2;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.d;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.d;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        ColorStateList colorStateList3 = this.u0;
        x10 x10Var = this.G0;
        if (colorStateList3 != null) {
            x10Var.i(colorStateList3);
        }
        Editable editable = null;
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.u0;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.E0);
            } else {
                i = this.E0;
            }
            x10Var.i(ColorStateList.valueOf(i));
        } else if (m()) {
            AppCompatTextView appCompatTextView2 = this.j.r;
            if (appCompatTextView2 != null) {
                colorStateList2 = appCompatTextView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            x10Var.i(colorStateList2);
        } else if (this.m && (appCompatTextView = this.o) != null) {
            x10Var.i(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.v0) != null && x10Var.k != colorStateList) {
            x10Var.k = colorStateList;
            x10Var.h(false);
        }
        pr0 pr0Var = this.c;
        u03 u03Var = this.f1561b;
        if (!z3 && this.H0 && (!isEnabled() || !z4)) {
            if (z2 || !this.F0) {
                ValueAnimator valueAnimator = this.J0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.J0.cancel();
                }
                if (z && this.I0) {
                    a(0.0f);
                } else {
                    x10Var.k(0.0f);
                }
                if (e() && (!((ed0) this.F).x.v.isEmpty()) && e()) {
                    ((ed0) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                this.F0 = true;
                AppCompatTextView appCompatTextView3 = this.t;
                if (appCompatTextView3 != null && this.s) {
                    appCompatTextView3.setText((CharSequence) null);
                    sb3.a(this.f1560a, this.x);
                    this.t.setVisibility(4);
                }
                u03Var.j = true;
                u03Var.e();
                pr0Var.r = true;
                pr0Var.n();
                return;
            }
            return;
        }
        if (z2 || this.F0) {
            ValueAnimator valueAnimator2 = this.J0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.J0.cancel();
            }
            if (z && this.I0) {
                a(1.0f);
            } else {
                x10Var.k(1.0f);
            }
            this.F0 = false;
            if (e()) {
                j();
            }
            EditText editText3 = this.d;
            if (editText3 != null) {
                editable = editText3.getText();
            }
            v(editable);
            u03Var.j = false;
            u03Var.e();
            pr0Var.r = false;
            pr0Var.n();
        }
    }

    public final void v(Editable editable) {
        int i;
        ((ef0) this.n).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.f1560a;
        if (i == 0 && !this.F0) {
            if (this.t != null && this.s && !TextUtils.isEmpty(this.r)) {
                this.t.setText(this.r);
                sb3.a(frameLayout, this.w);
                this.t.setVisibility(0);
                this.t.bringToFront();
                announceForAccessibility(this.r);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView = this.t;
        if (appCompatTextView != null && this.s) {
            appCompatTextView.setText((CharSequence) null);
            sb3.a(frameLayout, this.x);
            this.t.setVisibility(4);
        }
    }

    public final void w(boolean z, boolean z2) {
        int defaultColor = this.z0.getDefaultColor();
        int colorForState = this.z0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.z0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.i0 = colorForState2;
        } else if (z2) {
            this.i0 = colorForState;
        } else {
            this.i0 = defaultColor;
        }
    }

    public final void x() {
        boolean z;
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.F != null && this.O != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.d) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.d) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.i0 = this.E0;
            } else if (m()) {
                if (this.z0 != null) {
                    w(z, z2);
                } else {
                    this.i0 = getErrorCurrentTextColors();
                }
            } else if (this.m && (appCompatTextView = this.o) != null) {
                if (this.z0 != null) {
                    w(z, z2);
                } else {
                    this.i0 = appCompatTextView.getCurrentTextColor();
                }
            } else if (z) {
                this.i0 = this.y0;
            } else if (z2) {
                this.i0 = this.x0;
            } else {
                this.i0 = this.w0;
            }
            if (Build.VERSION.SDK_INT >= 29) {
                p();
            }
            pr0 pr0Var = this.c;
            pr0Var.l();
            CheckableImageButton checkableImageButton = pr0Var.c;
            ColorStateList colorStateList = pr0Var.d;
            TextInputLayout textInputLayout = pr0Var.f3903a;
            m20.Q0(textInputLayout, checkableImageButton, colorStateList);
            ColorStateList colorStateList2 = pr0Var.k;
            CheckableImageButton checkableImageButton2 = pr0Var.g;
            m20.Q0(textInputLayout, checkableImageButton2, colorStateList2);
            if (pr0Var.b() instanceof lo0) {
                if (textInputLayout.m() && checkableImageButton2.getDrawable() != null) {
                    Drawable mutate = t9.L0(checkableImageButton2.getDrawable()).mutate();
                    bn0.g(mutate, textInputLayout.getErrorCurrentTextColors());
                    checkableImageButton2.setImageDrawable(mutate);
                } else {
                    m20.K(textInputLayout, checkableImageButton2, pr0Var.k, pr0Var.l);
                }
            }
            u03 u03Var = this.f1561b;
            m20.Q0(u03Var.f4609a, u03Var.d, u03Var.e);
            if (this.O == 2) {
                int i = this.Q;
                if (z && isEnabled()) {
                    this.Q = this.h0;
                } else {
                    this.Q = this.R;
                }
                if (this.Q != i && e() && !this.F0) {
                    if (e()) {
                        ((ed0) this.F).n(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                    j();
                }
            }
            if (this.O == 1) {
                if (!isEnabled()) {
                    this.j0 = this.B0;
                } else if (z2 && !z) {
                    this.j0 = this.D0;
                } else if (z) {
                    this.j0 = this.C0;
                } else {
                    this.j0 = this.A0;
                }
            }
            b();
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f1561b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        pr0 pr0Var = this.c;
        CheckableImageButton checkableImageButton = pr0Var.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pr0Var.k;
            PorterDuff.Mode mode = pr0Var.l;
            TextInputLayout textInputLayout = pr0Var.f3903a;
            m20.K(textInputLayout, checkableImageButton, colorStateList, mode);
            m20.Q0(textInputLayout, checkableImageButton, pr0Var.k);
        }
    }
}
