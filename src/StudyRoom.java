public class StudyRoom {
    int size;
    int length;
    int width;
    int height;
    int numCabinets;
    int numMirrors;
    int numRugs;
    int numLights;

    StudyRoom() {
        System.out.println("A study room is initialized.");
    }

    public void setSize( int size){
        this.size = size;
    }

    public void setHeight( int height){
        this.height = height;
    }

    public int getSize( ){
        System.out.println("The study room's size is: " + size );
        return size;
    }
}
