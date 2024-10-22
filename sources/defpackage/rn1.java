package defpackage;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class rn1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4184a;

    /* renamed from: b, reason: collision with root package name */
    public final LocusId f4185b;

    public rn1(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4184a = str;
            if (Build.VERSION.SDK_INT >= 29) {
                this.f4185b = qn1.a(str);
                return;
            } else {
                this.f4185b = null;
                return;
            }
        }
        throw new IllegalArgumentException("id cannot be empty");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rn1.class != obj.getClass()) {
            return false;
        }
        String str = ((rn1) obj).f4184a;
        String str2 = this.f4184a;
        if (str2 == null) {
            if (str == null) {
                return true;
            }
            return false;
        }
        return str2.equals(str);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f4184a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocusIdCompat[");
        sb.append(this.f4184a.length() + "_chars");
        sb.append("]");
        return sb.toString();
    }
}
