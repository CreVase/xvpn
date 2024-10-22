package defpackage;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class fk2 {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f2103a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources.Theme f2104b;

    public fk2(Resources resources, Resources.Theme theme) {
        this.f2103a = resources;
        this.f2104b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fk2.class != obj.getClass()) {
            return false;
        }
        fk2 fk2Var = (fk2) obj;
        if (this.f2103a.equals(fk2Var.f2103a) && w12.a(this.f2104b, fk2Var.f2104b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return w12.b(this.f2103a, this.f2104b);
    }
}
