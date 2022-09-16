package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
	    int eight = 8;
	    for(int x = 1; x < cathetusLength; x++){
		    for(int y = 1; y < x; y++){
			    System.out.print(eight);
		    }
		    System.out.println();
	    }
    }
}
