public class L7_JavaException {
    public static void main(String[] args) {
        try {
//            System.out.println(1 / 0);
//            int[] array = new int[]{1,2,3};
//            System.out.println(array[3]);
            // 或者直接Exception e：直接捕获全部异常
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // 或者直接Exception e：直接捕获全部异常
        try {
//            System.out.println(0 / 1);
//            int[] array = new int[]{1,2,3};
//            System.out.println(array[3]);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            // finally关键字：不管是否有异常，finally中的代码都会被执行，可用于关闭文件
            System.out.println("finally");
        }
        System.out.println("Continue...");

        // 关键字throws和throw: 用于主函数处理异常
        try {
//            badCode();
        } catch (Exception e) {
            System.out.println(e);
        }

        // throw: 用于抛出自定义异常,需要搭配throws使用
        try {
            checkAge(17);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void badCode() throws ArithmeticException, ArrayIndexOutOfBoundsException{
        System.out.println(0 / 1);
        int[] array = new int[]{1,2,3};
        System.out.println(array[3]);
    }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Access denied: You must be at least 18 years old.");
        } else {
            System.out.println("Access granted: You are old enough!");
        }
    }
}
