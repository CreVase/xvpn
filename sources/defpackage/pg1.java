package defpackage;

import android.R;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.view.View;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class pg1 {
    public static boolean k;
    public static Method l;

    /* renamed from: a, reason: collision with root package name */
    public static final d5 f3838a = new d5();

    /* renamed from: b, reason: collision with root package name */
    public static final c90[] f3839b = new c90[0];
    public static final float[][] c = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] d = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] e = {95.047f, 100.0f, 108.883f};
    public static final float[][] f = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final fp g = new fp();
    public static final mp0 h = new mp0(19);
    public static final pq0 i = new pq0("CONDITION_FALSE", 6, 0);
    public static final boolean[] j = new boolean[3];
    public static final int[] m = {R.attr.stateListAnimator};

    public static final Map a(mp2 mp2Var) {
        Object obj;
        String[] names;
        int e2 = mp2Var.e();
        ConcurrentHashMap concurrentHashMap = null;
        for (int i2 = 0; i2 < e2; i2++) {
            List g2 = mp2Var.g(i2);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : g2) {
                if (obj2 instanceof ng1) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.size() == 1) {
                obj = arrayList.get(0);
            } else {
                obj = null;
            }
            ng1 ng1Var = (ng1) obj;
            if (ng1Var != null && (names = ng1Var.names()) != null) {
                for (String str : names) {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap(mp2Var.e());
                    }
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, Integer.valueOf(i2));
                    } else {
                        StringBuilder u = hx2.u("The suggested name '", str, "' for property ");
                        u.append(mp2Var.f(i2));
                        u.append(" is already one of the names for property ");
                        u.append(mp2Var.f(((Number) jq1.l0(concurrentHashMap, str)).intValue()));
                        u.append(" in ");
                        u.append(mp2Var);
                        throw new eh3(u.toString(), 1);
                    }
                }
            }
        }
        if (concurrentHashMap == null) {
            return dr0.f1824a;
        }
        return concurrentHashMap;
    }

    public static boolean b(r70 r70Var) {
        s70 s70Var;
        boolean z;
        boolean z2;
        int[] iArr = r70Var.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        r70 r70Var2 = r70Var.T;
        if (r70Var2 != null) {
            s70Var = (s70) r70Var2;
        } else {
            s70Var = null;
        }
        if (s70Var != null) {
            int i4 = s70Var.p0[0];
        }
        if (s70Var != null) {
            int i5 = s70Var.p0[1];
        }
        if (i2 != 1 && !r70Var.B() && i2 != 2 && ((i2 != 3 || r70Var.r != 0 || r70Var.W != 0.0f || !r70Var.u(0)) && (i2 != 3 || r70Var.r != 1 || !r70Var.v(0, r70Var.r())))) {
            z = false;
        } else {
            z = true;
        }
        if (i3 != 1 && !r70Var.C() && i3 != 2 && ((i3 != 3 || r70Var.s != 0 || r70Var.W != 0.0f || !r70Var.u(1)) && (i3 != 3 || r70Var.s != 1 || !r70Var.v(1, r70Var.l())))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (r70Var.W > 0.0f && (z || z2)) {
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static void c(s70 s70Var, ok1 ok1Var, r70 r70Var) {
        r70Var.o = -1;
        r70Var.p = -1;
        int i2 = s70Var.p0[0];
        int[] iArr = r70Var.p0;
        if (i2 != 2 && iArr[0] == 4) {
            z60 z60Var = r70Var.I;
            int i3 = z60Var.g;
            int r = s70Var.r();
            z60 z60Var2 = r70Var.K;
            int i4 = r - z60Var2.g;
            z60Var.i = ok1Var.k(z60Var);
            z60Var2.i = ok1Var.k(z60Var2);
            ok1Var.d(z60Var.i, i3);
            ok1Var.d(z60Var2.i, i4);
            r70Var.o = 2;
            r70Var.Y = i3;
            int i5 = i4 - i3;
            r70Var.U = i5;
            int i6 = r70Var.b0;
            if (i5 < i6) {
                r70Var.U = i6;
            }
        }
        if (s70Var.p0[1] != 2 && iArr[1] == 4) {
            z60 z60Var3 = r70Var.J;
            int i7 = z60Var3.g;
            int l2 = s70Var.l();
            z60 z60Var4 = r70Var.L;
            int i8 = l2 - z60Var4.g;
            z60Var3.i = ok1Var.k(z60Var3);
            z60Var4.i = ok1Var.k(z60Var4);
            ok1Var.d(z60Var3.i, i7);
            ok1Var.d(z60Var4.i, i8);
            if (r70Var.a0 > 0 || r70Var.g0 == 8) {
                z60 z60Var5 = r70Var.M;
                ix2 k2 = ok1Var.k(z60Var5);
                z60Var5.i = k2;
                ok1Var.d(k2, r70Var.a0 + i7);
            }
            r70Var.p = 2;
            r70Var.Z = i7;
            int i9 = i8 - i7;
            r70Var.V = i9;
            int i10 = r70Var.c0;
            if (i9 < i10) {
                r70Var.V = i10;
            }
        }
    }

    public static final boolean d(int i2, int i3) {
        return (i2 & i3) == i3;
    }

    public static final int e(mp2 mp2Var, qf1 qf1Var, String str) {
        int d2 = mp2Var.d(str);
        if (d2 != -3) {
            return d2;
        }
        if (!qf1Var.f3989a.l) {
            return d2;
        }
        Integer num = (Integer) ((Map) qf1Var.c.f(mp2Var, new og1(mp2Var, 0))).get(str);
        if (num == null) {
            return -3;
        }
        return num.intValue();
    }

    public static final int f(mp2 mp2Var, qf1 qf1Var, String str, String str2) {
        int e2 = e(mp2Var, qf1Var, str);
        if (e2 != -3) {
            return e2;
        }
        throw new wp2(mp2Var.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final String g() {
        Process process = null;
        if (!k) {
            try {
                if (l == null) {
                    l = Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class);
                }
                String str = (String) l.invoke(null, "ro.fota.type", "");
                if (str == null) {
                    return "";
                }
                return str;
            } catch (Exception unused) {
                l = null;
                k = true;
            }
        }
        try {
            process = Runtime.getRuntime().exec("getprop \"ro.fota.type\" \"\"");
            String readLine = new BufferedReader(new InputStreamReader(process.getInputStream())).readLine();
            process.destroy();
            return readLine;
        } catch (IOException unused2) {
            if (process != null) {
                process.destroy();
            }
            return "";
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    public static void h(int i2, r70 r70Var, mp3 mp3Var, boolean z) {
        boolean z2;
        z60 z60Var;
        z60 z60Var2;
        Iterator it;
        boolean z3;
        z60 z60Var3;
        z60 z60Var4;
        if (r70Var.m) {
            return;
        }
        if (!(r70Var instanceof s70) && r70Var.A() && b(r70Var)) {
            s70.V(r70Var, mp3Var, new fp());
        }
        z60 j2 = r70Var.j(y60.LEFT);
        z60 j3 = r70Var.j(y60.RIGHT);
        int d2 = j2.d();
        int d3 = j3.d();
        HashSet hashSet = j2.f5432a;
        if (hashSet != null && j2.c) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                z60 z60Var5 = (z60) it2.next();
                r70 r70Var2 = z60Var5.d;
                int i3 = i2 + 1;
                boolean b2 = b(r70Var2);
                if (r70Var2.A() && b2) {
                    s70.V(r70Var2, mp3Var, new fp());
                }
                z60 z60Var6 = r70Var2.I;
                z60 z60Var7 = r70Var2.K;
                if ((z60Var5 == z60Var6 && (z60Var4 = z60Var7.f) != null && z60Var4.c) || (z60Var5 == z60Var7 && (z60Var3 = z60Var6.f) != null && z60Var3.c)) {
                    it = it2;
                    z3 = true;
                } else {
                    it = it2;
                    z3 = false;
                }
                int i4 = r70Var2.p0[0];
                if (i4 == 3 && !b2) {
                    if (i4 == 3 && r70Var2.v >= 0 && r70Var2.u >= 0 && ((r70Var2.g0 == 8 || (r70Var2.r == 0 && r70Var2.W == 0.0f)) && !r70Var2.y() && !r70Var2.F && z3 && !r70Var2.y())) {
                        m(i3, r70Var, mp3Var, r70Var2, z);
                    }
                } else if (!r70Var2.A()) {
                    if (z60Var5 == z60Var6 && z60Var7.f == null) {
                        int e2 = z60Var6.e() + d2;
                        r70Var2.J(e2, r70Var2.r() + e2);
                        h(i3, r70Var2, mp3Var, z);
                    } else if (z60Var5 == z60Var7 && z60Var6.f == null) {
                        int e3 = d2 - z60Var7.e();
                        r70Var2.J(e3 - r70Var2.r(), e3);
                        h(i3, r70Var2, mp3Var, z);
                    } else if (z3 && !r70Var2.y()) {
                        l(i3, r70Var2, mp3Var, z);
                    }
                }
                it2 = it;
            }
        }
        if (r70Var instanceof t61) {
            return;
        }
        HashSet hashSet2 = j3.f5432a;
        if (hashSet2 != null && j3.c) {
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                z60 z60Var8 = (z60) it3.next();
                r70 r70Var3 = z60Var8.d;
                int i5 = i2 + 1;
                boolean b3 = b(r70Var3);
                if (r70Var3.A() && b3) {
                    s70.V(r70Var3, mp3Var, new fp());
                }
                z60 z60Var9 = r70Var3.I;
                z60 z60Var10 = r70Var3.K;
                if ((z60Var8 == z60Var9 && (z60Var2 = z60Var10.f) != null && z60Var2.c) || (z60Var8 == z60Var10 && (z60Var = z60Var9.f) != null && z60Var.c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i6 = r70Var3.p0[0];
                if (i6 == 3 && !b3) {
                    if (i6 == 3 && r70Var3.v >= 0 && r70Var3.u >= 0) {
                        if (r70Var3.g0 != 8) {
                            if (r70Var3.r == 0) {
                                if (r70Var3.W == 0.0f) {
                                }
                            }
                        }
                        if (!r70Var3.y() && !r70Var3.F && z2 && !r70Var3.y()) {
                            m(i5, r70Var, mp3Var, r70Var3, z);
                        }
                    }
                } else if (!r70Var3.A()) {
                    if (z60Var8 == z60Var9 && z60Var10.f == null) {
                        int e4 = z60Var9.e() + d3;
                        r70Var3.J(e4, r70Var3.r() + e4);
                        h(i5, r70Var3, mp3Var, z);
                    } else if (z60Var8 == z60Var10 && z60Var9.f == null) {
                        int e5 = d3 - z60Var10.e();
                        r70Var3.J(e5 - r70Var3.r(), e5);
                        h(i5, r70Var3, mp3Var, z);
                    } else if (z2 && !r70Var3.y()) {
                        l(i5, r70Var3, mp3Var, z);
                    }
                }
            }
        }
        r70Var.m = true;
    }

    public static int i(float f2) {
        boolean z;
        float f3;
        boolean z2;
        float f4;
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f5 = (f2 + 16.0f) / 116.0f;
        if (f2 > 8.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f3 = f5 * f5 * f5;
        } else {
            f3 = f2 / 903.2963f;
        }
        float f6 = f5 * f5 * f5;
        if (f6 > 0.008856452f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            f4 = f6;
        } else {
            f4 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        if (!z2) {
            f6 = ((f5 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = e;
        return h20.a(f4 * fArr[0], f3 * fArr[1], f6 * fArr[2]);
    }

    public static float j(int i2) {
        float pow;
        float f2 = i2 / 255.0f;
        if (f2 <= 0.04045f) {
            pow = f2 / 12.92f;
        } else {
            pow = (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
        }
        return pow * 100.0f;
    }

    public static void k(View view, float f2) {
        int integer = view.getResources().getInteger(if2.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, he2.state_liftable, -he2.state_lifted}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    public static void l(int i2, r70 r70Var, mp3 mp3Var, boolean z) {
        float f2;
        float f3 = r70Var.d0;
        z60 z60Var = r70Var.I;
        int d2 = z60Var.f.d();
        z60 z60Var2 = r70Var.K;
        int d3 = z60Var2.f.d();
        int e2 = z60Var.e() + d2;
        int e3 = d3 - z60Var2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int r = r70Var.r();
        int i3 = (d3 - d2) - r;
        if (d2 > d3) {
            i3 = (d2 - d3) - r;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = ((int) f2) + d2;
        int i5 = i4 + r;
        if (d2 > d3) {
            i5 = i4 - r;
        }
        r70Var.J(i4, i5);
        h(i2 + 1, r70Var, mp3Var, z);
    }

    public static void m(int i2, r70 r70Var, mp3 mp3Var, r70 r70Var2, boolean z) {
        int r;
        float f2 = r70Var2.d0;
        z60 z60Var = r70Var2.I;
        int e2 = z60Var.e() + z60Var.f.d();
        z60 z60Var2 = r70Var2.K;
        int d2 = z60Var2.f.d() - z60Var2.e();
        if (d2 >= e2) {
            int r2 = r70Var2.r();
            if (r70Var2.g0 != 8) {
                int i3 = r70Var2.r;
                if (i3 == 2) {
                    if (r70Var instanceof s70) {
                        r = r70Var.r();
                    } else {
                        r = r70Var.T.r();
                    }
                    r2 = (int) (r70Var2.d0 * 0.5f * r);
                } else if (i3 == 0) {
                    r2 = d2 - e2;
                }
                r2 = Math.max(r70Var2.u, r2);
                int i4 = r70Var2.v;
                if (i4 > 0) {
                    r2 = Math.min(i4, r2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - r2)) + 0.5f));
            r70Var2.J(i5, r2 + i5);
            h(i2 + 1, r70Var2, mp3Var, z);
        }
    }

    public static void n(int i2, r70 r70Var, mp3 mp3Var) {
        float f2;
        float f3 = r70Var.e0;
        z60 z60Var = r70Var.J;
        int d2 = z60Var.f.d();
        z60 z60Var2 = r70Var.L;
        int d3 = z60Var2.f.d();
        int e2 = z60Var.e() + d2;
        int e3 = d3 - z60Var2.e();
        if (d2 == d3) {
            f3 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int l2 = r70Var.l();
        int i3 = (d3 - d2) - l2;
        if (d2 > d3) {
            i3 = (d2 - d3) - l2;
        }
        if (i3 > 0) {
            f2 = (f3 * i3) + 0.5f;
        } else {
            f2 = f3 * i3;
        }
        int i4 = (int) f2;
        int i5 = d2 + i4;
        int i6 = i5 + l2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - l2;
        }
        r70Var.K(i5, i6);
        p(i2 + 1, r70Var, mp3Var);
    }

    public static void o(int i2, r70 r70Var, mp3 mp3Var, r70 r70Var2) {
        int l2;
        float f2 = r70Var2.e0;
        z60 z60Var = r70Var2.J;
        int e2 = z60Var.e() + z60Var.f.d();
        z60 z60Var2 = r70Var2.L;
        int d2 = z60Var2.f.d() - z60Var2.e();
        if (d2 >= e2) {
            int l3 = r70Var2.l();
            if (r70Var2.g0 != 8) {
                int i3 = r70Var2.s;
                if (i3 == 2) {
                    if (r70Var instanceof s70) {
                        l2 = r70Var.l();
                    } else {
                        l2 = r70Var.T.l();
                    }
                    l3 = (int) (f2 * 0.5f * l2);
                } else if (i3 == 0) {
                    l3 = d2 - e2;
                }
                l3 = Math.max(r70Var2.x, l3);
                int i4 = r70Var2.y;
                if (i4 > 0) {
                    l3 = Math.min(i4, l3);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((d2 - e2) - l3)) + 0.5f));
            r70Var2.K(i5, l3 + i5);
            p(i2 + 1, r70Var2, mp3Var);
        }
    }

    public static void p(int i2, r70 r70Var, mp3 mp3Var) {
        z60 z60Var;
        boolean z;
        z60 z60Var2;
        z60 z60Var3;
        boolean z2;
        z60 z60Var4;
        z60 z60Var5;
        if (r70Var.n) {
            return;
        }
        if (!(r70Var instanceof s70) && r70Var.A() && b(r70Var)) {
            s70.V(r70Var, mp3Var, new fp());
        }
        z60 j2 = r70Var.j(y60.TOP);
        z60 j3 = r70Var.j(y60.BOTTOM);
        int d2 = j2.d();
        int d3 = j3.d();
        HashSet hashSet = j2.f5432a;
        if (hashSet != null && j2.c) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                z60 z60Var6 = (z60) it.next();
                r70 r70Var2 = z60Var6.d;
                int i3 = i2 + 1;
                boolean b2 = b(r70Var2);
                if (r70Var2.A() && b2) {
                    s70.V(r70Var2, mp3Var, new fp());
                }
                z60 z60Var7 = r70Var2.J;
                z60 z60Var8 = r70Var2.L;
                if ((z60Var6 == z60Var7 && (z60Var5 = z60Var8.f) != null && z60Var5.c) || (z60Var6 == z60Var8 && (z60Var4 = z60Var7.f) != null && z60Var4.c)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i4 = r70Var2.p0[1];
                if (i4 == 3 && !b2) {
                    if (i4 == 3 && r70Var2.y >= 0 && r70Var2.x >= 0 && (r70Var2.g0 == 8 || (r70Var2.s == 0 && r70Var2.W == 0.0f))) {
                        if (!r70Var2.z() && !r70Var2.F && z2 && !r70Var2.z()) {
                            o(i3, r70Var, mp3Var, r70Var2);
                        }
                    }
                } else if (!r70Var2.A()) {
                    if (z60Var6 == z60Var7 && z60Var8.f == null) {
                        int e2 = z60Var7.e() + d2;
                        r70Var2.K(e2, r70Var2.l() + e2);
                        p(i3, r70Var2, mp3Var);
                    } else if (z60Var6 == z60Var8 && z60Var7.f == null) {
                        int e3 = d2 - z60Var8.e();
                        r70Var2.K(e3 - r70Var2.l(), e3);
                        p(i3, r70Var2, mp3Var);
                    } else if (z2 && !r70Var2.z()) {
                        n(i3, r70Var2, mp3Var);
                    }
                }
            }
        }
        if (r70Var instanceof t61) {
            return;
        }
        HashSet hashSet2 = j3.f5432a;
        if (hashSet2 != null && j3.c) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                z60 z60Var9 = (z60) it2.next();
                r70 r70Var3 = z60Var9.d;
                int i5 = i2 + 1;
                boolean b3 = b(r70Var3);
                if (r70Var3.A() && b3) {
                    s70.V(r70Var3, mp3Var, new fp());
                }
                z60 z60Var10 = r70Var3.J;
                z60 z60Var11 = r70Var3.L;
                if ((z60Var9 == z60Var10 && (z60Var3 = z60Var11.f) != null && z60Var3.c) || (z60Var9 == z60Var11 && (z60Var2 = z60Var10.f) != null && z60Var2.c)) {
                    z = true;
                } else {
                    z = false;
                }
                int i6 = r70Var3.p0[1];
                if (i6 == 3 && !b3) {
                    if (i6 == 3 && r70Var3.y >= 0 && r70Var3.x >= 0) {
                        if (r70Var3.g0 != 8) {
                            if (r70Var3.s == 0) {
                                if (r70Var3.W == 0.0f) {
                                }
                            }
                        }
                        if (!r70Var3.z() && !r70Var3.F && z && !r70Var3.z()) {
                            o(i5, r70Var, mp3Var, r70Var3);
                        }
                    }
                } else if (r70Var3.A()) {
                    continue;
                } else if (z60Var9 == z60Var10 && z60Var11.f == null) {
                    int e4 = z60Var10.e() + d3;
                    r70Var3.K(e4, r70Var3.l() + e4);
                    p(i5, r70Var3, mp3Var);
                } else if (z60Var9 == z60Var11 && z60Var10.f == null) {
                    int e5 = d3 - z60Var11.e();
                    r70Var3.K(e5 - r70Var3.l(), e5);
                    p(i5, r70Var3, mp3Var);
                } else if (z && !r70Var3.z()) {
                    n(i5, r70Var3, mp3Var);
                }
            }
        }
        z60 j4 = r70Var.j(y60.BASELINE);
        if (j4.f5432a != null && j4.c) {
            int d4 = j4.d();
            Iterator it3 = j4.f5432a.iterator();
            while (it3.hasNext()) {
                z60 z60Var12 = (z60) it3.next();
                r70 r70Var4 = z60Var12.d;
                int i7 = i2 + 1;
                boolean b4 = b(r70Var4);
                if (r70Var4.A() && b4) {
                    s70.V(r70Var4, mp3Var, new fp());
                }
                if (r70Var4.p0[1] != 3 || b4) {
                    if (!r70Var4.A() && z60Var12 == (z60Var = r70Var4.M)) {
                        int e6 = z60Var12.e() + d4;
                        if (r70Var4.E) {
                            int i8 = e6 - r70Var4.a0;
                            int i9 = r70Var4.V + i8;
                            r70Var4.Z = i8;
                            r70Var4.J.l(i8);
                            r70Var4.L.l(i9);
                            z60Var.l(e6);
                            r70Var4.l = true;
                        }
                        p(i7, r70Var4, mp3Var);
                    }
                }
            }
        }
        r70Var.n = true;
    }

    public static float q() {
        return ((float) Math.pow((50.0f + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }
}
