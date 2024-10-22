package okhttp3;

import defpackage.at;
import defpackage.m20;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public final class Credentials {
    public static final Credentials INSTANCE = new Credentials();

    private Credentials() {
    }

    public static final String basic(String str, String str2) {
        return basic$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ String basic$default(String str, String str2, Charset charset, int i, Object obj) {
        if ((i & 4) != 0) {
            charset = StandardCharsets.ISO_8859_1;
        }
        return basic(str, str2, charset);
    }

    public static final String basic(String str, String str2, Charset charset) {
        return m20.d1(new at((str + ':' + str2).getBytes(charset)).a(), "Basic ");
    }
}
