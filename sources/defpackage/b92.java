package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b92 {

    /* renamed from: a, reason: collision with root package name */
    public final String f428a;

    public b92(JSONObject jSONObject) {
        jSONObject.optString("basePlanId");
        jSONObject.optString("offerId").getClass();
        this.f428a = jSONObject.getString("offerIdToken");
        JSONArray jSONArray = jSONObject.getJSONArray("pricingPhases");
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new d5(optJSONObject));
                }
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("installmentPlanDetails");
        if (optJSONObject2 != null) {
            optJSONObject2.getInt("commitmentPaymentsCount");
            optJSONObject2.optInt("subsequentCommitmentPaymentsCount");
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("offerTags");
        if (optJSONArray != null) {
            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                arrayList2.add(optJSONArray.getString(i2));
            }
        }
    }
}
