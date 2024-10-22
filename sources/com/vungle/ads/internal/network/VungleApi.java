package com.vungle.ads.internal.network;

import androidx.annotation.Keep;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import okhttp3.RequestBody;

@Keep
/* loaded from: classes2.dex */
public interface VungleApi {
    Call<AdPayload> ads(String str, String str2, CommonRequestBody commonRequestBody);

    Call<ConfigPayload> config(String str, String str2, CommonRequestBody commonRequestBody);

    Call<Void> pingTPAT(String str, String str2);

    Call<Void> ri(String str, String str2, CommonRequestBody commonRequestBody);

    Call<Void> sendErrors(String str, String str2, RequestBody requestBody);

    Call<Void> sendMetrics(String str, String str2, RequestBody requestBody);
}
