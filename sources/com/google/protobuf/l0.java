package com.google.protobuf;

import defpackage.mr3;
import defpackage.ww0;
import defpackage.yv1;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class l0 {
    private final Iterator<Map.Entry<m0, Object>> iter;
    private final boolean messageSetWireFormat;
    private Map.Entry<m0, Object> next;
    final /* synthetic */ GeneratedMessageLite$ExtendableMessage this$0;

    public /* synthetic */ l0(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, boolean z, j0 j0Var) {
        this(generatedMessageLite$ExtendableMessage, z);
    }

    public void writeUntil(int i, v vVar) throws IOException {
        while (true) {
            Map.Entry<m0, Object> entry = this.next;
            if (entry != null && entry.getKey().getNumber() < i) {
                m0 key = this.next.getKey();
                if (this.messageSetWireFormat && key.getLiteJavaType() == mr3.MESSAGE && !key.isRepeated()) {
                    vVar.writeMessageSetExtension(key.getNumber(), (yv1) this.next.getValue());
                } else {
                    ww0.writeField(key, this.next.getValue(), vVar);
                }
                if (this.iter.hasNext()) {
                    this.next = this.iter.next();
                } else {
                    this.next = null;
                }
            } else {
                return;
            }
        }
    }

    private l0(GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage, boolean z) {
        this.this$0 = generatedMessageLite$ExtendableMessage;
        Iterator it = generatedMessageLite$ExtendableMessage.extensions.iterator();
        this.iter = it;
        if (it.hasNext()) {
            this.next = (Map.Entry) it.next();
        }
        this.messageSetWireFormat = z;
    }
}
