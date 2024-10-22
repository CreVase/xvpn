package defpackage;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i80 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f2550a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2551b;

    public i80(boolean z, Uri uri) {
        this.f2550a = uri;
        this.f2551b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i80.class != obj.getClass()) {
            return false;
        }
        i80 i80Var = (i80) obj;
        if (this.f2551b == i80Var.f2551b && this.f2550a.equals(i80Var.f2550a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f2550a.hashCode() * 31) + (this.f2551b ? 1 : 0);
    }
}
