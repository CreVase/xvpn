package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ii2 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f2604a;

    public ii2(String str) {
        this.f2604a = Pattern.compile(str);
    }

    public final boolean a(CharSequence charSequence) {
        return this.f2604a.matcher(charSequence).matches();
    }

    public final String toString() {
        return this.f2604a.toString();
    }
}
