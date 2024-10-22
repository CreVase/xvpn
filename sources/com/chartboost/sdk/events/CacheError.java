package com.chartboost.sdk.events;

import defpackage.ng0;

/* loaded from: classes.dex */
public final class CacheError implements CBError {
    private final Code code;
    private final Exception exception;

    /* loaded from: classes.dex */
    public enum Code {
        INTERNAL(0),
        INTERNET_UNAVAILABLE(1),
        NETWORK_FAILURE(5),
        NO_AD_FOUND(6),
        SESSION_NOT_STARTED(7),
        SERVER_ERROR(8),
        ASSET_DOWNLOAD_FAILURE(16),
        BANNER_DISABLED(36),
        BANNER_VIEW_IS_DETACHED(37);

        private final int errorCode;

        Code(int i) {
            this.errorCode = i;
        }

        public final int getErrorCode() {
            return this.errorCode;
        }
    }

    public CacheError(Code code, Exception exc) {
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
        return "Chartboost CacheError: " + this.code.name() + " with exception " + getException();
    }

    public /* synthetic */ CacheError(Code code, Exception exc, int i, ng0 ng0Var) {
        this(code, (i & 2) != 0 ? null : exc);
    }
}
