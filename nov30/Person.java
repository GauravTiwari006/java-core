public class Person {
    
      private String name;
      private String email;
      private String phoneNumber;

   
      public Person(String theName)
      {
          //Constructor Chaining

         this("gaurav12788@gmail.com","9140834952");
         this.name = theName;
      }
      
   
      public Person(String theEmail,String thePhoneNumber)
      {
         this.email = theEmail;
         this.phoneNumber=thePhoneNumber;
      }
      public Person(String theName,String theEmail,String thePhoneNumber)
      {
         this.name = theName;
         this.email = theEmail;
         this.phoneNumber=thePhoneNumber;
      }

      
      public Person()
      {
         System.out.println("DEFAULT con...");
      }
      
   
      public String getName()
       { 
         return this.name;
       }

      public String getEmail() 
       { 
         return this.email;
       }

      public String getPhoneNumber()
        {
           return this.phoneNumber;
         }

   
      public void setName(String theName)
         {
           this.name = theName;
         }

      public void setEmail(String theEmail)
       {
          this.email = theEmail;
         }

      public void setPhoneNumber(String thePhoneNumber) 
        { 
         this.phoneNumber = thePhoneNumber;
        }

      public String toString()
       {
         return this.name + " " + this.email + " " + this.phoneNumber;
       }

      // main method 
      public static void main(String[] args)
      {
         System.out.println("(NAME) & (Email) & (Phone Number)");

         Person p1 = new Person("gaurav");
         System.out.println(p1+"\n");

         Person p2 = new Person("raka");
         p2.setEmail("raka@12456gmail.com");

         p2.setPhoneNumber("7380637625");
         System.out.println(p2+"\n");
         
         Person p3 = new Person("gabru","gabru12@gmail.com","9145867892");
         System.out.println(p3+"\n");

         // Person p4 = new Person();
         // System.out.println(p4);
      }


}