import java.util.Scanner;

public class Note
{
    private int ID;
    private String name;
    private String secondName;
    private String phoneNumber;

    Note()
    {
     this.name="NoName";
     this.secondName="NoSecondName";
     this.phoneNumber="+7(000)000-00-00";
    }

    Note (String name, String SecondName, String phoneNumber)
    {
        this.name=name;
        this.secondName=SecondName;
        this.phoneNumber=phoneNumber;
    }

    public String GetNameNote()
    {
        return this.name;
    }
    public String GetSecondNameNote()
    {
        return this.secondName;
    }

    public String GetPhoneNumberNote()
    {
        return this.phoneNumber;
    }

     public void ShowContact()
     {
         System.out.println( name +" "+ secondName+ " " + phoneNumber);
     }

     public void FillContact()
     {
         Scanner contactIn=new Scanner(System.in);

         System.out.println("Веведите имя контакта:");
         this.name=contactIn.nextLine();
         System.out.printf("OK\n\n");

         System.out.println("Веведите Фамилию контакта:");
         this.secondName=contactIn.nextLine();
         System.out.printf("OK\n");

         System.out.println("Веведите номер телефона:");
         this.phoneNumber=contactIn.nextLine();
         System.out.println("OK\n\n");
     }
    public void EditContact()
    {
        FillContact();
    }



    public void SetIDNote(int ID)
    {
        this.ID=ID;
    }
}
