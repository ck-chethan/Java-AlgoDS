class FrogJumps {
    public static void main(String[] args) {
        int[] blocks = {1, 5, 5, 2, 6};
        int res = solution(blocks);
        System.out.println(res);
    }

    public static int solution(int[] blocks){
        int maxAns = 0;
//        if(blocks.length == 2){
//            return 2;
//        }
        for (int i = 0; i < blocks.length; i++) {
            int ans = tracePath(i, blocks);
            if(ans > maxAns){
                maxAns = ans;
            }
        }
        return maxAns;
    }
    static int tracePath(int i, int[] blocks){
        int pcount = 0;
        int ncount = 0;
        for (int j = i; j < blocks.length; j++) {
            if(i!=j && blocks[i] <= blocks[j]){
                pcount++;
            }
        }
        for (int j = i; j >= 0; j--) {
            if(i!=j && blocks[i] <= blocks[j]){
                ncount++;
            }
        }
        return Integer.max(pcount, ncount);
    }
}
