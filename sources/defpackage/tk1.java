package defpackage;

import com.google.protobuf.n1;
import java.util.List;

/* loaded from: classes2.dex */
public final class tk1 extends vk1 {
    private tk1() {
        super();
    }

    public static <E> wd1 getProtobufList(Object obj, long j) {
        return (wd1) n1.getObject(obj, j);
    }

    @Override // defpackage.vk1
    public void makeImmutableListAt(Object obj, long j) {
        ((p1) getProtobufList(obj, j)).makeImmutable();
    }

    @Override // defpackage.vk1
    public <E> void mergeListsAt(Object obj, Object obj2, long j) {
        wd1 protobufList = getProtobufList(obj, j);
        wd1 protobufList2 = getProtobufList(obj2, j);
        int size = protobufList.size();
        int size2 = protobufList2.size();
        if (size > 0 && size2 > 0) {
            if (!protobufList.isModifiable()) {
                protobufList = protobufList.mutableCopyWithCapacity(size2 + size);
            }
            protobufList.addAll(protobufList2);
        }
        if (size > 0) {
            protobufList2 = protobufList;
        }
        n1.putObject(obj, j, protobufList2);
    }

    @Override // defpackage.vk1
    public <L> List<L> mutableListAt(Object obj, long j) {
        int i;
        wd1 protobufList = getProtobufList(obj, j);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            wd1 mutableCopyWithCapacity = protobufList.mutableCopyWithCapacity(i);
            n1.putObject(obj, j, mutableCopyWithCapacity);
            return mutableCopyWithCapacity;
        }
        return protobufList;
    }
}
