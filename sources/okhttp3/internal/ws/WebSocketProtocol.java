package okhttp3.internal.ws;

import defpackage.at;
import defpackage.jr;
import defpackage.m20;
import defpackage.p71;
import defpackage.t9;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class WebSocketProtocol {
    public static final String ACCEPT_MAGIC = "258EAFA5-E914-47DA-95CA-C5AB0DC85B11";
    public static final int B0_FLAG_FIN = 128;
    public static final int B0_FLAG_RSV1 = 64;
    public static final int B0_FLAG_RSV2 = 32;
    public static final int B0_FLAG_RSV3 = 16;
    public static final int B0_MASK_OPCODE = 15;
    public static final int B1_FLAG_MASK = 128;
    public static final int B1_MASK_LENGTH = 127;
    public static final int CLOSE_CLIENT_GOING_AWAY = 1001;
    public static final long CLOSE_MESSAGE_MAX = 123;
    public static final int CLOSE_NO_STATUS_CODE = 1005;
    public static final WebSocketProtocol INSTANCE = new WebSocketProtocol();
    public static final int OPCODE_BINARY = 2;
    public static final int OPCODE_CONTINUATION = 0;
    public static final int OPCODE_CONTROL_CLOSE = 8;
    public static final int OPCODE_CONTROL_PING = 9;
    public static final int OPCODE_CONTROL_PONG = 10;
    public static final int OPCODE_FLAG_CONTROL = 8;
    public static final int OPCODE_TEXT = 1;
    public static final long PAYLOAD_BYTE_MAX = 125;
    public static final int PAYLOAD_LONG = 127;
    public static final int PAYLOAD_SHORT = 126;
    public static final long PAYLOAD_SHORT_MAX = 65535;

    private WebSocketProtocol() {
    }

    public final String acceptHeader(String str) {
        byte[] l = t9.l(m20.d1(ACCEPT_MAGIC, str));
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(l, 0, l.length);
        return new at(messageDigest.digest()).a();
    }

    public final String closeCodeExceptionMessage(int i) {
        boolean z;
        if (i >= 1000 && i < 5000) {
            boolean z2 = true;
            if (1004 <= i && i < 1007) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (1015 > i || i >= 3000) {
                    z2 = false;
                }
                if (!z2) {
                    return null;
                }
            }
            return p71.k("Code ", i, " is reserved and may not be used.");
        }
        return m20.d1(Integer.valueOf(i), "Code must be in range [1000,5000): ");
    }

    public final void toggleMask(jr jrVar, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i = 0;
        do {
            byte[] bArr2 = jrVar.e;
            int i2 = jrVar.f;
            int i3 = jrVar.g;
            boolean z = true;
            if (bArr2 != null) {
                while (i2 < i3) {
                    int i4 = i % length;
                    bArr2[i2] = (byte) (bArr2[i2] ^ bArr[i4]);
                    i2++;
                    i = i4 + 1;
                }
            }
            long j2 = jrVar.d;
            if (j2 == jrVar.f2813a.f3176b) {
                z = false;
            }
            if (z) {
                if (j2 == -1) {
                    j = 0;
                } else {
                    j = j2 + (jrVar.g - jrVar.f);
                }
            } else {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (jrVar.c(j) != -1);
    }

    public final void validateCloseCode(int i) {
        boolean z;
        String closeCodeExceptionMessage = closeCodeExceptionMessage(i);
        if (closeCodeExceptionMessage == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalArgumentException(closeCodeExceptionMessage.toString());
        }
    }
}
