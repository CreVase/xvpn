package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Dy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0335Dy {
    public static byte[] A0F;
    public static String[] A0G = {"68X6mTnOwXdfZzYVO84LiBNlITu89iQX", "mcCM", "SB1U", "GkXNtRrGsWIfNkCQn88aLdXmD8Z6vhvm", "Qey5CsRmzWj382X", "n9", "Qz1jsOzCfP5BXHleCyslZPCOD1Jlt2Hf", "OEfF4KTHhKUz1ci9ksApPyeCZN0rEDYT"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C0317De A09;
    public final E3 A0A;
    public final ArrayList<RunnableC0332Dv> A0B;
    public final ArrayList<RunnableC0332Dv> A0C;
    public final CopyOnWriteArraySet<InterfaceC0328Dr> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 37);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{6, 69, 74, 71, 85, 78, 67, 85, 6, 81, 79, 82, 78, 6, 62, 36, 64, 117, 33, 109, 100, 96, 114, 117, 33, 110, 111, 100, 33, 69, 100, 114, 100, 115, 104, 96, 109, 104, 123, 100, 115, 33, 104, 114, 33, 115, 100, 112, 116, 104, 115, 100, 101, 47, 82, 121, 97, 120, 122, 121, 119, 114, 91, 119, 120, 119, 113, 115, 100, 54, 112, Byte.MAX_VALUE, 122, 115, 54, Byte.MAX_VALUE, 57, 121, 42, 31, 13, 21, 94, 23, 13, 94, 31, 26, 26, 27, 26, 9, 60, 46, 54, 125, 46, 41, 60, 41, 56, 125, 52, 46, 125, 62, 53, 60, 51, 58, 56, 57};
    }

    static {
        A0C();
    }

    public C0335Dy(E3 e3, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        HI.A05(deserializerArr.length > 0, A05(16, 38, 36));
        this.A0A = e3;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new C0317De(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        HandlerThread handlerThread = new HandlerThread(A05(54, 24, 51));
        this.A08 = handlerThread;
        handlerThread.start();
        this.A06 = new Handler(handlerThread.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC0332Dv A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC0332Dv runnableC0332Dv = new RunnableC0332Dv(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC0332Dv);
        A0J(A05(78, 13, 91), runnableC0332Dv);
        return runnableC0332Dv;
    }

    private void A08() {
        this.A06.post(new RunnableC0326Dp(this));
    }

    private void A09() {
        if (!A0R()) {
            return;
        }
        Iterator<InterfaceC0328Dr> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[3].charAt(7) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "Uj";
            strArr[4] = "M47RheKcpZxFkBs";
            if (hasNext) {
                it.next().ABW(this);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        DownloadAction A06;
        boolean canStartTask;
        if (!this.A02 || this.A03) {
            return;
        }
        boolean skipDownloadActions = this.A01 || this.A0B.size() == this.A04;
        for (int i = 0; i < this.A0C.size(); i++) {
            RunnableC0332Dv runnableC0332Dv = this.A0C.get(i);
            boolean A0H = RunnableC0332Dv.A0H(runnableC0332Dv);
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[5] = "ZZ";
            strArr[4] = "k3SOhcJE6F5rWIN";
            if (A0H && ((canStartTask = (A06 = RunnableC0332Dv.A06(runnableC0332Dv)).A03) || !skipDownloadActions)) {
                boolean z = true;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        break;
                    }
                    RunnableC0332Dv runnableC0332Dv2 = this.A0C.get(i2);
                    if (RunnableC0332Dv.A06(runnableC0332Dv2).A09(A06)) {
                        if (canStartTask) {
                            z = false;
                            String str = runnableC0332Dv + A05(0, 14, 3) + runnableC0332Dv2;
                            RunnableC0332Dv.A0C(runnableC0332Dv2);
                        } else if (RunnableC0332Dv.A06(runnableC0332Dv2).A03) {
                            z = false;
                            skipDownloadActions = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (z) {
                    RunnableC0332Dv.A0D(runnableC0332Dv);
                    if (!canStartTask) {
                        this.A0B.add(runnableC0332Dv);
                        skipDownloadActions = this.A0B.size() == this.A04;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i = 0; i < this.A0C.size(); i++) {
            downloadActionArr[i] = RunnableC0332Dv.A06(this.A0C.get(i));
        }
        this.A06.post(new RunnableC0327Dq(this, downloadActionArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(RunnableC0332Dv runnableC0332Dv) {
        A0J(A05(91, 21, 120), runnableC0332Dv);
        C0334Dx A0K = runnableC0332Dv.A0K();
        Iterator<InterfaceC0328Dr> it = this.A0D.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0G[0].charAt(7) == 'Z') {
                throw new RuntimeException();
            }
            A0G[0] = "TUrgn6We5nsrVkZlQG2KUeV0nEHaGaai";
            if (hasNext) {
                it.next().AD8(this, A0K);
            } else {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC0332Dv runnableC0332Dv) {
        if (this.A03) {
            return;
        }
        boolean z = !runnableC0332Dv.A0L();
        if (z) {
            this.A0B.remove(runnableC0332Dv);
        }
        A0D(runnableC0332Dv);
        if (A0G[3].charAt(7) == 'd') {
            throw new RuntimeException();
        }
        A0G[6] = "xCRZPuTuqF5VhljpIGNZbvIN3H6gjFvE";
        boolean stopped = runnableC0332Dv.A0M();
        if (stopped) {
            this.A0C.remove(runnableC0332Dv);
            A0B();
        }
        if (z) {
            A0A();
            A09();
        }
    }

    public static void A0J(String str, RunnableC0332Dv runnableC0332Dv) {
        String str2 = str + A05(14, 2, 33) + runnableC0332Dv;
    }

    public final int A0O(DownloadAction downloadAction) {
        HI.A04(!this.A03);
        RunnableC0332Dv A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (RunnableC0332Dv.A03(A02) == 0) {
                A0D(A02);
            }
        }
        return RunnableC0332Dv.A04(A02);
    }

    public final void A0P() {
        HI.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0Q(InterfaceC0328Dr interfaceC0328Dr) {
        this.A0D.add(interfaceC0328Dr);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x0014 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A0R() {
        /*
            r4 = this;
            boolean r0 = r4.A03
            r3 = 1
            r0 = r0 ^ r3
            com.facebook.ads.redexgen.X.HI.A04(r0)
            boolean r0 = r4.A02
            r2 = 0
            if (r0 != 0) goto Ld
            return r2
        Ld:
            r1 = 0
        Le:
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dv> r0 = r4.A0C
            int r0 = r0.size()
            if (r1 >= r0) goto L28
            java.util.ArrayList<com.facebook.ads.redexgen.X.Dv> r0 = r4.A0C
            java.lang.Object r0 = r0.get(r1)
            com.facebook.ads.redexgen.X.Dv r0 = (com.facebook.ads.redexgen.X.RunnableC0332Dv) r0
            boolean r0 = r0.A0L()
            if (r0 == 0) goto L25
            return r2
        L25:
            int r1 = r1 + 1
            goto Le
        L28:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0335Dy.A0R():boolean");
    }

    public final C0334Dx[] A0S() {
        HI.A04(!this.A03);
        C0334Dx[] c0334DxArr = new C0334Dx[this.A0C.size()];
        for (int i = 0; i < c0334DxArr.length; i++) {
            c0334DxArr[i] = this.A0C.get(i).A0K();
        }
        return c0334DxArr;
    }
}
