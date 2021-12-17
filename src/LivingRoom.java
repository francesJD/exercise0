public class LivingRoom {
    int size;
    int length;
    int width;
    int height;
    int numCabinets;
    int numMirrors;
    int numRugs;
    int numLights;

    LivingRoom() {
        System.out.println("A living room is initialized.");
    }

    public void setSize( int size){
        this.size = size;
    }

    public void setHeight( int height){
        this.height = height;
    }

    public int getSize( ){
        System.out.println("The living room's size is: " + size );
        return size;
    }
}
