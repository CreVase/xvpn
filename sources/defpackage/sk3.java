package defpackage;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public abstract class sk3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4360a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f4361b;
    public final int c;
    public final int d;

    public sk3(int i, Class cls, int i2, int i3) {
        this.f4360a = i;
        this.f4361b = cls;
        this.d = i2;
        this.c = i3;
    }

    public static boolean a(Boolean bool, Boolean bool2) {
        boolean z;
        boolean z2;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        if (bool2 != null && bool2.booleanValue()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final Object b(View view) {
        boolean z;
        if (Build.VERSION.SDK_INT >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            qk3 qk3Var = (qk3) this;
            int i = qk3Var.e;
            switch (i) {
                case 0:
                    return qk3Var.d(view);
                case 1:
                    switch (i) {
                        case 1:
                            return el3.b(view);
                        default:
                            return gl3.b(view);
                    }
                case 2:
                    switch (i) {
                        case 1:
                            return el3.b(view);
                        default:
                            return gl3.b(view);
                    }
                default:
                    return qk3Var.d(view);
            }
        }
        Object tag = view.getTag(this.f4360a);
        if (this.f4361b.isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public final void c(View view, Object obj) {
        boolean z;
        boolean a2;
        l2 l2Var;
        if (Build.VERSION.SDK_INT >= this.c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i = ((qk3) this).e;
            switch (i) {
                case 0:
                    Boolean bool = (Boolean) obj;
                    switch (i) {
                        case 0:
                            el3.j(view, bool.booleanValue());
                            return;
                        default:
                            el3.g(view, bool.booleanValue());
                            return;
                    }
                case 1:
                    CharSequence charSequence = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            el3.h(view, charSequence);
                            return;
                        default:
                            gl3.f(view, charSequence);
                            return;
                    }
                case 2:
                    CharSequence charSequence2 = (CharSequence) obj;
                    switch (i) {
                        case 1:
                            el3.h(view, charSequence2);
                            return;
                        default:
                            gl3.f(view, charSequence2);
                            return;
                    }
                default:
                    Boolean bool2 = (Boolean) obj;
                    switch (i) {
                        case 0:
                            el3.j(view, bool2.booleanValue());
                            return;
                        default:
                            el3.g(view, bool2.booleanValue());
                            return;
                    }
            }
        }
        Object b2 = b(view);
        int i2 = ((qk3) this).e;
        switch (i2) {
            case 0:
                Boolean bool3 = (Boolean) b2;
                Boolean bool4 = (Boolean) obj;
                switch (i2) {
                    case 0:
                        a2 = a(bool3, bool4);
                        break;
                    default:
                        a2 = a(bool3, bool4);
                        break;
                }
            case 1:
                CharSequence charSequence3 = (CharSequence) b2;
                CharSequence charSequence4 = (CharSequence) obj;
                switch (i2) {
                    case 1:
                        a2 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                    default:
                        a2 = TextUtils.equals(charSequence3, charSequence4);
                        break;
                }
            case 2:
                CharSequence charSequence5 = (CharSequence) b2;
                CharSequence charSequence6 = (CharSequence) obj;
                switch (i2) {
                    case 1:
                        a2 = TextUtils.equals(charSequence5, charSequence6);
                        break;
                    default:
                        a2 = TextUtils.equals(charSequence5, charSequence6);
                        break;
                }
            default:
                Boolean bool5 = (Boolean) b2;
                Boolean bool6 = (Boolean) obj;
                switch (i2) {
                    case 0:
                        a2 = a(bool5, bool6);
                        break;
                    default:
                        a2 = a(bool5, bool6);
                        break;
                }
        }
        if (!a2) {
            View.AccessibilityDelegate c = ll3.c(view);
            if (c == null) {
                l2Var = null;
            } else if (c instanceof j2) {
                l2Var = ((j2) c).f2689a;
            } else {
                l2Var = new l2(c);
            }
            if (l2Var == null) {
                l2Var = new l2();
            }
            ll3.p(view, l2Var);
            view.setTag(this.f4360a, obj);
            ll3.i(view, this.d);
        }
    }
}
