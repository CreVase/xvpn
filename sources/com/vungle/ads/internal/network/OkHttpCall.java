package com.vungle.ads.internal.network;

import com.vungle.ads.internal.network.converters.Converter;
import defpackage.d11;
import defpackage.lr;
import defpackage.ng0;
import defpackage.sr;
import defpackage.tf3;
import defpackage.xg2;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class OkHttpCall<T> implements Call<T> {
    public static final Companion Companion = new Companion(null);
    private volatile boolean canceled;
    private final okhttp3.Call rawCall;
    private final Converter<ResponseBody, T> responseConverter;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void throwIfFatal(Throwable th) {
            if (!(th instanceof VirtualMachineError)) {
                if (!(th instanceof ThreadDeath)) {
                    if (!(th instanceof LinkageError)) {
                        return;
                    } else {
                        throw th;
                    }
                }
                throw th;
            }
            throw th;
        }
    }

    /* loaded from: classes2.dex */
    public static final class ExceptionCatchingResponseBody extends ResponseBody {
        private final ResponseBody delegate;
        private final sr delegateSource;
        private IOException thrownException;

        public ExceptionCatchingResponseBody(ResponseBody responseBody) {
            this.delegate = responseBody;
            this.delegateSource = new xg2(new d11(responseBody.source()) { // from class: com.vungle.ads.internal.network.OkHttpCall.ExceptionCatchingResponseBody.1
                @Override // defpackage.d11, defpackage.mx2
                public long read(lr lrVar, long j) throws IOException {
                    try {
                        return super.read(lrVar, j);
                    } catch (IOException e) {
                        ExceptionCatchingResponseBody.this.setThrownException(e);
                        throw e;
                    }
                }
            });
        }

        @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.delegate.contentLength();
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.delegate.contentType();
        }

        public final IOException getThrownException() {
            return this.thrownException;
        }

        public final void setThrownException(IOException iOException) {
            this.thrownException = iOException;
        }

        @Override // okhttp3.ResponseBody
        public sr source() {
            return this.delegateSource;
        }

        public final void throwIfCaught() throws IOException {
            IOException iOException = this.thrownException;
            if (iOException == null) {
            } else {
                throw iOException;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class NoContentResponseBody extends ResponseBody {
        private final long contentLength;
        private final MediaType contentType;

        public NoContentResponseBody(MediaType mediaType, long j) {
            this.contentType = mediaType;
            this.contentLength = j;
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            return this.contentLength;
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            return this.contentType;
        }

        @Override // okhttp3.ResponseBody
        public sr source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public OkHttpCall(okhttp3.Call call, Converter<ResponseBody, T> converter) {
        this.rawCall = call;
        this.responseConverter = converter;
    }

    private final ResponseBody buffer(ResponseBody responseBody) throws IOException {
        lr lrVar = new lr();
        responseBody.source().E(lrVar);
        return ResponseBody.Companion.create(lrVar, responseBody.contentType(), responseBody.contentLength());
    }

    @Override // com.vungle.ads.internal.network.Call
    public void cancel() {
        okhttp3.Call call;
        this.canceled = true;
        synchronized (this) {
            call = this.rawCall;
        }
        call.cancel();
    }

    @Override // com.vungle.ads.internal.network.Call
    public void enqueue(final Callback<T> callback) {
        okhttp3.Call call;
        synchronized (this) {
            call = this.rawCall;
        }
        if (this.canceled) {
            call.cancel();
        }
        call.enqueue(new okhttp3.Callback(this) { // from class: com.vungle.ads.internal.network.OkHttpCall$enqueue$2
            final /* synthetic */ OkHttpCall<T> this$0;

            {
                this.this$0 = this;
            }

            private final void callFailure(Throwable th) {
                try {
                    callback.onFailure(this.this$0, th);
                } catch (Throwable th2) {
                    OkHttpCall.Companion.throwIfFatal(th2);
                    th2.printStackTrace();
                }
            }

            @Override // okhttp3.Callback
            public void onFailure(okhttp3.Call call2, IOException iOException) {
                callFailure(iOException);
            }

            @Override // okhttp3.Callback
            public void onResponse(okhttp3.Call call2, okhttp3.Response response) {
                try {
                    try {
                        callback.onResponse(this.this$0, this.this$0.parseResponse(response));
                    } catch (Throwable th) {
                        OkHttpCall.Companion.throwIfFatal(th);
                        th.printStackTrace();
                    }
                } catch (Throwable th2) {
                    OkHttpCall.Companion.throwIfFatal(th2);
                    callFailure(th2);
                }
            }
        });
    }

    @Override // com.vungle.ads.internal.network.Call
    public Response<T> execute() throws IOException {
        okhttp3.Call call;
        synchronized (this) {
            call = this.rawCall;
        }
        if (this.canceled) {
            call.cancel();
        }
        return parseResponse(call.execute());
    }

    @Override // com.vungle.ads.internal.network.Call
    public boolean isCanceled() {
        boolean isCanceled;
        if (this.canceled) {
            return true;
        }
        synchronized (this) {
            isCanceled = this.rawCall.isCanceled();
        }
        return isCanceled;
    }

    public final Response<T> parseResponse(okhttp3.Response response) throws IOException {
        ResponseBody body = response.body();
        if (body == null) {
            return null;
        }
        okhttp3.Response build = response.newBuilder().body(new NoContentResponseBody(body.contentType(), body.contentLength())).build();
        int code = build.code();
        if (code >= 200 && code < 300) {
            if (code != 204 && code != 205) {
                ExceptionCatchingResponseBody exceptionCatchingResponseBody = new ExceptionCatchingResponseBody(body);
                try {
                    return Response.Companion.success(this.responseConverter.convert(exceptionCatchingResponseBody), build);
                } catch (RuntimeException e) {
                    exceptionCatchingResponseBody.throwIfCaught();
                    throw e;
                }
            }
            body.close();
            return Response.Companion.success(null, build);
        }
        try {
            Response<T> error = Response.Companion.error(buffer(body), build);
            tf3.y(body, null);
            return error;
        } finally {
        }
    }
}
