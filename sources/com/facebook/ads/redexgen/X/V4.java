package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class V4 implements InterfaceC0391Gc {
    public static byte[] A07;
    public static String[] A08 = {"CpiOlZ", "ukFexlYSIMwQqH0UvFPWGqG0YthdqpHq", "2yw2Gs2GC2jxZI0Hgcr1UjVZgWf7BNvx", "7SwPVGS0jIrCQlvIcpAA6U9bhm4jPR5r", "7pQ8HXcSNS6Xqd33VYljkiTEbCcLAkDq", "kKrkJSZnynA87WgMdnYScFfJH7qszUrQ", "lo5", "kH5jcAc5XMYXCXQVRoC"};
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;
    public final InterfaceC0411Gy<? super V4> A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-9, 10, 24, 20, 26, 23, 8, 10, -59, 14, 9, 10, 19, 25, 14, 11, 14, 10, 23, -59, 18, 26, 24, 25, -59, 7, 10, -59, 6, 19, -59, 14, 19, 25, 10, 12, 10, 23, -45, 5, 2, -7, -48, 29, 37, 35, 36, -48, 37, 35, 21, -48, 35, 19, 24, 21, 29, 21, -48, 34, 17, 39, 34, 21, 35, 31, 37, 34, 19, 21, 36, 19, 41, 36, 23, 37, 33, 39, 36, 21, 23};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Gy != com.facebook.ads.internal.exoplayer2.thirdparty.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.thirdparty.upstream.RawResourceDataSource> */
    public V4(Context context, InterfaceC0411Gy<? super V4> interfaceC0411Gy) {
        this.A05 = context.getResources();
        this.A06 = interfaceC0411Gy;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws C0410Gx {
        try {
            Uri uri = c0395Gg.A04;
            this.A02 = uri;
            if (TextUtils.equals(A00(70, 11, 107), uri.getScheme())) {
                try {
                    this.A01 = this.A05.openRawResourceFd(Integer.parseInt(this.A02.getLastPathSegment()));
                    FileInputStream fileInputStream = new FileInputStream(this.A01.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    long skip = this.A03.skip(c0395Gg.A03);
                    long skipped = c0395Gg.A03;
                    if (skip >= skipped) {
                        if (c0395Gg.A02 != -1) {
                            this.A00 = c0395Gg.A02;
                        } else {
                            long length = this.A01.getLength();
                            if (A08[7].length() != 19) {
                                throw new RuntimeException();
                            }
                            A08[0] = "nEQCtk";
                            this.A00 = length != -1 ? length - c0395Gg.A03 : -1L;
                        }
                        this.A04 = true;
                        InterfaceC0411Gy<? super V4> interfaceC0411Gy = this.A06;
                        if (interfaceC0411Gy != null) {
                            interfaceC0411Gy.ADF(this, c0395Gg);
                        }
                        return this.A00;
                    }
                    throw new EOFException();
                } catch (NumberFormatException unused) {
                    throw new C0410Gx(A00(0, 39, 94));
                }
            }
            throw new C0410Gx(A00(39, 31, 105));
        } catch (IOException e) {
            throw new C0410Gx(e);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws C0410Gx {
        this.A02 = null;
        try {
            try {
                InputStream inputStream = this.A03;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.A03 = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.A01;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C0410Gx(e);
                    }
                } finally {
                    this.A01 = null;
                    if (this.A04) {
                        this.A04 = false;
                        InterfaceC0411Gy<? super V4> interfaceC0411Gy = this.A06;
                        if (interfaceC0411Gy != null) {
                            interfaceC0411Gy.ADE(this);
                        }
                    }
                }
            } catch (IOException e2) {
                throw new C0410Gx(e2);
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
                        InterfaceC0411Gy<? super V4> interfaceC0411Gy2 = this.A06;
                        if (interfaceC0411Gy2 != null) {
                            interfaceC0411Gy2.ADE(this);
                        }
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new C0410Gx(e3);
                }
            } finally {
                this.A01 = null;
                if (this.A04) {
                    this.A04 = false;
                    InterfaceC0411Gy<? super V4> interfaceC0411Gy3 = this.A06;
                    if (interfaceC0411Gy3 != null) {
                        interfaceC0411Gy3.ADE(this);
                    }
                }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final int read(byte[] bArr, int i, int i2) throws C0410Gx {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (A08[3].charAt(24) == 'w') {
            throw new RuntimeException();
        }
        A08[0] = "oumASG";
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C0410Gx(e);
            }
        }
        int read = this.A03.read(bArr, i, i2);
        if (read == -1) {
            if (this.A00 == -1) {
                return -1;
            }
            throw new C0410Gx(new EOFException());
        }
        long j2 = this.A00;
        if (j2 != -1) {
            this.A00 = j2 - read;
        }
        InterfaceC0411Gy<? super V4> interfaceC0411Gy = this.A06;
        if (interfaceC0411Gy != null) {
            interfaceC0411Gy.AAm(this, read);
        }
        return read;
    }
}
