package okhttp3.internal;

import defpackage.a20;
import defpackage.am3;
import defpackage.bx3;
import defpackage.cr0;
import defpackage.dr0;
import defpackage.dw2;
import defpackage.dx;
import defpackage.fl;
import defpackage.i23;
import defpackage.ii2;
import defpackage.jd1;
import defpackage.kd1;
import defpackage.lr;
import defpackage.m20;
import defpackage.mx2;
import defpackage.r32;
import defpackage.rr;
import defpackage.sr;
import defpackage.t9;
import defpackage.tf3;
import defpackage.ut0;
import defpackage.v31;
import defpackage.v73;
import defpackage.x31;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;

/* loaded from: classes2.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    public static final String userAgent = "okhttp/4.10.0";
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    private static final r32 UNICODE_BOMS = v73.m(v73.g("efbbbf"), v73.g("feff"), v73.g("fffe"), v73.g("0000ffff"), v73.g("ffff0000"));
    public static final TimeZone UTC = TimeZone.getTimeZone("GMT");
    private static final ii2 VERIFY_AS_IP_ADDRESS = new ii2("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    public static final boolean assertionsEnabled = false;
    public static final String okHttpName = i23.j1("Client", i23.i1("okhttp3.", OkHttpClient.class.getName()));

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
    }

    public static final <E> void addIfAbsent(List<E> list, E e) {
        if (!list.contains(e)) {
            list.add(e);
        }
    }

    public static final int and(byte b2, int i) {
        return b2 & i;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        return new ut0(eventListener, 17);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: asFactory$lambda-8, reason: not valid java name */
    public static final EventListener m246asFactory$lambda8(EventListener eventListener, Call call) {
        return eventListener;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        if (assertionsEnabled && !Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + obj);
        }
    }

    public static final boolean canParseAsIpAddress(String str) {
        return VERIFY_AS_IP_ADDRESS.a(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        if (m20.L(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && m20.L(httpUrl.scheme(), httpUrl2.scheme())) {
            return true;
        }
        return false;
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (timeUnit != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long millis = timeUnit.toMillis(j);
                if (millis <= 2147483647L) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (millis == 0 && j > 0) {
                        z4 = false;
                    }
                    if (z4) {
                        return (int) millis;
                    }
                    throw new IllegalArgumentException(m20.d1(" too small.", str).toString());
                }
                throw new IllegalArgumentException(m20.d1(" too large.", str).toString());
            }
            throw new IllegalStateException("unit == null".toString());
        }
        throw new IllegalStateException(m20.d1(" < 0", str).toString());
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) >= 0 && j2 <= j && j - j2 >= j3) {
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String str) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            if (i23.S0(str2, str.charAt(i))) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final boolean discard(mx2 mx2Var, int i, TimeUnit timeUnit) {
        try {
            return skipAll(mx2Var, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, x31 x31Var) {
        ArrayList arrayList = cr0.f1659a;
        for (T t : iterable) {
            if (((Boolean) x31Var.invoke(t)).booleanValue()) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList();
                }
                fl.c(arrayList).add(t);
            }
        }
        return arrayList;
    }

    public static final String format(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        boolean z;
        boolean z2;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && strArr2 != null) {
            if (strArr2.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    String str = strArr[i];
                    i++;
                    am3 am3Var = new am3(strArr2);
                    while (am3Var.hasNext()) {
                        if (comparator.compare(str, (String) am3Var.next()) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        String str = response.headers().get("Content-Length");
        if (str == null) {
            return -1L;
        }
        return toLongOrDefault(str, -1L);
    }

    public static final void ignoreIoExceptions(v31 v31Var) {
        try {
            v31Var.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        Object[] objArr = (Object[]) tArr.clone();
        return Collections.unmodifiableList(tf3.b0(Arrays.copyOf(objArr, objArr.length)));
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        boolean z;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (m20.W(charAt, 31) > 0 && m20.W(charAt, 127) < 0) {
                i = i2;
            } else {
                return i;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        while (i < i2) {
            int i3 = i + 1;
            char charAt = str.charAt(i);
            boolean z4 = false;
            if (charAt == '\t' || charAt == '\n') {
                z = true;
            } else {
                z = false;
            }
            if (z || charAt == '\f') {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 || charAt == '\r') {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || charAt == ' ') {
                z4 = true;
            }
            if (z4) {
                i = i3;
            } else {
                return i;
            }
        }
        return i2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                int i4 = i3 - 1;
                char charAt = str.charAt(i3);
                boolean z4 = false;
                if (charAt == '\t' || charAt == '\n') {
                    z = true;
                } else {
                    z = false;
                }
                if (z || charAt == '\f') {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 || charAt == '\r') {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3 || charAt == ' ') {
                    z4 = true;
                }
                if (z4) {
                    if (i3 == i) {
                        break;
                    }
                    i3 = i4;
                } else {
                    return i3 + 1;
                }
            }
        }
        return i;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        int length = str.length();
        while (i < length) {
            int i2 = i + 1;
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != '\t') {
                return i;
            }
            i = i2;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        ArrayList arrayList = new ArrayList();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            int length2 = strArr2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    String str2 = strArr2[i2];
                    i2++;
                    if (comparator.compare(str, str2) == 0) {
                        arrayList.add(str);
                        break;
                    }
                }
            }
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) {
        dw2 sink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            tf3.y(sink, null);
            return true;
        } catch (IOException unused) {
            tf3.y(sink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                tf3.y(sink, th);
                throw th2;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, sr srVar) {
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                boolean z = !srVar.j();
                socket.setSoTimeout(soTimeout);
                return z;
            } catch (Throwable th) {
                socket.setSoTimeout(soTimeout);
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final boolean isSensitiveHeader(String str) {
        if (!i23.U0(str, "Authorization") && !i23.U0(str, "Cookie") && !i23.U0(str, "Proxy-Authorization") && !i23.U0(str, "Set-Cookie")) {
            return false;
        }
        return true;
    }

    public static final void notify(Object obj) {
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        char c2 = 'a';
        if (!('a' <= c && c < 'g')) {
            c2 = 'A';
            if (!('A' <= c && c < 'G')) {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static final String peerName(Socket socket) {
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (remoteSocketAddress instanceof InetSocketAddress) {
            return ((InetSocketAddress) remoteSocketAddress).getHostName();
        }
        return remoteSocketAddress.toString();
    }

    public static final Charset readBomAsCharset(sr srVar, Charset charset) throws IOException {
        Charset charset2;
        int C = srVar.C(UNICODE_BOMS);
        if (C != -1) {
            if (C != 0) {
                if (C != 1) {
                    if (C != 2) {
                        if (C != 3) {
                            if (C == 4) {
                                Charset charset3 = dx.f1853a;
                                charset2 = dx.f1854b;
                                if (charset2 == null) {
                                    charset2 = Charset.forName("UTF-32LE");
                                    dx.f1854b = charset2;
                                }
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            Charset charset4 = dx.f1853a;
                            charset2 = dx.c;
                            if (charset2 == null) {
                                charset2 = Charset.forName("UTF-32BE");
                                dx.c = charset2;
                            }
                        }
                        return charset2;
                    }
                    return StandardCharsets.UTF_16LE;
                }
                return StandardCharsets.UTF_16BE;
            }
            return StandardCharsets.UTF_8;
        }
        return charset;
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        T t;
        Object readFieldOrNull;
        Class<?> cls2 = obj.getClass();
        while (true) {
            t = null;
            if (!m20.L(cls2, Object.class)) {
                try {
                    Field declaredField = cls2.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (!cls.isInstance(obj2)) {
                        break;
                    }
                    t = cls.cast(obj2);
                    break;
                } catch (NoSuchFieldException unused) {
                    cls2 = cls2.getSuperclass();
                }
            } else {
                if (m20.L(str, "delegate") || (readFieldOrNull = readFieldOrNull(obj, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(readFieldOrNull, cls, str);
            }
        }
        return t;
    }

    public static final int readMedium(sr srVar) throws IOException {
        return and(srVar.readByte(), 255) | (and(srVar.readByte(), 255) << 16) | (and(srVar.readByte(), 255) << 8);
    }

    public static final boolean skipAll(mx2 mx2Var, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long deadlineNanoTime = mx2Var.timeout().hasDeadline() ? mx2Var.timeout().deadlineNanoTime() - nanoTime : Long.MAX_VALUE;
        mx2Var.timeout().deadlineNanoTime(Math.min(deadlineNanoTime, timeUnit.toNanos(i)) + nanoTime);
        try {
            lr lrVar = new lr();
            while (mx2Var.read(lrVar, 8192L) != -1) {
                lrVar.a();
            }
            if (deadlineNanoTime == Long.MAX_VALUE) {
                mx2Var.timeout().clearDeadline();
            } else {
                mx2Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                mx2Var.timeout().clearDeadline();
            } else {
                mx2Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            return false;
        } catch (Throwable th) {
            if (deadlineNanoTime == Long.MAX_VALUE) {
                mx2Var.timeout().clearDeadline();
            } else {
                mx2Var.timeout().deadlineNanoTime(nanoTime + deadlineNanoTime);
            }
            throw th;
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        return new ThreadFactory() { // from class: vi3
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread m247threadFactory$lambda1;
                m247threadFactory$lambda1 = Util.m247threadFactory$lambda1(str, z, runnable);
                return m247threadFactory$lambda1;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: threadFactory$lambda-1, reason: not valid java name */
    public static final Thread m247threadFactory$lambda1(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final void threadName(String str, v31 v31Var) {
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(str);
        try {
            v31Var.invoke();
        } finally {
            currentThread.setName(name);
        }
    }

    public static final List<Header> toHeaderList(Headers headers) {
        kd1 I0 = t9.I0(0, headers.size());
        ArrayList arrayList = new ArrayList(a20.C0(I0, 10));
        Iterator it = I0.iterator();
        while (it.hasNext()) {
            int c = ((jd1) it).c();
            arrayList.add(new Header(headers.name(c), headers.value(c)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().j(), header.component2().j());
        }
        return builder.build();
    }

    public static final String toHexString(long j) {
        return Long.toHexString(j);
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String host;
        if (i23.R0(httpUrl.host(), ":", false)) {
            host = "[" + httpUrl.host() + ']';
        } else {
            host = httpUrl.host();
        }
        if (z || httpUrl.port() != HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return host + ':' + httpUrl.port();
        }
        return host;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        if (map.isEmpty()) {
            return dr0.f1824a;
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static final long toLongOrDefault(String str, long j) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        Long valueOf;
        if (str == null) {
            valueOf = null;
        } else {
            try {
                valueOf = Long.valueOf(Long.parseLong(str));
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        if (valueOf == null) {
            return i;
        }
        long longValue = valueOf.longValue();
        if (longValue > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (longValue < 0) {
            return 0;
        }
        return (int) longValue;
    }

    public static final String trimSubstring(String str, int i, int i2) {
        int indexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        return str.substring(indexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, indexOfFirstNonAsciiWhitespace, i2));
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final void wait(Object obj) {
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        if (list.size() > 1) {
            System.out.getClass();
        }
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            bx3.h(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(rr rrVar, int i) throws IOException {
        rrVar.k((i >>> 16) & 255);
        rrVar.k((i >>> 8) & 255);
        rrVar.k(i & 255);
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            if (str.charAt(i) == c) {
                return i;
            }
            i = i3;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final String toHexString(int i) {
        return Integer.toHexString(i);
    }

    public static final long and(int i, long j) {
        return i & j;
    }

    public static final void closeQuietly(Socket socket) {
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (!m20.L(e2.getMessage(), "bio == null")) {
                throw e2;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        try {
            serverSocket.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(lr lrVar, byte b2) {
        int i = 0;
        while (!lrVar.j() && lrVar.x(0L) == b2) {
            i++;
            lrVar.readByte();
        }
        return i;
    }
}
