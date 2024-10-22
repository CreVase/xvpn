package com.vungle.ads.internal.model;

import defpackage.m20;
import defpackage.p71;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class AdAsset {
    private final String adIdentifier;
    private long fileSize;
    public FileType fileType;
    private final String identifier;
    private final String localPath;
    private String parentId;
    private int retryCount;
    private ErrorType retryTypeError;
    private final String serverPath;
    private Status status;

    /* loaded from: classes2.dex */
    public enum ErrorType {
        NO_ERROR,
        CAN_RETRY_ERROR,
        CANNOT_RETRY_ERROR
    }

    /* loaded from: classes2.dex */
    public enum FileType {
        ZIP,
        ZIP_ASSET,
        ASSET
    }

    /* loaded from: classes2.dex */
    public enum Status {
        NEW,
        DOWNLOAD_RUNNING,
        DOWNLOAD_FAILED,
        DOWNLOAD_SUCCESS,
        PROCESSED
    }

    public AdAsset(String str, String str2, String str3, String str4) {
        this.identifier = str4;
        this.status = Status.NEW;
        this.adIdentifier = str;
        this.serverPath = str2;
        this.localPath = str3;
        this.fileSize = -1L;
        this.retryCount = 0;
        this.retryTypeError = ErrorType.NO_ERROR;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !m20.L(AdAsset.class, obj.getClass())) {
            return false;
        }
        AdAsset adAsset = (AdAsset) obj;
        if (this.status != adAsset.status || getFileType() != adAsset.getFileType() || this.fileSize != adAsset.fileSize || this.retryCount != adAsset.retryCount || this.retryTypeError != adAsset.retryTypeError) {
            return false;
        }
        String str = this.identifier;
        if (str == null ? adAsset.identifier != null : !m20.L(str, adAsset.identifier)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        String str2 = this.adIdentifier;
        if (str2 == null ? adAsset.adIdentifier != null : !m20.L(str2, adAsset.adIdentifier)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return false;
        }
        String str3 = this.parentId;
        if (str3 == null ? adAsset.parentId != null : !m20.L(str3, adAsset.parentId)) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            return false;
        }
        String str4 = this.serverPath;
        if (str4 == null ? adAsset.serverPath != null : !m20.L(str4, adAsset.serverPath)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            return false;
        }
        String str5 = this.localPath;
        String str6 = adAsset.localPath;
        if (str5 != null) {
            return m20.L(str5, str6);
        }
        if (str6 == null) {
            return true;
        }
        return false;
    }

    public final String getAdIdentifier() {
        return this.adIdentifier;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final FileType getFileType() {
        FileType fileType = this.fileType;
        if (fileType != null) {
            return fileType;
        }
        return null;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getLocalPath() {
        return this.localPath;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final int getRetryCount() {
        return this.retryCount;
    }

    public final ErrorType getRetryTypeError() {
        return this.retryTypeError;
    }

    public final String getServerPath() {
        return this.serverPath;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        String str = this.identifier;
        int i5 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        String str2 = this.adIdentifier;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (i6 + i2) * 31;
        String str3 = this.parentId;
        if (str3 != null && str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        String str4 = this.serverPath;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        String str5 = this.localPath;
        if (str5 != null) {
            i5 = str5.hashCode();
        }
        int hashCode = (getFileType().hashCode() + ((this.status.hashCode() + ((i9 + i5) * 31)) * 31)) * 31;
        long j = this.fileSize;
        return this.retryTypeError.hashCode() + ((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.retryCount) * 31);
    }

    public final void setFileSize(long j) {
        this.fileSize = j;
    }

    public final void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    public final void setParentId(String str) {
        this.parentId = str;
    }

    public final void setRetryCount(int i) {
        this.retryCount = i;
    }

    public final void setRetryTypeError(ErrorType errorType) {
        this.retryTypeError = errorType;
    }

    public final void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        String str = this.identifier;
        String str2 = this.adIdentifier;
        String str3 = this.serverPath;
        String str4 = this.localPath;
        Status status = this.status;
        FileType fileType = getFileType();
        long j = this.fileSize;
        int i = this.retryCount;
        ErrorType errorType = this.retryTypeError;
        StringBuilder q = p71.q("AdAsset{identifier='", str, "', adIdentifier='", str2, "', serverPath='");
        p71.A(q, str3, "', localPath='", str4, "', status=");
        q.append(status);
        q.append(", fileType=");
        q.append(fileType);
        q.append(", fileSize=");
        q.append(j);
        q.append(", retryCount=");
        q.append(i);
        q.append(", retryTypeError=");
        q.append(errorType);
        q.append("}");
        return q.toString();
    }

    public AdAsset(String str, String str2, String str3) {
        this(str, str2, str3, UUID.randomUUID().toString());
    }
}
