package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: assets/audience_network.dex */
public final class HA {
    public static byte[] A08;
    public static String[] A09 = {"tUmPyJA995IehdlgYh1M2HtFJdqk2qFq", "MsgCzq1VVfM7rzT56hJDHksvV5yXe4gF", "4HQ7m4N6DkH9M0uOuKNVPqKigOQvjf6k", "N6cNHUUPL7Fh24xE6qmpU0ogNc5efwpW", "s0cCARPqV4C670oPtvU1gEMcVzhG", "NrezJK25om3nHdODHZffKD7POu79MIOp", "J5KrgCJUtsnBlTAtkJ9UTDt78OFQHXma", "N8WE0W2EMF4cGNiI42Wit4NkXIy23rap"};
    public C0427Ho A00;
    public boolean A01;
    public final SparseArray<String> A02;
    public final HK A03;
    public final HashMap<String, H9> A04;
    public final Cipher A05;
    public final SecretKeySpec A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A08 = new byte[]{-90, -86, -72, -36, -32, -18, -54, -34, -35, -34, -54, -21, -26, -34, -18, -48, -21, -36, -33, -33, -28, -23, -30, -45, -44, -78, -80, -78, -73, -76, -77, -82, -78, -66, -67, -61, -76, -67, -61, -82, -72, -67, -77, -76, -57, 125, -76, -57, -72};
    }

    static {
        A05();
    }

    public HA(File file, byte[] bArr, boolean z) {
        this.A07 = z;
        if (bArr != null) {
            HI.A03(bArr.length == 16);
            try {
                this.A05 = A03();
                this.A06 = new SecretKeySpec(bArr, A02(0, 3, 51));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            HI.A04(!z);
            this.A05 = null;
            this.A06 = null;
        }
        this.A04 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A03 = new HK(new File(file, A02(25, 24, 29)));
    }

    public static int A00(SparseArray<String> idToKey) {
        int id;
        int size = idToKey.size();
        if (size == 0) {
            id = 0;
        } else {
            int size2 = size - 1;
            id = idToKey.keyAt(size2) + 1;
        }
        if (id < 0) {
            id = 0;
            while (id < size) {
                int size3 = idToKey.keyAt(id);
                if (id != size3) {
                    break;
                }
                id++;
            }
        }
        return id;
    }

    private H9 A01(String str) {
        int id = A00(this.A02);
        H9 cachedContent = new H9(id, str);
        A06(cachedContent);
        this.A01 = true;
        return cachedContent;
    }

    public static Cipher A03() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = C0436Hx.A02;
        String A02 = A02(3, 20, 105);
        if (i == 18) {
            try {
                return Cipher.getInstance(A02, A02(23, 2, 95));
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(A02);
    }

    private void A04() throws H0 {
        try {
            try {
                OutputStream outputStream = this.A03.A03();
                C0427Ho c0427Ho = this.A00;
                if (c0427Ho == null) {
                    this.A00 = new C0427Ho(outputStream);
                } else {
                    c0427Ho.A00(outputStream);
                }
                DataOutputStream output = new DataOutputStream(this.A00);
                DataOutputStream dataOutputStream = output;
                dataOutputStream.writeInt(2);
                dataOutputStream.writeInt(this.A07 ? 1 : 0);
                if (this.A07) {
                    byte[] bArr = new byte[16];
                    new Random().nextBytes(bArr);
                    dataOutputStream.write(bArr);
                    try {
                        this.A05.init(1, this.A06, new IvParameterSpec(bArr));
                        dataOutputStream.flush();
                        DataOutputStream output2 = new DataOutputStream(new CipherOutputStream(this.A00, this.A05));
                        dataOutputStream = output2;
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream.writeInt(this.A04.size());
                int i = 0;
                for (H9 h9 : this.A04.values()) {
                    h9.A0A(dataOutputStream);
                    i += h9.A03(2);
                }
                dataOutputStream.writeInt(i);
                this.A03.A06(dataOutputStream);
                C0436Hx.A0X(null);
            } catch (IOException e2) {
                throw new H0(e2);
            }
        } catch (Throwable th) {
            C0436Hx.A0X(null);
            throw th;
        }
    }

    private void A06(H9 h9) {
        this.A04.put(h9.A03, h9);
        this.A02.put(h9.A02, h9.A03);
    }

    private boolean A07() {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A03.A04());
            DataInputStream input = new DataInputStream(bufferedInputStream);
            DataInputStream dataInputStream = input;
            int hashCode = dataInputStream.readInt();
            if (hashCode >= 0) {
                if (A09[5].charAt(29) == 'y') {
                    throw new RuntimeException();
                }
                A09[2] = "8D0UmEy2ZnW8UG7osX1W3JX0L9oaaEfw";
                if (hashCode <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.A05 == null) {
                            C0436Hx.A0X(dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        try {
                            this.A05.init(2, this.A06, new IvParameterSpec(bArr));
                            DataInputStream input2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A05));
                            dataInputStream = input2;
                        } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                            throw new IllegalStateException(e);
                        }
                    } else if (this.A07) {
                        this.A01 = true;
                    }
                    int readInt = dataInputStream.readInt();
                    int version = 0;
                    for (int i = 0; i < readInt; i++) {
                        H9 A00 = H9.A00(hashCode, dataInputStream);
                        A06(A00);
                        version += A00.A03(hashCode);
                    }
                    int readInt2 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt2 != version || !z) {
                        C0436Hx.A0X(dataInputStream);
                        return false;
                    }
                    C0436Hx.A0X(dataInputStream);
                    return true;
                }
            }
            C0436Hx.A0X(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                C0436Hx.A0X(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                C0436Hx.A0X(null);
            }
            throw th;
        }
    }

    public final int A08(String str) {
        return A0A(str).A02;
    }

    public final H9 A09(String str) {
        return this.A04.get(str);
    }

    public final H9 A0A(String str) {
        H9 cachedContent = this.A04.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final HC A0B(String str) {
        H9 cachedContent = A09(str);
        return cachedContent != null ? cachedContent.A05() : C0768Ux.A04;
    }

    public final String A0C(int i) {
        return this.A02.get(i);
    }

    public final Collection<H9> A0D() {
        return this.A04.values();
    }

    public final void A0E() {
        HI.A04(!this.A01);
        if (!A07()) {
            this.A03.A05();
            this.A04.clear();
            this.A02.clear();
        }
    }

    public final void A0F() {
        String[] strArr = new String[this.A04.size()];
        this.A04.keySet().toArray(strArr);
        for (String str : strArr) {
            A0H(str);
        }
    }

    public final void A0G() throws H0 {
        if (!this.A01) {
            return;
        }
        A04();
        this.A01 = false;
    }

    public final void A0H(String str) {
        H9 h9 = this.A04.get(str);
        if (h9 != null && h9.A0C() && !h9.A0D()) {
            this.A04.remove(str);
            this.A02.remove(h9.A02);
            if (A09[7].charAt(6) != '2') {
                throw new RuntimeException();
            }
            A09[7] = "jdWRL72EOrbCMRK3hJiACfcup0he26HP";
            this.A01 = true;
        }
    }

    public final void A0I(String str, HE he) {
        H9 cachedContent = A0A(str);
        if (cachedContent.A0F(he)) {
            this.A01 = true;
        }
    }
}
