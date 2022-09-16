package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
	    int eight = 8;
	    for(int i = 0; i < height; i++){
		for(int j = 0; j < height; j++){
			if((i <= j && (i + j) < height) || (i >= j && (i + j) >= height - 1)){
				System.out.print(eight);
			} else {
				System.out.print("");
			}
		}
		System.out.println();
	    }
    }
}
