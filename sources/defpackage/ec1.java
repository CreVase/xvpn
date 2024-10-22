package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class ec1 {
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f1913a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1914b;
    public final int c;
    public final TimeInterpolator d;
    public final TimeInterpolator e;
    public final TimeInterpolator f;
    public final Context g;
    public final TextInputLayout h;
    public LinearLayout i;
    public int j;
    public FrameLayout k;
    public Animator l;
    public final float m;
    public int n;
    public int o;
    public CharSequence p;
    public boolean q;
    public AppCompatTextView r;
    public CharSequence s;
    public int t;
    public int u;
    public ColorStateList v;
    public CharSequence w;
    public boolean x;
    public AppCompatTextView y;
    public int z;

    public ec1(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.g = context;
        this.h = textInputLayout;
        this.m = context.getResources().getDimensionPixelSize(re2.design_textinput_caption_translate_y);
        int i = he2.motionDurationShort4;
        this.f1913a = zf3.c0(context, i, 217);
        this.f1914b = zf3.c0(context, he2.motionDurationMedium4, 167);
        this.c = zf3.c0(context, i, 167);
        int i2 = he2.motionEasingEmphasizedDecelerateInterpolator;
        this.d = zf3.d0(context, i2, pb.d);
        LinearInterpolator linearInterpolator = pb.f3811a;
        this.e = zf3.d0(context, i2, linearInterpolator);
        this.f = zf3.d0(context, he2.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(TextView textView, int i) {
        boolean z;
        if (this.i == null && this.k == null) {
            Context context = this.g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.k = new FrameLayout(context);
            this.i.addView(this.k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i != 0 && i != 1) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.k.setVisibility(0);
            this.k.addView(textView);
        } else {
            this.i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.j++;
    }

    public final void b() {
        boolean z;
        LinearLayout linearLayout = this.i;
        TextInputLayout textInputLayout = this.h;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.g;
            boolean y0 = m20.y0(context);
            LinearLayout linearLayout2 = this.i;
            int i = re2.material_helper_text_font_1_3_padding_horizontal;
            WeakHashMap weakHashMap = ll3.f3151a;
            int f = vk3.f(editText);
            if (y0) {
                f = context.getResources().getDimensionPixelSize(i);
            }
            int i2 = re2.material_helper_text_font_1_3_padding_top;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(re2.material_helper_text_default_padding_top);
            if (y0) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(i2);
            }
            int e = vk3.e(editText);
            if (y0) {
                e = context.getResources().getDimensionPixelSize(i);
            }
            vk3.k(linearLayout2, f, dimensionPixelSize, e, 0);
        }
    }

    public final void c() {
        Animator animator = this.l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        boolean z3;
        float f;
        int i4;
        TimeInterpolator timeInterpolator;
        boolean z4;
        if (textView != null && z) {
            if (i != i3 && i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (i3 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, f);
                int i5 = this.c;
                if (z3) {
                    i4 = this.f1914b;
                } else {
                    i4 = i5;
                }
                ofFloat.setDuration(i4);
                if (z3) {
                    timeInterpolator = this.e;
                } else {
                    timeInterpolator = this.f;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    ofFloat.setStartDelay(i5);
                }
                arrayList.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.m, 0.0f);
                    ofFloat2.setDuration(this.f1913a);
                    ofFloat2.setInterpolator(this.d);
                    ofFloat2.setStartDelay(i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final TextView e(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.y;
        }
        return this.r;
    }

    public final void f() {
        this.p = null;
        c();
        if (this.n == 1) {
            if (this.x && !TextUtils.isEmpty(this.w)) {
                this.o = 2;
            } else {
                this.o = 0;
            }
        }
        i(this.n, this.o, h(this.r, ""));
    }

    public final void g(TextView textView, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z && (frameLayout = this.k) != null) {
            frameLayout.removeView(textView);
        } else {
            linearLayout.removeView(textView);
        }
        int i2 = this.j - 1;
        this.j = i2;
        LinearLayout linearLayout2 = this.i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = ll3.f3151a;
        TextInputLayout textInputLayout = this.h;
        if (xk3.c(textInputLayout) && textInputLayout.isEnabled() && (this.o != this.n || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }

    public final void i(int i, int i2, boolean z) {
        TextView e;
        TextView e2;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.x, this.y, 2, i, i2);
            d(arrayList, this.q, this.r, 1, i, i2);
            cp3.I(animatorSet, arrayList);
            animatorSet.addListener(new cc1(this, i2, e(i), i, e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (e2 = e(i2)) != null) {
                e2.setVisibility(0);
                e2.setAlpha(1.0f);
            }
            if (i != 0 && (e = e(i)) != null) {
                e.setVisibility(4);
                if (i == 1) {
                    e.setText((CharSequence) null);
                }
            }
            this.n = i2;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z, false);
        textInputLayout.x();
    }
}
