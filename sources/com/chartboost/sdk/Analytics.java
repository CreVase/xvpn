package com.chartboost.sdk;

import android.util.Log;
import com.chartboost.sdk.impl.s2;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Analytics {
    public static final Analytics INSTANCE = new Analytics();

    /* loaded from: classes.dex */
    public enum CustomEventType {
        CustomEventType1,
        CustomEventType2,
        CustomEventType3
    }

    /* loaded from: classes.dex */
    public enum IAPPurchaseInfo {
        PRODUCT_ID,
        PRODUCT_TITLE,
        PRODUCT_DESCRIPTION,
        PRODUCT_PRICE,
        PRODUCT_CURRENCY_CODE,
        GOOGLE_PURCHASE_DATA,
        GOOGLE_PURCHASE_SIGNATURE,
        AMAZON_PURCHASE_TOKEN,
        AMAZON_USER_ID
    }

    /* loaded from: classes.dex */
    public enum IAPType {
        GOOGLE_PLAY,
        AMAZON
    }

    /* loaded from: classes.dex */
    public enum LevelType {
        HIGHEST_LEVEL_REACHED(1),
        CURRENT_AREA(2),
        CHARACTER_LEVEL(3),
        OTHER_SEQUENTIAL(4),
        OTHER_NONSEQUENTIAL(5);

        private final int levelType;

        LevelType(int i) {
            this.levelType = i;
        }

        public final int getLevelType() {
            return this.levelType;
        }
    }

    /* loaded from: classes.dex */
    public enum MiscRevenueGeneratingEventType {
        MiscRevenueGeneratingEventType1,
        MiscRevenueGeneratingEventType2,
        MiscRevenueGeneratingEventType3
    }

    private Analytics() {
    }

    public static final void trackInAppAmazonStorePurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (!Chartboost.isSdkStarted()) {
            Log.e("PostInstallTracker", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
        } else {
            s2.f1122b.j().a().a(str5, str, str2, str3, str4, null, null, str6, str7, IAPType.AMAZON);
        }
    }

    public static final void trackInAppGooglePlayPurchaseEvent(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (!Chartboost.isSdkStarted()) {
            Log.e("PostInstallTracker", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
        } else {
            s2.f1122b.j().a().a(str5, str, str2, str3, str4, str6, str7, null, null, IAPType.GOOGLE_PLAY);
        }
    }

    public static final void trackInAppPurchaseEvent(HashMap<IAPPurchaseInfo, String> hashMap, IAPType iAPType) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!Chartboost.isSdkStarted()) {
            Log.e("PostInstallTracker", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
            return;
        }
        String str = hashMap.get(IAPPurchaseInfo.GOOGLE_PURCHASE_DATA);
        String str2 = hashMap.get(IAPPurchaseInfo.GOOGLE_PURCHASE_SIGNATURE);
        String str3 = hashMap.get(IAPPurchaseInfo.AMAZON_USER_ID);
        String str4 = hashMap.get(IAPPurchaseInfo.AMAZON_PURCHASE_TOKEN);
        String str5 = hashMap.get(IAPPurchaseInfo.PRODUCT_ID);
        String str6 = hashMap.get(IAPPurchaseInfo.PRODUCT_TITLE);
        String str7 = hashMap.get(IAPPurchaseInfo.PRODUCT_DESCRIPTION);
        String str8 = hashMap.get(IAPPurchaseInfo.PRODUCT_PRICE);
        String str9 = hashMap.get(IAPPurchaseInfo.PRODUCT_CURRENCY_CODE);
        boolean z5 = false;
        if (str5 != null && str5.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            if (str6 != null && str6.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                if (str7 != null && str7.length() != 0) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (str8 != null && str8.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (!z4) {
                        if (str9 == null || str9.length() == 0) {
                            z5 = true;
                        }
                        if (!z5) {
                            s2.f1122b.j().a().a(str5, str6, str7, str8, str9, str, str2, str3, str4, iAPType);
                            return;
                        }
                    }
                }
            }
        }
        Log.e("PostInstallTracker", "Null object is passed. Please pass a valid value object");
    }

    public static final void trackLevelInfo(String str, LevelType levelType, int i, String str2) {
        trackLevelInfo(str, levelType, i, 0, str2);
    }

    public static final void trackLevelInfo(String str, LevelType levelType, int i, int i2, String str2) {
        if (!Chartboost.isSdkStarted()) {
            Log.e("PostInstallTracker", "You need call Chartboost.startWithAppId() before tracking in-app purchases");
        } else {
            s2.f1122b.j().a().a(str, levelType, i, i2, str2, System.currentTimeMillis());
        }
    }
}
