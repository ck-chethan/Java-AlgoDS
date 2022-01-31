class Cards {
    public static void main(String[] args) {
        String A = "23A84Q";
        String B = "K2Q25J";
        int res = solution(A, B);
        System.out.println(res);
    }
    static int solution(String A, String B){
        int count = 0;
        //char[] deck = {2, 3, 4, 5, 6, 7, 8, 9, 'T', 'J', 'Q', 'K', 'A'};
        String decks = "23456789TJQKA";
        for (int i = 0; i < A.length(); i++) {
            char ac = A.charAt(i);
            char bc = B.charAt(i);
            if(decks.indexOf(ac) > decks.indexOf(bc)){
                count++;
            }
        }
        return count;
    }
}
