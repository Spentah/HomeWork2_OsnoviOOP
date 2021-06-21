public enum AviarySize {
    SMALL(100),
    MEDIUM(300),
    LARGE(500),
    EXTRA_LARGE(700);

    private int size;

    AviarySize(int size){
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}
