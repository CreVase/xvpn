package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class RD implements Runnable {
    public static String[] A01 = {"3bEhPYYzc5fVBItk4bGa", "Ce", "GmWtX09iNNzDLnDjdoFJEBRcRzFAcDBf", "N44QKPTSg6wcEQXW53eH2RsqUllmXQk2", "RFs4NAiy8zVcoINu9nJPhYOk9dbkWxsY", "g8LIsrvQi", "JD", "dbppRoUaCvn2Y"};
    public final /* synthetic */ C0396Gi A00;

    public RD(C0396Gi c0396Gi) {
        this.A00 = c0396Gi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[2].charAt(0) == strArr[4].charAt(0)) {
                throw new RuntimeException();
            }
            A01[3] = "AtJfA1XgCSxMZtT9btYZ3nyK8xLmcUYA";
            K0.A00(th, this);
        }
    }
}
