package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.DataUseConsent;
import defpackage.m20;
import defpackage.ng0;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q7 {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1085a;

    /* renamed from: b, reason: collision with root package name */
    public final List<DataUseConsent> f1086b;
    public final Integer c;
    public final Integer d;
    public final JSONObject e;
    public final String f;

    public q7() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final Integer a() {
        return this.f1085a;
    }

    public final Integer b() {
        return this.d;
    }

    public final Integer c() {
        return this.c;
    }

    public final String d() {
        return this.f;
    }

    public final JSONObject e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7)) {
            return false;
        }
        q7 q7Var = (q7) obj;
        return m20.L(this.f1085a, q7Var.f1085a) && m20.L(this.f1086b, q7Var.f1086b) && m20.L(this.c, q7Var.c) && m20.L(this.d, q7Var.d) && m20.L(this.e, q7Var.e) && m20.L(this.f, q7Var.f);
    }

    public final List<DataUseConsent> f() {
        return this.f1086b;
    }

    public int hashCode() {
        Integer num = this.f1085a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<DataUseConsent> list = this.f1086b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        JSONObject jSONObject = this.e;
        int hashCode5 = (hashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f;
        return hashCode5 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "PrivacyBodyFields(openRtbConsent=" + this.f1085a + ", whitelistedPrivacyStandardsList=" + this.f1086b + ", openRtbGdpr=" + this.c + ", openRtbCoppa=" + this.d + ", privacyListAsJson=" + this.e + ", piDataUseConsent=" + this.f + ')';
    }

    public q7(Integer num, List<DataUseConsent> list, Integer num2, Integer num3, JSONObject jSONObject, String str) {
        this.f1085a = num;
        this.f1086b = list;
        this.c = num2;
        this.d = num3;
        this.e = jSONObject;
        this.f = str;
    }

    public /* synthetic */ q7(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : jSONObject, (i & 32) != 0 ? null : str);
    }
}
