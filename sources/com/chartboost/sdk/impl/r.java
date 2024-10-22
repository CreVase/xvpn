package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t1;
import defpackage.jq1;
import defpackage.m20;
import defpackage.n42;
import defpackage.p71;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public String f1089a;

    /* renamed from: b, reason: collision with root package name */
    public String f1090b;
    public String c;
    public String d;
    public String e;
    public String f;
    public final Map<String, w0> g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public int m;
    public String n;
    public String o;
    public w0 p;
    public final Map<String, String> q;
    public final Map<String, List<String>> r;
    public final String s;
    public final String t;
    public final h6 u;
    public final boolean v;

    public r() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public final String a() {
        return this.f1090b;
    }

    public final String b() {
        return this.s;
    }

    public final Map<String, w0> c() {
        return this.g;
    }

    public final w0 d() {
        return this.p;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return m20.L(this.f1089a, rVar.f1089a) && m20.L(this.f1090b, rVar.f1090b) && m20.L(this.c, rVar.c) && m20.L(this.d, rVar.d) && m20.L(this.e, rVar.e) && m20.L(this.f, rVar.f) && m20.L(this.g, rVar.g) && m20.L(this.h, rVar.h) && m20.L(this.i, rVar.i) && m20.L(this.j, rVar.j) && m20.L(this.k, rVar.k) && m20.L(this.l, rVar.l) && this.m == rVar.m && m20.L(this.n, rVar.n) && m20.L(this.o, rVar.o) && m20.L(this.p, rVar.p) && m20.L(this.q, rVar.q) && m20.L(this.r, rVar.r) && m20.L(this.s, rVar.s) && m20.L(this.t, rVar.t) && this.u == rVar.u;
    }

    public final String f() {
        return this.e;
    }

    public final String g() {
        return this.k;
    }

    public final Map<String, List<String>> h() {
        return this.r;
    }

    public int hashCode() {
        return this.u.hashCode() + p71.h(this.t, p71.h(this.s, (this.r.hashCode() + ((this.q.hashCode() + ((this.p.hashCode() + p71.h(this.o, p71.h(this.n, (p71.h(this.l, p71.h(this.k, p71.h(this.j, p71.h(this.i, p71.h(this.h, (this.g.hashCode() + p71.h(this.f, p71.h(this.e, p71.h(this.d, p71.h(this.c, p71.h(this.f1090b, this.f1089a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31) + this.m) * 31, 31), 31)) * 31)) * 31)) * 31, 31), 31);
    }

    public final String i() {
        return this.c;
    }

    public final String j() {
        return this.j;
    }

    public final String k() {
        return this.f;
    }

    public final h6 l() {
        return this.u;
    }

    public final String m() {
        return this.f1089a;
    }

    public final Map<String, String> n() {
        return this.q;
    }

    public final String o() {
        JSONObject a2 = t1.a(new t1.a[0]);
        for (Map.Entry<String, String> entry : w().entrySet()) {
            u1.a(a2, entry.getKey(), entry.getValue());
        }
        return a2.toString();
    }

    public final int p() {
        return this.m;
    }

    public final String q() {
        return this.n;
    }

    public final String r() {
        return this.t;
    }

    public final String s() {
        return this.l;
    }

    public final String t() {
        return this.i;
    }

    public String toString() {
        return "AdUnit(name=" + this.f1089a + ", adId=" + this.f1090b + ", impressionId=" + this.c + ", cgn=" + this.d + ", creative=" + this.e + ", mediaType=" + this.f + ", assets=" + this.g + ", videoUrl=" + this.h + ", videoFilename=" + this.i + ", link=" + this.j + ", deepLink=" + this.k + ", to=" + this.l + ", rewardAmount=" + this.m + ", rewardCurrency=" + this.n + ", template=" + this.o + ", body=" + this.p + ", parameters=" + this.q + ", events=" + this.r + ", adm=" + this.s + ", templateParams=" + this.t + ", mtype=" + this.u + ')';
    }

    public final String u() {
        return this.h;
    }

    public final boolean v() {
        return this.v;
    }

    public final Map<String, String> w() {
        Map<String, String> map = this.q;
        Map<String, w0> map2 = this.g;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry<String, w0> entry : map2.entrySet()) {
            String key = entry.getKey();
            w0 value = entry.getValue();
            arrayList.add(new n42(key, value.f1254a + '/' + value.f1255b));
        }
        if (map.isEmpty()) {
            return jq1.n0(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        jq1.m0(arrayList, linkedHashMap);
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0065, code lost:            if ((r4.i.length() > 0) != false) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public r(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.util.Map<java.lang.String, com.chartboost.sdk.impl.w0> r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19, com.chartboost.sdk.impl.w0 r20, java.util.Map<java.lang.String, java.lang.String> r21, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r22, java.lang.String r23, java.lang.String r24, com.chartboost.sdk.impl.h6 r25) {
        /*
            r4 = this;
            r0 = r4
            r4.<init>()
            r1 = r5
            r0.f1089a = r1
            r1 = r6
            r0.f1090b = r1
            r1 = r7
            r0.c = r1
            r1 = r8
            r0.d = r1
            r1 = r9
            r0.e = r1
            r1 = r10
            r0.f = r1
            r1 = r11
            r0.g = r1
            r1 = r12
            r0.h = r1
            r2 = r13
            r0.i = r2
            r2 = r14
            r0.j = r2
            r2 = r15
            r0.k = r2
            r2 = r16
            r0.l = r2
            r2 = r17
            r0.m = r2
            r2 = r18
            r0.n = r2
            r2 = r19
            r0.o = r2
            r2 = r20
            r0.p = r2
            r2 = r21
            r0.q = r2
            r2 = r22
            r0.r = r2
            r2 = r23
            r0.s = r2
            r2 = r24
            r0.t = r2
            r2 = r25
            r0.u = r2
            int r1 = r12.length()
            r2 = 1
            r3 = 0
            if (r1 <= 0) goto L57
            r1 = 1
            goto L58
        L57:
            r1 = 0
        L58:
            if (r1 == 0) goto L68
            java.lang.String r1 = r0.i
            int r1 = r1.length()
            if (r1 <= 0) goto L64
            r1 = 1
            goto L65
        L64:
            r1 = 0
        L65:
            if (r1 == 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            r0.v = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.r.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.chartboost.sdk.impl.w0, java.util.Map, java.util.Map, java.lang.String, java.lang.String, com.chartboost.sdk.impl.h6):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ r(java.lang.String r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.Map r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34, java.lang.String r35, java.lang.String r36, com.chartboost.sdk.impl.w0 r37, java.util.Map r38, java.util.Map r39, java.lang.String r40, java.lang.String r41, com.chartboost.sdk.impl.h6 r42, int r43, defpackage.ng0 r44) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.r.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, com.chartboost.sdk.impl.w0, java.util.Map, java.util.Map, java.lang.String, java.lang.String, com.chartboost.sdk.impl.h6, int, ng0):void");
    }
}
