package okhttp3.internal.http2;

import defpackage.at;
import defpackage.m20;
import defpackage.ng0;
import defpackage.v73;

/* loaded from: classes2.dex */
public final class Header {
    public final int hpackSize;
    public final at name;
    public final at value;
    public static final Companion Companion = new Companion(null);
    public static final at PSEUDO_PREFIX = v73.i(":");
    public static final String RESPONSE_STATUS_UTF8 = ":status";
    public static final at RESPONSE_STATUS = v73.i(RESPONSE_STATUS_UTF8);
    public static final String TARGET_METHOD_UTF8 = ":method";
    public static final at TARGET_METHOD = v73.i(TARGET_METHOD_UTF8);
    public static final String TARGET_PATH_UTF8 = ":path";
    public static final at TARGET_PATH = v73.i(TARGET_PATH_UTF8);
    public static final String TARGET_SCHEME_UTF8 = ":scheme";
    public static final at TARGET_SCHEME = v73.i(TARGET_SCHEME_UTF8);
    public static final String TARGET_AUTHORITY_UTF8 = ":authority";
    public static final at TARGET_AUTHORITY = v73.i(TARGET_AUTHORITY_UTF8);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public Header(at atVar, at atVar2) {
        this.name = atVar;
        this.value = atVar2;
        this.hpackSize = atVar2.c() + atVar.c() + 32;
    }

    public static /* synthetic */ Header copy$default(Header header, at atVar, at atVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            atVar = header.name;
        }
        if ((i & 2) != 0) {
            atVar2 = header.value;
        }
        return header.copy(atVar, atVar2);
    }

    public final at component1() {
        return this.name;
    }

    public final at component2() {
        return this.value;
    }

    public final Header copy(at atVar, at atVar2) {
        return new Header(atVar, atVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Header)) {
            return false;
        }
        Header header = (Header) obj;
        return m20.L(this.name, header.name) && m20.L(this.value, header.value);
    }

    public int hashCode() {
        return this.value.hashCode() + (this.name.hashCode() * 31);
    }

    public String toString() {
        return this.name.j() + ": " + this.value.j();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Header(defpackage.at r3, java.lang.String r4) {
        /*
            r2 = this;
            at r0 = new at
            byte[] r1 = defpackage.t9.l(r4)
            r0.<init>(r1)
            r0.c = r4
            r2.<init>(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(at, java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Header(java.lang.String r3, java.lang.String r4) {
        /*
            r2 = this;
            at r0 = new at
            byte[] r1 = defpackage.t9.l(r3)
            r0.<init>(r1)
            r0.c = r3
            at r3 = new at
            byte[] r1 = defpackage.t9.l(r4)
            r3.<init>(r1)
            r3.c = r4
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Header.<init>(java.lang.String, java.lang.String):void");
    }
}
