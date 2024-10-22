package com.chartboost.sdk.impl;

import android.os.Build;
import android.os.Handler;
import com.vungle.ads.VungleError;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes.dex */
public class l6<T> implements Runnable, Comparable<l6> {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f961a;

    /* renamed from: b, reason: collision with root package name */
    public final m6 f962b;
    public final a2 c;
    public final h9 d;
    public final Handler e;
    public final v1<T> f;
    public x1<T> g;
    public y1 h;
    public boolean i = true;

    public l6(Executor executor, m6 m6Var, a2 a2Var, h9 h9Var, Handler handler, v1<T> v1Var) {
        this.f961a = executor;
        this.f962b = m6Var;
        this.c = a2Var;
        this.d = h9Var;
        this.e = handler;
        this.f = v1Var;
    }

    public static boolean a(int i) {
        return ((100 <= i && i < 200) || i == 204 || i == 304) ? false : true;
    }

    public final byte[] b(HttpsURLConnection httpsURLConnection) throws IOException {
        InputStream errorStream;
        byte[] bArr;
        InputStream inputStream = null;
        try {
            try {
                errorStream = httpsURLConnection.getInputStream();
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException unused2) {
            errorStream = httpsURLConnection.getErrorStream();
        }
        InputStream inputStream2 = errorStream;
        if (inputStream2 != null) {
            bArr = z2.a(new BufferedInputStream(inputStream2));
        } else {
            bArr = new byte[0];
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            } catch (IOException unused3) {
            }
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(javax.net.ssl.HttpsURLConnection r7) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.l6.c(javax.net.ssl.HttpsURLConnection):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00fd A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:47:0x00aa, B:49:0x00b2, B:50:0x00d1, B:55:0x00c4, B:34:0x00f5, B:36:0x00fd, B:37:0x011c, B:42:0x010f, B:9:0x004a, B:11:0x0052, B:15:0x0064, B:24:0x006d, B:25:0x0087), top: B:8:0x004a, inners: #4, #6, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010f A[Catch: all -> 0x0145, TryCatch #1 {all -> 0x0145, blocks: (B:47:0x00aa, B:49:0x00b2, B:50:0x00d1, B:55:0x00c4, B:34:0x00f5, B:36:0x00fd, B:37:0x011c, B:42:0x010f, B:9:0x004a, B:11:0x0052, B:15:0x0064, B:24:0x006d, B:25:0x0087), top: B:8:0x004a, inners: #4, #6, #4 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.l6.run():void");
    }

    public final void a(String str, String str2) {
        try {
            a();
            y3.d(new j3(str, str2, "", ""));
        } catch (Exception unused) {
        }
    }

    public final void a() {
        v1<T> v1Var = this.f;
        if (v1Var == null || v1Var.e == null || !(v1Var instanceof pa)) {
            return;
        }
        File file = new File(this.f.e.getParentFile(), this.f.e.getName() + ".tmp");
        if (file.exists()) {
            file.delete();
        }
    }

    public final y1 a(v1<T> v1Var) throws IOException {
        int i = VungleError.DEFAULT;
        int i2 = 0;
        while (true) {
            try {
                return a(v1Var, i);
            } catch (SocketTimeoutException e) {
                if (i2 >= 1) {
                    throw e;
                }
                i *= 2;
                i2++;
            }
        }
    }

    public final y1 a(v1<T> v1Var, int i) throws IOException {
        this.i = true;
        w1 a2 = v1Var.a();
        Map<String, String> map = a2.f1256a;
        HttpsURLConnection a3 = this.f962b.a(v1Var);
        a3.setSSLSocketFactory(d2.a());
        a3.setConnectTimeout(i);
        a3.setReadTimeout(i);
        a3.setUseCaches(false);
        a3.setDoInput(true);
        try {
            a(map, a3);
            a3.setRequestMethod(v1Var.c());
            a(a2, a3);
            long b2 = this.d.b();
            try {
                int responseCode = a3.getResponseCode();
                long b3 = this.d.b();
                v1Var.g = b3 - b2;
                if (responseCode != -1) {
                    return new y1(responseCode, a(a3, responseCode, b3));
                }
                throw new IOException("Could not retrieve response code from HttpsURLConnection.");
            } catch (Throwable th) {
                v1Var.g = this.d.b() - b2;
                throw th;
            }
        } finally {
            a3.disconnect();
        }
    }

    public final void a(Map<String, String> map, HttpsURLConnection httpsURLConnection) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpsURLConnection.addRequestProperty(str, map.get(str));
            }
        }
    }

    public final void a(w1 w1Var, HttpsURLConnection httpsURLConnection) throws IOException {
        if (!"POST".equals(this.f.c()) || w1Var.f1257b == null) {
            return;
        }
        httpsURLConnection.setDoOutput(true);
        httpsURLConnection.setFixedLengthStreamingMode(w1Var.f1257b.length);
        String str = w1Var.c;
        if (str != null) {
            httpsURLConnection.addRequestProperty("Content-Type", str);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            dataOutputStream.write(w1Var.f1257b);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] a(HttpsURLConnection httpsURLConnection, int i, long j) throws IOException {
        byte[] bArr;
        byte[] bArr2 = new byte[0];
        try {
            if (!a(i)) {
                bArr = new byte[0];
            } else {
                if (this.f.e != null) {
                    c(httpsURLConnection);
                    return bArr2;
                }
                bArr = b(httpsURLConnection);
            }
            bArr2 = bArr;
            return bArr2;
        } finally {
            this.f.h = this.d.b() - j;
        }
    }

    public final void a(String str, long j) {
        if (this.i) {
            this.i = false;
            this.f.a(str, j);
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(l6 l6Var) {
        return this.f.d().b() - l6Var.f.d().b();
    }

    public final long a(HttpsURLConnection httpsURLConnection) {
        long contentLengthLong;
        if (Build.VERSION.SDK_INT >= 24) {
            contentLengthLong = httpsURLConnection.getContentLengthLong();
            return contentLengthLong;
        }
        return httpsURLConnection.getContentLength();
    }
}
