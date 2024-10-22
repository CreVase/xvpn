package defpackage;

import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;

/* loaded from: classes2.dex */
public final class j73 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2717a;

    /* renamed from: b, reason: collision with root package name */
    public final CharacterStyle f2718b;

    public j73(String str, ClickableSpan clickableSpan) {
        this.f2717a = str;
        this.f2718b = clickableSpan;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j73)) {
            return false;
        }
        j73 j73Var = (j73) obj;
        return m20.L(this.f2717a, j73Var.f2717a) && m20.L(this.f2718b, j73Var.f2718b);
    }

    public final int hashCode() {
        return this.f2718b.hashCode() + (this.f2717a.hashCode() * 31);
    }

    public final String toString() {
        return "TextStyleKV(text=" + this.f2717a + ", style=" + this.f2718b + ")";
    }
}
