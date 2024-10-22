package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.DownloadRequest;
import defpackage.dt1;
import defpackage.jm0;
import defpackage.qs1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: a, reason: collision with root package name */
    public final c4 f949a;

    public k4(c4 c4Var) {
        this.f949a = c4Var;
    }

    public final dt1 a(y9 y9Var) {
        jm0 a2;
        DownloadRequest downloadRequest;
        List emptyList;
        s3 b2 = this.f949a.b(y9Var.d());
        if (b2 != null && (a2 = b2.a()) != null && (downloadRequest = a2.f2790a) != null) {
            qs1 qs1Var = new qs1();
            String str = downloadRequest.f1509a;
            str.getClass();
            qs1Var.f4047a = str;
            qs1Var.f4048b = downloadRequest.f1510b;
            qs1Var.g = downloadRequest.f;
            qs1Var.c = downloadRequest.c;
            List list = downloadRequest.d;
            if (list != null && !list.isEmpty()) {
                emptyList = Collections.unmodifiableList(new ArrayList(list));
            } else {
                emptyList = Collections.emptyList();
            }
            qs1Var.f = emptyList;
            return qs1Var.a();
        }
        return null;
    }
}
