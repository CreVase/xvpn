package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import defpackage.tb1;
import defpackage.vp;
import defpackage.wp;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzb {
    public static final int zza = Runtime.getRuntime().availableProcessors();

    public static int zza(Intent intent, String str) {
        if (intent == null) {
            zzj("ProxyBillingActivity", "Got null intent!");
            return 0;
        }
        return zzl(intent.getExtras(), "ProxyBillingActivity");
    }

    public static int zzb(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            zzi(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        zzj(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle zzc(boolean z, boolean z2, boolean z3, boolean z4, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static wp zzd(Intent intent, String str) {
        if (intent == null) {
            zzj("BillingHelper", "Got null intent!");
            vp a2 = wp.a();
            a2.f4875b = 6;
            a2.f4874a = "An internal error occurred.";
            return a2.a();
        }
        vp a3 = wp.a();
        a3.f4875b = zzb(intent.getExtras(), str);
        a3.f4874a = zzf(intent.getExtras(), str);
        return a3.a();
    }

    public static tb1 zze(Bundle bundle, String str) {
        if (bundle == null) {
            return new tb1();
        }
        zzl(bundle, "BillingClient");
        bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN");
        return new tb1();
    }

    public static String zzf(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            zzi(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        zzj(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String zzg(int i) {
        return zza.zza(i).toString();
    }

    public static List zzh(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList != null && stringArrayList2 != null) {
            zzi("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
            for (int i = 0; i < stringArrayList.size() && i < stringArrayList2.size(); i++) {
                Purchase zzm = zzm(stringArrayList.get(i), stringArrayList2.get(i));
                if (zzm != null) {
                    arrayList.add(zzm);
                }
            }
        } else {
            Purchase zzm2 = zzm(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (zzm2 == null) {
                zzi("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(zzm2);
        }
        return arrayList;
    }

    public static void zzi(String str, String str2) {
        if (Log.isLoggable(str, 2) && !str2.isEmpty()) {
            int i = 40000;
            while (!str2.isEmpty() && i > 0) {
                int min = Math.min(str2.length(), Math.min(4000, i));
                str2.substring(0, min);
                str2 = str2.substring(min);
                i -= min;
            }
        }
    }

    public static void zzj(String str, String str2) {
    }

    public static void zzk(String str, String str2, Throwable th) {
    }

    private static int zzl(Bundle bundle, String str) {
        if (bundle == null) {
            zzj(str, "Unexpected null bundle received!");
            return 0;
        }
        return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
    }

    private static Purchase zzm(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e) {
                zzj("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return null;
            }
        }
        zzi("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
