package okhttp3.internal.http;

import com.vungle.ads.internal.presenter.MRAIDPresenter;
import defpackage.i23;
import defpackage.p71;
import defpackage.wg2;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;

/* loaded from: classes2.dex */
public final class CallServerInterceptor implements Interceptor {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z) {
        this.forWebSocket = z;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response.Builder builder;
        Response build;
        long contentLength;
        boolean z;
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange$okhttp = realInterceptorChain.getExchange$okhttp();
        Request request$okhttp = realInterceptorChain.getRequest$okhttp();
        RequestBody body = request$okhttp.body();
        long currentTimeMillis = System.currentTimeMillis();
        exchange$okhttp.writeRequestHeaders(request$okhttp);
        boolean z2 = true;
        Long l = null;
        if (HttpMethod.permitsRequestBody(request$okhttp.method()) && body != null) {
            if (i23.U0("100-continue", request$okhttp.header("Expect"))) {
                exchange$okhttp.flushRequest();
                builder = exchange$okhttp.readResponseHeaders(true);
                exchange$okhttp.responseHeadersStart();
                z = false;
            } else {
                z = true;
                builder = null;
            }
            if (builder == null) {
                if (body.isDuplex()) {
                    exchange$okhttp.flushRequest();
                    body.writeTo(new wg2(exchange$okhttp.createRequestBody(request$okhttp, true)));
                } else {
                    wg2 wg2Var = new wg2(exchange$okhttp.createRequestBody(request$okhttp, false));
                    body.writeTo(wg2Var);
                    wg2Var.close();
                }
            } else {
                exchange$okhttp.noRequestBody();
                if (!exchange$okhttp.getConnection$okhttp().isMultiplexed$okhttp()) {
                    exchange$okhttp.noNewExchangesOnConnection();
                }
            }
            z2 = z;
        } else {
            exchange$okhttp.noRequestBody();
            builder = null;
        }
        if (body == null || !body.isDuplex()) {
            exchange$okhttp.finishRequest();
        }
        if (builder == null) {
            builder = exchange$okhttp.readResponseHeaders(false);
            if (z2) {
                exchange$okhttp.responseHeadersStart();
                z2 = false;
            }
        }
        Response build2 = builder.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        int code = build2.code();
        if (code == 100) {
            Response.Builder readResponseHeaders = exchange$okhttp.readResponseHeaders(false);
            if (z2) {
                exchange$okhttp.responseHeadersStart();
            }
            build2 = readResponseHeaders.request(request$okhttp).handshake(exchange$okhttp.getConnection$okhttp().handshake()).sentRequestAtMillis(currentTimeMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
            code = build2.code();
        }
        exchange$okhttp.responseHeadersEnd(build2);
        if (this.forWebSocket && code == 101) {
            build = build2.newBuilder().body(Util.EMPTY_RESPONSE).build();
        } else {
            build = build2.newBuilder().body(exchange$okhttp.openResponseBody(build2)).build();
        }
        if (i23.U0(MRAIDPresenter.CLOSE, build.request().header("Connection")) || i23.U0(MRAIDPresenter.CLOSE, Response.header$default(build, "Connection", null, 2, null))) {
            exchange$okhttp.noNewExchangesOnConnection();
        }
        if (code == 204 || code == 205) {
            ResponseBody body2 = build.body();
            if (body2 == null) {
                contentLength = -1;
            } else {
                contentLength = body2.contentLength();
            }
            if (contentLength > 0) {
                StringBuilder o = p71.o("HTTP ", code, " had non-zero Content-Length: ");
                ResponseBody body3 = build.body();
                if (body3 != null) {
                    l = Long.valueOf(body3.contentLength());
                }
                o.append(l);
                throw new ProtocolException(o.toString());
            }
        }
        return build;
    }
}
