package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.internal.zzij;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class dx3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ob1 f1859a;

    /* renamed from: b, reason: collision with root package name */
    public static final ji2 f1860b;
    public static final ji2 c;
    public static final ji2 d;

    static {
        int i = ob1.c;
        Object[] objArr = new Object[15];
        objArr[0] = "_in";
        objArr[1] = "_xa";
        objArr[2] = "_xu";
        objArr[3] = "_aq";
        objArr[4] = "_aa";
        objArr[5] = "_ai";
        System.arraycopy(new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}, 0, objArr, 6, 9);
        f1859a = ob1.k(15, objArr);
        db1 db1Var = hb1.f2394b;
        Object[] objArr2 = {"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd"};
        cp3.h(7, objArr2);
        f1860b = hb1.j(7, objArr2);
        Object[] objArr3 = {"auto", "app", "am"};
        cp3.h(3, objArr3);
        c = hb1.j(3, objArr3);
        d = hb1.r("_r", "_dbg");
        m20.T(4, "initialCapacity");
        Object[] objArr4 = new Object[4];
        String[] strArr = zzij.zza;
        int length = strArr.length;
        cp3.h(length, strArr);
        int i2 = length + 0;
        if (objArr4.length < i2) {
            objArr4 = Arrays.copyOf(objArr4, pe0.q(objArr4.length, i2));
        }
        System.arraycopy(strArr, 0, objArr4, 0, length);
        int i3 = length + 0;
        String[] strArr2 = zzij.zzb;
        int length2 = strArr2.length;
        cp3.h(length2, strArr2);
        int i4 = i3 + length2;
        if (objArr4.length < i4) {
            objArr4 = Arrays.copyOf(objArr4, pe0.q(objArr4.length, i4));
        }
        System.arraycopy(strArr2, 0, objArr4, i3, length2);
        hb1.j(i3 + length2, objArr4);
        hb1.r("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static boolean a(String str, Bundle bundle) {
        if (f1860b.contains(str)) {
            return false;
        }
        ji2 ji2Var = d;
        int size = ji2Var.size();
        int i = 0;
        while (i < size) {
            Object obj = ji2Var.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Bundle bundle, String str, String str2) {
        char c2;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!(!c.contains(str))) {
            return false;
        }
        ji2 ji2Var = d;
        int size = ji2Var.size();
        int i = 0;
        while (i < size) {
            Object obj = ji2Var.get(i);
            i++;
            if (bundle.containsKey((String) obj)) {
                return false;
            }
        }
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals(AppMeasurement.FIAM_ORIGIN)) {
                    c2 = 2;
                }
                c2 = 65535;
            } else {
                if (str.equals("fdl")) {
                    c2 = 1;
                }
                c2 = 65535;
            }
        } else {
            if (str.equals(AppMeasurement.FCM_ORIGIN)) {
                c2 = 0;
            }
            c2 = 65535;
        }
        if (c2 != 0) {
            if (c2 != 1) {
                if (c2 != 2) {
                    return false;
                }
                bundle.putString("_cis", "fiam_integration");
                return true;
            }
            bundle.putString("_cis", "fdl_integration");
            return true;
        }
        bundle.putString("_cis", "fcm_integration");
        return true;
    }
}
