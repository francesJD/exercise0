public class Bedroom {
    int size;
    int length;
    int width;
    int height;
    int numCabinets;
    int numMirrors;
    int numRugs;
    int numLights;

    Bedroom() {
        System.out.println("A bedroom is initialized.");
    }

    public void setSize( int size){
        this.size = size;
    }

    public void setHeight( int height){
        this.height = height;
    }

    public int getSize( ){
        System.out.println("The bedroom's size is: " + size );
        return size;
    }
}
