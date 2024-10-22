package com.google.android.play.core.install;

/* loaded from: classes2.dex */
public final class zza {

    /* renamed from: a, reason: collision with root package name */
    public final int f1572a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1573b;
    public final long c;
    public final int d;
    public final String e;

    public zza(int i, long j, long j2, int i2, String str) {
        this.f1572a = i;
        this.f1573b = j;
        this.c = j2;
        this.d = i2;
        if (str != null) {
            this.e = str;
            return;
        }
        throw new NullPointerException("Null packageName");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zza) {
            zza zzaVar = (zza) obj;
            if (this.f1572a == zzaVar.f1572a && this.f1573b == zzaVar.f1573b && this.c == zzaVar.c && this.d == zzaVar.d && this.e.equals(zzaVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f1572a ^ 1000003;
        long j = this.f1573b;
        long j2 = this.c;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "InstallState{installStatus=" + this.f1572a + ", bytesDownloaded=" + this.f1573b + ", totalBytesToDownload=" + this.c + ", installErrorCode=" + this.d + ", packageName=" + this.e + "}";
    }
}
