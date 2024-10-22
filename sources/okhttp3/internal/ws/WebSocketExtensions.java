package okhttp3.internal.ws;

import defpackage.g23;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import java.io.IOException;
import okhttp3.Headers;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final WebSocketExtensions parse(Headers headers) throws IOException {
            String str;
            Integer P0;
            Integer P02;
            int size = headers.size();
            Headers headers2 = headers;
            int i = 0;
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            while (i < size) {
                int i2 = i + 1;
                if (i23.U0(headers2.name(i), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION)) {
                    String value = headers2.value(i);
                    int i3 = 0;
                    while (i3 < value.length()) {
                        int delimiterOffset$default = Util.delimiterOffset$default(value, ',', i3, 0, 4, (Object) null);
                        char c = ';';
                        int delimiterOffset = Util.delimiterOffset(value, ';', i3, delimiterOffset$default);
                        String trimSubstring = Util.trimSubstring(value, i3, delimiterOffset);
                        int i4 = delimiterOffset + 1;
                        if (i23.U0(trimSubstring, "permessage-deflate")) {
                            if (z) {
                                z4 = true;
                            }
                            while (i4 < delimiterOffset$default) {
                                int delimiterOffset2 = Util.delimiterOffset(value, c, i4, delimiterOffset$default);
                                int delimiterOffset3 = Util.delimiterOffset(value, '=', i4, delimiterOffset2);
                                String trimSubstring2 = Util.trimSubstring(value, i4, delimiterOffset3);
                                if (delimiterOffset3 < delimiterOffset2) {
                                    str = Util.trimSubstring(value, delimiterOffset3 + 1, delimiterOffset2);
                                    if (str.length() >= "\"".length() + "\"".length() && i23.r1(str, "\"") && i23.T0(str, "\"")) {
                                        str = str.substring("\"".length(), str.length() - "\"".length());
                                    }
                                } else {
                                    str = null;
                                }
                                i4 = delimiterOffset2 + 1;
                                if (i23.U0(trimSubstring2, "client_max_window_bits")) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    if (str == null) {
                                        P02 = null;
                                    } else {
                                        P02 = g23.P0(str);
                                    }
                                    num = P02;
                                    if (P02 != null) {
                                        c = ';';
                                    }
                                    z4 = true;
                                    c = ';';
                                } else {
                                    if (i23.U0(trimSubstring2, "client_no_context_takeover")) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (str != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else if (i23.U0(trimSubstring2, "server_max_window_bits")) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        if (str == null) {
                                            P0 = null;
                                        } else {
                                            P0 = g23.P0(str);
                                        }
                                        num2 = P0;
                                        if (P0 != null) {
                                        }
                                        z4 = true;
                                    } else {
                                        if (i23.U0(trimSubstring2, "server_no_context_takeover")) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (str != null) {
                                                z4 = true;
                                            }
                                            z3 = true;
                                        }
                                        z4 = true;
                                    }
                                    c = ';';
                                }
                            }
                            i3 = i4;
                            z = true;
                        } else {
                            i3 = i4;
                            z4 = true;
                        }
                    }
                    headers2 = headers;
                }
                i = i2;
            }
            return new WebSocketExtensions(z, num, z2, num2, z3, z4);
        }
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = webSocketExtensions.perMessageDeflate;
        }
        if ((i & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = webSocketExtensions.clientNoContextTakeover;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = webSocketExtensions.serverNoContextTakeover;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = webSocketExtensions.unknownValues;
        }
        return webSocketExtensions.copy(z, num3, z5, num4, z6, z4);
    }

    public final boolean component1() {
        return this.perMessageDeflate;
    }

    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    public final boolean component6() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        return new WebSocketExtensions(z, num, z2, num2, z3, z4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && m20.L(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && m20.L(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.perMessageDeflate;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.clientMaxWindowBits;
        int hashCode = (i + (num == null ? 0 : num.hashCode())) * 31;
        ?? r2 = this.clientNoContextTakeover;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int hashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.serverNoContextTakeover;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z2 = this.unknownValues;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean noContextTakeover(boolean z) {
        if (z) {
            return this.clientNoContextTakeover;
        }
        return this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    public WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4) {
        this.perMessageDeflate = z;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z2;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z3;
        this.unknownValues = z4;
    }

    public /* synthetic */ WebSocketExtensions(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}
