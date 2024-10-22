package com.google.android.gms.internal.measurement;

import defpackage.ar0;
import defpackage.g33;
import defpackage.h33;
import defpackage.i33;
import defpackage.jb1;
import defpackage.ob1;
import defpackage.qb1;
import defpackage.s20;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzha {
    public static final g33 zza;

    static {
        g33 i33Var;
        g33 g33Var = new g33() { // from class: com.google.android.gms.internal.measurement.zzhc
            @Override // defpackage.g33
            public final Object get() {
                return zzha.zza();
            }
        };
        if (!(g33Var instanceof i33) && !(g33Var instanceof h33)) {
            if (g33Var instanceof Serializable) {
                i33Var = new h33(g33Var);
            } else {
                i33Var = new i33(g33Var);
            }
            g33Var = i33Var;
        }
        zza = g33Var;
    }

    public static qb1 zza() {
        Collection<Map.Entry> entrySet = new s20().entrySet();
        if (entrySet.isEmpty()) {
            return ar0.f;
        }
        jb1 jb1Var = new jb1(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            ob1 l = ob1.l((Collection) entry.getValue());
            if (!l.isEmpty()) {
                jb1Var.b(key, l);
                i += l.size();
            }
        }
        return new qb1(jb1Var.a(), i, null);
    }
}
