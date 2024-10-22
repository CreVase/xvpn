package defpackage;

import com.google.android.gms.common.api.ApiException;

/* loaded from: classes2.dex */
public final class tc1 extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tc1(int r8) {
        /*
            r7 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.getDefault()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            r2[r3] = r4
            java.util.HashMap r3 = defpackage.sw3.f4424a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L4b
            java.util.HashMap r5 = defpackage.sw3.f4425b
            boolean r6 = r5.containsKey(r4)
            if (r6 != 0) goto L25
            goto L4b
        L25:
            java.lang.Object r3 = r3.get(r4)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r5.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#"
            r5.append(r3)
            r5.append(r4)
            java.lang.String r3 = ")"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            goto L4d
        L4b:
            java.lang.String r3 = ""
        L4d:
            r4 = 1
            r2[r4] = r3
            java.lang.String r3 = "Install Error(%d): %s"
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r8, r1)
            r7.<init>(r0)
            if (r8 == 0) goto L5f
            return
        L5f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "errorCode should not be 0."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tc1.<init>(int):void");
    }

    public final int a() {
        return super.getStatusCode();
    }
}
