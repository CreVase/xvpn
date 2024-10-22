package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.util.Strings;

/* loaded from: classes2.dex */
public final class dy0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1861a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1862b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public dy0(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Preconditions.checkState(!Strings.isEmptyOrWhitespace(str), "ApplicationId must be set.");
        this.f1862b = str;
        this.f1861a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static dy0 a(Context context) {
        StringResourceValueReader stringResourceValueReader = new StringResourceValueReader(context);
        String string = stringResourceValueReader.getString("google_app_id");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new dy0(string, stringResourceValueReader.getString("google_api_key"), stringResourceValueReader.getString("firebase_database_url"), stringResourceValueReader.getString("ga_trackingId"), stringResourceValueReader.getString("gcm_defaultSenderId"), stringResourceValueReader.getString("google_storage_bucket"), stringResourceValueReader.getString("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dy0)) {
            return false;
        }
        dy0 dy0Var = (dy0) obj;
        if (!Objects.equal(this.f1862b, dy0Var.f1862b) || !Objects.equal(this.f1861a, dy0Var.f1861a) || !Objects.equal(this.c, dy0Var.c) || !Objects.equal(this.d, dy0Var.d) || !Objects.equal(this.e, dy0Var.e) || !Objects.equal(this.f, dy0Var.f) || !Objects.equal(this.g, dy0Var.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f1862b, this.f1861a, this.c, this.d, this.e, this.f, this.g);
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("applicationId", this.f1862b).add("apiKey", this.f1861a).add("databaseUrl", this.c).add("gcmSenderId", this.e).add("storageBucket", this.f).add("projectId", this.g).toString();
    }
}
