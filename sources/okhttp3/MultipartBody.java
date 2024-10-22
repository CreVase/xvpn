package okhttp3;

import defpackage.at;
import defpackage.lr;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import defpackage.rr;
import defpackage.t9;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class MultipartBody extends RequestBody {
    public static final MediaType ALTERNATIVE;
    private static final byte[] COLONSPACE;
    private static final byte[] CRLF;
    public static final Companion Companion = new Companion(null);
    private static final byte[] DASHDASH;
    public static final MediaType DIGEST;
    public static final MediaType FORM;
    public static final MediaType MIXED;
    public static final MediaType PARALLEL;
    private final at boundaryByteString;
    private long contentLength = -1;
    private final MediaType contentType;
    private final List<Part> parts;
    private final MediaType type;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final at boundary;
        private final List<Part> parts;
        private MediaType type;

        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final Builder addFormDataPart(String str, String str2) {
            addPart(Part.Companion.createFormData(str, str2));
            return this;
        }

        public final Builder addPart(RequestBody requestBody) {
            addPart(Part.Companion.create(requestBody));
            return this;
        }

        public final MultipartBody build() {
            if (!this.parts.isEmpty()) {
                return new MultipartBody(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        public final Builder setType(MediaType mediaType) {
            if (m20.L(mediaType.type(), "multipart")) {
                this.type = mediaType;
                return this;
            }
            throw new IllegalArgumentException(m20.d1(mediaType, "multipart != ").toString());
        }

        public Builder(String str) {
            at atVar = new at(t9.l(str));
            atVar.c = str;
            this.boundary = atVar;
            this.type = MultipartBody.MIXED;
            this.parts = new ArrayList();
        }

        public final Builder addFormDataPart(String str, String str2, RequestBody requestBody) {
            addPart(Part.Companion.createFormData(str, str2, requestBody));
            return this;
        }

        public final Builder addPart(Headers headers, RequestBody requestBody) {
            addPart(Part.Companion.create(headers, requestBody));
            return this;
        }

        public final Builder addPart(Part part) {
            this.parts.add(part);
            return this;
        }

        public /* synthetic */ Builder(String str, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? UUID.randomUUID().toString() : str);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final void appendQuotedString$okhttp(StringBuilder sb, String str) {
            sb.append('\"');
            int length = str.length();
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt == '\"') {
                    sb.append("%22");
                } else {
                    sb.append(charAt);
                }
                i = i2;
            }
            sb.append('\"');
        }
    }

    /* loaded from: classes2.dex */
    public static final class Part {
        public static final Companion Companion = new Companion(null);
        private final RequestBody body;
        private final Headers headers;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final Part create(RequestBody requestBody) {
                return create(null, requestBody);
            }

            public final Part createFormData(String str, String str2, RequestBody requestBody) {
                StringBuilder n = p71.n("form-data; name=");
                Companion companion = MultipartBody.Companion;
                companion.appendQuotedString$okhttp(n, str);
                if (str2 != null) {
                    n.append("; filename=");
                    companion.appendQuotedString$okhttp(n, str2);
                }
                return create(new Headers.Builder().addUnsafeNonAscii("Content-Disposition", n.toString()).build(), requestBody);
            }

            public final Part create(Headers headers, RequestBody requestBody) {
                ng0 ng0Var = null;
                if (!((headers == null ? null : headers.get("Content-Type")) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers == null ? null : headers.get("Content-Length")) == null) {
                    return new Part(headers, requestBody, ng0Var);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            public final Part createFormData(String str, String str2) {
                return createFormData(str, null, RequestBody.Companion.create$default(RequestBody.Companion, str2, (MediaType) null, 1, (Object) null));
            }
        }

        public /* synthetic */ Part(Headers headers, RequestBody requestBody, ng0 ng0Var) {
            this(headers, requestBody);
        }

        public static final Part create(Headers headers, RequestBody requestBody) {
            return Companion.create(headers, requestBody);
        }

        public static final Part createFormData(String str, String str2) {
            return Companion.createFormData(str, str2);
        }

        /* renamed from: -deprecated_body, reason: not valid java name */
        public final RequestBody m194deprecated_body() {
            return this.body;
        }

        /* renamed from: -deprecated_headers, reason: not valid java name */
        public final Headers m195deprecated_headers() {
            return this.headers;
        }

        public final RequestBody body() {
            return this.body;
        }

        public final Headers headers() {
            return this.headers;
        }

        private Part(Headers headers, RequestBody requestBody) {
            this.headers = headers;
            this.body = requestBody;
        }

        public static final Part create(RequestBody requestBody) {
            return Companion.create(requestBody);
        }

        public static final Part createFormData(String str, String str2, RequestBody requestBody) {
            return Companion.createFormData(str, str2, requestBody);
        }
    }

    static {
        MediaType.Companion companion = MediaType.Companion;
        MIXED = companion.get("multipart/mixed");
        ALTERNATIVE = companion.get("multipart/alternative");
        DIGEST = companion.get("multipart/digest");
        PARALLEL = companion.get("multipart/parallel");
        FORM = companion.get("multipart/form-data");
        COLONSPACE = new byte[]{58, 32};
        CRLF = new byte[]{13, 10};
        DASHDASH = new byte[]{45, 45};
    }

    public MultipartBody(at atVar, MediaType mediaType, List<Part> list) {
        this.boundaryByteString = atVar;
        this.type = mediaType;
        this.parts = list;
        this.contentType = MediaType.Companion.get(mediaType + "; boundary=" + boundary());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long writeOrCountBytes(rr rrVar, boolean z) throws IOException {
        lr lrVar;
        if (z) {
            rrVar = new lr();
            lrVar = rrVar;
        } else {
            lrVar = 0;
        }
        int size = this.parts.size();
        long j = 0;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Part part = this.parts.get(i);
            Headers headers = part.headers();
            RequestBody body = part.body();
            rrVar.z(DASHDASH);
            rrVar.r(this.boundaryByteString);
            rrVar.z(CRLF);
            if (headers != null) {
                int size2 = headers.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    rrVar.p(headers.name(i3)).z(COLONSPACE).p(headers.value(i3)).z(CRLF);
                }
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                rrVar.p("Content-Type: ").p(contentType.toString()).z(CRLF);
            }
            long contentLength = body.contentLength();
            if (contentLength != -1) {
                rrVar.p("Content-Length: ").G(contentLength).z(CRLF);
            } else if (z) {
                lrVar.a();
                return -1L;
            }
            byte[] bArr = CRLF;
            rrVar.z(bArr);
            if (z) {
                j += contentLength;
            } else {
                body.writeTo(rrVar);
            }
            rrVar.z(bArr);
            i = i2;
        }
        byte[] bArr2 = DASHDASH;
        rrVar.z(bArr2);
        rrVar.r(this.boundaryByteString);
        rrVar.z(bArr2);
        rrVar.z(CRLF);
        if (z) {
            long j2 = j + lrVar.f3176b;
            lrVar.a();
            return j2;
        }
        return j;
    }

    /* renamed from: -deprecated_boundary, reason: not valid java name */
    public final String m190deprecated_boundary() {
        return boundary();
    }

    /* renamed from: -deprecated_parts, reason: not valid java name */
    public final List<Part> m191deprecated_parts() {
        return this.parts;
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m192deprecated_size() {
        return size();
    }

    /* renamed from: -deprecated_type, reason: not valid java name */
    public final MediaType m193deprecated_type() {
        return this.type;
    }

    public final String boundary() {
        return this.boundaryByteString.j();
    }

    @Override // okhttp3.RequestBody
    public long contentLength() throws IOException {
        long j = this.contentLength;
        if (j == -1) {
            long writeOrCountBytes = writeOrCountBytes(null, true);
            this.contentLength = writeOrCountBytes;
            return writeOrCountBytes;
        }
        return j;
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.contentType;
    }

    public final Part part(int i) {
        return this.parts.get(i);
    }

    public final List<Part> parts() {
        return this.parts;
    }

    public final int size() {
        return this.parts.size();
    }

    public final MediaType type() {
        return this.type;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(rr rrVar) throws IOException {
        writeOrCountBytes(rrVar, false);
    }
}
