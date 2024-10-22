package defpackage;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class va3 implements bs {
    public static final va3 d = new va3(new ua3[0]);
    public static final String e = wi3.z(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f4804a;

    /* renamed from: b, reason: collision with root package name */
    public final ji2 f4805b;
    public int c;

    static {
        new ef0(6);
    }

    public va3(ua3... ua3VarArr) {
        this.f4805b = hb1.m(ua3VarArr);
        this.f4804a = ua3VarArr.length;
        int i = 0;
        while (true) {
            ji2 ji2Var = this.f4805b;
            if (i < ji2Var.size()) {
                int i2 = i + 1;
                for (int i3 = i2; i3 < ji2Var.size(); i3++) {
                    if (((ua3) ji2Var.get(i)).equals(ji2Var.get(i3))) {
                        sn1.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    public final ua3 a(int i) {
        return (ua3) this.f4805b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || va3.class != obj.getClass()) {
            return false;
        }
        va3 va3Var = (va3) obj;
        if (this.f4804a == va3Var.f4804a && this.f4805b.equals(va3Var.f4805b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.f4805b.hashCode();
        }
        return this.c;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(e, cp3.R(this.f4805b));
        return bundle;
    }
}
