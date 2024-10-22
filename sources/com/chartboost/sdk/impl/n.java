package com.chartboost.sdk.impl;

import android.webkit.WebView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final k7 f1004a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f1005b;
    public final List<x9> c;
    public final Map<String, x9> d;
    public final String e;
    public final String f;
    public final String g;
    public final o h;

    public n(k7 k7Var, WebView webView, String str, List<x9> list, String str2, String str3, o oVar) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.d = new HashMap();
        this.f1004a = k7Var;
        this.f1005b = webView;
        this.e = str;
        this.h = oVar;
        if (list != null) {
            arrayList.addAll(list);
            for (x9 x9Var : list) {
                this.d.put(UUID.randomUUID().toString(), x9Var);
            }
        }
        this.g = str2;
        this.f = str3;
    }

    public static n a(k7 k7Var, WebView webView, String str, String str2) {
        kc.a(k7Var, "Partner is null");
        kc.a(webView, "WebView is null");
        if (str2 != null) {
            kc.a(str2, UserVerificationMethods.USER_VERIFY_HANDPRINT, "CustomReferenceData is greater than 256 characters");
        }
        return new n(k7Var, webView, null, null, str, str2, o.HTML);
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.f;
    }

    public Map<String, x9> d() {
        return Collections.unmodifiableMap(this.d);
    }

    public String e() {
        return this.e;
    }

    public k7 f() {
        return this.f1004a;
    }

    public List<x9> g() {
        return Collections.unmodifiableList(this.c);
    }

    public WebView h() {
        return this.f1005b;
    }

    public static n a(k7 k7Var, String str, List<x9> list, String str2, String str3) {
        kc.a(k7Var, "Partner is null");
        kc.a((Object) str, "OM SDK JS script content is null");
        kc.a(list, "VerificationScriptResources is null");
        if (str3 != null) {
            kc.a(str3, UserVerificationMethods.USER_VERIFY_HANDPRINT, "CustomReferenceData is greater than 256 characters");
        }
        return new n(k7Var, null, str, list, str2, str3, o.NATIVE);
    }

    public o a() {
        return this.h;
    }
}
