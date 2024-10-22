package defpackage;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* loaded from: classes.dex */
public final class d80 implements e80 {

    /* renamed from: a, reason: collision with root package name */
    public final ContentInfo.Builder f1745a;

    public d80(ClipData clipData, int i) {
        this.f1745a = vq.m(clipData, i);
    }

    @Override // defpackage.e80
    public final void b(Uri uri) {
        this.f1745a.setLinkUri(uri);
    }

    @Override // defpackage.e80
    public final h80 build() {
        ContentInfo build;
        build = this.f1745a.build();
        return new h80(new ja1(build));
    }

    @Override // defpackage.e80
    public final void c(int i) {
        this.f1745a.setFlags(i);
    }

    @Override // defpackage.e80
    public final void setExtras(Bundle bundle) {
        this.f1745a.setExtras(bundle);
    }
}
