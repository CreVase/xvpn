package com.google.android.play.core.review;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
final class zza extends ReviewInfo {

    /* renamed from: a, reason: collision with root package name */
    public final PendingIntent f1577a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1578b;

    public zza(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.f1577a = pendingIntent;
            this.f1578b = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReviewInfo) {
            ReviewInfo reviewInfo = (ReviewInfo) obj;
            if (this.f1577a.equals(((zza) reviewInfo).f1577a) && this.f1578b == ((zza) reviewInfo).f1578b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f1577a.hashCode() ^ 1000003) * 1000003;
        if (true != this.f1578b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.f1577a.toString() + ", isNoOp=" + this.f1578b + "}";
    }
}
