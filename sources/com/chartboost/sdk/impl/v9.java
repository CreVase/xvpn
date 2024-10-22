package com.chartboost.sdk.impl;

import android.database.Cursor;
import defpackage.jm0;
import defpackage.km0;
import defpackage.qm0;
import defpackage.sg0;
import defpackage.tg0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class v9 {
    public static final List<s3> a(km0 km0Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            sg0 sg0Var = (sg0) km0Var;
            Cursor cursor = sg0Var.f4336a;
            if (!cursor.moveToPosition(cursor.getPosition() + 1)) {
                return arrayList;
            }
            arrayList.add(t3.a(tg0.e(sg0Var.f4336a)));
        }
    }

    public static final List<s3> a(qm0 qm0Var) {
        return a(((tg0) qm0Var.f4021b).g(new int[0]));
    }

    public static final s3 a(qm0 qm0Var, String str) {
        jm0 d = ((tg0) qm0Var.f4021b).d(str);
        if (d != null) {
            return t3.a(d);
        }
        return null;
    }
}
