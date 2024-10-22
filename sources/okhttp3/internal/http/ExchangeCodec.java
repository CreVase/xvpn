package okhttp3.internal.http;

import defpackage.dw2;
import defpackage.mx2;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.connection.RealConnection;

/* loaded from: classes2.dex */
public interface ExchangeCodec {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    dw2 createRequestBody(Request request, long j) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    RealConnection getConnection();

    mx2 openResponseBodySource(Response response) throws IOException;

    Response.Builder readResponseHeaders(boolean z) throws IOException;

    long reportedContentLength(Response response) throws IOException;

    Headers trailers() throws IOException;

    void writeRequestHeaders(Request request) throws IOException;
}
