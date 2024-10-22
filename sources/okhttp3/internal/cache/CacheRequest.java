package okhttp3.internal.cache;

import defpackage.dw2;
import java.io.IOException;

/* loaded from: classes2.dex */
public interface CacheRequest {
    void abort();

    dw2 body() throws IOException;
}
