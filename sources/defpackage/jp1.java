package defpackage;

import com.google.protobuf.i0;
import com.google.protobuf.o0;
import com.google.protobuf.r0;
import com.google.protobuf.v0;
import com.google.protobuf.w0;

/* loaded from: classes2.dex */
public final class jp1 implements nn2 {
    private static final vv1 EMPTY_FACTORY = new fp1();
    private final vv1 messageInfoFactory;

    public jp1() {
        this(getDefaultMessageInfoFactory());
    }

    private static vv1 getDefaultMessageInfoFactory() {
        return new hp1(i0.getInstance(), getDescriptorMessageInfoFactory());
    }

    private static vv1 getDescriptorMessageInfoFactory() {
        try {
            return (vv1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return EMPTY_FACTORY;
        }
    }

    private static boolean isProto2(tv1 tv1Var) {
        if (tv1Var.getSyntax() == ga2.PROTO2) {
            return true;
        }
        return false;
    }

    private static <T> ln2 newSchema(Class<T> cls, tv1 tv1Var) {
        if (o0.class.isAssignableFrom(cls)) {
            if (isProto2(tv1Var)) {
                return v0.newSchema(cls, tv1Var, a02.lite(), vk1.lite(), rn2.unknownFieldSetLiteSchema(), bv0.lite(), bq1.lite());
            }
            return v0.newSchema(cls, tv1Var, a02.lite(), vk1.lite(), rn2.unknownFieldSetLiteSchema(), null, bq1.lite());
        }
        if (isProto2(tv1Var)) {
            return v0.newSchema(cls, tv1Var, a02.full(), vk1.full(), rn2.proto2UnknownFieldSetSchema(), bv0.full(), bq1.full());
        }
        return v0.newSchema(cls, tv1Var, a02.full(), vk1.full(), rn2.proto3UnknownFieldSetSchema(), null, bq1.full());
    }

    @Override // defpackage.nn2
    public <T> ln2 createSchema(Class<T> cls) {
        rn2.requireGeneratedMessage(cls);
        tv1 messageInfoFor = this.messageInfoFactory.messageInfoFor(cls);
        if (messageInfoFor.isMessageSetWireFormat()) {
            if (o0.class.isAssignableFrom(cls)) {
                return w0.newSchema(rn2.unknownFieldSetLiteSchema(), bv0.lite(), messageInfoFor.getDefaultInstance());
            }
            return w0.newSchema(rn2.proto2UnknownFieldSetSchema(), bv0.full(), messageInfoFor.getDefaultInstance());
        }
        return newSchema(cls, messageInfoFor);
    }

    private jp1(vv1 vv1Var) {
        this.messageInfoFactory = (vv1) r0.checkNotNull(vv1Var, "messageInfoFactory");
    }
}
