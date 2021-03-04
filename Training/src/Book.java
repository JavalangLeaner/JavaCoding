import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Book
{
    private List<Note> contacts=new LinkedList();
    private ShowMenu bookmenu = new ShowMenu();
    private Scanner option_book =new Scanner(System.in);
    private bookEnum myBookEnum=bookEnum.bookIsNotOpened;

   public bookEnum GetStatusFile ()
   {
      return myBookEnum;
   }


    public void Menu()
    {
        this.bookmenu.ShowFullMenuList();
    }

    public void CreateContact()
    {
        Note tmpNote= new Note();
        contacts.add(tmpNote);
        tmpNote.FillContact();
        //Записать в файл контакт
    }

    public void ShowContacts()
    {
         bookmenu.ShowMyContact();

        if (contacts.isEmpty())
        {
            bookmenu.ShowContactsAbsant();
        }
        else
        {
            for(Note n: contacts)
            {
                int i = contacts.indexOf(n);
                System.out.printf((i+1)+". ");
                n.ShowContact();
            }
            System.out.printf("\n\n");
        }
    }
    public void ShowQuit()
    {
        bookmenu.ShowQuitMenu();
    }

    public void DeleteContact()
    {
      bookmenu.ShowDeleteMenu();
      ShowContacts();

      if (contacts.isEmpty())
      {

      }
      else
      {
          System.out.printf("Введите номер контата для удаления:\n");
          int book_button=option_book.nextInt();

          if(book_button>contacts.size())
          {
              bookmenu.NoSuchContact();
          }
          else
          {
              contacts.remove(book_button-1);
              System.out.printf("\nOK!\n\n");
          }

      }
    }

    public void EditContact()
    {
      bookmenu.ShowEditMenu();
      ShowContacts();
      System.out.printf("Выберите контакт:\n");
      int book_button=option_book.nextInt();

      Note temp=contacts.get(book_button-1);
      temp.FillContact();
      contacts.remove(book_button-1);
      contacts.add(book_button-1,temp);
      System.out.printf("\n\n");
    }

    public void ShowWrongCom()
    {
    bookmenu.ShowWrongCommand();

    }

    public void LoadContactFromFile(String fileName) throws FileNotFoundException {
        System.out.printf("\nКонтакты из "+fileName);
        System.out.printf("\n----------------------\n");
        File myFile =new File(fileName);

        Scanner scanFile = new Scanner(myFile);
        String line;

        while(scanFile.hasNext())
        {
            line= scanFile.nextLine();
            System.out.println(line);

        }
        System.out.printf("\n\n");
    }

    public void OpenMyBook(String path) throws FileNotFoundException {
        File bookFile=new File(path);
        Scanner bookFileScan = new Scanner(bookFile);
        String tmpLine;
        String [] bufferLine = new String [5];

        while(bookFileScan.hasNext())
        {
            tmpLine=bookFileScan.nextLine();
            bufferLine=tmpLine.split(" ");
            contacts.add(new Note(bufferLine[1],bufferLine[2],bufferLine[3]));
        }
        bookFileScan.close();
        myBookEnum=bookEnum.bookIsOpened;
    }

     public void WriteToFile(String path) throws IOException {
         File bookFile = new File(path);
         PrintWriter writeToFile = new PrintWriter(new FileWriter(bookFile));

         for (Note n : contacts) {
              int i = contacts.indexOf(n);

              writeToFile.println((i+1) + ". " + n.GetNameNote() + " " + n.GetSecondNameNote() + " " + n.GetPhoneNumberNote() + " ");
         }
         writeToFile.close();
     }
}
