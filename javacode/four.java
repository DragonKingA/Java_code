public class four{
	public static void main(String[] args){
		int n1 = 1;
		long n2 = 100000000000L;//重点！ “L”或“l”
        int n3 = 2;
        float n4 = 5.12E2f;//重点！“f”或"F"
        float n5 = 2.123456789f;
        float n8 = 2.123456789012345678901234567890f;
        double n6 = 2.123456789;
        double n7 = 2.123456789012345678901234567890;
        double n9 = 2.1234567890123456;
        double n10= 2.123456789012342111111;
		System.out.println( n1 + "\n "+ n2 + n1);
		System.out.println(n1 + "0" + n3);
		System.out.println(n4);
		System.out.println(n5);//=====>  输出2.1234567,损失两位
		System.out.println(n8);//=====>仍输出2.1234567，尾数大幅损失
		System.out.println(n6);//=====>  输出原数，无损失
		System.out.println(n7);//=====>  输出2.1234567890123457，最后一位“7”为错数，并且尾数大幅损失
		System.out.println(n9);//=====>仍输出2.1234567890123457
		System.out.println(n10);//====>  输出2.123456789012342 未出现错数
		/**总结：
		 * float型能保证小数点后7位的精度且只能输出小数位共7位的小数，
		 * 并不会出现错数，若更精确则7位后尾数尽失。
		 * 
		 * double型能保证小数点后15位的精度而能输出小数位共15~16位小数，
		 * 若小数位共16位则最后一位小数为错数，若更精确则15或16位后尾数尽失 。    
		 * 
		 * 
		 * 
		 * 比特（bit）为最小储存单位，1 byte（字节）= 8 bit
		 * 即1个byte有8个最小储存空间.
	*/
//----------------------------------------------------------------------------------------------------------------
        double num1 = 2.7;
        double num2 = 8.1 / 3;
        System.out.println(num1);
        System.out.println(num2);//输出2.6999999999999997,故8.1除以3不等于2.7 !
        /**
         *机器中浮点数即小数的运算，如上述8.1机器不知道1后是否还有小数，故
         * 机器会认为8.1是8.09999999999999999999···除以3后为2.699999999999999···666666···
         * 又由于double型的精度损失造成尾数错数出现“7”即2.6999999999999997
         * 
         * 如果直接查询得到小数或直接赋值小数，其小数才会精确而与真实值相等
        */
        if (num1 == num2){
        	System.out.println("相等");
        }
       else{
        	System.out.println("不相等");
        }
        if (Math.abs(num1 - num2) < 0.0000001){

        	//此处使用了Math类中的abs方法（去计算结果或数值型变量值的绝对值）
        	//可以通过API文档查找相关类和方法
        	
        	System.out.println("机器计算误差微小，可认为两值相等");
        }
        /**if…else 的用法如下：
         * if(布尔表达式 1){
         * 如果布尔表达式 1的值为true执行代码
         * }
         * else if(布尔表达式 2){
         * 如果布尔表达式 2的值为true执行代码
         * }
         * else if(布尔表达式 3){
         * 如果布尔表达式 3的值为true执行代码
         * }
         * else {如果以上布尔表达式都不为true执行代码
         * }

*/
	}
}