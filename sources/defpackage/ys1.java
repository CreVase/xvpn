package defpackage;

import android.net.Uri;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ys1 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5381a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5382b;
    public final vs1 c;
    public final List d;
    public final String e;
    public final hb1 f;
    public final Object g;

    public ys1(Uri uri, String str, vs1 vs1Var, List list, String str2, hb1 hb1Var, Object obj) {
        this.f5381a = uri;
        this.f5382b = str;
        this.c = vs1Var;
        this.d = list;
        this.e = str2;
        this.f = hb1Var;
        cb1 k = hb1.k();
        for (int i = 0; i < hb1Var.size(); i++) {
            k.Z(ct1.a(((bt1) hb1Var.get(i)).a()));
        }
        k.b0();
        this.g = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys1)) {
            return false;
        }
        ys1 ys1Var = (ys1) obj;
        if (this.f5381a.equals(ys1Var.f5381a) && wi3.a(this.f5382b, ys1Var.f5382b) && wi3.a(this.c, ys1Var.c) && wi3.a(null, null) && this.d.equals(ys1Var.d) && wi3.a(this.e, ys1Var.e) && this.f.equals(ys1Var.f) && wi3.a(this.g, ys1Var.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = this.f5381a.hashCode() * 31;
        int i = 0;
        String str = this.f5382b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        vs1 vs1Var = this.c;
        if (vs1Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = vs1Var.hashCode();
        }
        int hashCode5 = (this.d.hashCode() + ((((i2 + hashCode2) * 31) + 0) * 31)) * 31;
        String str2 = this.e;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int hashCode6 = (this.f.hashCode() + ((hashCode5 + hashCode3) * 31)) * 31;
        Object obj = this.g;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode6 + i;
    }
}
