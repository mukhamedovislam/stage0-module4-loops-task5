package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
	    int eight = 8;
	    for(int i = 0; i < sideLength; i++){
		    for(int j = 0; j < sideLength; j++){
			    if(i == sideLength / 2 || j == sideLength / 2){
				    System.out.print(eight);
			    } else{
				    System.out.print(" ");
			    }
		    }
		    System.out.println();
	    }
    }
}
