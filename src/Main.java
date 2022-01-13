public class Main {

    public static void main(String[] args) {

        Teacher t1=new Teacher("Şaban Hoca","TRH","4568");
        Teacher t2=new Teacher("Selma Hoca","FZK","1235");
        Teacher t3=new Teacher("Gamze Hoca","KMY","5368");


        Course tarih=new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);

        Course fizik=new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);

        Course kimya=new Course("Kimya","103","KMY");
        kimya.addTeacher(t3);

        Student s1 = new Student("Yusuf Demirci", "123","4", tarih, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.isPass();



        Student s2 = new Student("Muhammed ", "124", "4", tarih, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();


        Student s3 = new Student("Melek", "125", "4", tarih, fizik, kimya);
        s3.addBulkExamNote(50,30,70);
        s3.isPass();



    }
}
