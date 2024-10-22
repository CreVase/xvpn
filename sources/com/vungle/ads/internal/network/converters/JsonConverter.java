package com.vungle.ads.internal.network.converters;

import defpackage.ng0;
import defpackage.pd0;
import defpackage.qf1;
import defpackage.t9;
import defpackage.tf3;
import defpackage.vh1;
import java.io.IOException;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class JsonConverter<E> implements Converter<ResponseBody, E> {
    public static final Companion Companion = new Companion(null);
    private static final qf1 json = t9.d(JsonConverter$Companion$json$1.INSTANCE);
    private final vh1 kType;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public JsonConverter(vh1 vh1Var) {
        this.kType = vh1Var;
    }

    @Override // com.vungle.ads.internal.network.converters.Converter
    public E convert(ResponseBody responseBody) throws IOException {
        if (responseBody != null) {
            try {
                String string = responseBody.string();
                if (string != null) {
                    E e = (E) json.a(pd0.K(qf1.d.f3990b, this.kType), string);
                    tf3.y(responseBody, null);
                    return e;
                }
            } finally {
            }
        }
        tf3.y(responseBody, null);
        return null;
    }
}
