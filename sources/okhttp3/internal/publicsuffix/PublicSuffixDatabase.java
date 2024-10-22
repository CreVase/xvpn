package okhttp3.internal.publicsuffix;

import defpackage.cr0;
import defpackage.d20;
import defpackage.d93;
import defpackage.e22;
import defpackage.fp2;
import defpackage.ho0;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import defpackage.t9;
import defpackage.tf3;
import defpackage.w61;
import defpackage.wg;
import defpackage.xg2;
import defpackage.yl3;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class PublicSuffixDatabase {
    private static final char EXCEPTION_MARKER = '!';
    public static final String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    public static final Companion Companion = new Companion(null);
    private static final byte[] WILDCARD_LABEL = {42};
    private static final List<String> PREVAILING_RULE = Collections.singletonList("*");
    private static final PublicSuffixDatabase instance = new PublicSuffixDatabase();
    private final AtomicBoolean listRead = new AtomicBoolean(false);
    private final CountDownLatch readCompleteLatch = new CountDownLatch(1);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String binarySearch(byte[] bArr, byte[][] bArr2, int i) {
            int i2;
            boolean z;
            int and;
            int and2;
            int length = bArr.length;
            int i3 = 0;
            while (i3 < length) {
                int i4 = (i3 + length) / 2;
                while (i4 > -1 && bArr[i4] != 10) {
                    i4--;
                }
                int i5 = i4 + 1;
                int i6 = 1;
                while (true) {
                    i2 = i5 + i6;
                    if (bArr[i2] == 10) {
                        break;
                    }
                    i6++;
                }
                int i7 = i2 - i5;
                int i8 = i;
                boolean z2 = false;
                int i9 = 0;
                int i10 = 0;
                while (true) {
                    if (z2) {
                        and = 46;
                        z = false;
                    } else {
                        z = z2;
                        and = Util.and(bArr2[i8][i9], 255);
                    }
                    and2 = and - Util.and(bArr[i5 + i10], 255);
                    if (and2 != 0) {
                        break;
                    }
                    i10++;
                    i9++;
                    if (i10 == i7) {
                        break;
                    }
                    if (bArr2[i8].length == i9) {
                        if (i8 == bArr2.length - 1) {
                            break;
                        }
                        i8++;
                        z2 = true;
                        i9 = -1;
                    } else {
                        z2 = z;
                    }
                }
                if (and2 >= 0) {
                    if (and2 <= 0) {
                        int i11 = i7 - i10;
                        int length2 = bArr2[i8].length - i9;
                        int length3 = bArr2.length;
                        for (int i12 = i8 + 1; i12 < length3; i12++) {
                            length2 += bArr2[i12].length;
                        }
                        if (length2 >= i11) {
                            if (length2 <= i11) {
                                return new String(bArr, i5, i7, StandardCharsets.UTF_8);
                            }
                        }
                    }
                    i3 = i2 + 1;
                }
                length = i5 - 1;
            }
            return null;
        }

        public final PublicSuffixDatabase get() {
            return PublicSuffixDatabase.instance;
        }
    }

    private final List<String> findMatchingRule(List<String> list) {
        boolean z;
        List<String> list2;
        String str;
        String str2;
        String str3;
        List<String> n1;
        if (!this.listRead.get() && this.listRead.compareAndSet(false, true)) {
            readTheListUninterruptibly();
        } else {
            try {
                this.readCompleteLatch.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        if (this.publicSuffixListBytes != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int size = list.size();
            byte[][] bArr = new byte[size];
            for (int i = 0; i < size; i++) {
                bArr[i] = list.get(i).getBytes(StandardCharsets.UTF_8);
            }
            int i2 = 0;
            while (true) {
                list2 = null;
                if (i2 < size) {
                    int i3 = i2 + 1;
                    Companion companion = Companion;
                    byte[] bArr2 = this.publicSuffixListBytes;
                    if (bArr2 == null) {
                        bArr2 = null;
                    }
                    str = companion.binarySearch(bArr2, bArr, i2);
                    if (str != null) {
                        break;
                    }
                    i2 = i3;
                } else {
                    str = null;
                    break;
                }
            }
            if (size > 1) {
                byte[][] bArr3 = (byte[][]) bArr.clone();
                int length = bArr3.length - 1;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4 + 1;
                    bArr3[i4] = WILDCARD_LABEL;
                    Companion companion2 = Companion;
                    byte[] bArr4 = this.publicSuffixListBytes;
                    if (bArr4 == null) {
                        bArr4 = null;
                    }
                    str2 = companion2.binarySearch(bArr4, bArr3, i4);
                    if (str2 != null) {
                        break;
                    }
                    i4 = i5;
                }
            }
            str2 = null;
            if (str2 != null) {
                int i6 = size - 1;
                int i7 = 0;
                while (i7 < i6) {
                    int i8 = i7 + 1;
                    Companion companion3 = Companion;
                    byte[] bArr5 = this.publicSuffixExceptionListBytes;
                    if (bArr5 == null) {
                        bArr5 = null;
                    }
                    str3 = companion3.binarySearch(bArr5, bArr, i7);
                    if (str3 != null) {
                        break;
                    }
                    i7 = i8;
                }
            }
            str3 = null;
            if (str3 != null) {
                return i23.n1(m20.d1(str3, "!"), new char[]{'.'});
            }
            if (str == null && str2 == null) {
                return PREVAILING_RULE;
            }
            if (str == null) {
                n1 = null;
            } else {
                n1 = i23.n1(str, new char[]{'.'});
            }
            List<String> list3 = cr0.f1659a;
            if (n1 == null) {
                n1 = list3;
            }
            if (str2 != null) {
                list2 = i23.n1(str2, new char[]{'.'});
            }
            if (list2 != null) {
                list3 = list2;
            }
            if (n1.size() <= list3.size()) {
                return list3;
            }
            return n1;
        }
        throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.".toString());
    }

    private final void readTheList() throws IOException {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream(PUBLIC_SUFFIX_RESOURCE);
        if (resourceAsStream == null) {
            return;
        }
        Logger logger = e22.f1877a;
        xg2 xg2Var = new xg2(new w61(new wg(resourceAsStream, new d93())));
        try {
            long readInt = xg2Var.readInt();
            xg2Var.F(readInt);
            byte[] N = xg2Var.f5155b.N(readInt);
            long readInt2 = xg2Var.readInt();
            xg2Var.F(readInt2);
            byte[] N2 = xg2Var.f5155b.N(readInt2);
            tf3.y(xg2Var, null);
            synchronized (this) {
                this.publicSuffixListBytes = N;
                this.publicSuffixExceptionListBytes = N2;
            }
            this.readCompleteLatch.countDown();
        } finally {
        }
    }

    private final void readTheListUninterruptibly() {
        boolean z = false;
        while (true) {
            try {
                try {
                    readTheList();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z = true;
                } catch (IOException e) {
                    Platform.Companion.get().log("Failed to read public suffix list", 5, e);
                    if (z) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    private final List<String> splitDomain(String str) {
        boolean z;
        List<String> n1 = i23.n1(str, new char[]{'.'});
        if (m20.L(d20.L0(n1), "")) {
            List<String> list = n1;
            int size = n1.size() - 1;
            if (size < 0) {
                size = 0;
            }
            if (size >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cr0 cr0Var = cr0.f1659a;
                if (size != 0) {
                    if (list instanceof Collection) {
                        if (size >= list.size()) {
                            return d20.Q0(list);
                        }
                        if (size == 1) {
                            return Collections.singletonList(d20.G0(list));
                        }
                    }
                    ArrayList arrayList = new ArrayList(size);
                    Iterator<T> it = list.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        arrayList.add(it.next());
                        i++;
                        if (i == size) {
                            break;
                        }
                    }
                    int size2 = arrayList.size();
                    if (size2 != 0) {
                        if (size2 != 1) {
                            return arrayList;
                        }
                        return Collections.singletonList(arrayList.get(0));
                    }
                    return cr0Var;
                }
                return cr0Var;
            }
            throw new IllegalArgumentException(p71.k("Requested element count ", size, " is less than zero.").toString());
        }
        return n1;
    }

    public final String getEffectiveTldPlusOne(String str) {
        int size;
        int size2;
        boolean z;
        ho0 ho0Var;
        List<String> splitDomain = splitDomain(IDN.toUnicode(str));
        List<String> findMatchingRule = findMatchingRule(splitDomain);
        int i = 0;
        if (splitDomain.size() == findMatchingRule.size() && findMatchingRule.get(0).charAt(0) != '!') {
            return null;
        }
        if (findMatchingRule.get(0).charAt(0) == '!') {
            size = splitDomain.size();
            size2 = findMatchingRule.size();
        } else {
            size = splitDomain.size();
            size2 = findMatchingRule.size() + 1;
        }
        int i2 = size - size2;
        fp2 yl3Var = new yl3(splitDomain(str), 1);
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 != 0) {
                if (yl3Var instanceof ho0) {
                    ho0 ho0Var2 = (ho0) yl3Var;
                    int i3 = ho0Var2.f2457b + i2;
                    if (i3 < 0) {
                        ho0Var = new ho0(ho0Var2, i2);
                    } else {
                        yl3Var = new ho0(ho0Var2.f2456a, i3);
                    }
                } else {
                    ho0Var = new ho0(yl3Var, i2);
                }
                yl3Var = ho0Var;
            }
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            for (Object obj : yl3Var) {
                i++;
                if (i > 1) {
                    sb.append((CharSequence) ".");
                }
                t9.j(sb, obj, null);
            }
            sb.append((CharSequence) "");
            return sb.toString();
        }
        throw new IllegalArgumentException(p71.k("Requested element count ", i2, " is less than zero.").toString());
    }

    public final void setListBytes(byte[] bArr, byte[] bArr2) {
        this.publicSuffixListBytes = bArr;
        this.publicSuffixExceptionListBytes = bArr2;
        this.listRead.set(true);
        this.readCompleteLatch.countDown();
    }
}
