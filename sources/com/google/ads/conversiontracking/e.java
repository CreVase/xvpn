package com.google.ads.conversiontracking;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.ads.conversiontracking.g;
import defpackage.qw3;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.LinkedList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class e {
    public final Context c;
    public final f f;

    /* renamed from: a, reason: collision with root package name */
    public final Object f1385a = new Object();
    public boolean d = true;
    public boolean e = false;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedList f1386b = new LinkedList();

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public long f1387a = 0;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar;
            try {
                e.this.e = true;
                while (true) {
                    synchronized (e.this.f1385a) {
                        while (e.this.f1386b.isEmpty()) {
                            e eVar = e.this;
                            eVar.d = false;
                            eVar.f1385a.wait();
                        }
                        e eVar2 = e.this;
                        eVar2.d = true;
                        dVar = (d) eVar2.f1386b.remove(0);
                    }
                    if (dVar != null) {
                        if (!g.a(e.this.c, dVar.e, dVar.f, dVar.f1384b)) {
                            e.this.f.a(dVar);
                        } else {
                            int a2 = e.this.a(dVar);
                            if (a2 == 2) {
                                e.this.f.a(dVar);
                                this.f1387a = 0L;
                            } else if (a2 == 0) {
                                e.this.f.c(dVar);
                                long j = this.f1387a;
                                if (j == 0) {
                                    this.f1387a = 1000L;
                                } else {
                                    this.f1387a = Math.min(j * 2, 60000L);
                                }
                                Thread.sleep(this.f1387a);
                            } else {
                                e.this.f.c(dVar);
                                this.f1387a = 0L;
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                e.this.e = false;
            }
        }
    }

    public e(Context context) {
        this.c = context;
        this.f = new f(context);
        new Thread(new b()).start();
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        long b2 = (g.b(context) + 300000) - System.currentTimeMillis();
        scheduledThreadPoolExecutor.scheduleAtFixedRate(new qw3(this), b2 > 0 ? b2 : 0L, 300000L, TimeUnit.MILLISECONDS);
    }

    public void a(String str, g.c cVar, boolean z, boolean z2, boolean z3) {
        d dVar = new d(str, cVar, z, z2);
        synchronized (this.f1385a) {
            if (!z3) {
                new Thread(new u(this, dVar)).start();
                return;
            }
            this.f.b(dVar);
            if (this.e && g.d(this.c)) {
                this.f1386b.add(dVar);
                this.d = true;
                this.f1385a.notify();
            }
        }
    }

    public final int a(d dVar) {
        int i;
        HttpURLConnection httpURLConnection;
        int responseCode;
        String valueOf = String.valueOf(dVar.g);
        Log.i("GoogleConversionReporter", valueOf.length() != 0 ? "Pinging: ".concat(valueOf) : new String("Pinging: "));
        String str = dVar.g;
        HttpURLConnection httpURLConnection2 = null;
        int i2 = 0;
        while (true) {
            i = 1;
            if (i2 < 5) {
                try {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                        try {
                            httpURLConnection.setInstanceFollowRedirects(false);
                            httpURLConnection.setConnectTimeout(60000);
                            httpURLConnection.setReadTimeout(60000);
                            httpURLConnection.setUseCaches(false);
                            responseCode = httpURLConnection.getResponseCode();
                            if (300 > responseCode || responseCode >= 400) {
                                break;
                            }
                            String headerField = httpURLConnection.getHeaderField("Location");
                            if (TextUtils.isEmpty(headerField)) {
                                Log.i("GoogleConversionReporter", "Unable to follow redirect, no Location header.");
                                httpURLConnection.disconnect();
                                return 0;
                            }
                            httpURLConnection.disconnect();
                            i2++;
                            httpURLConnection2 = httpURLConnection;
                            str = headerField;
                        } catch (IOException e) {
                            e = e;
                            httpURLConnection2 = httpURLConnection;
                            Log.e("GoogleConversionReporter", "Error sending ping", e);
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            return 0;
                        } catch (Throwable th) {
                            th = th;
                            httpURLConnection2 = httpURLConnection;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } else {
                Log.e("GoogleConversionReporter", "Ping failed; too many redirects.");
                return 1;
            }
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Receive response code ");
        sb.append(responseCode);
        Log.i("GoogleConversionReporter", sb.toString());
        if (200 <= responseCode && responseCode < 300) {
            i = 2;
        }
        if (i == 2 && !dVar.f1384b && dVar.f1383a) {
            g.a(this.c, dVar.e, dVar.f);
        }
        httpURLConnection.disconnect();
        return i;
    }
}
