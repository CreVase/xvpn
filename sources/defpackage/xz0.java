package defpackage;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class xz0 implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5251a;

    public /* synthetic */ xz0(int i) {
        this.f5251a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5251a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b2 = bArr[i];
                    byte b3 = bArr2[i];
                    if (b2 != b3) {
                        return b2 - b3;
                    }
                }
                return 0;
            case 1:
            default:
                return ((ef) obj).f1926a.compareToIgnoreCase(((ef) obj2).f1926a);
            case 2:
                int i2 = nm0.m;
                long j = ((jm0) obj).c;
                long j2 = ((jm0) obj2).c;
                int i3 = wi3.f5017a;
                if (j < j2) {
                    return -1;
                }
                if (j != j2) {
                    return 1;
                }
                return 0;
            case 3:
                int i4 = nm0.m;
                long j3 = ((jm0) obj).c;
                long j4 = ((jm0) obj2).c;
                int i5 = wi3.f5017a;
                if (j3 < j4) {
                    return -1;
                }
                if (j3 != j4) {
                    return 1;
                }
                return 0;
            case 4:
                int i6 = nm0.m;
                long j5 = ((jm0) obj).c;
                long j6 = ((jm0) obj2).c;
                int i7 = wi3.f5017a;
                if (j5 < j6) {
                    return -1;
                }
                if (j5 != j6) {
                    return 1;
                }
                return 0;
            case 5:
                return Integer.compare(((mv) obj2).f3359b, ((mv) obj).f3359b);
            case 6:
                return Integer.compare(((dp3) obj).f1815a.f1972b, ((dp3) obj2).f1815a.f1972b);
            case 7:
                return Long.compare(((bp3) obj).f508b, ((bp3) obj2).f508b);
            case 8:
                return ((y01) obj2).h - ((y01) obj).h;
            case 9:
                return ((jj0) ((List) obj).get(0)).compareTo((jj0) ((List) obj2).get(0));
            case 10:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                t32 t32Var = nj0.i;
                if (num.intValue() == -1) {
                    if (num2.intValue() == -1) {
                        return 0;
                    }
                    return -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 11:
                t32 t32Var2 = nj0.i;
                return 0;
            case 12:
                List list = (List) obj;
                List list2 = (List) obj2;
                return u20.f(new xz0(16).compare((mj0) Collections.max(list, new xz0(14)), (mj0) Collections.max(list2, new xz0(15)))).a(list.size(), list2.size()).b((mj0) Collections.max(list, new xz0(17)), (mj0) Collections.max(list2, new xz0(18)), new xz0(19)).e();
            case 13:
                return ((dj0) Collections.max((List) obj)).compareTo((dj0) Collections.max((List) obj2));
            case 14:
                return mj0.c((mj0) obj, (mj0) obj2);
            case 15:
                return mj0.c((mj0) obj, (mj0) obj2);
            case 16:
                return mj0.c((mj0) obj, (mj0) obj2);
            case 17:
                return mj0.d((mj0) obj, (mj0) obj2);
            case 18:
                return mj0.d((mj0) obj, (mj0) obj2);
            case 19:
                return mj0.d((mj0) obj, (mj0) obj2);
            case 20:
                return ((fw2) obj).f2166a - ((fw2) obj2).f2166a;
            case 21:
                return Float.compare(((fw2) obj).c, ((fw2) obj2).c);
            case 22:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 23:
                return ((tk) ((va0) obj)).f4519a.compareTo(((tk) ((va0) obj2)).f4519a);
            case 24:
                Charset charset = tb0.e;
                String name = ((File) obj).getName();
                int i8 = tb0.f;
                return name.substring(0, i8).compareTo(((File) obj2).getName().substring(0, i8));
            case 25:
                Charset charset2 = tb0.e;
                return ((File) obj2).getName().compareTo(((File) obj).getName());
        }
    }
}
