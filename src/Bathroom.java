public class Bathroom {
    int size;
    int length;
    int width;
    int height;
    int numCabinets;
    int numMirrors;
    int numRugs;
    int numShows;

    Bathroom() {
        System.out.println("A bathroom is initialized.");
    }

    public void setSize( int size){
        this.size = size;
    }

    public void setHeight( int height){
        this.height = height;
    }

    public int getSize( ){
        System.out.println("The bathroom's size is: " + size );
        return size;
    }
}
