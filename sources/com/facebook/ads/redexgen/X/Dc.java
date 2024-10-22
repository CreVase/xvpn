package com.facebook.ads.redexgen.X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Dc {
    public static String[] A0B = {"WSNeg6N0n7AIShfXSzX5HQmTc8kFkZEc", "6rZRvoV62oNyzf", "F27AMpNiqyccCa5EB6sKY7eKfEMSqhrd", "FVKbL9f5FAHwz7hiZMN0u1v1YdCbdeYK", "vVfLkZocD1NxPHhP9fXAXrt0GsgaX4xN", "cFmUa63iy9OAJJOa0jT7jB1cdvdJ4hQa", "2QFrNOOxadMtahUuhILPt16xKsmCtJsL", "J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0316Db> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Dc A02(C0420Hh c0420Hh) {
        long A0M = c0420Hh.A0M();
        boolean z = (c0420Hh.A0E() & 128) != 0;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z4 = false;
        long j = -9223372036854775807L;
        if (!z) {
            int A0E = c0420Hh.A0E();
            z2 = (A0E & 128) != 0;
            z3 = (A0E & 64) != 0;
            if (A0B[7].length() != 1) {
                throw new RuntimeException();
            }
            A0B[1] = "02B3CRg7kTq01s";
            boolean z5 = (A0E & 32) != 0;
            r14 = z3 ? c0420Hh.A0M() : -9223372036854775807L;
            if (z3) {
                String[] strArr = A0B;
                if (strArr[0].charAt(5) == strArr[5].charAt(5)) {
                    A0B[1] = "Wfp3iGqyia9VmI";
                }
            } else {
                int A0E2 = c0420Hh.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i4 = 0; i4 < A0E2; i4++) {
                    arrayList.add(new C0316Db(c0420Hh.A0E(), c0420Hh.A0M(), null));
                }
            }
            if (z5) {
                long A0E3 = c0420Hh.A0E();
                z4 = (128 & A0E3) != 0;
                j = (1000 * (((1 & A0E3) << 32) | c0420Hh.A0M())) / 90;
            }
            i = c0420Hh.A0I();
            i2 = c0420Hh.A0E();
            i3 = c0420Hh.A0E();
        }
        return new Dc(A0M, z, z2, z3, arrayList, r14, z4, j, i, i2, i3);
    }

    public Dc(long j, boolean z, boolean z2, boolean z3, List<C0316Db> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.A04 = j;
        this.A0A = z;
        this.A08 = z2;
        this.A09 = z3;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j2;
        this.A07 = z4;
        this.A03 = j3;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public Dc(Parcel parcel) {
        C0316Db A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = C0316Db.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static Dc A00(Parcel parcel) {
        return new Dc(parcel);
    }

    public static /* synthetic */ Dc A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ Dc A03(C0420Hh c0420Hh) {
        return A02(c0420Hh);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        byte b2 = this.A07 ? (byte) 1 : (byte) 0;
        if (A0B[1].length() != 14) {
            throw new RuntimeException();
        }
        A0B[1] = "FoD8YYsiaA11j5";
        parcel.writeByte(b2);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(Dc dc, Parcel parcel) {
        dc.A04(parcel);
    }
}
