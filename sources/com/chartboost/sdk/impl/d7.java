package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.q;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.vungle.ads.internal.model.AdPayload;
import defpackage.cr0;
import defpackage.d20;
import defpackage.i23;
import defpackage.j11;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d7 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f764a;

        /* renamed from: b, reason: collision with root package name */
        public final String f765b;
        public final double c;
        public final String d;
        public final String e;
        public final String f;
        public final int g;
        public final b h;

        public a() {
            this(null, null, 0.0d, null, null, null, 0, null, 255, null);
        }

        public final String a() {
            return this.f;
        }

        public final b b() {
            return this.h;
        }

        public final int c() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return m20.L(this.f764a, aVar.f764a) && m20.L(this.f765b, aVar.f765b) && Double.compare(this.c, aVar.c) == 0 && m20.L(this.d, aVar.d) && m20.L(this.e, aVar.e) && m20.L(this.f, aVar.f) && this.g == aVar.g && m20.L(this.h, aVar.h);
        }

        public int hashCode() {
            int h = p71.h(this.f765b, this.f764a.hashCode() * 31, 31);
            long doubleToLongBits = Double.doubleToLongBits(this.c);
            return this.h.hashCode() + ((p71.h(this.f, p71.h(this.e, p71.h(this.d, (h + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31, 31), 31), 31) + this.g) * 31);
        }

        public String toString() {
            return "BidModel(id=" + this.f764a + ", impid=" + this.f765b + ", price=" + this.c + ", burl=" + this.d + ", crid=" + this.e + ", adm=" + this.f + ", mtype=" + this.g + ", ext=" + this.h + ')';
        }

        public a(String str, String str2, double d, String str3, String str4, String str5, int i, b bVar) {
            this.f764a = str;
            this.f765b = str2;
            this.c = d;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = i;
            this.h = bVar;
        }

        public /* synthetic */ a(String str, String str2, double d, String str3, String str4, String str5, int i, b bVar, int i2, ng0 ng0Var) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0.0d : d, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) == 0 ? str5 : "", (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? new b(null, null, null, null, null, null, null, 127, null) : bVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f766a;

        /* renamed from: b, reason: collision with root package name */
        public final String f767b;
        public final String c;
        public final String d;
        public final String e;
        public final List<String> f;
        public final String g;

        public b() {
            this(null, null, null, null, null, null, null, 127, null);
        }

        public final String a() {
            return this.f767b;
        }

        public final String b() {
            return this.c;
        }

        public final String c() {
            return this.f766a;
        }

        public final List<String> d() {
            return this.f;
        }

        public final String e() {
            return this.g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m20.L(this.f766a, bVar.f766a) && m20.L(this.f767b, bVar.f767b) && m20.L(this.c, bVar.c) && m20.L(this.d, bVar.d) && m20.L(this.e, bVar.e) && m20.L(this.f, bVar.f) && m20.L(this.g, bVar.g);
        }

        public final String f() {
            return this.d;
        }

        public final String g() {
            return this.e;
        }

        public int hashCode() {
            return this.g.hashCode() + ((this.f.hashCode() + p71.h(this.e, p71.h(this.d, p71.h(this.c, p71.h(this.f767b, this.f766a.hashCode() * 31, 31), 31), 31), 31)) * 31);
        }

        public String toString() {
            return "ExtensionModel(crtype=" + this.f766a + ", adId=" + this.f767b + ", cgn=" + this.c + ", template=" + this.d + ", videoUrl=" + this.e + ", imptrackers=" + this.f + ", params=" + this.g + ')';
        }

        public b(String str, String str2, String str3, String str4, String str5, List<String> list, String str6) {
            this.f766a = str;
            this.f767b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = list;
            this.g = str6;
        }

        public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, List list, String str6, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? cr0.f1659a : list, (i & 64) != 0 ? "" : str6);
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public String f768a;

        /* renamed from: b, reason: collision with root package name */
        public String f769b;
        public String c;
        public String d;
        public List<d> e;
        public List<? extends w0> f;

        public c() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final List<w0> a() {
            return this.f;
        }

        public final Map<String, w0> b() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (w0 w0Var : this.f) {
                linkedHashMap.put(w0Var.f1255b, w0Var);
            }
            return linkedHashMap;
        }

        public final String c() {
            return this.f768a;
        }

        public final List<d> d() {
            return this.e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return m20.L(this.f768a, cVar.f768a) && m20.L(this.f769b, cVar.f769b) && m20.L(this.c, cVar.c) && m20.L(this.d, cVar.d) && m20.L(this.e, cVar.e) && m20.L(this.f, cVar.f);
        }

        public int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + p71.h(this.d, p71.h(this.c, p71.h(this.f769b, this.f768a.hashCode() * 31, 31), 31), 31)) * 31);
        }

        public String toString() {
            return "OpenRTBModel(id=" + this.f768a + ", nbr=" + this.f769b + ", currency=" + this.c + ", bidId=" + this.d + ", seatbidList=" + this.e + ", assets=" + this.f + ')';
        }

        public c(String str, String str2, String str3, String str4, List<d> list, List<? extends w0> list2) {
            this.f768a = str;
            this.f769b = str2;
            this.c = str3;
            this.d = str4;
            this.e = list;
            this.f = list2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public /* synthetic */ c(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.util.List r9, java.util.List r10, int r11, defpackage.ng0 r12) {
            /*
                r4 = this;
                r12 = r11 & 1
                java.lang.String r0 = ""
                if (r12 == 0) goto L8
                r12 = r0
                goto L9
            L8:
                r12 = r5
            L9:
                r5 = r11 & 2
                if (r5 == 0) goto Lf
                r1 = r0
                goto L10
            Lf:
                r1 = r6
            L10:
                r5 = r11 & 4
                if (r5 == 0) goto L16
                java.lang.String r7 = "USD"
            L16:
                r2 = r7
                r5 = r11 & 8
                if (r5 == 0) goto L1c
                goto L1d
            L1c:
                r0 = r8
            L1d:
                r5 = r11 & 16
                cr0 r6 = defpackage.cr0.f1659a
                if (r5 == 0) goto L25
                r3 = r6
                goto L26
            L25:
                r3 = r9
            L26:
                r5 = r11 & 32
                if (r5 == 0) goto L2c
                r11 = r6
                goto L2d
            L2c:
                r11 = r10
            L2d:
                r5 = r4
                r6 = r12
                r7 = r1
                r8 = r2
                r9 = r0
                r10 = r3
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.d7.c.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int, ng0):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f770a;

        /* renamed from: b, reason: collision with root package name */
        public final List<a> f771b;

        public d() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public final List<a> a() {
            return this.f771b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return m20.L(this.f770a, dVar.f770a) && m20.L(this.f771b, dVar.f771b);
        }

        public int hashCode() {
            return this.f771b.hashCode() + (this.f770a.hashCode() * 31);
        }

        public String toString() {
            return "SeatbidModel(seat=" + this.f770a + ", bidList=" + this.f771b + ')';
        }

        public d(String str, List<a> list) {
            this.f770a = str;
            this.f771b = list;
        }

        public /* synthetic */ d(String str, List list, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? cr0.f1659a : list);
        }
    }

    public final r a(q qVar, JSONObject jSONObject) throws JSONException {
        if (jSONObject != null) {
            c b2 = b(jSONObject);
            Map<String, w0> b3 = b2.b();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a b4 = b(c(b2.d()).a());
            b b5 = b4.b();
            w0 a2 = a(b2.a());
            b3.put("body", a2);
            String g = b5.g();
            String a3 = y.a(g);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("imptrackers", b5.d());
            a(b4, linkedHashMap, qVar);
            return new r("", b5.a(), b2.c(), b5.b(), "", b5.c(), b3, g, a3, "", "", "", 0, "", "dummy_template", a2, linkedHashMap, linkedHashMap2, b4.a(), b5.e(), y.a(b4.c()));
        }
        throw new JSONException("Missing response");
    }

    public final a b(List<a> list) {
        a aVar = (a) d20.H0(list);
        return aVar == null ? new a(null, null, 0.0d, null, null, null, 0, null, 255, null) : aVar;
    }

    public final d c(List<d> list) {
        d dVar = (d) d20.H0(list);
        if (dVar == null) {
            return new d(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
        return dVar;
    }

    public final c b(JSONObject jSONObject) throws JSONException {
        Iterator it;
        Iterator it2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("seatbid");
        b bVar = new b(null, null, null, null, null, null, null, 127, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (optJSONArray != null && (it = n4.iterator(optJSONArray)) != null) {
            while (it.hasNext()) {
                JSONObject jSONObject2 = (JSONObject) it.next();
                String optString = jSONObject2.optString("seat");
                JSONArray optJSONArray2 = jSONObject2.optJSONArray("bid");
                if (optJSONArray2 != null && (it2 = n4.iterator(optJSONArray2)) != null) {
                    while (it2.hasNext()) {
                        JSONObject jSONObject3 = (JSONObject) it2.next();
                        JSONObject optJSONObject = jSONObject3.optJSONObject("ext");
                        if (optJSONObject != null) {
                            b a2 = a(optJSONObject);
                            w0 a3 = a(a2.f());
                            if (a3 != null) {
                                arrayList.add(a3);
                            }
                            bVar = a2;
                        }
                        arrayList2.add(a(jSONObject3, bVar));
                    }
                }
                arrayList3.add(new d(optString, arrayList2));
            }
        }
        return a(jSONObject, arrayList3, arrayList);
    }

    public final void a(a aVar, Map<String, String> map, q qVar) {
        String a2 = a(qVar);
        String str = m20.L(qVar, q.b.g) ? "true" : "false";
        map.put("{% encoding %}", "base64");
        map.put(o8.f1047b, aVar.a());
        map.put("{{ ad_type }}", a2);
        map.put("{{ show_close_button }}", str);
        map.put("{{ preroll_popup }}", "false");
        map.put("{{ post_video_reward_toaster_enabled }}", "false");
        if (m20.L(qVar, q.a.g)) {
            map.put("{% is_banner %}", "true");
        }
    }

    public final String a(q qVar) {
        if (m20.L(qVar, q.a.g)) {
            return "10";
        }
        if (m20.L(qVar, q.b.g)) {
            return "8";
        }
        if (m20.L(qVar, q.c.g)) {
            return "9";
        }
        throw new j11(null);
    }

    public final w0 a(List<? extends w0> list) {
        w0 w0Var = (w0) d20.H0(list);
        return w0Var == null ? new w0("", "", "") : w0Var;
    }

    public final w0 a(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() > 0) {
            return new w0("html", str.substring(i23.c1(str, '/', 0, 6) + 1), str);
        }
        return null;
    }

    public final b a(JSONObject jSONObject) throws JSONException {
        Iterator it;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("imptrackers");
        if (optJSONArray != null && (it = n4.iterator(optJSONArray)) != null) {
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
        }
        return new b(jSONObject.optString("crtype"), jSONObject.optString("adId"), jSONObject.optString("cgn"), jSONObject.getString(AdPayload.KEY_TEMPLATE), jSONObject.optString("videoUrl"), arrayList, jSONObject.optString("params"));
    }

    public final a a(JSONObject jSONObject, b bVar) throws JSONException {
        return new a(jSONObject.getString(FacebookMediationAdapter.KEY_ID), jSONObject.getString("impid"), jSONObject.getDouble("price"), jSONObject.optString("burl"), jSONObject.optString("crid"), jSONObject.optString("adm"), jSONObject.optInt("mtype"), bVar);
    }

    public final c a(JSONObject jSONObject, List<d> list, List<? extends w0> list2) throws JSONException {
        return new c(jSONObject.getString(FacebookMediationAdapter.KEY_ID), jSONObject.optString("nbr"), jSONObject.optString("cur", "USD"), jSONObject.optString("bidid"), list, list2);
    }
}
