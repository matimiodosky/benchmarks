public class Test {

public static void main(String... args){
long start = System.currentTimeMillis();
for(long i = 0; i < 1000000; i++){
	Math.acos(0.5);
}
for(long i = 0; i < 54000000; i++){
       long a =  1000 * 1000;
}
System.out.println(System.currentTimeMillis() - start);
}

}
