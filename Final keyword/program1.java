public final class program1{
    static int x=10;
    public program1(){
        
    }
    public final static void main(String[] args) {
        final int i;
        i = 20;
    }
    public void show(int p){
        p = 20;
        p = 30;
    }
}
class program2 extends program1{
    @Override
    public void show(int p){

    }
    
}