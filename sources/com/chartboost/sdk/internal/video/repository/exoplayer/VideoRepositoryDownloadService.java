package com.chartboost.sdk.internal.video.repository.exoplayer;

import android.app.Notification;
import com.chartboost.sdk.impl.c4;
import com.chartboost.sdk.impl.n3;
import com.chartboost.sdk.impl.s2;
import defpackage.gn2;
import defpackage.ji1;
import defpackage.jm0;
import defpackage.k43;
import defpackage.qm0;
import defpackage.rm0;
import defpackage.sm0;
import defpackage.u02;
import defpackage.ui1;
import defpackage.v31;
import defpackage.wi3;
import defpackage.wm0;
import java.util.List;

/* loaded from: classes.dex */
public final class VideoRepositoryDownloadService extends wm0 {

    /* renamed from: a, reason: collision with root package name */
    public final ui1 f1348a = new k43(a.f1350a);

    /* renamed from: b, reason: collision with root package name */
    public sm0 f1349b;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements v31 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1350a = new a();

        public a() {
            super(0);
        }

        @Override // defpackage.v31
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c4 invoke() {
            return s2.f1122b.d().c();
        }
    }

    public final c4 a() {
        return (c4) this.f1348a.getValue();
    }

    @Override // defpackage.wm0
    public qm0 getDownloadManager() {
        c4 a2 = a();
        a2.a(this);
        return a2.c();
    }

    public Notification getForegroundNotification(List<jm0> list, int i) {
        sm0 sm0Var = this.f1349b;
        if (sm0Var == null) {
            sm0Var = null;
        }
        sm0Var.getClass();
        u02 u02Var = sm0Var.f4370a;
        u02Var.x.icon = 0;
        u02Var.c(null);
        u02Var.g = null;
        u02Var.f(null);
        u02Var.m = 100;
        u02Var.n = 0;
        u02Var.o = true;
        u02Var.d(2, true);
        u02Var.k = false;
        if (wi3.f5017a >= 31) {
            rm0.a(u02Var);
        }
        return u02Var.a();
    }

    @Override // defpackage.wm0
    public gn2 getScheduler() {
        return n3.a(this, 0, 2, (Object) null);
    }

    @Override // defpackage.wm0, android.app.Service
    public void onCreate() {
        s2.f1122b.a(this);
        super.onCreate();
        this.f1349b = new sm0(this);
    }
}
