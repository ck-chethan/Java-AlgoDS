package com.chethan.leetCode.easy.ProgrammingSkills;
// 1491. Average Salary Excluding the Minimum and Maximum Salary - Easy
public class AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] salary = {4000,3000,1000,2000};
        double res = average(salary);
        System.out.println(res);
    }
    public static double average(int[] salary) {
        int N = salary.length;
        int min = salary[0];
        int max = salary[0];
        int summ = salary[0];
        for(int i=1; i<N; i++){
            min = Math.min(min, salary[i]);
            max = Math.max(max, salary[i]);
            summ += salary[i];
        }

        return (double)(summ-min-max)/(salary.length-2);

    }
}
