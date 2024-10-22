package com.vungle.ads.internal.network;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.network.converters.EmptyResponseConverter;
import com.vungle.ads.internal.network.converters.JsonConverter;
import defpackage.gi2;
import defpackage.ng0;
import defpackage.pd0;
import defpackage.qf1;
import defpackage.t9;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;

/* loaded from: classes2.dex */
public final class VungleApiImpl implements VungleApi {
    private static final String VUNGLE_VERSION = "7.0.0";
    private final String appId;
    private final EmptyResponseConverter emptyResponseConverter = new EmptyResponseConverter();
    private final Call.Factory okHttpClient;
    public static final Companion Companion = new Companion(null);
    private static final qf1 json = t9.d(VungleApiImpl$Companion$json$1.INSTANCE);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public VungleApiImpl(String str, Call.Factory factory) {
        this.appId = str;
        this.okHttpClient = factory;
    }

    private final Request.Builder defaultBuilder(String str, String str2) {
        boolean z;
        Request.Builder addHeader = new Request.Builder().url(str2).addHeader("User-Agent", str).addHeader("Vungle-Version", "7.0.0").addHeader("Content-Type", "application/json");
        String str3 = this.appId;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            addHeader.addHeader("X-Vungle-App-Id", this.appId);
        }
        return addHeader;
    }

    private final Request.Builder defaultProtoBufBuilder(String str, String str2) {
        boolean z;
        Request.Builder addHeader = new Request.Builder().url(str2).addHeader("User-Agent", str).addHeader("Vungle-Version", "7.0.0").addHeader("Content-Type", "application/x-protobuf");
        String str3 = this.appId;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            addHeader.addHeader("X-Vungle-App-Id", this.appId);
        }
        return addHeader;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<AdPayload> ads(String str, String str2, CommonRequestBody commonRequestBody) {
        try {
            qf1 qf1Var = json;
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(str, str2).post(RequestBody.Companion.create(qf1Var.b(pd0.K(qf1Var.f3990b, gi2.b(CommonRequestBody.class)), commonRequestBody), (MediaType) null)).build()), new JsonConverter(gi2.b(AdPayload.class)));
        } catch (Exception unused) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(101, "Error with url: ".concat(str2), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<ConfigPayload> config(String str, String str2, CommonRequestBody commonRequestBody) {
        try {
            qf1 qf1Var = json;
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(str, str2).post(RequestBody.Companion.create(qf1Var.b(pd0.K(qf1Var.f3990b, gi2.b(CommonRequestBody.class)), commonRequestBody), (MediaType) null)).build()), new JsonConverter(gi2.b(ConfigPayload.class)));
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAppId() {
        return this.appId;
    }

    public final Call.Factory getOkHttpClient$vungle_ads_release() {
        return this.okHttpClient;
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> pingTPAT(String str, String str2) {
        return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(str, HttpUrl.Companion.get(str2).newBuilder().build().toString()).get().build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> ri(String str, String str2, CommonRequestBody commonRequestBody) {
        try {
            qf1 qf1Var = json;
            return new OkHttpCall(this.okHttpClient.newCall(defaultBuilder(str, str2).post(RequestBody.Companion.create(qf1Var.b(pd0.K(qf1Var.f3990b, gi2.b(CommonRequestBody.class)), commonRequestBody), (MediaType) null)).build()), this.emptyResponseConverter);
        } catch (Exception unused) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(101, "Error with url: ".concat(str2), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendErrors(String str, String str2, RequestBody requestBody) {
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(str, HttpUrl.Companion.get(str2).newBuilder().build().toString()).post(requestBody).build()), this.emptyResponseConverter);
    }

    @Override // com.vungle.ads.internal.network.VungleApi
    public Call<Void> sendMetrics(String str, String str2, RequestBody requestBody) {
        return new OkHttpCall(this.okHttpClient.newCall(defaultProtoBufBuilder(str, HttpUrl.Companion.get(str2).newBuilder().build().toString()).post(requestBody).build()), this.emptyResponseConverter);
    }
}
