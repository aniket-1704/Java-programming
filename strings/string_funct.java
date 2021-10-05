package strings;


public class string_funct 
{
    // @Override
    public String toString()
    {
        return "good morning";
    }
    public static void main(String args[])
    {
        char[] arr={'a','b','c','d','e','f'};
        //creating string object
        String s1=new String(arr,2,3);//wil give cde;
        System.out.println("string 1 is: "+s1);
        String s2=new String(s1);
        System.out.println("string 2 is :"+s2);
        //concat 2 strings
        String str1="hello";
        String str2=" world";
        String str3=str1+str2;
        System.out.println("string after concatenation is : "+str3);
        //override toString function
        String obj=new String();
        System.out.println("String after overriding toString function :"+obj.toString());
        //replace character with another character
        System.out.println("after replacing 1st char in hello with o:"+str1.replace(str1.charAt(0),'o'));
        //convert string to char array
        char[] arr1=str1.toCharArray();
        System.out.print("[");
        for(int i=0;i<arr1.length-1;i++)
        System.out.print(arr1[i]+",");
        System.out.println(arr1[arr1.length-1]+"]");
        //understanding equals and compareTo
        String s4="hello world";
        String s5="hello world";
        //both strings will point to the same string pool
        String s6=new String("hello world");
        System.out.println("s4.compareTo(s5) : "+s4.compareTo(s5));
        System.out.println("s4.compareTo(s6) : "+s4.compareTo(s6));
        System.out.println("s4.equals(s5) : "+s4.equals(s5));
        System.out.println("s4.equals(s6) : "+s4.equals(s6));
        System.out.println("s4==s6 : "+(s4==s6));
        System.out.println("s4==s5 : "+(s4==s5));
        //findi= the position of a word in a string
        String s7="good morning to all";
        int idx=s7.indexOf("good");
        if(idx>=0)
        {
            System.out.println("string is found at position : "+idx+1);
        }
        else
        System.out.println("string is not found");
        //extract a substring from a give string
        String s8=s7.substring(s7.indexOf("good"),"good".length());
        System.out.println("substring exxtracted is:"+s8);
        //replace a word in  a given string
        String s10=new String("hello to the world");
        String s11=s10.replaceAll("hello","greetings");
        System.out.println("string after replacing word : "+s11);
        String[] arr3={"xyz","24"};
        String a="abc.gmail.com";
        String b="000000000";
        a=a+" "+arr3[0];
        b+=" " + arr3[1];
        System.out.println(a);
        System.out.println(b);
    }
}
