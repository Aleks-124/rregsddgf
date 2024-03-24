package org.example;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ScintificBookFabric scintificBookFabric = new ScintificBookFabric();
        ArtisticBookFabric artisticBookFabric = new ArtisticBookFabric();
        StudentFabric studentFabric = new StudentFabric();
        TeacherFabric teacherFabric = new TeacherFabric();
        ArrayList<Books> books = new ArrayList<>();
        ArrayList<Person> students = new ArrayList<>();
        ArrayList<Person> teachers = new ArrayList<>();
        ArrayList<Person> persons = new ArrayList<>();
        for(int i = 0; i < 200; i++) {
            books.add(scintificBookFabric.createForeignBook());
            books.add(scintificBookFabric.createRussianBook());
            books.add(artisticBookFabric.createForeignBook());
            books.add(artisticBookFabric.createRussianBook());
        }
        for(int i = 0; i < 10; i++) {
            students.add(studentFabric.createPerson());
            teachers.add(teacherFabric.createPerson());
        }
        persons.addAll(teachers);
        persons.addAll(students);
        for (Person person : persons){
            Random rand = new Random();
            for (int i=0; i< rand.nextInt(8)+2; i++){
                int a = rand.nextInt(books.size()-1);
                person.addBook(books.get(a));
                books.remove(a);
            }
        }


        // Создаем корневой узел
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Корень");

        // Создаем узлы для папок "Студенты" и "Преподаватели"
        DefaultMutableTreeNode studentsNode = new DefaultMutableTreeNode("Студенты");
        DefaultMutableTreeNode teachersNode = new DefaultMutableTreeNode("Преподаватели");

        // Добавляем узлы папок в корневой узел
        root.add(studentsNode);
        root.add(teachersNode);

        // Создаем узлы для имен студентов и добавляем их в узел папки "Студенты"
        for (int i = 0; i < students.size(); i++) {
            DefaultMutableTreeNode studentNode = new DefaultMutableTreeNode(students.get(i).getName());

            // Создаем узлы для книг и добавляем их в узел имени студента
            for (int j = 0; j <students.get(i).getBooks().size() ; j++) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(students.get(i).getBooks().get(j).getName());
                studentNode.add(bookNode);
            }

            studentsNode.add(studentNode);
        }

        // Создаем узлы для имен преподавателей и добавляем их в узел папки "Преподаватели"
        for (int i = 0; i < teachers.size(); i++) {
            DefaultMutableTreeNode teacherNode = new DefaultMutableTreeNode(teachers.get(i).getName());

            // Создаем узлы для книг и добавляем их в узел имени преподавателя
            for (int j = 0; j < teachers.get(i).getBooks().size(); j++) {
                DefaultMutableTreeNode bookNode = new DefaultMutableTreeNode(teachers.get(i).getBooks().get(j).getName());
                teacherNode.add(bookNode);
            }

            teachersNode.add(teacherNode);
        }

        // Создаем модель дерева и устанавливаем корневой узел
        DefaultTreeModel treeModel = new DefaultTreeModel(root);

        // Создаем компонент JTree с моделью дерева
        JTree tree = new JTree(treeModel);

        // Отображаем окно с деревом
        JFrame frame = new JFrame("Генератор дерева на JTree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(tree));
        frame.pack();
        frame.setVisible(true);
    }
}