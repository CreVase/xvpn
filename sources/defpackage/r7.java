package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class r7 implements bs {
    public static final r7 g = new r7(null, new q7[0], 0, -9223372036854775807L, 0);
    public static final q7 h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final ef0 m;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4110a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4111b;
    public final long c;
    public final long d;
    public final int e;
    public final q7[] f;

    static {
        q7 q7Var = new q7(0L, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        int[] iArr = q7Var.e;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = q7Var.f;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        h = new q7(q7Var.f3963a, 0, q7Var.c, copyOf, (Uri[]) Arrays.copyOf(q7Var.d, 0), copyOf2, q7Var.g, q7Var.h);
        i = wi3.z(1);
        j = wi3.z(2);
        k = wi3.z(3);
        l = wi3.z(4);
        m = new ef0(7);
    }

    public r7(Object obj, q7[] q7VarArr, long j2, long j3, int i2) {
        this.f4110a = obj;
        this.c = j2;
        this.d = j3;
        this.f4111b = q7VarArr.length + i2;
        this.f = q7VarArr;
        this.e = i2;
    }

    public final q7 a(int i2) {
        int i3 = this.e;
        if (i2 < i3) {
            return h;
        }
        return this.f[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r7.class != obj.getClass()) {
            return false;
        }
        r7 r7Var = (r7) obj;
        if (wi3.a(this.f4110a, r7Var.f4110a) && this.f4111b == r7Var.f4111b && this.c == r7Var.c && this.d == r7Var.d && this.e == r7Var.e && Arrays.equals(this.f, r7Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = this.f4111b * 31;
        Object obj = this.f4110a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i2 + hashCode) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + this.e) * 31) + Arrays.hashCode(this.f);
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (q7 q7Var : this.f) {
            arrayList.add(q7Var.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(i, arrayList);
        }
        long j2 = this.c;
        if (j2 != 0) {
            bundle.putLong(j, j2);
        }
        long j3 = this.d;
        if (j3 != -9223372036854775807L) {
            bundle.putLong(k, j3);
        }
        int i2 = this.e;
        if (i2 != 0) {
            bundle.putInt(l, i2);
        }
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=");
        sb.append(this.f4110a);
        sb.append(", adResumePositionUs=");
        sb.append(this.c);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            q7[] q7VarArr = this.f;
            if (i2 < q7VarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(q7VarArr[i2].f3963a);
                sb.append(", ads=[");
                for (int i3 = 0; i3 < q7VarArr[i2].e.length; i3++) {
                    sb.append("ad(state=");
                    int i4 = q7VarArr[i2].e[i3];
                    if (i4 != 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 != 3) {
                                    if (i4 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(q7VarArr[i2].f[i3]);
                    sb.append(')');
                    if (i3 < q7VarArr[i2].e.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i2 < q7VarArr.length - 1) {
                    sb.append(", ");
                }
                i2++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
