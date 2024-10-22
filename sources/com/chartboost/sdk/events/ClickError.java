package com.chartboost.sdk.events;

import defpackage.ng0;

/* loaded from: classes.dex */
public final class ClickError implements CBError {
    private final Code code;
    private final Exception exception;

    /* loaded from: classes.dex */
    public enum Code {
        INTERNAL(0),
        URI_INVALID(1),
        URI_UNRECOGNIZED(2);

        private final int errorCode;

        Code(int i) {
            this.errorCode = i;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public ClickError(Code code, Exception exc) {
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
        return "Chartboost ClickError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ ClickError(Code code, Exception exc, int i, ng0 ng0Var) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
