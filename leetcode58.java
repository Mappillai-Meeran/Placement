class leetcode58 {
    public int lengthOfLastWord(String s) {
        String[] word = s.split(" ");
        String lastword = word[word.length - 1];
        return lastword.length();
    }
    public static void main(String args[]) {
        leetcode58 solver = new leetcode58(); 
        
        String input = "Hello World";
        int result = solver.lengthOfLastWord(input); 
        System.out.println("Length of last word: " + result);
    }
}