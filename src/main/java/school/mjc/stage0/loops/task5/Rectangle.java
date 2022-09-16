package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height){
	    int eight = 8;
	    for(int i = 0; i < length; i++){
		    for(int j = 0; j < height; j++){
			    if(i == 0 || i == height - 1){
				    System.out.print(eight);
			    } else if(j > 0 && j < length - 1){
				    System.out.print(" ");
			    } else {
				System.out.print(eight);
			    }
		    }
		    System.out.println();
	    }
    }
}
