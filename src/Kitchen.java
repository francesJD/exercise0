public class Kitchen {
    int size;
    int length;
    int width;
    int height;
    int numCabinets;
    int numMirrors;
    int numRugs;
    int numLights;

    Kitchen() {
        System.out.println("A kitchen is initialized.");
    }

    public void setSize( int size){
        this.size = size;
    }

    public void setHeight( int height){
        this.height = height;
    }

    public int getSize( ){
        System.out.println("The kitchen's size is: " + size );
        return size;
    }
}
