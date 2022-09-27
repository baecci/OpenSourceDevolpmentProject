public class ArrayPlanar {
    public static void main(String[] args) {
        //2차원 배열 선언 후, 비정형이므로 각 행마다 열을 선언
        int intArray[][] = new int[5][];
        intArray[0] = new int[1];
        intArray[1] = new int[3];
        intArray[2] = new int[1];
        intArray[3] = new int[4];
        intArray[4] = new int[2];

        //2차원 배열의 값을 초기화
        for(int i=0; i < intArray.length; i++)
            for(int j=0; j<intArray[i].length; j++)
                intArray[i][j] = j+1;

        //2차원 배열을 출력
        for(int i=0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++)
                System.out.print(intArray[i][j] + " ");
            System.out.println();
        }
    }
}
