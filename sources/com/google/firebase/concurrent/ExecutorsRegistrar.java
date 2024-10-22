package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.a40;
import defpackage.ct1;
import defpackage.fk1;
import defpackage.h30;
import defpackage.hq;
import defpackage.qb0;
import defpackage.rd2;
import defpackage.um;
import defpackage.vi1;
import defpackage.wg3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes2.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final vi1 f1582a = new vi1(new a40(2));

    /* renamed from: b, reason: collision with root package name */
    public static final vi1 f1583b = new vi1(new a40(3));
    public static final vi1 c = new vi1(new a40(4));
    public static final vi1 d = new vi1(new a40(5));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        h30[] h30VarArr = new h30[4];
        rd2 rd2Var = new rd2(um.class, ScheduledExecutorService.class);
        int i = 2;
        int i2 = 0;
        int i3 = 1;
        rd2[] rd2VarArr = {new rd2(um.class, ExecutorService.class), new rd2(um.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(rd2Var);
        for (rd2 rd2Var2 : rd2VarArr) {
            if (rd2Var2 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet, rd2VarArr);
        h30VarArr[0] = new h30(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new qb0(i2), hashSet3);
        rd2 rd2Var3 = new rd2(hq.class, ScheduledExecutorService.class);
        rd2[] rd2VarArr2 = {new rd2(hq.class, ExecutorService.class), new rd2(hq.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(rd2Var3);
        for (rd2 rd2Var4 : rd2VarArr2) {
            if (rd2Var4 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet4, rd2VarArr2);
        h30VarArr[1] = new h30(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new qb0(i3), hashSet6);
        rd2 rd2Var5 = new rd2(fk1.class, ScheduledExecutorService.class);
        rd2[] rd2VarArr3 = {new rd2(fk1.class, ExecutorService.class), new rd2(fk1.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(rd2Var5);
        for (rd2 rd2Var6 : rd2VarArr3) {
            if (rd2Var6 == null) {
                throw new NullPointerException("Null interface");
            }
        }
        Collections.addAll(hashSet7, rd2VarArr3);
        h30VarArr[2] = new h30(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new qb0(i), hashSet9);
        ct1 a2 = h30.a(new rd2(wg3.class, Executor.class));
        a2.f = new qb0(3);
        h30VarArr[3] = a2.c();
        return Arrays.asList(h30VarArr);
    }
}
