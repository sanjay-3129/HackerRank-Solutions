/*
Question Link: https://www.hackerrank.com/challenges/balanced-brackets/problem

A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].

Two brackets are considered to be a matched pair if the an opening bracket (i.e., (, [, or {) occurs to the left of a closing bracket (i.e., ), ], or }) 
of the exact same type. There are three types of matched pairs of brackets: [], {}, and ().

A matching pair of brackets is not balanced if the set of brackets it encloses are not matched. 
For example, {[(])} is not balanced because the contents in between { and } are not balanced. 
The pair of square brackets encloses a single, unbalanced opening bracket, (, and the pair of parentheses encloses a single, unbalanced closing square bracket, ].

By this logic, we say a sequence of brackets is balanced if the following conditions are met:
 - It contains no unmatched brackets.
 - The subset of brackets enclosed within the confines of a matched pair of brackets is also a matched pair of brackets.
 
Given n strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, return YES. Otherwise, return NO.
*/

SOLUTION:

     static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(c);
            } 
            else {
                char inStack = stack.peek();
                if((inStack == '{' && c == '}') || (inStack == '(' && c == ')') || (inStack == '[' && c == ']')){
                    stack.pop();
                } 
                else{
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()){
            return ("YES");
        } else{
            return ("NO");
        }
    }


// Time Complexity - O(n)
// Space Complexity - O(n), if it is balanced, then space complexity is O(log n).
