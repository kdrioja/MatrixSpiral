/*
Problem: Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

My own example:
[     0  1  2  3 //c
0    [1, 2, 3, 4],
1    [5, 6, 7, 8],
2    [9,10,11,12],
3    [13,14,15,16]
//r
]
Output: [1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10]


rowRange = 4, columnRange = 4
so let's say r = 0, col = 0
    r = 0, c = 0,1,2,3 //c reaches end of range, decrease columnRange is [0,3]
    1,2,3,4

    now we need to go down
    r = 1,2,3, c = 3
    8,12,16

    now we need to go left
    r = 3, c = 2,1,0
    15,14,13

    now we need to go up but not touch r0 rowRange[1,2]
    r = 2,1, c = 0
    9,5

    now we need to go right
    r = 1, c = 1,2
    6,7

    now we need to go down
    r = 2, c = 2
    11

    now we need to go left
    r = 2, c = 1
    10

    DONE
 */
public class Main {
    public static void main(String[] args) {

    }
}
