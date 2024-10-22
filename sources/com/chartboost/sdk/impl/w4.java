package com.chartboost.sdk.impl;

import com.chartboost.sdk.impl.t8;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class w4 {

    /* renamed from: a, reason: collision with root package name */
    public final t7 f1258a;

    public w4(t7 t7Var) {
        this.f1258a = t7Var;
    }

    public List<DataUseConsent> a(t8.b bVar) {
        HashMap<String, DataUseConsent> a2 = this.f1258a.a();
        List<DataUseConsent> a3 = a(a2);
        ArrayList arrayList = new ArrayList();
        HashSet<String> b2 = b(bVar);
        if (b2 != null) {
            for (DataUseConsent dataUseConsent : a3) {
                if (a(b2, dataUseConsent)) {
                    arrayList.add(dataUseConsent);
                }
            }
        } else {
            if (a2.containsKey(CCPA.CCPA_STANDARD)) {
                arrayList.add(a2.get(CCPA.CCPA_STANDARD));
            }
            if (a2.containsKey(COPPA.COPPA_STANDARD)) {
                arrayList.add(a2.get(COPPA.COPPA_STANDARD));
            }
            if (a2.containsKey(LGPD.LGPD_STANDARD)) {
                arrayList.add(a2.get(LGPD.LGPD_STANDARD));
            }
        }
        return arrayList;
    }

    public final HashSet<String> b(t8.b bVar) {
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public final boolean a(HashSet<String> hashSet, DataUseConsent dataUseConsent) {
        if (hashSet.contains(dataUseConsent.getPrivacyStandard())) {
            return true;
        }
        f6.e("Chartboost", "DataUseConsent " + dataUseConsent.getPrivacyStandard() + " is not whitelisted.");
        return false;
    }

    public final List<DataUseConsent> a(HashMap<String, DataUseConsent> hashMap) {
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove(GDPR.GDPR_STANDARD);
        return new ArrayList(hashMap2.values());
    }
}
