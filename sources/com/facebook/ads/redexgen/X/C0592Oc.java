package com.facebook.ads.redexgen.X;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Oc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0592Oc extends WebChromeClient {
    public static byte[] A01;
    public final /* synthetic */ C0597Oh A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 107);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-41, -44, -39, -48, -71, -32, -40, -51, -48, -35, 83, 75, 89, 89, 71, 77, 75, 68, 64, 70, 67, 52, 54, 26, 53};
    }

    public C0592Oc(C0597Oh c0597Oh) {
        this.A00 = c0597Oh;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C0452In c0452In;
        OU ou;
        YA ya;
        if (consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.ERROR) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(10, 7, 123), consoleMessage.message());
                jSONObject.put(A00(0, 10, 0), consoleMessage.lineNumber());
                jSONObject.put(A00(17, 8, 102), consoleMessage.sourceId());
            } catch (JSONException unused) {
            }
            String jSONObject2 = jSONObject.toString();
            c0452In = this.A00.A0D;
            c0452In.A04(EnumC0451Im.A0N, null);
            ou = this.A00.A0E;
            ou.A04(C01997x.A14, jSONObject2);
            ya = this.A00.A0B;
            ya.A0E().A5F(jSONObject2);
        }
        return super.onConsoleMessage(consoleMessage);
    }
}
