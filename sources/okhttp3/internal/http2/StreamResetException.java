package okhttp3.internal.http2;

import defpackage.m20;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    public StreamResetException(ErrorCode errorCode) {
        super(m20.d1(errorCode, "stream was reset: "));
        this.errorCode = errorCode;
    }
}
