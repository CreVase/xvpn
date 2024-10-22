package defpackage;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class y6 extends x6 {
    @Override // defpackage.x6
    public final Intent a(Object obj) {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", (String[]) obj);
    }

    @Override // defpackage.x6
    public final ja1 b(ComponentActivity componentActivity, Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        String[] strArr = (String[]) obj;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new ja1(dr0.f1824a, 1);
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (x80.checkSelfPermission(componentActivity, strArr[i]) == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z2 = false;
                    break;
                }
                i++;
            } else {
                z2 = true;
                break;
            }
        }
        if (z2) {
            int N = bx3.N(strArr.length);
            if (N < 16) {
                N = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(N);
            for (String str : strArr) {
                linkedHashMap.put(str, Boolean.TRUE);
            }
            return new ja1(linkedHashMap, 1);
        }
        return null;
    }

    @Override // defpackage.x6
    public final Object c(int i, Intent intent) {
        boolean z;
        dr0 dr0Var = dr0.f1824a;
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra != null && stringArrayExtra != null) {
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    if (i2 == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    arrayList.add(Boolean.valueOf(z));
                }
                ArrayList k1 = og.k1(stringArrayExtra);
                Iterator it = k1.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList2 = new ArrayList(Math.min(a20.C0(k1, 10), a20.C0(arrayList, 10)));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList2.add(new n42(it.next(), it2.next()));
                }
                return jq1.n0(arrayList2);
            }
            return dr0Var;
        }
        return dr0Var;
    }
}
