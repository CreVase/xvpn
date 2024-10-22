package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class pr0 extends LinearLayout {
    public static final /* synthetic */ int w = 0;

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f3903a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f3904b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final nd1 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public o2 u;
    public final nr0 v;

    public pr0(TextInputLayout textInputLayout, go2 go2Var) {
        super(textInputLayout.getContext());
        CharSequence k;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new nr0(this);
        or0 or0Var = new or0(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f3903a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f3904b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, xe2.text_input_error_icon);
        this.c = a2;
        CheckableImageButton a3 = a(frameLayout, from, xe2.text_input_end_icon);
        this.g = a3;
        this.h = new nd1(this, go2Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.q = appCompatTextView;
        int i = bg2.TextInputLayout_errorIconTint;
        if (go2Var.l(i)) {
            this.d = m20.i0(getContext(), go2Var, i);
        }
        int i2 = bg2.TextInputLayout_errorIconTintMode;
        if (go2Var.l(i2)) {
            this.e = cp3.H(go2Var.h(i2, -1), null);
        }
        int i3 = bg2.TextInputLayout_errorIconDrawable;
        if (go2Var.l(i3)) {
            i(go2Var.e(i3));
        }
        a2.setContentDescription(getResources().getText(mf2.error_icon_content_description));
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.s(a2, 2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        int i4 = bg2.TextInputLayout_passwordToggleEnabled;
        if (!go2Var.l(i4)) {
            int i5 = bg2.TextInputLayout_endIconTint;
            if (go2Var.l(i5)) {
                this.k = m20.i0(getContext(), go2Var, i5);
            }
            int i6 = bg2.TextInputLayout_endIconTintMode;
            if (go2Var.l(i6)) {
                this.l = cp3.H(go2Var.h(i6, -1), null);
            }
        }
        int i7 = bg2.TextInputLayout_endIconMode;
        if (go2Var.l(i7)) {
            g(go2Var.h(i7, 0));
            int i8 = bg2.TextInputLayout_endIconContentDescription;
            if (go2Var.l(i8) && a3.getContentDescription() != (k = go2Var.k(i8))) {
                a3.setContentDescription(k);
            }
            a3.setCheckable(go2Var.a(bg2.TextInputLayout_endIconCheckable, true));
        } else if (go2Var.l(i4)) {
            int i9 = bg2.TextInputLayout_passwordToggleTint;
            if (go2Var.l(i9)) {
                this.k = m20.i0(getContext(), go2Var, i9);
            }
            int i10 = bg2.TextInputLayout_passwordToggleTintMode;
            if (go2Var.l(i10)) {
                this.l = cp3.H(go2Var.h(i10, -1), null);
            }
            g(go2Var.a(i4, false) ? 1 : 0);
            CharSequence k2 = go2Var.k(bg2.TextInputLayout_passwordToggleContentDescription);
            if (a3.getContentDescription() != k2) {
                a3.setContentDescription(k2);
            }
        }
        int d = go2Var.d(bg2.TextInputLayout_endIconMinSize, getResources().getDimensionPixelSize(re2.mtrl_min_touch_target_size));
        if (d >= 0) {
            if (d != this.m) {
                this.m = d;
                a3.setMinimumWidth(d);
                a3.setMinimumHeight(d);
                a2.setMinimumWidth(d);
                a2.setMinimumHeight(d);
            }
            int i11 = bg2.TextInputLayout_endIconScaleType;
            if (go2Var.l(i11)) {
                ImageView.ScaleType Y = m20.Y(go2Var.h(i11, -1));
                this.n = Y;
                a3.setScaleType(Y);
                a2.setScaleType(Y);
            }
            appCompatTextView.setVisibility(8);
            appCompatTextView.setId(xe2.textinput_suffix_text);
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
            xk3.f(appCompatTextView, 1);
            t9.p0(appCompatTextView, go2Var.i(bg2.TextInputLayout_suffixTextAppearance, 0));
            int i12 = bg2.TextInputLayout_suffixTextColor;
            if (go2Var.l(i12)) {
                appCompatTextView.setTextColor(go2Var.b(i12));
            }
            CharSequence k3 = go2Var.k(bg2.TextInputLayout_suffixText);
            this.p = TextUtils.isEmpty(k3) ? null : k3;
            appCompatTextView.setText(k3);
            n();
            frameLayout.addView(a3);
            addView(appCompatTextView);
            addView(frameLayout);
            addView(a2);
            textInputLayout.q0.add(or0Var);
            if (textInputLayout.d != null) {
                or0Var.a(textInputLayout);
            }
            addOnAttachStateChangeListener(new cv(this, 2));
            return;
        }
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(jf2.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        m20.T0(checkableImageButton);
        if (m20.y0(getContext())) {
            kq1.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final qr0 b() {
        int i = this.i;
        nd1 nd1Var = this.h;
        qr0 qr0Var = (qr0) ((SparseArray) nd1Var.c).get(i);
        if (qr0Var == null) {
            if (i != -1) {
                int i2 = 1;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                qr0Var = new lo0((pr0) nd1Var.d);
                            } else {
                                throw new IllegalArgumentException(hx2.m("Invalid end icon mode: ", i));
                            }
                        } else {
                            qr0Var = new v00((pr0) nd1Var.d);
                        }
                    } else {
                        qr0Var = new v42((pr0) nd1Var.d, nd1Var.f3443b);
                    }
                } else {
                    qr0Var = new oc0((pr0) nd1Var.d, i2);
                }
            } else {
                qr0Var = new oc0((pr0) nd1Var.d, 0);
            }
            ((SparseArray) nd1Var.c).append(i, qr0Var);
        }
        return qr0Var;
    }

    public final int c() {
        int c;
        if (!d() && !e()) {
            c = 0;
        } else {
            CheckableImageButton checkableImageButton = this.g;
            c = kq1.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        return vk3.e(this.q) + vk3.e(this) + c;
    }

    public final boolean d() {
        if (this.f3904b.getVisibility() == 0 && this.g.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        if (this.c.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean isChecked;
        qr0 b2 = b();
        boolean k = b2.k();
        CheckableImageButton checkableImageButton = this.g;
        boolean z3 = true;
        if (k && (isChecked = checkableImageButton.isChecked()) != b2.l()) {
            checkableImageButton.setChecked(!isChecked);
            z2 = true;
        } else {
            z2 = false;
        }
        if ((b2 instanceof lo0) && (isActivated = checkableImageButton.isActivated()) != b2.j()) {
            checkableImageButton.setActivated(!isActivated);
        } else {
            z3 = z2;
        }
        if (z || z3) {
            m20.Q0(this.f3903a, checkableImageButton, this.k);
        }
    }

    public final void g(int i) {
        boolean z;
        Drawable drawable;
        if (this.i == i) {
            return;
        }
        qr0 b2 = b();
        o2 o2Var = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (o2Var != null && accessibilityManager != null) {
            n2.b(accessibilityManager, o2Var);
        }
        CharSequence charSequence = null;
        this.u = null;
        b2.s();
        this.i = i;
        Iterator it = this.j.iterator();
        if (!it.hasNext()) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            h(z);
            qr0 b3 = b();
            int i2 = this.h.f3442a;
            if (i2 == 0) {
                i2 = b3.d();
            }
            if (i2 != 0) {
                drawable = ew3.P0(getContext(), i2);
            } else {
                drawable = null;
            }
            CheckableImageButton checkableImageButton = this.g;
            checkableImageButton.setImageDrawable(drawable);
            TextInputLayout textInputLayout = this.f3903a;
            if (drawable != null) {
                m20.K(textInputLayout, checkableImageButton, this.k, this.l);
                m20.Q0(textInputLayout, checkableImageButton, this.k);
            }
            int c = b3.c();
            if (c != 0) {
                charSequence = getResources().getText(c);
            }
            if (checkableImageButton.getContentDescription() != charSequence) {
                checkableImageButton.setContentDescription(charSequence);
            }
            checkableImageButton.setCheckable(b3.k());
            if (b3.i(textInputLayout.getBoxBackgroundMode())) {
                b3.r();
                o2 h = b3.h();
                this.u = h;
                if (h != null && accessibilityManager != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (xk3.b(this)) {
                        n2.a(accessibilityManager, this.u);
                    }
                }
                View.OnClickListener f = b3.f();
                View.OnLongClickListener onLongClickListener = this.o;
                checkableImageButton.setOnClickListener(f);
                m20.V0(checkableImageButton, onLongClickListener);
                EditText editText = this.s;
                if (editText != null) {
                    b3.m(editText);
                    j(b3);
                }
                m20.K(textInputLayout, checkableImageButton, this.k, this.l);
                f(true);
                return;
            }
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        p71.C(it.next());
        throw null;
    }

    public final void h(boolean z) {
        int i;
        if (d() != z) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            this.g.setVisibility(i);
            k();
            m();
            this.f3903a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        m20.K(this.f3903a, checkableImageButton, this.d, this.e);
    }

    public final void j(qr0 qr0Var) {
        if (this.s == null) {
            return;
        }
        if (qr0Var.e() != null) {
            this.s.setOnFocusChangeListener(qr0Var.e());
        }
        if (qr0Var.g() != null) {
            this.g.setOnFocusChangeListener(qr0Var.g());
        }
    }

    public final void k() {
        int i;
        char c;
        boolean z;
        int i2 = 8;
        if (this.g.getVisibility() == 0 && !e()) {
            i = 0;
        } else {
            i = 8;
        }
        this.f3904b.setVisibility(i);
        if (this.p != null && !this.r) {
            c = 0;
        } else {
            c = '\b';
        }
        if (!d() && !e() && c != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
    }

    public final void l() {
        boolean z;
        int i;
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        boolean z2 = true;
        TextInputLayout textInputLayout = this.f3903a;
        if (drawable != null && textInputLayout.j.q && textInputLayout.m()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        k();
        m();
        if (this.i == 0) {
            z2 = false;
        }
        if (!z2) {
            textInputLayout.q();
        }
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f3903a;
        if (textInputLayout.d == null) {
            return;
        }
        if (!d() && !e()) {
            EditText editText = textInputLayout.d;
            WeakHashMap weakHashMap = ll3.f3151a;
            i = vk3.e(editText);
        } else {
            i = 0;
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(re2.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.d.getPaddingTop();
        int paddingBottom = textInputLayout.d.getPaddingBottom();
        WeakHashMap weakHashMap2 = ll3.f3151a;
        vk3.k(this.q, dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        int i;
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        boolean z = false;
        if (this.p != null && !this.r) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            qr0 b2 = b();
            if (i == 0) {
                z = true;
            }
            b2.p(z);
        }
        k();
        appCompatTextView.setVisibility(i);
        this.f3903a.q();
    }
}
