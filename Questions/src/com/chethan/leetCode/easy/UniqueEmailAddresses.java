package com.chethan.leetCode.easy;

// https://leetcode.com/problems/unique-email-addresses/
// Leetcode - Easy - 929

import java.util.HashMap;
import java.util.HashSet;

class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int res = numUniqueEmails2(emails);
        System.out.println(res);
    }
    static int numUniqueEmails(String[] emails) {
        HashSet<String> result = new HashSet<>();
        for (String email : emails) {
            int split_pos = email.indexOf('@');
            String out = "";
            for (int j = 0; j < split_pos; j++) {
                if(Character.isLowerCase(email.charAt(j))){
                    out += email.charAt(j);
                }
                if(email.charAt(j) == '+'){
                    break;
                }
            }
            out = out + email.substring(split_pos);
            result.add(out);
        }
        return result.size();
    }

    static int numUniqueEmails2(String[] emails) {
        HashSet<String> result = new HashSet<>();
        for (String email : emails) {
            int split_pos = email.indexOf('@');
            String domainName = email.substring(split_pos);
            String localName = email.substring(0, split_pos);

            if(localName.contains("+")){
                int plusPos = localName.indexOf('+');
                localName = localName.substring(0, plusPos);
            }
            localName = localName.replace(".","");
            result.add(localName + domainName);
        }
        return result.size();
    }
}