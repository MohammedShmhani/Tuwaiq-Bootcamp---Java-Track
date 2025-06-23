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
