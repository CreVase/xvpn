package defpackage;

import android.text.Spannable;
import android.text.SpannableString;

/* loaded from: classes.dex */
public final class nq0 implements oq0 {

    /* renamed from: a, reason: collision with root package name */
    public sh3 f3517a;

    /* renamed from: b, reason: collision with root package name */
    public final s71 f3518b;

    public nq0(sh3 sh3Var, s71 s71Var) {
        this.f3517a = sh3Var;
        this.f3518b = s71Var;
    }

    @Override // defpackage.oq0
    public final Object a() {
        return this.f3517a;
    }

    @Override // defpackage.oq0
    public final boolean b(CharSequence charSequence, int i, int i2, rf3 rf3Var) {
        boolean z;
        Spannable spannableString;
        if ((rf3Var.c & 4) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f3517a == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.f3517a = new sh3(spannableString);
        }
        this.f3518b.getClass();
        this.f3517a.setSpan(new sf3(rf3Var), i, i2, 33);
        return true;
    }
}
