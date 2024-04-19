package Project;
/**
 *
 * @author ANOOS
 */
public class SubjectValidation {
    static boolean checkName(String Name) // for both student and subject name
    {
        
        if(Name.isEmpty()) // check if its empty
        {
            System.out.println("Invalid: Name shouldn't is empty\n");
            return false;
        }
        
        if (Name.startsWith(" "))
        {
            System.out.println("Invalid: Name shouldn't start with space\n");
            return false;
        }
        
        for (int i=0;i<Name.length();i++)
        {
            char ch = Name.charAt(i);
            if(!Character.isLetter(ch) && !Character.isSpaceChar(ch))
            {
                   System.out.println("Invalid: Name shouldn't contain digits or special characters\n");
                      return false;
            }
        }
        
        System.out.println("Valid Name!\n");
        return true;
    }
    
    static boolean checkSubjectCode(String code)
    {
        if(code.length()<6 || code.length()>7)
        {
            System.out.println("Invalid : Subject Code must be 6-7 Alphanumeric charecters\n");
            return false;
        }
        
        for(int i=0;i<3;i++)
        {
            char ch=code.charAt(i);
            
            if(!Character.isLetter(ch))
            {
                System.out.println("Invalid : The first 3 must be Alphabetic charecters only\n");
                return false;
            }
        }
        
         for(int i=3;i<6;i++)
        {
            char ch=code.charAt(i);
            
            if(!Character.isDigit(ch))
            {
                System.out.println("Invalid : The second 3 must be numeric charecters only\n");
                return false;
            }
        }
         if(code.length()==7)
         {
            if(code.charAt(6) != 's')
            {
                System.out.println("the 7th character must be s\n");
                return false;
            }
        }
         
         System.out.println("Valid Subject Code\n");
         return true;
    }
    
    static boolean checkFullMark(int fullMark)
    {
        if(fullMark!=100)
        {
            System.out.println("Invalid: Full Mark must be 100 only");
            return false;
        }
        
        System.out.println("Valid Full Mark");
        return true;
    }
}
