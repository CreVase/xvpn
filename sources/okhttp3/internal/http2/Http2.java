package okhttp3.internal.http2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.at;
import defpackage.i23;
import defpackage.m20;
import defpackage.t9;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final at CONNECTION_PREFACE;
    private static final String[] FLAGS;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    private static final String[] FRAME_NAMES;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final Http2 INSTANCE = new Http2();
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;

    static {
        at atVar = new at(t9.l("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n"));
        atVar.c = "PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n";
        CONNECTION_PREFACE = atVar;
        FRAME_NAMES = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        FLAGS = new String[64];
        String[] strArr = new String[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            strArr[i2] = Util.format("%8s", Integer.toBinaryString(i2)).replace(' ', '0');
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i3 = iArr[0];
        strArr2[i3 | 8] = m20.d1("|PADDED", strArr2[i3]);
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        int i4 = 0;
        while (i4 < 3) {
            int i5 = iArr2[i4];
            i4++;
            int i6 = iArr[0];
            String[] strArr3 = FLAGS;
            int i7 = i6 | i5;
            StringBuilder sb = new StringBuilder();
            sb.append((Object) strArr3[i6]);
            sb.append('|');
            sb.append((Object) strArr3[i5]);
            strArr3[i7] = sb.toString();
            strArr3[i7 | 8] = ((Object) strArr3[i6]) + '|' + ((Object) strArr3[i5]) + "|PADDED";
        }
        int length = FLAGS.length;
        while (i < length) {
            int i8 = i + 1;
            String[] strArr4 = FLAGS;
            if (strArr4[i] == null) {
                strArr4[i] = BINARY[i];
            }
            i = i8;
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i, int i2) {
        String str;
        if (i2 == 0) {
            return "";
        }
        if (i != 2 && i != 3) {
            if (i != 4 && i != 6) {
                if (i != 7 && i != 8) {
                    String[] strArr = FLAGS;
                    if (i2 < strArr.length) {
                        str = strArr[i2];
                    } else {
                        str = BINARY[i2];
                    }
                    if (i == 5 && (i2 & 4) != 0) {
                        return i23.k1(str, "HEADERS", "PUSH_PROMISE", false);
                    }
                    if (i == 0 && (i2 & 32) != 0) {
                        return i23.k1(str, "PRIORITY", "COMPRESSED", false);
                    }
                    return str;
                }
            } else {
                if (i2 == 1) {
                    return "ACK";
                }
                return BINARY[i2];
            }
        }
        return BINARY[i2];
    }

    public final String formattedType$okhttp(int i) {
        String[] strArr = FRAME_NAMES;
        if (i < strArr.length) {
            return strArr[i];
        }
        return Util.format("0x%02x", Integer.valueOf(i));
    }

    public final String frameLog(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String formattedType$okhttp = formattedType$okhttp(i3);
        String formatFlags = formatFlags(i3, i4);
        if (z) {
            str = "<<";
        } else {
            str = ">>";
        }
        return Util.format("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i), Integer.valueOf(i2), formattedType$okhttp, formatFlags);
    }
}
