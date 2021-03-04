import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class lessonTraining
{
    public static void main(String[] args) throws IOException {

        final String path="myBook.txt";

        Book myBook=new Book();
        Scanner option =new Scanner(System.in);
        int button=0;
        /*Open file myBook.txt and copy all strings to contacts*/
        myBook.OpenMyBook(path);

        while (button!=3)
        {
            myBook.Menu();
            button =option.nextInt();

            switch(button)
            {
                case 1: myBook.CreateContact();
                //After adding contacts to var contacts, all fields of  var contacts
                //are written to file myBook.txt and rewrite it.
                        myBook.WriteToFile(path);
                break;

                case 2:  myBook.ShowContacts();
                break;

                case 3:  myBook.ShowQuit();
                break;

                case 4:  myBook.DeleteContact();
                         myBook.WriteToFile(path);
                break;
                case 5:  myBook.EditContact();
                         myBook.WriteToFile(path);
                break;

                case 6:  myBook.LoadContactFromFile(path);
                break;

                default: myBook.ShowWrongCom();
                break;
            }
        }
    }
}