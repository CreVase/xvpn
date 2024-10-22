package com.chartboost.sdk.events;

import defpackage.ng0;

/* loaded from: classes.dex */
public final class StartError implements CBError {
    private final Code code;
    private final Exception exception;

    /* loaded from: classes.dex */
    public enum Code {
        INVALID_CREDENTIALS(0),
        NETWORK_FAILURE(1),
        SERVER_ERROR(2),
        INTERNAL(3);

        private final int errorCode;

        Code(int i) {
            this.errorCode = i;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public StartError(Code code, Exception exc) {
        this.code = code;
        this.exception = exc;
    }

    public final Code getCode() {
        return this.code;
    }

    @Override // com.chartboost.sdk.events.CBError
    public Exception getException() {
        return this.exception;
    }

    public String toString() {
        return "Chartboost StartError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ StartError(Code code, Exception exc, int i, ng0 ng0Var) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
