package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public final class cx2 extends xg {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f1698a;

    public cx2(Socket socket) {
        this.f1698a = socket;
    }

    @Override // defpackage.xg
    public final IOException newTimeoutException(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // defpackage.xg
    public final void timedOut() {
        Socket socket = this.f1698a;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (t9.R(e)) {
                e22.f1877a.log(Level.WARNING, m20.d1(socket, "Failed to close timed out socket "), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            e22.f1877a.log(Level.WARNING, m20.d1(socket, "Failed to close timed out socket "), (Throwable) e2);
        }
    }
}
