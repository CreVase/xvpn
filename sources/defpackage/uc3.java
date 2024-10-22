package defpackage;

import android.text.SpannableStringBuilder;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class uc3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4650a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4651b;
    public final boolean c;
    public final long d;
    public final long e;
    public final wc3 f;
    public final String[] g;
    public final String h;
    public final String i;
    public final uc3 j;
    public final HashMap k;
    public final HashMap l;
    public ArrayList m;

    public uc3(String str, String str2, long j, long j2, wc3 wc3Var, String[] strArr, String str3, String str4, uc3 uc3Var) {
        boolean z;
        this.f4650a = str;
        this.f4651b = str2;
        this.i = str4;
        this.f = wc3Var;
        this.g = strArr;
        if (str2 != null) {
            z = true;
        } else {
            z = false;
        }
        this.c = z;
        this.d = j;
        this.e = j2;
        str3.getClass();
        this.h = str3;
        this.j = uc3Var;
        this.k = new HashMap();
        this.l = new HashMap();
    }

    public static uc3 a(String str) {
        return new uc3(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static SpannableStringBuilder e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            gc0 gc0Var = new gc0();
            gc0Var.f2230a = new SpannableStringBuilder();
            treeMap.put(str, gc0Var);
        }
        CharSequence charSequence = ((gc0) treeMap.get(str)).f2230a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    public final uc3 b(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (uc3) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int c() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void d(TreeSet treeSet, boolean z) {
        boolean z2;
        String str = this.f4650a;
        boolean equals = "p".equals(str);
        boolean equals2 = "div".equals(str);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            uc3 uc3Var = (uc3) this.m.get(i);
            if (!z && !equals) {
                z2 = false;
            } else {
                z2 = true;
            }
            uc3Var.d(treeSet, z2);
        }
    }

    public final boolean f(long j) {
        long j2 = this.e;
        long j3 = this.d;
        if ((j3 == -9223372036854775807L && j2 == -9223372036854775807L) || ((j3 <= j && j2 == -9223372036854775807L) || ((j3 == -9223372036854775807L && j < j2) || (j3 <= j && j < j2)))) {
            return true;
        }
        return false;
    }

    public final void g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.h;
        if (!"".equals(str3)) {
            str = str3;
        }
        if (f(j) && "div".equals(this.f4650a) && (str2 = this.i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < c(); i++) {
            b(i).g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(long r18, java.util.Map r20, java.util.Map r21, java.lang.String r22, java.util.TreeMap r23) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc3.h(long, java.util.Map, java.util.Map, java.lang.String, java.util.TreeMap):void");
    }

    public final void i(long j, boolean z, String str, TreeMap treeMap) {
        String str2;
        boolean z2;
        HashMap hashMap = this.k;
        hashMap.clear();
        HashMap hashMap2 = this.l;
        hashMap2.clear();
        String str3 = this.f4650a;
        if ("metadata".equals(str3)) {
            return;
        }
        String str4 = this.h;
        if ("".equals(str4)) {
            str2 = str;
        } else {
            str2 = str4;
        }
        if (this.c && z) {
            SpannableStringBuilder e = e(str2, treeMap);
            String str5 = this.f4651b;
            str5.getClass();
            e.append((CharSequence) str5);
            return;
        }
        if ("br".equals(str3) && z) {
            e(str2, treeMap).append('\n');
            return;
        }
        if (f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((gc0) entry.getValue()).f2230a;
                charSequence.getClass();
                hashMap.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean equals = "p".equals(str3);
            for (int i = 0; i < c(); i++) {
                uc3 b2 = b(i);
                if (!z && !equals) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                b2.i(j, z2, str2, treeMap);
            }
            if (equals) {
                SpannableStringBuilder e2 = e(str2, treeMap);
                int length = e2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (e2.charAt(length) == ' ');
                if (length >= 0 && e2.charAt(length) != '\n') {
                    e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((gc0) entry2.getValue()).f2230a;
                charSequence2.getClass();
                hashMap2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
