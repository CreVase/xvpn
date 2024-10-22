package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class ua3 implements bs {
    public static final String f = wi3.z(0);
    public static final String g = wi3.z(1);
    public static final ef0 h = new ef0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f4643a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4644b;
    public final int c;
    public final y01[] d;
    public int e;

    public ua3(String str, y01... y01VarArr) {
        boolean z;
        if (y01VarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        this.f4644b = str;
        this.d = y01VarArr;
        this.f4643a = y01VarArr.length;
        int f2 = vw1.f(y01VarArr[0].l);
        this.c = f2 == -1 ? vw1.f(y01VarArr[0].k) : f2;
        String str2 = y01VarArr[0].c;
        str2 = (str2 == null || str2.equals("und")) ? "" : str2;
        int i = y01VarArr[0].e | Http2.INITIAL_MAX_FRAME_SIZE;
        for (int i2 = 1; i2 < y01VarArr.length; i2++) {
            String str3 = y01VarArr[i2].c;
            if (!str2.equals((str3 == null || str3.equals("und")) ? "" : str3)) {
                a(i2, "languages", y01VarArr[0].c, y01VarArr[i2].c);
                return;
            } else {
                if (i != (y01VarArr[i2].e | Http2.INITIAL_MAX_FRAME_SIZE)) {
                    a(i2, "role flags", Integer.toBinaryString(y01VarArr[0].e), Integer.toBinaryString(y01VarArr[i2].e));
                    return;
                }
            }
        }
    }

    public static void a(int i, String str, String str2, String str3) {
        StringBuilder q = p71.q("Different ", str, " combined in one TrackGroup: '", str2, "' (track 0) and '");
        q.append(str3);
        q.append("' (track ");
        q.append(i);
        q.append(")");
        sn1.d("TrackGroup", "", new IllegalStateException(q.toString()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ua3.class != obj.getClass()) {
            return false;
        }
        ua3 ua3Var = (ua3) obj;
        if (this.f4644b.equals(ua3Var.f4644b) && Arrays.equals(this.d, ua3Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = p71.h(this.f4644b, 527, 31) + Arrays.hashCode(this.d);
        }
        return this.e;
    }

    @Override // defpackage.bs
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        y01[] y01VarArr = this.d;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(y01VarArr.length);
        for (y01 y01Var : y01VarArr) {
            arrayList.add(y01Var.e(true));
        }
        bundle.putParcelableArrayList(f, arrayList);
        bundle.putString(g, this.f4644b);
        return bundle;
    }
}
