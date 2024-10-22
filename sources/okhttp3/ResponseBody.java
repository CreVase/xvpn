package okhttp3;

import defpackage.at;
import defpackage.ch3;
import defpackage.dx;
import defpackage.lr;
import defpackage.m20;
import defpackage.ng0;
import defpackage.sr;
import defpackage.tf3;
import defpackage.x31;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public abstract class ResponseBody implements Closeable {
    public static final Companion Companion = new Companion(null);
    private Reader reader;

    /* loaded from: classes2.dex */
    public static final class BomAwareReader extends Reader {
        private final Charset charset;
        private boolean closed;
        private Reader delegate;
        private final sr source;

        public BomAwareReader(sr srVar, Charset charset) {
            this.source = srVar;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            ch3 ch3Var;
            this.closed = true;
            Reader reader = this.delegate;
            if (reader == null) {
                ch3Var = null;
            } else {
                reader.close();
                ch3Var = ch3.f636a;
            }
            if (ch3Var == null) {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.closed) {
                Reader reader = this.delegate;
                if (reader == null) {
                    reader = new InputStreamReader(this.source.I(), Util.readBomAsCharset(this.source, this.charset));
                    this.delegate = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, String str, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(str, mediaType);
        }

        public final ResponseBody create(String str, MediaType mediaType) {
            Charset charset = dx.f1853a;
            if (mediaType != null) {
                Charset charset$default = MediaType.charset$default(mediaType, null, 1, null);
                if (charset$default == null) {
                    mediaType = MediaType.Companion.parse(mediaType + "; charset=utf-8");
                } else {
                    charset = charset$default;
                }
            }
            lr b0 = new lr().b0(str, 0, str.length(), charset);
            return create(b0, mediaType, b0.f3176b);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, byte[] bArr, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(bArr, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, at atVar, MediaType mediaType, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            return companion.create(atVar, mediaType);
        }

        public static /* synthetic */ ResponseBody create$default(Companion companion, sr srVar, MediaType mediaType, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return companion.create(srVar, mediaType, j);
        }

        public final ResponseBody create(byte[] bArr, MediaType mediaType) {
            lr lrVar = new lr();
            lrVar.T(0, bArr, bArr.length);
            return create(lrVar, mediaType, bArr.length);
        }

        public final ResponseBody create(at atVar, MediaType mediaType) {
            lr lrVar = new lr();
            atVar.k(lrVar, atVar.c());
            return create(lrVar, mediaType, atVar.c());
        }

        public final ResponseBody create(final sr srVar, final MediaType mediaType, final long j) {
            return new ResponseBody() { // from class: okhttp3.ResponseBody$Companion$asResponseBody$1
                @Override // okhttp3.ResponseBody
                public long contentLength() {
                    return j;
                }

                @Override // okhttp3.ResponseBody
                public MediaType contentType() {
                    return MediaType.this;
                }

                @Override // okhttp3.ResponseBody
                public sr source() {
                    return srVar;
                }
            };
        }

        public final ResponseBody create(MediaType mediaType, String str) {
            return create(str, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, byte[] bArr) {
            return create(bArr, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, at atVar) {
            return create(atVar, mediaType);
        }

        public final ResponseBody create(MediaType mediaType, long j, sr srVar) {
            return create(srVar, mediaType, j);
        }
    }

    private final Charset charset() {
        Charset charset;
        MediaType contentType = contentType();
        if (contentType == null) {
            charset = null;
        } else {
            charset = contentType.charset(dx.f1853a);
        }
        if (charset == null) {
            return dx.f1853a;
        }
        return charset;
    }

    private final <T> T consumeSource(x31 x31Var, x31 x31Var2) {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            sr source = source();
            try {
                T t = (T) x31Var.invoke(source);
                tf3.y(source, null);
                int intValue = ((Number) x31Var2.invoke(t)).intValue();
                if (contentLength != -1 && contentLength != intValue) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + intValue + ") disagree");
                }
                return t;
            } finally {
            }
        } else {
            throw new IOException(m20.d1(Long.valueOf(contentLength), "Cannot buffer entire body for content length: "));
        }
    }

    public static final ResponseBody create(sr srVar, MediaType mediaType, long j) {
        return Companion.create(srVar, mediaType, j);
    }

    public final InputStream byteStream() {
        return source().I();
    }

    public final at byteString() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            sr source = source();
            try {
                at u = source.u();
                tf3.y(source, null);
                int c = u.c();
                if (contentLength != -1 && contentLength != c) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + c + ") disagree");
                }
                return u;
            } finally {
            }
        } else {
            throw new IOException(m20.d1(Long.valueOf(contentLength), "Cannot buffer entire body for content length: "));
        }
    }

    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            sr source = source();
            try {
                byte[] i = source.i();
                tf3.y(source, null);
                int length = i.length;
                if (contentLength != -1 && contentLength != length) {
                    throw new IOException("Content-Length (" + contentLength + ") and stream length (" + length + ") disagree");
                }
                return i;
            } finally {
            }
        } else {
            throw new IOException(m20.d1(Long.valueOf(contentLength), "Cannot buffer entire body for content length: "));
        }
    }

    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader == null) {
            BomAwareReader bomAwareReader = new BomAwareReader(source(), charset());
            this.reader = bomAwareReader;
            return bomAwareReader;
        }
        return reader;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(source());
    }

    public abstract long contentLength();

    public abstract MediaType contentType();

    public abstract sr source();

    public final String string() throws IOException {
        sr source = source();
        try {
            String s = source.s(Util.readBomAsCharset(source, charset()));
            tf3.y(source, null);
            return s;
        } finally {
        }
    }

    public static final ResponseBody create(at atVar, MediaType mediaType) {
        return Companion.create(atVar, mediaType);
    }

    public static final ResponseBody create(String str, MediaType mediaType) {
        return Companion.create(str, mediaType);
    }

    public static final ResponseBody create(MediaType mediaType, long j, sr srVar) {
        return Companion.create(mediaType, j, srVar);
    }

    public static final ResponseBody create(MediaType mediaType, at atVar) {
        return Companion.create(mediaType, atVar);
    }

    public static final ResponseBody create(MediaType mediaType, String str) {
        return Companion.create(mediaType, str);
    }

    public static final ResponseBody create(MediaType mediaType, byte[] bArr) {
        return Companion.create(mediaType, bArr);
    }

    public static final ResponseBody create(byte[] bArr, MediaType mediaType) {
        return Companion.create(bArr, mediaType);
    }
}
