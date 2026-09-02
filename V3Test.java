public class V3Test {
   public static void main(String[] args) {
      V3 a = new V3 (1,1,1);
      V3 b = new V3 (2,2,2);
      float c = 2;
      a.add(b).print("(a+b)");
      a.sub(b).print("(a-b)");
      a.multesc(c).print("c*(a)");
      System.out.printf("length: %f\n", a.length());
      System.out.printf("prodint: %f\n", a.prodint(b));
   }
}
