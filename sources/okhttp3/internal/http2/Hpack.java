package okhttp3.internal.http2;

import defpackage.at;
import defpackage.d20;
import defpackage.lr;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.sr;
import defpackage.xg2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;

/* loaded from: classes2.dex */
public final class Hpack {
    public static final Hpack INSTANCE;
    private static final Map<at, Integer> NAME_TO_FIRST_INDEX;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
    private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
    private static final Header[] STATIC_HEADER_TABLE;

    /* loaded from: classes2.dex */
    public static final class Reader {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        public int headerCount;
        private final List<Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final sr source;

        public Reader(mx2 mx2Var, int i) {
            this(mx2Var, i, 0, 4, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            Arrays.fill(headerArr, 0, headerArr.length, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int dynamicTableIndex(int i) {
            return this.nextHeaderIndex + 1 + i;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.dynamicTable[length].hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final at getName(int i) throws IOException {
            if (isStaticHeader(i)) {
                return Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i].name;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    return headerArr[dynamicTableIndex].name;
                }
            }
            throw new IOException(m20.d1(Integer.valueOf(i + 1), "Header index too large "));
        }

        private final void insertIntoDynamicTable(int i, Header header) {
            this.headerList.add(header);
            int i2 = header.hpackSize;
            if (i != -1) {
                i2 -= this.dynamicTable[dynamicTableIndex(i)].hpackSize;
            }
            int i3 = this.maxDynamicTableByteCount;
            if (i2 > i3) {
                clearDynamicTable();
                return;
            }
            int evictToRecoverBytes = evictToRecoverBytes((this.dynamicTableByteCount + i2) - i3);
            if (i == -1) {
                int i4 = this.headerCount + 1;
                Header[] headerArr = this.dynamicTable;
                if (i4 > headerArr.length) {
                    Header[] headerArr2 = new Header[headerArr.length * 2];
                    System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                    this.nextHeaderIndex = this.dynamicTable.length - 1;
                    this.dynamicTable = headerArr2;
                }
                int i5 = this.nextHeaderIndex;
                this.nextHeaderIndex = i5 - 1;
                this.dynamicTable[i5] = header;
                this.headerCount++;
            } else {
                this.dynamicTable[dynamicTableIndex(i) + evictToRecoverBytes + i] = header;
            }
            this.dynamicTableByteCount += i2;
        }

        private final boolean isStaticHeader(int i) {
            if (i >= 0 && i <= Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length - 1) {
                return true;
            }
            return false;
        }

        private final int readByte() throws IOException {
            return Util.and(this.source.readByte(), 255);
        }

        private final void readIndexedHeader(int i) throws IOException {
            if (isStaticHeader(i)) {
                this.headerList.add(Hpack.INSTANCE.getSTATIC_HEADER_TABLE()[i]);
                return;
            }
            int dynamicTableIndex = dynamicTableIndex(i - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (dynamicTableIndex >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (dynamicTableIndex < headerArr.length) {
                    this.headerList.add(headerArr[dynamicTableIndex]);
                    return;
                }
            }
            throw new IOException(m20.d1(Integer.valueOf(i + 1), "Header index too large "));
        }

        private final void readLiteralHeaderWithIncrementalIndexingIndexedName(int i) throws IOException {
            insertIntoDynamicTable(-1, new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithIncrementalIndexingNewName() throws IOException {
            insertIntoDynamicTable(-1, new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingIndexedName(int i) throws IOException {
            this.headerList.add(new Header(getName(i), readByteString()));
        }

        private final void readLiteralHeaderWithoutIndexingNewName() throws IOException {
            this.headerList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
        }

        public final List<Header> getAndResetHeaderList() {
            List<Header> Q0 = d20.Q0(this.headerList);
            this.headerList.clear();
            return Q0;
        }

        public final int maxDynamicTableByteCount() {
            return this.maxDynamicTableByteCount;
        }

        public final at readByteString() throws IOException {
            boolean z;
            int readByte = readByte();
            if ((readByte & 128) == 128) {
                z = true;
            } else {
                z = false;
            }
            long readInt = readInt(readByte, 127);
            if (z) {
                lr lrVar = new lr();
                Huffman.INSTANCE.decode(this.source, readInt, lrVar);
                return lrVar.u();
            }
            return this.source.e(readInt);
        }

        public final void readHeaders() throws IOException {
            while (!this.source.j()) {
                int and = Util.and(this.source.readByte(), 255);
                if (and != 128) {
                    if ((and & 128) == 128) {
                        readIndexedHeader(readInt(and, 127) - 1);
                    } else if (and == 64) {
                        readLiteralHeaderWithIncrementalIndexingNewName();
                    } else if ((and & 64) == 64) {
                        readLiteralHeaderWithIncrementalIndexingIndexedName(readInt(and, 63) - 1);
                    } else if ((and & 32) == 32) {
                        int readInt = readInt(and, 31);
                        this.maxDynamicTableByteCount = readInt;
                        if (readInt >= 0 && readInt <= this.headerTableSizeSetting) {
                            adjustDynamicTableByteCount();
                        } else {
                            throw new IOException(m20.d1(Integer.valueOf(this.maxDynamicTableByteCount), "Invalid dynamic table size update "));
                        }
                    } else if (and != 16 && and != 0) {
                        readLiteralHeaderWithoutIndexingIndexedName(readInt(and, 15) - 1);
                    } else {
                        readLiteralHeaderWithoutIndexingNewName();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        public final int readInt(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int readByte = readByte();
                if ((readByte & 128) != 0) {
                    i2 += (readByte & 127) << i4;
                    i4 += 7;
                } else {
                    return i2 + (readByte << i4);
                }
            }
        }

        public Reader(mx2 mx2Var, int i, int i2) {
            this.headerTableSizeSetting = i;
            this.maxDynamicTableByteCount = i2;
            this.headerList = new ArrayList();
            this.source = new xg2(mx2Var);
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r1.length - 1;
        }

        public /* synthetic */ Reader(mx2 mx2Var, int i, int i2, int i3, ng0 ng0Var) {
            this(mx2Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Writer {
        public Header[] dynamicTable;
        public int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        public int headerCount;
        public int headerTableSizeSetting;
        public int maxDynamicTableByteCount;
        private int nextHeaderIndex;
        private final lr out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        public Writer(int i, lr lrVar) {
            this(i, false, lrVar, 2, null);
        }

        private final void adjustDynamicTableByteCount() {
            int i = this.maxDynamicTableByteCount;
            int i2 = this.dynamicTableByteCount;
            if (i < i2) {
                if (i == 0) {
                    clearDynamicTable();
                } else {
                    evictToRecoverBytes(i2 - i);
                }
            }
        }

        private final void clearDynamicTable() {
            Header[] headerArr = this.dynamicTable;
            Arrays.fill(headerArr, 0, headerArr.length, (Object) null);
            this.nextHeaderIndex = this.dynamicTable.length - 1;
            this.headerCount = 0;
            this.dynamicTableByteCount = 0;
        }

        private final int evictToRecoverBytes(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i2 = this.nextHeaderIndex;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    int i4 = this.dynamicTable[length].hpackSize;
                    i -= i4;
                    this.dynamicTableByteCount -= i4;
                    this.headerCount--;
                    i3++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i2 + 1, headerArr, i2 + 1 + i3, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i5 = this.nextHeaderIndex;
                Arrays.fill(headerArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.nextHeaderIndex += i3;
            }
            return i3;
        }

        private final void insertIntoDynamicTable(Header header) {
            int i = header.hpackSize;
            int i2 = this.maxDynamicTableByteCount;
            if (i > i2) {
                clearDynamicTable();
                return;
            }
            evictToRecoverBytes((this.dynamicTableByteCount + i) - i2);
            int i3 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i3 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.nextHeaderIndex = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i4 = this.nextHeaderIndex;
            this.nextHeaderIndex = i4 - 1;
            this.dynamicTable[i4] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i;
        }

        public final void resizeHeaderTable(int i) {
            this.headerTableSizeSetting = i;
            int min = Math.min(i, 16384);
            int i2 = this.maxDynamicTableByteCount;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.smallestHeaderTableSizeSetting = Math.min(this.smallestHeaderTableSizeSetting, min);
            }
            this.emitDynamicTableSizeUpdate = true;
            this.maxDynamicTableByteCount = min;
            adjustDynamicTableByteCount();
        }

        public final void writeByteString(at atVar) throws IOException {
            if (this.useCompression) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(atVar) < atVar.c()) {
                    lr lrVar = new lr();
                    huffman.encode(atVar, lrVar);
                    at u = lrVar.u();
                    writeInt(u.c(), 127, 128);
                    lr lrVar2 = this.out;
                    lrVar2.getClass();
                    u.k(lrVar2, u.c());
                    return;
                }
            }
            writeInt(atVar.c(), 127, 0);
            lr lrVar3 = this.out;
            lrVar3.getClass();
            atVar.k(lrVar3, atVar.c());
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r15) throws java.io.IOException {
            /*
                Method dump skipped, instructions count: 266
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.Hpack.Writer.writeHeaders(java.util.List):void");
        }

        public final void writeInt(int i, int i2, int i3) {
            if (i < i2) {
                this.out.V(i | i3);
                return;
            }
            this.out.V(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.out.V(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.out.V(i4);
        }

        public Writer(lr lrVar) {
            this(0, false, lrVar, 3, null);
        }

        public Writer(int i, boolean z, lr lrVar) {
            this.headerTableSizeSetting = i;
            this.useCompression = z;
            this.out = lrVar;
            this.smallestHeaderTableSizeSetting = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i;
            this.dynamicTable = new Header[8];
            this.nextHeaderIndex = r1.length - 1;
        }

        public /* synthetic */ Writer(int i, boolean z, lr lrVar, int i2, ng0 ng0Var) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, lrVar);
        }
    }

    static {
        Hpack hpack = new Hpack();
        INSTANCE = hpack;
        at atVar = Header.TARGET_METHOD;
        at atVar2 = Header.TARGET_PATH;
        at atVar3 = Header.TARGET_SCHEME;
        at atVar4 = Header.RESPONSE_STATUS;
        STATIC_HEADER_TABLE = new Header[]{new Header(Header.TARGET_AUTHORITY, ""), new Header(atVar, "GET"), new Header(atVar, "POST"), new Header(atVar2, "/"), new Header(atVar2, "/index.html"), new Header(atVar3, "http"), new Header(atVar3, "https"), new Header(atVar4, "200"), new Header(atVar4, "204"), new Header(atVar4, "206"), new Header(atVar4, "304"), new Header(atVar4, "400"), new Header(atVar4, "404"), new Header(atVar4, "500"), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header("content-length", ""), new Header("content-location", ""), new Header("content-range", ""), new Header("content-type", ""), new Header("cookie", ""), new Header("date", ""), new Header("etag", ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header("link", ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        NAME_TO_FIRST_INDEX = hpack.nameToFirstIndex();
    }

    private Hpack() {
    }

    private final Map<at, Integer> nameToFirstIndex() {
        Header[] headerArr = STATIC_HEADER_TABLE;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            Header[] headerArr2 = STATIC_HEADER_TABLE;
            if (!linkedHashMap.containsKey(headerArr2[i].name)) {
                linkedHashMap.put(headerArr2[i].name, Integer.valueOf(i));
            }
            i = i2;
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public final at checkLowercase(at atVar) throws IOException {
        boolean z;
        int c = atVar.c();
        int i = 0;
        while (i < c) {
            int i2 = i + 1;
            byte f = atVar.f(i);
            if (65 <= f && f <= 90) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                i = i2;
            } else {
                throw new IOException(m20.d1(atVar.j(), "PROTOCOL_ERROR response malformed: mixed case name: "));
            }
        }
        return atVar;
    }

    public final Map<at, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
