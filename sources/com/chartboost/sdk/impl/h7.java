package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.h7;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.x31;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class h7 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final q f857a;

    /* renamed from: b, reason: collision with root package name */
    public final u3 f858b;
    public final d7 c;

    public h7(q qVar, u3 u3Var, d7 d7Var) {
        this.f857a = qVar;
        this.f858b = u3Var;
        this.c = d7Var;
    }

    @Override // com.chartboost.sdk.impl.i
    public void a(d6 d6Var, x31 x31Var) {
        a(d6Var, this.f857a, x31Var);
    }

    public final void a(d6 d6Var, q qVar, x31 x31Var) {
        if (!a(d6Var)) {
            y3.d(new j3("cache_bid_response_parsing_error", "Invalid bid response", this.f857a.b(), d6Var.a().d(), null, 16, null));
            x31Var.invoke(new e6(d6Var.a(), null, new CBError(CBError.b.UNEXPECTED_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
            return;
        }
        try {
            String c = d6Var.a().c();
            a(d6Var, this.c.a(this.f857a, c != null ? new JSONObject(c) : null), x31Var);
        } catch (JSONException e) {
            y3.d(new j3("cache_bid_response_parsing_error", e.toString(), this.f857a.b(), d6Var.a().d(), null, 16, null));
            x31Var.invoke(new e6(d6Var.a(), null, new CBError(CBError.b.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
        }
    }

    public final void a(final d6 d6Var, final r rVar, final x31 x31Var) {
        a(this.f858b, rVar, new x0() { // from class: pv3
            @Override // com.chartboost.sdk.impl.x0
            public final void a(boolean z) {
                h7.a(x31.this, d6Var, rVar, this, z);
            }
        });
    }

    public static final void a(x31 x31Var, d6 d6Var, r rVar, h7 h7Var, boolean z) {
        if (z) {
            x31Var.invoke(new e6(d6Var.a(), rVar, null, 0L, 0L, 24, null));
        } else {
            y3.d(new j3("cache_asset_download_error", CBError.CBImpressionError.ASSETS_DOWNLOAD_FAILURE.name(), h7Var.f857a.b(), d6Var.a().d(), null, 16, null));
            x31Var.invoke(new e6(d6Var.a(), null, new CBError(CBError.b.INVALID_RESPONSE, "Error parsing response"), 0L, 0L, 26, null));
        }
    }

    public final void a(u3 u3Var, r rVar, x0 x0Var) {
        Map<String, w0> c = rVar.c();
        AtomicInteger atomicInteger = new AtomicInteger();
        u3Var.c();
        u3Var.a(o7.HIGH, c, atomicInteger, x0Var, this.f857a.b());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(com.chartboost.sdk.impl.d6 r4) {
        /*
            r3 = this;
            com.chartboost.sdk.impl.s0 r0 = r4.a()
            java.lang.String r0 = r0.d()
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            if (r0 == 0) goto L30
            com.chartboost.sdk.impl.s0 r4 = r4.a()
            java.lang.String r4 = r4.c()
            if (r4 == 0) goto L2c
            int r4 = r4.length()
            if (r4 <= 0) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            if (r4 != r2) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 == 0) goto L30
            r1 = 1
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.h7.a(com.chartboost.sdk.impl.d6):boolean");
    }
}
