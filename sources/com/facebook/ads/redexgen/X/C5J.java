package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import okhttp3.internal.http2.Http2Connection;

/* renamed from: com.facebook.ads.redexgen.X.5J */
/* loaded from: assets/audience_network.dex */
public final class C5J implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0O;
    public static String[] A0P = {"6hyfNvrTK6t0uOk4ZUiKTcly4lO9QIT3", "Cx5XWQG9gTlQcsVl0OO6K9WlulTSTZ", "4fLDdlgMQ2q", "AM05mUF2qaDkDYU3MyDNTK", "rN7iVf06fBiMXo1UDWoI2bEJDxOmVmjv", "9bqAz3M9pAQkcUJXzFdGLS", "1D1uNCEUmAwDpqE", "h0QQnxfLOYpp7kAK6sPhgGYv8wQTA65G"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public EnumC0479Jq A07;
    public InterfaceC0532Lu A08;
    public MR A09;
    public NJ A0A;
    public PK A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final AudienceNetworkActivity A0K;
    public final AudienceNetworkActivityApi A0L;
    public final YA A0M;
    public final List<C5H> A0N = new ArrayList();
    public int A01 = -1;
    public boolean A0F = false;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0O, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A0O = new byte[]{-3, 38, 71, 68, 87, 73, -36, -11, -24, -23, -13, -20, -89, -5, -10, -89, -16, -11, -19, -20, -7, -89, -3, -16, -20, -2, -37, 0, -9, -20, -89, -19, -7, -10, -12, -89, -16, -11, -5, -20, -11, -5, -89, -10, -7, -89, -6, -24, -3, -20, -21, -48, -11, -6, -5, -24, -11, -22, -20, -38, -5, -24, -5, -20, -12, 1, -14, -12, -10, 7, -4, 9, -4, 7, 12, -44, -35, -38, -42, -33, -27, -59, -32, -36, -42, -33, 1, 13, 11, -52, 4, -1, 1, 3, 0, 13, 13, 9, -52, -1, 2, 17, -52, -1, 2, 16, 3, 14, 13, 16, 18, 7, 12, 5, -52, -28, -25, -20, -25, -15, -26, -3, -33, -30, -3, -16, -29, -18, -19, -16, -14, -25, -20, -27, -3, -28, -22, -19, -11, -32, -20, -22, -85, -29, -34, -32, -30, -33, -20, -20, -24, -85, -34, -31, -16, -85, -26, -21, -15, -30, -17, -16, -15, -26, -15, -26, -34, -23, -85, -34, -32, -15, -26, -13, -26, -15, -10, -36, -31, -30, -16, -15, -17, -20, -10, -30, -31, 15, 27, 25, -38, 18, 13, 15, 17, 14, 27, 27, 23, -38, 13, 16, 31, -38, 21, 26, 32, 17, 30, 31, 32, 21, 32, 21, 13, 24, -38, 16, 21, 31, 25, 21, 31, 31, 17, 16, -23, -11, -13, -76, -20, -25, -23, -21, -24, -11, -11, -15, -76, -25, -22, -7, -76, -17, -12, -6, -21, -8, -7, -6, -17, -6, -17, -25, -14, -76, -22, -17, -7, -10, -14, -25, -1, -21, -22, 16, 28, 26, -37, 19, 14, 16, 18, 15, 28, 28, 24, -37, 14, 17, 32, -37, 22, 27, 33, 18, 31, 32, 33, 22, 33, 22, 14, 25, -37, 18, 31, 31, 28, 31, 54, 66, 64, 1, 57, 52, 54, 56, 53, 66, 66, 62, 1, 52, 55, 70, 1, 60, 65, 71, 56, 69, 70, 71, 60, 71, 60, 52, 63, 1, 57, 60, 65, 60, 70, 59, 50, 52, 54, 71, 60, 73, 60, 71, 76, 75, 87, 85, 22, 78, 73, 75, 77, 74, 87, 87, 83, 22, 73, 76, 91, 22, 81, 86, 92, 77, 90, 91, 92, 81, 92, 81, 73, 84, 22, 81, 85, 88, 90, 77, 91, 91, 81, 87, 86, 22, 84, 87, 79, 79, 77, 76, 42, 59, 42, 51, 57, 68, 57, 70, 60, 75, 59, 57, 72, 61, 15, 7, 6, 11, 3, 22, 11, 17, 16, -26, 3, 22, 3, -7, -11, -22, -20, -18, -10, -18, -9, -3, -46, -19, 87, 86, 89, 91, 89, 72, 80, 91, 76, 78, 65, 64, 65, 66, 69, 74, 65, 64, 43, 78, 69, 65, 74, 80, 61, 80, 69, 75, 74, 39, 65, 85, -8, -21, -9, -5, -21, -7, -6, -38, -17, -13, -21, 44, 36, 34, 41, -6, 31, 45, 30, 43, 12, 30, 28, 40, 39, 29, 44, -12, -17, -33, -17, -14, -23, -27, -18, -12, -31, -12, -23, -17, -18, 57, 50, 45, 53, 57, 41, 13, 40, 90, 77, 73, 91, 56, 93, 84, 73};
    }

    static {
        A09();
    }

    public C5J(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0K = audienceNetworkActivity;
        this.A0L = audienceNetworkActivityApi;
        YA A01 = C5Q.A01(audienceNetworkActivity);
        this.A0M = A01;
        A01.A0H(this);
    }

    private int A00() {
        Rect rect = new Rect();
        Window window = this.A0K.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    private InterfaceC0532Lu A02(Intent intent) {
        InterfaceC0532Lu A0N;
        InterfaceC0532Lu A0L;
        InterfaceC0532Lu A0K;
        InterfaceC0532Lu A0M;
        InterfaceC0532Lu A0H;
        InterfaceC0532Lu A02;
        InterfaceC0532Lu A0O2;
        InterfaceC0532Lu A0P2;
        InterfaceC0532Lu A0G;
        InterfaceC0532Lu A0I;
        InterfaceC0532Lu A0Q;
        InterfaceC0532Lu A0R;
        InterfaceC0532Lu A0J;
        C5G c5g = new C5G(this, intent, this.A0M.A09(), this.A0M, null);
        if (this.A07 == null) {
            return null;
        }
        switch (C5F.A00[this.A07.ordinal()]) {
            case 1:
                A0J = c5g.A0J(this.A06);
                return A0J;
            case 2:
                A0R = c5g.A0R();
                if (A0P[6].length() != 15) {
                    throw new RuntimeException();
                }
                A0P[2] = "9AjKOltSNiH";
                return A0R;
            case 3:
                A0Q = c5g.A0Q();
                return A0Q;
            case 4:
                A0I = c5g.A0I();
                return A0I;
            case 5:
                A0G = c5g.A0G();
                return A0G;
            case 6:
                A0P2 = c5g.A0P();
                return A0P2;
            case 7:
                A0O2 = c5g.A0O();
                return A0O2;
            case 8:
                A02 = c5g.A02();
                if (A0P[1].length() != 0) {
                    A0P[1] = "wwrXZHO6We2";
                    return A02;
                }
                A0P[1] = "bd05r2lrBXgQHiU8zhW56DndFWzJq";
                return A02;
            case 9:
                A0H = c5g.A0H();
                return A0H;
            case 10:
                A0M = c5g.A0M();
                if (A0P[2].length() == 25) {
                    throw new RuntimeException();
                }
                A0P[7] = "st3v0TpfdqXoPWlO02nQcse4uCAIapoF";
                return A0M;
            case 11:
                A0K = c5g.A0K();
                return A0K;
            case 12:
                A0L = c5g.A0L();
                if (A0P[7].charAt(27) == 'B') {
                    throw new RuntimeException();
                }
                A0P[1] = "x";
                return A0L;
            case 13:
            case 14:
                A0N = c5g.A0N(this.A07);
                return A0N;
            default:
                return null;
        }
    }

    private void A06() {
        String str = this.A0E;
        if (str != null) {
            PK A01 = PJ.A01(this.A0M, str);
            this.A0B = A01;
            if (A01 != null) {
                this.A06.addView(this.A0B, new RelativeLayout.LayoutParams(-1, -1));
            }
        }
    }

    private void A07() {
        if (IP.A1G(this.A0K) && Build.VERSION.SDK_INT >= 24) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.5E
                @Override // java.lang.Runnable
                public final void run() {
                    C5J.this.A0M();
                }
            }, 1000L);
        }
    }

    private void A08() {
        if (!this.A0I) {
            if (A0I()) {
                A0F(EnumC0628Pm.A03.A02());
            } else {
                A0F(A05(139, 48, 14));
            }
            this.A0I = true;
        }
    }

    private void A0A(Intent intent) {
        if (IP.A12(this.A0K)) {
            EnumC0479Jq enumC0479Jq = this.A07;
            EnumC0479Jq enumC0479Jq2 = EnumC0479Jq.A02;
            if (A0P[2].length() == 25) {
                throw new RuntimeException();
            }
            A0P[1] = "ROWUzhbvPevH2";
            if (enumC0479Jq != enumC0479Jq2 && Build.VERSION.SDK_INT >= 18) {
                this.A0A = new NJ();
                this.A0A.A0C(intent.getStringExtra(A05(419, 11, 26)));
                NJ nj = this.A0A;
                String placementId = this.A0K.getPackageName();
                nj.A0B(placementId);
                String placementId2 = A05(462, 11, 23);
                long longExtra = intent.getLongExtra(placementId2, 0L);
                if (longExtra != 0) {
                    this.A0A.A09(longExtra);
                }
                TextView textView = new TextView(this.A0K);
                String placementId3 = A05(1, 5, 115);
                textView.setText(placementId3);
                textView.setTextColor(-1);
                LV.A0M(textView, Color.argb(160, 0, 0, 0));
                textView.setPadding(5, 5, 5, 5);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12, -1);
                layoutParams.addRule(11, -1);
                textView.setLayoutParams(layoutParams);
                C5I c5i = new C5I(this, null);
                textView.setOnLongClickListener(c5i);
                this.A06.setOnLongClickListener(c5i);
                this.A06.getOverlay().add(this.A0A);
            }
        }
    }

    private void A0B(Intent intent, Bundle bundle) {
        String A05 = A05(511, 8, 117);
        String A052 = A05(503, 8, 85);
        String A053 = A05(438, 24, 109);
        if (bundle != null) {
            Bundle A02 = KN.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = A02.getInt(A053, -1);
            this.A0C = A02.getString(A052);
            this.A07 = (EnumC0479Jq) A02.getSerializable(A05);
            return;
        }
        this.A01 = intent.getIntExtra(A053, -1);
        this.A0C = intent.getStringExtra(A052);
        this.A07 = (EnumC0479Jq) intent.getSerializableExtra(A05);
        this.A02 = intent.getIntExtra(A05(473, 16, 74), 0) * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:            if (r3.equals(r6) != false) goto L41;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0F(java.lang.String r6) {
        /*
            r5 = this;
            r2 = 345(0x159, float:4.83E-43)
            r1 = 47
            r0 = 121(0x79, float:1.7E-43)
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            r4 = 1
            if (r0 != 0) goto L1d
            com.facebook.ads.redexgen.X.Pm r0 = com.facebook.ads.redexgen.X.EnumC0628Pm.A0A
            java.lang.String r0 = r0.A02()
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L1f
        L1d:
            r5.A0H = r4
        L1f:
            r2 = 265(0x109, float:3.71E-43)
            r1 = 35
            r0 = 62
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L5a
            com.facebook.ads.redexgen.X.Pm r0 = com.facebook.ads.redexgen.X.EnumC0628Pm.A09
            java.lang.String r3 = r0.A02()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C5J.A0P
            r0 = 6
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 15
            if (r1 == r0) goto L48
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5J.A0P
            java.lang.String r1 = "BsUqgJlN3izr4734FAkiK4"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "DZ4pb9dksBh2p0w2isnwDh"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L5c
        L5a:
            r5.A0G = r4
        L5c:
            r2 = 86
            r1 = 53
            r0 = 47
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L72
            r0 = 9
            r5.finish(r0)
            return
        L72:
            r2 = 300(0x12c, float:4.2E-43)
            r1 = 45
            r0 = 100
            java.lang.String r0 = A05(r2, r1, r0)
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L88
            r0 = 10
            r5.finish(r0)
            return
        L88:
            r0 = 0
            r5.A0H(r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C5J.A0F(java.lang.String):void");
    }

    public void A0G(String str, C1X c1x) {
        if (this.A08 == null) {
            return;
        }
        if (this.A09 == null) {
            YA ya = this.A0M;
            this.A09 = MS.A02(ya, ya.A09(), str, c1x, this.A08, new C0865Yt(this, null));
            this.A09.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        LV.A0J(this.A09);
        LV.A0T(this.A06);
        this.A06.addView(this.A09);
        this.A09.A0K();
    }

    public void A0H(String str, C8Y c8y) {
        Intent intent = new Intent(str + A05(0, 1, 84) + this.A0C);
        if (c8y != null) {
            intent.putExtra(A05(392, 5, 86), c8y);
        }
        C00622c.A00(this.A0K).A07(intent);
    }

    private boolean A0I() {
        return this.A07 == EnumC0479Jq.A0F || this.A07 == EnumC0479Jq.A0E || this.A07 == EnumC0479Jq.A07 || this.A07 == EnumC0479Jq.A04 || this.A07 == EnumC0479Jq.A0D;
    }

    public final AudienceNetworkActivity A0J() {
        return this.A0K;
    }

    public final YA A0K() {
        return this.A0M;
    }

    public final void A0L() {
        if (A0I()) {
            A0F(EnumC0628Pm.A09.A02());
        } else {
            A0F(A05(265, 35, 62));
        }
    }

    public final /* synthetic */ void A0M() {
        if (this.A0K.isInMultiWindowMode()) {
            this.A0M.A0E().A9k(A00());
        }
    }

    public final void A0N(C5H c5h) {
        this.A0N.add(c5h);
    }

    public final void A0O(C5H c5h) {
        this.A0N.remove(c5h);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        KU customDumpsysWriter = KV.A00();
        if (customDumpsysWriter != null) {
            boolean overrideDumpsys = customDumpsysWriter.overrideDumpsys(str, fileDescriptor, printWriter, strArr);
            if (A0P[2].length() == 25) {
                throw new RuntimeException();
            }
            A0P[6] = "QxWYw7ht1er43uY";
            if (overrideDumpsys) {
                return;
            }
        }
        this.A0L.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0M.A0E().A2Y(String.valueOf(A0J().hashCode()), i);
        if (this.A0K.isFinishing()) {
            return;
        }
        if (IP.A1V(this.A0M) && !this.A0H && !this.A0G) {
            this.A0M.A0E().AAD();
            A0L();
        }
        if (A0I() && !this.A0F) {
            A0F(EnumC0628Pm.A05.A02());
        } else {
            A0F(A05(187, 39, 61));
        }
        A08();
        this.A0L.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, Intent intent) {
        InterfaceC0532Lu interfaceC0532Lu = this.A08;
        if (interfaceC0532Lu != null && interfaceC0532Lu.onActivityResult(i, i2, intent)) {
            return;
        }
        TJ.A09(i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A03;
        long currentTime = currentTimeMillis - this.A04;
        long j2 = j + currentTime;
        this.A03 = j2;
        this.A04 = currentTimeMillis;
        if (j2 > this.A02) {
            boolean shouldIntercept = false;
            Iterator<C5H> it = this.A0N.iterator();
            while (it.hasNext()) {
                if (it.next().A8k()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0L.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i = configuration.orientation;
            String A05 = A05(489, 14, 17);
            if (i == 1) {
                hashMap.put(A05, A05(430, 8, 120));
            } else {
                hashMap.put(A05, A05(397, 9, 105));
            }
            EnumC0451Im enumC0451Im = EnumC0451Im.A0K;
            InterfaceC0532Lu interfaceC0532Lu = this.A08;
            C0452In.A02(enumC0451Im, hashMap, interfaceC0532Lu == null ? A05(0, 0, 50) : interfaceC0532Lu.getCurrentClientToken(), this.A0M.A09());
            this.A00 = configuration.orientation;
            A07();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        LX.A02();
        if (IP.A1l(this.A0K)) {
            Window window = this.A0K.getWindow();
            String[] strArr = A0P;
            if (strArr[0].charAt(26) != strArr[4].charAt(26)) {
                throw new RuntimeException();
            }
            A0P[6] = "7njofUp2AYjKONZ";
            window.setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        }
        Intent intent = KN.A01(this.A0K.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        this.A05 = intent;
        YA A03 = KN.A03(intent);
        if (A03 != null) {
            YA startAdContext = this.A0M;
            startAdContext.A0F(A03.A0E());
            YA startAdContext2 = this.A0M;
            startAdContext2.A0C(A03.A0B());
        }
        this.A0M.A0E().A2Z(String.valueOf(A0J().hashCode()));
        this.A0K.requestWindowFeature(1);
        this.A0K.getWindow().setFlags(UserVerificationMethods.USER_VERIFY_ALL, UserVerificationMethods.USER_VERIFY_ALL);
        RelativeLayout relativeLayout = new RelativeLayout(this.A0K);
        this.A06 = relativeLayout;
        LV.A0M(relativeLayout, 0);
        this.A0K.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        A0B(this.A05, bundle);
        InterfaceC0532Lu A02 = A02(this.A05);
        this.A08 = A02;
        if (A02 == null) {
            this.A0M.A07().A9M(A05(64, 11, 36), C01997x.A0A, new C02007y(A05(6, 58, 24)));
            A0L();
            finish(7);
            return;
        }
        A02.A9C(this.A05, bundle, this);
        A0F(A05(226, 39, 23));
        this.A04 = System.currentTimeMillis();
        this.A0E = this.A05.getStringExtra(A05(406, 13, 51));
        A06();
        A0A(this.A05);
        this.A00 = this.A0K.getResources().getConfiguration().orientation;
        String A05 = A05(75, 11, 2);
        if (bundle != null) {
            this.A0D = bundle.getString(A05);
        } else {
            this.A0D = this.A05.getStringExtra(A05);
        }
        if (IP.A1t(this.A0K) && this.A0K.getWindow() != null) {
            this.A0K.getWindow().addFlags(128);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:            if (r3 != null) goto L46;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:            if (com.facebook.ads.redexgen.X.IP.A12(r4.A0K) == false) goto L49;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:            r4.A0A.A07();     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:            r3 = r4.A09;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:            if (com.facebook.ads.redexgen.X.C5J.A0P[2].length() == 25) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:            r2 = com.facebook.ads.redexgen.X.C5J.A0P;        r2[5] = "rHb3ILEFnyWtMYiOwcguj0";        r2[3] = "XKBHK5KZoSEcfbvzOM5yLt";     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008a, code lost:            if (r3 == null) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008c, code lost:            r3.A0J();     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008f, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:            if (r3 == null) goto L61;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009a, code lost:            if (r3 != null) goto L46;     */
    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDestroy() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.YA r0 = r4.A0M
            com.facebook.ads.redexgen.X.0S r1 = r0.A0E()
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0J()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.A2a(r0)
            r4.A08()
            android.widget.RelativeLayout r0 = r4.A06
            if (r0 == 0) goto L1f
            r0.removeAllViews()
        L1f:
            com.facebook.ads.redexgen.X.Lu r0 = r4.A08
            if (r0 == 0) goto L4a
            r0.onDestroy()
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5J.A0P
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L40
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L40:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5J.A0P
            java.lang.String r1 = "BK5JyIukG"
            r0 = 1
            r2[r0] = r1
            r0 = 0
            r4.A08 = r0
        L4a:
            com.facebook.ads.redexgen.X.NJ r3 = r4.A0A
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5J.A0P
            r0 = 0
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L93
            if (r3 == 0) goto L6f
        L62:
            com.facebook.ads.AudienceNetworkActivity r0 = r4.A0K
            boolean r0 = com.facebook.ads.redexgen.X.IP.A12(r0)
            if (r0 == 0) goto L6f
            com.facebook.ads.redexgen.X.NJ r0 = r4.A0A
            r0.A07()
        L6f:
            com.facebook.ads.redexgen.X.MR r3 = r4.A09
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C5J.A0P
            r0 = 2
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 25
            if (r1 == r0) goto L90
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5J.A0P
            java.lang.String r1 = "rHb3ILEFnyWtMYiOwcguj0"
            r0 = 5
            r2[r0] = r1
            java.lang.String r1 = "XKBHK5KZoSEcfbvzOM5yLt"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L8f
        L8c:
            r3.A0J()
        L8f:
            return
        L90:
            if (r3 == 0) goto L8f
            goto L8c
        L93:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C5J.A0P
            java.lang.String r1 = "VoJV9dI9dal5KZ60JkB8i5Bpps"
            r0 = 2
            r2[r0] = r1
            if (r3 == 0) goto L6f
            goto L62
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C5J.onDestroy():void");
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0M.A0E().A2b(String.valueOf(A0J().hashCode()));
        this.A03 += System.currentTimeMillis() - this.A04;
        InterfaceC0532Lu interfaceC0532Lu = this.A08;
        if (interfaceC0532Lu != null) {
            interfaceC0532Lu.ACJ(false);
            if (!this.A0K.isFinishing()) {
                C0452In.A02(EnumC0451Im.A0E, null, this.A08.getCurrentClientToken(), this.A0M.A09());
                this.A0J = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0M.A0E().A2c(String.valueOf(A0J().hashCode()));
        this.A04 = System.currentTimeMillis();
        InterfaceC0532Lu interfaceC0532Lu = this.A08;
        if (interfaceC0532Lu != null) {
            interfaceC0532Lu.ACj(false);
            if (this.A0J) {
                C0452In.A02(EnumC0451Im.A0F, null, this.A08.getCurrentClientToken(), this.A0M.A09());
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        InterfaceC0532Lu interfaceC0532Lu = this.A08;
        if (interfaceC0532Lu != null) {
            interfaceC0532Lu.AEt(bundle2);
        }
        bundle2.putInt(A05(438, 24, 109), this.A01);
        bundle2.putString(A05(503, 8, 85), this.A0C);
        bundle2.putString(A05(75, 11, 2), this.A0D);
        bundle2.putSerializable(A05(511, 8, 117), this.A07);
        KN.A08(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0M.A0E().A2d(String.valueOf(A0J().hashCode()));
        int i = this.A01;
        if (i != -1) {
            C0526Lo.A02(this.A0K, i, this.A0M);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0M.A0E().A2e(String.valueOf(A0J().hashCode()));
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A0L.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A0L();
        finish(5);
    }
}
