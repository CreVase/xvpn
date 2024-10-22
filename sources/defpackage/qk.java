package defpackage;

import java.io.File;

/* loaded from: classes2.dex */
public final class qk {

    /* renamed from: a, reason: collision with root package name */
    public final ob0 f4008a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4009b;
    public final File c;

    public qk(pk pkVar, String str, File file) {
        this.f4008a = pkVar;
        if (str != null) {
            this.f4009b = str;
            if (file != null) {
                this.c = file;
                return;
            }
            throw new NullPointerException("Null reportFile");
        }
        throw new NullPointerException("Null sessionId");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof qk)) {
            return false;
        }
        qk qkVar = (qk) obj;
        if (this.f4008a.equals(qkVar.f4008a) && this.f4009b.equals(qkVar.f4009b) && this.c.equals(qkVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4008a.hashCode() ^ 1000003) * 1000003) ^ this.f4009b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f4008a + ", sessionId=" + this.f4009b + ", reportFile=" + this.c + "}";
    }
}
