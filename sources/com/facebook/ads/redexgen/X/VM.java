package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VM implements InterfaceC0391Gc {
    public static byte[] A06;
    public static String[] A07 = {"LZDHzUEPY8huLib8qPH1v7czaaxlCYVW", "Hfajs1uaSYD8XiY9EEWii1aSJKbCXH1k", "56ilEDtV1sbTjQDLh", "Yd2dmsZ5", "tr3yrs0rtPd5aa0L", "Zl3VJckSqinxve9JbD33GDfHo4YeuNba", "", ""};
    public long A00;
    public Uri A01;
    public InputStream A02;
    public boolean A03;
    public final AssetManager A04;
    public final InterfaceC0411Gy<? super VM> A05;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            A07[3] = "kcdTjQCUlglhSnU2yukjc";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
            i4++;
        }
    }

    public static void A01() {
        A06 = new byte[]{100, 107, -99, -86, -96, -82, -85, -91, -96, -101, -99, -81, -81, -95, -80, 107};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws GV {
        try {
            Uri uri = c0395Gg.A04;
            this.A01 = uri;
            String path = uri.getPath();
            if (path.startsWith(A00(1, 15, 19))) {
                path = path.substring(15);
            } else if (path.startsWith(A00(0, 1, 12))) {
                path = path.substring(1);
            }
            InputStream open = this.A04.open(path, 1);
            this.A02 = open;
            if (open.skip(c0395Gg.A03) < c0395Gg.A03) {
                throw new EOFException();
            }
            if (c0395Gg.A02 != -1) {
                this.A00 = c0395Gg.A02;
            } else {
                long available = this.A02.available();
                this.A00 = available;
                if (available == 2147483647L) {
                    this.A00 = -1L;
                }
            }
            this.A03 = true;
            InterfaceC0411Gy<? super VM> interfaceC0411Gy = this.A05;
            if (interfaceC0411Gy != null) {
                interfaceC0411Gy.ADF(this, c0395Gg);
            }
            return this.A00;
        } catch (IOException e) {
            throw new GV(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.AssetDataSource> */
    public VM(Context context, InterfaceC0411Gy<? super VM> interfaceC0411Gy) {
        this.A04 = context.getAssets();
        this.A05 = interfaceC0411Gy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws GV {
        this.A01 = null;
        try {
            try {
                InputStream inputStream = this.A02;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new GV(e);
            }
        } finally {
            this.A02 = null;
            if (this.A03) {
                this.A03 = false;
                InterfaceC0411Gy<? super VM> interfaceC0411Gy = this.A05;
                if (interfaceC0411Gy != null) {
                    interfaceC0411Gy.ADE(this);
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final int read(byte[] bArr, int i, int i2) throws GV {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new GV(e);
            }
        }
        int read = this.A02.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new GV(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            long j3 = read;
            if (A07[3].length() == 13) {
                throw new RuntimeException();
            }
            A07[4] = "Doxe12teItAf98KBLMhQOs4gzgBHzz";
            this.A00 = j2 - j3;
        }
        InterfaceC0411Gy<? super VM> interfaceC0411Gy = this.A05;
        if (interfaceC0411Gy != null) {
            interfaceC0411Gy.AAm(this, read);
        }
        return read;
    }
}
