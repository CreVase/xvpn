package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;

/* renamed from: com.facebook.ads.redexgen.X.Qw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC0664Qw {
    boolean ABK(C0662Qu c0662Qu);

    HttpURLConnection ADe(String str, Proxy proxy) throws IOException;

    InputStream ADf(HttpURLConnection httpURLConnection) throws IOException;

    OutputStream ADg(HttpURLConnection httpURLConnection) throws IOException;

    void ADw(HttpURLConnection httpURLConnection, EnumC0660Qs enumC0660Qs, String str) throws IOException;

    byte[] AEG(InputStream inputStream) throws IOException;

    void AGV(OutputStream outputStream, byte[] bArr) throws IOException;
}
