package okhttp3.internal.http;

import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.Protocol;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class StatusLine {
    public static final Companion Companion = new Companion(null);
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final String message;
    public final Protocol protocol;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final StatusLine get(Response response) {
            return new StatusLine(response.protocol(), response.code(), response.message());
        }

        public final StatusLine parse(String str) throws IOException {
            Protocol protocol;
            int i;
            String str2;
            if (i23.q1(str, "HTTP/1.", false)) {
                i = 9;
                if (str.length() >= 9 && str.charAt(8) == ' ') {
                    int charAt = str.charAt(7) - '0';
                    if (charAt != 0) {
                        if (charAt == 1) {
                            protocol = Protocol.HTTP_1_1;
                        } else {
                            throw new ProtocolException(m20.d1(str, "Unexpected status line: "));
                        }
                    } else {
                        protocol = Protocol.HTTP_1_0;
                    }
                } else {
                    throw new ProtocolException(m20.d1(str, "Unexpected status line: "));
                }
            } else if (i23.q1(str, "ICY ", false)) {
                protocol = Protocol.HTTP_1_0;
                i = 4;
            } else {
                throw new ProtocolException(m20.d1(str, "Unexpected status line: "));
            }
            int i2 = i + 3;
            if (str.length() >= i2) {
                try {
                    int parseInt = Integer.parseInt(str.substring(i, i2));
                    if (str.length() > i2) {
                        if (str.charAt(i2) == ' ') {
                            str2 = str.substring(i + 4);
                        } else {
                            throw new ProtocolException(m20.d1(str, "Unexpected status line: "));
                        }
                    } else {
                        str2 = "";
                    }
                    return new StatusLine(protocol, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(m20.d1(str, "Unexpected status line: "));
                }
            }
            throw new ProtocolException(m20.d1(str, "Unexpected status line: "));
        }
    }

    public StatusLine(Protocol protocol, int i, String str) {
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.protocol == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        return sb.toString();
    }
}
