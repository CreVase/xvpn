package com.facebook.ads.redexgen.X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VL implements InterfaceC0391Gc {
    public static byte[] A07;
    public static String[] A08 = {"LByWpbEPJA", "7zBd1gTQe", "KuygTrv8nulqhNSWOngA1uKtSEuZHgRN", "Njgdt1gsnhQwK4o", "BeNPg2roj36bAWsP0", "RQRmVWofVgKwOSOG8v2k1lAFTXU782LE", "P3wGsXlJvJ2cmEHDxz1oaqJg", "cQN91p4HTGgxD32"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public FileInputStream A03;
    public boolean A04;
    public final ContentResolver A05;
    public final InterfaceC0411Gy<? super VL> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{77, 97, 123, 98, 106, 46, 96, 97, 122, 46, 97, 126, 107, 96, 46, 104, 103, 98, 107, 46, 106, 107, 125, 109, 124, 103, 126, 122, 97, 124, 46, 104, 97, 124, 52, 46, 88};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws GY {
        try {
            Uri uri = c0395Gg.A04;
            this.A02 = uri;
            AssetFileDescriptor openAssetFileDescriptor = this.A05.openAssetFileDescriptor(uri, A00(36, 1, 66));
            this.A01 = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException(A00(0, 36, 102) + this.A02);
            }
            this.A03 = new FileInputStream(this.A01.getFileDescriptor());
            long startOffset = this.A01.getStartOffset();
            long skip = this.A03.skip(c0395Gg.A03 + startOffset) - startOffset;
            if (skip != c0395Gg.A03) {
                throw new EOFException();
            }
            if (c0395Gg.A02 != -1) {
                this.A00 = c0395Gg.A02;
            } else {
                long length = this.A01.getLength();
                if (length == -1) {
                    FileChannel channel = this.A03.getChannel();
                    long size = channel.size();
                    this.A00 = size != 0 ? size - channel.position() : -1L;
                } else {
                    this.A00 = length - skip;
                }
            }
            this.A04 = true;
            InterfaceC0411Gy<? super VL> interfaceC0411Gy = this.A06;
            if (interfaceC0411Gy != null) {
                interfaceC0411Gy.ADF(this, c0395Gg);
            }
            return this.A00;
        } catch (IOException e) {
            throw new GY(e);
        }
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.ContentDataSource> */
    public VL(Context context, InterfaceC0411Gy<? super VL> interfaceC0411Gy) {
        this.A05 = context.getContentResolver();
        this.A06 = interfaceC0411Gy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws GY {
        this.A02 = null;
        try {
            try {
                FileInputStream fileInputStream = this.A03;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new GY(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0411Gy<? super VL> interfaceC0411Gy = this.A06;
                        if (interfaceC0411Gy != null) {
                            interfaceC0411Gy.ADE(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new GY(e2);
            }
        } catch (Throwable th) {
            this.A03 = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.A01;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0411Gy<? super VL> interfaceC0411Gy2 = this.A06;
                        if (interfaceC0411Gy2 != null) {
                            interfaceC0411Gy2.ADE(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new GY(e3);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    InterfaceC0411Gy<? super VL> interfaceC0411Gy3 = this.A06;
                    if (interfaceC0411Gy3 != null) {
                        interfaceC0411Gy3.ADE(this);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:            if (r4 != (-1)) goto L28;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:            r8.A00 = r4 - r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:            r4 = r8.A06;     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:            if (com.facebook.ads.redexgen.X.VL.A08[4].length() == 17) goto L35;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0080, code lost:            com.facebook.ads.redexgen.X.VL.A08[0] = "Oz3XLfSc2A979xkKdF0NMgeVRm8";     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:            if (r4 == null) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:            r4.AAm(r8, r3);     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:            return r3;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:            r2 = com.facebook.ads.redexgen.X.VL.A08;        r2[1] = "uqZ1tM2xm";        r2[6] = "4bkl7P4p23vj4jNsoeIfag2n";     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0099, code lost:            if (r4 == null) goto L34;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009e, code lost:            if (r4 != (-1)) goto L28;     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int read(byte[] r9, int r10, int r11) throws com.facebook.ads.redexgen.X.GY {
        /*
            r8 = this;
            if (r11 != 0) goto L4
            r0 = 0
            return r0
        L4:
            long r0 = r8.A00
            r3 = 0
            r5 = -1
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 != 0) goto Le
            return r5
        Le:
            r6 = -1
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L15
            goto L1b
        L15:
            long r2 = (long) r11
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.io.IOException -> La1
            int r11 = (int) r0     // Catch: java.io.IOException -> La1
        L1b:
            java.io.FileInputStream r0 = r8.A03     // Catch: java.io.IOException -> La1
            int r3 = r0.read(r9, r10, r11)     // Catch: java.io.IOException -> La1
            if (r3 != r5) goto L54
            long r3 = r8.A00
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VL.A08
            r0 = 3
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L3d
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VL.A08
            java.lang.String r1 = "iixlGiSV2y9Sj4FhSzJ8n8KndyylS"
            r0 = 0
            r2[r0] = r1
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L49
            return r5
        L49:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            com.facebook.ads.redexgen.X.GY r0 = new com.facebook.ads.redexgen.X.GY
            r0.<init>(r1)
            throw r0
        L54:
            long r4 = r8.A00
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VL.A08
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 5
            if (r1 == r0) goto L9c
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VL.A08
            java.lang.String r1 = "YPxf1aEs9O2Lc7g4LGclNCu"
            r0 = 0
            r2[r0] = r1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L71
        L6d:
            long r0 = (long) r3
            long r4 = r4 - r0
            r8.A00 = r4
        L71:
            com.facebook.ads.redexgen.X.Gy<? super com.facebook.ads.redexgen.X.VL> r4 = r8.A06
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.VL.A08
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 17
            if (r1 == r0) goto L8d
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VL.A08
            java.lang.String r1 = "Oz3XLfSc2A979xkKdF0NMgeVRm8"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L8c
        L89:
            r4.AAm(r8, r3)
        L8c:
            return r3
        L8d:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.VL.A08
            java.lang.String r1 = "uqZ1tM2xm"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "4bkl7P4p23vj4jNsoeIfag2n"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L8c
            goto L89
        L9c:
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L71
            goto L6d
        La1:
            r1 = move-exception
            com.facebook.ads.redexgen.X.GY r0 = new com.facebook.ads.redexgen.X.GY
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.VL.read(byte[], int, int):int");
    }
}
