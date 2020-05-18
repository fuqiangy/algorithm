package cn.yfq.jvm;

public class StaticDemo {

    static {
        i = 2;

    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    }

    public static int i = 1;




//    {
//        public static int i;
//        descriptor: I
//        flags: ACC_PUBLIC, ACC_STATIC
//
//  public cn.yfq.jvm.StaticDemo();
//        descriptor: ()V
//        flags: ACC_PUBLIC
//        Code:
//        stack=1, locals=1, args_size=1
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//            LineNumberTable:
//        line 3: 0
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       5     0  this   Lcn/yfq/jvm/StaticDemo;
//
//        public static void main(java.lang.String[]);
//        descriptor: ([Ljava/lang/String;)V
//        flags: ACC_PUBLIC, ACC_STATIC
//        Code:
//        stack=0, locals=1, args_size=1
//        0: return
//            LineNumberTable:
//        line 12: 0
//        LocalVariableTable:
//        Start  Length  Slot  Name   Signature
//        0       1     0  args   [Ljava/lang/String;
//
//        static {};
//        descriptor: ()V
//        flags: ACC_STATIC
//        Code:
//        stack=1, locals=0, args_size=0
//        0: iconst_0
//        1: putstatic     #2                  // Field i:I
//        4: iconst_1
//        5: putstatic     #2                  // Field i:I
//        8: return
//            LineNumberTable:
//        line 6: 0
//        line 14: 4
//    }
//    SourceFile: "StaticDemo.java"

}
