package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import android.widget.EditText;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Li, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class DialogInterfaceOnClickListenerC0520Li implements DialogInterface.OnClickListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ C0734Tp A01;

    public DialogInterfaceOnClickListenerC0520Li(C0734Tp c0734Tp, EditText editText) {
        this.A01 = c0734Tp;
        this.A00 = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Executor executor;
        executor = this.A01.A03;
        executor.execute(new C0735Tq(this, dialogInterface));
    }
}
