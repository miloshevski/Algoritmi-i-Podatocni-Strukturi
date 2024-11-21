package DP;

import java.util.ArrayList;
import java.util.List;

public class List2d {
    public static void main(String[] args) {
        List<List<List<Integer>>>outer=new ArrayList<>();
        List<List<Integer>>matrix=new ArrayList<>();
        List<Integer>innerList= new ArrayList<>();
        for(int k=0;k<5;k++){
            innerList.clear();
            for(int j=0;j<5;j++){
                innerList.clear();
                for(int i=0;i<5;i++){
                    innerList.add(i);
                }
                matrix.add(innerList);
            }
            outer.add(matrix);
        }
        System.out.println(matrix.get(2));
    }
}
