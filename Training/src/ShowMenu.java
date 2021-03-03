public class ShowMenu {

    ShowMenu()
    {

    }

    public void ShowFullMenuList()
    {
        System.out.println("<1-Создать контакт>");
        System.out.println("<2-Просмотреть контакт>");
        System.out.println("<3-Выйти>");
        System.out.println("<4-Удалить контакт>");
        System.out.println("<5-Редактировать контакт>");
        System.out.println("<6-Загрузить контакты из файла>");
    }
    public void ShowMenuCreateContact()
    {
        System.out.println("");
        System.out.println("СОЗДАНИЕ КОНТАКТА");
    }
    public void ShowMyContact()
    {
        System.out.printf("\n\n");
        System.out.println("МОИ КОНТАКТЫ");
        System.out.println("-----------------------------");
    }

    public void ShowContactsAbsant()
    {
        System.out.printf("\nВ КНИГЕ НЕТ КОНТАКТОВ\n\n");
    }
    public void NoSuchContact()
    {
        System.out.printf("\nВ КНИГЕ НЕТ ТАКОГО КОНТАКТОА\n\n");
    }
    public void ShowDeleteMenu()
    {
        System.out.printf("\nУДАЛЕНИЕ КОНТАКТА\n");
    }

    public void ShowEditMenu()
    {
        System.out.println("\nРЕДАКТИРОВНИЕ\n--------------------------\n\n");
    }

    public void ShowWrongCommand()
    {
        System.out.println("\nНЕПРАВИЛЬНАЯ КОМАНДА\n--------------------------\n\n");
    }

    public void ShowQuitMenu()
    {
        System.out.printf("\nВЫХОД\n---------\n\n");
    }


}
