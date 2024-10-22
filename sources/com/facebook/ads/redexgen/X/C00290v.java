package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.0v, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00290v {
    public static C00290v A08;
    public static byte[] A09;
    public static String[] A0A = {"TOlR5WIHpQxnCrBDCJGIvboS5c1GP2eb", "1A072KPTjzB", "BhIKZU0mEosMUOfZes2VT64q11XJ2Uhn", "3eQHzZddeWPmYl0bNsvnb2WjxREMTE8a", "x", "3ukMDhdDleVgfGP2GHVzNRiRwZbG92ZS", "tXOxwX9vQ8QECIpzr41AiGeD6LbiHgO3", "feL0RS1gsJrC9VyxtC"};
    public static final String A0B;
    public boolean A01;
    public final C7S A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final C00280u A02 = new C00280u();
    public String A00 = null;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 69);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        byte[] bArr = {114, 115, 97, 10, 31, 65, 68, 83, 99, 65, 80, 80, 73, 78, 71, 105, 78, 70, 79, 14, 84, 88, 84, 1, 3, 18, 18, 7, 6, 35, 6, 17, 76, 22, 26, 22, 37, 49, 38, 50, 54, 38, 45, 32, 58, 28, 32, 34, 51, 51, 42, 45, 36};
        if (A0A[0].charAt(25) == 's') {
            throw new RuntimeException();
        }
        A0A[6] = "ekiMbk44dvQ4iEpOly1MsU0Tkyq5eij5";
        A09 = bArr;
    }

    static {
        A09();
        A0B = C00290v.class.getSimpleName();
    }

    public C00290v(C7S c7s, boolean z, Executor executor, String str) {
        this.A03 = c7s.A01();
        this.A04 = str;
        this.A07 = executor;
        if (z) {
            A0A();
        }
    }

    public static synchronized C00290v A01(C7S c7s) {
        C00290v c00290v;
        synchronized (C00290v.class) {
            if (A08 == null) {
                A08 = new C00290v(c7s, true, ExecutorC0512La.A06, A03(0, 0, 103));
            }
            c00290v = A08;
        }
        return c00290v;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 103);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = new String(data, A03(0, 5, 98));
                    A03 = fileContent;
                }
            }
        } catch (FileNotFoundException e) {
            this.A03.A07().A9M(A03(36, 17, 6), C01997x.A17, new C02007y(e));
        } catch (IOException e2) {
            this.A03.A07().A9M(A03(36, 17, 6), C01997x.A19, new C02007y(e2));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 6);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 39)));
            this.A02.A0A(A04(A03(5, 18, 101)));
        } catch (C02007y e) {
            A0M();
            this.A03.A07().A9M(A03, C01997x.A18, e);
        } catch (JSONException e2) {
            A0M();
            this.A03.A07().A9M(A03, C01997x.A1A, new C02007y(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C0951at(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(C1Q c1q, String str, boolean z) {
        c1q.A07(z);
        if (c1q.A08() || c1q.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 39), str.getBytes());
        A0H(A03(5, 18, 101), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(this.A03.getFilesDir(), str));
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            }
        } catch (FileNotFoundException e) {
            this.A03.A07().A9M(A03(36, 17, 6), C01997x.A17, new C02007y(e));
        } catch (IOException e2) {
            this.A03.A07().A9M(A03(36, 17, 6), C01997x.A19, new C02007y(e2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z = false;
        try {
            synchronized (this.A02) {
                z = this.A02.A05().get(str) instanceof C1Q;
            }
        } catch (JSONException e) {
            this.A03.A07().A9M(A03(36, 17, 6), C01997x.A1A, new C02007y(e));
        }
        return z;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C0948aq(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 101));
        A0F(this.A04 + A03(23, 13, 39));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new C0949ar(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        boolean A14 = IP.A14(this.A03);
        this.A01 = A14;
        if (!A14) {
            return;
        }
        this.A07.execute(new C0950as(this, jSONObject));
    }
}
