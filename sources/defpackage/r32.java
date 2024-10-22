package defpackage;

import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class r32 extends o0 implements RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    public final at[] f4095a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f4096b;

    public r32(at[] atVarArr, int[] iArr) {
        this.f4095a = atVarArr;
        this.f4096b = iArr;
    }

    @Override // defpackage.t
    public final int c() {
        return this.f4095a.length;
    }

    @Override // defpackage.t, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof at)) {
            return false;
        }
        return super.contains((at) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f4095a[i];
    }

    @Override // defpackage.o0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof at)) {
            return -1;
        }
        return super.indexOf((at) obj);
    }

    @Override // defpackage.o0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof at)) {
            return -1;
        }
        return super.lastIndexOf((at) obj);
    }
}
