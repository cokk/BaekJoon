/**
 * 행렬의 덧셈
 * https://programmers.co.kr/learn/courses/30/lessons/12950
 *
 * 문제 설명
 *
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 * 제한 조건
 * 행렬 arr1, arr2의 행과 열의 길이는 500을 넘지 않습니다.
 * 입출력 예
 * arr1	arr2	return
 * [[1,2],[2,3]]	[[3,4],[5,6]]	[[4,6],[7,9]]
 * [[1],[2]]	[[3],[4]]	[[4],[6]]
 *
 * 2019.6.27
 */
package level1.practice;

public class Solution28 {
//    private static final int[][] arr1 = {{1, 2}, {2, 3}};
//    private static final int[][] arr2 = {{3, 4}, {5, 6}}; // 2행 2열
    private static final int[][] arr1 = {{1}, {2}};
    private static final int[][] arr2 = {{3}, {4}}; // 2행 1열

    public static void main(String[] args) {
        for (int[] i : solution(arr1, arr2)) {
            for (int j : i) {
                System.out.println(j);
            }
        }
    }
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int row = Math.max(arr1.length, arr2.length);
        int col = Math.max(arr1[0].length, arr2[0].length);

        int[][] answer = new int[row][col];
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return answer;
    }
}
