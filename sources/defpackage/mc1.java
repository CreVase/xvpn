package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes.dex */
public final class mc1 implements nc1 {

    /* renamed from: a, reason: collision with root package name */
    public final InputContentInfo f3275a;

    public mc1(Object obj) {
        this.f3275a = (InputContentInfo) obj;
    }

    @Override // defpackage.nc1
    public final Uri e() {
        return this.f3275a.getContentUri();
    }

    @Override // defpackage.nc1
    public final void f() {
        this.f3275a.requestPermission();
    }

    @Override // defpackage.nc1
    public final Uri g() {
        return this.f3275a.getLinkUri();
    }

    @Override // defpackage.nc1
    public final ClipDescription getDescription() {
        return this.f3275a.getDescription();
    }

    @Override // defpackage.nc1
    public final Object h() {
        return this.f3275a;
    }

    public mc1(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f3275a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
