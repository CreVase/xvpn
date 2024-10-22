package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class lo0 extends qr0 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final cr1 i;
    public final t00 j;
    public final z5 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public lo0(pr0 pr0Var) {
        super(pr0Var);
        this.i = new cr1(this, 2);
        this.j = new t00(this, 1);
        this.k = new z5(this, 26);
        this.o = Long.MAX_VALUE;
        Context context = pr0Var.getContext();
        int i = he2.motionDurationShort3;
        this.f = zf3.c0(context, i, 67);
        this.e = zf3.c0(pr0Var.getContext(), i, 50);
        this.g = zf3.d0(pr0Var.getContext(), he2.motionEasingLinearInterpolator, pb.f3811a);
    }

    @Override // defpackage.qr0
    public final void a() {
        boolean z;
        if (this.p.isTouchExplorationEnabled()) {
            if (this.h.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.d.hasFocus()) {
                this.h.dismissDropDown();
            }
        }
        this.h.post(new nw3(this, 23));
    }

    @Override // defpackage.qr0
    public final int c() {
        return mf2.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.qr0
    public final int d() {
        return ue2.mtrl_dropdown_arrow;
    }

    @Override // defpackage.qr0
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.qr0
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.qr0
    public final o2 h() {
        return this.k;
    }

    @Override // defpackage.qr0
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.qr0
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.qr0
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.qr0
    public final void m(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            boolean z = false;
            autoCompleteTextView.setOnTouchListener(new jo0(this, 0));
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ko0
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    lo0 lo0Var = lo0.this;
                    lo0Var.m = true;
                    lo0Var.o = System.currentTimeMillis();
                    lo0Var.t(false);
                }
            });
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.f4044a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() != 0) {
                z = true;
            }
            if (!z && this.p.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = ll3.f3151a;
                uk3.s(this.d, 2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.qr0
    public final void n(g3 g3Var) {
        boolean z;
        boolean e;
        if (this.h.getInputType() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            g3Var.i(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            e = g3Var.f2195a.isShowingHintText();
        } else {
            e = g3Var.e(4);
        }
        if (e) {
            g3Var.j(null);
        }
    }

    @Override // defpackage.qr0
    public final void o(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.p.isEnabled()) {
            boolean z2 = false;
            if (this.h.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (accessibilityEvent.getEventType() == 32768 && this.n && !this.h.isPopupShowing()) {
                    z2 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z2) {
                    u();
                    this.m = true;
                    this.o = System.currentTimeMillis();
                }
            }
        }
    }

    @Override // defpackage.qr0
    public final void r() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        int i = 0;
        ofFloat.addUpdateListener(new io0(this, i));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new io0(this, i));
        this.q = ofFloat2;
        ofFloat2.addListener(new o4(this, 6));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.qr0
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        boolean z;
        if (this.h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.o;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.m = false;
        }
        if (!this.m) {
            t(!this.n);
            if (this.n) {
                this.h.requestFocus();
                this.h.showDropDown();
                return;
            } else {
                this.h.dismissDropDown();
                return;
            }
        }
        this.m = false;
    }
}
