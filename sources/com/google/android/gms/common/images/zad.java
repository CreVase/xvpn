package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;

/* loaded from: classes.dex */
final class zad {
    public final Uri zaa;

    public zad(Uri uri) {
        this.zaa = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zad)) {
            return false;
        }
        return Objects.equal(((zad) obj).zaa, this.zaa);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa);
    }
}
