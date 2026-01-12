class Str_Comparison {
    public static void main(String[] args) {
        String a="Hello";
        String b="World";
        System.out.println(a.equals(b));
        System.out.println(b.compareTo("World"));
        
        StringBuffer quote = new StringBuffer(); 
        quote.append("The question isn't who is going to let me,it's who is going to stop me.");

        System.out.println("Original Quote:\n"+quote.toString());
        quote.reverse();
        System.out.println("Reversed Quote:\n"+quote.toString());
    }
}