package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.Uri;
import com.chartboost.sdk.impl.p2;
import com.chartboost.sdk.impl.pa;
import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.video.repository.exoplayer.VideoRepositoryDownloadService;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.scheduler.Requirements;
import defpackage.ch3;
import defpackage.cr0;
import defpackage.d20;
import defpackage.db1;
import defpackage.dr0;
import defpackage.hb1;
import defpackage.he0;
import defpackage.i23;
import defpackage.ji1;
import defpackage.ji2;
import defpackage.jm0;
import defpackage.jt;
import defpackage.m20;
import defpackage.ng0;
import defpackage.o41;
import defpackage.om0;
import defpackage.qm0;
import defpackage.wm0;
import defpackage.x31;
import defpackage.yd0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class e4 implements c4, om0, p2.b {

    /* renamed from: a, reason: collision with root package name */
    public final d4 f788a;

    /* renamed from: b, reason: collision with root package name */
    public qm0 f789b;
    public Context c;
    public yd0 d;
    public i4 e;
    public q4 f;
    public volatile List<? extends pa.a> g;
    public volatile Map<String, Integer> h;

    /* loaded from: classes.dex */
    public static final class a extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s3 f790a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s3 s3Var) {
            super(1);
            this.f790a = s3Var;
        }

        public final void a(pa.a aVar) {
            aVar.a(this.f790a.f(), this.f790a.b());
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pa.a) obj);
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s3 f791a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CBError f792b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s3 s3Var, CBError cBError) {
            super(1);
            this.f791a = s3Var;
            this.f792b = cBError;
        }

        public final void a(pa.a aVar) {
            aVar.a(this.f791a.f(), this.f791a.b(), this.f792b);
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pa.a) obj);
            return ch3.f636a;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends ji1 implements x31 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s3 f793a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(s3 s3Var) {
            super(1);
            this.f793a = s3Var;
        }

        public final void a(pa.a aVar) {
            aVar.a(this.f793a.f(), this.f793a.b(), 0L, null);
        }

        @Override // defpackage.x31
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pa.a) obj);
            return ch3.f636a;
        }
    }

    public e4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.chartboost.sdk.impl.c4
    public void a(pa.a aVar) {
        this.g = d20.N0(aVar, this.g);
    }

    public final void b(y9 y9Var) {
        Map map;
        Map<String, Integer> map2 = this.h;
        String g = y9Var.g();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.remove(g);
        int size = linkedHashMap.size();
        if (size != 0) {
            map = linkedHashMap;
            if (size == 1) {
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
            }
        } else {
            map = dr0.f1824a;
        }
        this.h = map;
    }

    @Override // com.chartboost.sdk.impl.c4
    public qm0 c() {
        qm0 qm0Var = this.f789b;
        if (qm0Var == null) {
            return null;
        }
        return qm0Var;
    }

    @Override // com.chartboost.sdk.impl.c4
    public float d(String str) {
        s3 b2 = b(str);
        return (b2 != null ? b2.c() : 0.0f) / 100.0f;
    }

    public final void e(s3 s3Var) {
        Context context = this.c;
        q4 q4Var = null;
        if (context == null) {
            context = null;
        }
        wm0.sendRemoveDownload(context, VideoRepositoryDownloadService.class, s3Var.b(), false);
        q4 q4Var2 = this.f;
        if (q4Var2 != null) {
            q4Var = q4Var2;
        }
        q4Var.d(s3Var);
    }

    @Override // defpackage.om0
    public void onDownloadChanged(qm0 qm0Var, jm0 jm0Var, Exception exc) {
        String str;
        str = f4.f816a;
        StringBuilder sb = new StringBuilder("onDownloadChanged() - state ");
        int i = jm0Var.f2791b;
        sb.append(t3.a(i));
        sb.append(", finalException ");
        sb.append(exc);
        f6.a(str, sb.toString());
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            d(t3.a(jm0Var));
                            return;
                        }
                        return;
                    }
                    a(t3.a(jm0Var), exc);
                    return;
                }
                b(t3.a(jm0Var));
                return;
            }
            c(t3.a(jm0Var));
            return;
        }
        q4 q4Var = this.f;
        if (q4Var == null) {
            q4Var = null;
        }
        q4Var.c(t3.a(jm0Var));
    }

    @Override // defpackage.om0
    public /* bridge */ /* synthetic */ void onDownloadRemoved(qm0 qm0Var, jm0 jm0Var) {
    }

    @Override // defpackage.om0
    public /* bridge */ /* synthetic */ void onDownloadsPausedChanged(qm0 qm0Var, boolean z) {
    }

    @Override // defpackage.om0
    public /* bridge */ /* synthetic */ void onIdle(qm0 qm0Var) {
    }

    @Override // defpackage.om0
    public /* bridge */ /* synthetic */ void onInitialized(qm0 qm0Var) {
    }

    @Override // defpackage.om0
    public /* bridge */ /* synthetic */ void onRequirementsStateChanged(qm0 qm0Var, Requirements requirements, int i) {
    }

    @Override // defpackage.om0
    public /* bridge */ /* synthetic */ void onWaitingForRequirementsChanged(qm0 qm0Var, boolean z) {
    }

    public e4(d4 d4Var) {
        this.f788a = d4Var;
        this.g = cr0.f1659a;
        this.h = dr0.f1824a;
    }

    public final void a(int i, String str, x31 x31Var) {
        Map<String, Integer> map;
        for (pa.a aVar : this.g) {
            Integer num = this.h.get(str);
            if (num == null || num.intValue() != i) {
                Map<String, Integer> map2 = this.h;
                Integer valueOf = Integer.valueOf(i);
                if (map2.isEmpty()) {
                    map = Collections.singletonMap(str, valueOf);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                    linkedHashMap.put(str, valueOf);
                    map = linkedHashMap;
                }
                this.h = map;
                x31Var.invoke(aVar);
            }
        }
    }

    public final void c(y9 y9Var) {
        qm0 qm0Var = this.f789b;
        if (qm0Var == null) {
            qm0Var = null;
        }
        for (s3 s3Var : v9.a(qm0Var)) {
            if (!m20.L(s3Var.b(), y9Var.d())) {
                a(s3Var, r3.FORCED_OUT);
            }
        }
    }

    public final void d(s3 s3Var) {
        String str;
        Map map;
        str = f4.f816a;
        f6.a(str, "downloadRemoved() - download " + s3Var + ", listeners: " + this.g);
        q4 q4Var = this.f;
        if (q4Var == null) {
            q4Var = null;
        }
        q4Var.d(s3Var);
        Map<String, Integer> map2 = this.h;
        String f = s3Var.f();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        linkedHashMap.remove(f);
        int size = linkedHashMap.size();
        if (size != 0) {
            map = linkedHashMap;
            if (size == 1) {
                Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
                map = Collections.singletonMap(entry.getKey(), entry.getValue());
            }
        } else {
            map = dr0.f1824a;
        }
        this.h = map;
    }

    public /* synthetic */ e4(d4 d4Var, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? new d4(null, null, null, null, null, null, null, null, null, 511, null) : d4Var);
    }

    public final void c(s3 s3Var) {
        String str;
        str = f4.f816a;
        f6.a(str, "notifyTempFileIsReady() - download " + s3Var + ", listeners: " + this.g);
        StringBuilder sb = new StringBuilder("Start downloading ");
        sb.append(s3Var.f());
        p8.a(sb.toString());
        q4 q4Var = this.f;
        if (q4Var == null) {
            q4Var = null;
        }
        q4Var.e(s3Var);
        a(2, s3Var.f(), new c(s3Var));
    }

    @Override // com.chartboost.sdk.impl.c4
    public yd0 b() {
        yd0 yd0Var = this.d;
        if (yd0Var == null) {
            return null;
        }
        return yd0Var;
    }

    @Override // com.chartboost.sdk.impl.c4
    public s3 b(String str) {
        qm0 qm0Var = this.f789b;
        if (qm0Var == null) {
            qm0Var = null;
        }
        return v9.a(qm0Var, str);
    }

    public final void b(s3 s3Var) {
        String str;
        str = f4.f816a;
        f6.a(str, "notifyDownloadCompleted() - download " + s3Var + ", listeners: " + this.g);
        StringBuilder sb = new StringBuilder("Video downloaded success ");
        sb.append(s3Var.f());
        p8.a(sb.toString());
        a(3, s3Var.f(), new a(s3Var));
    }

    @Override // com.chartboost.sdk.impl.p2.b
    public void c(String str) {
        qm0 qm0Var = this.f789b;
        Object obj = null;
        if (qm0Var == null) {
            qm0Var = null;
        }
        Iterator<T> it = v9.a(qm0Var).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m20.L(((s3) next).f(), str)) {
                obj = next;
                break;
            }
        }
        s3 s3Var = (s3) obj;
        if (s3Var != null) {
            e(s3Var);
        }
    }

    @Override // com.chartboost.sdk.impl.c4
    public synchronized void a(Context context) {
        String str;
        str = f4.f816a;
        f6.a(str, "initialize()");
        if (this.f789b != null) {
            return;
        }
        this.f788a.h().invoke();
        this.c = context.getApplicationContext();
        d4 d4Var = this.f788a;
        he0 he0Var = (he0) d4Var.c().invoke(context);
        this.e = (i4) d4Var.f().invoke(context);
        o41 b2 = d4Var.b();
        i4 i4Var = this.e;
        i4 i4Var2 = null;
        if (i4Var == null) {
            i4Var = null;
        }
        jt jtVar = (jt) b2.invoke(i4Var, d4Var.i(), he0Var, this);
        this.d = (yd0) d4Var.a().invoke(jtVar, d4Var.g());
        x31 e = d4Var.e();
        i4 i4Var3 = this.e;
        if (i4Var3 != null) {
            i4Var2 = i4Var3;
        }
        this.f = (q4) e.invoke(i4Var2);
        this.f789b = (qm0) d4Var.d().invoke(context, he0Var, jtVar, d4Var.g(), this);
    }

    public final void b(y9 y9Var, r3 r3Var) {
        String str;
        str = f4.f816a;
        f6.a(str, "VideoAsset.addDownload() - videoAsset " + y9Var + ", stopReason " + r3Var);
        if (!i23.b1(y9Var.g())) {
            Context context = this.c;
            if (context == null) {
                context = null;
            }
            String d = y9Var.d();
            Uri parse = Uri.parse(y9Var.g());
            db1 db1Var = hb1.f2394b;
            wm0.sendAddDownload(context, VideoRepositoryDownloadService.class, new DownloadRequest(d, parse, null, ji2.e, null, null, null), r3Var.b(), false);
        }
    }

    public final void b(List<s3> list) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            e((s3) it.next());
        }
    }

    @Override // com.chartboost.sdk.impl.c4
    public void a() {
        qm0 qm0Var = this.f789b;
        if (qm0Var == null) {
            qm0Var = null;
        }
        a(v9.a(qm0Var));
    }

    @Override // com.chartboost.sdk.impl.c4
    public boolean a(String str) {
        s3 b2 = b(str);
        return b2 != null && (b2.d() == 3 || b2.d() == 2);
    }

    @Override // com.chartboost.sdk.impl.c4
    public void a(y9 y9Var, r3 r3Var) {
        String str;
        str = f4.f816a;
        f6.a(str, "addDownload() - asset: " + y9Var + ", stopReason " + r3Var);
        b(y9Var, r3Var);
    }

    @Override // com.chartboost.sdk.impl.c4
    public void a(y9 y9Var) {
        String str;
        str = f4.f816a;
        f6.a(str, "startDownload() - asset: " + y9Var);
        b(y9Var);
        c(y9Var);
        a(this, y9Var, null, 1, null);
    }

    @Override // com.chartboost.sdk.impl.c4
    public void a(r3 r3Var) {
        s3 a2;
        qm0 qm0Var = this.f789b;
        if (qm0Var == null) {
            qm0Var = null;
        }
        jm0 jm0Var = (jm0) d20.H0(qm0Var.m);
        if (jm0Var == null || (a2 = t3.a(jm0Var)) == null) {
            return;
        }
        a(a2, r3Var);
    }

    public final void a(s3 s3Var, Exception exc) {
        CBError a2 = a(exc);
        p8.a("Video downloaded failed " + s3Var.f() + " with error " + a2.getErrorDesc());
        a(4, s3Var.f(), new b(s3Var, a2));
    }

    public final CBError a(Exception exc) {
        if (exc instanceof IOException) {
            return new CBError(CBError.b.NETWORK_FAILURE, z3.a(exc));
        }
        return new CBError(CBError.b.MISCELLANEOUS, z3.a(exc));
    }

    public final void a(s3 s3Var, r3 r3Var) {
        String str;
        str = f4.f816a;
        f6.a(str, "Download.sendStopReason() - download " + s3Var + ", stopReason " + r3Var);
        Context context = this.c;
        if (context == null) {
            context = null;
        }
        wm0.sendSetStopReason(context, VideoRepositoryDownloadService.class, s3Var.b(), r3Var.b(), false);
    }

    public static /* synthetic */ void a(e4 e4Var, y9 y9Var, r3 r3Var, int i, Object obj) {
        if ((i & 1) != 0) {
            r3Var = r3.NONE;
        }
        e4Var.b(y9Var, r3Var);
    }

    public final boolean a(s3 s3Var) {
        return this.f788a.i().a(s3Var.e());
    }

    public final List<s3> a(List<s3> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (a((s3) obj)) {
                arrayList.add(obj);
            }
        }
        b(arrayList);
        return list;
    }
}
