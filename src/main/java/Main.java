public class Main {

    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Galina";
        post.passport = "3333 № 552200";
        post.patronymic = "Сергеевна";
        post.phone = "+7-999-555-20-20";
        post.surname = "Шуравина";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 15;
        post.birthday.month = 4;
        post.birthday.year = 1993;


    }
}
