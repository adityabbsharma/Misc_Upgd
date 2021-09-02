/*Q u e u e s: A q u e u e o f p e o ple.
        You are given the names of N people and the time at which they arrive. You have an empty queue. As soon as a person arrives, you add their name to the queue.
        Giv e n t h e n a m e s o f t h e p e o ple a n d t h eir a r riv al tim e s p rin t t h e fin al q u e u e a ft e r all N p e o ple h a v e a r riv e d.
        Note 1) No two people have the same name. 2) No two people have the same arrival time. 3) The input is arrival time is not sorted(See sample input).   Function Description In the provided code snippet, implement the provided finalQueue(...) method using the variables to print the output. You can write your code in the space below the phrase “WRITE YOUR LOGIC HERE”.
        There will be multiple test cases running, so the Input and Output should match exactly as provided. The base Output variable result is set to a default value of -404, which can be modified. Additionally, you can add or remove these output variables.
        Input Format The first line of input contains integer N  denoting the number of people The next line contains N strings denoting the names of the people. The next line contains N integers denoting the arrival time of each person.
        Sample Input
        4
        Jim Sam Ray John
        5 1 4 2
        Constraints 1<= N <=50 1<=Length of names of people<=5 1<= Arrival time<=100
        Output Format The output contains the final queue after all N people have arrived.
        Sample Output Sam John Ray Jim
        Explanation There are 4 people with names Jim, Sam, Ray, John. Jim arrives at t=5 minutes, Sam arrives at t=1 minutes, Ray arrives at t=4 minutes and John arrives at t=2 minutes. So "Sam" arrives first at t=1 minutes. Therefore, "Sam" is the first who is added to the queue. "John" arrives second at t=2 minutes. Therefore, "John" is the second who is added to the queue. "Ray" arrives third at t=4 minutes. Therefore, "Ray" is the third who is added to the queue. "Jim" arrives fourth t=5 minutes. Therefore, "Jim" is the fourth who is added to the queue.

        Hence the output is:  S a m  J o h n  R a y  Jim */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math;
import java.util.Scanner;
import java.util.TreeMap;

public class AQueueOfPeople {
    public static void finalQueue(int N,String[] Names,int[] A) {

        TreeMap<Integer, String> tMap = new TreeMap<>();
        for (int i = 0; i < A.length; i++) {
            tMap.put(A[i], Names[i]);
        }
        for (Integer key : tMap.keySet()) {
            System.out.print(tMap.get(key) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N,K;
        N = sc.nextInt();
        String[] Names = new String[N];
        int[] A = new int[N];
        sc.nextLine();
        for(int i=0;i<N;i++){
            Names[i] = sc.next();
        }
        for(int i=0;i<N;i++){
            A[i]= sc.nextInt();
        }
        sc.close();
        finalQueue(N,Names,A);
    }

}