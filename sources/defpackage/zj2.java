package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class zj2 extends mo1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5492a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zj2(int i, int i2) {
        super(i);
        this.f5492a = i2;
    }

    @Override // defpackage.mo1
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f5492a) {
            case 1:
                return ((Bitmap) obj2).getByteCount();
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
