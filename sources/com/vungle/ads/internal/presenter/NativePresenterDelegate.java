package com.vungle.ads.internal.presenter;

import java.util.List;

/* loaded from: classes2.dex */
public interface NativePresenterDelegate {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ List getTpatUrls$default(NativePresenterDelegate nativePresenterDelegate, String str, String str2, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str2 = null;
                }
                return nativePresenterDelegate.getTpatUrls(str, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getTpatUrls");
        }
    }

    String getCreativeId();

    String getDeepLinkUrl();

    String getEventId();

    List<String> getImpressionUrls();

    String getPlacementRefId();

    List<String> getTpatUrls(String str, String str2);
}
