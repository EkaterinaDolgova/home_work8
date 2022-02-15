package skyro.company;

public class Main {

    public static void main(String[] args) {
	//Задание №1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" "+ firstName +" "+ middleName;
        System.out.println("ФИО сотрудника — " + fullName);
    //Задание №2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper );
    //Задание №3
        String fullNameAdm = fullName.replace(" ", "; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullNameAdm);
    //Задание №4
        String fullName1 = "Иванов Семён Семёнович";
        String a = fullName1.replace("ё", "е");
        System.out.println(a);

    }
}
