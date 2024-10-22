package okhttp3;

import defpackage.x31;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;

/* loaded from: classes2.dex */
public interface Interceptor {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes2.dex */
    public interface Chain {
        Call call();

        int connectTimeoutMillis();

        Connection connection();

        Response proceed(Request request) throws IOException;

        int readTimeoutMillis();

        Request request();

        Chain withConnectTimeout(int i, TimeUnit timeUnit);

        Chain withReadTimeout(int i, TimeUnit timeUnit);

        Chain withWriteTimeout(int i, TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Interceptor invoke(final x31 x31Var) {
            return new Interceptor() { // from class: okhttp3.Interceptor$Companion$invoke$1
                @Override // okhttp3.Interceptor
                public final Response intercept(Interceptor.Chain chain) {
                    return (Response) x31.this.invoke(chain);
                }
            };
        }
    }

    Response intercept(Chain chain) throws IOException;
}
