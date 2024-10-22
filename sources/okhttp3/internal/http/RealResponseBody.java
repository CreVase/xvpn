package okhttp3.internal.http;

import defpackage.sr;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {
    private final long contentLength;
    private final String contentTypeString;
    private final sr source;

    public RealResponseBody(String str, long j, sr srVar) {
        this.contentTypeString = str;
        this.contentLength = j;
        this.source = srVar;
    }

    @Override // okhttp3.ResponseBody
    public long contentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.ResponseBody
    public MediaType contentType() {
        String str = this.contentTypeString;
        if (str == null) {
            return null;
        }
        return MediaType.Companion.parse(str);
    }

    @Override // okhttp3.ResponseBody
    public sr source() {
        return this.source;
    }
}
