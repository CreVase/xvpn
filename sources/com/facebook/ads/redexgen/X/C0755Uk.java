package com.facebook.ads.redexgen.X;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Uk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0755Uk implements InterfaceC0443Ie {
    public static byte[] A0D;
    public static String[] A0E = {"uc0mqsrp7zbVSSUmEXyUZJQCGufws", "8g6ahr3vPydrTtk22", "YNqtB8iJmO2uVaHpbt6P5K9KH1grqDjF", "oDfi3coiS1yTvP0yt", "tbJDZpprNJoNbXk4MBqAl5O83qYFAo", "QKETic0g2MOurTT1w7cfpFQ", "PRNEoz9kKM8OadepDD5IPPYNQZFvnMHX", "tq93tXY5KQrS9ibGckbvCktGGZhVZKfr"};
    public static final String A0F;
    public int A00;
    public long A01;
    public final long A02;
    public final long A03;
    public final ConnectivityManager A04;
    public final Y9 A06;
    public final InterfaceC0442Id A07;
    public final InterfaceC0649Qh A08;
    public volatile boolean A0C;
    public final Runnable A0A = new C0757Um(this);
    public final Runnable A09 = new C0756Ul(this);
    public final ThreadPoolExecutor A0B = new ThreadPoolExecutor(1, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    public final Handler A05 = new Handler(Looper.getMainLooper());

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-39, -22, -48, -44, -73, -36, -26, -29, -44, -25, -42, -37, -36, -31, -38, -109, -40, -23, -40, -31, -25, -109, -101, -45, 6, -15, -13, -2, 2, -9, -3, -4, -82, 5, -10, -9, -6, -13, -82, -14, -9, 1, -2, -17, 2, -15, -10, -9, -4, -11, -82, -13, 4, -13, -4, 2, 1, -68, -28, -10, 3, 7, -10, 3, -79, 1, 3, 0, -12, -10, 4, 4, -10, -11, -79, 1, -14, 3, 5, -6, -14, -3, -79, -13, -14, 5, -12, -7, -67, -79, -12, 0, -1, 5, -6, -1, 6, -6, -1, -8, -79, 5, 0, -79, -1, -10, 9, 5, -79, 0, -1, -10, -65, 27, 45, 58, 62, 45, 58, -24, 58, 45, 59, 56, 55, 54, 59, 45, -24, 49, 59, -24, 45, 53, 56, 60, 65, -10, -17, 1, 14, 18, 1, 14, -68, 14, 1, 16, 17, 14, 10, 1, 0, -68, -3, -68, 10, 11, 10, -55, 15, 17, -1, -1, 1, 15, 15, 2, 17, 8, -68, 15, 16, -3, 16, 17, 15, -68, -1, 11, 0, 1, -68, 11, 2, -68, -61, -43, -30, -26, -43, -30, -112, -25, -47, -29, -112, -27, -34, -47, -46, -36, -43, -112, -28, -33, -112, -32, -30, -33, -45, -43, -29, -29, -112, -47, -36, -36, -112, -43, -26, -43, -34, -28, -29, -100, -112, -28, -30, -23, -39, -34, -41, -112, -47, -41, -47, -39, -34, -98, -17, 7, 5, 12, 12, 5, 10, 3, -68, 0, 5, 15, 12, -3, 16, -1, 4, -68, 0, 17, 1, -68, 16, 11, -68, 8, -3, -1, 7, -68, 11, 2, -68, -1, 11, 10, 10, 1, -1, 16, 5, 18, 5, 16, 21, -54, -31, -12, -12, -27, -19, -16, -12, -59, -47, -48, -48, -57, -59, -42, -53, -40, -53, -42, -37, 47, 44, 63, 44, -22, -5, -22, -13, -7, -8, 36, 21, 45, 32, 35, 21, 24};
    }

    static {
        A07();
        A0F = InterfaceC0443Ie.class.getSimpleName();
    }

    public C0755Uk(Y9 y9, InterfaceC0442Id interfaceC0442Id) {
        this.A07 = interfaceC0442Id;
        this.A06 = y9;
        this.A04 = (ConnectivityManager) y9.getSystemService(A03(293, 12, 10));
        this.A08 = C0667Qz.A01(y9);
        this.A03 = IR.A0K(y9);
        this.A02 = IR.A0J(y9);
    }

    public static /* synthetic */ int A00(C0755Uk c0755Uk) {
        int i = c0755Uk.A00 + 1;
        c0755Uk.A00 = i;
        return i;
    }

    private void A05() {
        this.A06.A04().A8o();
        this.A00 = 0;
        this.A01 = 0L;
        if (this.A0B.getQueue().size() == 0) {
            this.A07.AAT();
        }
    }

    private void A06() {
        if (this.A00 >= IR.A09(this.A06)) {
            A05();
            A56();
        } else {
            if (this.A00 == 1) {
                this.A01 = IR.A0I(this.A06);
            } else {
                this.A01 *= 2;
            }
            A57();
        }
    }

    private void A08(long j) {
        this.A05.postDelayed(this.A09, j);
    }

    private void A09(JSONObject jSONObject) throws JSONException {
        Map<String, String> shortEvnData = this.A06.A03().A4j();
        for (Map.Entry<String, String> entry : shortEvnData.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
    }

    public final void A0B() {
        try {
            NetworkInfo activeNetwork = this.A04.getActiveNetworkInfo();
            if (activeNetwork == null || !activeNetwork.isConnectedOrConnecting()) {
                if (this.A06.A04().A8o()) {
                    Log.e(A0F, A03(240, 46, 68));
                }
                A08(this.A02);
                return;
            }
            this.A06.A04().A8o();
            JSONObject A4X = this.A07.A4X();
            if (A4X == null) {
                this.A06.A04().A8o();
                A05();
                return;
            }
            boolean A8o = this.A06.A04().A8o();
            String A03 = A03(309, 6, 45);
            if (A8o && A4X.has(A03)) {
                JSONArray jSONArray = A4X.getJSONArray(A03);
                for (int i = 0; i < jSONArray.length(); i++) {
                    String str = A03(4, 19, 27) + i + A03(0, 3, 88) + jSONArray.get(i);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(A03(286, 7, 40), String.valueOf(this.A00));
            A09(jSONObject);
            A4X.put(A03(305, 4, 115), jSONObject);
            C0663Qv c0663Qv = new C0663Qv();
            c0663Qv.put(A03(315, 7, 92), A4X.toString());
            InterfaceC0648Qg ADp = this.A08.ADp(this.A06.A04().A6w(), c0663Qv.A08());
            String A64 = ADp != null ? ADp.A64() : null;
            if (!TextUtils.isEmpty(A64) && ADp != null) {
                if (ADp.A7v() != 200) {
                    if (this.A06.A04().A8o()) {
                        String responseBody = A0F;
                        Log.e(responseBody, A03(138, 48, 68) + ADp.A7v() + A03(3, 1, 78));
                    }
                    int A7v = ADp.A7v();
                    if (A0E[4].length() != 29) {
                        String[] strArr = A0E;
                        strArr[1] = "880m74azdbQx5kAj6";
                        strArr[3] = "QSHShLBOeb5hWYBY9";
                        if (A7v == 413 && IP.A1y(this.A06)) {
                            this.A07.ACd();
                            A05();
                            return;
                        } else {
                            if (A4X.has(A03)) {
                                this.A07.AB3(A4X.getJSONArray(A03));
                            }
                            A06();
                            return;
                        }
                    }
                    throw new RuntimeException();
                }
                if (!this.A07.AB5(new JSONArray(A64))) {
                    if (this.A06.A04().A8o()) {
                        Log.w(A0F, A03(186, 54, 24));
                    }
                    A06();
                    return;
                } else {
                    if (this.A07.A8y()) {
                        if (this.A06.A04().A8o()) {
                            Log.i(A0F, A03(58, 55, 57));
                        }
                        A06();
                        return;
                    }
                    A05();
                    return;
                }
            }
            if (this.A06.A04().A8o()) {
                Log.e(A0F, A03(113, 25, 112));
            }
            if (IP.A1p(this.A06) && A4X.has(A03)) {
                this.A07.AB3(A4X.getJSONArray(A03));
            }
            A06();
        } catch (Exception e) {
            if (this.A06.A04().A8o()) {
                Log.e(A0F, A03(23, 35, 54), e);
            }
            A06();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0443Ie
    public final void A56() {
        if (this.A0C) {
            return;
        }
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0443Ie
    public final void A57() {
        this.A0C = true;
        this.A05.removeCallbacks(this.A09);
        A08(this.A03);
    }
}
