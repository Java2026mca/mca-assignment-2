import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        // TODO: Class Box with constructor chaining using this()
        //   Box()           → calls Box(1,1,1)
        //   Box(int side)   → calls Box(side,side,side)
        //   Box(int l,int w,int h) → main constructor
        //   Volume = l*w*h   Surface = 2*(l*w + l*h + w*h)
        //   Print: "Volume: X  Surface: Y"
        //
        // Input: 3 / DEFAULT / CUBE 3 / BOX 2 4 5
        // Output: Volume: 1  Surface: 6 / Volume: 27  Surface: 54 / Volume: 40  Surface: 76
    }
}
