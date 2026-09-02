public class V3{
    public float x; 
    public float y;
    public float z;
    V3(float x, float y, float z){ 
        this.x = x;
        this.y = y;
        this.z = z;
    }   
    public V3 add(final V3 c){
        return new V3 (x + c.x , y +c.y, z + c.z);
    }
    public V3 sub(final V3 c){
        return new V3(x - c.x , y - c.y, z - c.z);
    }
    public V3 multesc(float c){
        return new V3(x * c, y * c, z * c);
    }
    public float length(){
        
        return (float) Math.sqrt(x * x + y * y + z * z);
    }
     public float prodint(final V3 c){
        return x * c.x + y * c.y + z * c.z;
    }
    public void print(String label){
        System.out.printf("%s(%f,%f,%f)\n",label, x, y, z);
    }
}



