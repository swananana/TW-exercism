class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int sum = (input * (input+1))/2;
        return sum * sum;
    }

    int computeSumOfSquaresTo(int input) {
        int sumofSq = 0;
        for(int i=1;i<input+1;i++){
            sumofSq = sumofSq + (i*i);
        
        }
        return sumofSq;
    }

    int computeDifferenceOfSquares(int input) {
        return Math.abs(computeSumOfSquaresTo(input) - computeSquareOfSumTo(input));
    }

}
