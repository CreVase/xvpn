package okhttp3;

import defpackage.m20;
import defpackage.ng0;
import java.io.IOException;

/* loaded from: classes2.dex */
public enum Protocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");

    public static final Companion Companion = new Companion(null);
    private final String protocol;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final Protocol get(String str) throws IOException {
            Protocol protocol = Protocol.HTTP_1_0;
            if (!m20.L(str, protocol.protocol)) {
                protocol = Protocol.HTTP_1_1;
                if (!m20.L(str, protocol.protocol)) {
                    protocol = Protocol.H2_PRIOR_KNOWLEDGE;
                    if (!m20.L(str, protocol.protocol)) {
                        protocol = Protocol.HTTP_2;
                        if (!m20.L(str, protocol.protocol)) {
                            protocol = Protocol.SPDY_3;
                            if (!m20.L(str, protocol.protocol)) {
                                protocol = Protocol.QUIC;
                                if (!m20.L(str, protocol.protocol)) {
                                    throw new IOException(m20.d1(str, "Unexpected protocol: "));
                                }
                            }
                        }
                    }
                }
            }
            return protocol;
        }
    }

    Protocol(String str) {
        this.protocol = str;
    }

    public static final Protocol get(String str) throws IOException {
        return Companion.get(str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.protocol;
    }
}
