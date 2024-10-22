package defpackage;

import com.google.android.gms.common.internal.Objects;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ca3 {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    public final String f605a;

    /* renamed from: b, reason: collision with root package name */
    public final String f606b;
    public final String c;

    public ca3(String str, String str2) {
        String str3;
        if (str2 != null && str2.startsWith("/topics/")) {
            String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str);
            str3 = str2.substring(8);
        } else {
            str3 = str2;
        }
        if (str3 != null && d.matcher(str3).matches()) {
            this.f605a = str3;
            this.f606b = str;
            this.c = p71.m(str, "!", str2);
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str3, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ca3)) {
            return false;
        }
        ca3 ca3Var = (ca3) obj;
        if (!this.f605a.equals(ca3Var.f605a) || !this.f606b.equals(ca3Var.f606b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f606b, this.f605a);
    }
}
