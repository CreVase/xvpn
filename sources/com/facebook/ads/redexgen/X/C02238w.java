package com.facebook.ads.redexgen.X;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.8w, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02238w implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"Gii7pzXwK3MpiHC8B9NJqbzL", "8Pqq6WSNf8vKrPOx7XSY9C7", "LI4waC8pDZc7B2Ob9Mw4umyD0YVp7Iep", "HQVOS1q9k5iJuCSZxlwiHtDpSPIo2CAf", "0wBrPWYDPAFL7IDgbo0bQ8s", "e5cW7wYXRGqKaYX8", "aNUR51q123XM3tsFczjtkJvp", "F8bzMC9kGkJ5CLi2olbpsia5Bq7Sq0"};
    public boolean A00;
    public final C02138m A01;
    public final Deque<C02228v> A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = copyOfRange[i4] ^ i3;
            if (A04[5].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[0] = "u097qyCEcqL0dCUFF3RqUSqj";
            strArr[6] = "TBb0mUAcLDsBFXHpNBOq9rzF";
            copyOfRange[i4] = (byte) (i5 ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        byte[] bArr = {5, 41, 51, 42, 34, 102, 40, 41, 50, 102, 39, 34, 34, 102, 52, 35, 37, 41, 52, 34, 102, 50, 41, 102, 40, 35, 49, 42, 63, 102, 39, 34, 34, 35, 34, 102, 32, 47, 42, 35, 42, 13, 5, 0, 9, 8, 76, 24, 3, 76, 8, 9, 0, 9, 24, 9, 76, 10, 5, 0, 9, 76, 75, 73, 31, 75, 106, 77, 69, 64, 73, 72, 12, 88, 67, 12, 64, 69, 95, 88, 12, 74, 69, 64, 73, 72, 12, 69, 66, 12, 72, 69, 94, 73, 79, 88, 67, 94, 85, 12, 11, 9, 95, 11, 28, 59, 51, 54, 63, 62, 122, 46, 53, 122, 54, 53, 59, 62, 122, 60, 51, 54, 63, 122, 125, Byte.MAX_VALUE, 41, 125, 118, 122, 41, 49, 51, 42, 42, 51, 52, 61, 122, 59, 54, 54, 122, 42, 40, 63, 44, 51, 53, 47, 41, 122, 60, 51, 54, 63, 41, 122, 47, 52, 46, 51, 54, 122, Byte.MAX_VALUE, 62, 61, 28, 29, 94, 16, 28, 29, 7, 26, 20, 6, 28, 6, 0, 83, 29, 18, 30, 22, 23, 83, 21, 26, 31, 22, 83, 26, 29, 83, 31, 28, 20, 20, 26, 29, 20, 83, 23, 26, 1, 22, 16, 7, 28, 1, 10, 73, 83, 86, 23, 95, 83, 30, 26, 29, 83, 26, 0, 83, 86, 23, 29, 42, 44, 32, 61, 43, 9, 38, 35, 42, 28, 42, 62, 58, 42, 33, 44, 42, 111, 46, 35, 61, 42, 46, 43, 54, 111, 44, 35, 32, 60, 42, 43, 107, 80, 85, 80, 81, 73, 80, 30, 88, 87, 82, 91, 30, 87, 80, 30, 82, 81, 89, 89, 87, 80, 89, 30, 90, 87, 76, 91, 93, 74, 81, 76, 71, 4, 30, 25, 27, 77, 25};
        String[] strArr = A04;
        if (strArr[3].charAt(18) != strArr[2].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "rXUNYUFSY3Wwjf0Rt9wI3pKgcM0mrVi5";
        strArr2[2] = "NbfmFkvRWQfztm8Xt0wszzyUhHEjBSFU";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized int A09() throws IOException {
        int i;
        if (this.A00) {
            throw new IOException(A02(227, 33, 62));
        }
        i = 0;
        Iterator<C02228v> it = this.A02.iterator();
        while (it.hasNext()) {
            i += it.next().A01();
        }
        return i;
    }

    static {
        A03();
    }

    public C02238w(C02138m c02138m, InterfaceC02218u interfaceC02218u) throws IOException {
        LinkedList linkedList = new LinkedList();
        this.A02 = linkedList;
        this.A00 = false;
        this.A01 = c02138m;
        A05(c02138m, interfaceC02218u);
        if (linkedList.isEmpty()) {
            A00();
        }
    }

    private C02228v A00() throws IOException {
        int i = -1;
        if (!this.A02.isEmpty()) {
            i = this.A02.getLast().A00();
        }
        int i2 = i + 1;
        this.A02.add(new C02228v(i2, new C02198s(new File(this.A01.A05(), A01(i2)))));
        return this.A02.getLast();
    }

    public static String A01(int i) {
        return Integer.toString(i);
    }

    private void A04(int i, File file) throws IOException {
        C02198s c02198s = new C02198s(file);
        c02198s.A05();
        this.A02.addFirst(new C02228v(i, c02198s));
    }

    private void A05(C02138m c02138m, InterfaceC02218u interfaceC02218u) throws IOException {
        File[] listFiles = c02138m.A05().listFiles();
        if (listFiles != null) {
            HashMap hashMap = new HashMap();
            HashSet<File> hashSet = new HashSet();
            int i = -1;
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    hashMap.put(Integer.valueOf(parseInt), file);
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                    hashSet.add(file);
                    interfaceC02218u.AEf(String.format(Locale.US, A02(260, 39, 79), file.getCanonicalPath()));
                }
            }
            if (!hashMap.isEmpty()) {
                int i2 = i;
                while (hashMap.containsKey(Integer.valueOf(i2 - 1))) {
                    i2--;
                }
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    int maxFileNumber = ((Integer) it.next()).intValue();
                    if (maxFileNumber < i2) {
                        interfaceC02218u.AEf(String.format(Locale.US, A02(166, 61, 2), Integer.valueOf(maxFileNumber), Integer.valueOf(i2)));
                        hashSet.add((File) hashMap.remove(Integer.valueOf(maxFileNumber)));
                    }
                }
                while (i >= i2) {
                    Integer valueOf = Integer.valueOf(i);
                    if (A04[7].length() == 23) {
                        throw new RuntimeException();
                    }
                    A04[5] = "fmCLvQkSN3nY4ZJN";
                    File file2 = (File) hashMap.get(valueOf);
                    try {
                        A04(i, file2);
                        hashMap.remove(Integer.valueOf(i));
                        i--;
                    } catch (IOException e) {
                        interfaceC02218u.AEg(String.format(Locale.US, A02(104, 62, 43), file2.getCanonicalPath(), Integer.valueOf(i)), e);
                        hashSet.addAll(hashMap.values());
                    }
                }
            }
            for (File file3 : hashSet) {
                if (!file3.delete()) {
                    interfaceC02218u.AEf(String.format(Locale.US, A02(40, 26, 29), file3.getCanonicalPath()));
                }
            }
            return;
        }
        throw new IOException(String.format(Locale.US, A02(66, 38, 93), c02138m.A05().getCanonicalPath()));
    }

    public final synchronized int A06() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(227, 33, 62));
        }
        return this.A02.size();
    }

    public final synchronized C02118k A0A(int i, int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        if (!this.A00) {
            for (C02228v file : this.A02) {
                if (file.A00() == i) {
                    return new C02118k(i, file.A02(i2, bArr, i3, iArr, i4));
                }
            }
            return new C02118k(-1, new C8j(EnumC02108i.A04, -1, -1, 0));
        }
        throw new IOException(A02(227, 33, 62));
    }

    public final synchronized void A0B() throws IOException {
        if (!this.A00) {
            Iterator<C02228v> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(227, 33, 62));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(0, 40, 55));
            }
        } else {
            throw new IOException(A02(227, 33, 62));
        }
    }

    public final synchronized boolean A0D() throws IOException {
        if (!this.A00) {
            if (this.A02.size() <= 1) {
                return false;
            }
            C02228v first = this.A02.getFirst();
            this.A02.removeFirst();
            first.A04();
            return true;
        }
        throw new IOException(A02(227, 33, 62));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        Iterator<C02228v> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A03();
        }
    }
}
