package cn.yfq.algorithm;

import java.util.ArrayList;
import java.util.List;

public class MultiNumSum {

    public static List<List<Integer>> result = new ArrayList<>();
    public  List<Integer> baselist ;

    public List<List<Integer>> solution(List<Integer> list, int k, int sum){
        baselist=list;
        List<Integer> tempList = new ArrayList<>();
        find(tempList,k,sum,0);

        return result;
    }

    private void find(List<Integer> tempList, int k, int tempsum , int value) {

        for( ; value<baselist.size(); value++){

            if(tempsum-baselist.get(value) ==0 && k-1==0){
                List<Integer> tempresult = new ArrayList<>();
                for (Integer i:tempList) {
                    tempresult.add(i);
                }
                tempresult.add(baselist.get(value));
                result.add(tempresult);
                return;
            }
            if(tempsum-baselist.get(value)<0 || k-1<0){
                return;
            }

            //入栈
            tempList.add(baselist.get(value));
            //sum和k 都不为0，寻找下一个
            find(tempList,k-1,tempsum-baselist.get(value),value+1);
            //出栈
            tempList.remove(baselist.get(value));
        }

    }

    public static void main(String[] args) {
        MultiNumSum multiNumSum = new MultiNumSum();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //list.add(5);
        list.add(6);
        list.add(7);
        //list升序
        multiNumSum.solution(list,3,9);
        System.out.println(result);
    }
}
