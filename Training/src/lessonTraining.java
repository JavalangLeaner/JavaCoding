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
        while (button!=3)
        {
            myBook.Menu();
            button =option.nextInt();

            switch(button)
            {
                case 1: myBook.CreateContact();
                        myBook.WriteToFile(path);
                break;

                case 2: if (myBook.GetStatusFile()==bookEnum.bookIsNotOpened)
                        {
                            myBook.OpenMyBook(path);
                        }
                        myBook.ShowContacts();
                break;

                case 3:  myBook.ShowQuit();
                break;

                case 4:  myBook.DeleteContact();
                break;
                case 5:  myBook.EditContact();
                break;

                case 6:  myBook.LoadContactFromFile(path);
                break;

                default: myBook.ShowWrongCom();
                break;
            }
        }
    }
}