package com.chartboost.sdk.privacy.model;

import com.chartboost.sdk.impl.j3;
import com.chartboost.sdk.impl.y3;

/* loaded from: classes.dex */
public abstract class GenericDataUseConsent implements DataUseConsent {

    /* renamed from: a, reason: collision with root package name */
    public String f1353a = "";

    /* renamed from: b, reason: collision with root package name */
    public Object f1354b = "";

    public final Object a() {
        return this.f1354b;
    }

    public final void b(String str) {
        this.f1353a = str;
    }

    @Override // com.chartboost.sdk.privacy.model.DataUseConsent
    public String getPrivacyStandard() {
        return this.f1353a;
    }

    public final void a(Object obj) {
        this.f1354b = obj;
    }

    public final void a(String str) {
        try {
            y3.d(new j3("consent_creation_error", str, "", "", null, 16, null));
            throw new Exception(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
