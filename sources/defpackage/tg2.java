package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public interface tg2 {
    void a(List list, mn2 mn2Var, yu0 yu0Var);

    void b(xp1 xp1Var, eb3 eb3Var, yu0 yu0Var);

    Object c(mn2 mn2Var, yu0 yu0Var);

    Object d(mn2 mn2Var, yu0 yu0Var);

    void e(List list, mn2 mn2Var, yu0 yu0Var);

    int getFieldNumber();

    int getTag();

    boolean readBool();

    void readBoolList(List list);

    vs readBytes();

    void readBytesList(List list);

    double readDouble();

    void readDoubleList(List list);

    int readEnum();

    void readEnumList(List list);

    int readFixed32();

    void readFixed32List(List list);

    long readFixed64();

    void readFixed64List(List list);

    float readFloat();

    void readFloatList(List list);

    int readInt32();

    void readInt32List(List list);

    long readInt64();

    void readInt64List(List list);

    int readSFixed32();

    void readSFixed32List(List list);

    long readSFixed64();

    void readSFixed64List(List list);

    int readSInt32();

    void readSInt32List(List list);

    long readSInt64();

    void readSInt64List(List list);

    String readString();

    void readStringList(List list);

    void readStringListRequireUtf8(List list);

    String readStringRequireUtf8();

    int readUInt32();

    void readUInt32List(List list);

    long readUInt64();

    void readUInt64List(List list);
}
