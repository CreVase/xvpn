package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final t7 f1175a;

    public u4(t7 t7Var) {
        this.f1175a = t7Var;
    }

    public DataUseConsent a(String str) {
        return this.f1175a.a().get(str);
    }
}
