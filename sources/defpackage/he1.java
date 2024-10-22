package defpackage;

import java.io.IOException;

/* loaded from: classes2.dex */
public class he1 extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;
    private yv1 unfinishedMessage;
    private boolean wasThrownFromInputStream;

    public he1(String str) {
        super(str);
        this.unfinishedMessage = null;
    }

    public static he1 invalidEndTag() {
        return new he1("Protocol message end-group tag did not match expected tag.");
    }

    public static he1 invalidTag() {
        return new he1("Protocol message contained an invalid tag (zero).");
    }

    public static he1 invalidUtf8() {
        return new he1("Protocol message had invalid UTF-8.");
    }

    public static fe1 invalidWireType() {
        return new fe1("Protocol message tag had invalid wire type.");
    }

    public static he1 malformedVarint() {
        return new he1("CodedInputStream encountered a malformed varint.");
    }

    public static he1 negativeSize() {
        return new he1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static he1 parseFailure() {
        return new he1("Failed to parse the message.");
    }

    public static he1 recursionLimitExceeded() {
        return new he1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public static he1 sizeLimitExceeded() {
        return new he1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static he1 truncatedMessage() {
        return new he1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean getThrownFromInputStream() {
        return this.wasThrownFromInputStream;
    }

    public yv1 getUnfinishedMessage() {
        return this.unfinishedMessage;
    }

    public void setThrownFromInputStream() {
        this.wasThrownFromInputStream = true;
    }

    public he1 setUnfinishedMessage(yv1 yv1Var) {
        this.unfinishedMessage = yv1Var;
        return this;
    }

    public IOException unwrapIOException() {
        if (getCause() instanceof IOException) {
            return (IOException) getCause();
        }
        return this;
    }

    public he1(Exception exc) {
        super(exc.getMessage(), exc);
        this.unfinishedMessage = null;
    }

    public he1(String str, Exception exc) {
        super(str, exc);
        this.unfinishedMessage = null;
    }

    public he1(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.unfinishedMessage = null;
    }

    public he1(String str, IOException iOException) {
        super(str, iOException);
        this.unfinishedMessage = null;
    }
}
