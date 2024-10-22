package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;
import com.facebook.ads.redexgen.X.C0436Hx;
import com.facebook.ads.redexgen.X.HI;
import com.facebook.ads.redexgen.X.I3;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class DummySurface extends Surface {
    public static int A03;
    public static boolean A04;
    public static byte[] A05;
    public boolean A00;
    public final boolean A01;
    public final I3 A02;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 19);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{75, 73, 66, 81, 75, 86, 90, 81, 126, 124, 97, 122, 107, 109, 122, 107, 106, 81, 109, 97, 96, 122, 107, 96, 122, 9, 11, 0, 19, 7, 4, 30, 19, 63, 57, 62, 42, 45, 47, 41, 32, 41, 63, 63, 19, 47, 35, 34, 56, 41, 52, 56, 46, 21, 8, 14, 11, 11, 20, 9, 15, 30, 31, 91, 11, 9, 18, 20, 9, 91, 15, 20, 91, 58, 43, 50, 91, 23, 30, 13, 30, 23, 91, 74, 76, 51, 63, 90, 93, 94, 91, 19, 28, 22, 0, 29, 27, 22, 92, 26, 19, 0, 22, 5, 19, 0, 23, 92, 4, 0, 92, 26, 27, 21, 26, 45, 2, 23, 0, 20, 29, 0, 31, 19, 28, 17, 23, 117, 103, 107, 117, 115, 104, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static synchronized boolean A05(Context context) {
        boolean z;
        synchronized (DummySurface.class) {
            z = true;
            if (!A04) {
                A03 = C0436Hx.A02 < 24 ? 0 : A00(context);
                A04 = true;
            }
            if (A03 == 0) {
                z = false;
            }
        }
        return z;
    }

    public DummySurface(I3 i3, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.A02 = i3;
        this.A01 = z;
    }

    public static int A00(Context context) {
        String eglQueryString;
        if (C0436Hx.A02 < 26 && (A02(127, 7, 21).equals(C0436Hx.A05) || A02(85, 6, 120).equals(C0436Hx.A06))) {
            return 0;
        }
        if ((C0436Hx.A02 < 26 && !context.getPackageManager().hasSystemFeature(A02(91, 36, 97))) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains(A02(0, 25, 29))) {
            return 0;
        }
        if (eglQueryString.contains(A02(25, 27, 95))) {
            return 1;
        }
        return 2;
    }

    public static DummySurface A01(Context context, boolean z) {
        A03();
        HI.A04(!z || A05(context));
        return new I3().A04(z ? A03 : 0);
    }

    public static void A03() {
        if (C0436Hx.A02 >= 17) {
        } else {
            throw new UnsupportedOperationException(A02(52, 33, 104));
        }
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.A02) {
            if (!this.A00) {
                this.A02.A05();
                this.A00 = true;
            }
        }
    }
}
