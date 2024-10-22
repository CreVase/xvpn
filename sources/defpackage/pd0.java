package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.gms.internal.play_billing.zzfb;
import com.google.android.gms.internal.play_billing.zzfh;
import com.google.android.gms.internal.play_billing.zzfj;
import com.security.xvpn.z35kb.R;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class pd0 implements um3 {

    /* renamed from: a, reason: collision with root package name */
    public static final d5 f3827a = new d5();

    /* renamed from: b, reason: collision with root package name */
    public static final s71 f3828b = new s71(18);
    public static final pq0 c = new pq0("NULL", 6, 0);
    public static final pq0 d = new pq0("NONE", 6, 0);
    public static final pq0 e = new pq0("PENDING", 6, 0);
    public static qb0 f;

    public static final String A(String str) {
        if (str == null) {
            return "";
        }
        Integer num = (Integer) xb3.f5141a.get(str);
        if (num != null) {
            return y(num.intValue());
        }
        return str;
    }

    public static int B(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(p71.k("Could not convert ", i, " to BackoffPolicy"));
    }

    public static uz1 C(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                                return uz1.TEMPORARILY_UNMETERED;
                            }
                            throw new IllegalArgumentException(p71.k("Could not convert ", i, " to NetworkType"));
                        }
                        return uz1.METERED;
                    }
                    return uz1.NOT_ROAMING;
                }
                return uz1.UNMETERED;
            }
            return uz1.CONNECTED;
        }
        return uz1.NOT_REQUIRED;
    }

    public static int D(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        throw new IllegalArgumentException(p71.k("Could not convert ", i, " to OutOfQuotaPolicy"));
    }

    public static fs3 E(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return fs3.CANCELLED;
                            }
                            throw new IllegalArgumentException(p71.k("Could not convert ", i, " to State"));
                        }
                        return fs3.BLOCKED;
                    }
                    return fs3.FAILED;
                }
                return fs3.SUCCEEDED;
            }
            return fs3.RUNNING;
        }
        return fs3.ENQUEUED;
    }

    public static final boolean F(aa0 aa0Var) {
        t90 w = aa0Var.w();
        int i = df1.b0;
        df1 df1Var = (df1) w.get(d5.g);
        if (df1Var != null) {
            return df1Var.a();
        }
        return true;
    }

    public static final uh1 G(mh1 mh1Var, List list, List list2) {
        boolean L;
        boolean L2;
        boolean L3;
        boolean L4;
        boolean L5;
        boolean L6;
        boolean L7;
        uh1 uh1Var;
        uh1 fi2Var;
        uh1 kc3Var;
        if (m20.L(mh1Var, gi2.a(Collection.class))) {
            L = true;
        } else {
            L = m20.L(mh1Var, gi2.a(List.class));
        }
        if (L) {
            L2 = true;
        } else {
            L2 = m20.L(mh1Var, gi2.a(List.class));
        }
        if (L2) {
            L3 = true;
        } else {
            L3 = m20.L(mh1Var, gi2.a(ArrayList.class));
        }
        if (L3) {
            uh1Var = new ig((uh1) list2.get(0), 0);
        } else if (m20.L(mh1Var, gi2.a(HashSet.class))) {
            uh1Var = new ig((uh1) list2.get(0), 1);
        } else {
            if (m20.L(mh1Var, gi2.a(Set.class))) {
                L4 = true;
            } else {
                L4 = m20.L(mh1Var, gi2.a(Set.class));
            }
            if (L4) {
                L5 = true;
            } else {
                L5 = m20.L(mh1Var, gi2.a(LinkedHashSet.class));
            }
            if (L5) {
                uh1Var = new ig((uh1) list2.get(0), 2);
            } else if (m20.L(mh1Var, gi2.a(HashMap.class))) {
                uh1Var = new m71((uh1) list2.get(0), (uh1) list2.get(1), 0);
            } else {
                if (m20.L(mh1Var, gi2.a(Map.class))) {
                    L6 = true;
                } else {
                    L6 = m20.L(mh1Var, gi2.a(Map.class));
                }
                if (L6) {
                    L7 = true;
                } else {
                    L7 = m20.L(mh1Var, gi2.a(LinkedHashMap.class));
                }
                if (L7) {
                    uh1Var = new m71((uh1) list2.get(0), (uh1) list2.get(1), 1);
                } else {
                    if (m20.L(mh1Var, gi2.a(Map.Entry.class))) {
                        fi2Var = new vp1((uh1) list2.get(0), (uh1) list2.get(1), 0);
                    } else {
                        if (m20.L(mh1Var, gi2.a(n42.class))) {
                            kc3Var = new vp1((uh1) list2.get(0), (uh1) list2.get(1), 1);
                        } else if (m20.L(mh1Var, gi2.a(jc3.class))) {
                            kc3Var = new kc3((uh1) list2.get(0), (uh1) list2.get(1), (uh1) list2.get(2));
                        } else if (fl.D(mh1Var).isArray()) {
                            fi2Var = new fi2((mh1) ((if3) ((vh1) list.get(0))).f2582a, (uh1) list2.get(0));
                        } else {
                            uh1Var = null;
                        }
                        uh1Var = kc3Var;
                    }
                    uh1Var = fi2Var;
                }
            }
        }
        if (uh1Var == null) {
            uh1[] uh1VarArr = (uh1[]) list2.toArray(new uh1[0]);
            return zf3.l(mh1Var, (uh1[]) Arrays.copyOf(uh1VarArr, uh1VarArr.length));
        }
        return uh1Var;
    }

    public static final Object H(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final uh1 K(d5 d5Var, vh1 vh1Var) {
        uh1 j0 = t9.j0(d5Var, vh1Var, true);
        if (j0 != null) {
            return j0;
        }
        throw new wp2("Serializer for class '" + ((j00) zf3.S(vh1Var)).b() + "' is not found.\nMark the class as @Serializable or provide the serializer explicitly.");
    }

    public static final ArrayList L(d5 d5Var, List list, boolean z) {
        ArrayList arrayList;
        if (z) {
            List list2 = list;
            arrayList = new ArrayList(a20.C0(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(K(d5Var, (vh1) it.next()));
            }
        } else {
            List list3 = list;
            arrayList = new ArrayList(a20.C0(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                uh1 j0 = t9.j0(d5Var, (vh1) it2.next(), false);
                if (j0 == null) {
                    return null;
                }
                arrayList.add(j0);
            }
        }
        return arrayList;
    }

    public static po3 M(int i, ev0 ev0Var, r42 r42Var) {
        po3 a2 = po3.a(ev0Var, r42Var);
        while (true) {
            int i2 = a2.f3886a;
            if (i2 != i) {
                sn1.f();
                long j = a2.f3887b + 8;
                if (j <= 2147483647L) {
                    ev0Var.m((int) j);
                    a2 = po3.a(ev0Var, r42Var);
                } else {
                    throw u42.b("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return a2;
            }
        }
    }

    public static final Object N(tn2 tn2Var, tn2 tn2Var2, l41 l41Var) {
        Object d30Var;
        Object L;
        try {
            fl.d(2, l41Var);
            d30Var = l41Var.invoke(tn2Var2, tn2Var);
        } catch (Throwable th) {
            d30Var = new d30(false, th);
        }
        ba0 ba0Var = ba0.f430a;
        if (d30Var != ba0Var && (L = tn2Var.L(d30Var)) != fl.h) {
            if (!(L instanceof d30)) {
                return fl.f0(L);
            }
            throw ((d30) L).f1723a;
        }
        return ba0Var;
    }

    public static int O(fs3 fs3Var) {
        int ordinal = fs3Var.ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3) {
                        i = 4;
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return 5;
                            }
                            throw new IllegalArgumentException("Could not convert " + fs3Var + " to int");
                        }
                    }
                }
            }
            return i;
        }
        return 0;
    }

    public static final long P(long j, long j2, long j3, String str) {
        String str2;
        boolean z;
        int i = d53.f1736a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 != null) {
            Long Q0 = g23.Q0(str2);
            if (Q0 != null) {
                long longValue = Q0.longValue();
                if (j2 <= longValue && longValue <= j3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return longValue;
                }
                throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + longValue + '\'').toString());
            }
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        return j;
    }

    public static int Q(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) P(i, i2, i3, str);
    }

    public static final void R(int i, int i2, mp2 mp2Var) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(mp2Var.f(i4));
            }
            i3 >>>= 1;
        }
        String a2 = mp2Var.a();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a2 + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a2 + "', but they were missing";
        }
        throw new xw1(arrayList, str, null);
    }

    public static final void S(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            Resources resources = context.getResources();
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            Configuration configuration = resources.getConfiguration();
            Locale x = x();
            configuration.setLocale(x);
            q2.D();
            configuration.setLocales(q2.j(new Locale[]{x}));
            resources.updateConfiguration(configuration, displayMetrics);
            context.createConfigurationContext(configuration);
            return;
        }
        Resources resources2 = context.getResources();
        Locale x2 = x();
        Configuration configuration2 = resources2.getConfiguration();
        configuration2.locale = x2;
        resources2.updateConfiguration(configuration2, resources2.getDisplayMetrics());
    }

    public static zzfb T(int i, int i2, wp wpVar) {
        zzfa zzv = zzfb.zzv();
        zzfh zzv2 = zzfj.zzv();
        zzv2.zzj(wpVar.f5050a);
        zzv2.zzi(wpVar.f5051b);
        zzv2.zzk(i);
        zzv.zzi(zzv2);
        zzv.zzk(i2);
        return (zzfb) zzv.zzc();
    }

    public static final z80 d(t90 t90Var) {
        if (t90Var.get(d5.g) == null) {
            t90Var = t90Var.plus(new gf1(null));
        }
        return new z80(t90Var);
    }

    public static final z80 e() {
        f33 f33Var = new f33(null);
        qi0 qi0Var = vl0.f4854a;
        return new z80(fl.V(f33Var, zo1.f5522a));
    }

    public static final b13 f(Object obj) {
        if (obj == null) {
            obj = c;
        }
        return new b13(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object g(defpackage.q83 r4, defpackage.n41 r5, java.lang.Throwable r6, defpackage.c90 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.lz0
            if (r0 == 0) goto L13
            r0 = r7
            lz0 r0 = (defpackage.lz0) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            lz0 r0 = new lz0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.Throwable r6 = r0.e
            defpackage.fl.a0(r7)     // Catch: java.lang.Throwable -> L42
            goto L3f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.fl.a0(r7)
            r0.e = r6     // Catch: java.lang.Throwable -> L42
            r0.g = r3     // Catch: java.lang.Throwable -> L42
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L42
            if (r4 != r1) goto L3f
            goto L41
        L3f:
            ch3 r1 = defpackage.ch3.f636a
        L41:
            return r1
        L42:
            r4 = move-exception
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.bx3.h(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd0.g(q83, n41, java.lang.Throwable, c90):java.lang.Object");
    }

    public static final bg1 h(qe0 qe0Var) {
        bg1 bg1Var;
        if (qe0Var instanceof bg1) {
            bg1Var = (bg1) qe0Var;
        } else {
            bg1Var = null;
        }
        if (bg1Var != null) {
            return bg1Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + gi2.a(qe0Var.getClass()));
    }

    public static final jg1 i(ir0 ir0Var) {
        jg1 jg1Var;
        if (ir0Var instanceof jg1) {
            jg1Var = (jg1) ir0Var;
        } else {
            jg1Var = null;
        }
        if (jg1Var != null) {
            return jg1Var;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + gi2.a(ir0Var.getClass()));
    }

    public static final String j(String str) {
        List o1 = i23.o1((CharSequence) i23.o1(str, new String[]{": "}).get(1), new String[]{", "});
        StringBuilder sb = new StringBuilder();
        int size = o1.size();
        for (int i = 0; i < size; i++) {
            sb.append(A((String) o1.get(i)));
            if (o1.size() > 1 && i != o1.size() - 1) {
                sb.append(y(R.string.Comma));
                sb.append(" ");
            }
        }
        return z(R.string.PasswordUnsatisfied, sb.toString());
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005c: MOVE (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:93), block:B:35:0x005b */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.j80 k(byte[] r7) {
        /*
            j80 r0 = new j80
            r0.<init>()
            if (r7 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L3f java.io.IOException -> L41
            int r7 = r2.readInt()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
        L17:
            if (r7 <= 0) goto L32
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            i80 r5 = new i80     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r5.<init>(r4, r3)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            java.util.HashSet r3 = r0.f2720a     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            r3.add(r5)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            int r7 = r7 + (-1)
            goto L17
        L32:
            r2.close()     // Catch: java.io.IOException -> L36
            goto L52
        L36:
            r7 = move-exception
            r7.printStackTrace()
            goto L52
        L3b:
            r7 = move-exception
            goto L5b
        L3d:
            r7 = move-exception
            goto L45
        L3f:
            r0 = move-exception
            goto L5d
        L41:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r6
        L45:
            r7.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r2 == 0) goto L52
            r2.close()     // Catch: java.io.IOException -> L4e
            goto L52
        L4e:
            r7 = move-exception
            r7.printStackTrace()
        L52:
            r1.close()     // Catch: java.io.IOException -> L56
            goto L5a
        L56:
            r7 = move-exception
            r7.printStackTrace()
        L5a:
            return r0
        L5b:
            r0 = r7
            r7 = r2
        L5d:
            if (r7 == 0) goto L67
            r7.close()     // Catch: java.io.IOException -> L63
            goto L67
        L63:
            r7 = move-exception
            r7.printStackTrace()
        L67:
            r1.close()     // Catch: java.io.IOException -> L6b
            goto L6f
        L6b:
            r7 = move-exception
            r7.printStackTrace()
        L6f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd0.k(byte[]):j80");
    }

    public static void l(aa0 aa0Var) {
        df1 df1Var = (df1) aa0Var.w().get(d5.g);
        if (df1Var != null) {
            df1Var.c(null);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + aa0Var).toString());
        }
    }

    public static boolean p(ev0 ev0Var) {
        r42 r42Var = new r42(8);
        int i = po3.a(ev0Var, r42Var).f3886a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        ev0Var.b(0, r42Var.f4098a, 4);
        r42Var.G(0);
        int f2 = r42Var.f();
        if (f2 != 1463899717) {
            sn1.c("WavHeaderReader", "Unsupported form type: " + f2);
            return false;
        }
        return true;
    }

    public static final String q(mp2 mp2Var, qf1 qf1Var) {
        for (Annotation annotation : mp2Var.getAnnotations()) {
            if (annotation instanceof vf1) {
                return ((vf1) annotation).discriminator();
            }
        }
        return qf1Var.f3989a.j;
    }

    public static void r(long j, r42 r42Var, xa3[] xa3VarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (r42Var.c - r42Var.f4099b > 1) {
                int i3 = 0;
                while (true) {
                    if (r42Var.c - r42Var.f4099b == 0) {
                        i = -1;
                        break;
                    }
                    int v = r42Var.v();
                    i3 += v;
                    if (v != 255) {
                        i = i3;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (r42Var.c - r42Var.f4099b == 0) {
                        i4 = -1;
                        break;
                    }
                    int v2 = r42Var.v();
                    i4 += v2;
                    if (v2 != 255) {
                        break;
                    }
                }
                int i5 = r42Var.f4099b;
                int i6 = i5 + i4;
                if (i4 != -1 && i4 <= r42Var.c - i5) {
                    if (i == 4 && i4 >= 8) {
                        int v3 = r42Var.v();
                        int A = r42Var.A();
                        if (A == 49) {
                            i2 = r42Var.f();
                        } else {
                            i2 = 0;
                        }
                        int v4 = r42Var.v();
                        if (A == 47) {
                            r42Var.H(1);
                        }
                        if (v3 == 181 && ((A == 49 || A == 47) && v4 == 3)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (A == 49) {
                            if (i2 != 1195456820) {
                                z2 = false;
                            }
                            z &= z2;
                        }
                        if (z) {
                            s(j, r42Var, xa3VarArr);
                        }
                    }
                } else {
                    sn1.f();
                    i6 = r42Var.c;
                }
                r42Var.G(i6);
            } else {
                return;
            }
        }
    }

    public static void s(long j, r42 r42Var, xa3[] xa3VarArr) {
        boolean z;
        int v = r42Var.v();
        if ((v & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        r42Var.H(1);
        int i = (v & 31) * 3;
        int i2 = r42Var.f4099b;
        for (xa3 xa3Var : xa3VarArr) {
            r42Var.G(i2);
            xa3Var.b(i, r42Var);
            if (j != -9223372036854775807L) {
                xa3Var.a(j, 1, i, 0, null);
            }
        }
    }

    public static final Object t(bg1 bg1Var, sk0 sk0Var) {
        String str;
        String str2;
        if ((sk0Var instanceof o1) && !bg1Var.d().f3989a.i) {
            String q = q(sk0Var.getDescriptor(), bg1Var.d());
            eg1 m = bg1Var.m();
            mp2 descriptor = sk0Var.getDescriptor();
            if (m instanceof tg1) {
                tg1 tg1Var = (tg1) m;
                eg1 eg1Var = (eg1) tg1Var.get(q);
                if (eg1Var != null) {
                    str = zf3.B(eg1Var).c();
                } else {
                    str = null;
                }
                bg1Var.b().getClass();
                fl.J(1, null);
                if (str == null) {
                    str2 = "missing class discriminator ('null')";
                } else {
                    str2 = "class discriminator '" + str + '\'';
                }
                throw t9.f(-1, hx2.p("Polymorphic serializer was not found for ", str2), tg1Var.toString());
            }
            throw t9.e(-1, "Expected " + gi2.a(tg1.class) + " as the serialized body of " + descriptor.a() + ", but had " + gi2.a(m.getClass()));
        }
        return sk0Var.deserialize(bg1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object u(defpackage.gz0 r5, defpackage.c90 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.sz0
            if (r0 == 0) goto L13
            r0 = r6
            sz0 r0 = (defpackage.sz0) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            sz0 r0 = new sz0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.g
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.h
            pq0 r3 = defpackage.pd0.c
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 != r4) goto L2f
            rz0 r5 = r0.f
            ei2 r0 = r0.e
            defpackage.fl.a0(r6)     // Catch: defpackage.b -> L2d
            goto L5d
        L2d:
            r6 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            defpackage.fl.a0(r6)
            ei2 r6 = new ei2
            r6.<init>()
            r6.f1938a = r3
            rz0 r2 = new rz0
            r2.<init>(r6)
            r0.e = r6     // Catch: defpackage.b -> L55
            r0.f = r2     // Catch: defpackage.b -> L55
            r0.h = r4     // Catch: defpackage.b -> L55
            java.lang.Object r5 = r5.a(r2, r0)     // Catch: defpackage.b -> L55
            if (r5 != r1) goto L53
            goto L61
        L53:
            r0 = r6
            goto L5d
        L55:
            r5 = move-exception
            r0 = r6
            r6 = r5
            r5 = r2
        L59:
            iz0 r1 = r6.f371a
            if (r1 != r5) goto L6a
        L5d:
            java.lang.Object r1 = r0.f1938a
            if (r1 == r3) goto L62
        L61:
            return r1
        L62:
            java.util.NoSuchElementException r5 = new java.util.NoSuchElementException
            java.lang.String r6 = "Expected at least one element"
            r5.<init>(r6)
            throw r5
        L6a:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd0.u(gz0, c90):java.lang.Object");
    }

    public static final Locale v(Context context) {
        LocaleList locales;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = context.getResources().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return context.getResources().getConfiguration().locale;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0024 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String w() {
        /*
            r0 = 209(0xd1, float:2.93E-43)
            a.bx r0 = defpackage.hx2.i(r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 != 0) goto L21
            r0 = 371(0x173, float:5.2E-43)
            a.bx r0 = defpackage.hx2.i(r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 == 0) goto L1f
            goto L21
        L1f:
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            if (r0 == 0) goto L27
            java.lang.String r0 = ""
            goto L3e
        L27:
            zb2 r0 = defpackage.ew3.z()
            long r0 = r0.c
            r2 = 3
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L37
            r0 = 2131755694(0x7f1002ae, float:1.9142275E38)
            goto L3a
        L37:
            r0 = 2131755695(0x7f1002af, float:1.9142277E38)
        L3a:
            java.lang.String r0 = y(r0)
        L3e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd0.w():java.lang.String");
    }

    public static Locale x() {
        LocaleList locales;
        Locale locale;
        String P = ew3.P();
        if (!m20.L("auto", P)) {
            return new Locale(P);
        }
        if (Build.VERSION.SDK_INT >= 24) {
            locales = Resources.getSystem().getConfiguration().getLocales();
            locale = locales.get(0);
            return locale;
        }
        return Resources.getSystem().getConfiguration().locale;
    }

    public static final String y(int i) {
        String string;
        Context z = zf3.z();
        if (z == null || (string = z.getString(i)) == null) {
            return "";
        }
        return string;
    }

    public static final String z(int i, Object... objArr) {
        String string;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        Context z = zf3.z();
        if (z == null || (string = z.getString(i, Arrays.copyOf(copyOf, copyOf.length))) == null) {
            return "";
        }
        return string;
    }

    public abstract void I(f0 f0Var, f0 f0Var2);

    public abstract void J(f0 f0Var, Thread thread);

    @Override // defpackage.um3
    public void a(View view) {
    }

    @Override // defpackage.um3
    public void b() {
    }

    public abstract boolean m(g0 g0Var, b0 b0Var, b0 b0Var2);

    public abstract boolean n(g0 g0Var, Object obj, Object obj2);

    public abstract boolean o(g0 g0Var, f0 f0Var, f0 f0Var2);
}
