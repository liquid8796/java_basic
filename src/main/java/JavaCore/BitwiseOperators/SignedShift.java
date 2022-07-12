package JavaCore.BitwiseOperators;

public class SignedShift {
    public static void main(String[] args)
    {
        System.out.println("===Left Shifting a byte value===");
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte)(a << 2);

        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);

        System.out.println("===Left Shifting===");
        int number = 2;
        // 2 bit left shift operation
        int Ans = number << 2;

        System.out.println(Ans);

        System.out.println("===Right Shifting===");
        number = 8;

        // 2 bit signed right shift
        Ans = number >> 2;

        System.out.println(Ans);

        System.out.println("===Masking sign extension===");
        char hex[]={
                '0','1','2','3','4','5',
                '6','7','8','9','a','b','c',
                'd','e','f'
        };

        byte c=(byte) 0xf1;
        System.out.println(c);

        System.out.println("c = 0x" + hex [(c>>4) & 0x0f] + hex[c & 0x0f]);
    }
}
