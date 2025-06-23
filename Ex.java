////        Develop a program that takes the weight (in kilograms) and height (in meters)
////        as input and calculates the BMI, then prints it.
       System.out.println("Enter your weight: ");
        double w=i.nextDouble();
       System.out.println("Enter your hight in meter:");
       float h=i.nextFloat();
       System.out.println("Your BMI is : "+( w/(h*h)));
//---------------------------------------------------------------------
  //
//        Write a program that takes the obtained marks and total marks as input and
//        calculates the percentage, then prints it.
        System.out.println("Enter obtained marks: ");
        double obtained_marks=i.nextDouble();
        System.out.println("Enter total marks: ");
        double total_marks=i.nextDouble();
        System.out.println(" Percentage = "+100*(obtained_marks/total_marks));
//--------------------------------------------------------------------
//        Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
        System.out.println("Enter amount in one currency :");
        double amount=i.nextDouble();
        System.out.println("Enter in  exchange rate :");
        double  exchange_rate=i.nextDouble();
        double converted = amount * exchange_rate;

        System.out.println("Converted amount: " + converted);
//--------------------------------------------------------------------
//        Create a program that takes a string as input, calculates its length, and then
//        reverses the string using the StringBuilder class, finally printing both the length and
//        reversed string.
        System.out.println("Enter pharse :");
        String phrase = i.nextLine();
        int len = phrase.length();
        String reversed = "";
        for (int i1 = len - 1; i1 >= 0; i1--) {
            reversed += phrase.charAt(i1);
        }
        System.out.println("length : "+ len +"Reversed String : " + reversed);
//--------------------------------------------------------------------
//        Develop a program that takes a sentence as input and extracts a substring from
//        it, then prints the extracted substring.  
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
//                = 10, End Index = 20

        String sentence = "The quick brown fox jumps over the lazy dog";
        int start = 10;
        int end = 20;
        String result = sentence.substring(start, end);
        System.out.println("Extracted substring: " + result);

//--------------------------------------------------------------------
//        Write a program that takes a sentence and a keyword as input, then check if
//        the keyword is present in the sentence and prints the result.
//• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
//                "jumps"
        String sentence = "The quick brown fox jumps over the lazy dog";
        String keyword = "jumps";
        if (sentence.contains(keyword)) {
            System.out.println("Keyword " + keyword + "is present in the sentence");
        } else {
            System.out.println("Keyword " + keyword + "is NOT present in the sentence");
        }
// -------------------------------------------------------------------------
 String sentence = "The quick brown fox jumps over the lazy dog";
        String toReplace = "fox";
        String replacement = "cat";
        String modified = sentence.replace(toReplace, replacement);
        System.out.println("Modified sentence: " + modified);
//--------------------------------------------------------------------------------
 String s1 = "Hello";
        String s2 = "hello";
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("Strings are equal (ignoring case).");
        } else {
            System.out.println("Strings are NOT equal.");
        }
