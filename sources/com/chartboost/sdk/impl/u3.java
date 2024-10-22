package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class u3 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f1172a;

    /* renamed from: b, reason: collision with root package name */
    public final z1 f1173b;
    public final a2 c;
    public final AtomicReference<t8> d;
    public final h9 e;
    public final r4 f;
    public int g = 1;
    public c1 h = null;
    public final PriorityQueue<b1> i = new PriorityQueue<>();

    /* loaded from: classes.dex */
    public class a implements Comparator<File> {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(File file, File file2) {
            return Long.valueOf(file.lastModified()).compareTo(Long.valueOf(file2.lastModified()));
        }
    }

    public u3(Executor executor, r4 r4Var, z1 z1Var, a2 a2Var, AtomicReference<t8> atomicReference, h9 h9Var) {
        this.f1172a = executor;
        this.f = r4Var;
        this.f1173b = z1Var;
        this.c = a2Var;
        this.d = atomicReference;
        this.e = h9Var;
    }

    public synchronized void a(o7 o7Var, Map<String, w0> map, AtomicInteger atomicInteger, x0 x0Var, String str) {
        long b2 = this.e.b();
        AtomicInteger atomicInteger2 = new AtomicInteger();
        AtomicReference atomicReference = new AtomicReference(x0Var);
        for (w0 w0Var : map.values()) {
            this.i.add(new b1(this.e, o7Var, w0Var.f1255b, w0Var.c, w0Var.f1254a, atomicInteger, atomicReference, b2, atomicInteger2, str));
            atomicReference = atomicReference;
            b2 = b2;
        }
        int i = this.g;
        if (i == 1 || i == 2) {
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void b() {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.u3.b():void");
    }

    public synchronized void c() {
        int i = this.g;
        if (i != 3) {
            if (i == 4) {
                f6.a("Downloader", "Change state to IDLE");
                this.g = 1;
                d();
            }
        } else {
            f6.a("Downloader", "Change state to DOWNLOADING");
            this.g = 2;
        }
    }

    public final void d() {
        b1 poll;
        b1 peek;
        if (this.h != null && (peek = this.i.peek()) != null && this.h.m.f716b.b() > peek.f716b.b() && this.h.b()) {
            this.i.add(this.h.m);
            this.h = null;
        }
        while (this.h == null && (poll = this.i.poll()) != null) {
            if (poll.g.get() > 0) {
                File file = new File(this.f.a().f1125a, poll.e);
                if (!file.exists() && !file.mkdirs() && !file.isDirectory()) {
                    f6.b("Downloader", "Unable to create directory " + file.getPath());
                    poll.a(this.f1172a, false);
                } else {
                    File file2 = new File(file, poll.c);
                    if (file2.exists()) {
                        this.f.d(file2);
                        poll.a(this.f1172a, true);
                    } else {
                        c1 c1Var = new c1(this, this.c, poll, file2, this.f1173b.a());
                        this.h = c1Var;
                        this.f1173b.a(c1Var);
                    }
                }
            }
        }
        if (this.h != null) {
            if (this.g != 2) {
                f6.a("Downloader", "Change state to DOWNLOADING");
                this.g = 2;
                return;
            }
            return;
        }
        if (this.g != 1) {
            f6.a("Downloader", "Change state to IDLE");
            this.g = 1;
        }
    }

    public synchronized void a(AtomicInteger atomicInteger) {
        atomicInteger.set(-10000);
        if (this.g == 2) {
            c1 c1Var = this.h;
            if ((c1Var.m.g == atomicInteger) && c1Var.b()) {
                this.h = null;
                d();
            }
        }
    }

    public synchronized void a() {
        int i = this.g;
        if (i == 1) {
            f6.a("Downloader", "Change state to PAUSED");
            this.g = 4;
        } else if (i == 2) {
            if (this.h.b()) {
                this.i.add(this.h.m);
                this.h = null;
                f6.a("Downloader", "Change state to PAUSED");
                this.g = 4;
            } else {
                f6.a("Downloader", "Change state to PAUSING");
                this.g = 3;
            }
        }
    }

    public synchronized void a(c1 c1Var, CBError cBError, y1 y1Var) {
        String str;
        int i = this.g;
        if (i == 2 || i == 3) {
            if (c1Var != this.h) {
                return;
            }
            b1 b1Var = c1Var.m;
            this.h = null;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            b1Var.j.addAndGet((int) timeUnit.toMillis(c1Var.f));
            b1Var.a(this.f1172a, cBError == null);
            timeUnit.toMillis(c1Var.g);
            timeUnit.toMillis(c1Var.h);
            if (cBError == null) {
                f6.a("Downloader", "Downloaded " + b1Var.d);
            } else {
                b1 b1Var2 = c1Var.m;
                String str2 = b1Var2 != null ? b1Var2.f : "";
                String errorDesc = cBError.getErrorDesc();
                StringBuilder sb = new StringBuilder("Failed to download ");
                sb.append(b1Var.d);
                if (y1Var != null) {
                    str = " Status code=" + y1Var.f1304a;
                } else {
                    str = "";
                }
                sb.append(str);
                sb.append(errorDesc != null ? " Error message=".concat(errorDesc) : "");
                f6.a("Downloader", sb.toString());
                y3.d(new w3("cache_asset_download_error", "Name: " + b1Var.c + " Url: " + b1Var.d + " Error: " + errorDesc, str2, ""));
            }
            if (this.g == 3) {
                f6.a("Downloader", "Change state to PAUSED");
                this.g = 4;
            } else {
                d();
            }
        }
    }
}
