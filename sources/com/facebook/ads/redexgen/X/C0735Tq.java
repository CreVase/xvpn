package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Tq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0735Tq extends K8 {
    public static String[] A02 = {"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterfaceOnClickListenerC0520Li A01;

    public C0735Tq(DialogInterfaceOnClickListenerC0520Li dialogInterfaceOnClickListenerC0520Li, DialogInterface dialogInterface) {
        this.A01 = dialogInterfaceOnClickListenerC0520Li;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        InterfaceC0649Qh interfaceC0649Qh;
        InterfaceC0649Qh interfaceC0649Qh2;
        Y9 y9;
        Map<? extends String, ? extends String> A022;
        interfaceC0649Qh = this.A01.A01.A02;
        if (interfaceC0649Qh != null) {
            interfaceC0649Qh2 = this.A01.A01.A02;
            y9 = this.A01.A01.A00;
            String A03 = C0477Jo.A03(y9);
            C0663Qv c0663Qv = new C0663Qv();
            A022 = this.A01.A01.A02(this.A01.A00.getText().toString());
            interfaceC0649Qh2.ADp(A03, c0663Qv.A05(A022).A08());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        A02[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
