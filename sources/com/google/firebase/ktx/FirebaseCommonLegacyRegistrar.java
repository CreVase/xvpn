package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.h30;
import java.util.Collections;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<h30> getComponents() {
        return Collections.singletonList(bx3.p("fire-core-ktx", "20.4.2"));
    }
}
