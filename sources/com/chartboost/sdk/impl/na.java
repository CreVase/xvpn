package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.ka;
import com.chartboost.sdk.impl.pa;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.ch3;
import defpackage.d20;
import defpackage.fl;
import defpackage.hx2;
import defpackage.i23;
import defpackage.m20;
import defpackage.nw3;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class na implements pa.a, ka {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f1017a;

    /* renamed from: b, reason: collision with root package name */
    public final ca f1018b;
    public final a2 c;
    public final r4 d;
    public final d9 e;
    public final ScheduledExecutorService f;
    public final Queue<y9> g = new ConcurrentLinkedQueue();
    public final ConcurrentLinkedQueue<String> h = new ConcurrentLinkedQueue<>();
    public final ConcurrentHashMap<String, f0> i = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, y9> j = new ConcurrentHashMap<>();
    public AtomicInteger k = new AtomicInteger(1);
    public final Runnable l = new nw3(this, 10);

    /* loaded from: classes.dex */
    public enum a {
        CAN_NOT_DOWNLOAD,
        CREATE_ASSET_AND_DOWNLOAD,
        BRING_TO_FRONT_QUEUE_AND_DOWNLOAD
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1021a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.CAN_NOT_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CREATE_ASSET_AND_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.BRING_TO_FRONT_QUEUE_AND_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1021a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class c<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return fl.t(Long.valueOf(((y9) t).a()), Long.valueOf(((y9) t2).a()));
        }
    }

    public na(z1 z1Var, ca caVar, a2 a2Var, r4 r4Var, d9 d9Var, ScheduledExecutorService scheduledExecutorService) {
        this.f1017a = z1Var;
        this.f1018b = caVar;
        this.c = a2Var;
        this.d = r4Var;
        this.e = d9Var;
        this.f = scheduledExecutorService;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(Context context) {
        File[] d;
        r4 r4Var = this.d;
        if (r4Var == null || (d = r4Var.d()) == null) {
            return;
        }
        int length = d.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            File file = d[i];
            if (file.exists() && i23.R0(file.getName(), ".tmp", z)) {
                r4Var.a(file);
                return;
            }
            if (this.f1018b.a(file)) {
                r4Var.a(file);
            } else {
                this.j.put(file.getName(), new y9("", file.getName(), file, r4Var.c(), file.lastModified(), null, file.length(), 32, null));
            }
            i++;
            z = false;
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public y9 b(String str) {
        return this.j.get(str);
    }

    public final boolean c() {
        a2 a2Var = this.c;
        return (a2Var != null ? a2Var.e() : false) && !this.f1018b.g() && this.h.isEmpty();
    }

    public final y9 d(String str) {
        y9 y9Var;
        if (str == null) {
            y9Var = this.g.poll();
        } else {
            y9 y9Var2 = null;
            for (y9 y9Var3 : this.g) {
                if (m20.L(y9Var3.d(), str)) {
                    y9Var2 = y9Var3;
                }
            }
            y9Var = y9Var2;
        }
        y9 y9Var4 = y9Var;
        if (y9Var4 != null) {
            c(y9Var4);
        }
        return y9Var4;
    }

    public final boolean e(y9 y9Var) {
        r4 r4Var;
        if (y9Var == null || y9Var.e() == null || (r4Var = this.d) == null) {
            return false;
        }
        return r4Var.c(y9Var.e());
    }

    public final boolean f(y9 y9Var) {
        return this.e.b(y9Var.b(), y9Var.d());
    }

    public boolean g(y9 y9Var) {
        if (y9Var != null && e(y9Var)) {
            File e = y9Var.e();
            String d = y9Var.d();
            r4 r4Var = this.d;
            if (r4Var != null && r4Var.a(e)) {
                this.j.remove(d);
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h(y9 y9Var) {
        String str;
        str = oa.f1052a;
        f6.a(str, "startDownloadNow: " + y9Var.g());
        if (a(y9Var.d())) {
            p8.a("File already downloaded or downloading: " + y9Var.d());
            String g = y9Var.g();
            f0 remove = this.i.remove(g);
            if (remove != null) {
                remove.a(g);
                return;
            }
            return;
        }
        p8.a("Start downloading " + y9Var.g());
        this.f1018b.a();
        this.h.add(y9Var.g());
        this.f1017a.a(new pa(this.c, y9Var.e(), y9Var.g(), this, o7.NORMAL, this.f1017a.a()));
    }

    public final boolean b() {
        r4 r4Var = this.d;
        if (r4Var == null) {
            return false;
        }
        return this.f1018b.b(r4Var.b(r4Var.c()));
    }

    public final void c(y9 y9Var) {
        if (p8.f1074a.d()) {
            File file = new File(y9Var.f());
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public final void b(y9 y9Var) {
        String str;
        if (p8.f1074a.d()) {
            File file = new File(y9Var.f());
            try {
                file.createNewFile();
                file.setLastModified(c9.a());
            } catch (IOException e) {
                str = oa.f1052a;
                f6.e(str, "Error while creating queue empty file: " + e);
            }
        }
    }

    public final File d(y9 y9Var) {
        return this.e.a(y9Var.b(), y9Var.d());
    }

    public final void c(String str) {
        for (y9 y9Var : new LinkedList(this.g)) {
            if (y9Var != null && m20.L(y9Var.g(), str)) {
                this.g.remove(y9Var);
            }
        }
    }

    public final boolean b(String str, String str2) {
        if (this.g.size() <= 0) {
            return false;
        }
        for (y9 y9Var : this.g) {
            if (m20.L(y9Var.g(), str) && m20.L(y9Var.d(), str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.chartboost.sdk.impl.ka
    public synchronized void a(String str, String str2, boolean z, f0 f0Var) {
        String str3;
        str3 = oa.f1052a;
        f6.a(str3, "downloadVideoFile: ".concat(str));
        r4 r4Var = this.d;
        File c2 = r4Var != null ? r4Var.c() : null;
        r4 r4Var2 = this.d;
        int i = b.f1021a[a(str, str2, z, f0Var, a(str2), r4Var2 != null ? r4Var2.a(c2, str2) : null).ordinal()];
        if (i == 2) {
            a(str, str2, new File(c2, str2), c2);
            if (!z) {
                str2 = null;
            }
            a(str2, this.k.get(), z);
        } else if (i == 3) {
            ka.a.a(this, str2, 0, true, 2, null);
        }
    }

    public final a a(String str, String str2, boolean z, f0 f0Var, boolean z2, File file) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (z) {
            if (!z2) {
                str4 = oa.f1052a;
                f6.a(str4, "Not downloading for show operation: " + str2);
                if (f0Var != null) {
                    y9 y9Var = this.j.get(str2);
                    if (m20.L(y9Var != null ? y9Var.d() : null, str2) || this.i.containsKey(str)) {
                        this.i.put(str, f0Var);
                        return a.BRING_TO_FRONT_QUEUE_AND_DOWNLOAD;
                    }
                }
            } else {
                if (this.i.containsKey(str)) {
                    str7 = oa.f1052a;
                    f6.a(str7, "Already downloading for show operation: " + str2);
                    p8.a("Already downloading for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, f0Var);
                    return a.CAN_NOT_DOWNLOAD;
                }
                if (f0Var != null) {
                    str6 = oa.f1052a;
                    f6.a(str6, "Register callback for show operation: " + str2);
                    p8.a("Register callback for show operation: " + str2);
                    a(str, str2, file != null ? file.length() : 0L, f0Var);
                    return a.CAN_NOT_DOWNLOAD;
                }
            }
            if (f0Var != null) {
                str5 = oa.f1052a;
                f6.a(str5, "Register callback for show operation: " + str2);
                p8.a("Register callback for show operation: " + str2);
                this.i.put(str, f0Var);
            }
        } else if (b(str, str2) || z2) {
            str3 = oa.f1052a;
            f6.a(str3, "Already queued or downloading for cache operation: " + str2);
            p8.a("Already queued or downloading for cache operation: " + str2);
            return a.CAN_NOT_DOWNLOAD;
        }
        return a.CREATE_ASSET_AND_DOWNLOAD;
    }

    @Override // com.chartboost.sdk.impl.ka
    public void a(String str, int i, boolean z) {
        String str2;
        str2 = oa.f1052a;
        f6.a(str2, "startDownloadIfPossible: " + str);
        if (this.g.size() > 0) {
            if (!z && !c()) {
                p8.a("Can't cache next video at the moment");
                this.f.schedule(this.l, i * 5000, TimeUnit.MILLISECONDS);
                return;
            }
            y9 d = d(str);
            if (d != null) {
                h(d);
            }
        }
    }

    @Override // com.chartboost.sdk.impl.ka
    public boolean a(String str) {
        y9 b2 = b(str);
        return (b2 != null && f(b2)) || (b2 != null && e(b2));
    }

    @Override // com.chartboost.sdk.impl.ka
    public int a(y9 y9Var) {
        if (y9Var == null) {
            return 0;
        }
        if (e(y9Var)) {
            return 5;
        }
        File d = d(y9Var);
        long length = d != null ? d.length() : 0L;
        if (y9Var.c() == 0) {
            return 0;
        }
        return g8.a(((float) length) / ((float) y9Var.c()));
    }

    public final void a() {
        if (b()) {
            Iterator it = d20.O0(this.j.values(), new c()).iterator();
            while (it.hasNext()) {
                g((y9) it.next());
                if (!b()) {
                    return;
                }
            }
        }
    }

    public final void a(String str, String str2, File file, File file2) {
        File e;
        StringBuilder sb = new StringBuilder();
        r4 r4Var = this.d;
        sb.append((r4Var == null || (e = r4Var.e()) == null) ? null : e.getAbsolutePath());
        y9 y9Var = new y9(str, str2, file, file2, 0L, hx2.s(sb, File.separator, str2), 0L, 80, null);
        file.setLastModified(y9Var.a());
        b(y9Var);
        this.j.putIfAbsent(str2, y9Var);
        this.g.offer(y9Var);
    }

    @Override // com.chartboost.sdk.impl.pa.a
    public void a(String str, String str2, long j, f0 f0Var) {
        String str3;
        str3 = oa.f1052a;
        f6.a(str3, "tempFileIsReady: ".concat(str2));
        y9 b2 = b(str2);
        if (j > 0 && b2 != null) {
            b2.a(j);
        }
        if (b2 != null) {
            this.j.remove(str2);
            this.j.putIfAbsent(str2, b2);
        }
        if (f0Var == null) {
            f0Var = this.i.get(str);
        }
        if (f0Var != null) {
            f0Var.a(str);
        }
    }

    @Override // com.chartboost.sdk.impl.pa.a
    public void a(String str, String str2) {
        String str3;
        str3 = oa.f1052a;
        f6.a(str3, "onSuccess: ".concat(str));
        p8.a("Video downloaded success ".concat(str));
        a();
        this.h.remove(str);
        this.i.remove(str);
        this.k = new AtomicInteger(1);
        c(str);
        a((String) null, this.k.get(), false);
    }

    @Override // com.chartboost.sdk.impl.pa.a
    public void a(String str, String str2, CBError cBError) {
        String str3;
        ch3 ch3Var;
        String str4;
        String str5;
        File e;
        str3 = oa.f1052a;
        f6.a(str3, "onError: ".concat(str));
        String errorDesc = cBError != null ? cBError.getErrorDesc() : null;
        if (errorDesc == null) {
            errorDesc = "Unknown error";
        }
        y9 b2 = b(str2);
        if (b2 != null && (e = b2.e()) != null) {
            e.delete();
        }
        if (cBError == null || cBError.getError() != CBError.b.INTERNET_UNAVAILABLE) {
            c(str);
            f0 f0Var = this.i.get(str);
            if (f0Var != null) {
                f0Var.a(str);
                ch3Var = ch3.f636a;
            } else {
                ch3Var = null;
            }
            if (ch3Var == null) {
                str4 = oa.f1052a;
                f6.b(str4, "Missing callback on error");
            }
        } else if (b2 != null) {
            this.g.add(b2);
            b(b2);
        }
        this.i.remove(str);
        this.j.remove(str2);
        a((String) null, this.k.get(), false);
        str5 = oa.f1052a;
        f6.c(str5, "Video download failed: " + str + " with error " + errorDesc);
        p8.a("Video downloaded failed " + str + " with error " + errorDesc);
        this.h.remove(str);
    }

    public static final void a(na naVar) {
        naVar.a((String) null, naVar.k.incrementAndGet(), false);
    }
}
