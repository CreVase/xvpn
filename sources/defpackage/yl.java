package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
public final class yl {

    /* renamed from: a, reason: collision with root package name */
    public final long f5355a;

    public yl(long j) {
        this.f5355a = j;
    }

    public static yl a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new yl(Long.parseLong(jsonReader.nextString()));
                    }
                    return new yl(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof yl)) {
            return false;
        }
        if (this.f5355a == ((yl) obj).f5355a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5355a;
        return 1000003 ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f5355a + "}";
    }
}
