package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q7 implements bs {
    public static final String i = wi3.z(0);
    public static final String j = wi3.z(1);
    public static final String k = wi3.z(2);
    public static final String l = wi3.z(3);
    public static final String m = wi3.z(4);
    public static final String n = wi3.z(5);
    public static final String o = wi3.z(6);
    public static final String p = wi3.z(7);
    public static final ef0 q = new ef0(8);

    /* renamed from: a, reason: collision with root package name */
    public final long f3963a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3964b;
    public final int c;
    public final Uri[] d;
    public final int[] e;
    public final long[] f;
    public final long g;
    public final boolean h;

    public q7(long j2, int i2, int i3, int[] iArr, Uri[] uriArr, long[] jArr, long j3, boolean z) {
        boolean z2;
        if (iArr.length == uriArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.e(z2);
        this.f3963a = j2;
        this.f3964b = i2;
        this.c = i3;
        this.e = iArr;
        this.d = uriArr;
        this.f = jArr;
        this.g = j3;
        this.h = z;
    }

    public final int a(int i2) {
        int i3;
        int i4 = i2 + 1;
        while (true) {
            int[] iArr = this.e;
            if (i4 >= iArr.length || this.h || (i3 = iArr[i4]) == 0 || i3 == 1) {
                break;
            }
            i4++;
        }
        return i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q7.class != obj.getClass()) {
            return false;
        }
        q7 q7Var = (q7) obj;
        if (this.f3963a == q7Var.f3963a && this.f3964b == q7Var.f3964b && this.c == q7Var.c && Arrays.equals(this.d, q7Var.d) && Arrays.equals(this.e, q7Var.e) && Arrays.equals(this.f, q7Var.f) && this.g == q7Var.g && this.h == q7Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = ((this.f3964b * 31) + this.c) * 31;
        long j2 = this.f3963a;
        int hashCode = (Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.d)) * 31)) * 31)) * 31;
        long j3 = this.g;
        return ((hashCode + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putLong(i, this.f3963a);
        bundle.putInt(j, this.f3964b);
        bundle.putInt(p, this.c);
        bundle.putParcelableArrayList(k, new ArrayList<>(Arrays.asList(this.d)));
        bundle.putIntArray(l, this.e);
        bundle.putLongArray(m, this.f);
        bundle.putLong(n, this.g);
        bundle.putBoolean(o, this.h);
        return bundle;
    }
}
