package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public class K1 extends K8 {
    public static String[] A02 = {"NpaKE5UdtAyMHqvaLPx4AGtZ31wY3C1j", "hZ", "QvlAFGERqyhtEWGueXr2oEhguGRVkueU", "1PB7Q2A0OVus1FFgj1K4N07XZBnviAmq", "QCLV5siYIKSB8enqXDrdMSWnSISBhPag", "u71qdrqstjoPYAgdzxDuhzTAB45rQyDC", "tsgBYsPi1Izoi1wW5rl36QAscdyZX4HE", "imzaDMEG6ltP9AayN9N6Pvq8SnbIyMdS"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0635Pt A01;

    public K1(C0635Pt c0635Pt, int i) {
        this.A01 = c0635Pt;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        RX videoView;
        RX videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null) {
            int i = this.A00;
            if (A02[1].length() == 23) {
                throw new RuntimeException();
            }
            A02[5] = "iSSYmESuchF7uAVhXaEYpov3466pRlYS";
            if (i <= 0) {
                videoView2 = this.A01.A00.A00.getVideoView();
                videoView2.A0e(false, 9);
            }
        }
    }
}
