package com;

public class Student {
    private int id;
    private String name;
    private String surname;
    private String patronymic;
    private int dateBirth;
    private String address;
    private int telephone;
    private String faculty;
    private String course;
    private String group;

    public Student(String name,String surname,String patronymic,int dateBirth){
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.dateBirth = dateBirth;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void listOfStudentsFaculty(Student[] persons,String faculty){
        for (int i=0;i<persons.length;i++){
            if(faculty.equals(persons[i].faculty)){
                System.out.println(persons[i].name + " " + persons[i].surname + " " + persons[i].patronymic);
            }
        }
    }

    public static void listOfStudentsAllFaculties(Student[]person,String faculty){
        System.out.println(faculty);
        for (int i=0;i<person.length;i++){
            if(faculty.equals(person[i].faculty)){
                System.out.println(person[i].name + " " + person[i].surname + " " + person[i].patronymic);
            }
        }
    }

    public static void studentsBornAfterYear(Student[] people,int year){
        System.out.println("Born after " + year);
        for (int i=0;i<people.length;i++){
            if(people[i].dateBirth > year){
                System.out.println(people[i].name + " " + people[i].surname);
            }
        }
    }

    public static void listOfStudyGroup(Student[] students,String group){
        System.out.println("Group " + group);
        for (int i=0;i<students.length;i++){
            if(students[i].group.equals(group)){
                System.out.println(students[i].name + " " + students[i].surname);
            }
        }
    }

}
