package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public class ie1 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2577a = 0;

    public static ie1 a() {
        return new ie1("Protocol message had invalid UTF-8.");
    }

    public static ge1 b() {
        return new ge1();
    }

    public static ie1 c() {
        return new ie1("CodedInputStream encountered a malformed varint.");
    }

    public static ie1 d() {
        return new ie1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static ie1 e() {
        return new ie1("Failed to parse the message.");
    }

    public static ie1 f() {
        return new ie1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
