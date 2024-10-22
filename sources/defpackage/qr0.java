package defpackage;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public abstract class qr0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4044a;

    /* renamed from: b, reason: collision with root package name */
    public final pr0 f4045b;
    public final Context c;
    public final CheckableImageButton d;

    public qr0(pr0 pr0Var) {
        this.f4044a = pr0Var.f3903a;
        this.f4045b = pr0Var;
        this.c = pr0Var.getContext();
        this.d = pr0Var.g;
    }

    public void a() {
    }

    public void b() {
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public o2 h() {
        return null;
    }

    public boolean i(int i) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return this instanceof lo0;
    }

    public boolean l() {
        return false;
    }

    public void m(EditText editText) {
    }

    public void n(g3 g3Var) {
    }

    public void o(AccessibilityEvent accessibilityEvent) {
    }

    public void p(boolean z) {
    }

    public final void q() {
        this.f4045b.f(false);
    }

    public abstract void r();

    public void s() {
    }
}
