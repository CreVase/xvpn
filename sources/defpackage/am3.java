package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public class am3 implements Iterator, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f112a;

    /* renamed from: b, reason: collision with root package name */
    public int f113b;
    public final Object c;

    public /* synthetic */ am3(Object obj, int i) {
        this.f112a = i;
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f112a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.f113b >= ((ViewGroup) obj).getChildCount()) {
                    return false;
                }
                return true;
            case 1:
                if (this.f113b >= ((byte[]) obj).length) {
                    return false;
                }
                return true;
            case 2:
                if (this.f113b >= ((int[]) obj).length) {
                    return false;
                }
                return true;
            case 3:
                if (this.f113b >= ((long[]) obj).length) {
                    return false;
                }
                return true;
            case 4:
                if (this.f113b >= ((short[]) obj).length) {
                    return false;
                }
                return true;
            case 5:
                if (this.f113b >= ((o0) obj).c()) {
                    return false;
                }
                return true;
            default:
                if (this.f113b >= ((Object[]) obj).length) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f112a;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = this.f113b;
                this.f113b = i2 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i3 = this.f113b;
                byte[] bArr = (byte[]) obj;
                if (i3 < bArr.length) {
                    this.f113b = i3 + 1;
                    return new uf3(bArr[i3]);
                }
                throw new NoSuchElementException(String.valueOf(this.f113b));
            case 2:
                int i4 = this.f113b;
                int[] iArr = (int[]) obj;
                if (i4 < iArr.length) {
                    this.f113b = i4 + 1;
                    return new eg3(iArr[i4]);
                }
                throw new NoSuchElementException(String.valueOf(this.f113b));
            case 3:
                int i5 = this.f113b;
                long[] jArr = (long[]) obj;
                if (i5 < jArr.length) {
                    this.f113b = i5 + 1;
                    return new jg3(jArr[i5]);
                }
                throw new NoSuchElementException(String.valueOf(this.f113b));
            case 4:
                int i6 = this.f113b;
                short[] sArr = (short[]) obj;
                if (i6 < sArr.length) {
                    this.f113b = i6 + 1;
                    return new og3(sArr[i6]);
                }
                throw new NoSuchElementException(String.valueOf(this.f113b));
            case 5:
                if (hasNext()) {
                    int i7 = this.f113b;
                    this.f113b = i7 + 1;
                    return ((o0) obj).get(i7);
                }
                throw new NoSuchElementException();
            default:
                try {
                    int i8 = this.f113b;
                    this.f113b = i8 + 1;
                    return ((Object[]) obj)[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f113b--;
                    throw new NoSuchElementException(e.getMessage());
                }
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f112a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.f113b - 1;
                this.f113b = i;
                viewGroup.removeViewAt(i);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public am3(Object[] objArr) {
        this.f112a = 6;
        this.c = objArr;
    }

    public am3(byte[] bArr) {
        this.f112a = 1;
        this.c = bArr;
    }

    public am3(int[] iArr) {
        this.f112a = 2;
        this.c = iArr;
    }

    public am3(long[] jArr) {
        this.f112a = 3;
        this.c = jArr;
    }

    public am3(short[] sArr) {
        this.f112a = 4;
        this.c = sArr;
    }
}
