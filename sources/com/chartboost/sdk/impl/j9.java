package com.chartboost.sdk.impl;

import defpackage.hx2;
import defpackage.p71;

/* loaded from: classes.dex */
public class j9 {

    /* renamed from: a, reason: collision with root package name */
    public String f940a;

    /* renamed from: b, reason: collision with root package name */
    public String f941b;
    public String c;
    public String d;
    public String e;

    public j9(String str, String str2, String str3, String str4, String str5) {
        this.f940a = str;
        this.f941b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public String a() {
        return this.d;
    }

    public String b() {
        return this.c;
    }

    public String c() {
        return this.f941b;
    }

    public String d() {
        return this.f940a;
    }

    public String toString() {
        String str = this.c;
        if (str != null && str.length() > 20) {
            str = this.c.substring(0, 20);
        }
        StringBuilder sb = new StringBuilder("TrackAd{location='");
        sb.append(this.f940a);
        sb.append("'ad_type='");
        p71.A(sb, this.f941b, "', ad_impression_id='", str, "', ad_creative_id='");
        sb.append(this.d);
        sb.append("', ad_creative_type='");
        return hx2.s(sb, this.e, "'}");
    }
}
