package okhttp3.internal.connection;

import defpackage.bx3;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {
    private final IOException firstConnectException;
    private IOException lastConnectException;

    public RouteException(IOException iOException) {
        super(iOException);
        this.firstConnectException = iOException;
        this.lastConnectException = iOException;
    }

    public final void addConnectException(IOException iOException) {
        bx3.h(this.firstConnectException, iOException);
        this.lastConnectException = iOException;
    }

    public final IOException getFirstConnectException() {
        return this.firstConnectException;
    }

    public final IOException getLastConnectException() {
        return this.lastConnectException;
    }
}
