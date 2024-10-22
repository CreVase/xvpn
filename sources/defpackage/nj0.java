package defpackage;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class nj0 extends hq1 {
    public static final t32 i;
    public static final t32 j;
    public final Object c;
    public final lu0 d;
    public final boolean e;
    public final gj0 f;
    public final i91 g;
    public qh h;

    static {
        t32 t20Var;
        t32 t20Var2;
        Comparator xz0Var = new xz0(10);
        if (xz0Var instanceof t32) {
            t20Var = (t32) xz0Var;
        } else {
            t20Var = new t20(xz0Var);
        }
        i = t20Var;
        Comparator xz0Var2 = new xz0(11);
        if (xz0Var2 instanceof t32) {
            t20Var2 = (t32) xz0Var2;
        } else {
            t20Var2 = new t20(xz0Var2);
        }
        j = t20Var2;
    }

    public nj0(Context context) {
        boolean z;
        Spatializer spatializer;
        i91 i91Var;
        d5 d5Var = new d5();
        String str = gj0.B0;
        gj0 gj0Var = new gj0(new fj0(context));
        this.c = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.d = d5Var;
        this.f = gj0Var;
        this.h = qh.g;
        if (context != null && wi3.B(context)) {
            z = true;
        } else {
            z = false;
        }
        this.e = z;
        if (!z && context != null && wi3.f5017a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                spatializer = audioManager.getSpatializer();
                i91Var = new i91(spatializer);
            } else {
                i91Var = null;
            }
            this.g = i91Var;
        }
        if (gj0Var.v0 && context == null) {
            sn1.f();
        }
    }

    public static int b(int i2, int i3) {
        if (i2 != 0 && i2 == i3) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i2 & i3);
    }

    public static int c(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 0;
                    break;
                }
                break;
            case -1662735862:
                if (str.equals("video/av01")) {
                    c = 1;
                    break;
                }
                break;
            case -1662541442:
                if (str.equals("video/hevc")) {
                    c = 2;
                    break;
                }
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                break;
            case 1599127257:
                if (str.equals("video/x-vnd.on2.vp9")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 1;
            case 4:
                return 2;
            default:
                return 0;
        }
    }

    public static void d(va3 va3Var, gj0 gj0Var, HashMap hashMap) {
        for (int i2 = 0; i2 < va3Var.f4804a; i2++) {
            za3 za3Var = (za3) gj0Var.y.get(va3Var.a(i2));
            if (za3Var != null) {
                ua3 ua3Var = za3Var.f5452a;
                za3 za3Var2 = (za3) hashMap.get(Integer.valueOf(ua3Var.c));
                if (za3Var2 == null || (za3Var2.f5453b.isEmpty() && !za3Var.f5453b.isEmpty())) {
                    hashMap.put(Integer.valueOf(ua3Var.c), za3Var);
                }
            }
        }
    }

    public static int e(y01 y01Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(y01Var.c)) {
            return 4;
        }
        String h = h(str);
        String h2 = h(y01Var.c);
        if (h2 != null && h != null) {
            if (!h2.startsWith(h) && !h.startsWith(h2)) {
                int i2 = wi3.f5017a;
                if (!h2.split("-", 2)[0].equals(h.split("-", 2)[0])) {
                    return 0;
                }
                return 2;
            }
            return 3;
        }
        if (!z || h2 != null) {
            return 0;
        }
        return 1;
    }

    public static boolean f(int i2, boolean z) {
        int i3 = i2 & 7;
        return i3 == 4 || (z && i3 == 3);
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair i(int i2, gq1 gq1Var, int[][][] iArr, kj0 kj0Var, xz0 xz0Var) {
        RandomAccess randomAccess;
        gq1 gq1Var2 = gq1Var;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < gq1Var2.f2304a) {
            if (i2 == gq1Var2.f2305b[i3]) {
                va3 va3Var = gq1Var2.c[i3];
                for (int i4 = 0; i4 < va3Var.f4804a; i4++) {
                    ua3 a2 = va3Var.a(i4);
                    ji2 c = kj0Var.c(i3, a2, iArr[i3][i4]);
                    int i5 = a2.f4643a;
                    boolean[] zArr = new boolean[i5];
                    for (int i6 = 0; i6 < i5; i6++) {
                        lj0 lj0Var = (lj0) c.get(i6);
                        int a3 = lj0Var.a();
                        if (!zArr[i6] && a3 != 0) {
                            if (a3 == 1) {
                                randomAccess = hb1.q(lj0Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(lj0Var);
                                for (int i7 = i6 + 1; i7 < i5; i7++) {
                                    lj0 lj0Var2 = (lj0) c.get(i7);
                                    if (lj0Var2.a() == 2 && lj0Var.b(lj0Var2)) {
                                        arrayList2.add(lj0Var2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                    }
                }
            }
            i3++;
            gq1Var2 = gq1Var;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, xz0Var);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((lj0) list.get(i8)).c;
        }
        lj0 lj0Var3 = (lj0) list.get(0);
        return Pair.create(new ku0(0, lj0Var3.f3138b, iArr2), Integer.valueOf(lj0Var3.f3137a));
    }

    @Override // defpackage.hq1
    public final void a() {
        i91 i91Var;
        synchronized (this.c) {
            if (wi3.f5017a >= 32 && (i91Var = this.g) != null) {
                Object obj = i91Var.d;
                if (((Spatializer.OnSpatializerStateChangedListener) obj) != null && ((Handler) i91Var.c) != null) {
                    ((Spatializer) i91Var.f2557b).removeOnSpatializerStateChangedListener((Spatializer.OnSpatializerStateChangedListener) obj);
                    ((Handler) i91Var.c).removeCallbacksAndMessages(null);
                    i91Var.c = null;
                    i91Var.d = null;
                }
            }
        }
        this.f2467a = null;
        this.f2468b = null;
    }

    public final void g() {
        boolean z;
        cb3 cb3Var;
        i91 i91Var;
        synchronized (this.c) {
            if (this.f.v0 && !this.e && wi3.f5017a >= 32 && (i91Var = this.g) != null && i91Var.f2556a) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z && (cb3Var = this.f2467a) != null) {
            ((hu0) cb3Var).h.d(10);
        }
    }
}
