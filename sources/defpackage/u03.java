package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class u03 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4609a;

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f4610b;
    public CharSequence c;
    public final CheckableImageButton d;
    public ColorStateList e;
    public PorterDuff.Mode f;
    public int g;
    public ImageView.ScaleType h;
    public View.OnLongClickListener i;
    public boolean j;

    public u03(TextInputLayout textInputLayout, go2 go2Var) {
        super(textInputLayout.getContext());
        CharSequence k;
        this.f4609a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(jf2.design_text_input_start_icon, (ViewGroup) this, false);
        this.d = checkableImageButton;
        m20.T0(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.f4610b = appCompatTextView;
        if (m20.y0(getContext())) {
            kq1.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        m20.V0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        m20.V0(checkableImageButton, null);
        int i = bg2.TextInputLayout_startIconTint;
        if (go2Var.l(i)) {
            this.e = m20.i0(getContext(), go2Var, i);
        }
        int i2 = bg2.TextInputLayout_startIconTintMode;
        if (go2Var.l(i2)) {
            this.f = cp3.H(go2Var.h(i2, -1), null);
        }
        int i3 = bg2.TextInputLayout_startIconDrawable;
        if (go2Var.l(i3)) {
            b(go2Var.e(i3));
            int i4 = bg2.TextInputLayout_startIconContentDescription;
            if (go2Var.l(i4) && checkableImageButton.getContentDescription() != (k = go2Var.k(i4))) {
                checkableImageButton.setContentDescription(k);
            }
            checkableImageButton.setCheckable(go2Var.a(bg2.TextInputLayout_startIconCheckable, true));
        }
        int d = go2Var.d(bg2.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(re2.mtrl_min_touch_target_size));
        if (d >= 0) {
            if (d != this.g) {
                this.g = d;
                checkableImageButton.setMinimumWidth(d);
                checkableImageButton.setMinimumHeight(d);
            }
            int i5 = bg2.TextInputLayout_startIconScaleType;
            if (go2Var.l(i5)) {
                ImageView.ScaleType Y = m20.Y(go2Var.h(i5, -1));
                this.h = Y;
                checkableImageButton.setScaleType(Y);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(xe2.textinput_prefix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = ll3.f3151a;
            xk3.f(appCompatTextView, 1);
            t9.p0(appCompatTextView, go2Var.i(bg2.TextInputLayout_prefixTextAppearance, 0));
            int i6 = bg2.TextInputLayout_prefixTextColor;
            if (go2Var.l(i6)) {
                appCompatTextView.setTextColor(go2Var.b(i6));
            }
            CharSequence k2 = go2Var.k(bg2.TextInputLayout_prefixText);
            this.c = TextUtils.isEmpty(k2) ? null : k2;
            appCompatTextView.setText(k2);
            e();
            addView(checkableImageButton);
            addView(appCompatTextView);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int a() {
        boolean z;
        CheckableImageButton checkableImageButton = this.d;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = kq1.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        return vk3.f(this.f4610b) + vk3.f(this) + i;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            PorterDuff.Mode mode = this.f;
            TextInputLayout textInputLayout = this.f4609a;
            m20.K(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            m20.Q0(textInputLayout, checkableImageButton, this.e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.i;
        checkableImageButton.setOnClickListener(null);
        m20.V0(checkableImageButton, onLongClickListener);
        this.i = null;
        checkableImageButton.setOnLongClickListener(null);
        m20.V0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z) {
        boolean z2;
        CheckableImageButton checkableImageButton = this.d;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            d();
            e();
        }
    }

    public final void d() {
        boolean z;
        EditText editText = this.f4609a.d;
        if (editText == null) {
            return;
        }
        int i = 0;
        if (this.d.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            WeakHashMap weakHashMap = ll3.f3151a;
            i = vk3.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(re2.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = ll3.f3151a;
        vk3.k(this.f4610b, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i;
        boolean z;
        int i2 = 0;
        if (this.c != null && !this.j) {
            i = 0;
        } else {
            i = 8;
        }
        if (this.d.getVisibility() != 0 && i != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            i2 = 8;
        }
        setVisibility(i2);
        this.f4610b.setVisibility(i);
        this.f4609a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }
}
