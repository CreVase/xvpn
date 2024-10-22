package com.chartboost.sdk.impl;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.impl.q;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.j11;
import defpackage.m20;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final r4 f760a;

    /* renamed from: b, reason: collision with root package name */
    public final u3 f761b;
    public final AtomicReference<t8> c;
    public final f2 d;
    public final q e;
    public final z1 f;
    public final h8 g;
    public final Mediation h;
    public final w6 i;
    public final n8 j;
    public final v6 k;
    public final FrameLayout.LayoutParams l;

    public d5(r4 r4Var, u3 u3Var, AtomicReference<t8> atomicReference, f2 f2Var, q qVar, z1 z1Var, h8 h8Var, Mediation mediation, w6 w6Var, n8 n8Var, v6 v6Var, FrameLayout.LayoutParams layoutParams) {
        this.f760a = r4Var;
        this.f761b = u3Var;
        this.c = atomicReference;
        this.d = f2Var;
        this.e = qVar;
        this.f = z1Var;
        this.g = h8Var;
        this.h = mediation;
        this.i = w6Var;
        this.j = n8Var;
        this.k = v6Var;
        this.l = layoutParams;
    }

    public final p5 a(s0 s0Var, c0 c0Var, ViewGroup viewGroup, q5 q5Var, w5 w5Var, f9 f9Var, wa waVar) {
        String str;
        try {
            File a2 = this.f760a.a().a();
            r a3 = s0Var.a();
            String d = s0Var.d();
            if (a3 == null) {
                return new p5(null, CBError.CBImpressionError.PENDING_IMPRESSION_ERROR);
            }
            CBError.CBImpressionError a4 = a(a3, a2, d);
            if (a4 != null) {
                return new p5(null, a4);
            }
            String b2 = b(a3, a2, d);
            if (b2 == null) {
                return new p5(null, CBError.CBImpressionError.ERROR_LOADING_WEB_VIEW);
            }
            return new p5(a(s0Var, a3, d, this.i.a(b2), c0Var, viewGroup, q5Var, w5Var, f9Var, waVar), null);
        } catch (Exception e) {
            str = e5.f794a;
            f6.b(str, "showReady exception: " + e);
            return new p5(null, CBError.CBImpressionError.INTERNAL);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[LOOP:0: B:34:0x0094->B:36:0x009a, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b(com.chartboost.sdk.impl.r r7, java.io.File r8, java.lang.String r9) {
        /*
            r6 = this;
            com.chartboost.sdk.impl.w0 r0 = r7.d()
            java.lang.String r1 = r0.a()
            r2 = 0
            if (r1 == 0) goto L14
            int r1 = r1.length()
            if (r1 != 0) goto L12
            goto L14
        L12:
            r1 = 0
            goto L15
        L14:
            r1 = 1
        L15:
            r3 = 0
            if (r1 == 0) goto L22
            java.lang.String r7 = com.chartboost.sdk.impl.e5.a()
            java.lang.String r8 = "AdUnit does not have a template body"
            com.chartboost.sdk.impl.f6.b(r7, r8)
            return r3
        L22:
            java.io.File r8 = r0.a(r8)
            java.util.HashMap r0 = new java.util.HashMap
            java.util.Map r1 = r7.n()
            r0.<init>(r1)
            java.lang.String r1 = r7.r()
            int r1 = r1.length()
            if (r1 <= 0) goto L3b
            r1 = 1
            goto L3c
        L3b:
            r1 = 0
        L3c:
            if (r1 == 0) goto L5e
            java.lang.String r1 = r7.b()
            int r1 = r1.length()
            if (r1 <= 0) goto L4a
            r1 = 1
            goto L4b
        L4a:
            r1 = 0
        L4b:
            if (r1 == 0) goto L5e
            com.chartboost.sdk.impl.n8 r1 = r6.j
            java.lang.String r4 = r7.r()
            java.lang.String r5 = r7.b()
            java.lang.String r1 = r1.a(r8, r4, r5)
            if (r1 == 0) goto L5e
            return r1
        L5e:
            java.lang.String r1 = r7.u()
            int r1 = r1.length()
            if (r1 != 0) goto L6a
            r1 = 1
            goto L6b
        L6a:
            r1 = 0
        L6b:
            java.lang.String r4 = "{% native_video_player %}"
            if (r1 != 0) goto L83
            java.lang.String r1 = r7.t()
            int r1 = r1.length()
            if (r1 != 0) goto L7a
            r2 = 1
        L7a:
            if (r2 == 0) goto L7d
            goto L83
        L7d:
            java.lang.String r1 = "true"
            r0.put(r4, r1)
            goto L88
        L83:
            java.lang.String r1 = "false"
            r0.put(r4, r1)
        L88:
            java.util.Map r7 = r7.c()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L94:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb0
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            com.chartboost.sdk.impl.w0 r1 = (com.chartboost.sdk.impl.w0) r1
            java.lang.String r1 = r1.f1255b
            r0.put(r2, r1)
            goto L94
        Lb0:
            com.chartboost.sdk.impl.q r7 = r6.e     // Catch: java.lang.Exception -> Lbb
            java.lang.String r7 = r7.b()     // Catch: java.lang.Exception -> Lbb
            java.lang.String r3 = com.chartboost.sdk.impl.g9.a(r8, r0, r7, r9)     // Catch: java.lang.Exception -> Lbb
            goto Lc5
        Lbb:
            r7 = move-exception
            java.lang.String r8 = com.chartboost.sdk.impl.e5.a()
            java.lang.String r9 = "loadTemplateHtml: "
            defpackage.p71.z(r9, r7, r8)
        Lc5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.d5.b(com.chartboost.sdk.impl.r, java.io.File, java.lang.String):java.lang.String");
    }

    public final q1 a(s0 s0Var, r rVar, String str, String str2, c0 c0Var, ViewGroup viewGroup, q5 q5Var, w5 w5Var, f9 f9Var, wa waVar) {
        r5 a2 = a(rVar.k(), this.e);
        return new q1(new l5(this.d, new v2(this.f, this.g), new b3(this.f, this.g), a2, this.k, s0Var, this.f761b, w5Var.a(str, rVar.l(), this.e.b(), str2, rVar.u(), rVar.t(), c0Var, f9Var, waVar), rVar, this.e, str, q5Var, c0Var), viewGroup, null, null, null, null, 60, null);
    }

    public final r5 a(String str, q qVar) {
        if (m20.L(qVar, q.b.g)) {
            return a(str);
        }
        if (m20.L(qVar, q.c.g)) {
            return r5.INTERSTITIAL_REWARD_VIDEO;
        }
        if (m20.L(qVar, q.a.g)) {
            return r5.BANNER;
        }
        throw new j11(null);
    }

    public final r5 a(String str) {
        if (m20.L(str, "video")) {
            return r5.INTERSTITIAL_VIDEO;
        }
        return r5.INTERSTITIAL;
    }

    public final CBError.CBImpressionError a(r rVar, File file, String str) {
        String str2;
        Map<String, w0> c = rVar.c();
        if (c.isEmpty()) {
            return null;
        }
        for (w0 w0Var : c.values()) {
            File a2 = w0Var.a(file);
            if (a2 == null || !a2.exists()) {
                str2 = e5.f794a;
                f6.b(str2, "Asset does not exist: " + w0Var.f1255b);
                String str3 = w0Var.f1255b;
                if (str3 == null) {
                    str3 = "";
                }
                a(str, str3);
                return CBError.CBImpressionError.ASSET_MISSING;
            }
        }
        return null;
    }

    public final void a(String str, String str2) {
        y3.d(new j3("show_unavailable_asset_error", str2, this.e.b(), str, this.h));
    }
}
