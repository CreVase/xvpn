package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class OD implements Runnable {
    public static String[] A01 = {"ZvDtHAz5m48M18w3xVBvW9UUvAxUfTco", "Su9zcdtZ9ImnInrf0ILgVeApSeGsgvZI", "xXqvKIRF0PBjEGaR7TZ18ROMB", "m2Hewa3Z6gbURtNYV3SWt7DVdluwrYvz", "mWXUFmbAmKViJClAM9LXlAC", "0Y7AahKvzPLarINwhoocY8ezozCmsz", "5fBoxvqmYpNfoXwOAmWasRGE3QCsQXLn", "O4RwXCXfxOQMJWQD0Tqe5fA"};
    public final /* synthetic */ C0705Sl A00;

    public OD(C0705Sl c0705Sl) {
        this.A00 = c0705Sl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        if (K0.A02(this)) {
            return;
        }
        try {
            z = this.A00.A0O;
            if (!z) {
                return;
            }
            this.A00.A0N();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[0].charAt(31) == strArr[6].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "0ZDTnX20ALQ1qRFYGfQrfbk";
            strArr2[4] = "BYw49wL2ISjP5kGNoOWH1Xi";
            K0.A00(th, this);
        }
    }
}
