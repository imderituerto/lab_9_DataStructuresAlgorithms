    // create a string
    // write a method called "checkParentheses"
    // this method needs to check every character in the string for an opening "(" bracket

    // this method takes in a string and returns a boolean
    // this method returns true if the string has matching "()" brackets
    // else returns false.

    // situations to return false:
    // - more opening or closing brackets of a particular type // (), <>, [], {}
    // - closing bracket at start
    // - opening bracket followed by two closing brackets

    /*
    - stack
    - classic for loop for a String
    - logical operators
     */

"Stacks" pile items on top of each other. In a String, this is like stacking 'chars' on top of each other. If we want to access them, we need to work backwards (last in, first out) using the `.pop` and `.peek` functions.

A "for loop" let's us run through an object and check some properties, as defined in a method.

Combining a "stack" and a "for loop", we can use the "for loop" to run through the stack backwards (int i = stack.peek; i < stack.size(); i--), checking for paretheses. Since we're running backwards, we would need to check for a closing ")" parentheses first. 

If we combine the two, we can run through a String character-by-character, searching for ")", from the last indexed item. Once we come across one, we can check for an opening "(" bracket to check for balance bracket. If we find one, we remove it (`.pop`) from the stack.

If we are returned an empty stack, then our brackets are balanced. Otherwise, return a false statement.

//    2. research using a "for loop" for a String
//    3. map out how logical operators could be used

    for(int i = 0; i < stack.size(); i++){
        if(x == '('){
            stack.pop}
            else{continue}}
        if(x == ')'){
            stack.pop;
        else{continue}}}

Print stack (after popping)