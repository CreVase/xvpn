package com.facebook.ads.redexgen.X;

import android.net.Uri;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Vq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0787Vq extends DownloadAction.Deserializer {
    public C0787Vq(String str, int i) {
        super(str, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction.Deserializer
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C0786Vp A01(int i, DataInputStream dataInputStream) throws IOException {
        Uri parse = Uri.parse(dataInputStream.readUTF());
        boolean readBoolean = dataInputStream.readBoolean();
        byte[] bArr = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(bArr);
        return new C0786Vp(parse, readBoolean, bArr, dataInputStream.readBoolean() ? dataInputStream.readUTF() : null);
    }
}
