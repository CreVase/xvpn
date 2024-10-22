package com.facebook.ads.redexgen.X;

import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.8W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8W {
    public static String A00;
    public static byte[] A01;
    public static String[] A02 = {"Qr1EFu0kx1tI01867m6ODqfSZ9SwtWDI", "3TYgkAWbIjP9kMvunjr7VwfmqgOZ7ZQ4", "kyx9q1x7DLL5BxK3faNs604Sw4dxbCMr", "cJW9lkVABx2P1Kp63XktrUnlRFV2zQAL", "nhxLXaLaMxGTsXNVJcvnwyCHZZV2RS3H", "y9xLyKazRl3zNBUnfIZmAOMjGK0AXhl4", "DTEqb4TbXnNBCaxA5atVnYK0pSb9DMUi", "fZvghiN"};
    public static final AtomicBoolean A03;
    public static final AtomicReference<String> A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A01 = new byte[]{76, 55, 42, 46, 45, 34, 67, 45, 25, 8, 5, 9, 2, 15, 9, 34, 9, 24, 27, 3, 30, 7, 42, 3, 30, 45, 2, 8, 30, 3, 5, 8, 87, 42, 46, 63, 34, 67, 71, 87, 42, 46, 45, 58, 67, 81, 44, 40, 40, 60, 69, 101, 24, 28, 18, 29, 113, 30, 99, 103, 118, 115, 10, 32, 36, 39, 36, 73, 16, 20, 0, 5, 121, 94, 71, 81, 64, 91, 66, 66, 20, 47, 42, 47, 46, 54, 47, 1, 24, 20, 22, 85, 29, 26, 24, 30, 25, 20, 20, 16, 85, 26, 31, 8, 85, 18, 21, 15, 30, 9, 21, 26, 23, 85, 14, 26, 53, 55, 60, 55, 32, 59, 49, 49, 45, 45, 41, 119, 56, 62, 60, 55, 45, 38, 32, 54, 33, 12, 50, 52, 54, 61, 39, 60, 58, 44, 59, 22, 40, 46, 44, 39, 61, 22, 37, 40, 58, 61, 22, 59, 44, 47, 59, 44, 58, 33, 48, 34, 37, 24, 49, 46, 34, 48};
    }

    static {
        A08();
        A00 = A00(80, 7, 82);
        A03 = new AtomicBoolean();
        A04 = new AtomicReference<>();
    }

    public static String A01(C7S c7s) {
        return WebSettings.getDefaultUserAgent(c7s);
    }

    public static String A02(final C7S c7s) {
        FutureTask futureTask = new FutureTask(new Callable<String>() { // from class: com.facebook.ads.redexgen.X.8V
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final String call() {
                AtomicReference atomicReference;
                AtomicReference atomicReference2;
                atomicReference = C8W.A04;
                String browserUserAgent = (String) atomicReference.get();
                if (browserUserAgent != null) {
                    return browserUserAgent;
                }
                WebView webView = new WebView(C7S.this.getApplicationContext());
                webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.ads.redexgen.X.8U
                    @Override // android.webkit.WebViewClient
                    public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                        NB.A02(C01997x.A2g);
                        return true;
                    }
                });
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                if (userAgentString != null) {
                    atomicReference2 = C8W.A04;
                    atomicReference2.set(userAgentString);
                }
                return userAgentString;
            }
        });
        for (int i = 0; i < 3; i++) {
            LP.A00(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable th) {
                A09(c7s, th);
                SystemClock.sleep(500L);
            }
        }
        return null;
    }

    public static String A03(C7S c7s, AnonymousClass87 anonymousClass87) {
        String A07 = anonymousClass87.A07();
        if (TextUtils.isEmpty(A07)) {
            boolean andSet = A03.getAndSet(true);
            String[] strArr = A02;
            if (strArr[4].charAt(26) != strArr[3].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "SlGltdwaGCQXXY2U2bjZ1NfeES9SOW6r";
            strArr2[0] = "AnJMWH4pc3dV3Xqon1tLsffrk7nZCcYt";
            if (!andSet) {
                InterfaceC01987w A072 = c7s.A07();
                int i = C01997x.A1Z;
                String bundle = A00(73, 7, 29);
                C02007y c02007y = new C02007y(bundle);
                String bundle2 = A00(116, 7, 65);
                A072.A9M(bundle2, i, c02007y);
            }
        }
        return A07;
    }

    public static String A04(C7S c7s, boolean z) {
        if (c7s == null) {
            return A00;
        }
        if (z) {
            return System.getProperty(A00(123, 10, 74));
        }
        AtomicReference<String> atomicReference = A04;
        String str = atomicReference.get();
        if (str != null) {
            return str;
        }
        long A012 = IO.A01(c7s);
        String A002 = A00(143, 23, 90);
        String A003 = A00(133, 10, 64);
        String userAgentString = A00(88, 28, 104);
        if (A012 > 0) {
            SharedPreferences sharedPreferences = c7s.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c7s), 0);
            String string = sharedPreferences.getString(A003, null);
            long spUserAgentRefresh = sharedPreferences.getLong(A002, 0L);
            if (!TextUtils.isEmpty(string) && System.currentTimeMillis() - spUserAgentRefresh < A012) {
                atomicReference.set(string);
                return string;
            }
        }
        String str2 = null;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                str2 = A01(c7s);
                atomicReference.set(str2);
            } catch (Throwable t) {
                A09(c7s, t);
            }
        }
        if (str2 == null) {
            str2 = A02(c7s);
        }
        if (str2 == null) {
            String str3 = A00;
            String[] strArr = A02;
            String str4 = strArr[2];
            String browserUserAgent = strArr[6];
            if (str4.charAt(19) == browserUserAgent.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[4] = "StKvz6zSFpxDJ9oVJdJRJeNQczVDnPLD";
            strArr2[3] = "N8R2WFi4AoJsdw6tflYfsN6oN8Vo9HPM";
            return str3;
        }
        if (A012 > 0) {
            SharedPreferences sharedPreferences2 = c7s.getSharedPreferences(ProcessUtils.getProcessSpecificName(userAgentString, c7s), 0);
            sharedPreferences2.edit().putString(A003, A04.get()).apply();
            sharedPreferences2.edit().putLong(A002, System.currentTimeMillis()).apply();
        }
        return str2;
    }

    public static String A05(AnonymousClass87 anonymousClass87, C7S c7s) {
        if (IO.A04(c7s)) {
            return A00(63, 5, 117) + A03(c7s, anonymousClass87) + A00(39, 6, 127) + anonymousClass87.A06() + A00(45, 6, 121) + anonymousClass87.A04() + A00(38, 1, 111);
        }
        return A00(0, 0, 40);
    }

    public static String A06(AnonymousClass87 anonymousClass87, C7S c7s, boolean z) {
        return A04(c7s, z) + A00(0, 38, 127) + c7s.A04().A88() + A00(57, 6, 54) + AnonymousClass87.A03 + A00(38, 1, 111) + A05(anonymousClass87, c7s) + A00(68, 5, 69) + c7s.A04().A89() + A00(51, 6, 77) + Locale.getDefault().toString() + A00(87, 1, 79);
    }

    public static void A09(C7S c7s, Throwable th) {
        c7s.A07().A9M(A00(166, 8, 84), C01997x.A2f, new C02007y(th));
    }
}
