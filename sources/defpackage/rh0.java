package defpackage;

import android.net.Uri;
import com.google.protobuf.v;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class rh0 extends nn {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final uy0 i;
    public final uy0 j;
    public final boolean k;
    public final t62 l;
    public HttpURLConnection m;
    public InputStream n;
    public boolean o;
    public int p;
    public long q;
    public long r;

    public rh0(String str, int i, int i2, uy0 uy0Var) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = false;
        this.i = uy0Var;
        this.l = null;
        this.j = new uy0(7);
        this.k = false;
    }

    public static void x(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = wi3.f5017a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                    superclass.getClass();
                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010e A[Catch: IOException -> 0x0137, TRY_LEAVE, TryCatch #2 {IOException -> 0x0137, blocks: (B:26:0x0106, B:28:0x010e), top: B:25:0x0106 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0179  */
    @Override // defpackage.zd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(defpackage.ce0 r21) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh0.c(ce0):long");
    }

    @Override // defpackage.zd0
    public final void close() {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                long j = this.q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.r;
                }
                x(this.m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = wi3.f5017a;
                    throw new f91(e, 2000, 3);
                }
            }
        } finally {
            this.n = null;
            t();
            if (this.o) {
                this.o = false;
                q();
            }
        }
    }

    @Override // defpackage.nn, defpackage.zd0
    public final Map k() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return oi2.g;
        }
        return new qh0(httpURLConnection.getHeaderFields());
    }

    @Override // defpackage.zd0
    public final Uri o() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.q;
            if (j != -1) {
                long j2 = j - this.r;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                } else {
                    return -1;
                }
            }
            InputStream inputStream = this.n;
            int i3 = wi3.f5017a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.r += read;
                p(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = wi3.f5017a;
            throw f91.a(e, 2);
        }
    }

    public final void t() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                sn1.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.m = null;
        }
    }

    public final URL u(URL url, String str) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new f91(hx2.p("Unsupported protocol redirect: ", protocol), 2001);
                }
                if (!this.e && !protocol.equals(url.getProtocol())) {
                    throw new f91("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
                return url2;
            } catch (MalformedURLException e) {
                throw new f91(e, 2001, 1);
            }
        }
        throw new f91("Null location redirect", 2001);
    }

    public final HttpURLConnection v(ce0 ce0Var) {
        boolean z;
        HttpURLConnection w;
        boolean z2;
        ce0 ce0Var2 = ce0Var;
        URL url = new URL(ce0Var2.f617a.toString());
        int i = ce0Var2.c;
        byte[] bArr = ce0Var2.d;
        long j = ce0Var2.f;
        long j2 = ce0Var2.g;
        if ((ce0Var2.i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.e;
        boolean z4 = this.k;
        if (!z3 && !z4) {
            return w(url, i, bArr, j, j2, z, true, ce0Var2.e);
        }
        int i2 = 0;
        URL url2 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                Map map = ce0Var2.e;
                URL url3 = url2;
                int i5 = i3;
                boolean z5 = z4;
                long j3 = j2;
                w = w(url2, i3, bArr2, j, j2, z, false, map);
                int responseCode = w.getResponseCode();
                String headerField = w.getHeaderField("Location");
                if ((i5 != 1 && i5 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    w.disconnect();
                    if (z5 && responseCode == 302) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        bArr2 = null;
                        i3 = 1;
                    } else {
                        i3 = i5;
                    }
                    url2 = u(url3, headerField);
                } else {
                    w.disconnect();
                    url2 = u(url3, headerField);
                    i3 = i5;
                }
                ce0Var2 = ce0Var;
                i2 = i4;
                z4 = z5;
                j2 = j3;
            } else {
                throw new f91(new NoRouteToHostException(hx2.m("Too many redirects: ", i4)), 2001, 1);
            }
        }
        return w;
    }

    public final HttpURLConnection w(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        String sb;
        String str;
        boolean z3;
        String str2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap hashMap = new HashMap();
        uy0 uy0Var = this.i;
        if (uy0Var != null) {
            hashMap.putAll(uy0Var.k());
        }
        hashMap.putAll(this.j.k());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = j91.f2725a;
        if (j == 0 && j2 == -1) {
            sb = null;
        } else {
            StringBuilder sb2 = new StringBuilder("bytes=");
            sb2.append(j);
            sb2.append("-");
            if (j2 != -1) {
                sb2.append((j + j2) - 1);
            }
            sb = sb2.toString();
        }
        if (sb != null) {
            httpURLConnection.setRequestProperty("Range", sb);
        }
        String str3 = this.h;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", str);
        httpURLConnection.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        httpURLConnection.setDoOutput(z3);
        int i2 = ce0.k;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    str2 = "HEAD";
                } else {
                    throw new IllegalStateException();
                }
            } else {
                str2 = "POST";
            }
        } else {
            str2 = "GET";
        }
        httpURLConnection.setRequestMethod(str2);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void y(long j) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[v.DEFAULT_BUFFER_SIZE];
        while (j > 0) {
            int min = (int) Math.min(j, v.DEFAULT_BUFFER_SIZE);
            InputStream inputStream = this.n;
            int i = wi3.f5017a;
            int read = inputStream.read(bArr, 0, min);
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j -= read;
                    p(read);
                } else {
                    throw new f91();
                }
            } else {
                throw new f91(new InterruptedIOException(), 2000, 1);
            }
        }
    }
}
